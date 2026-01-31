package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: androidx.core.view.d1 */
/* loaded from: classes.dex */
public class C0950d1 {
    public static final C0950d1 CONSUMED;

    /* renamed from: a */
    private final l f9185a;

    /* renamed from: androidx.core.view.d1$a */
    static class a {

        /* renamed from: a */
        private static Field f9186a;

        /* renamed from: b */
        private static Field f9187b;

        /* renamed from: c */
        private static Field f9188c;

        /* renamed from: d */
        private static boolean f9189d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f9186a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f9187b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f9188c = declaredField3;
                declaredField3.setAccessible(true);
                f9189d = true;
            } catch (ReflectiveOperationException e8) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e8.getMessage(), e8);
            }
        }

        public static C0950d1 getRootWindowInsets(View view) throws IllegalAccessException, IllegalArgumentException {
            if (f9189d && view.isAttachedToWindow()) {
                try {
                    Object obj = f9186a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f9187b.get(obj);
                        Rect rect2 = (Rect) f9188c.get(obj);
                        if (rect != null && rect2 != null) {
                            C0950d1 c0950d1Build = new b().setStableInsets(androidx.core.graphics.b.of(rect)).setSystemWindowInsets(androidx.core.graphics.b.of(rect2)).build();
                            c0950d1Build.e(c0950d1Build);
                            c0950d1Build.a(view.getRootView());
                            return c0950d1Build;
                        }
                    }
                } catch (IllegalAccessException e8) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e8.getMessage(), e8);
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.core.view.d1$e */
    private static class e extends d {
        e() {
        }

        @Override // androidx.core.view.C0950d1.f
        void d(int i8, androidx.core.graphics.b bVar) {
            this.f9197c.setInsets(n.a(i8), bVar.toPlatformInsets());
        }

        @Override // androidx.core.view.C0950d1.f
        void e(int i8, androidx.core.graphics.b bVar) throws IllegalArgumentException {
            this.f9197c.setInsetsIgnoringVisibility(n.a(i8), bVar.toPlatformInsets());
        }

        @Override // androidx.core.view.C0950d1.f
        void k(int i8, boolean z8) {
            this.f9197c.setVisible(n.a(i8), z8);
        }

        e(C0950d1 c0950d1) {
            super(c0950d1);
        }
    }

    /* renamed from: androidx.core.view.d1$f */
    private static class f {

        /* renamed from: a */
        private final C0950d1 f9198a;

        /* renamed from: b */
        androidx.core.graphics.b[] f9199b;

        f() {
            this(new C0950d1((C0950d1) null));
        }

        protected final void a() {
            androidx.core.graphics.b[] bVarArr = this.f9199b;
            if (bVarArr != null) {
                androidx.core.graphics.b insets = bVarArr[m.b(1)];
                androidx.core.graphics.b insets2 = this.f9199b[m.b(2)];
                if (insets2 == null) {
                    insets2 = this.f9198a.getInsets(2);
                }
                if (insets == null) {
                    insets = this.f9198a.getInsets(1);
                }
                i(androidx.core.graphics.b.max(insets, insets2));
                androidx.core.graphics.b bVar = this.f9199b[m.b(16)];
                if (bVar != null) {
                    h(bVar);
                }
                androidx.core.graphics.b bVar2 = this.f9199b[m.b(32)];
                if (bVar2 != null) {
                    f(bVar2);
                }
                androidx.core.graphics.b bVar3 = this.f9199b[m.b(64)];
                if (bVar3 != null) {
                    j(bVar3);
                }
            }
        }

        abstract C0950d1 b();

        void c(C1002y c1002y) {
        }

        void d(int i8, androidx.core.graphics.b bVar) {
            if (this.f9199b == null) {
                this.f9199b = new androidx.core.graphics.b[9];
            }
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) != 0) {
                    this.f9199b[m.b(i9)] = bVar;
                }
            }
        }

        void e(int i8, androidx.core.graphics.b bVar) {
            if (i8 == 8) {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        void f(androidx.core.graphics.b bVar) {
        }

        abstract void g(androidx.core.graphics.b bVar);

        void h(androidx.core.graphics.b bVar) {
        }

        abstract void i(androidx.core.graphics.b bVar);

        void j(androidx.core.graphics.b bVar) {
        }

        void k(int i8, boolean z8) {
        }

        f(C0950d1 c0950d1) {
            this.f9198a = c0950d1;
        }
    }

    /* renamed from: androidx.core.view.d1$i */
    private static class i extends h {
        i(C0950d1 c0950d1, WindowInsets windowInsets) {
            super(c0950d1, windowInsets);
        }

        @Override // androidx.core.view.C0950d1.l
        C0950d1 a() {
            return C0950d1.toWindowInsetsCompat(this.f9205c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.C0950d1.g, androidx.core.view.C0950d1.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f9205c, iVar.f9205c) && Objects.equals(this.f9209g, iVar.f9209g);
        }

        @Override // androidx.core.view.C0950d1.l
        C1002y f() {
            return C1002y.c(this.f9205c.getDisplayCutout());
        }

        @Override // androidx.core.view.C0950d1.l
        public int hashCode() {
            return this.f9205c.hashCode();
        }

        i(C0950d1 c0950d1, i iVar) {
            super(c0950d1, iVar);
        }
    }

    /* renamed from: androidx.core.view.d1$k */
    private static class k extends j {

        /* renamed from: q */
        static final C0950d1 f9214q = C0950d1.toWindowInsetsCompat(WindowInsets.CONSUMED);

        k(C0950d1 c0950d1, WindowInsets windowInsets) {
            super(c0950d1, windowInsets);
        }

        @Override // androidx.core.view.C0950d1.g, androidx.core.view.C0950d1.l
        final void d(View view) {
        }

        @Override // androidx.core.view.C0950d1.g, androidx.core.view.C0950d1.l
        public androidx.core.graphics.b getInsets(int i8) {
            return androidx.core.graphics.b.toCompatInsets(this.f9205c.getInsets(n.a(i8)));
        }

        @Override // androidx.core.view.C0950d1.g, androidx.core.view.C0950d1.l
        public androidx.core.graphics.b getInsetsIgnoringVisibility(int i8) {
            return androidx.core.graphics.b.toCompatInsets(this.f9205c.getInsetsIgnoringVisibility(n.a(i8)));
        }

        @Override // androidx.core.view.C0950d1.g, androidx.core.view.C0950d1.l
        public boolean isVisible(int i8) {
            return this.f9205c.isVisible(n.a(i8));
        }

        k(C0950d1 c0950d1, k kVar) {
            super(c0950d1, kVar);
        }
    }

    /* renamed from: androidx.core.view.d1$l */
    private static class l {

        /* renamed from: b */
        static final C0950d1 f9215b = new b().build().consumeDisplayCutout().consumeStableInsets().consumeSystemWindowInsets();

        /* renamed from: a */
        final C0950d1 f9216a;

        l(C0950d1 c0950d1) {
            this.f9216a = c0950d1;
        }

        C0950d1 a() {
            return this.f9216a;
        }

        C0950d1 b() {
            return this.f9216a;
        }

        C0950d1 c() {
            return this.f9216a;
        }

        void d(View view) {
        }

        void e(C0950d1 c0950d1) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return n() == lVar.n() && m() == lVar.m() && Z.c.equals(j(), lVar.j()) && Z.c.equals(h(), lVar.h()) && Z.c.equals(f(), lVar.f());
        }

        C1002y f() {
            return null;
        }

        androidx.core.graphics.b g() {
            return j();
        }

        androidx.core.graphics.b getInsets(int i8) {
            return androidx.core.graphics.b.NONE;
        }

        androidx.core.graphics.b getInsetsIgnoringVisibility(int i8) {
            if ((i8 & 8) == 0) {
                return androidx.core.graphics.b.NONE;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        androidx.core.graphics.b h() {
            return androidx.core.graphics.b.NONE;
        }

        public int hashCode() {
            return Z.c.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), f());
        }

        androidx.core.graphics.b i() {
            return j();
        }

        boolean isVisible(int i8) {
            return true;
        }

        androidx.core.graphics.b j() {
            return androidx.core.graphics.b.NONE;
        }

        androidx.core.graphics.b k() {
            return j();
        }

        C0950d1 l(int i8, int i9, int i10, int i11) {
            return f9215b;
        }

        boolean m() {
            return false;
        }

        boolean n() {
            return false;
        }

        void o(androidx.core.graphics.b bVar) {
        }

        void p(C0950d1 c0950d1) {
        }

        public void setOverriddenInsets(androidx.core.graphics.b[] bVarArr) {
        }

        public void setStableInsets(androidx.core.graphics.b bVar) {
        }
    }

    /* renamed from: androidx.core.view.d1$m */
    public static final class m {
        static int a() {
            return -1;
        }

        static int b(int i8) {
            if (i8 == 1) {
                return 0;
            }
            if (i8 == 2) {
                return 1;
            }
            if (i8 == 4) {
                return 2;
            }
            if (i8 == 8) {
                return 3;
            }
            if (i8 == 16) {
                return 4;
            }
            if (i8 == 32) {
                return 5;
            }
            if (i8 == 64) {
                return 6;
            }
            if (i8 == 128) {
                return 7;
            }
            if (i8 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i8);
        }

        public static int captionBar() {
            return 4;
        }

        public static int displayCutout() {
            return 128;
        }

        public static int ime() {
            return 8;
        }

        public static int mandatorySystemGestures() {
            return 32;
        }

        public static int navigationBars() {
            return 2;
        }

        public static int statusBars() {
            return 1;
        }

        public static int systemBars() {
            return 7;
        }

        public static int systemGestures() {
            return 16;
        }

        public static int tappableElement() {
            return 64;
        }
    }

    /* renamed from: androidx.core.view.d1$n */
    private static final class n {
        static int a(int i8) {
            int iStatusBars;
            int i9 = 0;
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if ((i8 & i10) != 0) {
                    if (i10 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i10 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i10 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i10 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i10 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i10 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i10 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i10 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i9 |= iStatusBars;
                }
            }
            return i9;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            CONSUMED = k.f9214q;
        } else {
            CONSUMED = l.f9215b;
        }
    }

    private C0950d1(WindowInsets windowInsets) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            this.f9185a = new k(this, windowInsets);
            return;
        }
        if (i8 >= 29) {
            this.f9185a = new j(this, windowInsets);
        } else if (i8 >= 28) {
            this.f9185a = new i(this, windowInsets);
        } else {
            this.f9185a = new h(this, windowInsets);
        }
    }

    static androidx.core.graphics.b b(androidx.core.graphics.b bVar, int i8, int i9, int i10, int i11) {
        int iMax = Math.max(0, bVar.left - i8);
        int iMax2 = Math.max(0, bVar.top - i9);
        int iMax3 = Math.max(0, bVar.right - i10);
        int iMax4 = Math.max(0, bVar.bottom - i11);
        return (iMax == i8 && iMax2 == i9 && iMax3 == i10 && iMax4 == i11) ? bVar : androidx.core.graphics.b.of(iMax, iMax2, iMax3, iMax4);
    }

    public static C0950d1 toWindowInsetsCompat(WindowInsets windowInsets) {
        return toWindowInsetsCompat(windowInsets, null);
    }

    void a(View view) {
        this.f9185a.d(view);
    }

    void c(androidx.core.graphics.b[] bVarArr) {
        this.f9185a.setOverriddenInsets(bVarArr);
    }

    @Deprecated
    public C0950d1 consumeDisplayCutout() {
        return this.f9185a.a();
    }

    @Deprecated
    public C0950d1 consumeStableInsets() {
        return this.f9185a.b();
    }

    @Deprecated
    public C0950d1 consumeSystemWindowInsets() {
        return this.f9185a.c();
    }

    void d(androidx.core.graphics.b bVar) {
        this.f9185a.o(bVar);
    }

    void e(C0950d1 c0950d1) {
        this.f9185a.p(c0950d1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0950d1) {
            return Z.c.equals(this.f9185a, ((C0950d1) obj).f9185a);
        }
        return false;
    }

    void f(androidx.core.graphics.b bVar) {
        this.f9185a.setStableInsets(bVar);
    }

    public C1002y getDisplayCutout() {
        return this.f9185a.f();
    }

    public androidx.core.graphics.b getInsets(int i8) {
        return this.f9185a.getInsets(i8);
    }

    public androidx.core.graphics.b getInsetsIgnoringVisibility(int i8) {
        return this.f9185a.getInsetsIgnoringVisibility(i8);
    }

    @Deprecated
    public androidx.core.graphics.b getMandatorySystemGestureInsets() {
        return this.f9185a.g();
    }

    @Deprecated
    public int getStableInsetBottom() {
        return this.f9185a.h().bottom;
    }

    @Deprecated
    public int getStableInsetLeft() {
        return this.f9185a.h().left;
    }

    @Deprecated
    public int getStableInsetRight() {
        return this.f9185a.h().right;
    }

    @Deprecated
    public int getStableInsetTop() {
        return this.f9185a.h().top;
    }

    @Deprecated
    public androidx.core.graphics.b getStableInsets() {
        return this.f9185a.h();
    }

    @Deprecated
    public androidx.core.graphics.b getSystemGestureInsets() {
        return this.f9185a.i();
    }

    @Deprecated
    public int getSystemWindowInsetBottom() {
        return this.f9185a.j().bottom;
    }

    @Deprecated
    public int getSystemWindowInsetLeft() {
        return this.f9185a.j().left;
    }

    @Deprecated
    public int getSystemWindowInsetRight() {
        return this.f9185a.j().right;
    }

    @Deprecated
    public int getSystemWindowInsetTop() {
        return this.f9185a.j().top;
    }

    @Deprecated
    public androidx.core.graphics.b getSystemWindowInsets() {
        return this.f9185a.j();
    }

    @Deprecated
    public androidx.core.graphics.b getTappableElementInsets() {
        return this.f9185a.k();
    }

    public boolean hasInsets() {
        androidx.core.graphics.b insets = getInsets(m.a());
        androidx.core.graphics.b bVar = androidx.core.graphics.b.NONE;
        return (insets.equals(bVar) && getInsetsIgnoringVisibility(m.a() ^ m.ime()).equals(bVar) && getDisplayCutout() == null) ? false : true;
    }

    @Deprecated
    public boolean hasStableInsets() {
        return !this.f9185a.h().equals(androidx.core.graphics.b.NONE);
    }

    @Deprecated
    public boolean hasSystemWindowInsets() {
        return !this.f9185a.j().equals(androidx.core.graphics.b.NONE);
    }

    public int hashCode() {
        l lVar = this.f9185a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public C0950d1 inset(androidx.core.graphics.b bVar) {
        return inset(bVar.left, bVar.top, bVar.right, bVar.bottom);
    }

    public boolean isConsumed() {
        return this.f9185a.m();
    }

    public boolean isRound() {
        return this.f9185a.n();
    }

    public boolean isVisible(int i8) {
        return this.f9185a.isVisible(i8);
    }

    @Deprecated
    public C0950d1 replaceSystemWindowInsets(int i8, int i9, int i10, int i11) {
        return new b(this).setSystemWindowInsets(androidx.core.graphics.b.of(i8, i9, i10, i11)).build();
    }

    public WindowInsets toWindowInsets() {
        l lVar = this.f9185a;
        if (lVar instanceof g) {
            return ((g) lVar).f9205c;
        }
        return null;
    }

    /* renamed from: androidx.core.view.d1$c */
    private static class c extends f {

        /* renamed from: e */
        private static Field f9191e = null;

        /* renamed from: f */
        private static boolean f9192f = false;

        /* renamed from: g */
        private static Constructor f9193g = null;

        /* renamed from: h */
        private static boolean f9194h = false;

        /* renamed from: c */
        private WindowInsets f9195c;

        /* renamed from: d */
        private androidx.core.graphics.b f9196d;

        c() {
            this.f9195c = l();
        }

        private static WindowInsets l() {
            if (!f9192f) {
                try {
                    f9191e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f9192f = true;
            }
            Field field = f9191e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f9194h) {
                try {
                    f9193g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f9194h = true;
            }
            Constructor constructor = f9193g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // androidx.core.view.C0950d1.f
        C0950d1 b() {
            a();
            C0950d1 windowInsetsCompat = C0950d1.toWindowInsetsCompat(this.f9195c);
            windowInsetsCompat.c(this.f9199b);
            windowInsetsCompat.f(this.f9196d);
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.C0950d1.f
        void g(androidx.core.graphics.b bVar) {
            this.f9196d = bVar;
        }

        @Override // androidx.core.view.C0950d1.f
        void i(androidx.core.graphics.b bVar) {
            WindowInsets windowInsets = this.f9195c;
            if (windowInsets != null) {
                this.f9195c = windowInsets.replaceSystemWindowInsets(bVar.left, bVar.top, bVar.right, bVar.bottom);
            }
        }

        c(C0950d1 c0950d1) {
            super(c0950d1);
            this.f9195c = c0950d1.toWindowInsets();
        }
    }

    /* renamed from: androidx.core.view.d1$d */
    private static class d extends f {

        /* renamed from: c */
        final WindowInsets.Builder f9197c;

        d() {
            this.f9197c = AbstractC0977m1.a();
        }

        @Override // androidx.core.view.C0950d1.f
        C0950d1 b() {
            a();
            C0950d1 windowInsetsCompat = C0950d1.toWindowInsetsCompat(this.f9197c.build());
            windowInsetsCompat.c(this.f9199b);
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.C0950d1.f
        void c(C1002y c1002y) {
            this.f9197c.setDisplayCutout(c1002y != null ? c1002y.b() : null);
        }

        @Override // androidx.core.view.C0950d1.f
        void f(androidx.core.graphics.b bVar) {
            this.f9197c.setMandatorySystemGestureInsets(bVar.toPlatformInsets());
        }

        @Override // androidx.core.view.C0950d1.f
        void g(androidx.core.graphics.b bVar) {
            this.f9197c.setStableInsets(bVar.toPlatformInsets());
        }

        @Override // androidx.core.view.C0950d1.f
        void h(androidx.core.graphics.b bVar) {
            this.f9197c.setSystemGestureInsets(bVar.toPlatformInsets());
        }

        @Override // androidx.core.view.C0950d1.f
        void i(androidx.core.graphics.b bVar) {
            this.f9197c.setSystemWindowInsets(bVar.toPlatformInsets());
        }

        @Override // androidx.core.view.C0950d1.f
        void j(androidx.core.graphics.b bVar) {
            this.f9197c.setTappableElementInsets(bVar.toPlatformInsets());
        }

        d(C0950d1 c0950d1) {
            WindowInsets.Builder builderA;
            super(c0950d1);
            WindowInsets windowInsets = c0950d1.toWindowInsets();
            if (windowInsets != null) {
                builderA = AbstractC0974l1.a(windowInsets);
            } else {
                builderA = AbstractC0977m1.a();
            }
            this.f9197c = builderA;
        }
    }

    /* renamed from: androidx.core.view.d1$h */
    private static class h extends g {

        /* renamed from: m */
        private androidx.core.graphics.b f9210m;

        h(C0950d1 c0950d1, WindowInsets windowInsets) {
            super(c0950d1, windowInsets);
            this.f9210m = null;
        }

        @Override // androidx.core.view.C0950d1.l
        C0950d1 b() {
            return C0950d1.toWindowInsetsCompat(this.f9205c.consumeStableInsets());
        }

        @Override // androidx.core.view.C0950d1.l
        C0950d1 c() {
            return C0950d1.toWindowInsetsCompat(this.f9205c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.C0950d1.l
        final androidx.core.graphics.b h() {
            if (this.f9210m == null) {
                this.f9210m = androidx.core.graphics.b.of(this.f9205c.getStableInsetLeft(), this.f9205c.getStableInsetTop(), this.f9205c.getStableInsetRight(), this.f9205c.getStableInsetBottom());
            }
            return this.f9210m;
        }

        @Override // androidx.core.view.C0950d1.l
        boolean m() {
            return this.f9205c.isConsumed();
        }

        @Override // androidx.core.view.C0950d1.l
        public void setStableInsets(androidx.core.graphics.b bVar) {
            this.f9210m = bVar;
        }

        h(C0950d1 c0950d1, h hVar) {
            super(c0950d1, hVar);
            this.f9210m = null;
            this.f9210m = hVar.f9210m;
        }
    }

    public static C0950d1 toWindowInsetsCompat(WindowInsets windowInsets, View view) {
        C0950d1 c0950d1 = new C0950d1((WindowInsets) Z.h.checkNotNull(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            c0950d1.e(AbstractC0985p0.getRootWindowInsets(view));
            c0950d1.a(view.getRootView());
        }
        return c0950d1;
    }

    public C0950d1 inset(int i8, int i9, int i10, int i11) {
        return this.f9185a.l(i8, i9, i10, i11);
    }

    /* renamed from: androidx.core.view.d1$g */
    private static class g extends l {

        /* renamed from: h */
        private static boolean f9200h = false;

        /* renamed from: i */
        private static Method f9201i;

        /* renamed from: j */
        private static Class f9202j;

        /* renamed from: k */
        private static Field f9203k;

        /* renamed from: l */
        private static Field f9204l;

        /* renamed from: c */
        final WindowInsets f9205c;

        /* renamed from: d */
        private androidx.core.graphics.b[] f9206d;

        /* renamed from: e */
        private androidx.core.graphics.b f9207e;

        /* renamed from: f */
        private C0950d1 f9208f;

        /* renamed from: g */
        androidx.core.graphics.b f9209g;

        g(C0950d1 c0950d1, WindowInsets windowInsets) {
            super(c0950d1);
            this.f9207e = null;
            this.f9205c = windowInsets;
        }

        private androidx.core.graphics.b q(int i8, boolean z8) {
            androidx.core.graphics.b bVarMax = androidx.core.graphics.b.NONE;
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) != 0) {
                    bVarMax = androidx.core.graphics.b.max(bVarMax, r(i9, z8));
                }
            }
            return bVarMax;
        }

        private androidx.core.graphics.b s() {
            C0950d1 c0950d1 = this.f9208f;
            return c0950d1 != null ? c0950d1.getStableInsets() : androidx.core.graphics.b.NONE;
        }

        private androidx.core.graphics.b t(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f9200h) {
                v();
            }
            Method method = f9201i;
            if (method != null && f9202j != null && f9203k != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f9203k.get(f9204l.get(objInvoke));
                    if (rect != null) {
                        return androidx.core.graphics.b.of(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e8) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e8.getMessage(), e8);
                }
            }
            return null;
        }

        private static void v() throws ClassNotFoundException, SecurityException {
            try {
                f9201i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f9202j = cls;
                f9203k = cls.getDeclaredField("mVisibleInsets");
                f9204l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f9203k.setAccessible(true);
                f9204l.setAccessible(true);
            } catch (ReflectiveOperationException e8) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e8.getMessage(), e8);
            }
            f9200h = true;
        }

        @Override // androidx.core.view.C0950d1.l
        void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            androidx.core.graphics.b bVarT = t(view);
            if (bVarT == null) {
                bVarT = androidx.core.graphics.b.NONE;
            }
            o(bVarT);
        }

        @Override // androidx.core.view.C0950d1.l
        void e(C0950d1 c0950d1) {
            c0950d1.e(this.f9208f);
            c0950d1.d(this.f9209g);
        }

        @Override // androidx.core.view.C0950d1.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f9209g, ((g) obj).f9209g);
            }
            return false;
        }

        @Override // androidx.core.view.C0950d1.l
        public androidx.core.graphics.b getInsets(int i8) {
            return q(i8, false);
        }

        @Override // androidx.core.view.C0950d1.l
        public androidx.core.graphics.b getInsetsIgnoringVisibility(int i8) {
            return q(i8, true);
        }

        @Override // androidx.core.view.C0950d1.l
        boolean isVisible(int i8) {
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) != 0 && !u(i9)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.C0950d1.l
        final androidx.core.graphics.b j() {
            if (this.f9207e == null) {
                this.f9207e = androidx.core.graphics.b.of(this.f9205c.getSystemWindowInsetLeft(), this.f9205c.getSystemWindowInsetTop(), this.f9205c.getSystemWindowInsetRight(), this.f9205c.getSystemWindowInsetBottom());
            }
            return this.f9207e;
        }

        @Override // androidx.core.view.C0950d1.l
        C0950d1 l(int i8, int i9, int i10, int i11) {
            b bVar = new b(C0950d1.toWindowInsetsCompat(this.f9205c));
            bVar.setSystemWindowInsets(C0950d1.b(j(), i8, i9, i10, i11));
            bVar.setStableInsets(C0950d1.b(h(), i8, i9, i10, i11));
            return bVar.build();
        }

        @Override // androidx.core.view.C0950d1.l
        boolean n() {
            return this.f9205c.isRound();
        }

        @Override // androidx.core.view.C0950d1.l
        void o(androidx.core.graphics.b bVar) {
            this.f9209g = bVar;
        }

        @Override // androidx.core.view.C0950d1.l
        void p(C0950d1 c0950d1) {
            this.f9208f = c0950d1;
        }

        protected androidx.core.graphics.b r(int i8, boolean z8) {
            androidx.core.graphics.b stableInsets;
            int i9;
            if (i8 == 1) {
                return z8 ? androidx.core.graphics.b.of(0, Math.max(s().top, j().top), 0, 0) : androidx.core.graphics.b.of(0, j().top, 0, 0);
            }
            if (i8 == 2) {
                if (z8) {
                    androidx.core.graphics.b bVarS = s();
                    androidx.core.graphics.b bVarH = h();
                    return androidx.core.graphics.b.of(Math.max(bVarS.left, bVarH.left), 0, Math.max(bVarS.right, bVarH.right), Math.max(bVarS.bottom, bVarH.bottom));
                }
                androidx.core.graphics.b bVarJ = j();
                C0950d1 c0950d1 = this.f9208f;
                stableInsets = c0950d1 != null ? c0950d1.getStableInsets() : null;
                int iMin = bVarJ.bottom;
                if (stableInsets != null) {
                    iMin = Math.min(iMin, stableInsets.bottom);
                }
                return androidx.core.graphics.b.of(bVarJ.left, 0, bVarJ.right, iMin);
            }
            if (i8 != 8) {
                if (i8 == 16) {
                    return i();
                }
                if (i8 == 32) {
                    return g();
                }
                if (i8 == 64) {
                    return k();
                }
                if (i8 != 128) {
                    return androidx.core.graphics.b.NONE;
                }
                C0950d1 c0950d12 = this.f9208f;
                C1002y displayCutout = c0950d12 != null ? c0950d12.getDisplayCutout() : f();
                return displayCutout != null ? androidx.core.graphics.b.of(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom()) : androidx.core.graphics.b.NONE;
            }
            androidx.core.graphics.b[] bVarArr = this.f9206d;
            stableInsets = bVarArr != null ? bVarArr[m.b(8)] : null;
            if (stableInsets != null) {
                return stableInsets;
            }
            androidx.core.graphics.b bVarJ2 = j();
            androidx.core.graphics.b bVarS2 = s();
            int i10 = bVarJ2.bottom;
            if (i10 > bVarS2.bottom) {
                return androidx.core.graphics.b.of(0, 0, 0, i10);
            }
            androidx.core.graphics.b bVar = this.f9209g;
            return (bVar == null || bVar.equals(androidx.core.graphics.b.NONE) || (i9 = this.f9209g.bottom) <= bVarS2.bottom) ? androidx.core.graphics.b.NONE : androidx.core.graphics.b.of(0, 0, 0, i9);
        }

        @Override // androidx.core.view.C0950d1.l
        public void setOverriddenInsets(androidx.core.graphics.b[] bVarArr) {
            this.f9206d = bVarArr;
        }

        protected boolean u(int i8) {
            if (i8 != 1 && i8 != 2) {
                if (i8 == 4) {
                    return false;
                }
                if (i8 != 8 && i8 != 128) {
                    return true;
                }
            }
            return !r(i8, false).equals(androidx.core.graphics.b.NONE);
        }

        g(C0950d1 c0950d1, g gVar) {
            this(c0950d1, new WindowInsets(gVar.f9205c));
        }
    }

    /* renamed from: androidx.core.view.d1$j */
    private static class j extends i {

        /* renamed from: n */
        private androidx.core.graphics.b f9211n;

        /* renamed from: o */
        private androidx.core.graphics.b f9212o;

        /* renamed from: p */
        private androidx.core.graphics.b f9213p;

        j(C0950d1 c0950d1, WindowInsets windowInsets) {
            super(c0950d1, windowInsets);
            this.f9211n = null;
            this.f9212o = null;
            this.f9213p = null;
        }

        @Override // androidx.core.view.C0950d1.l
        androidx.core.graphics.b g() {
            if (this.f9212o == null) {
                this.f9212o = androidx.core.graphics.b.toCompatInsets(this.f9205c.getMandatorySystemGestureInsets());
            }
            return this.f9212o;
        }

        @Override // androidx.core.view.C0950d1.l
        androidx.core.graphics.b i() {
            if (this.f9211n == null) {
                this.f9211n = androidx.core.graphics.b.toCompatInsets(this.f9205c.getSystemGestureInsets());
            }
            return this.f9211n;
        }

        @Override // androidx.core.view.C0950d1.l
        androidx.core.graphics.b k() {
            if (this.f9213p == null) {
                this.f9213p = androidx.core.graphics.b.toCompatInsets(this.f9205c.getTappableElementInsets());
            }
            return this.f9213p;
        }

        @Override // androidx.core.view.C0950d1.g, androidx.core.view.C0950d1.l
        C0950d1 l(int i8, int i9, int i10, int i11) {
            return C0950d1.toWindowInsetsCompat(this.f9205c.inset(i8, i9, i10, i11));
        }

        @Override // androidx.core.view.C0950d1.h, androidx.core.view.C0950d1.l
        public void setStableInsets(androidx.core.graphics.b bVar) {
        }

        j(C0950d1 c0950d1, j jVar) {
            super(c0950d1, jVar);
            this.f9211n = null;
            this.f9212o = null;
            this.f9213p = null;
        }
    }

    @Deprecated
    public C0950d1 replaceSystemWindowInsets(Rect rect) {
        return new b(this).setSystemWindowInsets(androidx.core.graphics.b.of(rect)).build();
    }

    /* renamed from: androidx.core.view.d1$b */
    public static final class b {

        /* renamed from: a */
        private final f f9190a;

        public b() {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30) {
                this.f9190a = new e();
            } else if (i8 >= 29) {
                this.f9190a = new d();
            } else {
                this.f9190a = new c();
            }
        }

        public C0950d1 build() {
            return this.f9190a.b();
        }

        public b setDisplayCutout(C1002y c1002y) {
            this.f9190a.c(c1002y);
            return this;
        }

        public b setInsets(int i8, androidx.core.graphics.b bVar) {
            this.f9190a.d(i8, bVar);
            return this;
        }

        public b setInsetsIgnoringVisibility(int i8, androidx.core.graphics.b bVar) {
            this.f9190a.e(i8, bVar);
            return this;
        }

        @Deprecated
        public b setMandatorySystemGestureInsets(androidx.core.graphics.b bVar) {
            this.f9190a.f(bVar);
            return this;
        }

        @Deprecated
        public b setStableInsets(androidx.core.graphics.b bVar) {
            this.f9190a.g(bVar);
            return this;
        }

        @Deprecated
        public b setSystemGestureInsets(androidx.core.graphics.b bVar) {
            this.f9190a.h(bVar);
            return this;
        }

        @Deprecated
        public b setSystemWindowInsets(androidx.core.graphics.b bVar) {
            this.f9190a.i(bVar);
            return this;
        }

        @Deprecated
        public b setTappableElementInsets(androidx.core.graphics.b bVar) {
            this.f9190a.j(bVar);
            return this;
        }

        public b setVisible(int i8, boolean z8) {
            this.f9190a.k(i8, z8);
            return this;
        }

        public b(C0950d1 c0950d1) {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30) {
                this.f9190a = new e(c0950d1);
            } else if (i8 >= 29) {
                this.f9190a = new d(c0950d1);
            } else {
                this.f9190a = new c(c0950d1);
            }
        }
    }

    public C0950d1(C0950d1 c0950d1) {
        if (c0950d1 != null) {
            l lVar = c0950d1.f9185a;
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30 && (lVar instanceof k)) {
                this.f9185a = new k(this, (k) lVar);
            } else if (i8 >= 29 && (lVar instanceof j)) {
                this.f9185a = new j(this, (j) lVar);
            } else if (i8 >= 28 && (lVar instanceof i)) {
                this.f9185a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f9185a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f9185a = new g(this, (g) lVar);
            } else {
                this.f9185a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f9185a = new l(this);
    }
}
