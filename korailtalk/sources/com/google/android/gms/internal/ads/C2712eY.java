package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.eY, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2712eY implements InterfaceC3171iX {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3819oC f18774a;

    /* renamed from: b, reason: collision with root package name */
    private final KX f18775b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f18776c;

    /* renamed from: d, reason: collision with root package name */
    private final BF f18777d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f18778e;

    /* renamed from: f, reason: collision with root package name */
    private final FQ f18779f;

    public C2712eY(AbstractC3819oC abstractC3819oC, KX kx, BF bf, ScheduledExecutorService scheduledExecutorService, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, FQ fq) {
        this.f18774a = abstractC3819oC;
        this.f18775b = kx;
        this.f18777d = bf;
        this.f18778e = scheduledExecutorService;
        this.f18776c = interfaceExecutorServiceC1974Un0;
        this.f18779f = fq;
    }

    final /* synthetic */ MB a(final C1457Ia0 c1457Ia0, final C4654va0 c4654va0) {
        return this.f18774a.zzb(new C3935pD(c1457Ia0, c4654va0, null), new FC(c1457Ia0.zza.zza.zza(), new Runnable() { // from class: com.google.android.gms.internal.ads.bY
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.d(c1457Ia0, c4654va0);
            }
        })).zza();
    }

    final /* synthetic */ void d(C1457Ia0 c1457Ia0, C4654va0 c4654va0) {
        AbstractC1483In0.zzr(AbstractC1483In0.zzo(this.f18775b.zza(c1457Ia0, c4654va0), c4654va0.zzS, TimeUnit.SECONDS, this.f18778e), new C2598dY(this), this.f18776c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final com.google.common.util.concurrent.C zza(final C1457Ia0 c1457Ia0, final C4654va0 c4654va0) {
        return this.f18776c.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.cY
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a(c1457Ia0, c4654va0);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final boolean zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0) {
        InterfaceC2006Vj interfaceC2006VjZza = c1457Ia0.zza.zza.zza();
        boolean zZzb = this.f18775b.zzb(c1457Ia0, c4654va0);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlV)).booleanValue()) {
            this.f18779f.zzb().put("has_dbl", interfaceC2006VjZza != null ? "1" : "0");
            this.f18779f.zzb().put("crdb", true == zZzb ? "1" : "0");
        }
        return interfaceC2006VjZza != null && zZzb;
    }
}
