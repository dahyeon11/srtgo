package k7;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
public final class y implements m {

    /* renamed from: a, reason: collision with root package name */
    private final m f33802a;

    /* renamed from: b, reason: collision with root package name */
    private final f7.p f33803b;

    public static final class a implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f33804a;

        /* renamed from: b, reason: collision with root package name */
        private int f33805b;

        a() {
            this.f33804a = y.this.f33802a.iterator();
        }

        public final int getIndex() {
            return this.f33805b;
        }

        public final Iterator<Object> getIterator() {
            return this.f33804a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33804a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            f7.p pVar = y.this.f33803b;
            int i8 = this.f33805b;
            this.f33805b = i8 + 1;
            if (i8 < 0) {
                S6.r.throwIndexOverflow();
            }
            return pVar.invoke(Integer.valueOf(i8), this.f33804a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i8) {
            this.f33805b = i8;
        }
    }

    public y(m sequence, f7.p transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f33802a = sequence;
        this.f33803b = transformer;
    }

    @Override // k7.m
    public Iterator<Object> iterator() {
        return new a();
    }
}
