package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes2.dex */
public abstract class CE0 extends RG {

    /* renamed from: d, reason: collision with root package name */
    private final int f12503d;

    /* renamed from: e, reason: collision with root package name */
    private final JN0 f12504e;

    public CE0(boolean z8, JN0 jn0) {
        this.f12504e = jn0;
        this.f12503d = jn0.zzc();
    }

    private final int h(int i8, boolean z8) {
        if (z8) {
            return this.f12504e.zzd(i8);
        }
        if (i8 >= this.f12503d - 1) {
            return -1;
        }
        return i8 + 1;
    }

    private final int i(int i8, boolean z8) {
        if (z8) {
            return this.f12504e.zze(i8);
        }
        if (i8 <= 0) {
            return -1;
        }
        return i8 - 1;
    }

    protected abstract int a(Object obj);

    protected abstract int b(int i8);

    protected abstract int c(int i8);

    protected abstract int d(int i8);

    protected abstract int e(int i8);

    protected abstract RG f(int i8);

    protected abstract Object g(int i8);

    @Override // com.google.android.gms.internal.ads.RG
    public final int zza(Object obj) {
        int iZza;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int iA = a(obj2);
            if (iA != -1 && (iZza = f(iA).zza(obj3)) != -1) {
                return d(iA) + iZza;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final C3711nF zzd(int i8, C3711nF c3711nF, boolean z8) {
        int iB = b(i8);
        int iE = e(iB);
        f(iB).zzd(i8 - d(iB), c3711nF, z8);
        c3711nF.zzd += iE;
        if (z8) {
            Object objG = g(iB);
            Object obj = c3711nF.zzc;
            obj.getClass();
            c3711nF.zzc = Pair.create(objG, obj);
        }
        return c3711nF;
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final C4055qG zze(int i8, C4055qG c4055qG, long j8) {
        int iC = c(i8);
        int iE = e(iC);
        int iD = d(iC);
        f(iC).zze(i8 - iE, c4055qG, j8);
        Object objG = g(iC);
        if (!C4055qG.zza.equals(c4055qG.zzc)) {
            objG = Pair.create(objG, c4055qG.zzc);
        }
        c4055qG.zzc = objG;
        c4055qG.zzp += iD;
        c4055qG.zzq += iD;
        return c4055qG;
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final Object zzf(int i8) {
        int iB = b(i8);
        return Pair.create(g(iB), f(iB).zzf(i8 - d(iB)));
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final int zzg(boolean z8) {
        if (this.f12503d != 0) {
            int iZza = z8 ? this.f12504e.zza() : 0;
            while (f(iZza).zzo()) {
                iZza = h(iZza, z8);
                if (iZza == -1) {
                }
            }
            return e(iZza) + f(iZza).zzg(z8);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final int zzh(boolean z8) {
        int i8 = this.f12503d;
        if (i8 != 0) {
            int iZzb = z8 ? this.f12504e.zzb() : i8 - 1;
            while (f(iZzb).zzo()) {
                iZzb = i(iZzb, z8);
                if (iZzb == -1) {
                }
            }
            return e(iZzb) + f(iZzb).zzh(z8);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final int zzj(int i8, int i9, boolean z8) {
        int iC = c(i8);
        int iE = e(iC);
        int iZzj = f(iC).zzj(i8 - iE, i9 == 2 ? 0 : i9, z8);
        if (iZzj != -1) {
            return iE + iZzj;
        }
        int iH = h(iC, z8);
        while (iH != -1 && f(iH).zzo()) {
            iH = h(iH, z8);
        }
        if (iH != -1) {
            return e(iH) + f(iH).zzg(z8);
        }
        if (i9 == 2) {
            return zzg(z8);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final int zzk(int i8, int i9, boolean z8) {
        int iC = c(i8);
        int iE = e(iC);
        int iZzk = f(iC).zzk(i8 - iE, 0, false);
        if (iZzk != -1) {
            return iE + iZzk;
        }
        int i10 = i(iC, false);
        while (i10 != -1 && f(i10).zzo()) {
            i10 = i(i10, false);
        }
        if (i10 != -1) {
            return e(i10) + f(i10).zzh(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.RG
    public final C3711nF zzn(Object obj, C3711nF c3711nF) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iA = a(obj2);
        int iE = e(iA);
        f(iA).zzn(obj3, c3711nF);
        c3711nF.zzd += iE;
        c3711nF.zzc = obj;
        return c3711nF;
    }
}
