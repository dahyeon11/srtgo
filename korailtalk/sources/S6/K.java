package S6;

import f7.InterfaceC5519a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
public final class K implements Iterable, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5519a f4673a;

    public K(InterfaceC5519a iteratorFactory) {
        Intrinsics.checkNotNullParameter(iteratorFactory, "iteratorFactory");
        this.f4673a = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator<J> iterator() {
        return new L((Iterator) this.f4673a.invoke());
    }
}
