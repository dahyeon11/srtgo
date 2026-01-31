package T7;

import W7.o;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

/* renamed from: T7.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0812w {
    public static <T, U, E extends Throwable> void accept(final InterfaceC0815z interfaceC0815z, final T t8, final U u8) {
        run(new n0() { // from class: T7.u
            @Override // T7.n0
            public final void run() {
                interfaceC0815z.accept(t8, u8);
            }
        });
    }

    public static <T, U, R, E extends Throwable> R apply(final C c9, final T t8, final U u8) {
        return (R) get(new q0() { // from class: T7.v
            @Override // T7.q0
            public final Object get() {
                return c9.apply(t8, u8);
            }
        });
    }

    public static <E extends Throwable> double applyAsDouble(final O o8, final double d9, final double d10) {
        return getAsDouble(new T(o8, d9, d10) { // from class: T7.l

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ double f5003a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ double f5004b;

            {
                this.f5003a = d9;
                this.f5004b = d10;
            }

            @Override // T7.T
            public final double getAsDouble() {
                return null.a(this.f5003a, this.f5004b);
            }
        });
    }

    public static <T, U> BiConsumer<T, U> asBiConsumer(final InterfaceC0815z interfaceC0815z) {
        return new BiConsumer() { // from class: T7.p
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbstractC0812w.accept(interfaceC0815z, obj, obj2);
            }
        };
    }

    public static <T, U, R> BiFunction<T, U, R> asBiFunction(final C c9) {
        return new BiFunction() { // from class: T7.i
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return AbstractC0812w.apply(c9, obj, obj2);
            }
        };
    }

    public static <T, U> BiPredicate<T, U> asBiPredicate(final I i8) {
        return new BiPredicate() { // from class: T7.a
            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return AbstractC0812w.test(i8, obj, obj2);
            }
        };
    }

    public static <V> Callable<V> asCallable(final K k8) {
        return new Callable(k8) { // from class: T7.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC0812w.call(null);
            }
        };
    }

    public static <T> Consumer<T> asConsumer(final N n8) {
        return new Consumer() { // from class: T7.s
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                AbstractC0812w.accept(n8, obj);
            }
        };
    }

    public static <T, R> Function<T, R> asFunction(final Y y8) {
        return new Function() { // from class: T7.o
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC0812w.apply(y8, obj);
            }
        };
    }

    public static <T> Predicate<T> asPredicate(final m0 m0Var) {
        return new Predicate() { // from class: T7.r
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return AbstractC0812w.test(m0Var, obj);
            }
        };
    }

    public static Runnable asRunnable(final n0 n0Var) {
        return new Runnable() { // from class: T7.j
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0812w.run(n0Var);
            }
        };
    }

    public static <T> Supplier<T> asSupplier(final q0 q0Var) {
        return new Supplier() { // from class: T7.g
            @Override // java.util.function.Supplier
            public final Object get() {
                return AbstractC0812w.get(q0Var);
            }
        };
    }

    public static <V, E extends Throwable> V call(final K k8) {
        Objects.requireNonNull(k8);
        return (V) get(new q0(k8) { // from class: T7.n
            @Override // T7.q0
            public final Object get() {
                throw null;
            }
        });
    }

    public static <T, E extends Throwable> T get(q0 q0Var) {
        try {
            return (T) q0Var.get();
        } catch (Throwable th) {
            throw rethrow(th);
        }
    }

    public static <E extends Throwable> boolean getAsBoolean(J j8) {
        try {
            return j8.getAsBoolean();
        } catch (Throwable th) {
            throw rethrow(th);
        }
    }

    public static <E extends Throwable> double getAsDouble(T t8) {
        try {
            return t8.getAsDouble();
        } catch (Throwable th) {
            throw rethrow(th);
        }
    }

    public static <E extends Throwable> int getAsInt(c0 c0Var) {
        try {
            return c0Var.a();
        } catch (Throwable th) {
            throw rethrow(th);
        }
    }

    public static <E extends Throwable> long getAsLong(g0 g0Var) {
        try {
            return g0Var.a();
        } catch (Throwable th) {
            throw rethrow(th);
        }
    }

    public static <E extends Throwable> short getAsShort(o0 o0Var) {
        try {
            return o0Var.a();
        } catch (Throwable th) {
            throw rethrow(th);
        }
    }

    public static RuntimeException rethrow(Throwable th) {
        Objects.requireNonNull(th, "throwable");
        S7.f.throwUnchecked(th);
        if (th instanceof IOException) {
            throw new UncheckedIOException((IOException) th);
        }
        throw new UndeclaredThrowableException(th);
    }

    public static <E extends Throwable> void run(n0 n0Var) {
        try {
            n0Var.run();
        } catch (Throwable th) {
            throw rethrow(th);
        }
    }

    public static <E> o.c stream(Collection<E> collection) {
        return new o.c(collection.stream());
    }

    public static <T, U, E extends Throwable> boolean test(final I i8, final T t8, final U u8) {
        return getAsBoolean(new J() { // from class: T7.h
            @Override // T7.J
            public final boolean getAsBoolean() {
                return i8.test(t8, u8);
            }
        });
    }

    @SafeVarargs
    public static void tryWithResources(n0 n0Var, N n8, n0... n0VarArr) {
        if (n8 == null) {
            n8 = new N() { // from class: T7.e
                @Override // T7.N
                public final void accept(Object obj) {
                    AbstractC0812w.rethrow((Throwable) obj);
                }
            };
        }
        W7.o.of(n0VarArr).forEach(new Consumer() { // from class: T7.f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Objects.requireNonNull((n0) obj, "runnable");
            }
        });
        try {
            n0Var.run();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        if (n0VarArr != null) {
            for (n0 n0Var2 : n0VarArr) {
                try {
                    n0Var2.run();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
            }
        }
        if (th != null) {
            try {
                n8.accept(th);
            } catch (Throwable th3) {
                throw rethrow(th3);
            }
        }
    }

    public static <T, E extends Throwable> void accept(final N n8, final T t8) {
        run(new n0() { // from class: T7.m
            @Override // T7.n0
            public final void run() {
                n8.accept(t8);
            }
        });
    }

    public static <T, R, E extends Throwable> R apply(final Y y8, final T t8) {
        return (R) get(new q0() { // from class: T7.t
            @Override // T7.q0
            public final Object get() {
                return y8.apply(t8);
            }
        });
    }

    public static <T> o.c stream(Stream<T> stream) {
        return new o.c(stream);
    }

    public static <T, E extends Throwable> boolean test(final m0 m0Var, final T t8) {
        return getAsBoolean(new J() { // from class: T7.d
            @Override // T7.J
            public final boolean getAsBoolean() {
                return m0Var.test(t8);
            }
        });
    }

    public static <E extends Throwable> void accept(final S s8, final double d9) {
        run(new n0() { // from class: T7.c
            @Override // T7.n0
            public final void run() {
                s8.accept(d9);
            }
        });
    }

    public static <E extends Throwable> void accept(final b0 b0Var, final int i8) {
        run(new n0() { // from class: T7.q
            @Override // T7.n0
            public final void run() {
                b0Var.accept(i8);
            }
        });
    }

    public static <E extends Throwable> void accept(final f0 f0Var, final long j8) {
        run(new n0() { // from class: T7.b
            @Override // T7.n0
            public final void run() {
                f0Var.accept(j8);
            }
        });
    }

    @SafeVarargs
    public static void tryWithResources(n0 n0Var, n0... n0VarArr) {
        tryWithResources(n0Var, null, n0VarArr);
    }
}
