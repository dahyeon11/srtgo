package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class Au0 {
    public static byte[] zza(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i8 = 0;
        while (i8 < 16) {
            int i9 = i8 + 1;
            byte b9 = bArr[i8];
            byte b10 = (byte) ((b9 + b9) & 254);
            bArr2[i8] = b10;
            if (i8 < 15) {
                bArr2[i8] = (byte) (((bArr[i9] >> 7) & 1) | b10);
            }
            i8 = i9;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
