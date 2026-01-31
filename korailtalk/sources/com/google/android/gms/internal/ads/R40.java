package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class R40 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final N50 f16050a;

    /* renamed from: b, reason: collision with root package name */
    private final long f16051b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f16052c;

    public R40(N50 n50, long j8, ScheduledExecutorService scheduledExecutorService) {
        this.f16050a = n50;
        this.f16051b = j8;
        this.f16052c = scheduledExecutorService;
    }

    final /* synthetic */ com.google.common.util.concurrent.C a(Throwable th) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzch)).booleanValue()) {
            N50 n50 = this.f16050a;
            G1.u.zzo().zzw(th, "OptionalSignalTimeout:" + n50.zza());
        }
        return AbstractC1483In0.zzh(null);
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return this.f16050a.zza();
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        com.google.common.util.concurrent.C cZzb = this.f16050a.zzb();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzci)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j8 = this.f16051b;
        if (j8 > 0) {
            cZzb = AbstractC1483In0.zzo(cZzb, j8, timeUnit, this.f16052c);
        }
        return AbstractC1483In0.zzf(cZzb, Throwable.class, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.Q40
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.a((Throwable) obj);
            }
        }, AbstractC4805wt.zzf);
    }
}
