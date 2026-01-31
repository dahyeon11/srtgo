package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.kakao.sdk.auth.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class E7 {
    private static int a(int i8) {
        if (i8 == 1) {
            return 32;
        }
        if (i8 == 2) {
            return 64;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i8);
    }

    private static int b(int i8) {
        if (i8 == 513) {
            return 1;
        }
        if (i8 == 514) {
            return 2;
        }
        if (i8 == 769) {
            return 1;
        }
        switch (i8) {
            case R.k.OPTIMIZATION_STANDARD /* 257 */:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i8))));
        }
    }

    private static String c(int i8) {
        if (i8 == 1) {
            return Constants.CODE_CHALLENGE_ALGORITHM;
        }
        if (i8 == 2) {
            return Constants.CODE_VERIFIER_ALGORITHM;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i8);
    }

    private static ByteBuffer d(ByteBuffer byteBuffer, int i8) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i9 = i8 + iPosition;
        if (i9 < iPosition || i9 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i9);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i9);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static ByteBuffer e(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i8 = byteBuffer.getInt();
        if (i8 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i8 <= byteBuffer.remaining()) {
            return d(byteBuffer, i8);
        }
        throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i8 + ", remaining: " + byteBuffer.remaining());
    }

    private static void f(int i8, byte[] bArr, int i9) {
        bArr[1] = (byte) (i8 & 255);
        bArr[2] = (byte) ((i8 >>> 8) & 255);
        bArr[3] = (byte) ((i8 >>> 16) & 255);
        bArr[4] = (byte) (i8 >> 24);
    }

    private static void g(Map map, FileChannel fileChannel, long j8, long j9, long j10, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        C4948y7 c4948y7 = new C4948y7(fileChannel, 0L, j8);
        C4948y7 c4948y72 = new C4948y7(fileChannel, j9, j10 - j9);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        F7.zzd(byteBufferDuplicate, j8);
        C4720w7 c4720w7 = new C4720w7(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            iArr[i8] = ((Integer) it.next()).intValue();
            i8++;
        }
        try {
            byte[][] bArrJ = j(iArr, new InterfaceC4834x7[]{c4948y7, c4948y72, c4720w7});
            for (int i9 = 0; i9 < size; i9++) {
                int i10 = iArr[i9];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i10)), bArrJ[i9])) {
                    throw new SecurityException(c(i10).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e8) {
            throw new SecurityException("Failed to compute digest(s) of contents", e8);
        }
    }

    private static byte[] h(ByteBuffer byteBuffer) throws IOException {
        int i8 = byteBuffer.getInt();
        if (i8 < 0) {
            throw new IOException("Negative length");
        }
        if (i8 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i8];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new IOException("Underflow while reading length-prefixed value. Length: " + i8 + ", available: " + byteBuffer.remaining());
    }

    private static X509Certificate[] i(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferE = e(byteBuffer);
        ByteBuffer byteBufferE2 = e(byteBuffer);
        byte[] bArrH = h(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrH2 = null;
        byte[] bArrH3 = null;
        int i8 = -1;
        int i9 = 0;
        while (byteBufferE2.hasRemaining()) {
            i9++;
            try {
                ByteBuffer byteBufferE3 = e(byteBufferE2);
                if (byteBufferE3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i10 = byteBufferE3.getInt();
                arrayList.add(Integer.valueOf(i10));
                if (i10 != 513 && i10 != 514 && i10 != 769) {
                    switch (i10) {
                        case R.k.OPTIMIZATION_STANDARD /* 257 */:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i8 != -1) {
                    int iB = b(i10);
                    int iB2 = b(i8);
                    if (iB != 1 && iB2 == 1) {
                    }
                }
                bArrH3 = h(byteBufferE3);
                i8 = i10;
            } catch (IOException e8) {
                e = e8;
                throw new SecurityException("Failed to parse signature record #" + i9, e);
            } catch (BufferUnderflowException e9) {
                e = e9;
                throw new SecurityException("Failed to parse signature record #" + i9, e);
            }
        }
        if (i8 == -1) {
            if (i9 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i8 == 513 || i8 == 514) {
            str = "EC";
        } else if (i8 != 769) {
            switch (i8) {
                case R.k.OPTIMIZATION_STANDARD /* 257 */:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i8))));
            }
        } else {
            str = "DSA";
        }
        if (i8 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i8 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i8 != 769) {
            switch (i8) {
                case R.k.OPTIMIZATION_STANDARD /* 257 */:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec(Constants.CODE_CHALLENGE_ALGORITHM, "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec(Constants.CODE_VERIFIER_ALGORITHM, "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i8))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrH));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferE);
            if (!signature.verify(bArrH3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferE.clear();
            ByteBuffer byteBufferE4 = e(byteBufferE);
            ArrayList arrayList2 = new ArrayList();
            int i11 = 0;
            while (byteBufferE4.hasRemaining()) {
                i11++;
                try {
                    ByteBuffer byteBufferE5 = e(byteBufferE4);
                    if (byteBufferE5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i12 = byteBufferE5.getInt();
                    arrayList2.add(Integer.valueOf(i12));
                    if (i12 == i8) {
                        bArrH2 = h(byteBufferE5);
                    }
                } catch (IOException e10) {
                    e = e10;
                    throw new IOException("Failed to parse digest record #" + i11, e);
                } catch (BufferUnderflowException e11) {
                    e = e11;
                    throw new IOException("Failed to parse digest record #" + i11, e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iB3 = b(i8);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iB3), bArrH2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrH2)) {
                throw new SecurityException(c(iB3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferE6 = e(byteBufferE);
            ArrayList arrayList3 = new ArrayList();
            int i13 = 0;
            while (byteBufferE6.hasRemaining()) {
                i13++;
                byte[] bArrH4 = h(byteBufferE6);
                try {
                    arrayList3.add(new C7((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrH4)), bArrH4));
                } catch (CertificateException e12) {
                    throw new SecurityException("Failed to decode certificate #" + i13, e12);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrH, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e13) {
            e = e13;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (InvalidKeyException e14) {
            e = e14;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (NoSuchAlgorithmException e15) {
            e = e15;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (SignatureException e16) {
            e = e16;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (InvalidKeySpecException e17) {
            e = e17;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        }
    }

    private static byte[][] j(int[] iArr, InterfaceC4834x7[] interfaceC4834x7Arr) throws DigestException {
        long j8;
        int i8;
        int length;
        int i9 = 0;
        long j9 = 0;
        int i10 = 0;
        long jZza = 0;
        while (true) {
            j8 = 1048576;
            if (i10 >= 3) {
                break;
            }
            jZza += (interfaceC4834x7Arr[i10].zza() + 1048575) / 1048576;
            i10++;
        }
        if (jZza >= 2097151) {
            throw new DigestException("Too many chunks: " + jZza);
        }
        byte[][] bArr = new byte[iArr.length][];
        int i11 = 0;
        while (true) {
            length = iArr.length;
            if (i11 >= length) {
                break;
            }
            int i12 = (int) jZza;
            byte[] bArr2 = new byte[(a(iArr[i11]) * i12) + 5];
            bArr2[0] = 90;
            f(i12, bArr2, 1);
            bArr[i11] = bArr2;
            i11++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            String strC = c(iArr[i13]);
            try {
                messageDigestArr[i13] = MessageDigest.getInstance(strC);
            } catch (NoSuchAlgorithmException e8) {
                throw new RuntimeException(strC.concat(" digest not supported"), e8);
            }
        }
        int i14 = 0;
        int i15 = 0;
        for (i8 = 3; i14 < i8; i8 = 3) {
            InterfaceC4834x7 interfaceC4834x7 = interfaceC4834x7Arr[i14];
            long j10 = j9;
            long jZza2 = interfaceC4834x7.zza();
            while (jZza2 > j9) {
                int iMin = (int) Math.min(jZza2, j8);
                f(iMin, bArr3, 1);
                for (int i16 = 0; i16 < length; i16++) {
                    messageDigestArr[i16].update(bArr3);
                }
                long j11 = j10;
                try {
                    interfaceC4834x7.zzb(messageDigestArr, j11, iMin);
                    byte[] bArr4 = bArr3;
                    int i17 = 0;
                    while (i17 < iArr.length) {
                        int i18 = iArr[i17];
                        InterfaceC4834x7 interfaceC4834x72 = interfaceC4834x7;
                        byte[] bArr5 = bArr[i17];
                        int iA = a(i18);
                        int i19 = length;
                        MessageDigest messageDigest = messageDigestArr[i17];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int iDigest = messageDigest.digest(bArr5, (i15 * iA) + 5, iA);
                        if (iDigest != iA) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i17++;
                        interfaceC4834x7 = interfaceC4834x72;
                        length = i19;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j12 = iMin;
                    long j13 = j11 + j12;
                    jZza2 -= j12;
                    i15++;
                    j9 = 0;
                    j8 = 1048576;
                    bArr3 = bArr4;
                    j10 = j13;
                    messageDigestArr = messageDigestArr;
                } catch (IOException e9) {
                    throw new DigestException("Failed to digest chunk #" + i15 + " of section #" + i9, e9);
                }
            }
            i9++;
            i14++;
            j9 = 0;
            j8 = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i20 = 0; i20 < iArr.length; i20++) {
            int i21 = iArr[i20];
            byte[] bArr7 = bArr[i20];
            String strC2 = c(i21);
            try {
                bArr6[i20] = MessageDigest.getInstance(strC2).digest(bArr7);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(strC2.concat(" digest not supported"), e10);
            }
        }
        return bArr6;
    }

    private static X509Certificate[][] k(FileChannel fileChannel, A7 a72) throws CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferE = e(a72.f12144a);
                int i8 = 0;
                while (byteBufferE.hasRemaining()) {
                    i8++;
                    try {
                        arrayList.add(i(e(byteBufferE), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e8) {
                        throw new SecurityException("Failed to parse/verify signer #" + i8 + " block", e8);
                    }
                }
                if (i8 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                g(map, fileChannel, a72.f12145b, a72.f12146c, a72.f12147d, a72.f12148e);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e9) {
                throw new SecurityException("Failed to read list of signers", e9);
            }
        } catch (CertificateException e10) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e10);
        }
    }

    public static X509Certificate[][] zza(String str) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair pairA = F7.a(randomAccessFile);
            if (pairA == null) {
                throw new B7("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairA.first;
            long jLongValue = ((Long) pairA.second).longValue();
            long j8 = (-20) + jLongValue;
            if (j8 >= 0) {
                randomAccessFile.seek(j8);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new B7("ZIP64 APK not supported");
                }
            }
            long jZza = F7.zza(byteBuffer);
            if (jZza >= jLongValue) {
                throw new B7("ZIP Central Directory offset out of range: " + jZza + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            if (F7.zzb(byteBuffer) + jZza != jLongValue) {
                throw new B7("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (jZza < 32) {
                throw new B7("APK too small for APK Signing Block. ZIP Central Directory offset: " + jZza);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(jZza - byteBufferAllocate.capacity());
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new B7("No APK Signing Block before ZIP Central Directory");
            }
            int i8 = 0;
            long j9 = byteBufferAllocate.getLong(0);
            if (j9 < byteBufferAllocate.capacity() || j9 > 2147483639) {
                throw new B7("APK Signing Block size out of range: " + j9);
            }
            int i9 = (int) (8 + j9);
            long j10 = jZza - i9;
            if (j10 < 0) {
                throw new B7("APK Signing Block offset out of range: " + j10);
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i9);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j10);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j11 = byteBufferAllocate2.getLong(0);
            if (j11 != j9) {
                throw new B7("APK Signing Block sizes in header and footer do not match: " + j11 + " vs " + j9);
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j10));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                while (byteBufferSlice.hasRemaining()) {
                    i8++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new B7("Insufficient data to read size of APK Signing Block entry #" + i8);
                    }
                    long j12 = byteBufferSlice.getLong();
                    if (j12 < 4 || j12 > 2147483647L) {
                        throw new B7("APK Signing Block entry #" + i8 + " size out of range: " + j12);
                    }
                    int i10 = (int) j12;
                    int iPosition2 = byteBufferSlice.position() + i10;
                    if (i10 > byteBufferSlice.remaining()) {
                        throw new B7("APK Signing Block entry #" + i8 + " size out of range: " + i10 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrK = k(randomAccessFile.getChannel(), new A7(d(byteBufferSlice, i10 - 4), jLongValue2, jZza, jLongValue, byteBuffer, null));
                        randomAccessFile.close();
                        return x509CertificateArrK;
                    }
                    byteBufferSlice.position(iPosition2);
                }
                throw new B7("No APK Signature Scheme v2 block in APK Signing Block");
            } finally {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }
}
