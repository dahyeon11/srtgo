package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class h {
    public static final int ID_NULL = 0;

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f8954a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f8955b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f8956c = new Object();

    static class a {
        static Drawable a(Resources resources, int i8, Resources.Theme theme) {
            return resources.getDrawable(i8, theme);
        }

        static Drawable b(Resources resources, int i8, int i9, Resources.Theme theme) {
            return resources.getDrawableForDensity(i8, i9, theme);
        }
    }

    static class b {
        static int a(Resources resources, int i8, Resources.Theme theme) {
            return resources.getColor(i8, theme);
        }

        static ColorStateList b(Resources resources, int i8, Resources.Theme theme) {
            return resources.getColorStateList(i8, theme);
        }
    }

    static class c {
        static float a(Resources resources, int i8) {
            return resources.getFloat(i8);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        final ColorStateList f8957a;

        /* renamed from: b, reason: collision with root package name */
        final Configuration f8958b;

        /* renamed from: c, reason: collision with root package name */
        final int f8959c;

        d(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f8957a = colorStateList;
            this.f8958b = configuration;
            this.f8959c = theme == null ? 0 : theme.hashCode();
        }
    }

    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        final Resources f8960a;

        /* renamed from: b, reason: collision with root package name */
        final Resources.Theme f8961b;

        e(Resources resources, Resources.Theme theme) {
            this.f8960a = resources;
            this.f8961b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f8960a.equals(eVar.f8960a) && Z.c.equals(this.f8961b, eVar.f8961b);
        }

        public int hashCode() {
            return Z.c.hash(this.f8960a, this.f8961b);
        }
    }

    public static abstract class f {
        public static Handler getHandler(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void callbackFailAsync(final int i8, Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: androidx.core.content.res.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8967a.c(i8);
                }
            });
        }

        public final void callbackSuccessAsync(final Typeface typeface, Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: androidx.core.content.res.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8965a.d(typeface);
                }
            });
        }

        /* renamed from: onFontRetrievalFailed, reason: merged with bridge method [inline-methods] */
        public abstract void c(int i8);

        /* renamed from: onFontRetrieved, reason: merged with bridge method [inline-methods] */
        public abstract void d(Typeface typeface);
    }

    public static final class g {

        static class a {

            /* renamed from: a, reason: collision with root package name */
            private static final Object f8962a = new Object();

            /* renamed from: b, reason: collision with root package name */
            private static Method f8963b;

            /* renamed from: c, reason: collision with root package name */
            private static boolean f8964c;

            static void a(Resources.Theme theme) {
                synchronized (f8962a) {
                    if (!f8964c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            f8963b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                        }
                        f8964c = true;
                    }
                    Method method = f8963b;
                    if (method != null) {
                        try {
                            method.invoke(theme, null);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                            f8963b = null;
                        }
                    }
                }
            }
        }

        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void rebase(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    private static void a(e eVar, int i8, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f8956c) {
            try {
                WeakHashMap weakHashMap = f8955b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(eVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(eVar, sparseArray);
                }
                sparseArray.append(i8, new d(colorStateList, eVar.f8960a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f8959c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.res.ColorStateList b(androidx.core.content.res.h.e r5, int r6) {
        /*
            java.lang.Object r0 = androidx.core.content.res.h.f8956c
            monitor-enter(r0)
            java.util.WeakHashMap r1 = androidx.core.content.res.h.f8955b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            androidx.core.content.res.h$d r2 = (androidx.core.content.res.h.d) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f8958b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f8960a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f8961b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f8959c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f8959c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f8957a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.h.b(androidx.core.content.res.h$e, int):android.content.res.ColorStateList");
    }

    private static TypedValue c() {
        ThreadLocal threadLocal = f8954a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static void clearCachesForTheme(Resources.Theme theme) {
        synchronized (f8956c) {
            try {
                Iterator it = f8955b.keySet().iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (eVar != null && theme.equals(eVar.f8961b)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static ColorStateList d(Resources resources, int i8, Resources.Theme theme) {
        if (e(resources, i8)) {
            return null;
        }
        try {
            return androidx.core.content.res.c.createFromXml(resources, resources.getXml(i8), theme);
        } catch (Exception e8) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e8);
            return null;
        }
    }

    private static boolean e(Resources resources, int i8) throws Resources.NotFoundException {
        TypedValue typedValueC = c();
        resources.getValue(i8, typedValueC, true);
        int i9 = typedValueC.type;
        return i9 >= 28 && i9 <= 31;
    }

    private static Typeface f(Context context, int i8, TypedValue typedValue, int i9, f fVar, Handler handler, boolean z8, boolean z9) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        resources.getValue(i8, typedValue, true);
        Typeface typefaceG = g(context, resources, typedValue, i8, i9, fVar, handler, z8, z9);
        if (typefaceG != null || fVar != null || z9) {
            return typefaceG;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i8) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface g(android.content.Context r16, android.content.res.Resources r17, android.util.TypedValue r18, int r19, int r20, androidx.core.content.res.h.f r21, android.os.Handler r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.h.g(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.h$f, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }

    public static Typeface getCachedFont(Context context, int i8) {
        if (context.isRestricted()) {
            return null;
        }
        return f(context, i8, new TypedValue(), 0, null, null, false, true);
    }

    public static int getColor(Resources resources, int i8, Resources.Theme theme) {
        return b.a(resources, i8, theme);
    }

    public static ColorStateList getColorStateList(Resources resources, int i8, Resources.Theme theme) {
        e eVar = new e(resources, theme);
        ColorStateList colorStateListB = b(eVar, i8);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListD = d(resources, i8, theme);
        if (colorStateListD == null) {
            return b.b(resources, i8, theme);
        }
        a(eVar, i8, colorStateListD, theme);
        return colorStateListD;
    }

    public static Drawable getDrawable(Resources resources, int i8, Resources.Theme theme) {
        return a.a(resources, i8, theme);
    }

    public static Drawable getDrawableForDensity(Resources resources, int i8, int i9, Resources.Theme theme) {
        return a.b(resources, i8, i9, theme);
    }

    public static float getFloat(Resources resources, int i8) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 29) {
            return c.a(resources, i8);
        }
        TypedValue typedValueC = c();
        resources.getValue(i8, typedValueC, true);
        if (typedValueC.type == 4) {
            return typedValueC.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i8) + " type #0x" + Integer.toHexString(typedValueC.type) + " is not valid");
    }

    public static Typeface getFont(Context context, int i8) {
        if (context.isRestricted()) {
            return null;
        }
        return f(context, i8, new TypedValue(), 0, null, null, false, false);
    }

    public static void getFont(Context context, int i8, f fVar, Handler handler) throws Resources.NotFoundException {
        Z.h.checkNotNull(fVar);
        if (context.isRestricted()) {
            fVar.callbackFailAsync(-4, handler);
        } else {
            f(context, i8, new TypedValue(), 0, fVar, handler, false, false);
        }
    }

    public static Typeface getFont(Context context, int i8, TypedValue typedValue, int i9, f fVar) {
        if (context.isRestricted()) {
            return null;
        }
        return f(context, i8, typedValue, i9, fVar, null, true, false);
    }
}
