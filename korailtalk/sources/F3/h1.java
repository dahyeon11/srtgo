package f3;

import f3.AbstractC5465h0;
import f3.AbstractC5483q0;
import f3.AbstractC5486s;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public abstract class h1 {

    class a extends l {

        /* renamed from: a */
        final /* synthetic */ Set f30951a;

        /* renamed from: b */
        final /* synthetic */ Set f30952b;

        /* renamed from: f3.h1$a$a */
        class C0295a extends AbstractC5452b {

            /* renamed from: c */
            final Iterator f30953c;

            /* renamed from: d */
            final Iterator f30954d;

            C0295a() {
                this.f30953c = a.this.f30951a.iterator();
                this.f30954d = a.this.f30952b.iterator();
            }

            @Override // f3.AbstractC5452b
            protected Object computeNext() {
                if (this.f30953c.hasNext()) {
                    return this.f30953c.next();
                }
                while (this.f30954d.hasNext()) {
                    Object next = this.f30954d.next();
                    if (!a.this.f30951a.contains(next)) {
                        return next;
                    }
                }
                return a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f30951a = set;
            this.f30952b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f30951a.contains(obj) || this.f30952b.contains(obj);
        }

        @Override // f3.h1.l
        public <S extends Set<E>> S copyInto(S s8) {
            s8.addAll(this.f30951a);
            s8.addAll(this.f30952b);
            return s8;
        }

        @Override // f3.h1.l
        public AbstractC5483q0 immutableCopy() {
            return new AbstractC5483q0.a().addAll((Iterable<Object>) this.f30951a).addAll((Iterable<Object>) this.f30952b).build();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f30951a.isEmpty() && this.f30952b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f30951a.size();
            Iterator it = this.f30952b.iterator();
            while (it.hasNext()) {
                if (!this.f30951a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }

        @Override // f3.h1.l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public t1 iterator() {
            return new C0295a();
        }
    }

    class b extends l {

        /* renamed from: a */
        final /* synthetic */ Set f30956a;

        /* renamed from: b */
        final /* synthetic */ Set f30957b;

        class a extends AbstractC5452b {

            /* renamed from: c */
            final Iterator f30958c;

            a() {
                this.f30958c = b.this.f30956a.iterator();
            }

            @Override // f3.AbstractC5452b
            protected Object computeNext() {
                while (this.f30958c.hasNext()) {
                    Object next = this.f30958c.next();
                    if (b.this.f30957b.contains(next)) {
                        return next;
                    }
                }
                return a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set set, Set set2) {
            super(null);
            this.f30956a = set;
            this.f30957b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f30956a.contains(obj) && this.f30957b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f30956a.containsAll(collection) && this.f30957b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f30957b, this.f30956a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator it = this.f30956a.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                if (this.f30957b.contains(it.next())) {
                    i8++;
                }
            }
            return i8;
        }

        @Override // f3.h1.l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public t1 iterator() {
            return new a();
        }
    }

    class c extends l {

        /* renamed from: a */
        final /* synthetic */ Set f30960a;

        /* renamed from: b */
        final /* synthetic */ Set f30961b;

        class a extends AbstractC5452b {

            /* renamed from: c */
            final Iterator f30962c;

            a() {
                this.f30962c = c.this.f30960a.iterator();
            }

            @Override // f3.AbstractC5452b
            protected Object computeNext() {
                while (this.f30962c.hasNext()) {
                    Object next = this.f30962c.next();
                    if (!c.this.f30961b.contains(next)) {
                        return next;
                    }
                }
                return a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Set set, Set set2) {
            super(null);
            this.f30960a = set;
            this.f30961b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f30960a.contains(obj) && !this.f30961b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f30961b.containsAll(this.f30960a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator it = this.f30960a.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                if (!this.f30961b.contains(it.next())) {
                    i8++;
                }
            }
            return i8;
        }

        @Override // f3.h1.l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public t1 iterator() {
            return new a();
        }
    }

    class d extends l {

        /* renamed from: a */
        final /* synthetic */ Set f30964a;

        /* renamed from: b */
        final /* synthetic */ Set f30965b;

        class a extends AbstractC5452b {

            /* renamed from: c */
            final /* synthetic */ Iterator f30966c;

            /* renamed from: d */
            final /* synthetic */ Iterator f30967d;

            a(Iterator it, Iterator it2) {
                this.f30966c = it;
                this.f30967d = it2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4, types: [E, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v6, types: [E, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v8, types: [E, java.lang.Object] */
            @Override // f3.AbstractC5452b
            public E computeNext() {
                while (this.f30966c.hasNext()) {
                    ?? next = this.f30966c.next();
                    if (!d.this.f30965b.contains(next)) {
                        return next;
                    }
                }
                while (this.f30967d.hasNext()) {
                    ?? next2 = this.f30967d.next();
                    if (!d.this.f30964a.contains(next2)) {
                        return next2;
                    }
                }
                return a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Set set, Set set2) {
            super(null);
            this.f30964a = set;
            this.f30965b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f30965b.contains(obj) ^ this.f30964a.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f30964a.equals(this.f30965b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator it = this.f30964a.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                if (!this.f30965b.contains(it.next())) {
                    i8++;
                }
            }
            Iterator it2 = this.f30965b.iterator();
            while (it2.hasNext()) {
                if (!this.f30964a.contains(it2.next())) {
                    i8++;
                }
            }
            return i8;
        }

        @Override // f3.h1.l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public t1 iterator() {
            return new a(this.f30964a.iterator(), this.f30965b.iterator());
        }
    }

    class e extends AbstractSet {

        /* renamed from: a */
        final /* synthetic */ int f30969a;

        /* renamed from: b */
        final /* synthetic */ AbstractC5469j0 f30970b;

        class a extends AbstractC5452b {

            /* renamed from: c */
            final BitSet f30971c;

            /* renamed from: f3.h1$e$a$a */
            class C0296a extends AbstractSet {

                /* renamed from: a */
                final /* synthetic */ BitSet f30973a;

                /* renamed from: f3.h1$e$a$a$a */
                class C0297a extends AbstractC5452b {

                    /* renamed from: c */
                    int f30975c = -1;

                    C0297a() {
                    }

                    @Override // f3.AbstractC5452b
                    protected Object computeNext() {
                        int iNextSetBit = C0296a.this.f30973a.nextSetBit(this.f30975c + 1);
                        this.f30975c = iNextSetBit;
                        return iNextSetBit == -1 ? a() : e.this.f30970b.keySet().asList().get(this.f30975c);
                    }
                }

                C0296a(BitSet bitSet) {
                    this.f30973a = bitSet;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(Object obj) {
                    Integer num = (Integer) e.this.f30970b.get(obj);
                    return num != null && this.f30973a.get(num.intValue());
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<E> iterator() {
                    return new C0297a();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return e.this.f30969a;
                }
            }

            a() {
                this.f30971c = new BitSet(e.this.f30970b.size());
            }

            @Override // f3.AbstractC5452b
            /* renamed from: c */
            public Set computeNext() {
                if (this.f30971c.isEmpty()) {
                    this.f30971c.set(0, e.this.f30969a);
                } else {
                    int iNextSetBit = this.f30971c.nextSetBit(0);
                    int iNextClearBit = this.f30971c.nextClearBit(iNextSetBit);
                    if (iNextClearBit == e.this.f30970b.size()) {
                        return (Set) a();
                    }
                    int i8 = (iNextClearBit - iNextSetBit) - 1;
                    this.f30971c.set(0, i8);
                    this.f30971c.clear(i8, iNextClearBit);
                    this.f30971c.set(iNextClearBit);
                }
                return new C0296a((BitSet) this.f30971c.clone());
            }
        }

        e(int i8, AbstractC5469j0 abstractC5469j0) {
            this.f30969a = i8;
            this.f30970b = abstractC5469j0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            return set.size() == this.f30969a && this.f30970b.keySet().containsAll(set);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i3.b.binomial(this.f30970b.size(), this.f30969a);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "Sets.combinations(" + this.f30970b.keySet() + ", " + this.f30969a + ")";
        }
    }

    private static final class f extends AbstractC5444P implements Set {

        /* renamed from: a */
        private final transient AbstractC5465h0 f30977a;

        /* renamed from: b */
        private final transient C5482q f30978b;

        class a extends AbstractC5465h0 {

            /* renamed from: c */
            final /* synthetic */ AbstractC5465h0 f30979c;

            a(AbstractC5465h0 abstractC5465h0) {
                this.f30979c = abstractC5465h0;
            }

            @Override // f3.AbstractC5457d0
            boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.f30979c.size();
            }

            @Override // java.util.List
            public List<Object> get(int i8) {
                return ((AbstractC5483q0) this.f30979c.get(i8)).asList();
            }
        }

        private f(AbstractC5465h0 abstractC5465h0, C5482q c5482q) {
            this.f30977a = abstractC5465h0;
            this.f30978b = c5482q;
        }

        static Set d(List list) {
            AbstractC5465h0.a aVar = new AbstractC5465h0.a(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC5483q0 abstractC5483q0CopyOf = AbstractC5483q0.copyOf((Collection) it.next());
                if (abstractC5483q0CopyOf.isEmpty()) {
                    return AbstractC5483q0.of();
                }
                aVar.add((Object) abstractC5483q0CopyOf);
            }
            AbstractC5465h0 abstractC5465h0Build = aVar.build();
            return new f(abstractC5465h0Build, new C5482q(new a(abstractC5465h0Build)));
        }

        @Override // f3.X
        /* renamed from: a */
        public Collection delegate() {
            return this.f30978b;
        }

        @Override // f3.AbstractC5444P, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (list.size() != this.f30977a.size()) {
                return false;
            }
            Iterator it = list.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                if (!((AbstractC5483q0) this.f30977a.get(i8)).contains(it.next())) {
                    return false;
                }
                i8++;
            }
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return obj instanceof f ? this.f30977a.equals(((f) obj).f30977a) : super.equals(obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int i8 = 1;
            int size = size() - 1;
            for (int i9 = 0; i9 < this.f30977a.size(); i9++) {
                size = ~(~(size * 31));
            }
            t1 it = this.f30977a.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                i8 = ~(~((i8 * 31) + ((size() / set.size()) * set.hashCode())));
            }
            return ~(~(i8 + size));
        }
    }

    private static class g extends i implements NavigableSet {
        g(NavigableSet navigableSet, e3.x xVar) {
            super(navigableSet, xVar);
        }

        NavigableSet b() {
            return (NavigableSet) this.f31087a;
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return AbstractC5493v0.find(b().tailSet(obj, true), this.f31088b, null);
        }

        @Override // java.util.NavigableSet
        public Iterator<Object> descendingIterator() {
            return AbstractC5495w0.filter(b().descendingIterator(), this.f31088b);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> descendingSet() {
            return h1.filter(b().descendingSet(), this.f31088b);
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return AbstractC5495w0.find(b().headSet(obj, true).descendingIterator(), this.f31088b, null);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> headSet(Object obj, boolean z8) {
            return h1.filter(b().headSet(obj, z8), this.f31088b);
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return AbstractC5493v0.find(b().tailSet(obj, false), this.f31088b, null);
        }

        @Override // f3.h1.i, java.util.SortedSet
        public Object last() {
            return AbstractC5495w0.find(b().descendingIterator(), this.f31088b);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return AbstractC5495w0.find(b().headSet(obj, false).descendingIterator(), this.f31088b, null);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return AbstractC5493v0.c(b(), this.f31088b);
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return AbstractC5493v0.c(b().descendingSet(), this.f31088b);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> subSet(Object obj, boolean z8, Object obj2, boolean z9) {
            return h1.filter(b().subSet(obj, z8, obj2, z9), this.f31088b);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> tailSet(Object obj, boolean z8) {
            return h1.filter(b().tailSet(obj, z8), this.f31088b);
        }
    }

    private static class h extends AbstractC5486s.a implements Set {
        h(Set set, e3.x xVar) {
            super(set, xVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return h1.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return h1.b(this);
        }
    }

    private static class i extends h implements SortedSet {
        i(SortedSet sortedSet, e3.x xVar) {
            super(sortedSet, xVar);
        }

        @Override // java.util.SortedSet
        public Comparator<Object> comparator() {
            return ((SortedSet) this.f31087a).comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return AbstractC5495w0.find(this.f31087a.iterator(), this.f31088b);
        }

        @Override // java.util.SortedSet
        public SortedSet<Object> headSet(Object obj) {
            return new i(((SortedSet) this.f31087a).headSet(obj), this.f31088b);
        }

        public Object last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f31087a;
            while (true) {
                Object objLast = sortedSetHeadSet.last();
                if (this.f31088b.apply(objLast)) {
                    return objLast;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<Object> subSet(Object obj, Object obj2) {
            return new i(((SortedSet) this.f31087a).subSet(obj, obj2), this.f31088b);
        }

        @Override // java.util.SortedSet
        public SortedSet<Object> tailSet(Object obj) {
            return new i(((SortedSet) this.f31087a).tailSet(obj), this.f31088b);
        }
    }

    static abstract class j extends AbstractSet {
        j() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return h1.d(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) e3.w.checkNotNull(collection));
        }
    }

    private static final class k extends AbstractSet {

        /* renamed from: a */
        final AbstractC5469j0 f30980a;

        class a extends AbstractC5450a {
            a(int i8) {
                super(i8);
            }

            @Override // f3.AbstractC5450a
            /* renamed from: a */
            public Set get(int i8) {
                return new m(k.this.f30980a, i8);
            }
        }

        k(Set set) {
            e3.w.checkArgument(set.size() <= 30, "Too many elements to create power set: %s > 30", set.size());
            this.f30980a = E0.s(set);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            return this.f30980a.keySet().containsAll((Set) obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return obj instanceof k ? this.f30980a.keySet().equals(((k) obj).f30980a.keySet()) : super.equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.f30980a.keySet().hashCode() << (this.f30980a.size() - 1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<Object>> iterator() {
            return new a(size());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return 1 << this.f30980a.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "powerSet(" + this.f30980a + ")";
        }
    }

    public static abstract class l extends AbstractSet {
        /* synthetic */ l(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<Object> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        public <S extends Set<Object>> S copyInto(S s8) {
            s8.addAll(this);
            return s8;
        }

        public AbstractC5483q0 immutableCopy() {
            return AbstractC5483q0.copyOf((Collection) this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract t1 iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private l() {
        }
    }

    private static final class m extends AbstractSet {

        /* renamed from: a */
        private final AbstractC5469j0 f30982a;

        /* renamed from: b */
        private final int f30983b;

        class a extends t1 {

            /* renamed from: a */
            final AbstractC5465h0 f30984a;

            /* renamed from: b */
            int f30985b;

            a() {
                this.f30984a = m.this.f30982a.keySet().asList();
                this.f30985b = m.this.f30983b;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f30985b != 0;
            }

            @Override // java.util.Iterator
            public Object next() {
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(this.f30985b);
                if (iNumberOfTrailingZeros == 32) {
                    throw new NoSuchElementException();
                }
                this.f30985b &= ~(1 << iNumberOfTrailingZeros);
                return this.f30984a.get(iNumberOfTrailingZeros);
            }
        }

        m(AbstractC5469j0 abstractC5469j0, int i8) {
            this.f30982a = abstractC5469j0;
            this.f30983b = i8;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Integer num = (Integer) this.f30982a.get(obj);
            if (num != null) {
                if (((1 << num.intValue()) & this.f30983b) != 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Object> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Integer.bitCount(this.f30983b);
        }
    }

    static final class n extends AbstractC5451a0 implements NavigableSet, Serializable {

        /* renamed from: a */
        private final NavigableSet f30987a;

        /* renamed from: b */
        private final SortedSet f30988b;

        /* renamed from: c */
        private transient n f30989c;

        n(NavigableSet navigableSet) {
            this.f30987a = (NavigableSet) e3.w.checkNotNull(navigableSet);
            this.f30988b = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return this.f30987a.ceiling(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator<Object> descendingIterator() {
            return AbstractC5495w0.unmodifiableIterator(this.f30987a.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> descendingSet() {
            n nVar = this.f30989c;
            if (nVar != null) {
                return nVar;
            }
            n nVar2 = new n(this.f30987a.descendingSet());
            this.f30989c = nVar2;
            nVar2.f30989c = this;
            return nVar2;
        }

        @Override // f3.X
        /* renamed from: e */
        public SortedSet delegate() {
            return this.f30988b;
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return this.f30987a.floor(obj);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> headSet(Object obj, boolean z8) {
            return h1.unmodifiableNavigableSet(this.f30987a.headSet(obj, z8));
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return this.f30987a.higher(obj);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return this.f30987a.lower(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> subSet(Object obj, boolean z8, Object obj2, boolean z9) {
            return h1.unmodifiableNavigableSet(this.f30987a.subSet(obj, z8, obj2, z9));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<Object> tailSet(Object obj, boolean z8) {
            return h1.unmodifiableNavigableSet(this.f30987a.tailSet(obj, z8));
        }
    }

    static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static int b(Set set) {
        Iterator it = set.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i8 = ~(~(i8 + (next != null ? next.hashCode() : 0)));
        }
        return i8;
    }

    private static EnumSet c(Collection collection, Class cls) {
        EnumSet enumSetAllOf = EnumSet.allOf(cls);
        enumSetAllOf.removeAll(collection);
        return enumSetAllOf;
    }

    public static <B> Set<List<B>> cartesianProduct(List<? extends Set<? extends B>> list) {
        return f.d(list);
    }

    public static <E> Set<Set<E>> combinations(Set<E> set, int i8) {
        AbstractC5469j0 abstractC5469j0S = E0.s(set);
        AbstractC5484r.b(i8, "size");
        e3.w.checkArgument(i8 <= abstractC5469j0S.size(), "size (%s) must be <= set.size() (%s)", i8, abstractC5469j0S.size());
        return i8 == 0 ? AbstractC5483q0.of(AbstractC5483q0.of()) : i8 == abstractC5469j0S.size() ? AbstractC5483q0.of(abstractC5469j0S.keySet()) : new e(i8, abstractC5469j0S);
    }

    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection) {
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        e3.w.checkArgument(!collection.isEmpty(), "collection is empty; use the other version of this method");
        return c(collection, collection.iterator().next().getDeclaringClass());
    }

    static boolean d(Set set, Collection collection) {
        e3.w.checkNotNull(collection);
        if (collection instanceof K0) {
            collection = ((K0) collection).elementSet();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? e(set, collection.iterator()) : AbstractC5495w0.removeAll(set.iterator(), collection);
    }

    public static <E> l difference(Set<E> set, Set<?> set2) {
        e3.w.checkNotNull(set, "set1");
        e3.w.checkNotNull(set2, "set2");
        return new c(set, set2);
    }

    static boolean e(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static <E> Set<E> filter(Set<E> set, e3.x xVar) {
        if (set instanceof SortedSet) {
            return filter((SortedSet) set, xVar);
        }
        if (!(set instanceof h)) {
            return new h((Set) e3.w.checkNotNull(set), (e3.x) e3.w.checkNotNull(xVar));
        }
        h hVar = (h) set;
        return new h((Set) hVar.f31087a, e3.y.and(hVar.f31088b, xVar));
    }

    public static <E extends Enum<E>> AbstractC5483q0 immutableEnumSet(E e8, E... eArr) {
        return C5463g0.l(EnumSet.of((Enum) e8, (Enum[]) eArr));
    }

    public static <E> l intersection(Set<E> set, Set<?> set2) {
        e3.w.checkNotNull(set, "set1");
        e3.w.checkNotNull(set2, "set2");
        return new b(set, set2);
    }

    public static <E> Set<E> newConcurrentHashSet() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet() {
        return new CopyOnWriteArraySet<>();
    }

    public static <E extends Enum<E>> EnumSet<E> newEnumSet(Iterable<E> iterable, Class<E> cls) {
        EnumSet<E> enumSetNoneOf = EnumSet.noneOf(cls);
        AbstractC5493v0.addAll(enumSetNoneOf, iterable);
        return enumSetNoneOf;
    }

    public static <E> HashSet<E> newHashSet() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> newHashSetWithExpectedSize(int i8) {
        return new HashSet<>(E0.k(i8));
    }

    public static <E> Set<E> newIdentityHashSet() {
        return Collections.newSetFromMap(E0.newIdentityHashMap());
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet() {
        return new LinkedHashSet<>();
    }

    public static <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i8) {
        return new LinkedHashSet<>(E0.k(i8));
    }

    @Deprecated
    public static <E> Set<E> newSetFromMap(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet() {
        return new TreeSet<>();
    }

    public static <E> Set<Set<E>> powerSet(Set<E> set) {
        return new k(set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K extends Comparable<? super K>> NavigableSet<K> subSet(NavigableSet<K> navigableSet, W0 w02) {
        if (navigableSet.comparator() != null && navigableSet.comparator() != T0.natural() && w02.hasLowerBound() && w02.hasUpperBound()) {
            e3.w.checkArgument(navigableSet.comparator().compare(w02.lowerEndpoint(), w02.upperEndpoint()) <= 0, "set is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (w02.hasLowerBound() && w02.hasUpperBound()) {
            Comparable comparableLowerEndpoint = w02.lowerEndpoint();
            EnumC5478o enumC5478oLowerBoundType = w02.lowerBoundType();
            EnumC5478o enumC5478o = EnumC5478o.CLOSED;
            return navigableSet.subSet(comparableLowerEndpoint, enumC5478oLowerBoundType == enumC5478o, w02.upperEndpoint(), w02.upperBoundType() == enumC5478o);
        }
        if (w02.hasLowerBound()) {
            return navigableSet.tailSet(w02.lowerEndpoint(), w02.lowerBoundType() == EnumC5478o.CLOSED);
        }
        if (w02.hasUpperBound()) {
            return navigableSet.headSet(w02.upperEndpoint(), w02.upperBoundType() == EnumC5478o.CLOSED);
        }
        return (NavigableSet) e3.w.checkNotNull(navigableSet);
    }

    public static <E> l symmetricDifference(Set<? extends E> set, Set<? extends E> set2) {
        e3.w.checkNotNull(set, "set1");
        e3.w.checkNotNull(set2, "set2");
        return new d(set, set2);
    }

    public static <E> NavigableSet<E> synchronizedNavigableSet(NavigableSet<E> navigableSet) {
        return p1.o(navigableSet);
    }

    public static <E> l union(Set<? extends E> set, Set<? extends E> set2) {
        e3.w.checkNotNull(set, "set1");
        e3.w.checkNotNull(set2, "set2");
        return new a(set, set2);
    }

    public static <E> NavigableSet<E> unmodifiableNavigableSet(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof AbstractC5457d0) || (navigableSet instanceof n)) ? navigableSet : new n(navigableSet);
    }

    @SafeVarargs
    public static <B> Set<List<B>> cartesianProduct(Set<? extends B>... setArr) {
        return cartesianProduct(Arrays.asList(setArr));
    }

    public static <E extends Enum<E>> AbstractC5483q0 immutableEnumSet(Iterable<E> iterable) {
        if (iterable instanceof C5463g0) {
            return (C5463g0) iterable;
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return collection.isEmpty() ? AbstractC5483q0.of() : C5463g0.l(EnumSet.copyOf(collection));
        }
        Iterator<E> it = iterable.iterator();
        if (!it.hasNext()) {
            return AbstractC5483q0.of();
        }
        EnumSet enumSetOf = EnumSet.of((Enum) it.next());
        AbstractC5495w0.addAll(enumSetOf, it);
        return C5463g0.l(enumSetOf);
    }

    public static <E> Set<E> newConcurrentHashSet(Iterable<? extends E> iterable) {
        Set<E> setNewConcurrentHashSet = newConcurrentHashSet();
        AbstractC5493v0.addAll(setNewConcurrentHashSet, iterable);
        return setNewConcurrentHashSet;
    }

    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet(Iterable<? extends E> iterable) {
        return new CopyOnWriteArraySet<>(iterable instanceof Collection ? (Collection) iterable : A0.newArrayList(iterable));
    }

    public static <E> HashSet<E> newHashSet(E... eArr) {
        HashSet<E> hashSetNewHashSetWithExpectedSize = newHashSetWithExpectedSize(eArr.length);
        Collections.addAll(hashSetNewHashSetWithExpectedSize, eArr);
        return hashSetNewHashSetWithExpectedSize;
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>((Collection) iterable);
        }
        LinkedHashSet<E> linkedHashSetNewLinkedHashSet = newLinkedHashSet();
        AbstractC5493v0.addAll(linkedHashSetNewLinkedHashSet, iterable);
        return linkedHashSetNewLinkedHashSet;
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet(Iterable<? extends E> iterable) {
        TreeSet<E> treeSetNewTreeSet = newTreeSet();
        AbstractC5493v0.addAll(treeSetNewTreeSet, iterable);
        return treeSetNewTreeSet;
    }

    public static <E> HashSet<E> newHashSet(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new HashSet<>((Collection) iterable);
        }
        return newHashSet(iterable.iterator());
    }

    public static <E> TreeSet<E> newTreeSet(Comparator<? super E> comparator) {
        return new TreeSet<>((Comparator) e3.w.checkNotNull(comparator));
    }

    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection, Class<E> cls) {
        e3.w.checkNotNull(collection);
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        return c(collection, cls);
    }

    public static <E> HashSet<E> newHashSet(Iterator<? extends E> it) {
        HashSet<E> hashSetNewHashSet = newHashSet();
        AbstractC5495w0.addAll(hashSetNewHashSet, it);
        return hashSetNewHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> filter(SortedSet<E> sortedSet, e3.x xVar) {
        if (sortedSet instanceof h) {
            h hVar = (h) sortedSet;
            return new i((SortedSet) hVar.f31087a, e3.y.and(hVar.f31088b, xVar));
        }
        return new i((SortedSet) e3.w.checkNotNull(sortedSet), (e3.x) e3.w.checkNotNull(xVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> NavigableSet<E> filter(NavigableSet<E> navigableSet, e3.x xVar) {
        if (navigableSet instanceof h) {
            h hVar = (h) navigableSet;
            return new g((NavigableSet) hVar.f31087a, e3.y.and(hVar.f31088b, xVar));
        }
        return new g((NavigableSet) e3.w.checkNotNull(navigableSet), (e3.x) e3.w.checkNotNull(xVar));
    }
}
