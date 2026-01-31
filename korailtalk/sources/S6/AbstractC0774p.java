package S6;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: S6.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0774p implements Iterator, KMappedMarker {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Byte.valueOf(nextByte());
    }

    public abstract byte nextByte();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final Byte next() {
        return Byte.valueOf(nextByte());
    }
}
