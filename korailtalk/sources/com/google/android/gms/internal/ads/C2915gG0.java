package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gG0 */
/* loaded from: classes2.dex */
final class C2915gG0 {

    /* renamed from: a */
    private final boolean[] f19339a;

    /* renamed from: b */
    private final GG0[] f19340b;

    /* renamed from: c */
    private final VO0 f19341c;

    /* renamed from: d */
    private final C4739wG0 f19342d;

    /* renamed from: e */
    private C2915gG0 f19343e;

    /* renamed from: f */
    private SN0 f19344f;

    /* renamed from: g */
    private WO0 f19345g;

    /* renamed from: h */
    private long f19346h;
    public final LM0 zza;
    public final Object zzb;
    public final GN0[] zzc;
    public boolean zzd;
    public boolean zze;
    public C3030hG0 zzf;
    public boolean zzg;

    public C2915gG0(GG0[] gg0Arr, long j8, VO0 vo0, C2703eP0 c2703eP0, C4739wG0 c4739wG0, C3030hG0 c3030hG0, WO0 wo0) {
        this.f19340b = gg0Arr;
        this.f19346h = j8;
        this.f19341c = vo0;
        this.f19342d = c4739wG0;
        NM0 nm0 = c3030hG0.zza;
        this.zzb = nm0.zza;
        this.zzf = c3030hG0;
        this.f19344f = SN0.zza;
        this.f19345g = wo0;
        this.zzc = new GN0[2];
        this.f19339a = new boolean[2];
        long j9 = c3030hG0.zzb;
        long j10 = c3030hG0.zzd;
        LM0 lm0Zzp = c4739wG0.zzp(nm0, c2703eP0, j9);
        this.zza = j10 != -9223372036854775807L ? new C4068qM0(lm0Zzp, true, 0L, j10) : lm0Zzp;
    }

    private final void a() {
        if (!c()) {
            return;
        }
        int i8 = 0;
        while (true) {
            WO0 wo0 = this.f19345g;
            if (i8 >= wo0.zza) {
                return;
            }
            wo0.zzb(i8);
            PO0 po0 = this.f19345g.zzc[i8];
            i8++;
        }
    }

    private final void b() {
        if (!c()) {
            return;
        }
        int i8 = 0;
        while (true) {
            WO0 wo0 = this.f19345g;
            if (i8 >= wo0.zza) {
                return;
            }
            wo0.zzb(i8);
            PO0 po0 = this.f19345g.zzc[i8];
            i8++;
        }
    }

    private final boolean c() {
        return this.f19343e == null;
    }

    public final long zza(WO0 wo0, long j8, boolean z8) {
        return zzb(wo0, j8, false, new boolean[2]);
    }

    public final long zzb(WO0 wo0, long j8, boolean z8, boolean[] zArr) {
        int i8 = 0;
        while (true) {
            boolean z9 = true;
            if (i8 >= wo0.zza) {
                break;
            }
            boolean[] zArr2 = this.f19339a;
            if (z8 || !wo0.zza(this.f19345g, i8)) {
                z9 = false;
            }
            zArr2[i8] = z9;
            i8++;
        }
        int i9 = 0;
        while (true) {
            GG0[] gg0Arr = this.f19340b;
            if (i9 >= 2) {
                break;
            }
            gg0Arr[i9].zzb();
            i9++;
        }
        a();
        this.f19345g = wo0;
        b();
        long jZzf = this.zza.zzf(wo0.zzc, this.f19339a, this.zzc, zArr, j8);
        int i10 = 0;
        while (true) {
            GG0[] gg0Arr2 = this.f19340b;
            if (i10 >= 2) {
                break;
            }
            gg0Arr2[i10].zzb();
            i10++;
        }
        this.zze = false;
        int i11 = 0;
        while (true) {
            GN0[] gn0Arr = this.zzc;
            if (i11 >= 2) {
                return jZzf;
            }
            if (gn0Arr[i11] != null) {
                F10.zzf(wo0.zzb(i11));
                this.f19340b[i11].zzb();
                this.zze = true;
            } else {
                F10.zzf(wo0.zzc[i11] == null);
            }
            i11++;
        }
    }

    public final long zzc() {
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        long jZzb = this.zze ? this.zza.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.zzf.zze : jZzb;
    }

    public final long zzd() {
        if (this.zzd) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final long zze() {
        return this.f19346h;
    }

    public final long zzf() {
        return this.zzf.zzb + this.f19346h;
    }

    public final C2915gG0 zzg() {
        return this.f19343e;
    }

    public final SN0 zzh() {
        return this.f19344f;
    }

    public final WO0 zzi() {
        return this.f19345g;
    }

    public final WO0 zzj(float f8, RG rg) {
        WO0 wo0Zzp = this.f19341c.zzp(this.f19340b, this.f19344f, this.zzf.zza, rg);
        for (PO0 po0 : wo0Zzp.zzc) {
        }
        return wo0Zzp;
    }

    public final void zzk(long j8, float f8, long j9) {
        F10.zzf(c());
        long j10 = j8 - this.f19346h;
        C2456cG0 c2456cG0 = new C2456cG0();
        c2456cG0.zze(j10);
        c2456cG0.zzf(f8);
        c2456cG0.zzd(j9);
        this.zza.zzo(new C2685eG0(c2456cG0, null));
    }

    public final void zzl(float f8, RG rg) {
        this.zzd = true;
        this.f19344f = this.zza.zzh();
        WO0 wo0Zzj = zzj(f8, rg);
        C3030hG0 c3030hG0 = this.zzf;
        long jMax = c3030hG0.zzb;
        long j8 = c3030hG0.zze;
        if (j8 != -9223372036854775807L && jMax >= j8) {
            jMax = Math.max(0L, j8 - 1);
        }
        long jZza = zza(wo0Zzj, jMax, false);
        long j9 = this.f19346h;
        C3030hG0 c3030hG02 = this.zzf;
        this.f19346h = j9 + (c3030hG02.zzb - jZza);
        this.zzf = c3030hG02.zzb(jZza);
    }

    public final void zzm(long j8) {
        F10.zzf(c());
        if (this.zzd) {
            this.zza.zzm(j8 - this.f19346h);
        }
    }

    public final void zzn() {
        a();
        LM0 lm0 = this.zza;
        try {
            boolean z8 = lm0 instanceof C4068qM0;
            C4739wG0 c4739wG0 = this.f19342d;
            if (z8) {
                c4739wG0.zzi(((C4068qM0) lm0).zza);
            } else {
                c4739wG0.zzi(lm0);
            }
        } catch (RuntimeException e8) {
            AbstractC2834fc0.zzd("MediaPeriodHolder", "Period release failed.", e8);
        }
    }

    public final void zzo(C2915gG0 c2915gG0) {
        if (c2915gG0 == this.f19343e) {
            return;
        }
        a();
        this.f19343e = c2915gG0;
        b();
    }

    public final void zzp(long j8) {
        this.f19346h = 1000000000000L;
    }

    public final void zzq() {
        LM0 lm0 = this.zza;
        if (lm0 instanceof C4068qM0) {
            long j8 = this.zzf.zzd;
            if (j8 == -9223372036854775807L) {
                j8 = Long.MIN_VALUE;
            }
            ((C4068qM0) lm0).zzn(0L, j8);
        }
    }

    public final boolean zzr() {
        if (this.zzd) {
            return !this.zze || this.zza.zzb() == Long.MIN_VALUE;
        }
        return false;
    }
}
