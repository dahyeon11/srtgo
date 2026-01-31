package androidx.core.view;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import androidx.core.view.accessibility.AbstractC0927b;

/* loaded from: classes.dex */
public final class H1 {
    public static final int BEHAVIOR_DEFAULT = 1;

    @Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_SWIPE = 1;

    @Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_TOUCH = 0;
    public static final int BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE = 2;

    /* renamed from: a, reason: collision with root package name */
    private final e f9121a;

    private static class a extends e {

        /* renamed from: a, reason: collision with root package name */
        protected final Window f9122a;

        /* renamed from: b, reason: collision with root package name */
        private final C0949d0 f9123b;

        a(Window window, C0949d0 c0949d0) {
            this.f9122a = window;
            this.f9123b = c0949d0;
        }

        private void h(int i8) {
            if (i8 == 1) {
                i(4);
            } else if (i8 == 2) {
                i(2);
            } else {
                if (i8 != 8) {
                    return;
                }
                this.f9123b.hide();
            }
        }

        private void k(int i8) {
            if (i8 == 1) {
                l(4);
                m(1024);
            } else if (i8 == 2) {
                l(2);
            } else {
                if (i8 != 8) {
                    return;
                }
                this.f9123b.show();
            }
        }

        @Override // androidx.core.view.H1.e
        void a(f fVar) {
        }

        @Override // androidx.core.view.H1.e
        void b(int i8, long j8, Interpolator interpolator, CancellationSignal cancellationSignal, R0 r02) {
        }

        @Override // androidx.core.view.H1.e
        int c() {
            return 0;
        }

        @Override // androidx.core.view.H1.e
        void d(int i8) {
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) != 0) {
                    h(i9);
                }
            }
        }

        @Override // androidx.core.view.H1.e
        void e(f fVar) {
        }

        @Override // androidx.core.view.H1.e
        void f(int i8) {
            if (i8 == 0) {
                l(6144);
                return;
            }
            if (i8 == 1) {
                l(4096);
                i(2048);
            } else {
                if (i8 != 2) {
                    return;
                }
                l(2048);
                i(4096);
            }
        }

        @Override // androidx.core.view.H1.e
        void g(int i8) {
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) != 0) {
                    k(i9);
                }
            }
        }

        protected void i(int i8) {
            View decorView = this.f9122a.getDecorView();
            decorView.setSystemUiVisibility(i8 | decorView.getSystemUiVisibility());
        }

        protected void j(int i8) {
            this.f9122a.addFlags(i8);
        }

        protected void l(int i8) {
            View decorView = this.f9122a.getDecorView();
            decorView.setSystemUiVisibility((~i8) & decorView.getSystemUiVisibility());
        }

        protected void m(int i8) {
            this.f9122a.clearFlags(i8);
        }
    }

    private static class b extends a {
        b(Window window, C0949d0 c0949d0) {
            super(window, c0949d0);
        }

        @Override // androidx.core.view.H1.e
        public boolean isAppearanceLightStatusBars() {
            return (this.f9122a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.H1.e
        public void setAppearanceLightStatusBars(boolean z8) {
            if (!z8) {
                l(8192);
                return;
            }
            m(AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL);
            j(Integer.MIN_VALUE);
            i(8192);
        }
    }

    private static class c extends b {
        c(Window window, C0949d0 c0949d0) {
            super(window, c0949d0);
        }

        @Override // androidx.core.view.H1.e
        public boolean isAppearanceLightNavigationBars() {
            return (this.f9122a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.H1.e
        public void setAppearanceLightNavigationBars(boolean z8) {
            if (!z8) {
                l(16);
                return;
            }
            m(134217728);
            j(Integer.MIN_VALUE);
            i(16);
        }
    }

    private static class e {
        e() {
        }

        abstract void a(f fVar);

        abstract void b(int i8, long j8, Interpolator interpolator, CancellationSignal cancellationSignal, R0 r02);

        abstract int c();

        abstract void d(int i8);

        abstract void e(f fVar);

        abstract void f(int i8);

        abstract void g(int i8);

        public boolean isAppearanceLightNavigationBars() {
            return false;
        }

        public boolean isAppearanceLightStatusBars() {
            return false;
        }

        public void setAppearanceLightNavigationBars(boolean z8) {
        }

        public void setAppearanceLightStatusBars(boolean z8) {
        }
    }

    public interface f {
        void a(H1 h12, int i8);
    }

    private H1(WindowInsetsController windowInsetsController) {
        this.f9121a = new d(windowInsetsController, this, new C0949d0(windowInsetsController));
    }

    @Deprecated
    public static H1 toWindowInsetsControllerCompat(WindowInsetsController windowInsetsController) {
        return new H1(windowInsetsController);
    }

    public void addOnControllableInsetsChangedListener(f fVar) {
        this.f9121a.a(fVar);
    }

    public void controlWindowInsetsAnimation(int i8, long j8, Interpolator interpolator, CancellationSignal cancellationSignal, R0 r02) {
        this.f9121a.b(i8, j8, interpolator, cancellationSignal, r02);
    }

    public int getSystemBarsBehavior() {
        return this.f9121a.c();
    }

    public void hide(int i8) {
        this.f9121a.d(i8);
    }

    public boolean isAppearanceLightNavigationBars() {
        return this.f9121a.isAppearanceLightNavigationBars();
    }

    public boolean isAppearanceLightStatusBars() {
        return this.f9121a.isAppearanceLightStatusBars();
    }

    public void removeOnControllableInsetsChangedListener(f fVar) {
        this.f9121a.e(fVar);
    }

    public void setAppearanceLightNavigationBars(boolean z8) {
        this.f9121a.setAppearanceLightNavigationBars(z8);
    }

    public void setAppearanceLightStatusBars(boolean z8) {
        this.f9121a.setAppearanceLightStatusBars(z8);
    }

    public void setSystemBarsBehavior(int i8) {
        this.f9121a.f(i8);
    }

    public void show(int i8) {
        this.f9121a.g(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final H1 f9124a;

        /* renamed from: b, reason: collision with root package name */
        final WindowInsetsController f9125b;

        /* renamed from: c, reason: collision with root package name */
        final C0949d0 f9126c;

        /* renamed from: d, reason: collision with root package name */
        private final O.h f9127d;

        /* renamed from: e, reason: collision with root package name */
        protected Window f9128e;

        class a implements WindowInsetsAnimationControlListener {

            /* renamed from: a, reason: collision with root package name */
            private C0947c1 f9129a = null;

            a(R0 r02) {
            }

            public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
                throw null;
            }

            public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
                throw null;
            }

            public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i8) {
                this.f9129a = new C0947c1(windowInsetsAnimationController);
                throw null;
            }
        }

        d(Window window, H1 h12, C0949d0 c0949d0) {
            this(window.getInsetsController(), h12, c0949d0);
            this.f9128e = window;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(f fVar, WindowInsetsController windowInsetsController, int i8) {
            if (this.f9125b == windowInsetsController) {
                fVar.a(this.f9124a, i8);
            }
        }

        @Override // androidx.core.view.H1.e
        void a(final f fVar) {
            if (this.f9127d.containsKey(fVar)) {
                return;
            }
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener(fVar) { // from class: androidx.core.view.P1
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i8) {
                    this.f9137a.i(null, windowInsetsController, i8);
                }
            };
            this.f9127d.put(fVar, onControllableInsetsChangedListener);
            this.f9125b.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        }

        @Override // androidx.core.view.H1.e
        void b(int i8, long j8, Interpolator interpolator, CancellationSignal cancellationSignal, R0 r02) {
            this.f9125b.controlWindowInsetsAnimation(i8, j8, interpolator, cancellationSignal, new a(r02));
        }

        @Override // androidx.core.view.H1.e
        int c() {
            return this.f9125b.getSystemBarsBehavior();
        }

        @Override // androidx.core.view.H1.e
        void d(int i8) {
            if ((i8 & 8) != 0) {
                this.f9126c.hide();
            }
            this.f9125b.hide(i8 & (-9));
        }

        @Override // androidx.core.view.H1.e
        void e(f fVar) {
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListenerA = N1.a(this.f9127d.remove(fVar));
            if (onControllableInsetsChangedListenerA != null) {
                this.f9125b.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListenerA);
            }
        }

        @Override // androidx.core.view.H1.e
        void f(int i8) {
            this.f9125b.setSystemBarsBehavior(i8);
        }

        @Override // androidx.core.view.H1.e
        void g(int i8) {
            if ((i8 & 8) != 0) {
                this.f9126c.show();
            }
            this.f9125b.show(i8 & (-9));
        }

        @Override // androidx.core.view.H1.e
        public boolean isAppearanceLightNavigationBars() {
            this.f9125b.setSystemBarsAppearance(0, 0);
            return (this.f9125b.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.H1.e
        public boolean isAppearanceLightStatusBars() {
            this.f9125b.setSystemBarsAppearance(0, 0);
            return (this.f9125b.getSystemBarsAppearance() & 8) != 0;
        }

        protected void j(int i8) {
            View decorView = this.f9128e.getDecorView();
            decorView.setSystemUiVisibility(i8 | decorView.getSystemUiVisibility());
        }

        protected void k(int i8) {
            View decorView = this.f9128e.getDecorView();
            decorView.setSystemUiVisibility((~i8) & decorView.getSystemUiVisibility());
        }

        @Override // androidx.core.view.H1.e
        public void setAppearanceLightNavigationBars(boolean z8) {
            if (z8) {
                if (this.f9128e != null) {
                    j(16);
                }
                this.f9125b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f9128e != null) {
                    k(16);
                }
                this.f9125b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.H1.e
        public void setAppearanceLightStatusBars(boolean z8) {
            if (z8) {
                if (this.f9128e != null) {
                    j(8192);
                }
                this.f9125b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f9128e != null) {
                    k(8192);
                }
                this.f9125b.setSystemBarsAppearance(0, 8);
            }
        }

        d(WindowInsetsController windowInsetsController, H1 h12, C0949d0 c0949d0) {
            this.f9127d = new O.h();
            this.f9125b = windowInsetsController;
            this.f9124a = h12;
            this.f9126c = c0949d0;
        }
    }

    public H1(Window window, View view) {
        C0949d0 c0949d0 = new C0949d0(view);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            this.f9121a = new d(window, this, c0949d0);
        } else if (i8 >= 26) {
            this.f9121a = new c(window, c0949d0);
        } else {
            this.f9121a = new b(window, c0949d0);
        }
    }
}
