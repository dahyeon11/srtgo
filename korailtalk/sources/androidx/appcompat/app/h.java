package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0850j;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.r0;
import androidx.appcompat.widget.x0;
import androidx.appcompat.widget.y0;
import androidx.core.content.res.h;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C;
import androidx.core.view.C0950d1;
import androidx.core.view.C1001x0;
import androidx.core.view.C1005z0;
import androidx.core.view.D;
import androidx.core.view.W;
import androidx.lifecycle.AbstractC1019h;
import androidx.lifecycle.InterfaceC1025n;
import h.AbstractC5563a;
import h.AbstractC5565c;
import h.AbstractC5568f;
import h.AbstractC5569g;
import h.AbstractC5571i;
import h.AbstractC5572j;
import i.AbstractC5638a;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import l.AbstractC5876b;
import l.C5878d;
import l.f;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
class h extends androidx.appcompat.app.g implements e.a, LayoutInflater.Factory2 {

    /* renamed from: b0, reason: collision with root package name */
    private static final O.h f6322b0 = new O.h();

    /* renamed from: c0, reason: collision with root package name */
    private static final boolean f6323c0 = false;

    /* renamed from: d0, reason: collision with root package name */
    private static final int[] f6324d0 = {R.attr.windowBackground};

    /* renamed from: e0, reason: collision with root package name */
    private static final boolean f6325e0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: f0, reason: collision with root package name */
    private static final boolean f6326f0 = true;

    /* renamed from: A, reason: collision with root package name */
    boolean f6327A;

    /* renamed from: B, reason: collision with root package name */
    boolean f6328B;

    /* renamed from: C, reason: collision with root package name */
    boolean f6329C;

    /* renamed from: D, reason: collision with root package name */
    boolean f6330D;

    /* renamed from: E, reason: collision with root package name */
    boolean f6331E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f6332F;

    /* renamed from: G, reason: collision with root package name */
    private s[] f6333G;

    /* renamed from: H, reason: collision with root package name */
    private s f6334H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f6335I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f6336J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f6337K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f6338L;

    /* renamed from: M, reason: collision with root package name */
    boolean f6339M;

    /* renamed from: N, reason: collision with root package name */
    private int f6340N;

    /* renamed from: O, reason: collision with root package name */
    private int f6341O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f6342P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f6343Q;

    /* renamed from: R, reason: collision with root package name */
    private o f6344R;

    /* renamed from: S, reason: collision with root package name */
    private o f6345S;

    /* renamed from: T, reason: collision with root package name */
    boolean f6346T;

    /* renamed from: U, reason: collision with root package name */
    int f6347U;

    /* renamed from: V, reason: collision with root package name */
    private final Runnable f6348V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f6349W;

    /* renamed from: X, reason: collision with root package name */
    private Rect f6350X;

    /* renamed from: Y, reason: collision with root package name */
    private Rect f6351Y;

    /* renamed from: Z, reason: collision with root package name */
    private androidx.appcompat.app.l f6352Z;

    /* renamed from: a0, reason: collision with root package name */
    private androidx.appcompat.app.m f6353a0;

    /* renamed from: d, reason: collision with root package name */
    final Object f6354d;

    /* renamed from: e, reason: collision with root package name */
    final Context f6355e;

    /* renamed from: f, reason: collision with root package name */
    Window f6356f;

    /* renamed from: g, reason: collision with root package name */
    private m f6357g;

    /* renamed from: h, reason: collision with root package name */
    final androidx.appcompat.app.f f6358h;

    /* renamed from: i, reason: collision with root package name */
    androidx.appcompat.app.a f6359i;

    /* renamed from: j, reason: collision with root package name */
    MenuInflater f6360j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f6361k;

    /* renamed from: l, reason: collision with root package name */
    private O f6362l;

    /* renamed from: m, reason: collision with root package name */
    private g f6363m;

    /* renamed from: n, reason: collision with root package name */
    private t f6364n;

    /* renamed from: o, reason: collision with root package name */
    AbstractC5876b f6365o;

    /* renamed from: p, reason: collision with root package name */
    ActionBarContextView f6366p;

    /* renamed from: q, reason: collision with root package name */
    PopupWindow f6367q;

    /* renamed from: r, reason: collision with root package name */
    Runnable f6368r;

    /* renamed from: s, reason: collision with root package name */
    C1001x0 f6369s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f6370t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f6371u;

    /* renamed from: v, reason: collision with root package name */
    ViewGroup f6372v;

    /* renamed from: w, reason: collision with root package name */
    private TextView f6373w;

    /* renamed from: x, reason: collision with root package name */
    private View f6374x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f6375y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f6376z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            if ((hVar.f6347U & 1) != 0) {
                hVar.r(0);
            }
            h hVar2 = h.this;
            if ((hVar2.f6347U & 4096) != 0) {
                hVar2.r(androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR);
            }
            h hVar3 = h.this;
            hVar3.f6346T = false;
            hVar3.f6347U = 0;
        }
    }

    class b implements W {
        b() {
        }

        @Override // androidx.core.view.W
        public C0950d1 onApplyWindowInsets(View view, C0950d1 c0950d1) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            int systemWindowInsetTop = c0950d1.getSystemWindowInsetTop();
            int iG0 = h.this.g0(c0950d1, null);
            if (systemWindowInsetTop != iG0) {
                c0950d1 = c0950d1.replaceSystemWindowInsets(c0950d1.getSystemWindowInsetLeft(), iG0, c0950d1.getSystemWindowInsetRight(), c0950d1.getSystemWindowInsetBottom());
            }
            return AbstractC0985p0.onApplyWindowInsets(view, c0950d1);
        }
    }

    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onAttachedFromWindow() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            h.this.p();
        }
    }

    class d implements Runnable {

        class a extends C1005z0 {
            a() {
            }

            @Override // androidx.core.view.C1005z0, androidx.core.view.InterfaceC1003y0
            public void onAnimationEnd(View view) {
                h.this.f6366p.setAlpha(1.0f);
                h.this.f6369s.setListener(null);
                h.this.f6369s = null;
            }

            @Override // androidx.core.view.C1005z0, androidx.core.view.InterfaceC1003y0
            public void onAnimationStart(View view) {
                h.this.f6366p.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f6367q.showAtLocation(hVar.f6366p, 55, 0, 0);
            h.this.s();
            if (!h.this.Z()) {
                h.this.f6366p.setAlpha(1.0f);
                h.this.f6366p.setVisibility(0);
            } else {
                h.this.f6366p.setAlpha(0.0f);
                h hVar2 = h.this;
                hVar2.f6369s = AbstractC0985p0.animate(hVar2.f6366p).alpha(1.0f);
                h.this.f6369s.setListener(new a());
            }
        }
    }

    class e extends C1005z0 {
        e() {
        }

        @Override // androidx.core.view.C1005z0, androidx.core.view.InterfaceC1003y0
        public void onAnimationEnd(View view) {
            h.this.f6366p.setAlpha(1.0f);
            h.this.f6369s.setListener(null);
            h.this.f6369s = null;
        }

        @Override // androidx.core.view.C1005z0, androidx.core.view.InterfaceC1003y0
        public void onAnimationStart(View view) {
            h.this.f6366p.setVisibility(0);
            h.this.f6366p.sendAccessibilityEvent(32);
            if (h.this.f6366p.getParent() instanceof View) {
                AbstractC0985p0.requestApplyInsets((View) h.this.f6366p.getParent());
            }
        }
    }

    private class f implements androidx.appcompat.app.b {
        f() {
        }

        @Override // androidx.appcompat.app.b
        public Context getActionBarThemedContext() {
            return h.this.x();
        }

        @Override // androidx.appcompat.app.b
        public Drawable getThemeUpIndicator() {
            r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(getActionBarThemedContext(), (AttributeSet) null, new int[]{AbstractC5563a.homeAsUpIndicator});
            Drawable drawable = r0VarObtainStyledAttributes.getDrawable(0);
            r0VarObtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.b
        public boolean isNavigationVisible() {
            androidx.appcompat.app.a supportActionBar = h.this.getSupportActionBar();
            return (supportActionBar == null || (supportActionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.b
        public void setActionBarDescription(int i8) {
            androidx.appcompat.app.a supportActionBar = h.this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setHomeActionContentDescription(i8);
            }
        }

        @Override // androidx.appcompat.app.b
        public void setActionBarUpIndicator(Drawable drawable, int i8) {
            androidx.appcompat.app.a supportActionBar = h.this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setHomeAsUpIndicator(drawable);
                supportActionBar.setHomeActionContentDescription(i8);
            }
        }
    }

    private final class g implements k.a {
        g() {
        }

        @Override // androidx.appcompat.view.menu.k.a
        public void onCloseMenu(androidx.appcompat.view.menu.e eVar, boolean z8) {
            h.this.j(eVar);
        }

        @Override // androidx.appcompat.view.menu.k.a
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackC = h.this.C();
            if (callbackC == null) {
                return true;
            }
            callbackC.onMenuOpened(androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR, eVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.h$h, reason: collision with other inner class name */
    class C0111h implements AbstractC5876b.a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC5876b.a f6385a;

        /* renamed from: androidx.appcompat.app.h$h$a */
        class a extends C1005z0 {
            a() {
            }

            @Override // androidx.core.view.C1005z0, androidx.core.view.InterfaceC1003y0
            public void onAnimationEnd(View view) {
                h.this.f6366p.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.f6367q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.f6366p.getParent() instanceof View) {
                    AbstractC0985p0.requestApplyInsets((View) h.this.f6366p.getParent());
                }
                h.this.f6366p.killMode();
                h.this.f6369s.setListener(null);
                h hVar2 = h.this;
                hVar2.f6369s = null;
                AbstractC0985p0.requestApplyInsets(hVar2.f6372v);
            }
        }

        public C0111h(AbstractC5876b.a aVar) {
            this.f6385a = aVar;
        }

        @Override // l.AbstractC5876b.a
        public boolean onActionItemClicked(AbstractC5876b abstractC5876b, MenuItem menuItem) {
            return this.f6385a.onActionItemClicked(abstractC5876b, menuItem);
        }

        @Override // l.AbstractC5876b.a
        public boolean onCreateActionMode(AbstractC5876b abstractC5876b, Menu menu) {
            return this.f6385a.onCreateActionMode(abstractC5876b, menu);
        }

        @Override // l.AbstractC5876b.a
        public void onDestroyActionMode(AbstractC5876b abstractC5876b) {
            this.f6385a.onDestroyActionMode(abstractC5876b);
            h hVar = h.this;
            if (hVar.f6367q != null) {
                hVar.f6356f.getDecorView().removeCallbacks(h.this.f6368r);
            }
            h hVar2 = h.this;
            if (hVar2.f6366p != null) {
                hVar2.s();
                h hVar3 = h.this;
                hVar3.f6369s = AbstractC0985p0.animate(hVar3.f6366p).alpha(0.0f);
                h.this.f6369s.setListener(new a());
            }
            h hVar4 = h.this;
            androidx.appcompat.app.f fVar = hVar4.f6358h;
            if (fVar != null) {
                fVar.onSupportActionModeFinished(hVar4.f6365o);
            }
            h hVar5 = h.this;
            hVar5.f6365o = null;
            AbstractC0985p0.requestApplyInsets(hVar5.f6372v);
        }

        @Override // l.AbstractC5876b.a
        public boolean onPrepareActionMode(AbstractC5876b abstractC5876b, Menu menu) {
            AbstractC0985p0.requestApplyInsets(h.this.f6372v);
            return this.f6385a.onPrepareActionMode(abstractC5876b, menu);
        }
    }

    static class i {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i8 = configuration.densityDpi;
            int i9 = configuration2.densityDpi;
            if (i8 != i9) {
                configuration3.densityDpi = i9;
            }
        }
    }

    static class j {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    static class k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode |= configuration2.colorMode & 3;
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode |= configuration2.colorMode & 12;
            }
        }
    }

    class m extends l.j {
        m(Window.Callback callback) {
            super(callback);
        }

        final ActionMode a(ActionMode.Callback callback) {
            f.a aVar = new f.a(h.this.f6355e, callback);
            AbstractC5876b abstractC5876bStartSupportActionMode = h.this.startSupportActionMode(aVar);
            if (abstractC5876bStartSupportActionMode != null) {
                return aVar.getActionModeWrapper(abstractC5876bStartSupportActionMode);
            }
            return null;
        }

        @Override // l.j, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.q(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // l.j, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || h.this.N(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // l.j, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // l.j, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i8, Menu menu) {
            if (i8 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i8, menu);
            }
            return false;
        }

        @Override // l.j, android.view.Window.Callback
        public boolean onMenuOpened(int i8, Menu menu) {
            super.onMenuOpened(i8, menu);
            h.this.Q(i8);
            return true;
        }

        @Override // l.j, android.view.Window.Callback
        public void onPanelClosed(int i8, Menu menu) {
            super.onPanelClosed(i8, menu);
            h.this.R(i8);
        }

        @Override // l.j, android.view.Window.Callback
        public boolean onPreparePanel(int i8, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i8 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.setOverrideVisibleItems(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i8, view, menu);
            if (eVar != null) {
                eVar.setOverrideVisibleItems(false);
            }
            return zOnPreparePanel;
        }

        @Override // l.j, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i8) {
            androidx.appcompat.view.menu.e eVar;
            s sVarA = h.this.A(0, true);
            if (sVarA == null || (eVar = sVarA.f6406j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i8);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i8);
            }
        }

        @Override // l.j, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // l.j, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i8) {
            return (h.this.isHandleNativeActionModesEnabled() && i8 == 0) ? a(callback) : super.onWindowStartingActionMode(callback, i8);
        }
    }

    private class n extends o {

        /* renamed from: c, reason: collision with root package name */
        private final PowerManager f6389c;

        n(Context context) {
            super();
            this.f6389c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.h.o
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.o
        public int getApplyableNightMode() {
            return j.a(this.f6389c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.h.o
        public void onChange() {
            h.this.applyDayNight();
        }
    }

    abstract class o {

        /* renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f6391a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                o.this.onChange();
            }
        }

        o() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f6391a;
            if (broadcastReceiver != null) {
                try {
                    h.this.f6355e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f6391a = null;
            }
        }

        abstract IntentFilter b();

        void c() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f6391a == null) {
                this.f6391a = new a();
            }
            h.this.f6355e.registerReceiver(this.f6391a, intentFilterB);
        }

        abstract int getApplyableNightMode();

        abstract void onChange();
    }

    private class p extends o {

        /* renamed from: c, reason: collision with root package name */
        private final androidx.appcompat.app.r f6394c;

        p(androidx.appcompat.app.r rVar) {
            super();
            this.f6394c = rVar;
        }

        @Override // androidx.appcompat.app.h.o
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.o
        public int getApplyableNightMode() {
            return this.f6394c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.h.o
        public void onChange() {
            h.this.applyDayNight();
        }
    }

    private static class q {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    private class r extends ContentFrameLayout {
        public r(Context context) {
            super(context);
        }

        private boolean a(int i8, int i9) {
            return i8 < -5 || i9 < -5 || i8 > getWidth() + 5 || i9 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.q(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            h.this.l(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i8) {
            setBackgroundDrawable(AbstractC5638a.getDrawable(getContext(), i8));
        }
    }

    protected static final class s {

        /* renamed from: a, reason: collision with root package name */
        int f6397a;

        /* renamed from: b, reason: collision with root package name */
        int f6398b;

        /* renamed from: c, reason: collision with root package name */
        int f6399c;

        /* renamed from: d, reason: collision with root package name */
        int f6400d;

        /* renamed from: e, reason: collision with root package name */
        int f6401e;

        /* renamed from: f, reason: collision with root package name */
        int f6402f;

        /* renamed from: g, reason: collision with root package name */
        ViewGroup f6403g;

        /* renamed from: h, reason: collision with root package name */
        View f6404h;

        /* renamed from: i, reason: collision with root package name */
        View f6405i;

        /* renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.e f6406j;

        /* renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.c f6407k;

        /* renamed from: l, reason: collision with root package name */
        Context f6408l;

        /* renamed from: m, reason: collision with root package name */
        boolean f6409m;

        /* renamed from: n, reason: collision with root package name */
        boolean f6410n;

        /* renamed from: o, reason: collision with root package name */
        boolean f6411o;

        /* renamed from: p, reason: collision with root package name */
        boolean f6412p = false;

        /* renamed from: q, reason: collision with root package name */
        boolean f6413q;
        public boolean qwertyMode;

        /* renamed from: r, reason: collision with root package name */
        Bundle f6414r;

        s(int i8) {
            this.f6397a = i8;
        }

        androidx.appcompat.view.menu.l a(k.a aVar) {
            if (this.f6406j == null) {
                return null;
            }
            if (this.f6407k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f6408l, AbstractC5569g.abc_list_menu_item_layout);
                this.f6407k = cVar;
                cVar.setCallback(aVar);
                this.f6406j.addMenuPresenter(this.f6407k);
            }
            return this.f6407k.getMenuView(this.f6403g);
        }

        void b(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f6406j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.removeMenuPresenter(this.f6407k);
            }
            this.f6406j = eVar;
            if (eVar == null || (cVar = this.f6407k) == null) {
                return;
            }
            eVar.addMenuPresenter(cVar);
        }

        void c(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(AbstractC5563a.actionBarPopupTheme, typedValue, true);
            int i8 = typedValue.resourceId;
            if (i8 != 0) {
                themeNewTheme.applyStyle(i8, true);
            }
            themeNewTheme.resolveAttribute(AbstractC5563a.panelMenuListTheme, typedValue, true);
            int i9 = typedValue.resourceId;
            if (i9 != 0) {
                themeNewTheme.applyStyle(i9, true);
            } else {
                themeNewTheme.applyStyle(AbstractC5571i.Theme_AppCompat_CompactMenu, true);
            }
            C5878d c5878d = new C5878d(context, 0);
            c5878d.getTheme().setTo(themeNewTheme);
            this.f6408l = c5878d;
            TypedArray typedArrayObtainStyledAttributes = c5878d.obtainStyledAttributes(AbstractC5572j.AppCompatTheme);
            this.f6398b = typedArrayObtainStyledAttributes.getResourceId(AbstractC5572j.AppCompatTheme_panelBackground, 0);
            this.f6402f = typedArrayObtainStyledAttributes.getResourceId(AbstractC5572j.AppCompatTheme_android_windowAnimationStyle, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void clearMenuPresenters() {
            androidx.appcompat.view.menu.e eVar = this.f6406j;
            if (eVar != null) {
                eVar.removeMenuPresenter(this.f6407k);
            }
            this.f6407k = null;
        }

        public boolean hasPanelItems() {
            if (this.f6404h == null) {
                return false;
            }
            return this.f6405i != null || this.f6407k.getAdapter().getCount() > 0;
        }
    }

    private final class t implements k.a {
        t() {
        }

        @Override // androidx.appcompat.view.menu.k.a
        public void onCloseMenu(androidx.appcompat.view.menu.e eVar, boolean z8) {
            androidx.appcompat.view.menu.e rootMenu = eVar.getRootMenu();
            boolean z9 = rootMenu != eVar;
            h hVar = h.this;
            if (z9) {
                eVar = rootMenu;
            }
            s sVarV = hVar.v(eVar);
            if (sVarV != null) {
                if (!z9) {
                    h.this.m(sVarV, z8);
                } else {
                    h.this.i(sVarV.f6397a, sVarV, rootMenu);
                    h.this.m(sVarV, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.k.a
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackC;
            if (eVar != eVar.getRootMenu()) {
                return true;
            }
            h hVar = h.this;
            if (!hVar.f6327A || (callbackC = hVar.C()) == null || h.this.f6339M) {
                return true;
            }
            callbackC.onMenuOpened(androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR, eVar);
            return true;
        }
    }

    h(Activity activity, androidx.appcompat.app.f fVar) {
        this(activity, null, fVar, activity);
    }

    private void D() {
        t();
        if (this.f6327A && this.f6359i == null) {
            Object obj = this.f6354d;
            if (obj instanceof Activity) {
                this.f6359i = new androidx.appcompat.app.s((Activity) this.f6354d, this.f6328B);
            } else if (obj instanceof Dialog) {
                this.f6359i = new androidx.appcompat.app.s((Dialog) this.f6354d);
            }
            androidx.appcompat.app.a aVar = this.f6359i;
            if (aVar != null) {
                aVar.setDefaultDisplayHomeAsUpEnabled(this.f6349W);
            }
        }
    }

    private boolean E(s sVar) {
        View view = sVar.f6405i;
        if (view != null) {
            sVar.f6404h = view;
            return true;
        }
        if (sVar.f6406j == null) {
            return false;
        }
        if (this.f6364n == null) {
            this.f6364n = new t();
        }
        View view2 = (View) sVar.a(this.f6364n);
        sVar.f6404h = view2;
        return view2 != null;
    }

    private boolean F(s sVar) {
        sVar.c(x());
        sVar.f6403g = new r(sVar.f6408l);
        sVar.f6399c = 81;
        return true;
    }

    private boolean G(s sVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f6355e;
        int i8 = sVar.f6397a;
        if ((i8 == 0 || i8 == 108) && this.f6362l != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(AbstractC5563a.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(AbstractC5563a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(AbstractC5563a.actionBarWidgetTheme, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                C5878d c5878d = new C5878d(context, 0);
                c5878d.getTheme().setTo(themeNewTheme);
                context = c5878d;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.setCallback(this);
        sVar.b(eVar);
        return true;
    }

    private void H(int i8) {
        this.f6347U = (1 << i8) | this.f6347U;
        if (this.f6346T) {
            return;
        }
        AbstractC0985p0.postOnAnimation(this.f6356f.getDecorView(), this.f6348V);
        this.f6346T = true;
    }

    private boolean I() throws PackageManager.NameNotFoundException {
        if (!this.f6343Q && (this.f6354d instanceof Activity)) {
            PackageManager packageManager = this.f6355e.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f6355e, this.f6354d.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                this.f6342P = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException unused) {
                this.f6342P = false;
            }
        }
        this.f6343Q = true;
        return this.f6342P;
    }

    private boolean M(int i8, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        s sVarA = A(i8, true);
        if (sVarA.f6411o) {
            return false;
        }
        return W(sVarA, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean P(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            l.b r0 = r4.f6365o
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.h$s r2 = r4.A(r5, r0)
            if (r5 != 0) goto L43
            androidx.appcompat.widget.O r5 = r4.f6362l
            if (r5 == 0) goto L43
            boolean r5 = r5.canShowOverflowMenu()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f6355e
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            androidx.appcompat.widget.O r5 = r4.f6362l
            boolean r5 = r5.isOverflowMenuShowing()
            if (r5 != 0) goto L3c
            boolean r5 = r4.f6339M
            if (r5 != 0) goto L62
            boolean r5 = r4.W(r2, r6)
            if (r5 == 0) goto L62
            androidx.appcompat.widget.O r5 = r4.f6362l
            boolean r0 = r5.showOverflowMenu()
            goto L68
        L3c:
            androidx.appcompat.widget.O r5 = r4.f6362l
            boolean r0 = r5.hideOverflowMenu()
            goto L68
        L43:
            boolean r5 = r2.f6411o
            if (r5 != 0) goto L64
            boolean r3 = r2.f6410n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f6409m
            if (r5 == 0) goto L62
            boolean r5 = r2.f6413q
            if (r5 == 0) goto L5b
            r2.f6409m = r1
            boolean r5 = r4.W(r2, r6)
            goto L5c
        L5b:
            r5 = r0
        L5c:
            if (r5 == 0) goto L62
            r4.T(r2, r6)
            goto L68
        L62:
            r0 = r1
            goto L68
        L64:
            r4.m(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.f6355e
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7e
            r5.playSoundEffect(r1)
            goto L85
        L7e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.P(int, android.view.KeyEvent):boolean");
    }

    private void T(s sVar, KeyEvent keyEvent) {
        int i8;
        ViewGroup.LayoutParams layoutParams;
        if (sVar.f6411o || this.f6339M) {
            return;
        }
        if (sVar.f6397a == 0 && (this.f6355e.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackC = C();
        if (callbackC != null && !callbackC.onMenuOpened(sVar.f6397a, sVar.f6406j)) {
            m(sVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f6355e.getSystemService("window");
        if (windowManager != null && W(sVar, keyEvent)) {
            ViewGroup viewGroup = sVar.f6403g;
            if (viewGroup != null && !sVar.f6412p) {
                View view = sVar.f6405i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i8 = -1;
                }
                sVar.f6410n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i8, -2, sVar.f6400d, sVar.f6401e, 1002, 8519680, -3);
                layoutParams2.gravity = sVar.f6399c;
                layoutParams2.windowAnimations = sVar.f6402f;
                windowManager.addView(sVar.f6403g, layoutParams2);
                sVar.f6411o = true;
            }
            if (viewGroup == null) {
                if (!F(sVar) || sVar.f6403g == null) {
                    return;
                }
            } else if (sVar.f6412p && viewGroup.getChildCount() > 0) {
                sVar.f6403g.removeAllViews();
            }
            if (!E(sVar) || !sVar.hasPanelItems()) {
                sVar.f6412p = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = sVar.f6404h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            sVar.f6403g.setBackgroundResource(sVar.f6398b);
            ViewParent parent = sVar.f6404h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(sVar.f6404h);
            }
            sVar.f6403g.addView(sVar.f6404h, layoutParams3);
            if (!sVar.f6404h.hasFocus()) {
                sVar.f6404h.requestFocus();
            }
            i8 = -2;
            sVar.f6410n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i8, -2, sVar.f6400d, sVar.f6401e, 1002, 8519680, -3);
            layoutParams22.gravity = sVar.f6399c;
            layoutParams22.windowAnimations = sVar.f6402f;
            windowManager.addView(sVar.f6403g, layoutParams22);
            sVar.f6411o = true;
        }
    }

    private boolean V(s sVar, int i8, KeyEvent keyEvent, int i9) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((sVar.f6409m || W(sVar, keyEvent)) && (eVar = sVar.f6406j) != null) {
            zPerformShortcut = eVar.performShortcut(i8, keyEvent, i9);
        }
        if (zPerformShortcut && (i9 & 1) == 0 && this.f6362l == null) {
            m(sVar, true);
        }
        return zPerformShortcut;
    }

    private boolean W(s sVar, KeyEvent keyEvent) {
        O o8;
        O o9;
        O o10;
        if (this.f6339M) {
            return false;
        }
        if (sVar.f6409m) {
            return true;
        }
        s sVar2 = this.f6334H;
        if (sVar2 != null && sVar2 != sVar) {
            m(sVar2, false);
        }
        Window.Callback callbackC = C();
        if (callbackC != null) {
            sVar.f6405i = callbackC.onCreatePanelView(sVar.f6397a);
        }
        int i8 = sVar.f6397a;
        boolean z8 = i8 == 0 || i8 == 108;
        if (z8 && (o10 = this.f6362l) != null) {
            o10.setMenuPrepared();
        }
        if (sVar.f6405i == null && (!z8 || !(U() instanceof androidx.appcompat.app.p))) {
            androidx.appcompat.view.menu.e eVar = sVar.f6406j;
            if (eVar == null || sVar.f6413q) {
                if (eVar == null && (!G(sVar) || sVar.f6406j == null)) {
                    return false;
                }
                if (z8 && this.f6362l != null) {
                    if (this.f6363m == null) {
                        this.f6363m = new g();
                    }
                    this.f6362l.setMenu(sVar.f6406j, this.f6363m);
                }
                sVar.f6406j.stopDispatchingItemsChanged();
                if (!callbackC.onCreatePanelMenu(sVar.f6397a, sVar.f6406j)) {
                    sVar.b(null);
                    if (z8 && (o8 = this.f6362l) != null) {
                        o8.setMenu(null, this.f6363m);
                    }
                    return false;
                }
                sVar.f6413q = false;
            }
            sVar.f6406j.stopDispatchingItemsChanged();
            Bundle bundle = sVar.f6414r;
            if (bundle != null) {
                sVar.f6406j.restoreActionViewStates(bundle);
                sVar.f6414r = null;
            }
            if (!callbackC.onPreparePanel(0, sVar.f6405i, sVar.f6406j)) {
                if (z8 && (o9 = this.f6362l) != null) {
                    o9.setMenu(null, this.f6363m);
                }
                sVar.f6406j.startDispatchingItemsChanged();
                return false;
            }
            boolean z9 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            sVar.qwertyMode = z9;
            sVar.f6406j.setQwertyMode(z9);
            sVar.f6406j.startDispatchingItemsChanged();
        }
        sVar.f6409m = true;
        sVar.f6410n = false;
        this.f6334H = sVar;
        return true;
    }

    private void X(boolean z8) {
        O o8 = this.f6362l;
        if (o8 == null || !o8.canShowOverflowMenu() || (ViewConfiguration.get(this.f6355e).hasPermanentMenuKey() && !this.f6362l.isOverflowMenuShowPending())) {
            s sVarA = A(0, true);
            sVarA.f6412p = true;
            m(sVarA, false);
            T(sVarA, null);
            return;
        }
        Window.Callback callbackC = C();
        if (this.f6362l.isOverflowMenuShowing() && z8) {
            this.f6362l.hideOverflowMenu();
            if (this.f6339M) {
                return;
            }
            callbackC.onPanelClosed(androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR, A(0, true).f6406j);
            return;
        }
        if (callbackC == null || this.f6339M) {
            return;
        }
        if (this.f6346T && (this.f6347U & 1) != 0) {
            this.f6356f.getDecorView().removeCallbacks(this.f6348V);
            this.f6348V.run();
        }
        s sVarA2 = A(0, true);
        androidx.appcompat.view.menu.e eVar = sVarA2.f6406j;
        if (eVar == null || sVarA2.f6413q || !callbackC.onPreparePanel(0, sVarA2.f6405i, eVar)) {
            return;
        }
        callbackC.onMenuOpened(androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR, sVarA2.f6406j);
        this.f6362l.showOverflowMenu();
    }

    private int Y(int i8) {
        return i8 == 8 ? androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR : i8 == 9 ? androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR_OVERLAY : i8;
    }

    private boolean a0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f6356f.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || AbstractC0985p0.isAttachedToWindow((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private void c0() {
        if (this.f6371u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private androidx.appcompat.app.e d0() {
        for (Context baseContext = this.f6355e; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.e) {
                return (androidx.appcompat.app.e) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private boolean e(boolean z8) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        if (this.f6339M) {
            return false;
        }
        int iH = h();
        boolean zE0 = e0(J(this.f6355e, iH), z8);
        if (iH == 0) {
            z(this.f6355e).c();
        } else {
            o oVar = this.f6344R;
            if (oVar != null) {
                oVar.a();
            }
        }
        if (iH == 3) {
            y(this.f6355e).c();
        } else {
            o oVar2 = this.f6345S;
            if (oVar2 != null) {
                oVar2.a();
            }
        }
        return zE0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean e0(int r7, boolean r8) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            r6 = this;
            android.content.Context r0 = r6.f6355e
            r1 = 0
            android.content.res.Configuration r0 = r6.n(r0, r7, r1)
            boolean r2 = r6.I()
            android.content.Context r3 = r6.f6355e
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L47
            if (r8 == 0) goto L47
            if (r2 != 0) goto L47
            boolean r8 = r6.f6336J
            if (r8 == 0) goto L47
            boolean r8 = androidx.appcompat.app.h.f6325e0
            if (r8 != 0) goto L30
            boolean r8 = r6.f6337K
            if (r8 == 0) goto L47
        L30:
            java.lang.Object r8 = r6.f6354d
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L47
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L47
            java.lang.Object r8 = r6.f6354d
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.AbstractC0918b.recreate(r8)
            r8 = r4
            goto L48
        L47:
            r8 = 0
        L48:
            if (r8 != 0) goto L50
            if (r3 == r0) goto L50
            r6.f0(r0, r2, r1)
            goto L51
        L50:
            r4 = r8
        L51:
            if (r4 == 0) goto L5e
            java.lang.Object r8 = r6.f6354d
            boolean r0 = r8 instanceof androidx.appcompat.app.e
            if (r0 == 0) goto L5e
            androidx.appcompat.app.e r8 = (androidx.appcompat.app.e) r8
            r8.onNightModeChanged(r7)
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.e0(int, boolean):boolean");
    }

    private void f() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f6372v.findViewById(R.id.content);
        View decorView = this.f6356f.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f6355e.obtainStyledAttributes(AbstractC5572j.AppCompatTheme);
        typedArrayObtainStyledAttributes.getValue(AbstractC5572j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(AbstractC5572j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC5572j.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes.getValue(AbstractC5572j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC5572j.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes.getValue(AbstractC5572j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC5572j.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes.getValue(AbstractC5572j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC5572j.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes.getValue(AbstractC5572j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void f0(int i8, boolean z8, Configuration configuration) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Resources resources = this.f6355e.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i8 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            androidx.appcompat.app.o.a(resources);
        }
        int i9 = this.f6341O;
        if (i9 != 0) {
            this.f6355e.setTheme(i9);
            this.f6355e.getTheme().applyStyle(this.f6341O, true);
        }
        if (z8) {
            Object obj = this.f6354d;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof InterfaceC1025n) {
                    if (((InterfaceC1025n) activity).getLifecycle().getCurrentState().isAtLeast(AbstractC1019h.b.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.f6338L) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    private void g(Window window) {
        if (this.f6356f != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof m) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        m mVar = new m(callback);
        this.f6357g = mVar;
        window.setCallback(mVar);
        r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(this.f6355e, (AttributeSet) null, f6324d0);
        Drawable drawableIfKnown = r0VarObtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            window.setBackgroundDrawable(drawableIfKnown);
        }
        r0VarObtainStyledAttributes.recycle();
        this.f6356f = window;
    }

    private int h() {
        int i8 = this.f6340N;
        return i8 != -100 ? i8 : androidx.appcompat.app.g.getDefaultNightMode();
    }

    private void h0(View view) {
        view.setBackgroundColor((AbstractC0985p0.getWindowSystemUiVisibility(view) & 8192) != 0 ? androidx.core.content.a.getColor(this.f6355e, AbstractC5565c.abc_decor_view_status_guard_light) : androidx.core.content.a.getColor(this.f6355e, AbstractC5565c.abc_decor_view_status_guard));
    }

    private void k() {
        o oVar = this.f6344R;
        if (oVar != null) {
            oVar.a();
        }
        o oVar2 = this.f6345S;
        if (oVar2 != null) {
            oVar2.a();
        }
    }

    private Configuration n(Context context, int i8, Configuration configuration) {
        int i9 = i8 != 1 ? i8 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i9 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private ViewGroup o() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f6355e.obtainStyledAttributes(AbstractC5572j.AppCompatTheme);
        if (!typedArrayObtainStyledAttributes.hasValue(AbstractC5572j.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC5572j.AppCompatTheme_windowNoTitle, false)) {
            requestWindowFeature(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(AbstractC5572j.AppCompatTheme_windowActionBar, false)) {
            requestWindowFeature(androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC5572j.AppCompatTheme_windowActionBarOverlay, false)) {
            requestWindowFeature(androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR_OVERLAY);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC5572j.AppCompatTheme_windowActionModeOverlay, false)) {
            requestWindowFeature(10);
        }
        this.f6330D = typedArrayObtainStyledAttributes.getBoolean(AbstractC5572j.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        u();
        this.f6356f.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f6355e);
        if (this.f6331E) {
            viewGroup = this.f6329C ? (ViewGroup) layoutInflaterFrom.inflate(AbstractC5569g.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(AbstractC5569g.abc_screen_simple, (ViewGroup) null);
        } else if (this.f6330D) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(AbstractC5569g.abc_dialog_title_material, (ViewGroup) null);
            this.f6328B = false;
            this.f6327A = false;
        } else if (this.f6327A) {
            TypedValue typedValue = new TypedValue();
            this.f6355e.getTheme().resolveAttribute(AbstractC5563a.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C5878d(this.f6355e, typedValue.resourceId) : this.f6355e).inflate(AbstractC5569g.abc_screen_toolbar, (ViewGroup) null);
            O o8 = (O) viewGroup.findViewById(AbstractC5568f.decor_content_parent);
            this.f6362l = o8;
            o8.setWindowCallback(C());
            if (this.f6328B) {
                this.f6362l.initFeature(androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR_OVERLAY);
            }
            if (this.f6375y) {
                this.f6362l.initFeature(2);
            }
            if (this.f6376z) {
                this.f6362l.initFeature(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f6327A + ", windowActionBarOverlay: " + this.f6328B + ", android:windowIsFloating: " + this.f6330D + ", windowActionModeOverlay: " + this.f6329C + ", windowNoTitle: " + this.f6331E + " }");
        }
        AbstractC0985p0.setOnApplyWindowInsetsListener(viewGroup, new b());
        if (this.f6362l == null) {
            this.f6373w = (TextView) viewGroup.findViewById(AbstractC5568f.title);
        }
        y0.makeOptionalFitsSystemWindows(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(AbstractC5568f.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f6356f.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f6356f.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void t() {
        if (this.f6371u) {
            return;
        }
        this.f6372v = o();
        CharSequence charSequenceB = B();
        if (!TextUtils.isEmpty(charSequenceB)) {
            O o8 = this.f6362l;
            if (o8 != null) {
                o8.setWindowTitle(charSequenceB);
            } else if (U() != null) {
                U().setWindowTitle(charSequenceB);
            } else {
                TextView textView = this.f6373w;
                if (textView != null) {
                    textView.setText(charSequenceB);
                }
            }
        }
        f();
        S(this.f6372v);
        this.f6371u = true;
        s sVarA = A(0, false);
        if (this.f6339M) {
            return;
        }
        if (sVarA == null || sVarA.f6406j == null) {
            H(androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR);
        }
    }

    private void u() {
        if (this.f6356f == null) {
            Object obj = this.f6354d;
            if (obj instanceof Activity) {
                g(((Activity) obj).getWindow());
            }
        }
        if (this.f6356f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration w(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f8 = configuration.fontScale;
            float f9 = configuration2.fontScale;
            if (f8 != f9) {
                configuration3.fontScale = f9;
            }
            int i8 = configuration.mcc;
            int i9 = configuration2.mcc;
            if (i8 != i9) {
                configuration3.mcc = i9;
            }
            int i10 = configuration.mnc;
            int i11 = configuration2.mnc;
            if (i10 != i11) {
                configuration3.mnc = i11;
            }
            int i12 = Build.VERSION.SDK_INT;
            k.a(configuration, configuration2, configuration3);
            int i13 = configuration.touchscreen;
            int i14 = configuration2.touchscreen;
            if (i13 != i14) {
                configuration3.touchscreen = i14;
            }
            int i15 = configuration.keyboard;
            int i16 = configuration2.keyboard;
            if (i15 != i16) {
                configuration3.keyboard = i16;
            }
            int i17 = configuration.keyboardHidden;
            int i18 = configuration2.keyboardHidden;
            if (i17 != i18) {
                configuration3.keyboardHidden = i18;
            }
            int i19 = configuration.navigation;
            int i20 = configuration2.navigation;
            if (i19 != i20) {
                configuration3.navigation = i20;
            }
            int i21 = configuration.navigationHidden;
            int i22 = configuration2.navigationHidden;
            if (i21 != i22) {
                configuration3.navigationHidden = i22;
            }
            int i23 = configuration.orientation;
            int i24 = configuration2.orientation;
            if (i23 != i24) {
                configuration3.orientation = i24;
            }
            int i25 = configuration.screenLayout & 15;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 15)) {
                configuration3.screenLayout |= i26 & 15;
            }
            int i27 = configuration.screenLayout & 192;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 192)) {
                configuration3.screenLayout |= i28 & 192;
            }
            int i29 = configuration.screenLayout & 48;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 48)) {
                configuration3.screenLayout |= i30 & 48;
            }
            int i31 = configuration.screenLayout & 768;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 768)) {
                configuration3.screenLayout |= i32 & 768;
            }
            if (i12 >= 26) {
                l.a(configuration, configuration2, configuration3);
            }
            int i33 = configuration.uiMode & 15;
            int i34 = configuration2.uiMode;
            if (i33 != (i34 & 15)) {
                configuration3.uiMode |= i34 & 15;
            }
            int i35 = configuration.uiMode & 48;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 48)) {
                configuration3.uiMode |= i36 & 48;
            }
            int i37 = configuration.screenWidthDp;
            int i38 = configuration2.screenWidthDp;
            if (i37 != i38) {
                configuration3.screenWidthDp = i38;
            }
            int i39 = configuration.screenHeightDp;
            int i40 = configuration2.screenHeightDp;
            if (i39 != i40) {
                configuration3.screenHeightDp = i40;
            }
            int i41 = configuration.smallestScreenWidthDp;
            int i42 = configuration2.smallestScreenWidthDp;
            if (i41 != i42) {
                configuration3.smallestScreenWidthDp = i42;
            }
            i.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private o y(Context context) {
        if (this.f6345S == null) {
            this.f6345S = new n(context);
        }
        return this.f6345S;
    }

    private o z(Context context) {
        if (this.f6344R == null) {
            this.f6344R = new p(androidx.appcompat.app.r.a(context));
        }
        return this.f6344R;
    }

    protected s A(int i8, boolean z8) {
        s[] sVarArr = this.f6333G;
        if (sVarArr == null || sVarArr.length <= i8) {
            s[] sVarArr2 = new s[i8 + 1];
            if (sVarArr != null) {
                System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            }
            this.f6333G = sVarArr2;
            sVarArr = sVarArr2;
        }
        s sVar = sVarArr[i8];
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(i8);
        sVarArr[i8] = sVar2;
        return sVar2;
    }

    final CharSequence B() {
        Object obj = this.f6354d;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f6361k;
    }

    final Window.Callback C() {
        return this.f6356f.getCallback();
    }

    int J(Context context, int i8) {
        if (i8 == -100) {
            return -1;
        }
        if (i8 != -1) {
            if (i8 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return z(context).getApplyableNightMode();
            }
            if (i8 != 1 && i8 != 2) {
                if (i8 == 3) {
                    return y(context).getApplyableNightMode();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i8;
    }

    boolean K() {
        AbstractC5876b abstractC5876b = this.f6365o;
        if (abstractC5876b != null) {
            abstractC5876b.finish();
            return true;
        }
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        return supportActionBar != null && supportActionBar.collapseActionView();
    }

    boolean L(int i8, KeyEvent keyEvent) {
        if (i8 == 4) {
            this.f6335I = (keyEvent.getFlags() & 128) != 0;
        } else if (i8 == 82) {
            M(0, keyEvent);
            return true;
        }
        return false;
    }

    boolean N(int i8, KeyEvent keyEvent) {
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null && supportActionBar.onKeyShortcut(i8, keyEvent)) {
            return true;
        }
        s sVar = this.f6334H;
        if (sVar != null && V(sVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            s sVar2 = this.f6334H;
            if (sVar2 != null) {
                sVar2.f6410n = true;
            }
            return true;
        }
        if (this.f6334H == null) {
            s sVarA = A(0, true);
            W(sVarA, keyEvent);
            boolean zV = V(sVarA, keyEvent.getKeyCode(), keyEvent, 1);
            sVarA.f6409m = false;
            if (zV) {
                return true;
            }
        }
        return false;
    }

    boolean O(int i8, KeyEvent keyEvent) {
        if (i8 == 4) {
            boolean z8 = this.f6335I;
            this.f6335I = false;
            s sVarA = A(0, false);
            if (sVarA != null && sVarA.f6411o) {
                if (!z8) {
                    m(sVarA, true);
                }
                return true;
            }
            if (K()) {
                return true;
            }
        } else if (i8 == 82) {
            P(0, keyEvent);
            return true;
        }
        return false;
    }

    void Q(int i8) {
        androidx.appcompat.app.a supportActionBar;
        if (i8 != 108 || (supportActionBar = getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.dispatchMenuVisibilityChanged(true);
    }

    void R(int i8) {
        if (i8 == 108) {
            androidx.appcompat.app.a supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.dispatchMenuVisibilityChanged(false);
                return;
            }
            return;
        }
        if (i8 == 0) {
            s sVarA = A(i8, true);
            if (sVarA.f6411o) {
                m(sVarA, false);
            }
        }
    }

    void S(ViewGroup viewGroup) {
    }

    final androidx.appcompat.app.a U() {
        return this.f6359i;
    }

    final boolean Z() {
        ViewGroup viewGroup;
        return this.f6371u && (viewGroup = this.f6372v) != null && AbstractC0985p0.isLaidOut(viewGroup);
    }

    @Override // androidx.appcompat.app.g
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t();
        ((ViewGroup) this.f6372v.findViewById(R.id.content)).addView(view, layoutParams);
        this.f6357g.getWrapped().onContentChanged();
    }

    @Override // androidx.appcompat.app.g
    public boolean applyDayNight() {
        return e(true);
    }

    @Override // androidx.appcompat.app.g
    public Context attachBaseContext2(Context context) {
        this.f6336J = true;
        int iJ = J(context, h());
        if (f6326f0 && (context instanceof ContextThemeWrapper)) {
            try {
                q.a((ContextThemeWrapper) context, n(context, iJ, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C5878d) {
            try {
                ((C5878d) context).applyOverrideConfiguration(n(context, iJ, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f6325e0) {
            return super.attachBaseContext2(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = i.a(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationN = n(context, iJ, configuration2.equals(configuration3) ? null : w(configuration2, configuration3));
        C5878d c5878d = new C5878d(context, AbstractC5571i.Theme_AppCompat_Empty);
        c5878d.applyOverrideConfiguration(configurationN);
        try {
            if (context.getTheme() != null) {
                h.g.rebase(c5878d.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.attachBaseContext2(c5878d);
    }

    AbstractC5876b b0(AbstractC5876b.a aVar) {
        AbstractC5876b abstractC5876bOnWindowStartingSupportActionMode;
        Context c5878d;
        androidx.appcompat.app.f fVar;
        s();
        AbstractC5876b abstractC5876b = this.f6365o;
        if (abstractC5876b != null) {
            abstractC5876b.finish();
        }
        if (!(aVar instanceof C0111h)) {
            aVar = new C0111h(aVar);
        }
        androidx.appcompat.app.f fVar2 = this.f6358h;
        if (fVar2 == null || this.f6339M) {
            abstractC5876bOnWindowStartingSupportActionMode = null;
        } else {
            try {
                abstractC5876bOnWindowStartingSupportActionMode = fVar2.onWindowStartingSupportActionMode(aVar);
            } catch (AbstractMethodError unused) {
            }
        }
        if (abstractC5876bOnWindowStartingSupportActionMode != null) {
            this.f6365o = abstractC5876bOnWindowStartingSupportActionMode;
        } else {
            if (this.f6366p == null) {
                if (this.f6330D) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f6355e.getTheme();
                    theme.resolveAttribute(AbstractC5563a.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f6355e.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        c5878d = new C5878d(this.f6355e, 0);
                        c5878d.getTheme().setTo(themeNewTheme);
                    } else {
                        c5878d = this.f6355e;
                    }
                    this.f6366p = new ActionBarContextView(c5878d);
                    PopupWindow popupWindow = new PopupWindow(c5878d, (AttributeSet) null, AbstractC5563a.actionModePopupWindowStyle);
                    this.f6367q = popupWindow;
                    androidx.core.widget.g.setWindowLayoutType(popupWindow, 2);
                    this.f6367q.setContentView(this.f6366p);
                    this.f6367q.setWidth(-1);
                    c5878d.getTheme().resolveAttribute(AbstractC5563a.actionBarSize, typedValue, true);
                    this.f6366p.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, c5878d.getResources().getDisplayMetrics()));
                    this.f6367q.setHeight(-2);
                    this.f6368r = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f6372v.findViewById(AbstractC5568f.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(x()));
                        this.f6366p = (ActionBarContextView) viewStubCompat.inflate();
                    }
                }
            }
            if (this.f6366p != null) {
                s();
                this.f6366p.killMode();
                l.e eVar = new l.e(this.f6366p.getContext(), this.f6366p, aVar, this.f6367q == null);
                if (aVar.onCreateActionMode(eVar, eVar.getMenu())) {
                    eVar.invalidate();
                    this.f6366p.initForMode(eVar);
                    this.f6365o = eVar;
                    if (Z()) {
                        this.f6366p.setAlpha(0.0f);
                        C1001x0 c1001x0Alpha = AbstractC0985p0.animate(this.f6366p).alpha(1.0f);
                        this.f6369s = c1001x0Alpha;
                        c1001x0Alpha.setListener(new e());
                    } else {
                        this.f6366p.setAlpha(1.0f);
                        this.f6366p.setVisibility(0);
                        this.f6366p.sendAccessibilityEvent(32);
                        if (this.f6366p.getParent() instanceof View) {
                            AbstractC0985p0.requestApplyInsets((View) this.f6366p.getParent());
                        }
                    }
                    if (this.f6367q != null) {
                        this.f6356f.getDecorView().post(this.f6368r);
                    }
                } else {
                    this.f6365o = null;
                }
            }
        }
        AbstractC5876b abstractC5876b2 = this.f6365o;
        if (abstractC5876b2 != null && (fVar = this.f6358h) != null) {
            fVar.onSupportActionModeStarted(abstractC5876b2);
        }
        return this.f6365o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.g
    public View createView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z8;
        if (this.f6352Z == null) {
            String string = this.f6355e.obtainStyledAttributes(AbstractC5572j.AppCompatTheme).getString(AbstractC5572j.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                this.f6352Z = new androidx.appcompat.app.l();
            } else {
                try {
                    this.f6352Z = (androidx.appcompat.app.l) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    this.f6352Z = new androidx.appcompat.app.l();
                }
            }
        }
        boolean z9 = f6323c0;
        boolean zA0 = false;
        if (z9) {
            if (this.f6353a0 == null) {
                this.f6353a0 = new androidx.appcompat.app.m();
            }
            if (this.f6353a0.a(attributeSet)) {
                z8 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zA0 = a0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zA0 = true;
                }
                z8 = zA0;
            }
        } else {
            z8 = zA0;
        }
        return this.f6352Z.q(view, str, context, attributeSet, z8, z9, true, x0.shouldBeUsed());
    }

    @Override // androidx.appcompat.app.g
    public <T extends View> T findViewById(int i8) {
        t();
        return (T) this.f6356f.findViewById(i8);
    }

    final int g0(C0950d1 c0950d1, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z8;
        boolean z9;
        int systemWindowInsetTop = c0950d1 != null ? c0950d1.getSystemWindowInsetTop() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f6366p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z8 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6366p.getLayoutParams();
            if (this.f6366p.isShown()) {
                if (this.f6350X == null) {
                    this.f6350X = new Rect();
                    this.f6351Y = new Rect();
                }
                Rect rect2 = this.f6350X;
                Rect rect3 = this.f6351Y;
                if (c0950d1 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c0950d1.getSystemWindowInsetLeft(), c0950d1.getSystemWindowInsetTop(), c0950d1.getSystemWindowInsetRight(), c0950d1.getSystemWindowInsetBottom());
                }
                y0.computeFitSystemWindows(this.f6372v, rect2, rect3);
                int i8 = rect2.top;
                int i9 = rect2.left;
                int i10 = rect2.right;
                C0950d1 rootWindowInsets = AbstractC0985p0.getRootWindowInsets(this.f6372v);
                int systemWindowInsetLeft = rootWindowInsets == null ? 0 : rootWindowInsets.getSystemWindowInsetLeft();
                int systemWindowInsetRight = rootWindowInsets == null ? 0 : rootWindowInsets.getSystemWindowInsetRight();
                if (marginLayoutParams.topMargin == i8 && marginLayoutParams.leftMargin == i9 && marginLayoutParams.rightMargin == i10) {
                    z9 = false;
                } else {
                    marginLayoutParams.topMargin = i8;
                    marginLayoutParams.leftMargin = i9;
                    marginLayoutParams.rightMargin = i10;
                    z9 = true;
                }
                if (i8 <= 0 || this.f6374x != null) {
                    View view = this.f6374x;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i11 = marginLayoutParams2.height;
                        int i12 = marginLayoutParams.topMargin;
                        if (i11 != i12 || marginLayoutParams2.leftMargin != systemWindowInsetLeft || marginLayoutParams2.rightMargin != systemWindowInsetRight) {
                            marginLayoutParams2.height = i12;
                            marginLayoutParams2.leftMargin = systemWindowInsetLeft;
                            marginLayoutParams2.rightMargin = systemWindowInsetRight;
                            this.f6374x.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f6355e);
                    this.f6374x = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = systemWindowInsetLeft;
                    layoutParams.rightMargin = systemWindowInsetRight;
                    this.f6372v.addView(this.f6374x, -1, layoutParams);
                }
                View view3 = this.f6374x;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    h0(this.f6374x);
                }
                if (!this.f6329C && z) {
                    systemWindowInsetTop = 0;
                }
                z8 = z;
                z = z9;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z8 = false;
            } else {
                z8 = false;
                z = false;
            }
            if (z) {
                this.f6366p.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f6374x;
        if (view4 != null) {
            view4.setVisibility(z8 ? 0 : 8);
        }
        return systemWindowInsetTop;
    }

    @Override // androidx.appcompat.app.g
    public final androidx.appcompat.app.b getDrawerToggleDelegate() {
        return new f();
    }

    @Override // androidx.appcompat.app.g
    public int getLocalNightMode() {
        return this.f6340N;
    }

    @Override // androidx.appcompat.app.g
    public MenuInflater getMenuInflater() {
        if (this.f6360j == null) {
            D();
            androidx.appcompat.app.a aVar = this.f6359i;
            this.f6360j = new l.g(aVar != null ? aVar.getThemedContext() : this.f6355e);
        }
        return this.f6360j;
    }

    @Override // androidx.appcompat.app.g
    public androidx.appcompat.app.a getSupportActionBar() {
        D();
        return this.f6359i;
    }

    @Override // androidx.appcompat.app.g
    public boolean hasWindowFeature(int i8) {
        int iY = Y(i8);
        return (iY != 1 ? iY != 2 ? iY != 5 ? iY != 10 ? iY != 108 ? iY != 109 ? false : this.f6328B : this.f6327A : this.f6329C : this.f6376z : this.f6375y : this.f6331E) || this.f6356f.hasFeature(i8);
    }

    void i(int i8, s sVar, Menu menu) {
        if (menu == null) {
            if (sVar == null && i8 >= 0) {
                s[] sVarArr = this.f6333G;
                if (i8 < sVarArr.length) {
                    sVar = sVarArr[i8];
                }
            }
            if (sVar != null) {
                menu = sVar.f6406j;
            }
        }
        if ((sVar == null || sVar.f6411o) && !this.f6339M) {
            this.f6357g.getWrapped().onPanelClosed(i8, menu);
        }
    }

    @Override // androidx.appcompat.app.g
    public void installViewFactory() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f6355e);
        if (layoutInflaterFrom.getFactory() == null) {
            D.setFactory2(layoutInflaterFrom, this);
        } else {
            boolean z8 = layoutInflaterFrom.getFactory2() instanceof h;
        }
    }

    @Override // androidx.appcompat.app.g
    public void invalidateOptionsMenu() {
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar == null || !supportActionBar.invalidateOptionsMenu()) {
            H(0);
        }
    }

    @Override // androidx.appcompat.app.g
    public boolean isHandleNativeActionModesEnabled() {
        return this.f6370t;
    }

    void j(androidx.appcompat.view.menu.e eVar) {
        if (this.f6332F) {
            return;
        }
        this.f6332F = true;
        this.f6362l.dismissPopups();
        Window.Callback callbackC = C();
        if (callbackC != null && !this.f6339M) {
            callbackC.onPanelClosed(androidx.appcompat.app.g.FEATURE_SUPPORT_ACTION_BAR, eVar);
        }
        this.f6332F = false;
    }

    void l(int i8) {
        m(A(i8, true), true);
    }

    void m(s sVar, boolean z8) {
        ViewGroup viewGroup;
        O o8;
        if (z8 && sVar.f6397a == 0 && (o8 = this.f6362l) != null && o8.isOverflowMenuShowing()) {
            j(sVar.f6406j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f6355e.getSystemService("window");
        if (windowManager != null && sVar.f6411o && (viewGroup = sVar.f6403g) != null) {
            windowManager.removeView(viewGroup);
            if (z8) {
                i(sVar.f6397a, sVar, null);
            }
        }
        sVar.f6409m = false;
        sVar.f6410n = false;
        sVar.f6411o = false;
        sVar.f6404h = null;
        sVar.f6412p = true;
        if (this.f6334H == sVar) {
            this.f6334H = null;
        }
    }

    @Override // androidx.appcompat.app.g
    public void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        androidx.appcompat.app.a supportActionBar;
        if (this.f6327A && this.f6371u && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.onConfigurationChanged(configuration);
        }
        C0850j.get().onConfigurationChanged(this.f6355e);
        e(false);
    }

    @Override // androidx.appcompat.app.g
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        String parentActivityName;
        this.f6336J = true;
        e(false);
        u();
        Object obj = this.f6354d;
        if (obj instanceof Activity) {
            try {
                parentActivityName = androidx.core.app.l.getParentActivityName((Activity) obj);
            } catch (IllegalArgumentException unused) {
                parentActivityName = null;
            }
            if (parentActivityName != null) {
                androidx.appcompat.app.a aVarU = U();
                if (aVarU == null) {
                    this.f6349W = true;
                } else {
                    aVarU.setDefaultDisplayHomeAsUpEnabled(true);
                }
            }
            androidx.appcompat.app.g.a(this);
        }
        this.f6337K = true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return createView(view, str, context, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    @Override // androidx.appcompat.app.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDestroy() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f6354d
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.g.c(r3)
        L9:
            boolean r0 = r3.f6346T
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f6356f
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f6348V
            r0.removeCallbacks(r1)
        L18:
            r0 = 0
            r3.f6338L = r0
            r0 = 1
            r3.f6339M = r0
            int r0 = r3.f6340N
            r1 = -100
            if (r0 == r1) goto L48
            java.lang.Object r0 = r3.f6354d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L48
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L48
            O.h r0 = androidx.appcompat.app.h.f6322b0
            java.lang.Object r1 = r3.f6354d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f6340N
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L57
        L48:
            O.h r0 = androidx.appcompat.app.h.f6322b0
            java.lang.Object r1 = r3.f6354d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L57:
            androidx.appcompat.app.a r0 = r3.f6359i
            if (r0 == 0) goto L5e
            r0.a()
        L5e:
            r3.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.onDestroy():void");
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean onMenuItemSelected(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        s sVarV;
        Window.Callback callbackC = C();
        if (callbackC == null || this.f6339M || (sVarV = v(eVar.getRootMenu())) == null) {
            return false;
        }
        return callbackC.onMenuItemSelected(sVarV.f6397a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void onMenuModeChange(androidx.appcompat.view.menu.e eVar) {
        X(true);
    }

    @Override // androidx.appcompat.app.g
    public void onPostCreate(Bundle bundle) {
        t();
    }

    @Override // androidx.appcompat.app.g
    public void onPostResume() {
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(true);
        }
    }

    @Override // androidx.appcompat.app.g
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.g
    public void onStart() {
        this.f6338L = true;
        applyDayNight();
    }

    @Override // androidx.appcompat.app.g
    public void onStop() {
        this.f6338L = false;
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(false);
        }
    }

    void p() {
        androidx.appcompat.view.menu.e eVar;
        O o8 = this.f6362l;
        if (o8 != null) {
            o8.dismissPopups();
        }
        if (this.f6367q != null) {
            this.f6356f.getDecorView().removeCallbacks(this.f6368r);
            if (this.f6367q.isShowing()) {
                try {
                    this.f6367q.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f6367q = null;
        }
        s();
        s sVarA = A(0, false);
        if (sVarA == null || (eVar = sVarA.f6406j) == null) {
            return;
        }
        eVar.close();
    }

    boolean q(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f6354d;
        if (((obj instanceof C.a) || (obj instanceof androidx.appcompat.app.k)) && (decorView = this.f6356f.getDecorView()) != null && C.dispatchBeforeHierarchy(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f6357g.getWrapped().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? L(keyCode, keyEvent) : O(keyCode, keyEvent);
    }

    void r(int i8) {
        s sVarA;
        s sVarA2 = A(i8, true);
        if (sVarA2.f6406j != null) {
            Bundle bundle = new Bundle();
            sVarA2.f6406j.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                sVarA2.f6414r = bundle;
            }
            sVarA2.f6406j.stopDispatchingItemsChanged();
            sVarA2.f6406j.clear();
        }
        sVarA2.f6413q = true;
        sVarA2.f6412p = true;
        if ((i8 != 108 && i8 != 0) || this.f6362l == null || (sVarA = A(0, false)) == null) {
            return;
        }
        sVarA.f6409m = false;
        W(sVarA, null);
    }

    @Override // androidx.appcompat.app.g
    public boolean requestWindowFeature(int i8) {
        int iY = Y(i8);
        if (this.f6331E && iY == 108) {
            return false;
        }
        if (this.f6327A && iY == 1) {
            this.f6327A = false;
        }
        if (iY == 1) {
            c0();
            this.f6331E = true;
            return true;
        }
        if (iY == 2) {
            c0();
            this.f6375y = true;
            return true;
        }
        if (iY == 5) {
            c0();
            this.f6376z = true;
            return true;
        }
        if (iY == 10) {
            c0();
            this.f6329C = true;
            return true;
        }
        if (iY == 108) {
            c0();
            this.f6327A = true;
            return true;
        }
        if (iY != 109) {
            return this.f6356f.requestFeature(iY);
        }
        c0();
        this.f6328B = true;
        return true;
    }

    void s() {
        C1001x0 c1001x0 = this.f6369s;
        if (c1001x0 != null) {
            c1001x0.cancel();
        }
    }

    @Override // androidx.appcompat.app.g
    public void setContentView(View view) {
        t();
        ViewGroup viewGroup = (ViewGroup) this.f6372v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f6357g.getWrapped().onContentChanged();
    }

    @Override // androidx.appcompat.app.g
    public void setHandleNativeActionModesEnabled(boolean z8) {
        this.f6370t = z8;
    }

    @Override // androidx.appcompat.app.g
    public void setLocalNightMode(int i8) {
        if (this.f6340N != i8) {
            this.f6340N = i8;
            if (this.f6336J) {
                applyDayNight();
            }
        }
    }

    @Override // androidx.appcompat.app.g
    public void setSupportActionBar(Toolbar toolbar) {
        if (this.f6354d instanceof Activity) {
            androidx.appcompat.app.a supportActionBar = getSupportActionBar();
            if (supportActionBar instanceof androidx.appcompat.app.s) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f6360j = null;
            if (supportActionBar != null) {
                supportActionBar.a();
            }
            if (toolbar != null) {
                androidx.appcompat.app.p pVar = new androidx.appcompat.app.p(toolbar, B(), this.f6357g);
                this.f6359i = pVar;
                this.f6356f.setCallback(pVar.getWrappedWindowCallback());
            } else {
                this.f6359i = null;
                this.f6356f.setCallback(this.f6357g);
            }
            invalidateOptionsMenu();
        }
    }

    @Override // androidx.appcompat.app.g
    public void setTheme(int i8) {
        this.f6341O = i8;
    }

    @Override // androidx.appcompat.app.g
    public final void setTitle(CharSequence charSequence) {
        this.f6361k = charSequence;
        O o8 = this.f6362l;
        if (o8 != null) {
            o8.setWindowTitle(charSequence);
            return;
        }
        if (U() != null) {
            U().setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.f6373w;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.g
    public AbstractC5876b startSupportActionMode(AbstractC5876b.a aVar) {
        androidx.appcompat.app.f fVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC5876b abstractC5876b = this.f6365o;
        if (abstractC5876b != null) {
            abstractC5876b.finish();
        }
        C0111h c0111h = new C0111h(aVar);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            AbstractC5876b abstractC5876bStartActionMode = supportActionBar.startActionMode(c0111h);
            this.f6365o = abstractC5876bStartActionMode;
            if (abstractC5876bStartActionMode != null && (fVar = this.f6358h) != null) {
                fVar.onSupportActionModeStarted(abstractC5876bStartActionMode);
            }
        }
        if (this.f6365o == null) {
            this.f6365o = b0(c0111h);
        }
        return this.f6365o;
    }

    s v(Menu menu) {
        s[] sVarArr = this.f6333G;
        int length = sVarArr != null ? sVarArr.length : 0;
        for (int i8 = 0; i8 < length; i8++) {
            s sVar = sVarArr[i8];
            if (sVar != null && sVar.f6406j == menu) {
                return sVar;
            }
        }
        return null;
    }

    final Context x() {
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        Context themedContext = supportActionBar != null ? supportActionBar.getThemedContext() : null;
        return themedContext == null ? this.f6355e : themedContext;
    }

    h(Dialog dialog, androidx.appcompat.app.f fVar) {
        this(dialog.getContext(), dialog.getWindow(), fVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    h(Context context, Window window, androidx.appcompat.app.f fVar) {
        this(context, window, fVar, context);
    }

    h(Context context, Activity activity, androidx.appcompat.app.f fVar) {
        this(context, null, fVar, activity);
    }

    private h(Context context, Window window, androidx.appcompat.app.f fVar, Object obj) {
        androidx.appcompat.app.e eVarD0;
        this.f6369s = null;
        this.f6370t = true;
        this.f6340N = -100;
        this.f6348V = new a();
        this.f6355e = context;
        this.f6358h = fVar;
        this.f6354d = obj;
        if (this.f6340N == -100 && (obj instanceof Dialog) && (eVarD0 = d0()) != null) {
            this.f6340N = eVarD0.getDelegate().getLocalNightMode();
        }
        if (this.f6340N == -100) {
            O.h hVar = f6322b0;
            Integer num = (Integer) hVar.get(obj.getClass().getName());
            if (num != null) {
                this.f6340N = num.intValue();
                hVar.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            g(window);
        }
        C0850j.preload();
    }

    @Override // androidx.appcompat.app.g
    public void setContentView(int i8) {
        t();
        ViewGroup viewGroup = (ViewGroup) this.f6372v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f6355e).inflate(i8, viewGroup);
        this.f6357g.getWrapped().onContentChanged();
    }

    @Override // androidx.appcompat.app.g
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t();
        ViewGroup viewGroup = (ViewGroup) this.f6372v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f6357g.getWrapped().onContentChanged();
    }
}
