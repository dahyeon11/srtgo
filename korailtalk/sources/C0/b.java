package C0;

import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static long f410a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f411b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f412c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f413d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f414e;

    private static void a(String str, int i8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (f412c == null) {
                f412c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f412c.invoke(null, Long.valueOf(f410a), str, Integer.valueOf(i8));
        } catch (Exception e8) {
            c("asyncTraceBegin", e8);
        }
    }

    private static void b(String str, int i8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (f413d == null) {
                f413d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f413d.invoke(null, Long.valueOf(f410a), str, Integer.valueOf(i8));
        } catch (Exception e8) {
            c("asyncTraceEnd", e8);
        }
    }

    public static void beginAsyncSection(String str, int i8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (f412c == null) {
                d.beginAsyncSection(str, i8);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        a(str, i8);
    }

    public static void beginSection(String str) {
        c.beginSection(str);
    }

    private static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to call ");
        sb.append(str);
        sb.append(" via reflection");
    }

    private static boolean d() {
        try {
            if (f411b == null) {
                f410a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f411b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f411b.invoke(null, Long.valueOf(f410a))).booleanValue();
        } catch (Exception e8) {
            c("isTagEnabled", e8);
            return false;
        }
    }

    private static void e(String str, int i8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (f414e == null) {
                f414e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f414e.invoke(null, Long.valueOf(f410a), str, Integer.valueOf(i8));
        } catch (Exception e8) {
            c("traceCounter", e8);
        }
    }

    public static void endAsyncSection(String str, int i8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (f413d == null) {
                d.endAsyncSection(str, i8);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        b(str, i8);
    }

    public static void endSection() {
        c.endSection();
    }

    public static boolean isEnabled() {
        try {
            if (f411b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return d();
    }

    public static void setCounter(String str, int i8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (f414e == null) {
                d.setCounter(str, i8);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        e(str, i8);
    }
}
