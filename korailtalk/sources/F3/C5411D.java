package f3;

import f3.T0;
import java.io.Serializable;
import java.util.List;

/* renamed from: f3.D, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5411D extends T0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC5469j0 f30620a;

    C5411D(List list) {
        this(E0.s(list));
    }

    private int b(Object obj) {
        Integer num = (Integer) this.f30620a.get(obj);
        if (num != null) {
            return num.intValue();
        }
        throw new T0.c(obj);
    }

    @Override // f3.T0, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return b(obj) - b(obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj instanceof C5411D) {
            return this.f30620a.equals(((C5411D) obj).f30620a);
        }
        return false;
    }

    public int hashCode() {
        return this.f30620a.hashCode();
    }

    public String toString() {
        return "Ordering.explicit(" + this.f30620a.keySet() + ")";
    }

    C5411D(AbstractC5469j0 abstractC5469j0) {
        this.f30620a = abstractC5469j0;
    }
}
