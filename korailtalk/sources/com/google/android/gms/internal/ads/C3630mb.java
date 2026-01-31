package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.mb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3630mb implements InterfaceC4199rb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f20945a;

    C3630mb(C4313sb c4313sb, Activity activity) {
        this.f20945a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4199rb
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f20945a);
    }
}
