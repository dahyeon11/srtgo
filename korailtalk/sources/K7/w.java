package k7;

import Q7.C;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
public final class w implements m, InterfaceC5867e {

    /* renamed from: a, reason: collision with root package name */
    private final m f33792a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33793b;

    public static final class a implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private int f33794a;

        /* renamed from: b, reason: collision with root package name */
        private final Iterator f33795b;

        a(w wVar) {
            this.f33794a = wVar.f33793b;
            this.f33795b = wVar.f33792a.iterator();
        }

        public final Iterator<Object> getIterator() {
            return this.f33795b;
        }

        public final int getLeft() {
            return this.f33794a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33794a > 0 && this.f33795b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i8 = this.f33794a;
            if (i8 == 0) {
                throw new NoSuchElementException();
            }
            this.f33794a = i8 - 1;
            return this.f33795b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setLeft(int i8) {
            this.f33794a = i8;
        }
    }

    public w(m sequence, int i8) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f33792a = sequence;
        this.f33793b = i8;
        if (i8 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i8 + C.PACKAGE_SEPARATOR_CHAR).toString());
    }

    @Override // k7.InterfaceC5867e
    public m drop(int i8) {
        int i9 = this.f33793b;
        return i8 >= i9 ? p.emptySequence() : new v(this.f33792a, i8, i9);
    }

    @Override // k7.m
    public Iterator<Object> iterator() {
        return new a(this);
    }

    @Override // k7.InterfaceC5867e
    public m take(int i8) {
        return i8 >= this.f33793b ? this : new w(this.f33792a, i8);
    }
}
