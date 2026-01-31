package k7;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
public final class z implements m {

    /* renamed from: a, reason: collision with root package name */
    private final m f33807a;

    /* renamed from: b, reason: collision with root package name */
    private final f7.l f33808b;

    public static final class a implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f33809a;

        a() {
            this.f33809a = z.this.f33807a.iterator();
        }

        public final Iterator<Object> getIterator() {
            return this.f33809a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33809a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return z.this.f33808b.invoke(this.f33809a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public z(m sequence, f7.l transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f33807a = sequence;
        this.f33808b = transformer;
    }

    public final <E> m flatten$kotlin_stdlib(f7.l iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return new C5871i(this.f33807a, this.f33808b, iterator);
    }

    @Override // k7.m
    public Iterator<Object> iterator() {
        return new a();
    }
}
