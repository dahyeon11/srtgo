package f3;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: f3.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5499y0 extends T0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Comparator f31193a;

    C5499y0(Comparator comparator) {
        this.f31193a = comparator;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5499y0) {
            return this.f31193a.equals(((C5499y0) obj).f31193a);
        }
        return false;
    }

    public int hashCode() {
        return this.f31193a.hashCode() ^ 2075626741;
    }

    public String toString() {
        return this.f31193a + ".lexicographical()";
    }

    @Override // f3.T0, java.util.Comparator
    public int compare(Iterable<Object> iterable, Iterable<Object> iterable2) {
        Iterator<Object> it = iterable.iterator();
        Iterator<Object> it2 = iterable2.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int iCompare = this.f31193a.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }
}
