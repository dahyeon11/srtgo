package S6;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
public final class L implements Iterator, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    private final Iterator f4674a;

    /* renamed from: b, reason: collision with root package name */
    private int f4675b;

    public L(Iterator<Object> iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f4674a = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4674a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final J next() {
        int i8 = this.f4675b;
        this.f4675b = i8 + 1;
        if (i8 < 0) {
            r.throwIndexOverflow();
        }
        return new J(i8, this.f4674a.next());
    }
}
