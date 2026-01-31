package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class IM0 extends UN0 {

    /* renamed from: l, reason: collision with root package name */
    private final boolean f13451l;

    /* renamed from: m, reason: collision with root package name */
    private final C4055qG f13452m;

    /* renamed from: n, reason: collision with root package name */
    private final C3711nF f13453n;

    /* renamed from: o, reason: collision with root package name */
    private GM0 f13454o;

    /* renamed from: p, reason: collision with root package name */
    private FM0 f13455p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f13456q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f13457r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f13458s;

    public IM0(PM0 pm0, boolean z8) {
        boolean z9;
        super(pm0);
        if (z8) {
            pm0.zzv();
            z9 = true;
        } else {
            z9 = false;
        }
        this.f13451l = z9;
        this.f13452m = new C4055qG();
        this.f13453n = new C3711nF();
        pm0.zzM();
        this.f13454o = GM0.zzq(pm0.zzJ());
    }

    private final Object r(Object obj) {
        return (this.f13454o.f13138f == null || !obj.equals(GM0.zzd)) ? obj : this.f13454o.f13138f;
    }

    private final void s(long j8) {
        FM0 fm0 = this.f13455p;
        int iZza = this.f13454o.zza(fm0.zza.zza);
        if (iZza == -1) {
            return;
        }
        GM0 gm0 = this.f13454o;
        C3711nF c3711nF = this.f13453n;
        gm0.zzd(iZza, c3711nF, false);
        long j9 = c3711nF.zze;
        if (j9 != -9223372036854775807L && j8 >= j9) {
            j8 = Math.max(0L, j9 - 1);
        }
        fm0.zzs(j8);
    }

    @Override // com.google.android.gms.internal.ads.UN0
    protected final NM0 p(NM0 nm0) {
        Object obj = this.f13454o.f13138f;
        Object obj2 = nm0.zza;
        if (obj != null && this.f13454o.f13138f.equals(obj2)) {
            obj2 = GM0.zzd;
        }
        return nm0.zza(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    @Override // com.google.android.gms.internal.ads.UN0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void q(com.google.android.gms.internal.ads.RG r15) {
        /*
            r14 = this;
            boolean r0 = r14.f13457r
            r1 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.GM0 r0 = r14.f13454o
            com.google.android.gms.internal.ads.GM0 r15 = r0.zzp(r15)
            r14.f13454o = r15
            com.google.android.gms.internal.ads.FM0 r15 = r14.f13455p
            if (r15 == 0) goto L9b
            long r2 = r15.zzn()
            r14.s(r2)
            goto L9b
        L1a:
            boolean r0 = r15.zzo()
            if (r0 == 0) goto L36
            boolean r0 = r14.f13458s
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.GM0 r0 = r14.f13454o
            com.google.android.gms.internal.ads.GM0 r15 = r0.zzp(r15)
            goto L33
        L2b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.C4055qG.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.GM0.zzd
            com.google.android.gms.internal.ads.GM0 r15 = com.google.android.gms.internal.ads.GM0.zzr(r15, r0, r2)
        L33:
            r14.f13454o = r15
            goto L9b
        L36:
            com.google.android.gms.internal.ads.qG r0 = r14.f13452m
            r2 = 0
            r3 = 0
            r15.zze(r2, r0, r3)
            com.google.android.gms.internal.ads.qG r0 = r14.f13452m
            java.lang.Object r0 = r0.zzc
            com.google.android.gms.internal.ads.FM0 r5 = r14.f13455p
            if (r5 == 0) goto L62
            long r6 = r5.zzq()
            com.google.android.gms.internal.ads.GM0 r8 = r14.f13454o
            com.google.android.gms.internal.ads.nF r9 = r14.f13453n
            com.google.android.gms.internal.ads.NM0 r5 = r5.zza
            java.lang.Object r5 = r5.zza
            r8.zzn(r5, r9)
            com.google.android.gms.internal.ads.GM0 r5 = r14.f13454o
            com.google.android.gms.internal.ads.qG r8 = r14.f13452m
            r5.zze(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L62
            r12 = r6
            goto L63
        L62:
            r12 = r3
        L63:
            com.google.android.gms.internal.ads.qG r9 = r14.f13452m
            com.google.android.gms.internal.ads.nF r10 = r14.f13453n
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.zzl(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.f13458s
            if (r2 == 0) goto L82
            com.google.android.gms.internal.ads.GM0 r0 = r14.f13454o
            com.google.android.gms.internal.ads.GM0 r15 = r0.zzp(r15)
            goto L86
        L82:
            com.google.android.gms.internal.ads.GM0 r15 = com.google.android.gms.internal.ads.GM0.zzr(r15, r0, r3)
        L86:
            r14.f13454o = r15
            com.google.android.gms.internal.ads.FM0 r15 = r14.f13455p
            if (r15 == 0) goto L9b
            r14.s(r4)
            com.google.android.gms.internal.ads.NM0 r15 = r15.zza
            java.lang.Object r0 = r15.zza
            java.lang.Object r0 = r14.r(r0)
            com.google.android.gms.internal.ads.NM0 r1 = r15.zza(r0)
        L9b:
            r15 = 1
            r14.f13458s = r15
            r14.f13457r = r15
            com.google.android.gms.internal.ads.GM0 r15 = r14.f13454o
            r14.i(r15)
            if (r1 == 0) goto Laf
            com.google.android.gms.internal.ads.FM0 r15 = r14.f13455p
            r15.getClass()
            r15.zzr(r1)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.IM0.q(com.google.android.gms.internal.ads.RG):void");
    }

    public final RG zzC() {
        return this.f13454o;
    }

    @Override // com.google.android.gms.internal.ads.UN0
    public final void zzF() {
        if (this.f13451l) {
            return;
        }
        this.f13456q = true;
        l(null, this.f16656k);
    }

    @Override // com.google.android.gms.internal.ads.UN0, com.google.android.gms.internal.ads.AbstractC4523uM0, com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public final void zzG(LM0 lm0) {
        ((FM0) lm0).zzt();
        if (lm0 == this.f13455p) {
            this.f13455p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.UN0, com.google.android.gms.internal.ads.AbstractC4523uM0, com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final FM0 zzI(NM0 nm0, C2703eP0 c2703eP0, long j8) {
        FM0 fm0 = new FM0(nm0, c2703eP0, j8);
        fm0.zzu(this.f16656k);
        if (this.f13457r) {
            fm0.zzr(nm0.zza(r(nm0.zza)));
        } else {
            this.f13455p = fm0;
            if (!this.f13456q) {
                this.f13456q = true;
                l(null, this.f16656k);
            }
        }
        return fm0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4523uM0, com.google.android.gms.internal.ads.AbstractC3726nM0
    public final void zzq() {
        this.f13457r = false;
        this.f13456q = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public final void zzt(C3658mp c3658mp) {
        if (this.f13458s) {
            this.f13454o = this.f13454o.zzp(new PN0(this.f13454o.f12272d, c3658mp));
        } else {
            this.f13454o = GM0.zzq(c3658mp);
        }
        this.f16656k.zzt(c3658mp);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4523uM0, com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public final void zzz() {
    }
}
