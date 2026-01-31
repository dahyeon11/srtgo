package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Qx */
/* loaded from: classes2.dex */
final class C1821Qx extends D60 {

    /* renamed from: a */
    private final C3696n70 f16027a;

    /* renamed from: b */
    private final C2190Zx f16028b;

    /* renamed from: c */
    private final C1821Qx f16029c = this;

    /* renamed from: d */
    private final PD0 f16030d;

    /* renamed from: e */
    private final PD0 f16031e;

    /* renamed from: f */
    private final PD0 f16032f;

    /* renamed from: g */
    private final PD0 f16033g;

    /* renamed from: h */
    private final PD0 f16034h;

    /* renamed from: i */
    private final PD0 f16035i;

    /* renamed from: j */
    private final PD0 f16036j;

    /* renamed from: k */
    private final PD0 f16037k;

    /* renamed from: l */
    private final PD0 f16038l;

    /* renamed from: m */
    private final PD0 f16039m;

    /* renamed from: n */
    private final PD0 f16040n;

    /* synthetic */ C1821Qx(C2190Zx c2190Zx, C3696n70 c3696n70, AbstractC1780Px abstractC1780Px) {
        this.f16028b = c2190Zx;
        this.f16027a = c3696n70;
        C3924p70 c3924p70 = new C3924p70(c3696n70);
        this.f16030d = c3924p70;
        PD0 pd0Zzc = FD0.zzc(C2704eQ.zza());
        this.f16031e = pd0Zzc;
        PD0 pd0Zzc2 = FD0.zzc(C2475cQ.zza());
        this.f16032f = pd0Zzc2;
        PD0 pd0Zzc3 = FD0.zzc(C2934gQ.zza());
        this.f16033g = pd0Zzc3;
        PD0 pd0Zzc4 = FD0.zzc(C3276jQ.zza());
        this.f16034h = pd0Zzc4;
        JD0 jd0Zzc = KD0.zzc(4);
        jd0Zzc.zzb(EnumC1952Uc0.GMS_SIGNALS, pd0Zzc);
        jd0Zzc.zzb(EnumC1952Uc0.BUILD_URL, pd0Zzc2);
        jd0Zzc.zzb(EnumC1952Uc0.HTTP, pd0Zzc3);
        jd0Zzc.zzb(EnumC1952Uc0.PRE_PROCESS, pd0Zzc4);
        KD0 kd0Zzc = jd0Zzc.zzc();
        this.f16035i = kd0Zzc;
        PD0 pd0Zzc5 = FD0.zzc(new C3390kQ(c3924p70, c2190Zx.f17688i, C4544uc0.zza(), kd0Zzc));
        this.f16036j = pd0Zzc5;
        UD0 ud0Zza = VD0.zza(0, 1);
        ud0Zza.zza(pd0Zzc5);
        VD0 vd0Zzc = ud0Zza.zzc();
        this.f16037k = vd0Zzc;
        C2607dd0 c2607dd0 = new C2607dd0(vd0Zzc);
        this.f16038l = c2607dd0;
        this.f16039m = FD0.zzc(new C2492cd0(C4544uc0.zza(), c2190Zx.f17682f, c2607dd0));
        this.f16040n = FD0.zzc(new C4774wd0(c2190Zx.f17637A));
    }

    @Override // com.google.android.gms.internal.ads.D60
    public final Q50 zza() {
        Context contextB = this.f16028b.f17674b.b();
        OD0.zzb(contextB);
        C2185Zs c2185Zs = new C2185Zs();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        C3012h70 c3012h70 = new C3012h70(c2185Zs, interfaceExecutorServiceC1974Un0, AbstractC3810o70.zza(this.f16027a));
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f16028b.f17682f.zzb();
        RunnableC4660vd0 runnableC4660vd0 = (RunnableC4660vd0) this.f16040n.zzb();
        LQ lq = (LQ) this.f16028b.f17660N.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new R40(c3012h70, 0L, scheduledExecutorService));
        return new Q50(contextB, interfaceExecutorServiceC1974Un0, hashSet, runnableC4660vd0, lq);
    }

    @Override // com.google.android.gms.internal.ads.D60
    public final C2263ad0 zzb() {
        return (C2263ad0) this.f16039m.zzb();
    }
}
