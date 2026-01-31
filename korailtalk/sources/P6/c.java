package P6;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final a f3757a;

    static {
        Object obj;
        Class<?> cls;
        a aVar;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                aVar = (a) cls.asSubclass(a.class).getConstructor(e.class).newInstance(a.f3754a);
            } catch (Throwable th2) {
                obj = th2;
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            f3757a = aVar;
        } else {
            f3757a = new a(a.f3754a);
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, c.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void attachTag(e eVar) {
        f3757a.a(eVar);
    }

    public static e createTag() {
        return a.f3754a;
    }

    public static void event(String str, e eVar) {
        f3757a.h(str, eVar);
    }

    @Deprecated
    public static b link() {
        return a.f3755b;
    }

    public static void linkIn(b bVar) {
        f3757a.j(bVar);
    }

    public static b linkOut() {
        return f3757a.k();
    }

    public static boolean setEnabled(boolean z8) {
        return f3757a.l(z8, false);
    }

    public static void startTask(String str, e eVar) {
        f3757a.o(str, eVar);
    }

    public static void stopTask() {
        f3757a.q();
    }

    public static f traceTask(String str) {
        f3757a.n(str);
        return f.f3760a;
    }

    public static void attachTag(String str, String str2) {
        f3757a.e(str, str2);
    }

    public static e createTag(long j8) {
        return f3757a.f("", j8);
    }

    public static void event(String str) {
        f3757a.g(str);
    }

    public static void startTask(String str) {
        f3757a.n(str);
    }

    public static void stopTask(String str, e eVar) {
        f3757a.s(str, eVar);
    }

    public static void attachTag(String str, long j8) {
        f3757a.b(str, j8);
    }

    public static e createTag(String str) {
        return f3757a.f(str, Long.MIN_VALUE);
    }

    public static void event(String str, String str2) {
        f3757a.i(str, str2);
    }

    public static <T> void startTask(T t8, d dVar) {
        f3757a.m(t8, dVar);
    }

    public static void stopTask(String str) {
        f3757a.r(str);
    }

    public static <T> f traceTask(T t8, d dVar) {
        f3757a.m(t8, dVar);
        return f.f3760a;
    }

    public static void attachTag(String str, long j8, long j9) {
        f3757a.c(str, j8, j9);
    }

    public static e createTag(String str, long j8) {
        return f3757a.f(str, j8);
    }

    public static void startTask(String str, String str2) {
        f3757a.p(str, str2);
    }

    public static void stopTask(String str, String str2) {
        f3757a.t(str, str2);
    }

    public static <T> void attachTag(String str, T t8, d dVar) {
        f3757a.d(str, t8, dVar);
    }
}
