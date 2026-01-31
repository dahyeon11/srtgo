package W7;

import java.util.Collections;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f5392a = Collections.emptySet();

    private static final class b implements Collector {

        /* renamed from: a, reason: collision with root package name */
        private final BiConsumer f5393a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f5394b;

        /* renamed from: c, reason: collision with root package name */
        private final BinaryOperator f5395c;

        /* renamed from: d, reason: collision with root package name */
        private final Function f5396d;

        /* renamed from: e, reason: collision with root package name */
        private final Supplier f5397e;

        @Override // java.util.stream.Collector
        public BiConsumer<Object, Object> accumulator() {
            return this.f5393a;
        }

        @Override // java.util.stream.Collector
        public Set<Collector.Characteristics> characteristics() {
            return this.f5394b;
        }

        @Override // java.util.stream.Collector
        public BinaryOperator<Object> combiner() {
            return this.f5395c;
        }

        @Override // java.util.stream.Collector
        public Function<Object, Object> finisher() {
            return this.f5396d;
        }

        @Override // java.util.stream.Collector
        public Supplier<Object> supplier() {
            return this.f5397e;
        }

        private b(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
            this.f5397e = supplier;
            this.f5393a = biConsumer;
            this.f5395c = binaryOperator;
            this.f5396d = function;
            this.f5394b = set;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ StringJoiner c(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        return new StringJoiner(charSequence, charSequence2, charSequence3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Function function, StringJoiner stringJoiner, Object obj) {
        stringJoiner.add((CharSequence) function.apply(obj));
    }

    public static Collector<Object, ?, String> joining() {
        return new b(new Supplier() { // from class: W7.a
            @Override // java.util.function.Supplier
            public final Object get() {
                return new StringBuilder();
            }
        }, new BiConsumer() { // from class: W7.b
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((StringBuilder) obj).append(obj2);
            }
        }, new BinaryOperator() { // from class: W7.c
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                StringBuilder sb = (StringBuilder) obj;
                sb.append((CharSequence) obj2);
                return sb;
            }
        }, new Function() { // from class: W7.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((StringBuilder) obj).toString();
            }
        }, f5392a);
    }

    public static Collector<Object, ?, String> joining(CharSequence charSequence) {
        return joining(charSequence, "", "");
    }

    public static Collector<Object, ?, String> joining(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        return joining(charSequence, charSequence2, charSequence3, new R7.j());
    }

    public static Collector<Object, ?, String> joining(final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3, final Function<Object, String> function) {
        return new b(new Supplier() { // from class: W7.e
            @Override // java.util.function.Supplier
            public final Object get() {
                return i.c(charSequence, charSequence2, charSequence3);
            }
        }, new BiConsumer() { // from class: W7.f
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                i.d(function, (StringJoiner) obj, obj2);
            }
        }, new BinaryOperator() { // from class: W7.g
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((StringJoiner) obj).merge((StringJoiner) obj2);
            }
        }, new Function() { // from class: W7.h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((StringJoiner) obj).toString();
            }
        }, f5392a);
    }
}
