package f3;

import java.io.Serializable;
import java.util.List;

/* renamed from: f3.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5472l extends T0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final C5472l f31011a = new C5472l();

    C5472l() {
    }

    @Override // f3.T0, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return 0;
    }

    @Override // f3.T0
    public <E> AbstractC5465h0 immutableSortedCopy(Iterable<E> iterable) {
        return AbstractC5465h0.copyOf(iterable);
    }

    @Override // f3.T0
    public <E> List<E> sortedCopy(Iterable<E> iterable) {
        return A0.newArrayList(iterable);
    }

    public String toString() {
        return "Ordering.allEqual()";
    }

    @Override // f3.T0
    public <S> T0 reverse() {
        return this;
    }
}
