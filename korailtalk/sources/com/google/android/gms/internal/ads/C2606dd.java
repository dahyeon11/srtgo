package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.dd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2606dd implements InterfaceC3065hd {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f18648a;

    C2606dd(C3292jd c3292jd, Activity activity) {
        this.f18648a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065hd
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f18648a);
    }
}
