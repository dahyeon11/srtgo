package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
final class Ey0 implements UA0 {

    /* renamed from: a */
    private final Dy0 f12879a;

    private Ey0(Dy0 dy0) {
        AbstractC3793nz0.b(dy0, "output");
        this.f12879a = dy0;
        dy0.f12723a = this;
    }

    public static Ey0 zza(Dy0 dy0) {
        Ey0 ey0 = dy0.f12723a;
        return ey0 != null ? ey0 : new Ey0(dy0);
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzA(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof Ez0)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f12879a.zzj(i8, ((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            this.f12879a.zzs(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Long) list.get(i11)).longValue();
                i10 += 8;
            }
            this.f12879a.zzu(i10);
            while (i9 < list.size()) {
                this.f12879a.zzk(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        Ez0 ez0 = (Ez0) list;
        if (!z8) {
            while (i9 < ez0.size()) {
                this.f12879a.zzj(i8, ez0.zza(i9));
                i9++;
            }
            return;
        }
        this.f12879a.zzs(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < ez0.size(); i13++) {
            ez0.zza(i13);
            i12 += 8;
        }
        this.f12879a.zzu(i12);
        while (i9 < ez0.size()) {
            this.f12879a.zzk(ez0.zza(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzB(int i8, int i9) {
        this.f12879a.zzt(i8, (i9 >> 31) ^ (i9 + i9));
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzC(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof C2307az0)) {
            if (!z8) {
                while (i9 < list.size()) {
                    Dy0 dy0 = this.f12879a;
                    int iIntValue = ((Integer) list.get(i9)).intValue();
                    dy0.zzt(i8, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i9++;
                }
                return;
            }
            this.f12879a.zzs(i8, 2);
            int iZzD = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                int iIntValue2 = ((Integer) list.get(i10)).intValue();
                iZzD += Dy0.zzD((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.f12879a.zzu(iZzD);
            while (i9 < list.size()) {
                Dy0 dy02 = this.f12879a;
                int iIntValue3 = ((Integer) list.get(i9)).intValue();
                dy02.zzu((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i9++;
            }
            return;
        }
        C2307az0 c2307az0 = (C2307az0) list;
        if (!z8) {
            while (i9 < c2307az0.size()) {
                Dy0 dy03 = this.f12879a;
                int iZzd = c2307az0.zzd(i9);
                dy03.zzt(i8, (iZzd >> 31) ^ (iZzd + iZzd));
                i9++;
            }
            return;
        }
        this.f12879a.zzs(i8, 2);
        int iZzD2 = 0;
        for (int i11 = 0; i11 < c2307az0.size(); i11++) {
            int iZzd2 = c2307az0.zzd(i11);
            iZzD2 += Dy0.zzD((iZzd2 >> 31) ^ (iZzd2 + iZzd2));
        }
        this.f12879a.zzu(iZzD2);
        while (i9 < c2307az0.size()) {
            Dy0 dy04 = this.f12879a;
            int iZzd3 = c2307az0.zzd(i9);
            dy04.zzu((iZzd3 >> 31) ^ (iZzd3 + iZzd3));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzD(int i8, long j8) {
        this.f12879a.zzv(i8, (j8 >> 63) ^ (j8 + j8));
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzE(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof Ez0)) {
            if (!z8) {
                while (i9 < list.size()) {
                    Dy0 dy0 = this.f12879a;
                    long jLongValue = ((Long) list.get(i9)).longValue();
                    dy0.zzv(i8, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i9++;
                }
                return;
            }
            this.f12879a.zzs(i8, 2);
            int iZzE = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                long jLongValue2 = ((Long) list.get(i10)).longValue();
                iZzE += Dy0.zzE((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.f12879a.zzu(iZzE);
            while (i9 < list.size()) {
                Dy0 dy02 = this.f12879a;
                long jLongValue3 = ((Long) list.get(i9)).longValue();
                dy02.zzw((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i9++;
            }
            return;
        }
        Ez0 ez0 = (Ez0) list;
        if (!z8) {
            while (i9 < ez0.size()) {
                Dy0 dy03 = this.f12879a;
                long jZza = ez0.zza(i9);
                dy03.zzv(i8, (jZza >> 63) ^ (jZza + jZza));
                i9++;
            }
            return;
        }
        this.f12879a.zzs(i8, 2);
        int iZzE2 = 0;
        for (int i11 = 0; i11 < ez0.size(); i11++) {
            long jZza2 = ez0.zza(i11);
            iZzE2 += Dy0.zzE((jZza2 >> 63) ^ (jZza2 + jZza2));
        }
        this.f12879a.zzu(iZzE2);
        while (i9 < ez0.size()) {
            Dy0 dy04 = this.f12879a;
            long jZza3 = ez0.zza(i9);
            dy04.zzw((jZza3 >> 63) ^ (jZza3 + jZza3));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.UA0
    @Deprecated
    public final void zzF(int i8) {
        this.f12879a.zzs(i8, 3);
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzG(int i8, String str) {
        this.f12879a.zzq(i8, str);
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzH(int i8, List list) {
        int i9 = 0;
        if (!(list instanceof InterfaceC4932xz0)) {
            while (i9 < list.size()) {
                this.f12879a.zzq(i8, (String) list.get(i9));
                i9++;
            }
            return;
        }
        InterfaceC4932xz0 interfaceC4932xz0 = (InterfaceC4932xz0) list;
        while (i9 < list.size()) {
            Object objZze = interfaceC4932xz0.zze(i9);
            if (objZze instanceof String) {
                this.f12879a.zzq(i8, (String) objZze);
            } else {
                this.f12879a.zzO(i8, (AbstractC3677my0) objZze);
            }
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzI(int i8, int i9) {
        this.f12879a.zzt(i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzJ(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof C2307az0)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f12879a.zzt(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f12879a.zzs(i8, 2);
            int iZzD = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iZzD += Dy0.zzD(((Integer) list.get(i10)).intValue());
            }
            this.f12879a.zzu(iZzD);
            while (i9 < list.size()) {
                this.f12879a.zzu(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        C2307az0 c2307az0 = (C2307az0) list;
        if (!z8) {
            while (i9 < c2307az0.size()) {
                this.f12879a.zzt(i8, c2307az0.zzd(i9));
                i9++;
            }
            return;
        }
        this.f12879a.zzs(i8, 2);
        int iZzD2 = 0;
        for (int i11 = 0; i11 < c2307az0.size(); i11++) {
            iZzD2 += Dy0.zzD(c2307az0.zzd(i11));
        }
        this.f12879a.zzu(iZzD2);
        while (i9 < c2307az0.size()) {
            this.f12879a.zzu(c2307az0.zzd(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzK(int i8, long j8) {
        this.f12879a.zzv(i8, j8);
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzL(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof Ez0)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f12879a.zzv(i8, ((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            this.f12879a.zzs(i8, 2);
            int iZzE = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iZzE += Dy0.zzE(((Long) list.get(i10)).longValue());
            }
            this.f12879a.zzu(iZzE);
            while (i9 < list.size()) {
                this.f12879a.zzw(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        Ez0 ez0 = (Ez0) list;
        if (!z8) {
            while (i9 < ez0.size()) {
                this.f12879a.zzv(i8, ez0.zza(i9));
                i9++;
            }
            return;
        }
        this.f12879a.zzs(i8, 2);
        int iZzE2 = 0;
        for (int i11 = 0; i11 < ez0.size(); i11++) {
            iZzE2 += Dy0.zzE(ez0.zza(i11));
        }
        this.f12879a.zzu(iZzE2);
        while (i9 < ez0.size()) {
            this.f12879a.zzw(ez0.zza(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzb(int i8, boolean z8) {
        this.f12879a.zzN(i8, z8);
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzc(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof Xx0)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f12879a.zzN(i8, ((Boolean) list.get(i9)).booleanValue());
                    i9++;
                }
                return;
            }
            this.f12879a.zzs(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Boolean) list.get(i11)).booleanValue();
                i10++;
            }
            this.f12879a.zzu(i10);
            while (i9 < list.size()) {
                this.f12879a.zzM(((Boolean) list.get(i9)).booleanValue() ? (byte) 1 : (byte) 0);
                i9++;
            }
            return;
        }
        Xx0 xx0 = (Xx0) list;
        if (!z8) {
            while (i9 < xx0.size()) {
                this.f12879a.zzN(i8, xx0.zzh(i9));
                i9++;
            }
            return;
        }
        this.f12879a.zzs(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < xx0.size(); i13++) {
            xx0.zzh(i13);
            i12++;
        }
        this.f12879a.zzu(i12);
        while (i9 < xx0.size()) {
            this.f12879a.zzM(xx0.zzh(i9) ? (byte) 1 : (byte) 0);
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzd(int i8, AbstractC3677my0 abstractC3677my0) {
        this.f12879a.zzO(i8, abstractC3677my0);
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zze(int i8, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.f12879a.zzO(i8, (AbstractC3677my0) list.get(i9));
        }
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzf(int i8, double d9) {
        this.f12879a.zzj(i8, Double.doubleToRawLongBits(d9));
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzg(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof Fy0)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f12879a.zzj(i8, Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
                    i9++;
                }
                return;
            }
            this.f12879a.zzs(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Double) list.get(i11)).doubleValue();
                i10 += 8;
            }
            this.f12879a.zzu(i10);
            while (i9 < list.size()) {
                this.f12879a.zzk(Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
                i9++;
            }
            return;
        }
        Fy0 fy0 = (Fy0) list;
        if (!z8) {
            while (i9 < fy0.size()) {
                this.f12879a.zzj(i8, Double.doubleToRawLongBits(fy0.zzd(i9)));
                i9++;
            }
            return;
        }
        this.f12879a.zzs(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < fy0.size(); i13++) {
            fy0.zzd(i13);
            i12 += 8;
        }
        this.f12879a.zzu(i12);
        while (i9 < fy0.size()) {
            this.f12879a.zzk(Double.doubleToRawLongBits(fy0.zzd(i9)));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.UA0
    @Deprecated
    public final void zzh(int i8) {
        this.f12879a.zzs(i8, 4);
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzi(int i8, int i9) {
        this.f12879a.zzl(i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzj(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!z8) {
            while (i9 < list.size()) {
                this.f12879a.zzl(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.f12879a.zzs(i8, 2);
        int iZzE = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iZzE += Dy0.zzE(((Integer) list.get(i10)).intValue());
        }
        this.f12879a.zzu(iZzE);
        while (i9 < list.size()) {
            this.f12879a.zzm(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzk(int i8, int i9) {
        this.f12879a.zzh(i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzl(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof C2307az0)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f12879a.zzh(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f12879a.zzs(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Integer) list.get(i11)).intValue();
                i10 += 4;
            }
            this.f12879a.zzu(i10);
            while (i9 < list.size()) {
                this.f12879a.zzi(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        C2307az0 c2307az0 = (C2307az0) list;
        if (!z8) {
            while (i9 < c2307az0.size()) {
                this.f12879a.zzh(i8, c2307az0.zzd(i9));
                i9++;
            }
            return;
        }
        this.f12879a.zzs(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c2307az0.size(); i13++) {
            c2307az0.zzd(i13);
            i12 += 4;
        }
        this.f12879a.zzu(i12);
        while (i9 < c2307az0.size()) {
            this.f12879a.zzi(c2307az0.zzd(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzm(int i8, long j8) {
        this.f12879a.zzj(i8, j8);
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzn(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof Ez0)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f12879a.zzj(i8, ((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            this.f12879a.zzs(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Long) list.get(i11)).longValue();
                i10 += 8;
            }
            this.f12879a.zzu(i10);
            while (i9 < list.size()) {
                this.f12879a.zzk(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        Ez0 ez0 = (Ez0) list;
        if (!z8) {
            while (i9 < ez0.size()) {
                this.f12879a.zzj(i8, ez0.zza(i9));
                i9++;
            }
            return;
        }
        this.f12879a.zzs(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < ez0.size(); i13++) {
            ez0.zza(i13);
            i12 += 8;
        }
        this.f12879a.zzu(i12);
        while (i9 < ez0.size()) {
            this.f12879a.zzk(ez0.zza(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzo(int i8, float f8) {
        this.f12879a.zzh(i8, Float.floatToRawIntBits(f8));
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzp(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof Qy0)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f12879a.zzh(i8, Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
                    i9++;
                }
                return;
            }
            this.f12879a.zzs(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Float) list.get(i11)).floatValue();
                i10 += 4;
            }
            this.f12879a.zzu(i10);
            while (i9 < list.size()) {
                this.f12879a.zzi(Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
                i9++;
            }
            return;
        }
        Qy0 qy0 = (Qy0) list;
        if (!z8) {
            while (i9 < qy0.size()) {
                this.f12879a.zzh(i8, Float.floatToRawIntBits(qy0.zzd(i9)));
                i9++;
            }
            return;
        }
        this.f12879a.zzs(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < qy0.size(); i13++) {
            qy0.zzd(i13);
            i12 += 4;
        }
        this.f12879a.zzu(i12);
        while (i9 < qy0.size()) {
            this.f12879a.zzi(Float.floatToRawIntBits(qy0.zzd(i9)));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzq(int i8, Object obj, InterfaceC3360kA0 interfaceC3360kA0) {
        Dy0 dy0 = this.f12879a;
        dy0.zzs(i8, 3);
        interfaceC3360kA0.zzj((Pz0) obj, dy0.f12723a);
        dy0.zzs(i8, 4);
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzr(int i8, int i9) {
        this.f12879a.zzl(i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzs(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof C2307az0)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f12879a.zzl(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f12879a.zzs(i8, 2);
            int iZzE = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iZzE += Dy0.zzE(((Integer) list.get(i10)).intValue());
            }
            this.f12879a.zzu(iZzE);
            while (i9 < list.size()) {
                this.f12879a.zzm(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        C2307az0 c2307az0 = (C2307az0) list;
        if (!z8) {
            while (i9 < c2307az0.size()) {
                this.f12879a.zzl(i8, c2307az0.zzd(i9));
                i9++;
            }
            return;
        }
        this.f12879a.zzs(i8, 2);
        int iZzE2 = 0;
        for (int i11 = 0; i11 < c2307az0.size(); i11++) {
            iZzE2 += Dy0.zzE(c2307az0.zzd(i11));
        }
        this.f12879a.zzu(iZzE2);
        while (i9 < c2307az0.size()) {
            this.f12879a.zzm(c2307az0.zzd(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzt(int i8, long j8) {
        this.f12879a.zzv(i8, j8);
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzu(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof Ez0)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f12879a.zzv(i8, ((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            this.f12879a.zzs(i8, 2);
            int iZzE = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                iZzE += Dy0.zzE(((Long) list.get(i10)).longValue());
            }
            this.f12879a.zzu(iZzE);
            while (i9 < list.size()) {
                this.f12879a.zzw(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        Ez0 ez0 = (Ez0) list;
        if (!z8) {
            while (i9 < ez0.size()) {
                this.f12879a.zzv(i8, ez0.zza(i9));
                i9++;
            }
            return;
        }
        this.f12879a.zzs(i8, 2);
        int iZzE2 = 0;
        for (int i11 = 0; i11 < ez0.size(); i11++) {
            iZzE2 += Dy0.zzE(ez0.zza(i11));
        }
        this.f12879a.zzu(iZzE2);
        while (i9 < ez0.size()) {
            this.f12879a.zzw(ez0.zza(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzv(int i8, Object obj, InterfaceC3360kA0 interfaceC3360kA0) {
        this.f12879a.e(i8, (Pz0) obj, interfaceC3360kA0);
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzw(int i8, Object obj) {
        if (obj instanceof AbstractC3677my0) {
            this.f12879a.zzp(i8, (AbstractC3677my0) obj);
        } else {
            this.f12879a.zzo(i8, (Pz0) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzx(int i8, int i9) {
        this.f12879a.zzh(i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzy(int i8, List list, boolean z8) {
        int i9 = 0;
        if (!(list instanceof C2307az0)) {
            if (!z8) {
                while (i9 < list.size()) {
                    this.f12879a.zzh(i8, ((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            this.f12879a.zzs(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((Integer) list.get(i11)).intValue();
                i10 += 4;
            }
            this.f12879a.zzu(i10);
            while (i9 < list.size()) {
                this.f12879a.zzi(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        C2307az0 c2307az0 = (C2307az0) list;
        if (!z8) {
            while (i9 < c2307az0.size()) {
                this.f12879a.zzh(i8, c2307az0.zzd(i9));
                i9++;
            }
            return;
        }
        this.f12879a.zzs(i8, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < c2307az0.size(); i13++) {
            c2307az0.zzd(i13);
            i12 += 4;
        }
        this.f12879a.zzu(i12);
        while (i9 < c2307az0.size()) {
            this.f12879a.zzi(c2307az0.zzd(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.UA0
    public final void zzz(int i8, long j8) {
        this.f12879a.zzj(i8, j8);
    }
}
