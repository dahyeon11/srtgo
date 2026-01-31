package retrofit2;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
class o {

    /* renamed from: a */
    private static final o f36053a = e();

    static class a extends o {

        /* renamed from: retrofit2.o$a$a */
        static class ExecutorC0416a implements Executor {

            /* renamed from: a */
            private final Handler f36054a = new Handler(Looper.getMainLooper());

            ExecutorC0416a() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f36054a.post(runnable);
            }
        }

        a() {
        }

        @Override // retrofit2.o
        List a(Executor executor) {
            if (executor != null) {
                return Arrays.asList(e.f35946a, new g(executor));
            }
            throw new AssertionError();
        }

        @Override // retrofit2.o
        int b() {
            return 2;
        }

        @Override // retrofit2.o
        List c() {
            return Collections.singletonList(m.f36006a);
        }

        @Override // retrofit2.o
        int d() {
            return 1;
        }

        @Override // retrofit2.o
        public Executor defaultCallbackExecutor() {
            return new ExecutorC0416a();
        }

        @Override // retrofit2.o
        boolean h(Method method) {
            return method.isDefault();
        }
    }

    static class b extends o {
        b() {
        }

        @Override // retrofit2.o
        List a(Executor executor) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(e.f35946a);
            arrayList.add(new g(executor));
            return Collections.unmodifiableList(arrayList);
        }

        @Override // retrofit2.o
        int b() {
            return 2;
        }

        @Override // retrofit2.o
        List c() {
            return Collections.singletonList(m.f36006a);
        }

        @Override // retrofit2.o
        int d() {
            return 1;
        }

        @Override // retrofit2.o
        Object g(Method method, Class cls, Object obj, Object... objArr) throws NoSuchMethodException, SecurityException {
            Constructor declaredConstructor = p.a().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return q.a(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        @Override // retrofit2.o
        boolean h(Method method) {
            return method.isDefault();
        }
    }

    o() {
    }

    private static o e() throws ClassNotFoundException {
        try {
            try {
                Class.forName("android.os.Build");
                return new a();
            } catch (ClassNotFoundException unused) {
                Class.forName("java.util.Optional");
                return new b();
            }
        } catch (ClassNotFoundException unused2) {
            return new o();
        }
    }

    static o f() {
        return f36053a;
    }

    List a(Executor executor) {
        return Collections.singletonList(new g(executor));
    }

    int b() {
        return 1;
    }

    List c() {
        return Collections.emptyList();
    }

    int d() {
        return 0;
    }

    Executor defaultCallbackExecutor() {
        return null;
    }

    Object g(Method method, Class cls, Object obj, Object... objArr) {
        throw new UnsupportedOperationException();
    }

    boolean h(Method method) {
        return false;
    }
}
