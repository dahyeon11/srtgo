package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
final class XF0 implements Handler.Callback, KM0, UO0, InterfaceC4625vG0, TE0, InterfaceC4967yG0 {

    /* renamed from: A, reason: collision with root package name */
    private boolean f17162A;

    /* renamed from: C, reason: collision with root package name */
    private boolean f17164C;

    /* renamed from: F, reason: collision with root package name */
    private boolean f17167F;

    /* renamed from: G, reason: collision with root package name */
    private int f17168G;

    /* renamed from: H, reason: collision with root package name */
    private WF0 f17169H;

    /* renamed from: I, reason: collision with root package name */
    private long f17170I;

    /* renamed from: J, reason: collision with root package name */
    private int f17171J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f17172K;

    /* renamed from: L, reason: collision with root package name */
    private WE0 f17173L;

    /* renamed from: N, reason: collision with root package name */
    private final C3028hF0 f17175N;

    /* renamed from: O, reason: collision with root package name */
    private final PE0 f17176O;

    /* renamed from: a, reason: collision with root package name */
    private final EG0[] f17177a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f17178b;

    /* renamed from: c, reason: collision with root package name */
    private final GG0[] f17179c;

    /* renamed from: d, reason: collision with root package name */
    private final VO0 f17180d;

    /* renamed from: e, reason: collision with root package name */
    private final WO0 f17181e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC2227aG0 f17182f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC2589dP0 f17183g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC4721w70 f17184h;

    /* renamed from: i, reason: collision with root package name */
    private final HandlerThread f17185i;

    /* renamed from: j, reason: collision with root package name */
    private final Looper f17186j;

    /* renamed from: k, reason: collision with root package name */
    private final C4055qG f17187k;

    /* renamed from: l, reason: collision with root package name */
    private final C3711nF f17188l;

    /* renamed from: m, reason: collision with root package name */
    private final long f17189m;

    /* renamed from: n, reason: collision with root package name */
    private final UE0 f17190n;

    /* renamed from: o, reason: collision with root package name */
    private final ArrayList f17191o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3002h20 f17192p;

    /* renamed from: q, reason: collision with root package name */
    private final C3258jG0 f17193q;

    /* renamed from: r, reason: collision with root package name */
    private final C4739wG0 f17194r;

    /* renamed from: s, reason: collision with root package name */
    private final long f17195s;

    /* renamed from: t, reason: collision with root package name */
    private final C2577dJ0 f17196t;

    /* renamed from: u, reason: collision with root package name */
    private IG0 f17197u;

    /* renamed from: v, reason: collision with root package name */
    private C4853xG0 f17198v;

    /* renamed from: w, reason: collision with root package name */
    private VF0 f17199w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f17200x;

    /* renamed from: z, reason: collision with root package name */
    private boolean f17202z;

    /* renamed from: D, reason: collision with root package name */
    private int f17165D = 0;

    /* renamed from: E, reason: collision with root package name */
    private boolean f17166E = false;

    /* renamed from: y, reason: collision with root package name */
    private boolean f17201y = false;

    /* renamed from: M, reason: collision with root package name */
    private long f17174M = -9223372036854775807L;

    /* renamed from: B, reason: collision with root package name */
    private long f17163B = -9223372036854775807L;

    public XF0(EG0[] eg0Arr, VO0 vo0, WO0 wo0, InterfaceC2227aG0 interfaceC2227aG0, InterfaceC2589dP0 interfaceC2589dP0, int i8, boolean z8, OG0 og0, IG0 ig0, PE0 pe0, long j8, boolean z9, Looper looper, InterfaceC3002h20 interfaceC3002h20, C3028hF0 c3028hF0, C2577dJ0 c2577dJ0, Looper looper2) {
        this.f17175N = c3028hF0;
        this.f17177a = eg0Arr;
        this.f17180d = vo0;
        this.f17181e = wo0;
        this.f17182f = interfaceC2227aG0;
        this.f17183g = interfaceC2589dP0;
        this.f17197u = ig0;
        this.f17176O = pe0;
        this.f17195s = j8;
        this.f17192p = interfaceC3002h20;
        this.f17196t = c2577dJ0;
        this.f17189m = interfaceC2227aG0.zzb(c2577dJ0);
        interfaceC2227aG0.zzg(c2577dJ0);
        C4853xG0 c4853xG0Zzg = C4853xG0.zzg(wo0);
        this.f17198v = c4853xG0Zzg;
        this.f17199w = new VF0(c4853xG0Zzg);
        int length = eg0Arr.length;
        this.f17179c = new GG0[2];
        FG0 fg0Zze = vo0.zze();
        for (int i9 = 0; i9 < 2; i9++) {
            eg0Arr[i9].zzu(i9, c2577dJ0, interfaceC3002h20);
            this.f17179c[i9] = eg0Arr[i9].zzl();
            this.f17179c[i9].zzL(fg0Zze);
        }
        this.f17190n = new UE0(this, interfaceC3002h20);
        this.f17191o = new ArrayList();
        this.f17178b = Collections.newSetFromMap(new IdentityHashMap());
        this.f17187k = new C4055qG();
        this.f17188l = new C3711nF();
        vo0.zzs(this, interfaceC2589dP0);
        this.f17172K = true;
        InterfaceC4721w70 interfaceC4721w70Zzb = interfaceC3002h20.zzb(looper, null);
        this.f17193q = new C3258jG0(og0, interfaceC4721w70Zzb, new QF0(this));
        this.f17194r = new C4739wG0(this, og0, interfaceC4721w70Zzb, c2577dJ0);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f17185i = handlerThread;
        handlerThread.start();
        Looper looper3 = handlerThread.getLooper();
        this.f17186j = looper3;
        this.f17184h = interfaceC3002h20.zzb(looper3, this);
    }

    private final void A() {
        C2915gG0 c2915gG0Zze = this.f17193q.zze();
        if (c2915gG0Zze == null) {
            return;
        }
        long jZzd = c2915gG0Zze.zzd ? c2915gG0Zze.zza.zzd() : -9223372036854775807L;
        if (jZzd != -9223372036854775807L) {
            if (!c2915gG0Zze.zzr()) {
                this.f17193q.zzn(c2915gG0Zze);
                e(false);
                i();
            }
            o(jZzd);
            if (jZzd != this.f17198v.zzr) {
                C4853xG0 c4853xG0 = this.f17198v;
                this.f17198v = Z(c4853xG0.zzb, jZzd, c4853xG0.zzc, jZzd, true, 5);
            }
        } else {
            long jZzb = this.f17190n.zzb(c2915gG0Zze != this.f17193q.zzf());
            this.f17170I = jZzb;
            long jZze = jZzb - c2915gG0Zze.zze();
            long j8 = this.f17198v.zzr;
            if (!this.f17191o.isEmpty() && !this.f17198v.zzb.zzb()) {
                if (this.f17172K) {
                    this.f17172K = false;
                }
                C4853xG0 c4853xG02 = this.f17198v;
                c4853xG02.zza.zza(c4853xG02.zzb.zza);
                int iMin = Math.min(this.f17171J, this.f17191o.size());
                if (iMin > 0) {
                    android.support.v4.media.session.f.a(this.f17191o.get(iMin - 1));
                }
                if (iMin < this.f17191o.size()) {
                    android.support.v4.media.session.f.a(this.f17191o.get(iMin));
                }
                this.f17171J = iMin;
            }
            if (this.f17190n.zzj()) {
                C4853xG0 c4853xG03 = this.f17198v;
                this.f17198v = Z(c4853xG03.zzb, jZze, c4853xG03.zzc, jZze, true, 6);
            } else {
                C4853xG0 c4853xG04 = this.f17198v;
                c4853xG04.zzr = jZze;
                c4853xG04.zzs = SystemClock.elapsedRealtime();
            }
        }
        this.f17198v.zzp = this.f17193q.zzd().zzc();
        this.f17198v.zzq = T();
        C4853xG0 c4853xG05 = this.f17198v;
        if (c4853xG05.zzl && c4853xG05.zze == 3 && J(c4853xG05.zza, c4853xG05.zzb)) {
            C4853xG0 c4853xG06 = this.f17198v;
            if (c4853xG06.zzn.zzc == 1.0f) {
                float fZza = this.f17176O.zza(S(c4853xG06.zza, c4853xG06.zzb.zza, c4853xG06.zzr), T());
                if (this.f17190n.zzc().zzc != fZza) {
                    s(new C2149Yx(fZza, this.f17198v.zzn.zzd));
                    h(this.f17198v.zzn, this.f17190n.zzc().zzc, false, false);
                }
            }
        }
    }

    private final void B(RG rg, NM0 nm0, RG rg2, NM0 nm02, long j8, boolean z8) {
        if (!J(rg, nm0)) {
            C2149Yx c2149Yx = nm0.zzb() ? C2149Yx.zza : this.f17198v.zzn;
            if (this.f17190n.zzc().equals(c2149Yx)) {
                return;
            }
            s(c2149Yx);
            h(this.f17198v.zzn, c2149Yx.zzc, false, false);
            return;
        }
        rg.zze(rg.zzn(nm0.zza, this.f17188l).zzd, this.f17187k, 0L);
        PE0 pe0 = this.f17176O;
        C3306jk c3306jk = this.f17187k.zzl;
        int i8 = AbstractC2281am0.zza;
        pe0.zzd(c3306jk);
        if (j8 != -9223372036854775807L) {
            this.f17176O.zze(S(rg, nm0.zza, j8));
            return;
        }
        if (!AbstractC2281am0.zzG(!rg2.zzo() ? rg2.zze(rg2.zzn(nm02.zza, this.f17188l).zzd, this.f17187k, 0L).zzc : null, this.f17187k.zzc) || z8) {
            this.f17176O.zze(-9223372036854775807L);
        }
    }

    private final void C(boolean z8, boolean z9) {
        this.f17162A = z8;
        this.f17163B = z9 ? -9223372036854775807L : SystemClock.elapsedRealtime();
    }

    private final synchronized void D(InterfaceC1843Rj0 interfaceC1843Rj0, long j8) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j8;
        boolean z8 = false;
        while (!((OF0) interfaceC1843Rj0).zza.f17200x && j8 > 0) {
            try {
                wait(j8);
            } catch (InterruptedException unused) {
                z8 = true;
            }
            j8 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean E() {
        C2915gG0 c2915gG0Zzd = this.f17193q.zzd();
        return (c2915gG0Zzd == null || c2915gG0Zzd.zzd() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean F(EG0 eg0) {
        return eg0.zzcU() != 0;
    }

    private final boolean G() {
        C2915gG0 c2915gG0Zze = this.f17193q.zze();
        long j8 = c2915gG0Zze.zzf.zze;
        if (!c2915gG0Zze.zzd) {
            return false;
        }
        if (j8 == -9223372036854775807L || this.f17198v.zzr < j8) {
            return true;
        }
        return !I();
    }

    private static boolean H(C4853xG0 c4853xG0, C3711nF c3711nF) {
        NM0 nm0 = c4853xG0.zzb;
        RG rg = c4853xG0.zza;
        return rg.zzo() || rg.zzn(nm0.zza, c3711nF).zzg;
    }

    private final boolean I() {
        C4853xG0 c4853xG0 = this.f17198v;
        return c4853xG0.zzl && c4853xG0.zzm == 0;
    }

    private final boolean J(RG rg, NM0 nm0) {
        if (!nm0.zzb() && !rg.zzo()) {
            rg.zze(rg.zzn(nm0.zza, this.f17188l).zzd, this.f17187k, 0L);
            if (this.f17187k.zzb()) {
                C4055qG c4055qG = this.f17187k;
                if (c4055qG.zzj && c4055qG.zzg != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static Q5[] K(PO0 po0) {
        int iZzc = po0 != null ? po0.zzc() : 0;
        Q5[] q5Arr = new Q5[iZzc];
        for (int i8 = 0; i8 < iZzc; i8++) {
            q5Arr[i8] = po0.zzd(i8);
        }
        return q5Arr;
    }

    private static final void L(AG0 ag0) {
        ag0.zzj();
        try {
            ag0.zzc().zzt(ag0.zza(), ag0.zzg());
        } finally {
            ag0.zzh(true);
        }
    }

    private static final void M(EG0 eg0) {
        if (eg0.zzcU() == 2) {
            eg0.zzP();
        }
    }

    private static final void N(EG0 eg0, long j8) {
        eg0.zzK();
    }

    static Object Q(C4055qG c4055qG, C3711nF c3711nF, int i8, boolean z8, Object obj, RG rg, RG rg2) {
        int iZza = rg.zza(obj);
        int iZzb = rg.zzb();
        int i9 = 0;
        int iZzi = iZza;
        int iZza2 = -1;
        while (true) {
            if (i9 >= iZzb || iZza2 != -1) {
                break;
            }
            iZzi = rg.zzi(iZzi, c3711nF, c4055qG, i8, z8);
            if (iZzi == -1) {
                iZza2 = -1;
                break;
            }
            iZza2 = rg2.zza(rg.zzf(iZzi));
            i9++;
        }
        if (iZza2 == -1) {
            return null;
        }
        return rg2.zzf(iZza2);
    }

    static final /* synthetic */ void R(AG0 ag0) {
        try {
            L(ag0);
        } catch (WE0 e8) {
            AbstractC2834fc0.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e8);
            throw new RuntimeException(e8);
        }
    }

    private final long S(RG rg, Object obj, long j8) {
        rg.zze(rg.zzn(obj, this.f17188l).zzd, this.f17187k, 0L);
        C4055qG c4055qG = this.f17187k;
        if (c4055qG.zzg != -9223372036854775807L && c4055qG.zzb()) {
            C4055qG c4055qG2 = this.f17187k;
            if (c4055qG2.zzj) {
                long j9 = c4055qG2.zzh;
                return AbstractC2281am0.zzr((j9 == -9223372036854775807L ? System.currentTimeMillis() : j9 + SystemClock.elapsedRealtime()) - this.f17187k.zzg) - j8;
            }
        }
        return -9223372036854775807L;
    }

    private final long T() {
        return U(this.f17198v.zzp);
    }

    private final long U(long j8) {
        C2915gG0 c2915gG0Zzd = this.f17193q.zzd();
        if (c2915gG0Zzd == null) {
            return 0L;
        }
        return Math.max(0L, j8 - (this.f17170I - c2915gG0Zzd.zze()));
    }

    private final long V(NM0 nm0, long j8, boolean z8) {
        C3258jG0 c3258jG0 = this.f17193q;
        return W(nm0, j8, c3258jG0.zze() != c3258jG0.zzf(), z8);
    }

    private final long W(NM0 nm0, long j8, boolean z8, boolean z9) throws WE0 {
        x();
        C(false, true);
        if (z9 || this.f17198v.zze == 3) {
            u(2);
        }
        C2915gG0 c2915gG0Zze = this.f17193q.zze();
        C2915gG0 c2915gG0Zzg = c2915gG0Zze;
        while (c2915gG0Zzg != null && !nm0.equals(c2915gG0Zzg.zzf.zza)) {
            c2915gG0Zzg = c2915gG0Zzg.zzg();
        }
        if (z8 || c2915gG0Zze != c2915gG0Zzg || (c2915gG0Zzg != null && c2915gG0Zzg.zze() + j8 < 0)) {
            EG0[] eg0Arr = this.f17177a;
            int length = eg0Arr.length;
            for (int i8 = 0; i8 < 2; i8++) {
                a(eg0Arr[i8]);
            }
            if (c2915gG0Zzg != null) {
                while (this.f17193q.zze() != c2915gG0Zzg) {
                    this.f17193q.zza();
                }
                this.f17193q.zzn(c2915gG0Zzg);
                c2915gG0Zzg.zzp(1000000000000L);
                b();
            }
        }
        if (c2915gG0Zzg != null) {
            this.f17193q.zzn(c2915gG0Zzg);
            if (!c2915gG0Zzg.zzd) {
                c2915gG0Zzg.zzf = c2915gG0Zzg.zzf.zzb(j8);
            } else if (c2915gG0Zzg.zze) {
                j8 = c2915gG0Zzg.zza.zze(j8);
                c2915gG0Zzg.zza.zzj(j8 - this.f17189m, false);
            }
            o(j8);
            i();
        } else {
            this.f17193q.zzj();
            o(j8);
        }
        e(false);
        this.f17184h.zzi(2);
        return j8;
    }

    private final Pair X(RG rg) {
        long j8 = 0;
        if (rg.zzo()) {
            return Pair.create(C4853xG0.zzh(), 0L);
        }
        Pair pairZzl = rg.zzl(this.f17187k, this.f17188l, rg.zzg(this.f17166E), -9223372036854775807L);
        NM0 nm0Zzi = this.f17193q.zzi(rg, pairZzl.first, 0L);
        long jLongValue = ((Long) pairZzl.second).longValue();
        if (nm0Zzi.zzb()) {
            rg.zzn(nm0Zzi.zza, this.f17188l);
            if (nm0Zzi.zzc == this.f17188l.zze(nm0Zzi.zzb)) {
                this.f17188l.zzj();
            }
        } else {
            j8 = jLongValue;
        }
        return Pair.create(nm0Zzi, Long.valueOf(j8));
    }

    private static Pair Y(RG rg, WF0 wf0, boolean z8, int i8, boolean z9, C4055qG c4055qG, C3711nF c3711nF) {
        Pair pairZzl;
        RG rg2 = wf0.zza;
        if (rg.zzo()) {
            return null;
        }
        RG rg3 = true == rg2.zzo() ? rg : rg2;
        try {
            pairZzl = rg3.zzl(c4055qG, c3711nF, wf0.zzb, wf0.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (rg.equals(rg3)) {
            return pairZzl;
        }
        if (rg.zza(pairZzl.first) != -1) {
            return (rg3.zzn(pairZzl.first, c3711nF).zzg && rg3.zze(c3711nF.zzd, c4055qG, 0L).zzp == rg3.zza(pairZzl.first)) ? rg.zzl(c4055qG, c3711nF, rg.zzn(pairZzl.first, c3711nF).zzd, wf0.zzc) : pairZzl;
        }
        Object objQ = Q(c4055qG, c3711nF, i8, z9, pairZzl.first, rg3, rg);
        if (objQ != null) {
            return rg.zzl(c4055qG, c3711nF, rg.zzn(objQ, c3711nF).zzd, -9223372036854775807L);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.ads.C4853xG0 Z(com.google.android.gms.internal.ads.NM0 r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.XF0.Z(com.google.android.gms.internal.ads.NM0, long, long, long, boolean, int):com.google.android.gms.internal.ads.xG0");
    }

    private final void a(EG0 eg0) {
        if (F(eg0)) {
            this.f17190n.zzd(eg0);
            M(eg0);
            eg0.zzq();
            this.f17168G--;
        }
    }

    private final void b() throws WE0 {
        int length = this.f17177a.length;
        c(new boolean[2], this.f17193q.zzf().zzf());
    }

    private final void c(boolean[] zArr, long j8) throws WE0 {
        C2915gG0 c2915gG0Zzf = this.f17193q.zzf();
        WO0 wo0Zzi = c2915gG0Zzf.zzi();
        int i8 = 0;
        while (true) {
            int length = this.f17177a.length;
            if (i8 >= 2) {
                break;
            }
            if (!wo0Zzi.zzb(i8) && this.f17178b.remove(this.f17177a[i8])) {
                this.f17177a[i8].zzI();
            }
            i8++;
        }
        int i9 = 0;
        while (true) {
            int length2 = this.f17177a.length;
            if (i9 >= 2) {
                c2915gG0Zzf.zzg = true;
                return;
            }
            if (wo0Zzi.zzb(i9)) {
                boolean z8 = zArr[i9];
                EG0 eg0 = this.f17177a[i9];
                if (!F(eg0)) {
                    C3258jG0 c3258jG0 = this.f17193q;
                    C2915gG0 c2915gG0Zzf2 = c3258jG0.zzf();
                    boolean z9 = c2915gG0Zzf2 == c3258jG0.zze();
                    WO0 wo0Zzi2 = c2915gG0Zzf2.zzi();
                    HG0 hg0 = wo0Zzi2.zzb[i9];
                    Q5[] q5ArrK = K(wo0Zzi2.zzc[i9]);
                    boolean z10 = I() && this.f17198v.zze == 3;
                    boolean z11 = !z8 && z10;
                    this.f17168G++;
                    this.f17178b.add(eg0);
                    eg0.zzr(hg0, q5ArrK, c2915gG0Zzf2.zzc[i9], this.f17170I, z11, z9, j8, c2915gG0Zzf2.zze(), c2915gG0Zzf2.zzf.zza);
                    eg0.zzt(11, new SF0(this));
                    this.f17190n.zze(eg0);
                    if (z10 && z9) {
                        eg0.zzO();
                    }
                }
            }
            i9++;
        }
    }

    private final void d(IOException iOException, int i8) {
        C3258jG0 c3258jG0 = this.f17193q;
        WE0 we0Zzc = WE0.zzc(iOException, i8);
        C2915gG0 c2915gG0Zze = c3258jG0.zze();
        if (c2915gG0Zze != null) {
            we0Zzc = we0Zzc.a(c2915gG0Zze.zzf.zza);
        }
        AbstractC2834fc0.zzd("ExoPlayerImplInternal", "Playback error", we0Zzc);
        w(false, false);
        this.f17198v = this.f17198v.zzd(we0Zzc);
    }

    private final void e(boolean z8) {
        C2915gG0 c2915gG0Zzd = this.f17193q.zzd();
        NM0 nm0 = c2915gG0Zzd == null ? this.f17198v.zzb : c2915gG0Zzd.zzf.zza;
        boolean zEquals = this.f17198v.zzk.equals(nm0);
        if (!zEquals) {
            this.f17198v = this.f17198v.zza(nm0);
        }
        C4853xG0 c4853xG0 = this.f17198v;
        c4853xG0.zzp = c2915gG0Zzd == null ? c4853xG0.zzr : c2915gG0Zzd.zzc();
        this.f17198v.zzq = T();
        if ((!zEquals || z8) && c2915gG0Zzd != null && c2915gG0Zzd.zzd) {
            z(c2915gG0Zzd.zzf.zza, c2915gG0Zzd.zzh(), c2915gG0Zzd.zzi());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x041f  */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77, types: [int] */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r21v0, types: [long] */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.google.android.gms.internal.ads.RG] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void f(com.google.android.gms.internal.ads.RG r31, boolean r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.XF0.f(com.google.android.gms.internal.ads.RG, boolean):void");
    }

    private final void g(C2149Yx c2149Yx, boolean z8) {
        h(c2149Yx, c2149Yx.zzc, true, z8);
    }

    private final void h(C2149Yx c2149Yx, float f8, boolean z8, boolean z9) {
        int i8;
        XF0 xf0 = this;
        if (z8) {
            if (z9) {
                xf0.f17199w.zza(1);
            }
            C4853xG0 c4853xG0 = xf0.f17198v;
            xf0 = this;
            xf0.f17198v = new C4853xG0(c4853xG0.zza, c4853xG0.zzb, c4853xG0.zzc, c4853xG0.zzd, c4853xG0.zze, c4853xG0.zzf, c4853xG0.zzg, c4853xG0.zzh, c4853xG0.zzi, c4853xG0.zzj, c4853xG0.zzk, c4853xG0.zzl, c4853xG0.zzm, c2149Yx, c4853xG0.zzp, c4853xG0.zzq, c4853xG0.zzr, c4853xG0.zzs, false);
        }
        float f9 = c2149Yx.zzc;
        C2915gG0 c2915gG0Zze = xf0.f17193q.zze();
        while (true) {
            i8 = 0;
            if (c2915gG0Zze == null) {
                break;
            }
            PO0[] po0Arr = c2915gG0Zze.zzi().zzc;
            int length = po0Arr.length;
            while (i8 < length) {
                PO0 po0 = po0Arr[i8];
                i8++;
            }
            c2915gG0Zze = c2915gG0Zze.zzg();
        }
        EG0[] eg0Arr = xf0.f17177a;
        int length2 = eg0Arr.length;
        while (i8 < 2) {
            EG0 eg0 = eg0Arr[i8];
            if (eg0 != null) {
                eg0.zzM(f8, c2149Yx.zzc);
            }
            i8++;
        }
    }

    private final void i() {
        long jZze;
        long jZze2;
        boolean zZzh = false;
        if (E()) {
            C2915gG0 c2915gG0Zzd = this.f17193q.zzd();
            long jU = U(c2915gG0Zzd.zzd());
            if (c2915gG0Zzd == this.f17193q.zze()) {
                jZze = this.f17170I;
                jZze2 = c2915gG0Zzd.zze();
            } else {
                jZze = this.f17170I - c2915gG0Zzd.zze();
                jZze2 = c2915gG0Zzd.zzf.zzb;
            }
            long j8 = jZze - jZze2;
            boolean zZzh2 = this.f17182f.zzh(this.f17196t, this.f17198v.zza, c2915gG0Zzd.zzf.zza, j8, jU, this.f17190n.zzc().zzc);
            if (zZzh2 || jU >= 500000 || this.f17189m <= 0) {
                zZzh = zZzh2;
            } else {
                this.f17193q.zze().zza.zzj(this.f17198v.zzr, false);
                zZzh = this.f17182f.zzh(this.f17196t, this.f17198v.zza, c2915gG0Zzd.zzf.zza, j8, jU, this.f17190n.zzc().zzc);
            }
        }
        this.f17164C = zZzh;
        if (zZzh) {
            this.f17193q.zzd().zzk(this.f17170I, this.f17190n.zzc().zzc, this.f17163B);
        }
        y();
    }

    private final void j() {
        this.f17199w.zzc(this.f17198v);
        if (this.f17199w.f16822a) {
            C3028hF0 c3028hF0 = this.f17175N;
            c3028hF0.zza.q(this.f17199w);
            this.f17199w = new VF0(this.f17198v);
        }
    }

    private final void k() throws WE0 {
        int i8;
        float f8 = this.f17190n.zzc().zzc;
        C3258jG0 c3258jG0 = this.f17193q;
        C2915gG0 c2915gG0Zze = c3258jG0.zze();
        C2915gG0 c2915gG0Zzf = c3258jG0.zzf();
        WO0 wo0 = null;
        boolean z8 = true;
        while (c2915gG0Zze != null && c2915gG0Zze.zzd) {
            WO0 wo0Zzj = c2915gG0Zze.zzj(f8, this.f17198v.zza);
            WO0 wo02 = c2915gG0Zze == this.f17193q.zze() ? wo0Zzj : wo0;
            WO0 wo0Zzi = c2915gG0Zze.zzi();
            boolean z9 = false;
            if (wo0Zzi != null) {
                if (wo0Zzi.zzc.length == wo0Zzj.zzc.length) {
                    for (int i9 = 0; i9 < wo0Zzj.zzc.length; i9++) {
                        if (wo0Zzj.zza(wo0Zzi, i9)) {
                        }
                    }
                    if (c2915gG0Zze != c2915gG0Zzf) {
                        z9 = true;
                    }
                    z8 &= z9;
                    c2915gG0Zze = c2915gG0Zze.zzg();
                    wo0 = wo02;
                }
            }
            if (z8) {
                C3258jG0 c3258jG02 = this.f17193q;
                C2915gG0 c2915gG0Zze2 = c3258jG02.zze();
                boolean zZzn = c3258jG02.zzn(c2915gG0Zze2);
                int length = this.f17177a.length;
                boolean[] zArr = new boolean[2];
                wo02.getClass();
                long jZzb = c2915gG0Zze2.zzb(wo02, this.f17198v.zzr, zZzn, zArr);
                C4853xG0 c4853xG0 = this.f17198v;
                boolean z10 = (c4853xG0.zze == 4 || jZzb == c4853xG0.zzr) ? false : true;
                C4853xG0 c4853xG02 = this.f17198v;
                i8 = 2;
                this.f17198v = Z(c4853xG02.zzb, jZzb, c4853xG02.zzc, c4853xG02.zzd, z10, 5);
                if (z10) {
                    o(jZzb);
                }
                int length2 = this.f17177a.length;
                boolean[] zArr2 = new boolean[2];
                int i10 = 0;
                while (true) {
                    EG0[] eg0Arr = this.f17177a;
                    int length3 = eg0Arr.length;
                    if (i10 >= 2) {
                        break;
                    }
                    EG0 eg0 = eg0Arr[i10];
                    boolean zF = F(eg0);
                    zArr2[i10] = zF;
                    GN0 gn0 = c2915gG0Zze2.zzc[i10];
                    if (zF) {
                        if (gn0 != eg0.zzo()) {
                            a(eg0);
                        } else if (zArr[i10]) {
                            eg0.zzJ(this.f17170I);
                        }
                    }
                    i10++;
                }
                c(zArr2, this.f17170I);
            } else {
                i8 = 2;
                this.f17193q.zzn(c2915gG0Zze);
                if (c2915gG0Zze.zzd) {
                    c2915gG0Zze.zza(wo0Zzj, Math.max(c2915gG0Zze.zzf.zzb, this.f17170I - c2915gG0Zze.zze()), false);
                }
            }
            e(true);
            if (this.f17198v.zze != 4) {
                i();
                A();
                this.f17184h.zzi(i8);
                return;
            }
            return;
        }
    }

    private final void l() throws WE0 {
        k();
        r(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[PHI: r2 r6 r8
  0x00a6: PHI (r2v2 com.google.android.gms.internal.ads.NM0) = (r2v1 com.google.android.gms.internal.ads.NM0), (r2v11 com.google.android.gms.internal.ads.NM0) binds: [B:30:0x007b, B:32:0x00a0] A[DONT_GENERATE, DONT_INLINE]
  0x00a6: PHI (r6v3 long) = (r6v2 long), (r6v10 long) binds: [B:30:0x007b, B:32:0x00a0] A[DONT_GENERATE, DONT_INLINE]
  0x00a6: PHI (r8v3 long) = (r8v2 long), (r8v6 long) binds: [B:30:0x007b, B:32:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef A[PHI: r0
  0x00ef: PHI (r0v11 com.google.android.gms.internal.ads.RG) = 
  (r0v10 com.google.android.gms.internal.ads.RG)
  (r0v10 com.google.android.gms.internal.ads.RG)
  (r0v15 com.google.android.gms.internal.ads.RG)
  (r0v15 com.google.android.gms.internal.ads.RG)
 binds: [B:36:0x00b3, B:38:0x00b7, B:40:0x00c8, B:42:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m(boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.XF0.m(boolean, boolean, boolean, boolean):void");
    }

    private final void n() {
        C2915gG0 c2915gG0Zze = this.f17193q.zze();
        boolean z8 = false;
        if (c2915gG0Zze != null && c2915gG0Zze.zzf.zzh && this.f17201y) {
            z8 = true;
        }
        this.f17202z = z8;
    }

    private final void o(long j8) {
        C2915gG0 c2915gG0Zze = this.f17193q.zze();
        long jZze = j8 + (c2915gG0Zze == null ? 1000000000000L : c2915gG0Zze.zze());
        this.f17170I = jZze;
        this.f17190n.zzf(jZze);
        EG0[] eg0Arr = this.f17177a;
        int length = eg0Arr.length;
        for (int i8 = 0; i8 < 2; i8++) {
            EG0 eg0 = eg0Arr[i8];
            if (F(eg0)) {
                eg0.zzJ(this.f17170I);
            }
        }
        for (C2915gG0 c2915gG0Zze2 = this.f17193q.zze(); c2915gG0Zze2 != null; c2915gG0Zze2 = c2915gG0Zze2.zzg()) {
            for (PO0 po0 : c2915gG0Zze2.zzi().zzc) {
            }
        }
    }

    private final void p(RG rg, RG rg2) {
        if (rg.zzo() && rg2.zzo()) {
            return;
        }
        int size = this.f17191o.size() - 1;
        if (size < 0) {
            Collections.sort(this.f17191o);
        } else {
            android.support.v4.media.session.f.a(this.f17191o.get(size));
            throw null;
        }
    }

    private final void q(long j8, long j9) {
        this.f17184h.zzj(2, j8 + j9);
    }

    private final void r(boolean z8) throws WE0 {
        NM0 nm0 = this.f17193q.zze().zzf.zza;
        long jW = W(nm0, this.f17198v.zzr, true, false);
        if (jW != this.f17198v.zzr) {
            C4853xG0 c4853xG0 = this.f17198v;
            this.f17198v = Z(nm0, jW, c4853xG0.zzc, c4853xG0.zzd, z8, 5);
        }
    }

    private final void s(C2149Yx c2149Yx) {
        this.f17184h.zzf(16);
        this.f17190n.zzg(c2149Yx);
    }

    private final void t(boolean z8, int i8, boolean z9, int i9) {
        this.f17199w.zza(z9 ? 1 : 0);
        this.f17199w.zzb(i9);
        this.f17198v = this.f17198v.zzc(z8, i8);
        C(false, false);
        for (C2915gG0 c2915gG0Zze = this.f17193q.zze(); c2915gG0Zze != null; c2915gG0Zze = c2915gG0Zze.zzg()) {
            for (PO0 po0 : c2915gG0Zze.zzi().zzc) {
            }
        }
        if (!I()) {
            x();
            A();
            return;
        }
        int i10 = this.f17198v.zze;
        if (i10 != 3) {
            if (i10 == 2) {
                this.f17184h.zzi(2);
            }
        } else {
            C(false, false);
            this.f17190n.zzh();
            v();
            this.f17184h.zzi(2);
        }
    }

    private final void u(int i8) {
        C4853xG0 c4853xG0 = this.f17198v;
        if (c4853xG0.zze != i8) {
            if (i8 != 2) {
                this.f17174M = -9223372036854775807L;
            }
            this.f17198v = c4853xG0.zze(i8);
        }
    }

    private final void v() {
        C2915gG0 c2915gG0Zze = this.f17193q.zze();
        if (c2915gG0Zze == null) {
            return;
        }
        WO0 wo0Zzi = c2915gG0Zze.zzi();
        int i8 = 0;
        while (true) {
            int length = this.f17177a.length;
            if (i8 >= 2) {
                return;
            }
            if (wo0Zzi.zzb(i8) && this.f17177a[i8].zzcU() == 1) {
                this.f17177a[i8].zzO();
            }
            i8++;
        }
    }

    private final void w(boolean z8, boolean z9) {
        m(z8 || !this.f17167F, false, true, false);
        this.f17199w.zza(z9 ? 1 : 0);
        this.f17182f.zze(this.f17196t);
        u(1);
    }

    private final void x() {
        this.f17190n.zzi();
        EG0[] eg0Arr = this.f17177a;
        int length = eg0Arr.length;
        for (int i8 = 0; i8 < 2; i8++) {
            EG0 eg0 = eg0Arr[i8];
            if (F(eg0)) {
                M(eg0);
            }
        }
    }

    private final void y() {
        C2915gG0 c2915gG0Zzd = this.f17193q.zzd();
        boolean z8 = this.f17164C || (c2915gG0Zzd != null && c2915gG0Zzd.zza.zzp());
        C4853xG0 c4853xG0 = this.f17198v;
        if (z8 != c4853xG0.zzg) {
            this.f17198v = new C4853xG0(c4853xG0.zza, c4853xG0.zzb, c4853xG0.zzc, c4853xG0.zzd, c4853xG0.zze, c4853xG0.zzf, z8, c4853xG0.zzh, c4853xG0.zzi, c4853xG0.zzj, c4853xG0.zzk, c4853xG0.zzl, c4853xG0.zzm, c4853xG0.zzn, c4853xG0.zzp, c4853xG0.zzq, c4853xG0.zzr, c4853xG0.zzs, false);
        }
    }

    private final void z(NM0 nm0, SN0 sn0, WO0 wo0) {
        RG rg = this.f17198v.zza;
        PO0[] po0Arr = wo0.zzc;
        this.f17182f.zzf(this.f17196t, rg, nm0, this.f17177a, sn0, po0Arr);
    }

    public static /* synthetic */ C2915gG0 zzd(XF0 xf0, C3030hG0 c3030hG0, long j8) {
        InterfaceC2227aG0 interfaceC2227aG0 = xf0.f17182f;
        VO0 vo0 = xf0.f17180d;
        C2703eP0 c2703eP0Zzj = interfaceC2227aG0.zzj();
        WO0 wo0 = xf0.f17181e;
        return new C2915gG0(xf0.f17179c, j8, vo0, c2703eP0Zzj, xf0.f17194r, c3030hG0, wo0);
    }

    final /* synthetic */ Boolean P() {
        return Boolean.valueOf(this.f17200x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x06f8 A[Catch: RuntimeException -> 0x002e, IOException -> 0x0032, lz0 -> 0x0036, Sv -> 0x003a, ZK0 -> 0x003e, WE0 -> 0x0042, TryCatch #3 {RuntimeException -> 0x002e, blocks: (B:3:0x0006, B:4:0x0011, B:6:0x0015, B:20:0x0046, B:21:0x004a, B:22:0x004e, B:26:0x0055, B:28:0x005e, B:30:0x006c, B:31:0x0073, B:32:0x007d, B:33:0x0090, B:34:0x00a7, B:35:0x00b1, B:36:0x00b2, B:38:0x00c1, B:39:0x00c5, B:40:0x00d6, B:42:0x00e5, B:43:0x0101, B:44:0x0114, B:45:0x011d, B:47:0x012f, B:48:0x013b, B:49:0x014b, B:51:0x0157, B:54:0x0162, B:55:0x0169, B:56:0x0176, B:60:0x017d, B:62:0x0185, B:64:0x0189, B:66:0x018f, B:68:0x0197, B:70:0x019f, B:71:0x01a2, B:73:0x01a7, B:80:0x01b4, B:81:0x01b5, B:85:0x01bc, B:87:0x01ca, B:88:0x01cd, B:89:0x01d2, B:91:0x01e2, B:92:0x01e5, B:93:0x01ea, B:94:0x01ef, B:96:0x01fb, B:97:0x0207, B:99:0x0213, B:101:0x023f, B:102:0x025f, B:111:0x028b, B:113:0x028f, B:114:0x0292, B:121:0x029d, B:133:0x02b1, B:134:0x02b6, B:135:0x02be, B:136:0x02d0, B:138:0x02f7, B:208:0x0415, B:188:0x03db, B:187:0x03d7, B:212:0x0421, B:213:0x042e, B:139:0x0319, B:143:0x032c, B:145:0x033c, B:147:0x0353, B:149:0x035d, B:214:0x042f, B:216:0x0443, B:219:0x044f, B:221:0x045e, B:223:0x046a, B:225:0x047f, B:226:0x0484, B:227:0x0488, B:229:0x048c, B:231:0x0499, B:303:0x05f5, B:305:0x05fd, B:307:0x0605, B:310:0x060a, B:311:0x0616, B:313:0x061c, B:315:0x0624, B:318:0x0634, B:320:0x063a, B:321:0x065a, B:323:0x0660, B:325:0x0665, B:327:0x066a, B:329:0x066e, B:331:0x0674, B:333:0x0678, B:335:0x0680, B:337:0x0686, B:339:0x0690, B:342:0x0696, B:343:0x0699, B:345:0x06a1, B:347:0x06b3, B:349:0x06bc, B:351:0x06c4, B:356:0x06d0, B:358:0x06f8, B:359:0x06fb, B:360:0x0706, B:362:0x070c, B:364:0x0712, B:365:0x0719, B:368:0x0725, B:370:0x0729, B:374:0x0734, B:376:0x073e, B:377:0x0743, B:379:0x074f, B:380:0x0767, B:382:0x076d, B:384:0x0775, B:386:0x077c, B:390:0x0785, B:395:0x0794, B:401:0x07a1, B:403:0x07a7, B:412:0x07b9, B:413:0x07bc, B:415:0x07c6, B:417:0x07cc, B:421:0x07d9, B:423:0x07e1, B:425:0x07e5, B:426:0x07f0, B:428:0x07f6, B:481:0x08f0, B:484:0x08f8, B:486:0x08fd, B:488:0x0905, B:490:0x0913, B:491:0x091a, B:492:0x091e, B:494:0x0924, B:496:0x092d, B:498:0x0933, B:500:0x093e, B:507:0x0962, B:509:0x0968, B:513:0x0971, B:525:0x0991, B:521:0x0984, B:523:0x0988, B:524:0x098e, B:501:0x0945, B:504:0x0953, B:505:0x095a, B:506:0x095b, B:429:0x07fe, B:431:0x0805, B:433:0x0809, B:460:0x0891, B:462:0x089c, B:438:0x0815, B:440:0x0819, B:442:0x082d, B:444:0x083b, B:446:0x0847, B:450:0x0850, B:452:0x085a, B:458:0x0865, B:463:0x08a9, B:465:0x08af, B:467:0x08b3, B:471:0x08bc, B:473:0x08cc, B:475:0x08d4, B:477:0x08de, B:478:0x08e3, B:479:0x08e8, B:480:0x08ed, B:414:0x07bf, B:234:0x04a8, B:236:0x04ae, B:239:0x04b9, B:242:0x04c4, B:244:0x04c9, B:247:0x04d7, B:249:0x04dd, B:250:0x04e5, B:251:0x04e8, B:253:0x04f0, B:255:0x04fe, B:257:0x053a, B:259:0x0544, B:262:0x054f, B:264:0x0557, B:265:0x055a, B:266:0x055d, B:268:0x0563, B:270:0x0572, B:272:0x0578, B:274:0x0584, B:276:0x058e, B:278:0x059f, B:280:0x05a5, B:281:0x05b0, B:282:0x05b5, B:284:0x05bb, B:287:0x05c0, B:289:0x05c6, B:291:0x05ce, B:293:0x05d4, B:295:0x05da, B:299:0x05e8, B:301:0x05ef, B:302:0x05f2, B:230:0x0496, B:527:0x0999, B:531:0x09a0, B:532:0x09a8, B:536:0x09c8, B:122:0x029e, B:124:0x02a2, B:125:0x02a5, B:128:0x02ac, B:132:0x02b0), top: B:593:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x070c A[Catch: RuntimeException -> 0x002e, IOException -> 0x0032, lz0 -> 0x0036, Sv -> 0x003a, ZK0 -> 0x003e, WE0 -> 0x0042, TryCatch #3 {RuntimeException -> 0x002e, blocks: (B:3:0x0006, B:4:0x0011, B:6:0x0015, B:20:0x0046, B:21:0x004a, B:22:0x004e, B:26:0x0055, B:28:0x005e, B:30:0x006c, B:31:0x0073, B:32:0x007d, B:33:0x0090, B:34:0x00a7, B:35:0x00b1, B:36:0x00b2, B:38:0x00c1, B:39:0x00c5, B:40:0x00d6, B:42:0x00e5, B:43:0x0101, B:44:0x0114, B:45:0x011d, B:47:0x012f, B:48:0x013b, B:49:0x014b, B:51:0x0157, B:54:0x0162, B:55:0x0169, B:56:0x0176, B:60:0x017d, B:62:0x0185, B:64:0x0189, B:66:0x018f, B:68:0x0197, B:70:0x019f, B:71:0x01a2, B:73:0x01a7, B:80:0x01b4, B:81:0x01b5, B:85:0x01bc, B:87:0x01ca, B:88:0x01cd, B:89:0x01d2, B:91:0x01e2, B:92:0x01e5, B:93:0x01ea, B:94:0x01ef, B:96:0x01fb, B:97:0x0207, B:99:0x0213, B:101:0x023f, B:102:0x025f, B:111:0x028b, B:113:0x028f, B:114:0x0292, B:121:0x029d, B:133:0x02b1, B:134:0x02b6, B:135:0x02be, B:136:0x02d0, B:138:0x02f7, B:208:0x0415, B:188:0x03db, B:187:0x03d7, B:212:0x0421, B:213:0x042e, B:139:0x0319, B:143:0x032c, B:145:0x033c, B:147:0x0353, B:149:0x035d, B:214:0x042f, B:216:0x0443, B:219:0x044f, B:221:0x045e, B:223:0x046a, B:225:0x047f, B:226:0x0484, B:227:0x0488, B:229:0x048c, B:231:0x0499, B:303:0x05f5, B:305:0x05fd, B:307:0x0605, B:310:0x060a, B:311:0x0616, B:313:0x061c, B:315:0x0624, B:318:0x0634, B:320:0x063a, B:321:0x065a, B:323:0x0660, B:325:0x0665, B:327:0x066a, B:329:0x066e, B:331:0x0674, B:333:0x0678, B:335:0x0680, B:337:0x0686, B:339:0x0690, B:342:0x0696, B:343:0x0699, B:345:0x06a1, B:347:0x06b3, B:349:0x06bc, B:351:0x06c4, B:356:0x06d0, B:358:0x06f8, B:359:0x06fb, B:360:0x0706, B:362:0x070c, B:364:0x0712, B:365:0x0719, B:368:0x0725, B:370:0x0729, B:374:0x0734, B:376:0x073e, B:377:0x0743, B:379:0x074f, B:380:0x0767, B:382:0x076d, B:384:0x0775, B:386:0x077c, B:390:0x0785, B:395:0x0794, B:401:0x07a1, B:403:0x07a7, B:412:0x07b9, B:413:0x07bc, B:415:0x07c6, B:417:0x07cc, B:421:0x07d9, B:423:0x07e1, B:425:0x07e5, B:426:0x07f0, B:428:0x07f6, B:481:0x08f0, B:484:0x08f8, B:486:0x08fd, B:488:0x0905, B:490:0x0913, B:491:0x091a, B:492:0x091e, B:494:0x0924, B:496:0x092d, B:498:0x0933, B:500:0x093e, B:507:0x0962, B:509:0x0968, B:513:0x0971, B:525:0x0991, B:521:0x0984, B:523:0x0988, B:524:0x098e, B:501:0x0945, B:504:0x0953, B:505:0x095a, B:506:0x095b, B:429:0x07fe, B:431:0x0805, B:433:0x0809, B:460:0x0891, B:462:0x089c, B:438:0x0815, B:440:0x0819, B:442:0x082d, B:444:0x083b, B:446:0x0847, B:450:0x0850, B:452:0x085a, B:458:0x0865, B:463:0x08a9, B:465:0x08af, B:467:0x08b3, B:471:0x08bc, B:473:0x08cc, B:475:0x08d4, B:477:0x08de, B:478:0x08e3, B:479:0x08e8, B:480:0x08ed, B:414:0x07bf, B:234:0x04a8, B:236:0x04ae, B:239:0x04b9, B:242:0x04c4, B:244:0x04c9, B:247:0x04d7, B:249:0x04dd, B:250:0x04e5, B:251:0x04e8, B:253:0x04f0, B:255:0x04fe, B:257:0x053a, B:259:0x0544, B:262:0x054f, B:264:0x0557, B:265:0x055a, B:266:0x055d, B:268:0x0563, B:270:0x0572, B:272:0x0578, B:274:0x0584, B:276:0x058e, B:278:0x059f, B:280:0x05a5, B:281:0x05b0, B:282:0x05b5, B:284:0x05bb, B:287:0x05c0, B:289:0x05c6, B:291:0x05ce, B:293:0x05d4, B:295:0x05da, B:299:0x05e8, B:301:0x05ef, B:302:0x05f2, B:230:0x0496, B:527:0x0999, B:531:0x09a0, B:532:0x09a8, B:536:0x09c8, B:122:0x029e, B:124:0x02a2, B:125:0x02a5, B:128:0x02ac, B:132:0x02b0), top: B:593:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x07fe A[Catch: RuntimeException -> 0x002e, IOException -> 0x0032, lz0 -> 0x0036, Sv -> 0x003a, ZK0 -> 0x003e, WE0 -> 0x0042, TryCatch #3 {RuntimeException -> 0x002e, blocks: (B:3:0x0006, B:4:0x0011, B:6:0x0015, B:20:0x0046, B:21:0x004a, B:22:0x004e, B:26:0x0055, B:28:0x005e, B:30:0x006c, B:31:0x0073, B:32:0x007d, B:33:0x0090, B:34:0x00a7, B:35:0x00b1, B:36:0x00b2, B:38:0x00c1, B:39:0x00c5, B:40:0x00d6, B:42:0x00e5, B:43:0x0101, B:44:0x0114, B:45:0x011d, B:47:0x012f, B:48:0x013b, B:49:0x014b, B:51:0x0157, B:54:0x0162, B:55:0x0169, B:56:0x0176, B:60:0x017d, B:62:0x0185, B:64:0x0189, B:66:0x018f, B:68:0x0197, B:70:0x019f, B:71:0x01a2, B:73:0x01a7, B:80:0x01b4, B:81:0x01b5, B:85:0x01bc, B:87:0x01ca, B:88:0x01cd, B:89:0x01d2, B:91:0x01e2, B:92:0x01e5, B:93:0x01ea, B:94:0x01ef, B:96:0x01fb, B:97:0x0207, B:99:0x0213, B:101:0x023f, B:102:0x025f, B:111:0x028b, B:113:0x028f, B:114:0x0292, B:121:0x029d, B:133:0x02b1, B:134:0x02b6, B:135:0x02be, B:136:0x02d0, B:138:0x02f7, B:208:0x0415, B:188:0x03db, B:187:0x03d7, B:212:0x0421, B:213:0x042e, B:139:0x0319, B:143:0x032c, B:145:0x033c, B:147:0x0353, B:149:0x035d, B:214:0x042f, B:216:0x0443, B:219:0x044f, B:221:0x045e, B:223:0x046a, B:225:0x047f, B:226:0x0484, B:227:0x0488, B:229:0x048c, B:231:0x0499, B:303:0x05f5, B:305:0x05fd, B:307:0x0605, B:310:0x060a, B:311:0x0616, B:313:0x061c, B:315:0x0624, B:318:0x0634, B:320:0x063a, B:321:0x065a, B:323:0x0660, B:325:0x0665, B:327:0x066a, B:329:0x066e, B:331:0x0674, B:333:0x0678, B:335:0x0680, B:337:0x0686, B:339:0x0690, B:342:0x0696, B:343:0x0699, B:345:0x06a1, B:347:0x06b3, B:349:0x06bc, B:351:0x06c4, B:356:0x06d0, B:358:0x06f8, B:359:0x06fb, B:360:0x0706, B:362:0x070c, B:364:0x0712, B:365:0x0719, B:368:0x0725, B:370:0x0729, B:374:0x0734, B:376:0x073e, B:377:0x0743, B:379:0x074f, B:380:0x0767, B:382:0x076d, B:384:0x0775, B:386:0x077c, B:390:0x0785, B:395:0x0794, B:401:0x07a1, B:403:0x07a7, B:412:0x07b9, B:413:0x07bc, B:415:0x07c6, B:417:0x07cc, B:421:0x07d9, B:423:0x07e1, B:425:0x07e5, B:426:0x07f0, B:428:0x07f6, B:481:0x08f0, B:484:0x08f8, B:486:0x08fd, B:488:0x0905, B:490:0x0913, B:491:0x091a, B:492:0x091e, B:494:0x0924, B:496:0x092d, B:498:0x0933, B:500:0x093e, B:507:0x0962, B:509:0x0968, B:513:0x0971, B:525:0x0991, B:521:0x0984, B:523:0x0988, B:524:0x098e, B:501:0x0945, B:504:0x0953, B:505:0x095a, B:506:0x095b, B:429:0x07fe, B:431:0x0805, B:433:0x0809, B:460:0x0891, B:462:0x089c, B:438:0x0815, B:440:0x0819, B:442:0x082d, B:444:0x083b, B:446:0x0847, B:450:0x0850, B:452:0x085a, B:458:0x0865, B:463:0x08a9, B:465:0x08af, B:467:0x08b3, B:471:0x08bc, B:473:0x08cc, B:475:0x08d4, B:477:0x08de, B:478:0x08e3, B:479:0x08e8, B:480:0x08ed, B:414:0x07bf, B:234:0x04a8, B:236:0x04ae, B:239:0x04b9, B:242:0x04c4, B:244:0x04c9, B:247:0x04d7, B:249:0x04dd, B:250:0x04e5, B:251:0x04e8, B:253:0x04f0, B:255:0x04fe, B:257:0x053a, B:259:0x0544, B:262:0x054f, B:264:0x0557, B:265:0x055a, B:266:0x055d, B:268:0x0563, B:270:0x0572, B:272:0x0578, B:274:0x0584, B:276:0x058e, B:278:0x059f, B:280:0x05a5, B:281:0x05b0, B:282:0x05b5, B:284:0x05bb, B:287:0x05c0, B:289:0x05c6, B:291:0x05ce, B:293:0x05d4, B:295:0x05da, B:299:0x05e8, B:301:0x05ef, B:302:0x05f2, B:230:0x0496, B:527:0x0999, B:531:0x09a0, B:532:0x09a8, B:536:0x09c8, B:122:0x029e, B:124:0x02a2, B:125:0x02a5, B:128:0x02ac, B:132:0x02b0), top: B:593:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x089c A[Catch: RuntimeException -> 0x002e, IOException -> 0x0032, lz0 -> 0x0036, Sv -> 0x003a, ZK0 -> 0x003e, WE0 -> 0x0042, TryCatch #3 {RuntimeException -> 0x002e, blocks: (B:3:0x0006, B:4:0x0011, B:6:0x0015, B:20:0x0046, B:21:0x004a, B:22:0x004e, B:26:0x0055, B:28:0x005e, B:30:0x006c, B:31:0x0073, B:32:0x007d, B:33:0x0090, B:34:0x00a7, B:35:0x00b1, B:36:0x00b2, B:38:0x00c1, B:39:0x00c5, B:40:0x00d6, B:42:0x00e5, B:43:0x0101, B:44:0x0114, B:45:0x011d, B:47:0x012f, B:48:0x013b, B:49:0x014b, B:51:0x0157, B:54:0x0162, B:55:0x0169, B:56:0x0176, B:60:0x017d, B:62:0x0185, B:64:0x0189, B:66:0x018f, B:68:0x0197, B:70:0x019f, B:71:0x01a2, B:73:0x01a7, B:80:0x01b4, B:81:0x01b5, B:85:0x01bc, B:87:0x01ca, B:88:0x01cd, B:89:0x01d2, B:91:0x01e2, B:92:0x01e5, B:93:0x01ea, B:94:0x01ef, B:96:0x01fb, B:97:0x0207, B:99:0x0213, B:101:0x023f, B:102:0x025f, B:111:0x028b, B:113:0x028f, B:114:0x0292, B:121:0x029d, B:133:0x02b1, B:134:0x02b6, B:135:0x02be, B:136:0x02d0, B:138:0x02f7, B:208:0x0415, B:188:0x03db, B:187:0x03d7, B:212:0x0421, B:213:0x042e, B:139:0x0319, B:143:0x032c, B:145:0x033c, B:147:0x0353, B:149:0x035d, B:214:0x042f, B:216:0x0443, B:219:0x044f, B:221:0x045e, B:223:0x046a, B:225:0x047f, B:226:0x0484, B:227:0x0488, B:229:0x048c, B:231:0x0499, B:303:0x05f5, B:305:0x05fd, B:307:0x0605, B:310:0x060a, B:311:0x0616, B:313:0x061c, B:315:0x0624, B:318:0x0634, B:320:0x063a, B:321:0x065a, B:323:0x0660, B:325:0x0665, B:327:0x066a, B:329:0x066e, B:331:0x0674, B:333:0x0678, B:335:0x0680, B:337:0x0686, B:339:0x0690, B:342:0x0696, B:343:0x0699, B:345:0x06a1, B:347:0x06b3, B:349:0x06bc, B:351:0x06c4, B:356:0x06d0, B:358:0x06f8, B:359:0x06fb, B:360:0x0706, B:362:0x070c, B:364:0x0712, B:365:0x0719, B:368:0x0725, B:370:0x0729, B:374:0x0734, B:376:0x073e, B:377:0x0743, B:379:0x074f, B:380:0x0767, B:382:0x076d, B:384:0x0775, B:386:0x077c, B:390:0x0785, B:395:0x0794, B:401:0x07a1, B:403:0x07a7, B:412:0x07b9, B:413:0x07bc, B:415:0x07c6, B:417:0x07cc, B:421:0x07d9, B:423:0x07e1, B:425:0x07e5, B:426:0x07f0, B:428:0x07f6, B:481:0x08f0, B:484:0x08f8, B:486:0x08fd, B:488:0x0905, B:490:0x0913, B:491:0x091a, B:492:0x091e, B:494:0x0924, B:496:0x092d, B:498:0x0933, B:500:0x093e, B:507:0x0962, B:509:0x0968, B:513:0x0971, B:525:0x0991, B:521:0x0984, B:523:0x0988, B:524:0x098e, B:501:0x0945, B:504:0x0953, B:505:0x095a, B:506:0x095b, B:429:0x07fe, B:431:0x0805, B:433:0x0809, B:460:0x0891, B:462:0x089c, B:438:0x0815, B:440:0x0819, B:442:0x082d, B:444:0x083b, B:446:0x0847, B:450:0x0850, B:452:0x085a, B:458:0x0865, B:463:0x08a9, B:465:0x08af, B:467:0x08b3, B:471:0x08bc, B:473:0x08cc, B:475:0x08d4, B:477:0x08de, B:478:0x08e3, B:479:0x08e8, B:480:0x08ed, B:414:0x07bf, B:234:0x04a8, B:236:0x04ae, B:239:0x04b9, B:242:0x04c4, B:244:0x04c9, B:247:0x04d7, B:249:0x04dd, B:250:0x04e5, B:251:0x04e8, B:253:0x04f0, B:255:0x04fe, B:257:0x053a, B:259:0x0544, B:262:0x054f, B:264:0x0557, B:265:0x055a, B:266:0x055d, B:268:0x0563, B:270:0x0572, B:272:0x0578, B:274:0x0584, B:276:0x058e, B:278:0x059f, B:280:0x05a5, B:281:0x05b0, B:282:0x05b5, B:284:0x05bb, B:287:0x05c0, B:289:0x05c6, B:291:0x05ce, B:293:0x05d4, B:295:0x05da, B:299:0x05e8, B:301:0x05ef, B:302:0x05f2, B:230:0x0496, B:527:0x0999, B:531:0x09a0, B:532:0x09a8, B:536:0x09c8, B:122:0x029e, B:124:0x02a2, B:125:0x02a5, B:128:0x02ac, B:132:0x02b0), top: B:593:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x08af A[Catch: RuntimeException -> 0x002e, IOException -> 0x0032, lz0 -> 0x0036, Sv -> 0x003a, ZK0 -> 0x003e, WE0 -> 0x0042, TryCatch #3 {RuntimeException -> 0x002e, blocks: (B:3:0x0006, B:4:0x0011, B:6:0x0015, B:20:0x0046, B:21:0x004a, B:22:0x004e, B:26:0x0055, B:28:0x005e, B:30:0x006c, B:31:0x0073, B:32:0x007d, B:33:0x0090, B:34:0x00a7, B:35:0x00b1, B:36:0x00b2, B:38:0x00c1, B:39:0x00c5, B:40:0x00d6, B:42:0x00e5, B:43:0x0101, B:44:0x0114, B:45:0x011d, B:47:0x012f, B:48:0x013b, B:49:0x014b, B:51:0x0157, B:54:0x0162, B:55:0x0169, B:56:0x0176, B:60:0x017d, B:62:0x0185, B:64:0x0189, B:66:0x018f, B:68:0x0197, B:70:0x019f, B:71:0x01a2, B:73:0x01a7, B:80:0x01b4, B:81:0x01b5, B:85:0x01bc, B:87:0x01ca, B:88:0x01cd, B:89:0x01d2, B:91:0x01e2, B:92:0x01e5, B:93:0x01ea, B:94:0x01ef, B:96:0x01fb, B:97:0x0207, B:99:0x0213, B:101:0x023f, B:102:0x025f, B:111:0x028b, B:113:0x028f, B:114:0x0292, B:121:0x029d, B:133:0x02b1, B:134:0x02b6, B:135:0x02be, B:136:0x02d0, B:138:0x02f7, B:208:0x0415, B:188:0x03db, B:187:0x03d7, B:212:0x0421, B:213:0x042e, B:139:0x0319, B:143:0x032c, B:145:0x033c, B:147:0x0353, B:149:0x035d, B:214:0x042f, B:216:0x0443, B:219:0x044f, B:221:0x045e, B:223:0x046a, B:225:0x047f, B:226:0x0484, B:227:0x0488, B:229:0x048c, B:231:0x0499, B:303:0x05f5, B:305:0x05fd, B:307:0x0605, B:310:0x060a, B:311:0x0616, B:313:0x061c, B:315:0x0624, B:318:0x0634, B:320:0x063a, B:321:0x065a, B:323:0x0660, B:325:0x0665, B:327:0x066a, B:329:0x066e, B:331:0x0674, B:333:0x0678, B:335:0x0680, B:337:0x0686, B:339:0x0690, B:342:0x0696, B:343:0x0699, B:345:0x06a1, B:347:0x06b3, B:349:0x06bc, B:351:0x06c4, B:356:0x06d0, B:358:0x06f8, B:359:0x06fb, B:360:0x0706, B:362:0x070c, B:364:0x0712, B:365:0x0719, B:368:0x0725, B:370:0x0729, B:374:0x0734, B:376:0x073e, B:377:0x0743, B:379:0x074f, B:380:0x0767, B:382:0x076d, B:384:0x0775, B:386:0x077c, B:390:0x0785, B:395:0x0794, B:401:0x07a1, B:403:0x07a7, B:412:0x07b9, B:413:0x07bc, B:415:0x07c6, B:417:0x07cc, B:421:0x07d9, B:423:0x07e1, B:425:0x07e5, B:426:0x07f0, B:428:0x07f6, B:481:0x08f0, B:484:0x08f8, B:486:0x08fd, B:488:0x0905, B:490:0x0913, B:491:0x091a, B:492:0x091e, B:494:0x0924, B:496:0x092d, B:498:0x0933, B:500:0x093e, B:507:0x0962, B:509:0x0968, B:513:0x0971, B:525:0x0991, B:521:0x0984, B:523:0x0988, B:524:0x098e, B:501:0x0945, B:504:0x0953, B:505:0x095a, B:506:0x095b, B:429:0x07fe, B:431:0x0805, B:433:0x0809, B:460:0x0891, B:462:0x089c, B:438:0x0815, B:440:0x0819, B:442:0x082d, B:444:0x083b, B:446:0x0847, B:450:0x0850, B:452:0x085a, B:458:0x0865, B:463:0x08a9, B:465:0x08af, B:467:0x08b3, B:471:0x08bc, B:473:0x08cc, B:475:0x08d4, B:477:0x08de, B:478:0x08e3, B:479:0x08e8, B:480:0x08ed, B:414:0x07bf, B:234:0x04a8, B:236:0x04ae, B:239:0x04b9, B:242:0x04c4, B:244:0x04c9, B:247:0x04d7, B:249:0x04dd, B:250:0x04e5, B:251:0x04e8, B:253:0x04f0, B:255:0x04fe, B:257:0x053a, B:259:0x0544, B:262:0x054f, B:264:0x0557, B:265:0x055a, B:266:0x055d, B:268:0x0563, B:270:0x0572, B:272:0x0578, B:274:0x0584, B:276:0x058e, B:278:0x059f, B:280:0x05a5, B:281:0x05b0, B:282:0x05b5, B:284:0x05bb, B:287:0x05c0, B:289:0x05c6, B:291:0x05ce, B:293:0x05d4, B:295:0x05da, B:299:0x05e8, B:301:0x05ef, B:302:0x05f2, B:230:0x0496, B:527:0x0999, B:531:0x09a0, B:532:0x09a8, B:536:0x09c8, B:122:0x029e, B:124:0x02a2, B:125:0x02a5, B:128:0x02ac, B:132:0x02b0), top: B:593:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x08cc A[Catch: RuntimeException -> 0x002e, IOException -> 0x0032, lz0 -> 0x0036, Sv -> 0x003a, ZK0 -> 0x003e, WE0 -> 0x0042, TryCatch #3 {RuntimeException -> 0x002e, blocks: (B:3:0x0006, B:4:0x0011, B:6:0x0015, B:20:0x0046, B:21:0x004a, B:22:0x004e, B:26:0x0055, B:28:0x005e, B:30:0x006c, B:31:0x0073, B:32:0x007d, B:33:0x0090, B:34:0x00a7, B:35:0x00b1, B:36:0x00b2, B:38:0x00c1, B:39:0x00c5, B:40:0x00d6, B:42:0x00e5, B:43:0x0101, B:44:0x0114, B:45:0x011d, B:47:0x012f, B:48:0x013b, B:49:0x014b, B:51:0x0157, B:54:0x0162, B:55:0x0169, B:56:0x0176, B:60:0x017d, B:62:0x0185, B:64:0x0189, B:66:0x018f, B:68:0x0197, B:70:0x019f, B:71:0x01a2, B:73:0x01a7, B:80:0x01b4, B:81:0x01b5, B:85:0x01bc, B:87:0x01ca, B:88:0x01cd, B:89:0x01d2, B:91:0x01e2, B:92:0x01e5, B:93:0x01ea, B:94:0x01ef, B:96:0x01fb, B:97:0x0207, B:99:0x0213, B:101:0x023f, B:102:0x025f, B:111:0x028b, B:113:0x028f, B:114:0x0292, B:121:0x029d, B:133:0x02b1, B:134:0x02b6, B:135:0x02be, B:136:0x02d0, B:138:0x02f7, B:208:0x0415, B:188:0x03db, B:187:0x03d7, B:212:0x0421, B:213:0x042e, B:139:0x0319, B:143:0x032c, B:145:0x033c, B:147:0x0353, B:149:0x035d, B:214:0x042f, B:216:0x0443, B:219:0x044f, B:221:0x045e, B:223:0x046a, B:225:0x047f, B:226:0x0484, B:227:0x0488, B:229:0x048c, B:231:0x0499, B:303:0x05f5, B:305:0x05fd, B:307:0x0605, B:310:0x060a, B:311:0x0616, B:313:0x061c, B:315:0x0624, B:318:0x0634, B:320:0x063a, B:321:0x065a, B:323:0x0660, B:325:0x0665, B:327:0x066a, B:329:0x066e, B:331:0x0674, B:333:0x0678, B:335:0x0680, B:337:0x0686, B:339:0x0690, B:342:0x0696, B:343:0x0699, B:345:0x06a1, B:347:0x06b3, B:349:0x06bc, B:351:0x06c4, B:356:0x06d0, B:358:0x06f8, B:359:0x06fb, B:360:0x0706, B:362:0x070c, B:364:0x0712, B:365:0x0719, B:368:0x0725, B:370:0x0729, B:374:0x0734, B:376:0x073e, B:377:0x0743, B:379:0x074f, B:380:0x0767, B:382:0x076d, B:384:0x0775, B:386:0x077c, B:390:0x0785, B:395:0x0794, B:401:0x07a1, B:403:0x07a7, B:412:0x07b9, B:413:0x07bc, B:415:0x07c6, B:417:0x07cc, B:421:0x07d9, B:423:0x07e1, B:425:0x07e5, B:426:0x07f0, B:428:0x07f6, B:481:0x08f0, B:484:0x08f8, B:486:0x08fd, B:488:0x0905, B:490:0x0913, B:491:0x091a, B:492:0x091e, B:494:0x0924, B:496:0x092d, B:498:0x0933, B:500:0x093e, B:507:0x0962, B:509:0x0968, B:513:0x0971, B:525:0x0991, B:521:0x0984, B:523:0x0988, B:524:0x098e, B:501:0x0945, B:504:0x0953, B:505:0x095a, B:506:0x095b, B:429:0x07fe, B:431:0x0805, B:433:0x0809, B:460:0x0891, B:462:0x089c, B:438:0x0815, B:440:0x0819, B:442:0x082d, B:444:0x083b, B:446:0x0847, B:450:0x0850, B:452:0x085a, B:458:0x0865, B:463:0x08a9, B:465:0x08af, B:467:0x08b3, B:471:0x08bc, B:473:0x08cc, B:475:0x08d4, B:477:0x08de, B:478:0x08e3, B:479:0x08e8, B:480:0x08ed, B:414:0x07bf, B:234:0x04a8, B:236:0x04ae, B:239:0x04b9, B:242:0x04c4, B:244:0x04c9, B:247:0x04d7, B:249:0x04dd, B:250:0x04e5, B:251:0x04e8, B:253:0x04f0, B:255:0x04fe, B:257:0x053a, B:259:0x0544, B:262:0x054f, B:264:0x0557, B:265:0x055a, B:266:0x055d, B:268:0x0563, B:270:0x0572, B:272:0x0578, B:274:0x0584, B:276:0x058e, B:278:0x059f, B:280:0x05a5, B:281:0x05b0, B:282:0x05b5, B:284:0x05bb, B:287:0x05c0, B:289:0x05c6, B:291:0x05ce, B:293:0x05d4, B:295:0x05da, B:299:0x05e8, B:301:0x05ef, B:302:0x05f2, B:230:0x0496, B:527:0x0999, B:531:0x09a0, B:532:0x09a8, B:536:0x09c8, B:122:0x029e, B:124:0x02a2, B:125:0x02a5, B:128:0x02ac, B:132:0x02b0), top: B:593:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:483:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x095b A[Catch: RuntimeException -> 0x002e, IOException -> 0x0032, lz0 -> 0x0036, Sv -> 0x003a, ZK0 -> 0x003e, WE0 -> 0x0042, TryCatch #3 {RuntimeException -> 0x002e, blocks: (B:3:0x0006, B:4:0x0011, B:6:0x0015, B:20:0x0046, B:21:0x004a, B:22:0x004e, B:26:0x0055, B:28:0x005e, B:30:0x006c, B:31:0x0073, B:32:0x007d, B:33:0x0090, B:34:0x00a7, B:35:0x00b1, B:36:0x00b2, B:38:0x00c1, B:39:0x00c5, B:40:0x00d6, B:42:0x00e5, B:43:0x0101, B:44:0x0114, B:45:0x011d, B:47:0x012f, B:48:0x013b, B:49:0x014b, B:51:0x0157, B:54:0x0162, B:55:0x0169, B:56:0x0176, B:60:0x017d, B:62:0x0185, B:64:0x0189, B:66:0x018f, B:68:0x0197, B:70:0x019f, B:71:0x01a2, B:73:0x01a7, B:80:0x01b4, B:81:0x01b5, B:85:0x01bc, B:87:0x01ca, B:88:0x01cd, B:89:0x01d2, B:91:0x01e2, B:92:0x01e5, B:93:0x01ea, B:94:0x01ef, B:96:0x01fb, B:97:0x0207, B:99:0x0213, B:101:0x023f, B:102:0x025f, B:111:0x028b, B:113:0x028f, B:114:0x0292, B:121:0x029d, B:133:0x02b1, B:134:0x02b6, B:135:0x02be, B:136:0x02d0, B:138:0x02f7, B:208:0x0415, B:188:0x03db, B:187:0x03d7, B:212:0x0421, B:213:0x042e, B:139:0x0319, B:143:0x032c, B:145:0x033c, B:147:0x0353, B:149:0x035d, B:214:0x042f, B:216:0x0443, B:219:0x044f, B:221:0x045e, B:223:0x046a, B:225:0x047f, B:226:0x0484, B:227:0x0488, B:229:0x048c, B:231:0x0499, B:303:0x05f5, B:305:0x05fd, B:307:0x0605, B:310:0x060a, B:311:0x0616, B:313:0x061c, B:315:0x0624, B:318:0x0634, B:320:0x063a, B:321:0x065a, B:323:0x0660, B:325:0x0665, B:327:0x066a, B:329:0x066e, B:331:0x0674, B:333:0x0678, B:335:0x0680, B:337:0x0686, B:339:0x0690, B:342:0x0696, B:343:0x0699, B:345:0x06a1, B:347:0x06b3, B:349:0x06bc, B:351:0x06c4, B:356:0x06d0, B:358:0x06f8, B:359:0x06fb, B:360:0x0706, B:362:0x070c, B:364:0x0712, B:365:0x0719, B:368:0x0725, B:370:0x0729, B:374:0x0734, B:376:0x073e, B:377:0x0743, B:379:0x074f, B:380:0x0767, B:382:0x076d, B:384:0x0775, B:386:0x077c, B:390:0x0785, B:395:0x0794, B:401:0x07a1, B:403:0x07a7, B:412:0x07b9, B:413:0x07bc, B:415:0x07c6, B:417:0x07cc, B:421:0x07d9, B:423:0x07e1, B:425:0x07e5, B:426:0x07f0, B:428:0x07f6, B:481:0x08f0, B:484:0x08f8, B:486:0x08fd, B:488:0x0905, B:490:0x0913, B:491:0x091a, B:492:0x091e, B:494:0x0924, B:496:0x092d, B:498:0x0933, B:500:0x093e, B:507:0x0962, B:509:0x0968, B:513:0x0971, B:525:0x0991, B:521:0x0984, B:523:0x0988, B:524:0x098e, B:501:0x0945, B:504:0x0953, B:505:0x095a, B:506:0x095b, B:429:0x07fe, B:431:0x0805, B:433:0x0809, B:460:0x0891, B:462:0x089c, B:438:0x0815, B:440:0x0819, B:442:0x082d, B:444:0x083b, B:446:0x0847, B:450:0x0850, B:452:0x085a, B:458:0x0865, B:463:0x08a9, B:465:0x08af, B:467:0x08b3, B:471:0x08bc, B:473:0x08cc, B:475:0x08d4, B:477:0x08de, B:478:0x08e3, B:479:0x08e8, B:480:0x08ed, B:414:0x07bf, B:234:0x04a8, B:236:0x04ae, B:239:0x04b9, B:242:0x04c4, B:244:0x04c9, B:247:0x04d7, B:249:0x04dd, B:250:0x04e5, B:251:0x04e8, B:253:0x04f0, B:255:0x04fe, B:257:0x053a, B:259:0x0544, B:262:0x054f, B:264:0x0557, B:265:0x055a, B:266:0x055d, B:268:0x0563, B:270:0x0572, B:272:0x0578, B:274:0x0584, B:276:0x058e, B:278:0x059f, B:280:0x05a5, B:281:0x05b0, B:282:0x05b5, B:284:0x05bb, B:287:0x05c0, B:289:0x05c6, B:291:0x05ce, B:293:0x05d4, B:295:0x05da, B:299:0x05e8, B:301:0x05ef, B:302:0x05f2, B:230:0x0496, B:527:0x0999, B:531:0x09a0, B:532:0x09a8, B:536:0x09c8, B:122:0x029e, B:124:0x02a2, B:125:0x02a5, B:128:0x02ac, B:132:0x02b0), top: B:593:0x0006 }] */
    /* JADX WARN: Type inference failed for: r2v43, types: [com.google.android.gms.internal.ads.dP0, com.google.android.gms.internal.ads.sE0] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.XF0.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.TE0
    public final void zza(C2149Yx c2149Yx) {
        this.f17184h.zzc(16, c2149Yx).zza();
    }

    public final Looper zzb() {
        return this.f17186j;
    }

    @Override // com.google.android.gms.internal.ads.KM0, com.google.android.gms.internal.ads.HN0
    public final /* bridge */ /* synthetic */ void zzg(IN0 in0) {
        this.f17184h.zzc(9, (LM0) in0).zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4625vG0
    public final void zzh() {
        this.f17184h.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void zzi(LM0 lm0) {
        this.f17184h.zzc(8, lm0).zza();
    }

    @Override // com.google.android.gms.internal.ads.UO0
    public final void zzj() {
        this.f17184h.zzi(10);
    }

    public final void zzk() {
        this.f17184h.zzb(0).zza();
    }

    public final void zzl(RG rg, int i8, long j8) {
        this.f17184h.zzc(3, new WF0(rg, i8, j8)).zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4967yG0
    public final synchronized void zzm(AG0 ag0) {
        if (!this.f17200x && this.f17186j.getThread().isAlive()) {
            this.f17184h.zzc(14, ag0).zza();
            return;
        }
        AbstractC2834fc0.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        ag0.zzh(false);
    }

    public final void zzn(boolean z8, int i8) {
        this.f17184h.zzd(1, z8 ? 1 : 0, i8).zza();
    }

    public final void zzo() {
        this.f17184h.zzb(6).zza();
    }

    public final synchronized boolean zzp() {
        if (!this.f17200x && this.f17186j.getThread().isAlive()) {
            this.f17184h.zzi(7);
            D(new OF0(this), this.f17195s);
            return this.f17200x;
        }
        return true;
    }

    public final void zzq(List list, int i8, long j8, JN0 jn0) {
        this.f17184h.zzc(17, new UF0(list, jn0, i8, j8, null)).zza();
    }
}
