package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.fd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2835fd implements InterfaceC3065hd {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f19218a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f19219b;

    C2835fd(C3292jd c3292jd, Activity activity, Bundle bundle) {
        this.f19218a = activity;
        this.f19219b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065hd
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f19218a, this.f19219b);
    }
}
