package com.google.android.gms.internal.ads;

import K1.C0636f0;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.Wc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC2033Wc implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: p, reason: collision with root package name */
    private static final long f17021p = ((Long) H1.C.zzc().zza(AbstractC4439th.zzbn)).longValue();

    /* renamed from: a, reason: collision with root package name */
    private final Context f17022a;

    /* renamed from: b, reason: collision with root package name */
    private Application f17023b;

    /* renamed from: c, reason: collision with root package name */
    private final WindowManager f17024c;

    /* renamed from: d, reason: collision with root package name */
    private final PowerManager f17025d;

    /* renamed from: e, reason: collision with root package name */
    private final KeyguardManager f17026e;

    /* renamed from: f, reason: collision with root package name */
    BroadcastReceiver f17027f;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference f17028g;

    /* renamed from: h, reason: collision with root package name */
    final WeakReference f17029h;

    /* renamed from: i, reason: collision with root package name */
    private C3292jd f17030i;

    /* renamed from: j, reason: collision with root package name */
    private final C0636f0 f17031j = new C0636f0(f17021p);

    /* renamed from: k, reason: collision with root package name */
    private boolean f17032k = false;

    /* renamed from: l, reason: collision with root package name */
    private int f17033l = -1;

    /* renamed from: m, reason: collision with root package name */
    private final HashSet f17034m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    private final DisplayMetrics f17035n;

    /* renamed from: o, reason: collision with root package name */
    private final Rect f17036o;

    public ViewOnAttachStateChangeListenerC2033Wc(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f17022a = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f17024c = windowManager;
        this.f17025d = (PowerManager) applicationContext.getSystemService("power");
        this.f17026e = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f17023b = application;
            this.f17030i = new C3292jd(application, this);
        }
        this.f17035n = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f17036o = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f17029h;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            i(view2);
        }
        this.f17029h = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                h(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final int d(int i8) {
        return (int) (i8 / this.f17035n.density);
    }

    private final void e(Activity activity, int i8) {
        Window window;
        if (this.f17029h == null || (window = activity.getWindow()) == null) {
            return;
        }
        WeakReference weakReference = this.f17029h;
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f17033l = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0133, code lost:
    
        if (r9 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0135, code lost:
    
        r3 = 1;
        r13 = true;
        r14 = true;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0158, code lost:
    
        if (r9 == 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r35) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2033Wc.f(int):void");
    }

    private final void g() {
        K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Sc
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.c();
            }
        });
    }

    private final void h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f17028g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f17027f == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f17027f = new C1910Tc(this);
            G1.u.zzv().zzc(this.f17022a, this.f17027f, intentFilter);
        }
        Application application = this.f17023b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f17030i);
            } catch (Exception e8) {
                L1.n.zzh("Error registering activity lifecycle callbacks.", e8);
            }
        }
    }

    private final void i(View view) {
        try {
            WeakReference weakReference = this.f17028g;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f17028g = null;
            }
        } catch (Exception e8) {
            L1.n.zzh("Error while unregistering listeners from the last ViewTreeObserver.", e8);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e9) {
            L1.n.zzh("Error while unregistering listeners from the ViewTreeObserver.", e9);
        }
        if (this.f17027f != null) {
            try {
                G1.u.zzv().zzd(this.f17022a, this.f17027f);
            } catch (IllegalStateException e10) {
                L1.n.zzh("Failed trying to unregister the receiver", e10);
            } catch (Exception e11) {
                G1.u.zzo().zzw(e11, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f17027f = null;
        }
        Application application = this.f17023b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f17030i);
            } catch (Exception e12) {
                L1.n.zzh("Error registering activity lifecycle callbacks.", e12);
            }
        }
    }

    final Rect a(Rect rect) {
        return new Rect(d(rect.left), d(rect.top), d(rect.right), d(rect.bottom));
    }

    final /* synthetic */ void c() {
        f(3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e(activity, 0);
        f(3);
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        f(3);
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        e(activity, 4);
        f(3);
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        e(activity, 0);
        f(3);
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        f(3);
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        e(activity, 0);
        f(3);
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        f(3);
        g();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        f(2);
        g();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        f(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f17033l = -1;
        h(view);
        f(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f17033l = -1;
        f(3);
        g();
        i(view);
    }

    public final void zzc(InterfaceC1992Vc interfaceC1992Vc) {
        this.f17034m.add(interfaceC1992Vc);
        f(3);
    }

    public final void zze(InterfaceC1992Vc interfaceC1992Vc) {
        this.f17034m.remove(interfaceC1992Vc);
    }

    public final void zzf() {
        this.f17031j.zza(f17021p);
    }

    public final void zzg(long j8) {
        this.f17031j.zza(j8);
    }
}
