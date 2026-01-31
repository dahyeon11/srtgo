package S6;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: S6.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0773o implements Iterator, KMappedMarker {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Boolean.valueOf(nextBoolean());
    }

    public abstract boolean nextBoolean();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final Boolean next() {
        return Boolean.valueOf(nextBoolean());
    }
}
