package k7;

import S6.J;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    private final m f33694a;

    public static final class a implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f33695a;

        /* renamed from: b, reason: collision with root package name */
        private int f33696b;

        a(k kVar) {
            this.f33695a = kVar.f33694a.iterator();
        }

        public final int getIndex() {
            return this.f33696b;
        }

        public final Iterator<Object> getIterator() {
            return this.f33695a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33695a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i8) {
            this.f33696b = i8;
        }

        @Override // java.util.Iterator
        public J next() {
            int i8 = this.f33696b;
            this.f33696b = i8 + 1;
            if (i8 < 0) {
                S6.r.throwIndexOverflow();
            }
            return new J(i8, this.f33695a.next());
        }
    }

    public k(m sequence) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f33694a = sequence;
    }

    @Override // k7.m
    public Iterator<J> iterator() {
        return new a(this);
    }
}
