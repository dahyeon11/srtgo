package e3;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f30328a;

    /* renamed from: b, reason: collision with root package name */
    private static final Method f30329b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f30330c;

    class a extends AbstractList {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f30331a;

        a(Throwable th) {
            this.f30331a = th;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            Method method = F.f30330c;
            Objects.requireNonNull(method);
            Object obj = F.f30328a;
            Objects.requireNonNull(obj);
            return ((Integer) F.i(method, obj, this.f30331a)).intValue();
        }

        @Override // java.util.AbstractList, java.util.List
        public StackTraceElement get(int i8) {
            Method method = F.f30329b;
            Objects.requireNonNull(method);
            Object obj = F.f30328a;
            Objects.requireNonNull(obj);
            return (StackTraceElement) F.i(method, obj, this.f30331a, Integer.valueOf(i8));
        }
    }

    static {
        Object objF = f();
        f30328a = objF;
        f30329b = objF == null ? null : e();
        f30330c = objF != null ? h(objF) : null;
    }

    private static Method e() {
        return g("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    private static Object f() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e8) {
            throw e8;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method g(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e8) {
            throw e8;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<Throwable> getCausalChain(Throwable th) {
        w.checkNotNull(th);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(th);
        boolean z8 = false;
        Throwable cause = th;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(th);
            if (th == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", th);
            }
            if (z8) {
                cause = cause.getCause();
            }
            z8 = !z8;
        }
    }

    public static <X extends Throwable> X getCauseAs(Throwable th, Class<X> cls) {
        try {
            return cls.cast(th.getCause());
        } catch (ClassCastException e8) {
            e8.initCause(th);
            throw e8;
        }
    }

    public static Throwable getRootCause(Throwable th) {
        boolean z8 = false;
        Throwable cause = th;
        while (true) {
            Throwable cause2 = th.getCause();
            if (cause2 == null) {
                return th;
            }
            if (cause2 == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause2);
            }
            if (z8) {
                cause = cause.getCause();
            }
            z8 = !z8;
            th = cause2;
        }
    }

    public static String getStackTraceAsString(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private static Method h(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Method methodG = g("getStackTraceDepth", Throwable.class);
            if (methodG == null) {
                return null;
            }
            methodG.invoke(obj, new Throwable());
            return methodG;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object i(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw propagate(e9.getCause());
        }
    }

    private static List j(Throwable th) {
        w.checkNotNull(th);
        return new a(th);
    }

    @Deprecated
    public static List<StackTraceElement> lazyStackTrace(Throwable th) {
        return lazyStackTraceIsLazy() ? j(th) : Collections.unmodifiableList(Arrays.asList(th.getStackTrace()));
    }

    @Deprecated
    public static boolean lazyStackTraceIsLazy() {
        return (f30329b == null || f30330c == null) ? false : true;
    }

    @Deprecated
    public static RuntimeException propagate(Throwable th) {
        throwIfUnchecked(th);
        throw new RuntimeException(th);
    }

    @Deprecated
    public static <X extends Throwable> void propagateIfInstanceOf(Throwable th, Class<X> cls) throws X {
        if (th != null) {
            throwIfInstanceOf(th, cls);
        }
    }

    @Deprecated
    public static void propagateIfPossible(Throwable th) {
        if (th != null) {
            throwIfUnchecked(th);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public static <X extends Throwable> void throwIfInstanceOf(Throwable th, Class<X> cls) throws X {
        w.checkNotNull(th);
        if (cls.isInstance(th)) {
            throw cls.cast(th);
        }
    }

    public static void throwIfUnchecked(Throwable th) {
        w.checkNotNull(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    public static <X extends Throwable> void propagateIfPossible(Throwable th, Class<X> cls) throws X {
        propagateIfInstanceOf(th, cls);
        propagateIfPossible(th);
    }

    public static <X1 extends Throwable, X2 extends Throwable> void propagateIfPossible(Throwable th, Class<X1> cls, Class<X2> cls2) throws X {
        w.checkNotNull(cls2);
        propagateIfInstanceOf(th, cls);
        propagateIfPossible(th, cls2);
    }
}
