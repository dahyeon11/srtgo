package S6;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
class b0 extends AbstractC0759c {

    /* renamed from: a, reason: collision with root package name */
    private final List f4689a;

    public static final class a implements ListIterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private final ListIterator f4690a;

        a(int i8) {
            this.f4690a = b0.this.f4689a.listIterator(C0783z.g(b0.this, i8));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final ListIterator<Object> getDelegateIterator() {
            return this.f4690a;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f4690a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f4690a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f4690a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return C0783z.f(b0.this, this.f4690a.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f4690a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return C0783z.f(b0.this, this.f4690a.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b0(List<Object> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f4689a = delegate;
    }

    @Override // S6.AbstractC0759c, java.util.List
    public Object get(int i8) {
        return this.f4689a.get(C0783z.e(this, i8));
    }

    @Override // S6.AbstractC0759c, S6.AbstractC0757a
    public int getSize() {
        return this.f4689a.size();
    }

    @Override // S6.AbstractC0759c, S6.AbstractC0757a, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return listIterator(0);
    }

    @Override // S6.AbstractC0759c, java.util.List
    public ListIterator<Object> listIterator() {
        return listIterator(0);
    }

    @Override // S6.AbstractC0759c, java.util.List
    public ListIterator<Object> listIterator(int i8) {
        return new a(i8);
    }
}
