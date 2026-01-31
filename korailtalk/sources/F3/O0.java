package f3;

import java.io.Serializable;

/* loaded from: classes2.dex */
final class O0 extends T0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final T0 f30821a;

    O0(T0 t02) {
        this.f30821a = t02;
    }

    @Override // f3.T0, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return this.f30821a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof O0) {
            return this.f30821a.equals(((O0) obj).f30821a);
        }
        return false;
    }

    public int hashCode() {
        return this.f30821a.hashCode() ^ 957692532;
    }

    @Override // f3.T0
    public <S> T0 nullsLast() {
        return this.f30821a.nullsLast();
    }

    @Override // f3.T0
    public <S> T0 reverse() {
        return this.f30821a.reverse().nullsLast();
    }

    public String toString() {
        return this.f30821a + ".nullsFirst()";
    }

    @Override // f3.T0
    public <S> T0 nullsFirst() {
        return this;
    }
}
