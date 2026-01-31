package f3;

import f3.AbstractC5457d0;
import f3.K0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* renamed from: f3.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5479o0 extends AbstractC5481p0 implements K0 {

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC5465h0 f31034b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC5483q0 f31035c;

    /* renamed from: f3.o0$a */
    class a extends t1 {

        /* renamed from: a, reason: collision with root package name */
        int f31036a;

        /* renamed from: b, reason: collision with root package name */
        Object f31037b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f31038c;

        a(AbstractC5479o0 abstractC5479o0, Iterator it) {
            this.f31038c = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31036a > 0 || this.f31038c.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f31036a <= 0) {
                K0.a aVar = (K0.a) this.f31038c.next();
                this.f31037b = aVar.getElement();
                this.f31036a = aVar.getCount();
            }
            this.f31036a--;
            Object obj = this.f31037b;
            Objects.requireNonNull(obj);
            return obj;
        }
    }

    /* renamed from: f3.o0$b */
    public static class b extends AbstractC5457d0.b {

        /* renamed from: a, reason: collision with root package name */
        R0 f31039a;

        /* renamed from: b, reason: collision with root package name */
        boolean f31040b;

        /* renamed from: c, reason: collision with root package name */
        boolean f31041c;

        public b() {
            this(4);
        }

        static R0 b(Iterable iterable) {
            if (iterable instanceof b1) {
                return ((b1) iterable).f30875d;
            }
            if (!(iterable instanceof AbstractC5458e)) {
                return null;
            }
            android.support.v4.media.session.f.a(iterable);
            throw null;
        }

        @Override // f3.AbstractC5457d0.b
        public /* bridge */ /* synthetic */ AbstractC5457d0.b addAll(Iterable iterable) {
            return addAll((Iterable<Object>) iterable);
        }

        public b addCopies(Object obj, int i8) {
            Objects.requireNonNull(this.f31039a);
            if (i8 == 0) {
                return this;
            }
            if (this.f31040b) {
                this.f31039a = new R0(this.f31039a);
                this.f31041c = false;
            }
            this.f31040b = false;
            e3.w.checkNotNull(obj);
            R0 r02 = this.f31039a;
            r02.put(obj, i8 + r02.get(obj));
            return this;
        }

        public b setCount(Object obj, int i8) {
            Objects.requireNonNull(this.f31039a);
            if (i8 == 0 && !this.f31041c) {
                this.f31039a = new S0(this.f31039a);
                this.f31041c = true;
            } else if (this.f31040b) {
                this.f31039a = new R0(this.f31039a);
                this.f31041c = false;
            }
            this.f31040b = false;
            e3.w.checkNotNull(obj);
            if (i8 == 0) {
                this.f31039a.remove(obj);
            } else {
                this.f31039a.put(e3.w.checkNotNull(obj), i8);
            }
            return this;
        }

        b(int i8) {
            this.f31040b = false;
            this.f31041c = false;
            this.f31039a = R0.b(i8);
        }

        @Override // f3.AbstractC5457d0.b
        public /* bridge */ /* synthetic */ AbstractC5457d0.b addAll(Iterator it) {
            return addAll((Iterator<Object>) it);
        }

        @Override // f3.AbstractC5457d0.b
        public AbstractC5479o0 build() {
            Objects.requireNonNull(this.f31039a);
            if (this.f31039a.v() == 0) {
                return AbstractC5479o0.of();
            }
            if (this.f31041c) {
                this.f31039a = new R0(this.f31039a);
                this.f31041c = false;
            }
            this.f31040b = true;
            return new b1(this.f31039a);
        }

        @Override // f3.AbstractC5457d0.b
        public b add(Object obj) {
            return addCopies(obj, 1);
        }

        @Override // f3.AbstractC5457d0.b
        public b addAll(Iterable<Object> iterable) {
            Objects.requireNonNull(this.f31039a);
            if (iterable instanceof K0) {
                K0 k0C = L0.c(iterable);
                R0 r0B = b(k0C);
                if (r0B != null) {
                    R0 r02 = this.f31039a;
                    r02.c(Math.max(r02.v(), r0B.v()));
                    for (int iD = r0B.d(); iD >= 0; iD = r0B.q(iD)) {
                        addCopies(r0B.g(iD), r0B.i(iD));
                    }
                } else {
                    Set<K0.a> setEntrySet = k0C.entrySet();
                    R0 r03 = this.f31039a;
                    r03.c(Math.max(r03.v(), setEntrySet.size()));
                    for (K0.a aVar : k0C.entrySet()) {
                        addCopies(aVar.getElement(), aVar.getCount());
                    }
                }
            } else {
                super.addAll(iterable);
            }
            return this;
        }

        @Override // f3.AbstractC5457d0.b
        public b add(Object... objArr) {
            super.add(objArr);
            return this;
        }

        @Override // f3.AbstractC5457d0.b
        public b addAll(Iterator<Object> it) {
            super.addAll(it);
            return this;
        }
    }

    /* renamed from: f3.o0$c */
    private final class c extends AbstractC5491u0 {
        private c() {
        }

        @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof K0.a)) {
                return false;
            }
            K0.a aVar = (K0.a) obj;
            return aVar.getCount() > 0 && AbstractC5479o0.this.count(aVar.getElement()) == aVar.getCount();
        }

        @Override // f3.AbstractC5483q0, java.util.Collection, java.util.Set
        public int hashCode() {
            return AbstractC5479o0.this.hashCode();
        }

        @Override // f3.AbstractC5457d0
        boolean isPartialView() {
            return AbstractC5479o0.this.isPartialView();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // f3.AbstractC5491u0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public K0.a get(int i8) {
            return AbstractC5479o0.this.h(i8);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC5479o0.this.elementSet().size();
        }

        /* synthetic */ c(AbstractC5479o0 abstractC5479o0, a aVar) {
            this();
        }
    }

    AbstractC5479o0() {
    }

    public static <E> b builder() {
        return new b();
    }

    public static <E> AbstractC5479o0 copyOf(E[] eArr) {
        return e(eArr);
    }

    private static AbstractC5479o0 e(Object... objArr) {
        return new b().add(objArr).build();
    }

    static AbstractC5479o0 f(Collection collection) {
        b bVar = new b(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            K0.a aVar = (K0.a) it.next();
            bVar.addCopies(aVar.getElement(), aVar.getCount());
        }
        return bVar.build();
    }

    private AbstractC5483q0 g() {
        return isEmpty() ? AbstractC5483q0.of() : new c(this, null);
    }

    public static <E> AbstractC5479o0 of() {
        return b1.f30874g;
    }

    @Override // f3.AbstractC5457d0
    int a(Object[] objArr, int i8) {
        t1 it = entrySet().iterator();
        while (it.hasNext()) {
            K0.a aVar = (K0.a) it.next();
            Arrays.fill(objArr, i8, aVar.getCount() + i8, aVar.getElement());
            i8 += aVar.getCount();
        }
        return i8;
    }

    @Override // f3.K0
    @Deprecated
    public final int add(Object obj, int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // f3.AbstractC5457d0
    public AbstractC5465h0 asList() {
        AbstractC5465h0 abstractC5465h0 = this.f31034b;
        if (abstractC5465h0 != null) {
            return abstractC5465h0;
        }
        AbstractC5465h0 abstractC5465h0AsList = super.asList();
        this.f31034b = abstractC5465h0AsList;
        return abstractC5465h0AsList;
    }

    @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    public abstract /* synthetic */ int count(Object obj);

    @Override // f3.K0
    public abstract AbstractC5483q0 elementSet();

    @Override // java.util.Collection, f3.K0
    public boolean equals(Object obj) {
        return L0.d(this, obj);
    }

    abstract K0.a h(int i8);

    @Override // java.util.Collection, f3.K0
    public int hashCode() {
        return h1.b(entrySet());
    }

    @Override // f3.K0
    @Deprecated
    public final int remove(Object obj, int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // f3.K0
    @Deprecated
    public final int setCount(Object obj, int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, f3.K0
    public String toString() {
        return entrySet().toString();
    }

    public static <E> AbstractC5479o0 copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof AbstractC5479o0) {
            AbstractC5479o0 abstractC5479o0 = (AbstractC5479o0) iterable;
            if (!abstractC5479o0.isPartialView()) {
                return abstractC5479o0;
            }
        }
        b bVar = new b(L0.e(iterable));
        bVar.addAll((Iterable<Object>) iterable);
        return bVar.build();
    }

    public static <E> AbstractC5479o0 of(E e8) {
        return e(e8);
    }

    @Override // f3.K0
    public AbstractC5483q0 entrySet() {
        AbstractC5483q0 abstractC5483q0 = this.f31035c;
        if (abstractC5483q0 != null) {
            return abstractC5483q0;
        }
        AbstractC5483q0 abstractC5483q0G = g();
        this.f31035c = abstractC5483q0G;
        return abstractC5483q0G;
    }

    @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public t1 iterator() {
        return new a(this, entrySet().iterator());
    }

    @Override // f3.K0
    @Deprecated
    public final boolean setCount(Object obj, int i8, int i9) {
        throw new UnsupportedOperationException();
    }

    public static <E> AbstractC5479o0 of(E e8, E e9) {
        return e(e8, e9);
    }

    public static <E> AbstractC5479o0 of(E e8, E e9, E e10) {
        return e(e8, e9, e10);
    }

    public static <E> AbstractC5479o0 of(E e8, E e9, E e10, E e11) {
        return e(e8, e9, e10, e11);
    }

    public static <E> AbstractC5479o0 of(E e8, E e9, E e10, E e11, E e12) {
        return e(e8, e9, e10, e11, e12);
    }

    public static <E> AbstractC5479o0 of(E e8, E e9, E e10, E e11, E e12, E e13, E... eArr) {
        return new b().add((Object) e8).add((Object) e9).add((Object) e10).add((Object) e11).add((Object) e12).add((Object) e13).add((Object[]) eArr).build();
    }

    public static <E> AbstractC5479o0 copyOf(Iterator<? extends E> it) {
        return new b().addAll((Iterator<Object>) it).build();
    }
}
