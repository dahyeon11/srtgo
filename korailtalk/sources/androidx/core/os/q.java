package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private static long f9035a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f9036b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f9037c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f9038d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f9039e;

    static class a {
        static void a(String str, int i8) {
            Trace.beginAsyncSection(str, i8);
        }

        static void b(String str, int i8) {
            Trace.endAsyncSection(str, i8);
        }

        static boolean c() {
            return Trace.isEnabled();
        }

        static void d(String str, long j8) {
            Trace.setCounter(str, j8);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f9035a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f9036b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f9037c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f9038d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f9039e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    public static void beginAsyncSection(String str, int i8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(str, i8);
        } else {
            try {
                f9037c.invoke(null, Long.valueOf(f9035a), str, Integer.valueOf(i8));
            } catch (Exception unused) {
            }
        }
    }

    public static void beginSection(String str) {
        Trace.beginSection(str);
    }

    public static void endAsyncSection(String str, int i8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(str, i8);
        } else {
            try {
                f9038d.invoke(null, Long.valueOf(f9035a), str, Integer.valueOf(i8));
            } catch (Exception unused) {
            }
        }
    }

    public static void endSection() {
        Trace.endSection();
    }

    public static boolean isEnabled() {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.c();
        }
        try {
            return ((Boolean) f9036b.invoke(null, Long.valueOf(f9035a))).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void setCounter(String str, int i8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            a.d(str, i8);
        } else {
            try {
                f9039e.invoke(null, Long.valueOf(f9035a), str, Integer.valueOf(i8));
            } catch (Exception unused) {
            }
        }
    }
}
