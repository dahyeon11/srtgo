package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2984gu implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3212iu f19444a;

    RunnableC2984gu(C3212iu c3212iu) {
        this.f19444a = c3212iu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19444a.b("surfaceDestroyed", new String[0]);
    }
}
