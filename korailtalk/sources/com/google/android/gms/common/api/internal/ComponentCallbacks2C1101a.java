package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C1101a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    private static final ComponentCallbacks2C1101a f11977e = new ComponentCallbacks2C1101a();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f11978a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f11979b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f11980c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f11981d = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0194a {
        void onBackgroundStateChanged(boolean z8);
    }

    private ComponentCallbacks2C1101a() {
    }

    private final void a(boolean z8) {
        synchronized (f11977e) {
            try {
                Iterator it = this.f11980c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0194a) it.next()).onBackgroundStateChanged(z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentCallbacks2C1101a getInstance() {
        return f11977e;
    }

    public static void initialize(Application application) {
        ComponentCallbacks2C1101a componentCallbacks2C1101a = f11977e;
        synchronized (componentCallbacks2C1101a) {
            try {
                if (!componentCallbacks2C1101a.f11981d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C1101a);
                    application.registerComponentCallbacks(componentCallbacks2C1101a);
                    componentCallbacks2C1101a.f11981d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addListener(InterfaceC0194a interfaceC0194a) {
        synchronized (f11977e) {
            this.f11980c.add(interfaceC0194a);
        }
    }

    public boolean isInBackground() {
        return this.f11978a.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f11979b;
        boolean zCompareAndSet = this.f11978a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f11979b;
        boolean zCompareAndSet = this.f11978a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i8) {
        if (i8 == 20 && this.f11978a.compareAndSet(false, true)) {
            this.f11979b.set(true);
            a(true);
        }
    }

    public boolean readCurrentStateIfPossible(boolean z8) {
        if (!this.f11979b.get()) {
            if (!o2.n.isAtLeastJellyBean()) {
                return z8;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f11979b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f11978a.set(true);
            }
        }
        return isInBackground();
    }
}
