package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.view.C0950d1;
import h0.C5573a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    private e f9085a;

    public static abstract class b {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;

        /* renamed from: a, reason: collision with root package name */
        WindowInsets f9088a;

        /* renamed from: b, reason: collision with root package name */
        private final int f9089b;

        public b(int i8) {
            this.f9089b = i8;
        }

        public final int getDispatchMode() {
            return this.f9089b;
        }

        public void onEnd(D0 d02) {
        }

        public void onPrepare(D0 d02) {
        }

        public abstract C0950d1 onProgress(C0950d1 c0950d1, List<D0> list);

        public a onStart(D0 d02, a aVar) {
            return aVar;
        }
    }

    private static class c extends e {

        /* renamed from: f, reason: collision with root package name */
        private static final Interpolator f9090f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: g, reason: collision with root package name */
        private static final Interpolator f9091g = new C5573a();

        /* renamed from: h, reason: collision with root package name */
        private static final Interpolator f9092h = new DecelerateInterpolator();

        private static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            final b f9093a;

            /* renamed from: b, reason: collision with root package name */
            private C0950d1 f9094b;

            /* renamed from: androidx.core.view.D0$c$a$a, reason: collision with other inner class name */
            class C0140a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ D0 f9095a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C0950d1 f9096b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C0950d1 f9097c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f9098d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ View f9099e;

                C0140a(D0 d02, C0950d1 c0950d1, C0950d1 c0950d12, int i8, View view) {
                    this.f9095a = d02;
                    this.f9096b = c0950d1;
                    this.f9097c = c0950d12;
                    this.f9098d = i8;
                    this.f9099e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f9095a.setFraction(valueAnimator.getAnimatedFraction());
                    c.g(this.f9099e, c.k(this.f9096b, this.f9097c, this.f9095a.getInterpolatedFraction(), this.f9098d), Collections.singletonList(this.f9095a));
                }
            }

            class b extends AnimatorListenerAdapter {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ D0 f9101a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f9102b;

                b(D0 d02, View view) {
                    this.f9101a = d02;
                    this.f9102b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f9101a.setFraction(1.0f);
                    c.e(this.f9102b, this.f9101a);
                }
            }

            /* renamed from: androidx.core.view.D0$c$a$c, reason: collision with other inner class name */
            class RunnableC0141c implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ View f9104a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ D0 f9105b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ a f9106c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ ValueAnimator f9107d;

                RunnableC0141c(View view, D0 d02, a aVar, ValueAnimator valueAnimator) {
                    this.f9104a = view;
                    this.f9105b = d02;
                    this.f9106c = aVar;
                    this.f9107d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.h(this.f9104a, this.f9105b, this.f9106c);
                    this.f9107d.start();
                }
            }

            a(View view, b bVar) {
                this.f9093a = bVar;
                C0950d1 rootWindowInsets = AbstractC0985p0.getRootWindowInsets(view);
                this.f9094b = rootWindowInsets != null ? new C0950d1.b(rootWindowInsets).build() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f9094b = C0950d1.toWindowInsetsCompat(windowInsets, view);
                    return c.i(view, windowInsets);
                }
                C0950d1 windowInsetsCompat = C0950d1.toWindowInsetsCompat(windowInsets, view);
                if (this.f9094b == null) {
                    this.f9094b = AbstractC0985p0.getRootWindowInsets(view);
                }
                if (this.f9094b == null) {
                    this.f9094b = windowInsetsCompat;
                    return c.i(view, windowInsets);
                }
                b bVarJ = c.j(view);
                if (bVarJ != null && Objects.equals(bVarJ.f9088a, windowInsets)) {
                    return c.i(view, windowInsets);
                }
                int iA = c.a(windowInsetsCompat, this.f9094b);
                if (iA == 0) {
                    return c.i(view, windowInsets);
                }
                C0950d1 c0950d1 = this.f9094b;
                D0 d02 = new D0(iA, c.c(iA, windowInsetsCompat, c0950d1), 160L);
                d02.setFraction(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(d02.getDurationMillis());
                a aVarB = c.b(windowInsetsCompat, c0950d1, iA);
                c.f(view, d02, windowInsets, false);
                duration.addUpdateListener(new C0140a(d02, windowInsetsCompat, c0950d1, iA, view));
                duration.addListener(new b(d02, view));
                Z.add(view, new RunnableC0141c(view, d02, aVarB, duration));
                this.f9094b = windowInsetsCompat;
                return c.i(view, windowInsets);
            }
        }

        c(int i8, Interpolator interpolator, long j8) {
            super(i8, interpolator, j8);
        }

        static int a(C0950d1 c0950d1, C0950d1 c0950d12) {
            int i8 = 0;
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if (!c0950d1.getInsets(i9).equals(c0950d12.getInsets(i9))) {
                    i8 |= i9;
                }
            }
            return i8;
        }

        static a b(C0950d1 c0950d1, C0950d1 c0950d12, int i8) {
            androidx.core.graphics.b insets = c0950d1.getInsets(i8);
            androidx.core.graphics.b insets2 = c0950d12.getInsets(i8);
            return new a(androidx.core.graphics.b.of(Math.min(insets.left, insets2.left), Math.min(insets.top, insets2.top), Math.min(insets.right, insets2.right), Math.min(insets.bottom, insets2.bottom)), androidx.core.graphics.b.of(Math.max(insets.left, insets2.left), Math.max(insets.top, insets2.top), Math.max(insets.right, insets2.right), Math.max(insets.bottom, insets2.bottom)));
        }

        static Interpolator c(int i8, C0950d1 c0950d1, C0950d1 c0950d12) {
            return (i8 & 8) != 0 ? c0950d1.getInsets(C0950d1.m.ime()).bottom > c0950d12.getInsets(C0950d1.m.ime()).bottom ? f9090f : f9091g : f9092h;
        }

        private static View.OnApplyWindowInsetsListener d(View view, b bVar) {
            return new a(view, bVar);
        }

        static void e(View view, D0 d02) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                bVarJ.onEnd(d02);
                if (bVarJ.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    e(viewGroup.getChildAt(i8), d02);
                }
            }
        }

        static void f(View view, D0 d02, WindowInsets windowInsets, boolean z8) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                bVarJ.f9088a = windowInsets;
                if (!z8) {
                    bVarJ.onPrepare(d02);
                    z8 = bVarJ.getDispatchMode() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    f(viewGroup.getChildAt(i8), d02, windowInsets, z8);
                }
            }
        }

        static void g(View view, C0950d1 c0950d1, List list) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                c0950d1 = bVarJ.onProgress(c0950d1, list);
                if (bVarJ.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    g(viewGroup.getChildAt(i8), c0950d1, list);
                }
            }
        }

        static void h(View view, D0 d02, a aVar) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                bVarJ.onStart(d02, aVar);
                if (bVarJ.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    h(viewGroup.getChildAt(i8), d02, aVar);
                }
            }
        }

        static WindowInsets i(View view, WindowInsets windowInsets) {
            return view.getTag(U.e.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static b j(View view) {
            Object tag = view.getTag(U.e.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f9093a;
            }
            return null;
        }

        static C0950d1 k(C0950d1 c0950d1, C0950d1 c0950d12, float f8, int i8) {
            C0950d1.b bVar = new C0950d1.b(c0950d1);
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) == 0) {
                    bVar.setInsets(i9, c0950d1.getInsets(i9));
                } else {
                    androidx.core.graphics.b insets = c0950d1.getInsets(i9);
                    androidx.core.graphics.b insets2 = c0950d12.getInsets(i9);
                    float f9 = 1.0f - f8;
                    bVar.setInsets(i9, C0950d1.b(insets, (int) (((insets.left - insets2.left) * f9) + 0.5d), (int) (((insets.top - insets2.top) * f9) + 0.5d), (int) (((insets.right - insets2.right) * f9) + 0.5d), (int) (((insets.bottom - insets2.bottom) * f9) + 0.5d)));
                }
            }
            return bVar.build();
        }

        static void setCallback(View view, b bVar) {
            Object tag = view.getTag(U.e.tag_on_apply_window_listener);
            if (bVar == null) {
                view.setTag(U.e.tag_window_insets_animation_callback, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerD = d(view, bVar);
            view.setTag(U.e.tag_window_insets_animation_callback, onApplyWindowInsetsListenerD);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerD);
            }
        }
    }

    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final int f9114a;

        /* renamed from: b, reason: collision with root package name */
        private float f9115b;

        /* renamed from: c, reason: collision with root package name */
        private final Interpolator f9116c;

        /* renamed from: d, reason: collision with root package name */
        private final long f9117d;

        /* renamed from: e, reason: collision with root package name */
        private float f9118e;

        e(int i8, Interpolator interpolator, long j8) {
            this.f9114a = i8;
            this.f9116c = interpolator;
            this.f9117d = j8;
        }

        public float getAlpha() {
            return this.f9118e;
        }

        public long getDurationMillis() {
            return this.f9117d;
        }

        public float getFraction() {
            return this.f9115b;
        }

        public float getInterpolatedFraction() {
            Interpolator interpolator = this.f9116c;
            return interpolator != null ? interpolator.getInterpolation(this.f9115b) : this.f9115b;
        }

        public Interpolator getInterpolator() {
            return this.f9116c;
        }

        public int getTypeMask() {
            return this.f9114a;
        }

        public void setAlpha(float f8) {
            this.f9118e = f8;
        }

        public void setFraction(float f8) {
            this.f9115b = f8;
        }
    }

    public D0(int i8, Interpolator interpolator, long j8) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f9085a = new d(i8, interpolator, j8);
        } else {
            this.f9085a = new c(i8, interpolator, j8);
        }
    }

    static void a(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.setCallback(view, bVar);
        } else {
            c.setCallback(view, bVar);
        }
    }

    static D0 b(WindowInsetsAnimation windowInsetsAnimation) {
        return new D0(windowInsetsAnimation);
    }

    public float getAlpha() {
        return this.f9085a.getAlpha();
    }

    public long getDurationMillis() {
        return this.f9085a.getDurationMillis();
    }

    public float getFraction() {
        return this.f9085a.getFraction();
    }

    public float getInterpolatedFraction() {
        return this.f9085a.getInterpolatedFraction();
    }

    public Interpolator getInterpolator() {
        return this.f9085a.getInterpolator();
    }

    public int getTypeMask() {
        return this.f9085a.getTypeMask();
    }

    public void setAlpha(float f8) {
        this.f9085a.setAlpha(f8);
    }

    public void setFraction(float f8) {
        this.f9085a.setFraction(f8);
    }

    private static class d extends e {

        /* renamed from: f, reason: collision with root package name */
        private final WindowInsetsAnimation f9109f;

        private static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a, reason: collision with root package name */
            private final b f9110a;

            /* renamed from: b, reason: collision with root package name */
            private List f9111b;

            /* renamed from: c, reason: collision with root package name */
            private ArrayList f9112c;

            /* renamed from: d, reason: collision with root package name */
            private final HashMap f9113d;

            a(b bVar) {
                super(bVar.getDispatchMode());
                this.f9113d = new HashMap();
                this.f9110a = bVar;
            }

            private D0 a(WindowInsetsAnimation windowInsetsAnimation) {
                D0 d02 = (D0) this.f9113d.get(windowInsetsAnimation);
                if (d02 != null) {
                    return d02;
                }
                D0 d0B = D0.b(windowInsetsAnimation);
                this.f9113d.put(windowInsetsAnimation, d0B);
                return d0B;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f9110a.onEnd(a(windowInsetsAnimation));
                this.f9113d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f9110a.onPrepare(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList arrayList = this.f9112c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f9112c = arrayList2;
                    this.f9111b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationA = Q0.a(list.get(size));
                    D0 d0A = a(windowInsetsAnimationA);
                    d0A.setFraction(windowInsetsAnimationA.getFraction());
                    this.f9112c.add(d0A);
                }
                return this.f9110a.onProgress(C0950d1.toWindowInsetsCompat(windowInsets), this.f9111b).toWindowInsets();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f9110a.onStart(a(windowInsetsAnimation), a.toBoundsCompat(bounds)).toBounds();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f9109f = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds createPlatformBounds(a aVar) {
            G0.a();
            return F0.a(aVar.getLowerBound().toPlatformInsets(), aVar.getUpperBound().toPlatformInsets());
        }

        public static androidx.core.graphics.b getHigherBounds(WindowInsetsAnimation.Bounds bounds) {
            return androidx.core.graphics.b.toCompatInsets(bounds.getUpperBound());
        }

        public static androidx.core.graphics.b getLowerBounds(WindowInsetsAnimation.Bounds bounds) {
            return androidx.core.graphics.b.toCompatInsets(bounds.getLowerBound());
        }

        public static void setCallback(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // androidx.core.view.D0.e
        public long getDurationMillis() {
            return this.f9109f.getDurationMillis();
        }

        @Override // androidx.core.view.D0.e
        public float getFraction() {
            return this.f9109f.getFraction();
        }

        @Override // androidx.core.view.D0.e
        public float getInterpolatedFraction() {
            return this.f9109f.getInterpolatedFraction();
        }

        @Override // androidx.core.view.D0.e
        public Interpolator getInterpolator() {
            return this.f9109f.getInterpolator();
        }

        @Override // androidx.core.view.D0.e
        public int getTypeMask() {
            return this.f9109f.getTypeMask();
        }

        @Override // androidx.core.view.D0.e
        public void setFraction(float f8) {
            this.f9109f.setFraction(f8);
        }

        d(int i8, Interpolator interpolator, long j8) {
            this(P0.a(i8, interpolator, j8));
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.core.graphics.b f9086a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.core.graphics.b f9087b;

        public a(androidx.core.graphics.b bVar, androidx.core.graphics.b bVar2) {
            this.f9086a = bVar;
            this.f9087b = bVar2;
        }

        public static a toBoundsCompat(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public androidx.core.graphics.b getLowerBound() {
            return this.f9086a;
        }

        public androidx.core.graphics.b getUpperBound() {
            return this.f9087b;
        }

        public a inset(androidx.core.graphics.b bVar) {
            return new a(C0950d1.b(this.f9086a, bVar.left, bVar.top, bVar.right, bVar.bottom), C0950d1.b(this.f9087b, bVar.left, bVar.top, bVar.right, bVar.bottom));
        }

        public WindowInsetsAnimation.Bounds toBounds() {
            return d.createPlatformBounds(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f9086a + " upper=" + this.f9087b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f9086a = d.getLowerBounds(bounds);
            this.f9087b = d.getHigherBounds(bounds);
        }
    }

    private D0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f9085a = new d(windowInsetsAnimation);
        }
    }
}
