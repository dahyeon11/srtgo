package S6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: S6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0759c extends AbstractC0757a implements List, KMappedMarker {
    public static final a Companion = new a(null);

    /* renamed from: S6.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void checkBoundsIndexes$kotlin_stdlib(int i8, int i9, int i10) {
            if (i8 < 0 || i9 > i10) {
                throw new IndexOutOfBoundsException("startIndex: " + i8 + ", endIndex: " + i9 + ", size: " + i10);
            }
            if (i8 <= i9) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i8 + " > endIndex: " + i9);
        }

        public final void checkElementIndex$kotlin_stdlib(int i8, int i9) {
            if (i8 < 0 || i8 >= i9) {
                throw new IndexOutOfBoundsException("index: " + i8 + ", size: " + i9);
            }
        }

        public final void checkPositionIndex$kotlin_stdlib(int i8, int i9) {
            if (i8 < 0 || i8 > i9) {
                throw new IndexOutOfBoundsException("index: " + i8 + ", size: " + i9);
            }
        }

        public final void checkRangeIndexes$kotlin_stdlib(int i8, int i9, int i10) {
            if (i8 < 0 || i9 > i10) {
                throw new IndexOutOfBoundsException("fromIndex: " + i8 + ", toIndex: " + i9 + ", size: " + i10);
            }
            if (i8 <= i9) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i8 + " > toIndex: " + i9);
        }

        public final int newCapacity$kotlin_stdlib(int i8, int i9) {
            int i10 = i8 + (i8 >> 1);
            if (i10 - i9 < 0) {
                i10 = i9;
            }
            return i10 - 2147483639 > 0 ? i9 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i10;
        }

        public final boolean orderedEquals$kotlin_stdlib(Collection<?> c9, Collection<?> other) {
            Intrinsics.checkNotNullParameter(c9, "c");
            Intrinsics.checkNotNullParameter(other, "other");
            if (c9.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c9.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.areEqual(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int orderedHashCode$kotlin_stdlib(Collection<?> c9) {
            Intrinsics.checkNotNullParameter(c9, "c");
            Iterator<?> it = c9.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        private a() {
        }
    }

    /* renamed from: S6.c$b */
    private class b implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private int f4692a;

        public b() {
        }

        protected final int a() {
            return this.f4692a;
        }

        protected final void b(int i8) {
            this.f4692a = i8;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4692a < AbstractC0759c.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC0759c abstractC0759c = AbstractC0759c.this;
            int i8 = this.f4692a;
            this.f4692a = i8 + 1;
            return abstractC0759c.get(i8);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: S6.c$c, reason: collision with other inner class name */
    private class C0074c extends b implements ListIterator, KMappedMarker {
        public C0074c(int i8) {
            super();
            AbstractC0759c.Companion.checkPositionIndex$kotlin_stdlib(i8, AbstractC0759c.this.size());
            b(i8);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC0759c abstractC0759c = AbstractC0759c.this;
            b(a() - 1);
            return abstractC0759c.get(a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: S6.c$d */
    private static final class d extends AbstractC0759c implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC0759c f4695a;

        /* renamed from: b, reason: collision with root package name */
        private final int f4696b;

        /* renamed from: c, reason: collision with root package name */
        private int f4697c;

        public d(AbstractC0759c list, int i8, int i9) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f4695a = list;
            this.f4696b = i8;
            AbstractC0759c.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, list.size());
            this.f4697c = i9 - i8;
        }

        @Override // S6.AbstractC0759c, java.util.List
        public Object get(int i8) {
            AbstractC0759c.Companion.checkElementIndex$kotlin_stdlib(i8, this.f4697c);
            return this.f4695a.get(this.f4696b + i8);
        }

        @Override // S6.AbstractC0759c, S6.AbstractC0757a
        public int getSize() {
            return this.f4697c;
        }
    }

    protected AbstractC0759c() {
    }

    @Override // java.util.List
    public void add(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i8, Collection<Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.orderedEquals$kotlin_stdlib(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i8);

    @Override // S6.AbstractC0757a
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.orderedHashCode$kotlin_stdlib(this);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next(), obj)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    @Override // S6.AbstractC0757a, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.areEqual(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<Object> listIterator() {
        return new C0074c(0);
    }

    @Override // java.util.List
    public Object remove(int i8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<Object> subList(int i8, int i9) {
        return new d(this, i8, i9);
    }

    public ListIterator<Object> listIterator(int i8) {
        return new C0074c(i8);
    }
}
