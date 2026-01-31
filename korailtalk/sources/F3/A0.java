package f3;

import j3.AbstractC5820b;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public abstract class A0 {

    private static final class a extends AbstractList {

        /* renamed from: a */
        private final CharSequence f30593a;

        a(CharSequence charSequence) {
            this.f30593a = charSequence;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f30593a.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int i8) {
            e3.w.checkElementIndex(i8, size());
            return Character.valueOf(this.f30593a.charAt(i8));
        }
    }

    private static class b extends AbstractList implements Serializable, RandomAccess {

        /* renamed from: a */
        final Object f30594a;

        /* renamed from: b */
        final Object[] f30595b;

        b(Object obj, Object[] objArr) {
            this.f30594a = obj;
            this.f30595b = (Object[]) e3.w.checkNotNull(objArr);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i8) {
            e3.w.checkElementIndex(i8, size());
            return i8 == 0 ? this.f30594a : this.f30595b[i8 - 1];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return i3.b.saturatedAdd(this.f30595b.length, 1);
        }
    }

    private static class c extends AbstractList {

        /* renamed from: a */
        final List f30596a;

        /* renamed from: b */
        final int f30597b;

        c(List list, int i8) {
            this.f30596a = list;
            this.f30597b = i8;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f30596a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return i3.b.divide(this.f30596a.size(), this.f30597b, RoundingMode.CEILING);
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Object> get(int i8) {
            e3.w.checkElementIndex(i8, size());
            int i9 = this.f30597b;
            int i10 = i8 * i9;
            return this.f30596a.subList(i10, Math.min(i9 + i10, this.f30596a.size()));
        }
    }

    private static class d extends c implements RandomAccess {
        d(List list, int i8) {
            super(list, i8);
        }
    }

    private static class e extends f implements RandomAccess {
        e(List list) {
            super(list);
        }
    }

    private static class f extends AbstractList {

        /* renamed from: a */
        private final List f30598a;

        class a implements ListIterator {

            /* renamed from: a */
            boolean f30599a;

            /* renamed from: b */
            final /* synthetic */ ListIterator f30600b;

            a(ListIterator listIterator) {
                this.f30600b = listIterator;
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                this.f30600b.add(obj);
                this.f30600b.previous();
                this.f30599a = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f30600b.hasPrevious();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f30600b.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f30599a = true;
                return this.f30600b.previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return f.this.d(this.f30600b.nextIndex());
            }

            @Override // java.util.ListIterator
            public Object previous() {
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f30599a = true;
                return this.f30600b.next();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                AbstractC5484r.d(this.f30599a);
                this.f30600b.remove();
                this.f30599a = false;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                e3.w.checkState(this.f30599a);
                this.f30600b.set(obj);
            }
        }

        f(List list) {
            this.f30598a = (List) e3.w.checkNotNull(list);
        }

        private int c(int i8) {
            int size = size();
            e3.w.checkElementIndex(i8, size);
            return (size - 1) - i8;
        }

        public int d(int i8) {
            int size = size();
            e3.w.checkPositionIndex(i8, size);
            return size - i8;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i8, Object obj) {
            this.f30598a.add(d(i8), obj);
        }

        List b() {
            return this.f30598a;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f30598a.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i8) {
            return this.f30598a.get(c(i8));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<Object> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<Object> listIterator(int i8) {
            return new a(this.f30598a.listIterator(d(i8)));
        }

        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i8) {
            return this.f30598a.remove(c(i8));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i8, int i9) {
            subList(i8, i9).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i8, Object obj) {
            return this.f30598a.set(c(i8), obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f30598a.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Object> subList(int i8, int i9) {
            e3.w.checkPositionIndexes(i8, i9, size());
            return A0.reverse(this.f30598a.subList(d(i9), d(i8)));
        }
    }

    private static final class g extends AbstractC5465h0 {

        /* renamed from: c */
        private final String f30602c;

        g(String str) {
            this.f30602c = str;
        }

        @Override // f3.AbstractC5465h0, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Character) {
                return this.f30602c.indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // f3.AbstractC5457d0
        boolean isPartialView() {
            return false;
        }

        @Override // f3.AbstractC5465h0, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return this.f30602c.lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f30602c.length();
        }

        @Override // java.util.List
        public Character get(int i8) {
            e3.w.checkElementIndex(i8, size());
            return Character.valueOf(this.f30602c.charAt(i8));
        }

        @Override // f3.AbstractC5465h0, java.util.List
        public AbstractC5465h0 subList(int i8, int i9) {
            e3.w.checkPositionIndexes(i8, i9, size());
            return A0.charactersOf(this.f30602c.substring(i8, i9));
        }
    }

    private static class h extends AbstractList implements RandomAccess, Serializable {

        /* renamed from: a */
        final List f30603a;

        /* renamed from: b */
        final e3.l f30604b;

        class a extends s1 {
            a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // f3.r1
            Object a(Object obj) {
                return h.this.f30604b.apply(obj);
            }
        }

        h(List list, e3.l lVar) {
            this.f30603a = (List) e3.w.checkNotNull(list);
            this.f30604b = (e3.l) e3.w.checkNotNull(lVar);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f30603a.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i8) {
            return this.f30604b.apply(this.f30603a.get(i8));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f30603a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<Object> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<Object> listIterator(int i8) {
            return new a(this.f30603a.listIterator(i8));
        }

        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i8) {
            return this.f30604b.apply(this.f30603a.remove(i8));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f30603a.size();
        }
    }

    private static class i extends AbstractSequentialList implements Serializable {

        /* renamed from: a */
        final List f30606a;

        /* renamed from: b */
        final e3.l f30607b;

        class a extends s1 {
            a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // f3.r1
            Object a(Object obj) {
                return i.this.f30607b.apply(obj);
            }
        }

        i(List list, e3.l lVar) {
            this.f30606a = (List) e3.w.checkNotNull(list);
            this.f30607b = (e3.l) e3.w.checkNotNull(lVar);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f30606a.clear();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<Object> listIterator(int i8) {
            return new a(this.f30606a.listIterator(i8));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f30606a.size();
        }
    }

    private static class j extends AbstractList implements Serializable, RandomAccess {

        /* renamed from: a */
        final Object f30609a;

        /* renamed from: b */
        final Object f30610b;

        /* renamed from: c */
        final Object[] f30611c;

        j(Object obj, Object obj2, Object[] objArr) {
            this.f30609a = obj;
            this.f30610b = obj2;
            this.f30611c = (Object[]) e3.w.checkNotNull(objArr);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i8) {
            if (i8 == 0) {
                return this.f30609a;
            }
            if (i8 == 1) {
                return this.f30610b;
            }
            e3.w.checkElementIndex(i8, size());
            return this.f30611c[i8 - 2];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return i3.b.saturatedAdd(this.f30611c.length, 2);
        }
    }

    static List a(Iterable iterable) {
        return (List) iterable;
    }

    public static <E> List<E> asList(E e8, E[] eArr) {
        return new b(e8, eArr);
    }

    static int b(int i8) {
        AbstractC5484r.b(i8, "arraySize");
        return AbstractC5820b.saturatedCast(i8 + 5 + (i8 / 10));
    }

    static boolean c(List list, Object obj) {
        if (obj == e3.w.checkNotNull(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return AbstractC5495w0.elementsEqual(list.iterator(), list2.iterator());
        }
        for (int i8 = 0; i8 < size; i8++) {
            if (!e3.r.equal(list.get(i8), list2.get(i8))) {
                return false;
            }
        }
        return true;
    }

    public static <B> List<List<B>> cartesianProduct(List<? extends List<? extends B>> list) {
        return C5482q.c(list);
    }

    public static AbstractC5465h0 charactersOf(String str) {
        return new g((String) e3.w.checkNotNull(str));
    }

    static int d(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (e3.r.equal(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int e(List list, Object obj) {
        int size = list.size();
        int i8 = 0;
        if (obj == null) {
            while (i8 < size) {
                if (list.get(i8) == null) {
                    return i8;
                }
                i8++;
            }
            return -1;
        }
        while (i8 < size) {
            if (obj.equals(list.get(i8))) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    static int f(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return g(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (e3.r.equal(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int g(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> newArrayListWithCapacity(int i8) {
        AbstractC5484r.b(i8, "initialArraySize");
        return new ArrayList<>(i8);
    }

    public static <E> ArrayList<E> newArrayListWithExpectedSize(int i8) {
        return new ArrayList<>(b(i8));
    }

    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList() {
        return new CopyOnWriteArrayList<>();
    }

    public static <E> LinkedList<E> newLinkedList() {
        return new LinkedList<>();
    }

    public static <T> List<List<T>> partition(List<T> list, int i8) {
        e3.w.checkNotNull(list);
        e3.w.checkArgument(i8 > 0);
        return list instanceof RandomAccess ? new d(list, i8) : new c(list, i8);
    }

    public static <T> List<T> reverse(List<T> list) {
        return list instanceof AbstractC5465h0 ? ((AbstractC5465h0) list).reverse() : list instanceof f ? ((f) list).b() : list instanceof RandomAccess ? new e(list) : new f(list);
    }

    public static <F, T> List<T> transform(List<F> list, e3.l lVar) {
        return list instanceof RandomAccess ? new h(list, lVar) : new i(list, lVar);
    }

    public static <E> List<E> asList(E e8, E e9, E[] eArr) {
        return new j(e8, e9, eArr);
    }

    @SafeVarargs
    public static <B> List<List<B>> cartesianProduct(List<? extends B>... listArr) {
        return cartesianProduct(Arrays.asList(listArr));
    }

    public static List<Character> charactersOf(CharSequence charSequence) {
        return new a((CharSequence) e3.w.checkNotNull(charSequence));
    }

    @SafeVarargs
    public static <E> ArrayList<E> newArrayList(E... eArr) {
        e3.w.checkNotNull(eArr);
        ArrayList<E> arrayList = new ArrayList<>(b(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList(Iterable<? extends E> iterable) {
        return new CopyOnWriteArrayList<>(iterable instanceof Collection ? (Collection) iterable : newArrayList(iterable));
    }

    public static <E> LinkedList<E> newLinkedList(Iterable<? extends E> iterable) {
        LinkedList<E> linkedListNewLinkedList = newLinkedList();
        AbstractC5493v0.addAll(linkedListNewLinkedList, iterable);
        return linkedListNewLinkedList;
    }

    public static <E> ArrayList<E> newArrayList(Iterable<? extends E> iterable) {
        e3.w.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        return newArrayList(iterable.iterator());
    }

    public static <E> ArrayList<E> newArrayList(Iterator<? extends E> it) {
        ArrayList<E> arrayListNewArrayList = newArrayList();
        AbstractC5495w0.addAll(arrayListNewArrayList, it);
        return arrayListNewArrayList;
    }
}
