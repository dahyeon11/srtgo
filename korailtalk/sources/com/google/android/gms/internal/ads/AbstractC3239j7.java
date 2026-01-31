package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3239j7 {
    public static int zza(byte[] bArr, int i8, int i9) {
        while (i8 < i9 && bArr[i8] != 71) {
            i8++;
        }
        return i8;
    }

    public static long zzb(C4099qh0 c4099qh0, int i8, int i9) {
        c4099qh0.zzK(i8);
        if (c4099qh0.zzb() < 5) {
            return -9223372036854775807L;
        }
        int iZzg = c4099qh0.zzg();
        if ((8388608 & iZzg) != 0 || ((iZzg >> 8) & 8191) != i9 || (iZzg & 32) == 0 || c4099qh0.zzm() < 7 || c4099qh0.zzb() < 7 || (c4099qh0.zzm() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c4099qh0.zzG(bArr, 0, 6);
        long j8 = bArr[0];
        long j9 = bArr[1];
        long j10 = bArr[2];
        long j11 = bArr[3] & 255;
        return ((j8 & 255) << 25) | ((j9 & 255) << 17) | ((j10 & 255) << 9) | (j11 + j11) | ((bArr[4] & 255) >> 7);
    }
}
