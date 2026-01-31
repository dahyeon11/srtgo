package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* loaded from: classes2.dex */
abstract class Lr0 {

    /* renamed from: a, reason: collision with root package name */
    private final Jr0 f14355a;

    /* renamed from: b, reason: collision with root package name */
    private final Jr0 f14356b;

    public Lr0(byte[] bArr) throws GeneralSecurityException {
        if (!Zr0.zza(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f14355a = a(bArr, 1);
        this.f14356b = a(bArr, 0);
    }

    abstract Jr0 a(byte[] bArr, int i8);

    public final byte[] zzb(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            this.f14356b.a(bArr, 0).get(bArr4);
            int length = bArr2.length;
            int i8 = length & 15;
            int i9 = i8 == 0 ? length : (length + 16) - i8;
            int iRemaining = byteBuffer.remaining();
            int i10 = iRemaining % 16;
            int i11 = (i10 == 0 ? iRemaining : (iRemaining + 16) - i10) + i9;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i11 + 16).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(bArr2);
            byteBufferOrder.position(i9);
            byteBufferOrder.put(byteBuffer);
            byteBufferOrder.position(i11);
            byteBufferOrder.putLong(length);
            byteBufferOrder.putLong(iRemaining);
            if (!MessageDigest.isEqual(Pr0.zza(bArr4, byteBufferOrder.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            return this.f14355a.zzd(bArr, byteBuffer);
        } catch (GeneralSecurityException e8) {
            throw new AEADBadTagException(e8.toString());
        }
    }
}
