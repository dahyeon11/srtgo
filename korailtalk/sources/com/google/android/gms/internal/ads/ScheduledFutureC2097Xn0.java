package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Xn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class ScheduledFutureC2097Xn0 extends AbstractC1237Cn0 implements ScheduledFuture, com.google.common.util.concurrent.C {

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledFuture f17292b;

    public ScheduledFutureC2097Xn0(com.google.common.util.concurrent.C c9, ScheduledFuture scheduledFuture) {
        super(c9);
        this.f17292b = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.AbstractFutureC1196Bn0, java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        boolean zCancel = b().cancel(z8);
        if (zCancel) {
            this.f17292b.cancel(z8);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f17292b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f17292b.getDelay(timeUnit);
    }
}
