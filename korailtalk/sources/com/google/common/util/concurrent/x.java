package com.google.common.util.concurrent;

import f3.T0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
abstract class x {

    /* renamed from: a, reason: collision with root package name */
    private static final T0 f25602a = T0.natural().onResultOf(new e3.l() { // from class: com.google.common.util.concurrent.w
        @Override // e3.l
        public final Object apply(Object obj) {
            return x.i((Constructor) obj);
        }
    }).reverse();

    interface a {
        void validateClass(Class<? extends Exception> cls);
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        static final a f25603a = a();

        enum a implements a {
            INSTANCE;


            /* renamed from: a, reason: collision with root package name */
            private static final Set f25604a = new CopyOnWriteArraySet();

            @Override // com.google.common.util.concurrent.x.a
            public void validateClass(Class<? extends Exception> cls) {
                Iterator it = f25604a.iterator();
                while (it.hasNext()) {
                    if (cls.equals(((WeakReference) it.next()).get())) {
                        return;
                    }
                }
                x.c(cls);
                Set set = f25604a;
                if (set.size() > 1000) {
                    set.clear();
                }
                set.add(new WeakReference(cls));
            }
        }

        static a a() {
            return x.m();
        }
    }

    private static a b() {
        return b.f25603a;
    }

    static void c(Class cls) {
        e3.w.checkArgument(h(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        e3.w.checkArgument(g(cls), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }

    static Object d(a aVar, Future future, Class cls) throws Exception {
        aVar.validateClass(cls);
        try {
            return future.get();
        } catch (InterruptedException e8) {
            Thread.currentThread().interrupt();
            throw k(cls, e8);
        } catch (ExecutionException e9) {
            n(e9.getCause(), cls);
            throw new AssertionError();
        }
    }

    static Object e(Future future, Class cls) {
        return d(b(), future, cls);
    }

    static Object f(Future future, Class cls, long j8, TimeUnit timeUnit) throws Exception {
        b().validateClass(cls);
        try {
            return future.get(j8, timeUnit);
        } catch (InterruptedException e8) {
            Thread.currentThread().interrupt();
            throw k(cls, e8);
        } catch (ExecutionException e9) {
            n(e9.getCause(), cls);
            throw new AssertionError();
        } catch (TimeoutException e10) {
            throw k(cls, e10);
        }
    }

    private static boolean g(Class cls) {
        try {
            k(cls, new Exception());
            return true;
        } catch (Error | RuntimeException unused) {
            return false;
        }
    }

    static boolean h(Class cls) {
        return !RuntimeException.class.isAssignableFrom(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean i(Constructor constructor) {
        return Boolean.valueOf(Arrays.asList(constructor.getParameterTypes()).contains(String.class));
    }

    private static Object j(Constructor constructor, Throwable th) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i8 = 0; i8 < parameterTypes.length; i8++) {
            Class<?> cls = parameterTypes[i8];
            if (cls.equals(String.class)) {
                objArr[i8] = th.toString();
            } else {
                if (!cls.equals(Throwable.class)) {
                    return null;
                }
                objArr[i8] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Exception k(Class cls, Throwable th) {
        Iterator it = l(Arrays.asList(cls.getConstructors())).iterator();
        while (it.hasNext()) {
            Exception exc = (Exception) j((Constructor) it.next(), th);
            if (exc != null) {
                if (exc.getCause() == null) {
                    exc.initCause(th);
                }
                return exc;
            }
        }
        throw new IllegalArgumentException("No appropriate constructor for exception of type " + cls + " in response to chained exception", th);
    }

    private static List l(List list) {
        return f25602a.sortedCopy(list);
    }

    static a m() {
        return b.a.INSTANCE;
    }

    private static void n(Throwable th, Class cls) throws Exception {
        if (th instanceof Error) {
            throw new C5174n((Error) th);
        }
        if (!(th instanceof RuntimeException)) {
            throw k(cls, th);
        }
        throw new Q(th);
    }
}
