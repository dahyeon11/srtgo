package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.Cd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1216Cd extends AbstractC4887xd {

    /* renamed from: c, reason: collision with root package name */
    private MessageDigest f12560c;

    @Override // com.google.android.gms.internal.ads.AbstractC4887xd
    public final byte[] zzb(String str) throws UnsupportedEncodingException {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(Q7.X.SPACE);
        int length = strArrSplit.length;
        int i8 = 4;
        if (length == 1) {
            int iZza = AbstractC1175Bd.zza(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iZza);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i9 = 0; i9 < strArrSplit.length; i9++) {
                    int iZza2 = AbstractC1175Bd.zza(strArrSplit[i9]);
                    int i10 = (iZza2 >> 16) ^ ((char) iZza2);
                    byte b9 = (byte) i10;
                    byte b10 = (byte) (i10 >> 8);
                    int i11 = i9 + i9;
                    bArr[i11] = new byte[]{b9, b10}[0];
                    bArr[i11 + 1] = b10;
                }
            } else {
                bArr = new byte[length];
                for (int i12 = 0; i12 < strArrSplit.length; i12++) {
                    int iZza3 = AbstractC1175Bd.zza(strArrSplit[i12]);
                    bArr[i12] = (byte) ((iZza3 >> 24) ^ (((iZza3 & 255) ^ ((iZza3 >> 8) & 255)) ^ ((iZza3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.f12560c = a();
        synchronized (this.f23768a) {
            try {
                MessageDigest messageDigest = this.f12560c;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f12560c.update(bArrArray);
                byte[] bArrDigest = this.f12560c.digest();
                int length2 = bArrDigest.length;
                if (length2 <= 4) {
                    i8 = length2;
                }
                byte[] bArr2 = new byte[i8];
                System.arraycopy(bArrDigest, 0, bArr2, 0, i8);
                return bArr2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
