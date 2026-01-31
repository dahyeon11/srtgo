package f3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

/* renamed from: f3.N, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5442N implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final e3.s f30816a;

    /* renamed from: f3.N$a */
    class a extends AbstractC5442N {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f30817b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Iterable iterable, Iterable iterable2) {
            super(iterable);
            this.f30817b = iterable2;
        }

        @Override // java.lang.Iterable
        public Iterator<Object> iterator() {
            return this.f30817b.iterator();
        }
    }

    /* renamed from: f3.N$b */
    class b extends AbstractC5442N {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f30818b;

        b(Iterable iterable) {
            this.f30818b = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<Object> iterator() {
            return AbstractC5495w0.concat(AbstractC5495w0.transform(this.f30818b.iterator(), new C5443O()));
        }
    }

    /* renamed from: f3.N$c */
    class c extends AbstractC5442N {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable[] f30819b;

        /* renamed from: f3.N$c$a */
        class a extends AbstractC5450a {
            a(int i8) {
                super(i8);
            }

            @Override // f3.AbstractC5450a
            public Iterator<Object> get(int i8) {
                return c.this.f30819b[i8].iterator();
            }
        }

        c(Iterable[] iterableArr) {
            this.f30819b = iterableArr;
        }

        @Override // java.lang.Iterable
        public Iterator<Object> iterator() {
            return AbstractC5495w0.concat(new a(this.f30819b.length));
        }
    }

    protected AbstractC5442N() {
        this.f30816a = e3.s.absent();
    }

    private static AbstractC5442N a(Iterable... iterableArr) {
        for (Iterable iterable : iterableArr) {
            e3.w.checkNotNull(iterable);
        }
        return new c(iterableArr);
    }

    private Iterable b() {
        return (Iterable) this.f30816a.or(this);
    }

    public static <T> AbstractC5442N concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return a(iterable, iterable2);
    }

    public static <E> AbstractC5442N from(Iterable<E> iterable) {
        return iterable instanceof AbstractC5442N ? (AbstractC5442N) iterable : new a(iterable, iterable);
    }

    public static <E> AbstractC5442N of() {
        return from(Collections.emptyList());
    }

    public final boolean allMatch(e3.x xVar) {
        return AbstractC5493v0.all(b(), xVar);
    }

    public final boolean anyMatch(e3.x xVar) {
        return AbstractC5493v0.any(b(), xVar);
    }

    public final AbstractC5442N append(Iterable<Object> iterable) {
        return concat(b(), iterable);
    }

    public final boolean contains(Object obj) {
        return AbstractC5493v0.contains(b(), obj);
    }

    public final <C extends Collection<Object>> C copyInto(C c9) {
        e3.w.checkNotNull(c9);
        Iterable iterableB = b();
        if (iterableB instanceof Collection) {
            c9.addAll((Collection) iterableB);
        } else {
            Iterator it = iterableB.iterator();
            while (it.hasNext()) {
                c9.add(it.next());
            }
        }
        return c9;
    }

    public final AbstractC5442N cycle() {
        return from(AbstractC5493v0.cycle(b()));
    }

    public final AbstractC5442N filter(e3.x xVar) {
        return from(AbstractC5493v0.filter(b(), xVar));
    }

    public final e3.s first() {
        Iterator it = b().iterator();
        return it.hasNext() ? e3.s.of(it.next()) : e3.s.absent();
    }

    public final e3.s firstMatch(e3.x xVar) {
        return AbstractC5493v0.tryFind(b(), xVar);
    }

    public final Object get(int i8) {
        return AbstractC5493v0.get(b(), i8);
    }

    public final <K> C5467i0 index(e3.l lVar) {
        return H0.index(b(), lVar);
    }

    public final boolean isEmpty() {
        return !b().iterator().hasNext();
    }

    public final String join(e3.o oVar) {
        return oVar.join(this);
    }

    public final e3.s last() {
        Object next;
        Iterable iterableB = b();
        if (iterableB instanceof List) {
            List list = (List) iterableB;
            return list.isEmpty() ? e3.s.absent() : e3.s.of(list.get(list.size() - 1));
        }
        Iterator it = iterableB.iterator();
        if (!it.hasNext()) {
            return e3.s.absent();
        }
        if (iterableB instanceof SortedSet) {
            return e3.s.of(((SortedSet) iterableB).last());
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return e3.s.of(next);
    }

    public final AbstractC5442N limit(int i8) {
        return from(AbstractC5493v0.limit(b(), i8));
    }

    public final int size() {
        return AbstractC5493v0.size(b());
    }

    public final AbstractC5442N skip(int i8) {
        return from(AbstractC5493v0.skip(b(), i8));
    }

    public final Object[] toArray(Class<Object> cls) {
        return AbstractC5493v0.toArray(b(), cls);
    }

    public final AbstractC5465h0 toList() {
        return AbstractC5465h0.copyOf(b());
    }

    public final <V> AbstractC5469j0 toMap(e3.l lVar) {
        return E0.toMap(b(), lVar);
    }

    public final AbstractC5479o0 toMultiset() {
        return AbstractC5479o0.copyOf(b());
    }

    public final AbstractC5483q0 toSet() {
        return AbstractC5483q0.copyOf(b());
    }

    public final AbstractC5465h0 toSortedList(Comparator<Object> comparator) {
        return T0.from(comparator).immutableSortedCopy(b());
    }

    public final AbstractC5487s0 toSortedSet(Comparator<Object> comparator) {
        return AbstractC5487s0.copyOf(comparator, b());
    }

    public String toString() {
        return AbstractC5493v0.toString(b());
    }

    public final <T> AbstractC5442N transform(e3.l lVar) {
        return from(AbstractC5493v0.transform(b(), lVar));
    }

    public <T> AbstractC5442N transformAndConcat(e3.l lVar) {
        return concat(transform(lVar));
    }

    public final <K> AbstractC5469j0 uniqueIndex(e3.l lVar) {
        return E0.uniqueIndex(b(), lVar);
    }

    public static <T> AbstractC5442N concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return a(iterable, iterable2, iterable3);
    }

    public static <E> AbstractC5442N of(E e8, E... eArr) {
        return from(A0.asList(e8, eArr));
    }

    public final AbstractC5442N append(Object... objArr) {
        return concat(b(), Arrays.asList(objArr));
    }

    public final <T> AbstractC5442N filter(Class<T> cls) {
        return from(AbstractC5493v0.filter((Iterable<?>) b(), cls));
    }

    AbstractC5442N(Iterable iterable) {
        this.f30816a = e3.s.of(iterable);
    }

    public static <T> AbstractC5442N concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        return a(iterable, iterable2, iterable3, iterable4);
    }

    public static <T> AbstractC5442N concat(Iterable<? extends T>... iterableArr) {
        return a((Iterable[]) Arrays.copyOf(iterableArr, iterableArr.length));
    }

    public static <E> AbstractC5442N from(E[] eArr) {
        return from(Arrays.asList(eArr));
    }

    public static <T> AbstractC5442N concat(Iterable<? extends Iterable<? extends T>> iterable) {
        e3.w.checkNotNull(iterable);
        return new b(iterable);
    }

    @Deprecated
    public static <E> AbstractC5442N from(AbstractC5442N abstractC5442N) {
        return (AbstractC5442N) e3.w.checkNotNull(abstractC5442N);
    }
}
