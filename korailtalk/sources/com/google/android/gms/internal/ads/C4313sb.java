package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.sb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4313sb implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final Application f22667a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f22668b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f22669c = false;

    public C4313sb(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f22668b = new WeakReference(activityLifecycleCallbacks);
        this.f22667a = application;
    }

    protected final void a(InterfaceC4199rb interfaceC4199rb) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f22668b.get();
            if (activityLifecycleCallbacks != null) {
                interfaceC4199rb.zza(activityLifecycleCallbacks);
            } else {
                if (this.f22669c) {
                    return;
                }
                this.f22667a.unregisterActivityLifecycleCallbacks(this);
                this.f22669c = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new C3402kb(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new C4086qb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new C3744nb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new C3630mb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new C3972pb(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new C3516lb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new C3858ob(this, activity));
    }
}
