package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class N0 {
    private static int a(C4099qh0 c4099qh0) {
        int i8 = 0;
        while (c4099qh0.zzb() != 0) {
            int iZzm = c4099qh0.zzm();
            i8 += iZzm;
            if (iZzm != 255) {
                return i8;
            }
        }
        return -1;
    }

    public static void zza(long j8, C4099qh0 c4099qh0, K1[] k1Arr) {
        int iZzg;
        while (true) {
            if (c4099qh0.zzb() <= 1) {
                return;
            }
            int iA = a(c4099qh0);
            int iA2 = a(c4099qh0);
            int iZzd = c4099qh0.zzd() + iA2;
            if (iA2 == -1 || iA2 > c4099qh0.zzb()) {
                AbstractC2834fc0.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iZzd = c4099qh0.zze();
            } else if (iA == 4 && iA2 >= 8) {
                int iZzm = c4099qh0.zzm();
                int iZzq = c4099qh0.zzq();
                if (iZzq == 49) {
                    iZzg = c4099qh0.zzg();
                    iZzq = 49;
                } else {
                    iZzg = 0;
                }
                int iZzm2 = c4099qh0.zzm();
                if (iZzq == 47) {
                    c4099qh0.zzL(1);
                    iZzq = 47;
                }
                boolean z8 = iZzm == 181 && (iZzq == 49 || iZzq == 47) && iZzm2 == 3;
                if (iZzq == 49) {
                    z8 &= iZzg == 1195456820;
                }
                if (z8) {
                    zzb(j8, c4099qh0, k1Arr);
                }
            }
            c4099qh0.zzK(iZzd);
        }
    }

    public static void zzb(long j8, C4099qh0 c4099qh0, K1[] k1Arr) {
        int iZzm = c4099qh0.zzm();
        if ((iZzm & 64) != 0) {
            int i8 = iZzm & 31;
            c4099qh0.zzL(1);
            int iZzd = c4099qh0.zzd();
            for (K1 k12 : k1Arr) {
                int i9 = i8 * 3;
                c4099qh0.zzK(iZzd);
                k12.zzq(c4099qh0, i9);
                F10.zzf(j8 != -9223372036854775807L);
                k12.zzs(j8, 1, i9, 0, null);
            }
        }
    }
}
