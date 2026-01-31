package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.pb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3972pb implements InterfaceC4199rb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f21783a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f21784b;

    C3972pb(C4313sb c4313sb, Activity activity, Bundle bundle) {
        this.f21783a = activity;
        this.f21784b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4199rb
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f21783a, this.f21784b);
    }
}
