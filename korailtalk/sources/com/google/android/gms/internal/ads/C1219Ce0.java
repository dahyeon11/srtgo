package com.google.android.gms.internal.ads;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.google.android.gms.internal.ads.Ce0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1219Ce0 extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Timer f12564a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1301Ee0 f12565b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3786nw f12566c;

    C1219Ce0(C1301Ee0 c1301Ee0, C3786nw c3786nw, Timer timer) {
        this.f12566c = c3786nw;
        this.f12564a = timer;
        this.f12565b = c1301Ee0;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f12565b.d();
        this.f12566c.zza(true);
        this.f12564a.cancel();
    }
}
