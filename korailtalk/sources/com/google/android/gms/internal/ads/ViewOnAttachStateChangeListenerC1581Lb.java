package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Lb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC1581Lb implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: m, reason: collision with root package name */
    private static final Handler f14312m = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    private final Context f14313a;

    /* renamed from: b, reason: collision with root package name */
    private Application f14314b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager f14315c;

    /* renamed from: d, reason: collision with root package name */
    private final KeyguardManager f14316d;

    /* renamed from: e, reason: collision with root package name */
    private BroadcastReceiver f14317e;

    /* renamed from: f, reason: collision with root package name */
    private final C4769wb f14318f;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference f14319g;

    /* renamed from: h, reason: collision with root package name */
    private WeakReference f14320h;

    /* renamed from: i, reason: collision with root package name */
    private C4313sb f14321i;

    /* renamed from: j, reason: collision with root package name */
    private byte f14322j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f14323k = -1;

    /* renamed from: l, reason: collision with root package name */
    private long f14324l = -3;

    public ViewOnAttachStateChangeListenerC1581Lb(Context context, C4769wb c4769wb) {
        Context applicationContext = context.getApplicationContext();
        this.f14313a = applicationContext;
        this.f14318f = c4769wb;
        this.f14315c = (PowerManager) applicationContext.getSystemService("power");
        this.f14316d = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f14314b = application;
            this.f14321i = new C4313sb(application, this);
        }
        c(null);
    }

    private final void d(Activity activity, int i8) {
        Window window;
        if (this.f14320h == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View viewA = a();
        if (viewA == null || viewPeekDecorView == null || viewA.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f14323k = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006a, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r10 = this;
            r0 = 1
            java.lang.ref.WeakReference r1 = r10.f14320h
            if (r1 != 0) goto L7
            goto Lbe
        L7:
            android.view.View r1 = r10.a()
            r2 = -1
            r3 = -3
            if (r1 != 0) goto L15
            r10.f14324l = r3
            r10.f14322j = r2
            return
        L15:
            int r5 = r1.getVisibility()
            r6 = 0
            if (r5 == 0) goto L1e
            r5 = r0
            goto L1f
        L1e:
            r5 = r6
        L1f:
            boolean r7 = r1.isShown()
            if (r7 != 0) goto L27
            r5 = r5 | 2
        L27:
            android.os.PowerManager r7 = r10.f14315c
            if (r7 == 0) goto L33
            boolean r7 = r7.isScreenOn()
            if (r7 != 0) goto L33
            r5 = r5 | 4
        L33:
            com.google.android.gms.internal.ads.wb r7 = r10.f14318f
            boolean r7 = r7.a()
            if (r7 != 0) goto L84
            android.app.KeyguardManager r7 = r10.f14316d
            if (r7 == 0) goto L82
            boolean r7 = r7.inKeyguardRestrictedInputMode()
            if (r7 == 0) goto L82
            int r7 = com.google.android.gms.internal.ads.AbstractC1417Hb.zza
            android.view.View r7 = r1.getRootView()
            if (r7 != 0) goto L4e
            r7 = r1
        L4e:
            android.content.Context r7 = r7.getContext()
        L52:
            boolean r8 = r7 instanceof android.content.ContextWrapper
            r9 = 0
            if (r8 == 0) goto L6a
            r8 = 10
            if (r6 >= r8) goto L6a
            boolean r8 = r7 instanceof android.app.Activity
            if (r8 == 0) goto L62
            android.app.Activity r7 = (android.app.Activity) r7
            goto L6b
        L62:
            android.content.ContextWrapper r7 = (android.content.ContextWrapper) r7
            android.content.Context r7 = r7.getBaseContext()
            int r6 = r6 + r0
            goto L52
        L6a:
            r7 = r9
        L6b:
            if (r7 != 0) goto L6e
            goto L82
        L6e:
            android.view.Window r0 = r7.getWindow()
            if (r0 != 0) goto L75
            goto L79
        L75:
            android.view.WindowManager$LayoutParams r9 = r0.getAttributes()
        L79:
            if (r9 == 0) goto L82
            int r0 = r9.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r6
            if (r0 != 0) goto L84
        L82:
            r5 = r5 | 8
        L84:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r0 = r1.getGlobalVisibleRect(r0)
            if (r0 != 0) goto L91
            r5 = r5 | 16
        L91:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r0 = r1.getLocalVisibleRect(r0)
            if (r0 != 0) goto L9e
            r5 = r5 | 32
        L9e:
            int r0 = r1.getWindowVisibility()
            int r1 = r10.f14323k
            if (r1 == r2) goto La7
            r0 = r1
        La7:
            if (r0 == 0) goto Lab
            r5 = r5 | 64
        Lab:
            byte r0 = r10.f14322j
            if (r0 == r5) goto Lbe
            byte r0 = (byte) r5
            r10.f14322j = r0
            if (r5 != 0) goto Lb9
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto Lbc
        Lb9:
            long r0 = (long) r5
            long r0 = r3 - r0
        Lbc:
            r10.f14324l = r0
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC1581Lb.e():void");
    }

    private final void f() {
        f14312m.post(new RunnableC1499Jb(this));
    }

    private final void g(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f14319g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f14317e == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            C1540Kb c1540Kb = new C1540Kb(this);
            this.f14317e = c1540Kb;
            this.f14313a.registerReceiver(c1540Kb, intentFilter);
        }
        Application application = this.f14314b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f14321i);
            } catch (Exception unused) {
            }
        }
    }

    private final void h(View view) {
        try {
            WeakReference weakReference = this.f14319g;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f14319g = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.f14317e;
        if (broadcastReceiver != null) {
            try {
                this.f14313a.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.f14317e = null;
        }
        Application application = this.f14314b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f14321i);
            } catch (Exception unused4) {
            }
        }
    }

    final View a() {
        WeakReference weakReference = this.f14320h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    final void c(View view) {
        long j8;
        View viewA = a();
        if (viewA != null) {
            viewA.removeOnAttachStateChangeListener(this);
            h(viewA);
        }
        this.f14320h = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                g(view);
            }
            view.addOnAttachStateChangeListener(this);
            j8 = -2;
        } else {
            j8 = -3;
        }
        this.f14324l = j8;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        d(activity, 0);
        e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        d(activity, 4);
        e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(activity, 0);
        e();
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        d(activity, 0);
        e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        e();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        e();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f14323k = -1;
        g(view);
        e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f14323k = -1;
        e();
        f();
        h(view);
    }

    public final long zza() {
        if (this.f14324l <= -2 && a() == null) {
            this.f14324l = -3L;
        }
        return this.f14324l;
    }
}
