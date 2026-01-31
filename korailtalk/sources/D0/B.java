package D0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.AbstractC0985p0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
abstract class B {

    /* renamed from: a, reason: collision with root package name */
    private static final O f717a;

    /* renamed from: b, reason: collision with root package name */
    static final Property f718b;

    /* renamed from: c, reason: collision with root package name */
    static final Property f719c;

    static class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(B.c(view));
        }

        @Override // android.util.Property
        public void set(View view, Float f8) {
            B.g(view, f8.floatValue());
        }
    }

    static class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Rect get(View view) {
            return AbstractC0985p0.getClipBounds(view);
        }

        @Override // android.util.Property
        public void set(View view, Rect rect) {
            AbstractC0985p0.setClipBounds(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f717a = new N();
        } else {
            f717a = new M();
        }
        f718b = new a(Float.class, "translationAlpha");
        f719c = new b(Rect.class, "clipBounds");
    }

    static void a(View view) {
        f717a.clearNonTransitionAlpha(view);
    }

    static A b(View view) {
        return new z(view);
    }

    static float c(View view) {
        return f717a.getTransitionAlpha(view);
    }

    static S d(View view) {
        return new Q(view);
    }

    static void e(View view) {
        f717a.saveNonTransitionAlpha(view);
    }

    static void f(View view, int i8, int i9, int i10, int i11) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        f717a.setLeftTopRightBottom(view, i8, i9, i10, i11);
    }

    static void g(View view, float f8) {
        f717a.setTransitionAlpha(view, f8);
    }

    static void h(View view, int i8) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        f717a.setTransitionVisibility(view, i8);
    }

    static void i(View view, Matrix matrix) {
        f717a.transformMatrixToGlobal(view, matrix);
    }

    static void j(View view, Matrix matrix) {
        f717a.transformMatrixToLocal(view, matrix);
    }
}
