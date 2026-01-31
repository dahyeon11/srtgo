package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: androidx.core.app.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0921e {

    /* renamed from: a, reason: collision with root package name */
    protected static final Class f8710a;

    /* renamed from: b, reason: collision with root package name */
    protected static final Field f8711b;

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f8712c;

    /* renamed from: d, reason: collision with root package name */
    protected static final Method f8713d;

    /* renamed from: e, reason: collision with root package name */
    protected static final Method f8714e;

    /* renamed from: f, reason: collision with root package name */
    protected static final Method f8715f;

    /* renamed from: g, reason: collision with root package name */
    private static final Handler f8716g = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.e$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f8717a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f8718b;

        a(d dVar, Object obj) {
            this.f8717a = dVar;
            this.f8718b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8717a.f8723a = this.f8718b;
        }
    }

    /* renamed from: androidx.core.app.e$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f8719a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f8720b;

        b(Application application, d dVar) {
            this.f8719a = application;
            this.f8720b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8719a.unregisterActivityLifecycleCallbacks(this.f8720b);
        }
    }

    /* renamed from: androidx.core.app.e$c */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f8721a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f8722b;

        c(Object obj, Object obj2) {
            this.f8721a = obj;
            this.f8722b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = AbstractC0921e.f8713d;
                if (method != null) {
                    method.invoke(this.f8721a, this.f8722b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    AbstractC0921e.f8714e.invoke(this.f8721a, this.f8722b, Boolean.FALSE);
                }
            } catch (RuntimeException e8) {
                if (e8.getClass() == RuntimeException.class && e8.getMessage() != null && e8.getMessage().startsWith("Unable to stop")) {
                    throw e8;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.e$d */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        Object f8723a;

        /* renamed from: b, reason: collision with root package name */
        private Activity f8724b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8725c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f8726d = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f8727e = false;

        /* renamed from: f, reason: collision with root package name */
        private boolean f8728f = false;

        d(Activity activity) {
            this.f8724b = activity;
            this.f8725c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f8724b == activity) {
                this.f8724b = null;
                this.f8727e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f8727e || this.f8728f || this.f8726d || !AbstractC0921e.h(this.f8723a, this.f8725c, activity)) {
                return;
            }
            this.f8728f = true;
            this.f8723a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f8724b == activity) {
                this.f8726d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class clsA = a();
        f8710a = clsA;
        f8711b = b();
        f8712c = f();
        f8713d = d(clsA);
        f8714e = c(clsA);
        f8715f = e(clsA);
    }

    private static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i8 = Build.VERSION.SDK_INT;
        return i8 == 26 || i8 == 27;
    }

    protected static boolean h(Object obj, int i8, Activity activity) {
        try {
            Object obj2 = f8712c.get(activity);
            if (obj2 == obj && activity.hashCode() == i8) {
                f8716g.postAtFrontOfQueue(new c(f8711b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f8715f == null) {
            return false;
        }
        if (f8714e == null && f8713d == null) {
            return false;
        }
        try {
            Object obj2 = f8712c.get(activity);
            if (obj2 == null || (obj = f8711b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f8716g;
            handler.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f8715f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th) {
                f8716g.post(new b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
