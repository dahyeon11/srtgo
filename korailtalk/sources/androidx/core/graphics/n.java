package androidx.core.graphics;

import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final Field f9020a;

    /* renamed from: b, reason: collision with root package name */
    private static final Method f9021b;

    /* renamed from: c, reason: collision with root package name */
    private static final Constructor f9022c;

    /* renamed from: d, reason: collision with root package name */
    private static final O.e f9023d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f9024e;

    static {
        Field declaredField;
        Constructor declaredConstructor;
        Method declaredMethod;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod("nativeCreateFromTypefaceWithExactStyle", cls, Integer.TYPE, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e8) {
            Log.e("WeightTypeface", e8.getClass().getName(), e8);
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
        }
        f9020a = declaredField;
        f9021b = declaredMethod;
        f9022c = declaredConstructor;
        f9023d = new O.e(3);
        f9024e = new Object();
    }

    private static Typeface a(long j8) {
        try {
            return (Typeface) f9022c.newInstance(Long.valueOf(j8));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    static Typeface b(Typeface typeface, int i8, boolean z8) {
        if (!d()) {
            return null;
        }
        int i9 = (i8 << 1) | (z8 ? 1 : 0);
        synchronized (f9024e) {
            try {
                long jC = c(typeface);
                O.e eVar = f9023d;
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
                Typeface typefaceA = a(e(jC, i8, z8));
                sparseArray.put(i9, typefaceA);
                return typefaceA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static long c(Typeface typeface) {
        try {
            return f9020a.getLong(typeface);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        }
    }

    private static boolean d() {
        return f9020a != null;
    }

    private static long e(long j8, int i8, boolean z8) {
        try {
            return ((Long) f9021b.invoke(null, Long.valueOf(j8), Integer.valueOf(i8), Boolean.valueOf(z8))).longValue();
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }
}
