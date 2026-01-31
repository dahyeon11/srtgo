package k7;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    private final m f33697a;

    /* renamed from: b, reason: collision with root package name */
    private final m f33698b;

    /* renamed from: c, reason: collision with root package name */
    private final f7.p f33699c;

    public static final class a implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f33700a;

        /* renamed from: b, reason: collision with root package name */
        private final Iterator f33701b;

        a() {
            this.f33700a = l.this.f33697a.iterator();
            this.f33701b = l.this.f33698b.iterator();
        }

        public final Iterator<Object> getIterator1() {
            return this.f33700a;
        }

        public final Iterator<Object> getIterator2() {
            return this.f33701b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33700a.hasNext() && this.f33701b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return l.this.f33699c.invoke(this.f33700a.next(), this.f33701b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public l(m sequence1, m sequence2, f7.p transform) {
        Intrinsics.checkNotNullParameter(sequence1, "sequence1");
        Intrinsics.checkNotNullParameter(sequence2, "sequence2");
        Intrinsics.checkNotNullParameter(transform, "transform");
        this.f33697a = sequence1;
        this.f33698b = sequence2;
        this.f33699c = transform;
    }

    @Override // k7.m
    public Iterator<Object> iterator() {
        return new a();
    }
}
