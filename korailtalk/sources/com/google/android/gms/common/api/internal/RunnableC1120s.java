package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC1120s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C f12091a;

    RunnableC1120s(C c9) {
        this.f12091a = c9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C c9 = this.f12091a;
        c9.f11875d.cancelAvailabilityErrorNotifications(c9.f11874c);
    }
}
