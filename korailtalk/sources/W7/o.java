package W7;

import Q7.C0708l;
import Q7.K;
import T7.AbstractC0812w;
import T7.N;
import T7.Y;
import T7.m0;
import W7.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* loaded from: classes3.dex */
public class o {

    public static class a implements Collector {

        /* renamed from: b */
        private static final Set f5400b = Collections.emptySet();

        /* renamed from: a */
        private final Class f5401a;

        public a(Class<Object> cls) {
            Objects.requireNonNull(cls, "elementType");
            this.f5401a = cls;
        }

        public static /* synthetic */ List c(List list, List list2) {
            list.addAll(list2);
            return list;
        }

        public /* synthetic */ Object[] d(List list) {
            return list.toArray(C0708l.newInstance(this.f5401a, list.size()));
        }

        @Override // java.util.stream.Collector
        public BiConsumer<List<Object>, Object> accumulator() {
            return new BiConsumer() { // from class: W7.n
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    ((List) obj).add(obj2);
                }
            };
        }

        @Override // java.util.stream.Collector
        public Set<Collector.Characteristics> characteristics() {
            return f5400b;
        }

        @Override // java.util.stream.Collector
        public BinaryOperator<List<Object>> combiner() {
            return new BinaryOperator() { // from class: W7.m
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return o.a.c((List) obj, (List) obj2);
                }
            };
        }

        @Override // java.util.stream.Collector
        public Function<List<Object>, Object[]> finisher() {
            return new Function() { // from class: W7.l
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return this.f5399a.d((List) obj);
                }
            };
        }

        @Override // java.util.stream.Collector
        public Supplier<List<Object>> supplier() {
            return new Supplier() { // from class: W7.k
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            };
        }
    }

    private static final class b extends Spliterators.AbstractSpliterator {

        /* renamed from: a */
        private final Enumeration f5402a;

        protected b(long j8, int i8, Enumeration enumeration) {
            super(j8, i8);
            Objects.requireNonNull(enumeration, "enumeration");
            this.f5402a = enumeration;
        }

        private boolean a(Consumer consumer) {
            consumer.accept(this.f5402a.nextElement());
            return true;
        }

        @Override // java.util.Spliterator
        public void forEachRemaining(Consumer<Object> consumer) {
            while (this.f5402a.hasMoreElements()) {
                a(consumer);
            }
        }

        @Override // java.util.Spliterator
        public boolean tryAdvance(Consumer<Object> consumer) {
            return this.f5402a.hasMoreElements() && a(consumer);
        }
    }

    private static Stream a(final Class cls, Stream stream) {
        Stream streamB = b(stream);
        Objects.requireNonNull(cls);
        return streamB.filter(new Predicate() { // from class: W7.j
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cls.isInstance(obj);
            }
        });
    }

    private static Stream b(Stream stream) {
        return stream == null ? Stream.empty() : stream;
    }

    public static <T> c failableStream(Collection<T> collection) {
        return failableStream(of((Collection) collection));
    }

    public static <E> Stream<E> instancesOf(Class<? super E> cls, Collection<? super E> collection) {
        return a(cls, of((Collection) collection));
    }

    public static <E> Stream<E> nonNull(Collection<E> collection) {
        return of((Collection) collection).filter(new K());
    }

    public static <E> Stream<E> of(Collection<E> collection) {
        return collection == null ? Stream.empty() : collection.stream();
    }

    @Deprecated
    public static <E> c stream(Collection<E> collection) {
        return failableStream(collection);
    }

    public static <T> Collector<T, ?, T[]> toArray(Class<T> cls) {
        return new a(cls);
    }

    public static class c {

        /* renamed from: a */
        private Stream f5403a;

        /* renamed from: b */
        private boolean f5404b;

        public c(Stream<Object> stream) {
            this.f5403a = stream;
        }

        protected void a() {
            if (this.f5404b) {
                throw new IllegalStateException("This stream is already terminated.");
            }
        }

        public boolean allMatch(m0 m0Var) {
            a();
            return stream().allMatch(AbstractC0812w.asPredicate(m0Var));
        }

        public boolean anyMatch(m0 m0Var) {
            a();
            return stream().anyMatch(AbstractC0812w.asPredicate(m0Var));
        }

        protected void b() {
            a();
            this.f5404b = true;
        }

        public <A, R> R collect(Collector<Object, A, R> collector) {
            b();
            return (R) stream().collect(collector);
        }

        public c filter(m0 m0Var) {
            a();
            this.f5403a = this.f5403a.filter(AbstractC0812w.asPredicate(m0Var));
            return this;
        }

        public void forEach(N n8) {
            b();
            stream().forEach(AbstractC0812w.asConsumer(n8));
        }

        public <R> c map(Y y8) {
            a();
            return new c(this.f5403a.map(AbstractC0812w.asFunction(y8)));
        }

        public Object reduce(Object obj, BinaryOperator<Object> binaryOperator) {
            b();
            return stream().reduce(obj, binaryOperator);
        }

        public Stream<Object> stream() {
            return this.f5403a;
        }

        public <A, R> R collect(Supplier<R> supplier, BiConsumer<R, Object> biConsumer, BiConsumer<R, R> biConsumer2) {
            b();
            return (R) stream().collect(supplier, biConsumer, biConsumer2);
        }
    }

    public static <T> c failableStream(Stream<T> stream) {
        return new c(stream);
    }

    @SafeVarargs
    public static <E> Stream<E> nonNull(E... eArr) {
        return nonNull(of(eArr));
    }

    public static <E> Stream<E> of(Enumeration<E> enumeration) {
        return StreamSupport.stream(new b(Long.MAX_VALUE, 16, enumeration), false);
    }

    @Deprecated
    public static <T> c stream(Stream<T> stream) {
        return failableStream(stream);
    }

    @SafeVarargs
    public static <T> c failableStream(T... tArr) {
        return failableStream(of(tArr));
    }

    public static <E> Stream<E> nonNull(Stream<E> stream) {
        return b(stream).filter(new K());
    }

    public static <E> Stream<E> of(Iterable<E> iterable) {
        return iterable == null ? Stream.empty() : StreamSupport.stream(iterable.spliterator(), false);
    }

    public static <E> Stream<E> of(Iterator<E> it) {
        return it == null ? Stream.empty() : StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, 16), false);
    }

    @SafeVarargs
    public static <T> Stream<T> of(T... tArr) {
        return tArr == null ? Stream.empty() : Stream.of((Object[]) tArr);
    }
}
