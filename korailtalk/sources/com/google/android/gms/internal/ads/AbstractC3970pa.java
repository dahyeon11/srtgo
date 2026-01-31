package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.pa */
/* loaded from: classes2.dex */
abstract class AbstractC3970pa {

    /* renamed from: a */
    static boolean f21778a = false;

    /* renamed from: b */
    private static MessageDigest f21779b;

    /* renamed from: c */
    private static final Object f21780c = new Object();

    /* renamed from: d */
    private static final Object f21781d = new Object();

    /* renamed from: e */
    static final CountDownLatch f21782e = new CountDownLatch(1);
    public static final /* synthetic */ int zzc = 0;

    static O9 a(F9 f9) {
        C3357k9 c3357k9Zza = O9.zza();
        c3357k9Zza.zzJ(f9.zza());
        return (O9) c3357k9Zza.zzbr();
    }

    static String b(byte[] bArr, String str) {
        byte[] bArrF;
        Vector vectorC = c(bArr, 255);
        if (vectorC == null || vectorC.isEmpty()) {
            bArrF = f(a(F9.PSN_ENCODE_SIZE_FAIL).zzaV(), str, true);
        } else {
            C3059ha c3059haZza = C3174ia.zza();
            int size = vectorC.size();
            for (int i8 = 0; i8 < size; i8++) {
                c3059haZza.zza(AbstractC3677my0.zzv(f((byte[]) vectorC.get(i8), str, false), 0, 256));
            }
            byte[] bArrZzf = zzf(bArr);
            AbstractC3677my0 abstractC3677my0 = AbstractC3677my0.zzb;
            c3059haZza.zzc(AbstractC3677my0.zzv(bArrZzf, 0, bArrZzf.length));
            bArrF = ((C3174ia) c3059haZza.zzbr()).zzaV();
        }
        return AbstractC3514la.zza(bArrF, true);
    }

    static Vector c(byte[] bArr, int i8) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i9 = length + 254;
        Vector vector = new Vector();
        for (int i10 = 0; i10 < i9 / 255; i10++) {
            int i11 = i10 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i11 > 255) {
                    length2 = i11 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i11, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    static void e() {
        synchronized (f21781d) {
            try {
                if (!f21778a) {
                    f21778a = true;
                    new Thread(new RunnableC3856oa(null)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static byte[] f(byte[] bArr, String str, boolean z8) {
        byte[] bArrArray;
        int length = bArr.length;
        int i8 = true != z8 ? 255 : 239;
        if (length > i8) {
            bArr = a(F9.PSN_ENCODE_SIZE_FAIL).zzaV();
        }
        int i9 = i8 + 1;
        int length2 = bArr.length;
        byte b9 = (byte) length2;
        if (length2 < i8) {
            byte[] bArr2 = new byte[i8 - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i9).put(b9).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i9).put(b9).put(bArr).array();
        }
        if (z8) {
            bArrArray = ByteBuffer.allocate(256).put(zzf(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        InterfaceC4084qa[] interfaceC4084qaArr = new C1783Qa().f15852G2;
        int length3 = interfaceC4084qaArr.length;
        for (int i10 = 0; i10 < 12; i10++) {
            interfaceC4084qaArr[i10].zza(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new C3286ja(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }

    public static byte[] zzf(byte[] bArr) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (f21780c) {
            try {
                e();
                MessageDigest messageDigest2 = null;
                try {
                    if (f21782e.await(2L, TimeUnit.SECONDS) && (messageDigest = f21779b) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = f21779b.digest();
            } finally {
            }
        }
        return bArrDigest;
    }
}
