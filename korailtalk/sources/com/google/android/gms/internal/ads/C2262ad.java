package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ad, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2262ad implements InterfaceC3065hd {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f17994a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f17995b;

    C2262ad(C3292jd c3292jd, Activity activity, Bundle bundle) {
        this.f17994a = activity;
        this.f17995b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065hd
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f17994a, this.f17995b);
    }
}
