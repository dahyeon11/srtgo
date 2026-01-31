package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.od, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3862od implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private Activity f21515a;

    /* renamed from: b, reason: collision with root package name */
    private Context f21516b;

    /* renamed from: h, reason: collision with root package name */
    private Runnable f21522h;

    /* renamed from: j, reason: collision with root package name */
    private long f21524j;

    /* renamed from: c, reason: collision with root package name */
    private final Object f21517c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private boolean f21518d = true;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21519e = false;

    /* renamed from: f, reason: collision with root package name */
    private final List f21520f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final List f21521g = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private boolean f21523i = false;

    C3862od() {
    }

    private final void f(Activity activity) {
        synchronized (this.f21517c) {
            try {
                if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                    this.f21515a = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f21517c) {
            try {
                Activity activity2 = this.f21515a;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f21515a = null;
                }
                Iterator it = this.f21521g.iterator();
                while (it.hasNext()) {
                    android.support.v4.media.session.f.a(it.next());
                    try {
                        throw null;
                    } catch (Exception e8) {
                        G1.u.zzo().zzw(e8, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        L1.n.zzh("", e8);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        f(activity);
        synchronized (this.f21517c) {
            Iterator it = this.f21521g.iterator();
            while (it.hasNext()) {
                android.support.v4.media.session.f.a(it.next());
                try {
                    throw null;
                } catch (Exception e8) {
                    G1.u.zzo().zzw(e8, "AppActivityTracker.ActivityListener.onActivityPaused");
                    L1.n.zzh("", e8);
                }
            }
        }
        this.f21519e = true;
        Runnable runnable = this.f21522h;
        if (runnable != null) {
            K1.K0.zza.removeCallbacks(runnable);
        }
        HandlerC1634Mh0 handlerC1634Mh0 = K1.K0.zza;
        RunnableC3748nd runnableC3748nd = new RunnableC3748nd(this);
        this.f21522h = runnableC3748nd;
        handlerC1634Mh0.postDelayed(runnableC3748nd, this.f21524j);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        f(activity);
        this.f21519e = false;
        boolean z8 = this.f21518d;
        this.f21518d = true;
        Runnable runnable = this.f21522h;
        if (runnable != null) {
            K1.K0.zza.removeCallbacks(runnable);
        }
        synchronized (this.f21517c) {
            Iterator it = this.f21521g.iterator();
            while (it.hasNext()) {
                android.support.v4.media.session.f.a(it.next());
                try {
                    throw null;
                } catch (Exception e8) {
                    G1.u.zzo().zzw(e8, "AppActivityTracker.ActivityListener.onActivityResumed");
                    L1.n.zzh("", e8);
                }
            }
            if (z8) {
                L1.n.zze("App is still foreground.");
            } else {
                Iterator it2 = this.f21520f.iterator();
                while (it2.hasNext()) {
                    try {
                        ((InterfaceC3976pd) it2.next()).zza(true);
                    } catch (Exception e9) {
                        L1.n.zzh("", e9);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        f(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final Activity zza() {
        return this.f21515a;
    }

    public final Context zzb() {
        return this.f21516b;
    }

    public final void zzf(InterfaceC3976pd interfaceC3976pd) {
        synchronized (this.f21517c) {
            this.f21520f.add(interfaceC3976pd);
        }
    }

    public final void zzg(Application application, Context context) {
        if (this.f21523i) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            f((Activity) context);
        }
        this.f21516b = application;
        this.f21524j = ((Long) H1.C.zzc().zza(AbstractC4439th.zzaT)).longValue();
        this.f21523i = true;
    }

    public final void zzh(InterfaceC3976pd interfaceC3976pd) {
        synchronized (this.f21517c) {
            this.f21520f.remove(interfaceC3976pd);
        }
    }
}
