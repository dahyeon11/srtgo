package f3;

import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class e1 extends T0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final e1 f30929a = new e1();

    private e1() {
    }

    @Override // f3.T0
    public <S extends Comparable<?>> T0 reverse() {
        return T0.natural();
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // f3.T0, java.util.Comparator
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        e3.w.checkNotNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // f3.T0
    public <E extends Comparable<?>> E max(E e8, E e9) {
        return (E) M0.f30813c.min(e8, e9);
    }

    @Override // f3.T0
    public <E extends Comparable<?>> E min(E e8, E e9) {
        return (E) M0.f30813c.max(e8, e9);
    }

    @Override // f3.T0
    public <E extends Comparable<?>> E max(E e8, E e9, E e10, E... eArr) {
        return (E) M0.f30813c.min(e8, e9, e10, eArr);
    }

    @Override // f3.T0
    public <E extends Comparable<?>> E min(E e8, E e9, E e10, E... eArr) {
        return (E) M0.f30813c.max(e8, e9, e10, eArr);
    }

    @Override // f3.T0
    public <E extends Comparable<?>> E max(Iterator<E> it) {
        return (E) M0.f30813c.min(it);
    }

    @Override // f3.T0
    public <E extends Comparable<?>> E min(Iterator<E> it) {
        return (E) M0.f30813c.max(it);
    }

    @Override // f3.T0
    public <E extends Comparable<?>> E max(Iterable<E> iterable) {
        return (E) M0.f30813c.min(iterable);
    }

    @Override // f3.T0
    public <E extends Comparable<?>> E min(Iterable<E> iterable) {
        return (E) M0.f30813c.max(iterable);
    }
}
