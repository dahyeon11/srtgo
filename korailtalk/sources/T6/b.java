package T6;

import S6.AbstractC0759c;
import S6.AbstractC0761e;
import S6.AbstractC0765i;
import S6.r;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* loaded from: classes3.dex */
public final class b extends AbstractC0761e implements List, RandomAccess, Serializable, KMutableList {

    /* renamed from: g */
    private static final a f4928g = new a(null);

    /* renamed from: h */
    private static final b f4929h;

    /* renamed from: a */
    private Object[] f4930a;

    /* renamed from: b */
    private int f4931b;

    /* renamed from: c */
    private int f4932c;

    /* renamed from: d */
    private boolean f4933d;

    /* renamed from: e */
    private final b f4934e;

    /* renamed from: f */
    private final b f4935f;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: T6.b$b */
    private static final class C0076b implements ListIterator, KMutableListIterator {

        /* renamed from: a */
        private final b f4936a;

        /* renamed from: b */
        private int f4937b;

        /* renamed from: c */
        private int f4938c;

        /* renamed from: d */
        private int f4939d;

        public C0076b(b list, int i8) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f4936a = list;
            this.f4937b = i8;
            this.f4938c = -1;
            this.f4939d = ((AbstractList) list).modCount;
        }

        private final void a() {
            if (((AbstractList) this.f4936a).modCount != this.f4939d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            a();
            b bVar = this.f4936a;
            int i8 = this.f4937b;
            this.f4937b = i8 + 1;
            bVar.add(i8, obj);
            this.f4938c = -1;
            this.f4939d = ((AbstractList) this.f4936a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f4937b < this.f4936a.f4932c;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f4937b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            a();
            if (this.f4937b >= this.f4936a.f4932c) {
                throw new NoSuchElementException();
            }
            int i8 = this.f4937b;
            this.f4937b = i8 + 1;
            this.f4938c = i8;
            return this.f4936a.f4930a[this.f4936a.f4931b + this.f4938c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f4937b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            a();
            int i8 = this.f4937b;
            if (i8 <= 0) {
                throw new NoSuchElementException();
            }
            int i9 = i8 - 1;
            this.f4937b = i9;
            this.f4938c = i9;
            return this.f4936a.f4930a[this.f4936a.f4931b + this.f4938c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f4937b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            int i8 = this.f4938c;
            if (i8 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f4936a.remove(i8);
            this.f4937b = this.f4938c;
            this.f4938c = -1;
            this.f4939d = ((AbstractList) this.f4936a).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            a();
            int i8 = this.f4938c;
            if (i8 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f4936a.set(i8, obj);
        }
    }

    static {
        b bVar = new b(0);
        bVar.f4933d = true;
        f4929h = bVar;
    }

    private b(Object[] objArr, int i8, int i9, boolean z8, b bVar, b bVar2) {
        this.f4930a = objArr;
        this.f4931b = i8;
        this.f4932c = i9;
        this.f4933d = z8;
        this.f4934e = bVar;
        this.f4935f = bVar2;
        if (bVar != null) {
            ((AbstractList) this).modCount = ((AbstractList) bVar).modCount;
        }
    }

    private final void a(int i8, Collection collection, int i9) {
        j();
        b bVar = this.f4934e;
        if (bVar != null) {
            bVar.a(i8, collection, i9);
            this.f4930a = this.f4934e.f4930a;
            this.f4932c += i9;
        } else {
            h(i8, i9);
            Iterator it = collection.iterator();
            for (int i10 = 0; i10 < i9; i10++) {
                this.f4930a[i8 + i10] = it.next();
            }
        }
    }

    private final void b(int i8, Object obj) {
        j();
        b bVar = this.f4934e;
        if (bVar == null) {
            h(i8, 1);
            this.f4930a[i8] = obj;
        } else {
            bVar.b(i8, obj);
            this.f4930a = this.f4934e.f4930a;
            this.f4932c++;
        }
    }

    private final void c() {
        b bVar = this.f4935f;
        if (bVar != null && ((AbstractList) bVar).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void d() {
        if (i()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean e(List list) {
        return c.a(this.f4930a, this.f4931b, this.f4932c, list);
    }

    private final void f(int i8) {
        if (i8 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f4930a;
        if (i8 > objArr.length) {
            this.f4930a = c.copyOfUninitializedElements(this.f4930a, AbstractC0759c.Companion.newCapacity$kotlin_stdlib(objArr.length, i8));
        }
    }

    private final void g(int i8) {
        f(this.f4932c + i8);
    }

    private final void h(int i8, int i9) {
        g(i9);
        Object[] objArr = this.f4930a;
        AbstractC0765i.copyInto(objArr, objArr, i8 + i9, i8, this.f4931b + this.f4932c);
        this.f4932c += i9;
    }

    private final boolean i() {
        b bVar;
        return this.f4933d || ((bVar = this.f4935f) != null && bVar.f4933d);
    }

    private final void j() {
        ((AbstractList) this).modCount++;
    }

    private final Object k(int i8) {
        j();
        b bVar = this.f4934e;
        if (bVar != null) {
            this.f4932c--;
            return bVar.k(i8);
        }
        Object[] objArr = this.f4930a;
        Object obj = objArr[i8];
        AbstractC0765i.copyInto(objArr, objArr, i8, i8 + 1, this.f4931b + this.f4932c);
        c.resetAt(this.f4930a, (this.f4931b + this.f4932c) - 1);
        this.f4932c--;
        return obj;
    }

    private final void l(int i8, int i9) {
        if (i9 > 0) {
            j();
        }
        b bVar = this.f4934e;
        if (bVar != null) {
            bVar.l(i8, i9);
        } else {
            Object[] objArr = this.f4930a;
            AbstractC0765i.copyInto(objArr, objArr, i8, i8 + i9, this.f4932c);
            Object[] objArr2 = this.f4930a;
            int i10 = this.f4932c;
            c.resetRange(objArr2, i10 - i9, i10);
        }
        this.f4932c -= i9;
    }

    private final int m(int i8, int i9, Collection collection, boolean z8) {
        int iM;
        b bVar = this.f4934e;
        if (bVar != null) {
            iM = bVar.m(i8, i9, collection, z8);
        } else {
            int i10 = 0;
            int i11 = 0;
            while (i10 < i9) {
                int i12 = i8 + i10;
                if (collection.contains(this.f4930a[i12]) == z8) {
                    Object[] objArr = this.f4930a;
                    i10++;
                    objArr[i11 + i8] = objArr[i12];
                    i11++;
                } else {
                    i10++;
                }
            }
            int i13 = i9 - i11;
            Object[] objArr2 = this.f4930a;
            AbstractC0765i.copyInto(objArr2, objArr2, i8 + i11, i9 + i8, this.f4932c);
            Object[] objArr3 = this.f4930a;
            int i14 = this.f4932c;
            c.resetRange(objArr3, i14 - i13, i14);
            iM = i13;
        }
        if (iM > 0) {
            j();
        }
        this.f4932c -= iM;
        return iM;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        d();
        c();
        b(this.f4931b + this.f4932c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        d();
        c();
        int size = elements.size();
        a(this.f4931b + this.f4932c, elements, size);
        return size > 0;
    }

    public final List<Object> build() {
        if (this.f4934e != null) {
            throw new IllegalStateException();
        }
        d();
        this.f4933d = true;
        return this.f4932c > 0 ? this : f4929h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        d();
        c();
        l(this.f4931b, this.f4932c);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        c();
        return obj == this || ((obj instanceof List) && e((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i8) {
        c();
        AbstractC0759c.Companion.checkElementIndex$kotlin_stdlib(i8, this.f4932c);
        return this.f4930a[this.f4931b + i8];
    }

    @Override // S6.AbstractC0761e
    public int getSize() {
        c();
        return this.f4932c;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        c();
        return c.b(this.f4930a, this.f4931b, this.f4932c);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        c();
        for (int i8 = 0; i8 < this.f4932c; i8++) {
            if (Intrinsics.areEqual(this.f4930a[this.f4931b + i8], obj)) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        c();
        return this.f4932c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<Object> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        c();
        for (int i8 = this.f4932c - 1; i8 >= 0; i8--) {
            if (Intrinsics.areEqual(this.f4930a[this.f4931b + i8], obj)) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<Object> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        d();
        c();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        d();
        c();
        return m(this.f4931b, this.f4932c, elements, false) > 0;
    }

    @Override // S6.AbstractC0761e
    public Object removeAt(int i8) {
        d();
        c();
        AbstractC0759c.Companion.checkElementIndex$kotlin_stdlib(i8, this.f4932c);
        return k(this.f4931b + i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        d();
        c();
        return m(this.f4931b, this.f4932c, elements, true) > 0;
    }

    @Override // S6.AbstractC0761e, java.util.AbstractList, java.util.List
    public Object set(int i8, Object obj) {
        d();
        c();
        AbstractC0759c.Companion.checkElementIndex$kotlin_stdlib(i8, this.f4932c);
        Object[] objArr = this.f4930a;
        int i9 = this.f4931b;
        Object obj2 = objArr[i9 + i8];
        objArr[i9 + i8] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<Object> subList(int i8, int i9) {
        AbstractC0759c.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, this.f4932c);
        Object[] objArr = this.f4930a;
        int i10 = this.f4931b + i8;
        int i11 = i9 - i8;
        boolean z8 = this.f4933d;
        b bVar = this.f4935f;
        return new b(objArr, i10, i11, z8, this, bVar == null ? this : bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        c();
        int length = destination.length;
        int i8 = this.f4932c;
        if (length >= i8) {
            Object[] objArr = this.f4930a;
            int i9 = this.f4931b;
            AbstractC0765i.copyInto(objArr, destination, 0, i9, i8 + i9);
            return (T[]) r.terminateCollectionToArray(this.f4932c, destination);
        }
        Object[] objArr2 = this.f4930a;
        int i10 = this.f4931b;
        T[] tArr = (T[]) Arrays.copyOfRange(objArr2, i10, i8 + i10, destination.getClass());
        Intrinsics.checkNotNullExpressionValue(tArr, "copyOfRange(...)");
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        c();
        return c.c(this.f4930a, this.f4931b, this.f4932c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<Object> listIterator(int i8) {
        c();
        AbstractC0759c.Companion.checkPositionIndex$kotlin_stdlib(i8, this.f4932c);
        return new C0076b(this, i8);
    }

    @Override // S6.AbstractC0761e, java.util.AbstractList, java.util.List
    public void add(int i8, Object obj) {
        d();
        c();
        AbstractC0759c.Companion.checkPositionIndex$kotlin_stdlib(i8, this.f4932c);
        b(this.f4931b + i8, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection<Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        d();
        c();
        AbstractC0759c.Companion.checkPositionIndex$kotlin_stdlib(i8, this.f4932c);
        int size = elements.size();
        a(this.f4931b + i8, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        c();
        Object[] objArr = this.f4930a;
        int i8 = this.f4931b;
        return AbstractC0765i.copyOfRange(objArr, i8, this.f4932c + i8);
    }

    public b() {
        this(10);
    }

    public b(int i8) {
        this(c.arrayOfUninitializedElements(i8), 0, 0, false, null, null);
    }
}
