package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.qb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4086qb implements InterfaceC4199rb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f21960a;

    C4086qb(C4313sb c4313sb, Activity activity) {
        this.f21960a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4199rb
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f21960a);
    }
}
