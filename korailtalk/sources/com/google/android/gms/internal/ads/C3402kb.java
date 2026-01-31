package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.kb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3402kb implements InterfaceC4199rb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f20434a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f20435b;

    C3402kb(C4313sb c4313sb, Activity activity, Bundle bundle) {
        this.f20434a = activity;
        this.f20435b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4199rb
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f20434a, this.f20435b);
    }
}
