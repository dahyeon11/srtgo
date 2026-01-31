package f3;

import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class f1 extends T0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final T0 f30931a;

    f1(T0 t02) {
        this.f30931a = (T0) e3.w.checkNotNull(t02);
    }

    @Override // f3.T0, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f30931a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            return this.f30931a.equals(((f1) obj).f30931a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f30931a.hashCode();
    }

    @Override // f3.T0
    public <E> E max(E e8, E e9) {
        return (E) this.f30931a.min(e8, e9);
    }

    @Override // f3.T0
    public <E> E min(E e8, E e9) {
        return (E) this.f30931a.max(e8, e9);
    }

    @Override // f3.T0
    public <S> T0 reverse() {
        return this.f30931a;
    }

    public String toString() {
        return this.f30931a + ".reverse()";
    }

    @Override // f3.T0
    public <E> E max(E e8, E e9, E e10, E... eArr) {
        return (E) this.f30931a.min(e8, e9, e10, eArr);
    }

    @Override // f3.T0
    public <E> E min(E e8, E e9, E e10, E... eArr) {
        return (E) this.f30931a.max(e8, e9, e10, eArr);
    }

    @Override // f3.T0
    public <E> E max(Iterator<E> it) {
        return (E) this.f30931a.min(it);
    }

    @Override // f3.T0
    public <E> E min(Iterator<E> it) {
        return (E) this.f30931a.max(it);
    }

    @Override // f3.T0
    public <E> E max(Iterable<E> iterable) {
        return (E) this.f30931a.min(iterable);
    }

    @Override // f3.T0
    public <E> E min(Iterable<E> iterable) {
        return (E) this.f30931a.max(iterable);
    }
}
