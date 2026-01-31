package V6;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class n implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    private final Comparator f5236a;

    public n(Comparator<Object> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        this.f5236a = comparator;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f5236a.compare(obj2, obj);
    }

    public final Comparator<Object> getComparator() {
        return this.f5236a;
    }

    @Override // java.util.Comparator
    public final Comparator<Object> reversed() {
        return this.f5236a;
    }
}
