package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class E0 {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final float zzj;
    public final String zzk;

    private E0(List list, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, float f8, String str) {
        this.zza = list;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = i12;
        this.zzg = i13;
        this.zzh = i14;
        this.zzi = i15;
        this.zzj = f8;
        this.zzk = str;
    }

    private static byte[] a(C4099qh0 c4099qh0) {
        int iZzq = c4099qh0.zzq();
        int iZzd = c4099qh0.zzd();
        c4099qh0.zzL(iZzq);
        return I20.zzc(c4099qh0.zzM(), iZzd, iZzq);
    }

    public static E0 zza(C4099qh0 c4099qh0) throws C1901Sv {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String strZza;
        float f8;
        try {
            c4099qh0.zzL(4);
            int iZzm = c4099qh0.zzm() & 3;
            int i15 = iZzm + 1;
            if (i15 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzm2 = c4099qh0.zzm() & 31;
            for (int i16 = 0; i16 < iZzm2; i16++) {
                arrayList.add(a(c4099qh0));
            }
            int iZzm3 = c4099qh0.zzm();
            for (int i17 = 0; i17 < iZzm3; i17++) {
                arrayList.add(a(c4099qh0));
            }
            if (iZzm2 > 0) {
                Ys0 ys0Zze = AbstractC5148zt0.zze((byte[]) arrayList.get(0), iZzm + 2, ((byte[]) arrayList.get(0)).length);
                int i18 = ys0Zze.zze;
                int i19 = ys0Zze.zzf;
                int i20 = ys0Zze.zzh + 8;
                int i21 = ys0Zze.zzi + 8;
                int i22 = ys0Zze.zzj;
                int i23 = ys0Zze.zzk;
                int i24 = ys0Zze.zzl;
                float f9 = ys0Zze.zzg;
                strZza = I20.zza(ys0Zze.zza, ys0Zze.zzb, ys0Zze.zzc);
                i13 = i23;
                i14 = i24;
                f8 = f9;
                i10 = i20;
                i11 = i21;
                i12 = i22;
                i8 = i18;
                i9 = i19;
            } else {
                i8 = -1;
                i9 = -1;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                strZza = null;
                f8 = 1.0f;
            }
            return new E0(arrayList, i15, i8, i9, i10, i11, i12, i13, i14, f8, strZza);
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw C1901Sv.zza("Error parsing AVC config", e8);
        }
    }
}
