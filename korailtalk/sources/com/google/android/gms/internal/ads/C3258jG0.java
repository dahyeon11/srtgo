package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.jG0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3258jG0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3711nF f20217a = new C3711nF();

    /* renamed from: b, reason: collision with root package name */
    private final C4055qG f20218b = new C4055qG();

    /* renamed from: c, reason: collision with root package name */
    private final OG0 f20219c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4721w70 f20220d;

    /* renamed from: e, reason: collision with root package name */
    private long f20221e;

    /* renamed from: f, reason: collision with root package name */
    private int f20222f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f20223g;

    /* renamed from: h, reason: collision with root package name */
    private C2915gG0 f20224h;

    /* renamed from: i, reason: collision with root package name */
    private C2915gG0 f20225i;

    /* renamed from: j, reason: collision with root package name */
    private C2915gG0 f20226j;

    /* renamed from: k, reason: collision with root package name */
    private int f20227k;

    /* renamed from: l, reason: collision with root package name */
    private Object f20228l;

    /* renamed from: m, reason: collision with root package name */
    private long f20229m;

    /* renamed from: n, reason: collision with root package name */
    private final QF0 f20230n;

    public C3258jG0(OG0 og0, InterfaceC4721w70 interfaceC4721w70, QF0 qf0) {
        this.f20219c = og0;
        this.f20220d = interfaceC4721w70;
        this.f20230n = qf0;
    }

    private final boolean a(RG rg, NM0 nm0) {
        if (c(nm0)) {
            return rg.zze(rg.zzn(nm0.zza, this.f20217a).zzd, this.f20218b, 0L).zzq == rg.zza(nm0.zza);
        }
        return false;
    }

    private final boolean b(RG rg) {
        C2915gG0 c2915gG0Zzg = this.f20224h;
        if (c2915gG0Zzg == null) {
            return true;
        }
        int iZza = rg.zza(c2915gG0Zzg.zzb);
        while (true) {
            iZza = rg.zzi(iZza, this.f20217a, this.f20218b, this.f20222f, this.f20223g);
            while (true) {
                c2915gG0Zzg.getClass();
                if (c2915gG0Zzg.zzg() == null || c2915gG0Zzg.zzf.zzg) {
                    break;
                }
                c2915gG0Zzg = c2915gG0Zzg.zzg();
            }
            C2915gG0 c2915gG0Zzg2 = c2915gG0Zzg.zzg();
            if (iZza == -1 || c2915gG0Zzg2 == null || rg.zza(c2915gG0Zzg2.zzb) != iZza) {
                break;
            }
            c2915gG0Zzg = c2915gG0Zzg2;
        }
        boolean zZzn = zzn(c2915gG0Zzg);
        c2915gG0Zzg.zzf = zzh(rg, c2915gG0Zzg.zzf);
        return !zZzn;
    }

    private static final boolean c(NM0 nm0) {
        return !nm0.zzb() && nm0.zze == -1;
    }

    private final long e(RG rg, Object obj, int i8) {
        rg.zzn(obj, this.f20217a);
        this.f20217a.zzi(i8);
        this.f20217a.zzk(i8);
        return 0L;
    }

    private final C3030hG0 f(RG rg, C2915gG0 c2915gG0, long j8) {
        long j9;
        C3030hG0 c3030hG0 = c2915gG0.zzf;
        long jZze = (c2915gG0.zze() + c3030hG0.zze) - j8;
        if (c3030hG0.zzg) {
            long j10 = 0;
            int iZzi = rg.zzi(rg.zza(c3030hG0.zza.zza), this.f20217a, this.f20218b, this.f20222f, this.f20223g);
            if (iZzi != -1) {
                int i8 = rg.zzd(iZzi, this.f20217a, true).zzd;
                Object obj = this.f20217a.zzc;
                obj.getClass();
                long j11 = c3030hG0.zza.zzd;
                if (rg.zze(i8, this.f20218b, 0L).zzp == iZzi) {
                    Pair pairZzm = rg.zzm(this.f20218b, this.f20217a, i8, -9223372036854775807L, Math.max(0L, jZze));
                    if (pairZzm != null) {
                        obj = pairZzm.first;
                        long jLongValue = ((Long) pairZzm.second).longValue();
                        C2915gG0 c2915gG0Zzg = c2915gG0.zzg();
                        if (c2915gG0Zzg == null || !c2915gG0Zzg.zzb.equals(obj)) {
                            j11 = this.f20221e;
                            this.f20221e = 1 + j11;
                        } else {
                            j11 = c2915gG0Zzg.zzf.zza.zzd;
                        }
                        j9 = jLongValue;
                        j10 = -9223372036854775807L;
                    }
                } else {
                    j9 = 0;
                }
                NM0 nm0J = j(rg, obj, j9, j11, this.f20218b, this.f20217a);
                if (j10 != -9223372036854775807L && c3030hG0.zzc != -9223372036854775807L) {
                    rg.zzn(c3030hG0.zza.zza, this.f20217a).zzb();
                    this.f20217a.zzg();
                }
                return g(rg, nm0J, j10, j9);
            }
        } else {
            NM0 nm0 = c3030hG0.zza;
            rg.zzn(nm0.zza, this.f20217a);
            if (!nm0.zzb()) {
                int i9 = nm0.zze;
                if (i9 != -1) {
                    this.f20217a.zzm(i9);
                }
                C3711nF c3711nF = this.f20217a;
                int i10 = nm0.zze;
                int iZze = c3711nF.zze(i10);
                c3711nF.zzn(i10);
                if (iZze != this.f20217a.zza(nm0.zze)) {
                    return h(rg, nm0.zza, nm0.zze, iZze, c3030hG0.zze, nm0.zzd);
                }
                e(rg, nm0.zza, nm0.zze);
                return i(rg, nm0.zza, 0L, c3030hG0.zze, nm0.zzd);
            }
            int i11 = nm0.zzb;
            if (this.f20217a.zza(i11) != -1) {
                int iZzf = this.f20217a.zzf(i11, nm0.zzc);
                if (iZzf < 0) {
                    return h(rg, nm0.zza, i11, iZzf, c3030hG0.zzc, nm0.zzd);
                }
                long jLongValue2 = c3030hG0.zzc;
                if (jLongValue2 == -9223372036854775807L) {
                    C4055qG c4055qG = this.f20218b;
                    C3711nF c3711nF2 = this.f20217a;
                    Pair pairZzm2 = rg.zzm(c4055qG, c3711nF2, c3711nF2.zzd, -9223372036854775807L, Math.max(0L, jZze));
                    if (pairZzm2 != null) {
                        jLongValue2 = ((Long) pairZzm2.second).longValue();
                    }
                }
                e(rg, nm0.zza, nm0.zzb);
                return i(rg, nm0.zza, Math.max(0L, jLongValue2), c3030hG0.zzc, nm0.zzd);
            }
        }
        return null;
    }

    private final C3030hG0 g(RG rg, NM0 nm0, long j8, long j9) {
        rg.zzn(nm0.zza, this.f20217a);
        return nm0.zzb() ? h(rg, nm0.zza, nm0.zzb, nm0.zzc, j8, nm0.zzd) : i(rg, nm0.zza, j9, j8, nm0.zzd);
    }

    private final C3030hG0 h(RG rg, Object obj, int i8, int i9, long j8, long j9) {
        NM0 nm0 = new NM0(obj, i8, i9, j9);
        long jZzh = rg.zzn(nm0.zza, this.f20217a).zzh(nm0.zzb, nm0.zzc);
        if (i9 == this.f20217a.zze(i8)) {
            this.f20217a.zzj();
        }
        this.f20217a.zzn(nm0.zzb);
        return new C3030hG0(nm0, (jZzh == -9223372036854775807L || jZzh > 0) ? 0L : Math.max(0L, (-1) + jZzh), j8, -9223372036854775807L, jZzh, false, false, false, false);
    }

    private final C3030hG0 i(RG rg, Object obj, long j8, long j9, long j10) {
        long j11;
        long j12;
        long j13;
        long jMax = j8;
        rg.zzn(obj, this.f20217a);
        int iZzc = this.f20217a.zzc(jMax);
        if (iZzc != -1) {
            this.f20217a.zzm(iZzc);
        }
        if (iZzc == -1) {
            this.f20217a.zzb();
        } else {
            this.f20217a.zzn(iZzc);
        }
        NM0 nm0 = new NM0(obj, j10, iZzc);
        boolean zC = c(nm0);
        boolean zA = a(rg, nm0);
        boolean zL = l(rg, nm0, zC);
        if (iZzc != -1) {
            this.f20217a.zzn(iZzc);
        }
        if (iZzc != -1) {
            this.f20217a.zzi(iZzc);
            j11 = 0;
        } else {
            j11 = -9223372036854775807L;
        }
        if (j11 != -9223372036854775807L) {
            j12 = 0;
            j13 = 0;
        } else {
            j12 = j11;
            j13 = this.f20217a.zze;
        }
        if (j13 != -9223372036854775807L && jMax >= j13) {
            jMax = Math.max(0L, j13 - 1);
        }
        return new C3030hG0(nm0, jMax, j9, j12, j13, false, zC, zA, zL);
    }

    private static NM0 j(RG rg, Object obj, long j8, long j9, C4055qG c4055qG, C3711nF c3711nF) {
        rg.zzn(obj, c3711nF);
        rg.zze(c3711nF.zzd, c4055qG, 0L);
        rg.zza(obj);
        c3711nF.zzb();
        rg.zzn(obj, c3711nF);
        int iZzd = c3711nF.zzd(j8);
        return iZzd == -1 ? new NM0(obj, j9, c3711nF.zzc(j8)) : new NM0(obj, iZzd, c3711nF.zze(iZzd), j9);
    }

    private final void k() {
        final C2091Xk0 c2091Xk0 = new C2091Xk0();
        for (C2915gG0 c2915gG0Zzg = this.f20224h; c2915gG0Zzg != null; c2915gG0Zzg = c2915gG0Zzg.zzg()) {
            c2091Xk0.zzf(c2915gG0Zzg.zzf.zza);
        }
        C2915gG0 c2915gG0 = this.f20225i;
        final NM0 nm0 = c2915gG0 == null ? null : c2915gG0.zzf.zza;
        this.f20220d.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.iG0
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.d(c2091Xk0, nm0);
            }
        });
    }

    private final boolean l(RG rg, NM0 nm0, boolean z8) {
        int iZza = rg.zza(nm0.zza);
        return !rg.zze(rg.zzd(iZza, this.f20217a, false).zzd, this.f20218b, 0L).zzj && rg.zzi(iZza, this.f20217a, this.f20218b, this.f20222f, this.f20223g) == -1 && z8;
    }

    final /* synthetic */ void d(C2091Xk0 c2091Xk0, NM0 nm0) {
        this.f20219c.zzS(c2091Xk0.zzi(), nm0);
    }

    public final C2915gG0 zza() {
        C2915gG0 c2915gG0 = this.f20224h;
        if (c2915gG0 == null) {
            return null;
        }
        if (c2915gG0 == this.f20225i) {
            this.f20225i = c2915gG0.zzg();
        }
        c2915gG0.zzn();
        int i8 = this.f20227k - 1;
        this.f20227k = i8;
        if (i8 == 0) {
            this.f20226j = null;
            C2915gG0 c2915gG02 = this.f20224h;
            this.f20228l = c2915gG02.zzb;
            this.f20229m = c2915gG02.zzf.zza.zzd;
        }
        this.f20224h = this.f20224h.zzg();
        k();
        return this.f20224h;
    }

    public final C2915gG0 zzb() {
        C2915gG0 c2915gG0 = this.f20225i;
        F10.zzb(c2915gG0);
        this.f20225i = c2915gG0.zzg();
        k();
        C2915gG0 c2915gG02 = this.f20225i;
        F10.zzb(c2915gG02);
        return c2915gG02;
    }

    public final C2915gG0 zzc(C3030hG0 c3030hG0) {
        C2915gG0 c2915gG0 = this.f20226j;
        C2915gG0 c2915gG0Zzd = XF0.zzd(this.f20230n.zza, c3030hG0, c2915gG0 == null ? 1000000000000L : (c2915gG0.zze() + c2915gG0.zzf.zze) - c3030hG0.zzb);
        C2915gG0 c2915gG02 = this.f20226j;
        if (c2915gG02 != null) {
            c2915gG02.zzo(c2915gG0Zzd);
        } else {
            this.f20224h = c2915gG0Zzd;
            this.f20225i = c2915gG0Zzd;
        }
        this.f20228l = null;
        this.f20226j = c2915gG0Zzd;
        this.f20227k++;
        k();
        return c2915gG0Zzd;
    }

    public final C2915gG0 zzd() {
        return this.f20226j;
    }

    public final C2915gG0 zze() {
        return this.f20224h;
    }

    public final C2915gG0 zzf() {
        return this.f20225i;
    }

    public final C3030hG0 zzg(long j8, C4853xG0 c4853xG0) {
        C2915gG0 c2915gG0 = this.f20226j;
        return c2915gG0 == null ? g(c4853xG0.zza, c4853xG0.zzb, c4853xG0.zzc, c4853xG0.zzr) : f(c4853xG0.zza, c2915gG0, j8);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.C3030hG0 zzh(com.google.android.gms.internal.ads.RG r19, com.google.android.gms.internal.ads.C3030hG0 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.NM0 r3 = r2.zza
            boolean r12 = c(r3)
            boolean r13 = r0.a(r1, r3)
            boolean r14 = r0.l(r1, r3, r12)
            com.google.android.gms.internal.ads.NM0 r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.nF r5 = r0.f20217a
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L2f
            int r1 = r3.zze
            if (r1 != r4) goto L31
        L2f:
            r9 = r7
            goto L37
        L31:
            com.google.android.gms.internal.ads.nF r9 = r0.f20217a
            r9.zzi(r1)
            r9 = r5
        L37:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L4a
            com.google.android.gms.internal.ads.nF r1 = r0.f20217a
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzh(r5, r6)
        L47:
            r7 = r9
            r9 = r5
            goto L56
        L4a:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L51
            r7 = r5
            r9 = r7
            goto L56
        L51:
            com.google.android.gms.internal.ads.nF r1 = r0.f20217a
            long r5 = r1.zze
            goto L47
        L56:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L64
            com.google.android.gms.internal.ads.nF r1 = r0.f20217a
            int r4 = r3.zzb
            r1.zzn(r4)
            goto L6d
        L64:
            int r1 = r3.zze
            if (r1 == r4) goto L6d
            com.google.android.gms.internal.ads.nF r4 = r0.f20217a
            r4.zzn(r1)
        L6d:
            com.google.android.gms.internal.ads.hG0 r15 = new com.google.android.gms.internal.ads.hG0
            long r4 = r2.zzb
            long r1 = r2.zzc
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3258jG0.zzh(com.google.android.gms.internal.ads.RG, com.google.android.gms.internal.ads.hG0):com.google.android.gms.internal.ads.hG0");
    }

    public final NM0 zzi(RG rg, Object obj, long j8) {
        long j9;
        int iZza;
        int i8 = rg.zzn(obj, this.f20217a).zzd;
        Object obj2 = this.f20228l;
        if (obj2 == null || (iZza = rg.zza(obj2)) == -1 || rg.zzd(iZza, this.f20217a, false).zzd != i8) {
            C2915gG0 c2915gG0Zzg = this.f20224h;
            while (true) {
                if (c2915gG0Zzg == null) {
                    C2915gG0 c2915gG0Zzg2 = this.f20224h;
                    while (true) {
                        if (c2915gG0Zzg2 != null) {
                            int iZza2 = rg.zza(c2915gG0Zzg2.zzb);
                            if (iZza2 != -1 && rg.zzd(iZza2, this.f20217a, false).zzd == i8) {
                                j9 = c2915gG0Zzg2.zzf.zza.zzd;
                                break;
                            }
                            c2915gG0Zzg2 = c2915gG0Zzg2.zzg();
                        } else {
                            j9 = this.f20221e;
                            this.f20221e = 1 + j9;
                            if (this.f20224h == null) {
                                this.f20228l = obj;
                                this.f20229m = j9;
                            }
                        }
                    }
                } else {
                    if (c2915gG0Zzg.zzb.equals(obj)) {
                        j9 = c2915gG0Zzg.zzf.zza.zzd;
                        break;
                    }
                    c2915gG0Zzg = c2915gG0Zzg.zzg();
                }
            }
        } else {
            j9 = this.f20229m;
        }
        long j10 = j9;
        rg.zzn(obj, this.f20217a);
        rg.zze(this.f20217a.zzd, this.f20218b, 0L);
        int iZza3 = rg.zza(obj);
        Object obj3 = obj;
        while (true) {
            C4055qG c4055qG = this.f20218b;
            if (iZza3 < c4055qG.zzp) {
                return j(rg, obj3, j8, j10, c4055qG, this.f20217a);
            }
            rg.zzd(iZza3, this.f20217a, true);
            this.f20217a.zzb();
            C3711nF c3711nF = this.f20217a;
            if (c3711nF.zzd(c3711nF.zze) != -1) {
                obj3 = this.f20217a.zzc;
                obj3.getClass();
            }
            iZza3--;
        }
    }

    public final void zzj() {
        if (this.f20227k == 0) {
            return;
        }
        C2915gG0 c2915gG0Zzg = this.f20224h;
        F10.zzb(c2915gG0Zzg);
        this.f20228l = c2915gG0Zzg.zzb;
        this.f20229m = c2915gG0Zzg.zzf.zza.zzd;
        while (c2915gG0Zzg != null) {
            c2915gG0Zzg.zzn();
            c2915gG0Zzg = c2915gG0Zzg.zzg();
        }
        this.f20224h = null;
        this.f20226j = null;
        this.f20225i = null;
        this.f20227k = 0;
        k();
    }

    public final void zzl(long j8) {
        C2915gG0 c2915gG0 = this.f20226j;
        if (c2915gG0 != null) {
            c2915gG0.zzm(j8);
        }
    }

    public final boolean zzm(LM0 lm0) {
        C2915gG0 c2915gG0 = this.f20226j;
        return c2915gG0 != null && c2915gG0.zza == lm0;
    }

    public final boolean zzn(C2915gG0 c2915gG0) {
        F10.zzb(c2915gG0);
        boolean z8 = false;
        if (c2915gG0.equals(this.f20226j)) {
            return false;
        }
        this.f20226j = c2915gG0;
        while (c2915gG0.zzg() != null) {
            c2915gG0 = c2915gG0.zzg();
            c2915gG0.getClass();
            if (c2915gG0 == this.f20225i) {
                this.f20225i = this.f20224h;
                z8 = true;
            }
            c2915gG0.zzn();
            this.f20227k--;
        }
        C2915gG0 c2915gG02 = this.f20226j;
        c2915gG02.getClass();
        c2915gG02.zzo(null);
        k();
        return z8;
    }

    public final boolean zzo() {
        C2915gG0 c2915gG0 = this.f20226j;
        if (c2915gG0 == null) {
            return true;
        }
        if (c2915gG0.zzf.zzi || !c2915gG0.zzr() || this.f20226j.zzf.zze == -9223372036854775807L) {
            return false;
        }
        return this.f20227k < 100;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzp(com.google.android.gms.internal.ads.RG r17, long r18, long r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.gG0 r2 = r0.f20224h
            r3 = 0
        L7:
            r4 = 1
            if (r2 == 0) goto L97
            com.google.android.gms.internal.ads.hG0 r5 = r2.zzf
            r6 = 0
            if (r3 != 0) goto L16
            com.google.android.gms.internal.ads.hG0 r3 = r0.zzh(r1, r5)
            r7 = r18
            goto L39
        L16:
            r7 = r18
            com.google.android.gms.internal.ads.hG0 r9 = r0.f(r1, r3, r7)
            if (r9 != 0) goto L26
            boolean r1 = r0.zzn(r3)
            if (r1 != 0) goto L25
            return r4
        L25:
            return r6
        L26:
            long r10 = r5.zzb
            long r12 = r9.zzb
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L8f
            com.google.android.gms.internal.ads.NM0 r10 = r5.zza
            com.google.android.gms.internal.ads.NM0 r11 = r9.zza
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L8f
            r3 = r9
        L39:
            long r9 = r5.zzc
            com.google.android.gms.internal.ads.hG0 r9 = r3.zza(r9)
            r2.zzf = r9
            long r9 = r5.zze
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            long r13 = r3.zze
            if (r5 == 0) goto L86
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 != 0) goto L53
            goto L86
        L53:
            r2.zzq()
            long r7 = r3.zze
            int r1 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r1 != 0) goto L62
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L67
        L62:
            long r9 = r2.zze()
            long r7 = r7 + r9
        L67:
            com.google.android.gms.internal.ads.gG0 r1 = r0.f20225i
            if (r2 != r1) goto L7b
            com.google.android.gms.internal.ads.hG0 r1 = r2.zzf
            boolean r1 = r1.zzf
            r9 = -9223372036854775808
            int r1 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            if (r1 == 0) goto L79
            int r1 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r1 < 0) goto L7b
        L79:
            r1 = r4
            goto L7c
        L7b:
            r1 = r6
        L7c:
            boolean r2 = r0.zzn(r2)
            if (r2 != 0) goto L85
            if (r1 != 0) goto L85
            return r4
        L85:
            return r6
        L86:
            com.google.android.gms.internal.ads.gG0 r3 = r2.zzg()
            r15 = r3
            r3 = r2
            r2 = r15
            goto L7
        L8f:
            boolean r1 = r0.zzn(r3)
            if (r1 != 0) goto L96
            return r4
        L96:
            return r6
        L97:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3258jG0.zzp(com.google.android.gms.internal.ads.RG, long, long):boolean");
    }

    public final boolean zzq(RG rg, int i8) {
        this.f20222f = i8;
        return b(rg);
    }

    public final boolean zzr(RG rg, boolean z8) {
        this.f20223g = z8;
        return b(rg);
    }
}
