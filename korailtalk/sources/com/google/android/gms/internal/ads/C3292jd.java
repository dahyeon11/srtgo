package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.jd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3292jd implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final Application f20285a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f20286b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20287c = false;

    public C3292jd(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f20286b = new WeakReference(activityLifecycleCallbacks);
        this.f20285a = application;
    }

    protected final void a(InterfaceC3065hd interfaceC3065hd) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f20286b.get();
            if (activityLifecycleCallbacks != null) {
                interfaceC3065hd.zza(activityLifecycleCallbacks);
            } else {
                if (this.f20287c) {
                    return;
                }
                this.f20285a.unregisterActivityLifecycleCallbacks(this);
                this.f20287c = true;
            }
        } catch (Exception e8) {
            L1.n.zzh("Error while dispatching lifecycle callback.", e8);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new C2262ad(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new C2950gd(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new C2606dd(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new C2491cd(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new C2835fd(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new C2377bd(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new C2720ed(this, activity));
    }
}
