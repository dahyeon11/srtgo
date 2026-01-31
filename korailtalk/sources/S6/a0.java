package S6;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* loaded from: classes3.dex */
final class a0 extends AbstractC0761e {

    /* renamed from: a, reason: collision with root package name */
    private final List f4684a;

    public static final class a implements ListIterator, KMutableListIterator {

        /* renamed from: a, reason: collision with root package name */
        private final ListIterator f4685a;

        a(int i8) {
            this.f4685a = a0.this.f4684a.listIterator(C0783z.g(a0.this, i8));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f4685a.add(obj);
            this.f4685a.previous();
        }

        public final ListIterator<Object> getDelegateIterator() {
            return this.f4685a;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f4685a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f4685a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f4685a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return C0783z.f(a0.this, this.f4685a.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f4685a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return C0783z.f(a0.this, this.f4685a.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f4685a.remove();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f4685a.set(obj);
        }
    }

    public a0(List<Object> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f4684a = delegate;
    }

    @Override // S6.AbstractC0761e, java.util.AbstractList, java.util.List
    public void add(int i8, Object obj) {
        this.f4684a.add(C0783z.g(this, i8), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f4684a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i8) {
        return this.f4684a.get(C0783z.e(this, i8));
    }

    @Override // S6.AbstractC0761e
    public int getSize() {
        return this.f4684a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<Object> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<Object> listIterator() {
        return listIterator(0);
    }

    @Override // S6.AbstractC0761e
    public Object removeAt(int i8) {
        return this.f4684a.remove(C0783z.e(this, i8));
    }

    @Override // S6.AbstractC0761e, java.util.AbstractList, java.util.List
    public Object set(int i8, Object obj) {
        return this.f4684a.set(C0783z.e(this, i8), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<Object> listIterator(int i8) {
        return new a(i8);
    }
}
