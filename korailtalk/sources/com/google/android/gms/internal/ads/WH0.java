package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class WH0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16957a;

    /* renamed from: b, reason: collision with root package name */
    private int f16958b;

    /* renamed from: c, reason: collision with root package name */
    private long f16959c;

    /* renamed from: d, reason: collision with root package name */
    private NM0 f16960d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16961e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16962f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ XH0 f16963g;

    public WH0(XH0 xh0, String str, int i8, NM0 nm0) {
        this.f16963g = xh0;
        this.f16957a = str;
        this.f16958b = i8;
        this.f16959c = nm0 == null ? -1L : nm0.zzd;
        if (nm0 == null || !nm0.zzb()) {
            return;
        }
        this.f16960d = nm0;
    }

    public final void zzg(int i8, NM0 nm0) {
        if (this.f16959c == -1 && i8 == this.f16958b && nm0 != null) {
            XH0 xh0 = this.f16963g;
            long j8 = nm0.zzd;
            if (j8 >= xh0.d()) {
                this.f16959c = j8;
            }
        }
    }

    public final boolean zzj(int i8, NM0 nm0) {
        if (nm0 == null) {
            return i8 == this.f16958b;
        }
        NM0 nm02 = this.f16960d;
        return nm02 == null ? !nm0.zzb() && nm0.zzd == this.f16959c : nm0.zzd == nm02.zzd && nm0.zzb == nm02.zzb && nm0.zzc == nm02.zzc;
    }

    public final boolean zzk(PG0 pg0) {
        NM0 nm0 = pg0.zzd;
        if (nm0 == null) {
            return this.f16958b != pg0.zzc;
        }
        long j8 = this.f16959c;
        if (j8 == -1) {
            return false;
        }
        if (nm0.zzd > j8) {
            return true;
        }
        if (this.f16960d == null) {
            return false;
        }
        RG rg = pg0.zzb;
        int iZza = rg.zza(nm0.zza);
        int iZza2 = rg.zza(this.f16960d.zza);
        NM0 nm02 = pg0.zzd;
        if (nm02.zzd < this.f16960d.zzd || iZza < iZza2) {
            return false;
        }
        if (iZza > iZza2) {
            return true;
        }
        if (!nm02.zzb()) {
            int i8 = pg0.zzd.zze;
            return i8 == -1 || i8 > this.f16960d.zzb;
        }
        NM0 nm03 = pg0.zzd;
        int i9 = nm03.zzb;
        int i10 = nm03.zzc;
        NM0 nm04 = this.f16960d;
        int i11 = nm04.zzb;
        if (i9 <= i11) {
            return i9 == i11 && i10 > nm04.zzc;
        }
        return true;
    }

    public final boolean zzl(RG rg, RG rg2) {
        int i8 = this.f16958b;
        if (i8 < rg.zzc()) {
            rg.zze(i8, this.f16963g.f17205a, 0L);
            for (int i9 = this.f16963g.f17205a.zzp; i9 <= this.f16963g.f17205a.zzq; i9++) {
                int iZza = rg2.zza(rg.zzf(i9));
                if (iZza != -1) {
                    i8 = rg2.zzd(iZza, this.f16963g.f17206b, false).zzd;
                    break;
                }
            }
            i8 = -1;
        } else if (i8 >= rg2.zzc()) {
            i8 = -1;
        }
        this.f16958b = i8;
        if (i8 == -1) {
            return false;
        }
        NM0 nm0 = this.f16960d;
        return nm0 == null || rg2.zza(nm0.zza) != -1;
    }
}
