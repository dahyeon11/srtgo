package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.t1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4366t1 {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final String zzi;

    private C4366t1(List list, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, float f8, String str) {
        this.zza = list;
        this.zzb = i8;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = i15;
        this.zzh = f8;
        this.zzi = str;
    }

    public static C4366t1 zza(C4099qh0 c4099qh0) throws C1901Sv {
        int i8;
        int i9;
        int i10;
        try {
            c4099qh0.zzL(21);
            int iZzm = c4099qh0.zzm() & 3;
            int iZzm2 = c4099qh0.zzm();
            int iZzd = c4099qh0.zzd();
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < iZzm2; i13++) {
                c4099qh0.zzL(1);
                int iZzq = c4099qh0.zzq();
                for (int i14 = 0; i14 < iZzq; i14++) {
                    int iZzq2 = c4099qh0.zzq();
                    i12 += iZzq2 + 4;
                    c4099qh0.zzL(iZzq2);
                }
            }
            c4099qh0.zzK(iZzd);
            byte[] bArr = new byte[i12];
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            String strZzb = null;
            float f8 = 1.0f;
            int i22 = 0;
            int i23 = 0;
            while (i22 < iZzm2) {
                int iZzm3 = c4099qh0.zzm() & 63;
                int iZzq3 = c4099qh0.zzq();
                int i24 = i11;
                while (i24 < iZzq3) {
                    int iZzq4 = c4099qh0.zzq();
                    int i25 = iZzm2;
                    System.arraycopy(AbstractC5148zt0.zza, i11, bArr, i23, 4);
                    int i26 = i23 + 4;
                    System.arraycopy(c4099qh0.zzM(), c4099qh0.zzd(), bArr, i26, iZzq4);
                    int i27 = i26 + iZzq4;
                    if (iZzm3 == 33 && i24 == 0) {
                        Wr0 wr0Zzc = AbstractC5148zt0.zzc(bArr, i23 + 6, i27);
                        i15 = wr0Zzc.zzi;
                        i16 = wr0Zzc.zzj;
                        i17 = wr0Zzc.zze + 8;
                        i18 = wr0Zzc.zzf + 8;
                        int i28 = wr0Zzc.zzl;
                        int i29 = wr0Zzc.zzm;
                        int i30 = wr0Zzc.zzn;
                        i8 = i27;
                        float f9 = wr0Zzc.zzk;
                        i9 = iZzm3;
                        i10 = iZzq3;
                        strZzb = I20.zzb(wr0Zzc.zza, wr0Zzc.zzb, wr0Zzc.zzc, wr0Zzc.zzd, wr0Zzc.zzg, wr0Zzc.zzh);
                        f8 = f9;
                        i19 = i28;
                        i20 = i29;
                        i21 = i30;
                        i24 = 0;
                    } else {
                        i8 = i27;
                        i9 = iZzm3;
                        i10 = iZzq3;
                    }
                    c4099qh0.zzL(iZzq4);
                    i24++;
                    iZzm2 = i25;
                    i23 = i8;
                    iZzm3 = i9;
                    iZzq3 = i10;
                    i11 = 0;
                }
                i22++;
                i11 = 0;
            }
            return new C4366t1(i12 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iZzm + 1, i15, i16, i17, i18, i19, i20, i21, f8, strZzb);
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw C1901Sv.zza("Error parsing HEVC config", e8);
        }
    }
}
