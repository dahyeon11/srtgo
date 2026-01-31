package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.lb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3516lb implements InterfaceC4199rb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f20683a;

    C3516lb(C4313sb c4313sb, Activity activity) {
        this.f20683a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4199rb
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f20683a);
    }
}
