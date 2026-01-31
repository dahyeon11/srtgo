package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.content.res.e;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private static final Field f9011a;

    /* renamed from: b, reason: collision with root package name */
    private static final O.e f9012b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f9013c;

    static {
        Field declaredField;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
        } catch (Exception e8) {
            Log.e("WeightTypeface", e8.getClass().getName(), e8);
            declaredField = null;
        }
        f9011a = declaredField;
        f9012b = new O.e(3);
        f9013c = new Object();
    }

    static Typeface a(j jVar, Context context, Typeface typeface, int i8, boolean z8) {
        if (!d()) {
            return null;
        }
        int i9 = (i8 << 1) | (z8 ? 1 : 0);
        synchronized (f9013c) {
            try {
                long jC = c(typeface);
                O.e eVar = f9012b;
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
                Typeface typefaceB = b(jVar, context, typeface, i8, z8);
                if (typefaceB == null) {
                    typefaceB = e(typeface, i8, z8);
                }
                sparseArray.put(i9, typefaceB);
                return typefaceB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Typeface b(j jVar, Context context, Typeface typeface, int i8, boolean z8) throws NoSuchFieldException, SecurityException {
        e.c cVarJ = jVar.j(typeface);
        if (cVarJ == null) {
            return null;
        }
        return jVar.b(context, cVarJ, context.getResources(), i8, z8);
    }

    private static long c(Typeface typeface) {
        try {
            return ((Number) f9011a.get(typeface)).longValue();
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        }
    }

    private static boolean d() {
        return f9011a != null;
    }

    private static Typeface e(Typeface typeface, int i8, boolean z8) {
        boolean z9 = i8 >= 600;
        return Typeface.create(typeface, (z9 || z8) ? !z9 ? 2 : !z8 ? 1 : 3 : 0);
    }
}
