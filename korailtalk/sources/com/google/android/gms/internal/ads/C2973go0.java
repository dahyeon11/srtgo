package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.go0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2973go0 extends AbstractC5022yn0 {

    /* renamed from: h, reason: collision with root package name */
    private com.google.common.util.concurrent.C f19403h;

    /* renamed from: i, reason: collision with root package name */
    private ScheduledFuture f19404i;

    private C2973go0(com.google.common.util.concurrent.C c9) {
        c9.getClass();
        this.f19403h = c9;
    }

    static com.google.common.util.concurrent.C z(com.google.common.util.concurrent.C c9, long j8, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        C2973go0 c2973go0 = new C2973go0(c9);
        RunnableC2628do0 runnableC2628do0 = new RunnableC2628do0(c2973go0);
        c2973go0.f19404i = scheduledExecutorService.schedule(runnableC2628do0, j8, timeUnit);
        c9.addListener(runnableC2628do0, EnumC4794wn0.INSTANCE);
        return c2973go0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0
    protected final void c() {
        p(this.f19403h);
        ScheduledFuture scheduledFuture = this.f19404i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f19403h = null;
        this.f19404i = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1972Um0
    protected final String zza() {
        com.google.common.util.concurrent.C c9 = this.f19403h;
        ScheduledFuture scheduledFuture = this.f19404i;
        if (c9 == null) {
            return null;
        }
        String str = "inputFuture=[" + c9.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }
}
