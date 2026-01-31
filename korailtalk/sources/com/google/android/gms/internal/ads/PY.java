package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class PY {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f15346a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f15347b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2335bD f15348c;

    /* renamed from: d, reason: collision with root package name */
    private final C2943gZ f15349d;

    /* renamed from: e, reason: collision with root package name */
    private final C3409ke0 f15350e;

    /* renamed from: f, reason: collision with root package name */
    private final C2514co0 f15351f = C2514co0.zze();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f15352g = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private QY f15353h;

    /* renamed from: i, reason: collision with root package name */
    private C1457Ia0 f15354i;

    PY(Executor executor, ScheduledExecutorService scheduledExecutorService, InterfaceC2335bD interfaceC2335bD, C2943gZ c2943gZ, C3409ke0 c3409ke0) {
        this.f15346a = executor;
        this.f15347b = scheduledExecutorService;
        this.f15348c = interfaceC2335bD;
        this.f15349d = c2943gZ;
        this.f15350e = c3409ke0;
    }

    private final synchronized com.google.common.util.concurrent.C c(C4654va0 c4654va0) {
        Iterator it = c4654va0.zza.iterator();
        while (it.hasNext()) {
            InterfaceC3171iX interfaceC3171iXZza = this.f15348c.zza(c4654va0.zzb, (String) it.next());
            if (interfaceC3171iXZza != null && interfaceC3171iXZza.zzb(this.f15354i, c4654va0)) {
                return AbstractC1483In0.zzo(interfaceC3171iXZza.zza(this.f15354i, c4654va0), c4654va0.zzS, TimeUnit.MILLISECONDS, this.f15347b);
            }
        }
        return AbstractC1483In0.zzg(new RS(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(C4654va0 c4654va0) {
        com.google.common.util.concurrent.C c9 = c(c4654va0);
        this.f15349d.e(this.f15354i, c4654va0, c9, this.f15350e);
        AbstractC1483In0.zzr(c9, new OY(this, c4654va0), this.f15346a);
    }

    public final synchronized com.google.common.util.concurrent.C zzb(C1457Ia0 c1457Ia0) {
        try {
            if (!this.f15352g.getAndSet(true)) {
                if (c1457Ia0.zzb.zza.isEmpty()) {
                    this.f15351f.zzd(new C3399kZ(3, C3741nZ.b(c1457Ia0)));
                } else {
                    this.f15354i = c1457Ia0;
                    this.f15353h = new QY(c1457Ia0, this.f15349d, this.f15351f);
                    this.f15349d.zzk(c1457Ia0.zzb.zza);
                    C4654va0 c4654va0A = this.f15353h.a();
                    while (c4654va0A != null) {
                        d(c4654va0A);
                        c4654va0A = this.f15353h.a();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f15351f;
    }
}
