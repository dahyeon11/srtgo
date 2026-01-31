package androidx.core.graphics;

import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Field f9014a;

    /* renamed from: b, reason: collision with root package name */
    private static final Method f9015b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f9016c;

    /* renamed from: d, reason: collision with root package name */
    private static final Constructor f9017d;

    /* renamed from: e, reason: collision with root package name */
    private static final O.e f9018e;

    /* renamed from: f, reason: collision with root package name */
    private static final Object f9019f;

    static {
        Field declaredField;
        Constructor declaredConstructor;
        Method declaredMethod;
        Method declaredMethod2;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod("nativeCreateFromTypeface", cls, cls2);
            declaredMethod.setAccessible(true);
            declaredMethod2 = Typeface.class.getDeclaredMethod("nativeCreateWeightAlias", cls, cls2);
            declaredMethod2.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e8) {
            Log.e("WeightTypeface", e8.getClass().getName(), e8);
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
            declaredMethod2 = null;
        }
        f9014a = declaredField;
        f9015b = declaredMethod;
        f9016c = declaredMethod2;
        f9017d = declaredConstructor;
        f9018e = new O.e(3);
        f9019f = new Object();
    }

    private static Typeface a(long j8) {
        try {
            return (Typeface) f9017d.newInstance(Long.valueOf(j8));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    static Typeface b(Typeface typeface, int i8, boolean z8) {
        if (!d()) {
            return null;
        }
        int i9 = (i8 << 1) | (z8 ? 1 : 0);
        synchronized (f9019f) {
            try {
                long jC = c(typeface);
                O.e eVar = f9018e;
                SparseArray sparseArray = (SparseArray) eVar.get(jC);
                if (sparseArray == null) {
                    sparseArray = new SparseArray(4);
                    eVar.put(jC, sparseArray);
                } else {
                    Typeface typeface2 = (Typeface) sparseArray.get(i9);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                Typeface typefaceA = z8 == typeface.isItalic() ? a(f(jC, i8)) : a(e(jC, i8, z8));
                sparseArray.put(i9, typefaceA);
                return typefaceA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static long c(Typeface typeface) {
        try {
            return f9014a.getLong(typeface);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        }
    }

    private static boolean d() {
        return f9014a != null;
    }

    private static long e(long j8, int i8, boolean z8) {
        try {
            Long l8 = (Long) f9015b.invoke(null, Long.valueOf(j8), Integer.valueOf(z8 ? 2 : 0));
            l8.longValue();
            return ((Long) f9016c.invoke(null, l8, Integer.valueOf(i8))).longValue();
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    private static long f(long j8, int i8) {
        try {
            return ((Long) f9016c.invoke(null, Long.valueOf(j8), Integer.valueOf(i8))).longValue();
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }
}
