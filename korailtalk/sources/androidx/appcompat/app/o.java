package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private static Field f6429a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f6430b;

    /* renamed from: c, reason: collision with root package name */
    private static Class f6431c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f6432d;

    /* renamed from: e, reason: collision with root package name */
    private static Field f6433e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f6434f;

    /* renamed from: g, reason: collision with root package name */
    private static Field f6435g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f6436h;

    static void a(Resources resources) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        b(resources);
    }

    private static void b(Resources resources) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Object obj;
        if (!f6436h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f6435g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e8) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e8);
            }
            f6436h = true;
        }
        Field field = f6435g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e9) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e9);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f6430b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f6429a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e10);
            }
            f6430b = true;
        }
        Field field2 = f6429a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e11);
            }
        }
        if (obj2 != null) {
            c(obj2);
        }
    }

    private static void c(Object obj) throws NoSuchFieldException, SecurityException {
        LongSparseArray longSparseArray;
        if (!f6432d) {
            try {
                f6431c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e8) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e8);
            }
            f6432d = true;
        }
        Class cls = f6431c;
        if (cls == null) {
            return;
        }
        if (!f6434f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f6433e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e9) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e9);
            }
            f6434f = true;
        }
        Field field = f6433e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e10) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e10);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
