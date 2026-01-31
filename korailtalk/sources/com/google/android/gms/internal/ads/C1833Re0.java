package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Re0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1833Re0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private boolean f16141a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f16142b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC1792Qe0 f16143c;

    private final void a(boolean z8) {
        if (this.f16142b != z8) {
            this.f16142b = z8;
            if (this.f16141a) {
                zzb(z8);
                InterfaceC1792Qe0 interfaceC1792Qe0 = this.f16143c;
                if (interfaceC1792Qe0 != null) {
                    interfaceC1792Qe0.zzc(z8);
                }
            }
        }
    }

    private final boolean b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || zzc();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(b());
    }

    protected void zzb(boolean z8) {
    }

    protected boolean zzc() {
        return false;
    }

    public final void zzd(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void zze(InterfaceC1792Qe0 interfaceC1792Qe0) {
        this.f16143c = interfaceC1792Qe0;
    }

    public final void zzf() {
        this.f16141a = true;
        boolean zB = b();
        this.f16142b = zB;
        zzb(zB);
    }

    public final void zzg() {
        this.f16141a = false;
        this.f16143c = null;
    }
}
