package f3;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: f3.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5494w extends T0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Comparator f31157a;

    C5494w(Comparator comparator) {
        this.f31157a = (Comparator) e3.w.checkNotNull(comparator);
    }

    @Override // f3.T0, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f31157a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5494w) {
            return this.f31157a.equals(((C5494w) obj).f31157a);
        }
        return false;
    }

    public int hashCode() {
        return this.f31157a.hashCode();
    }

    public String toString() {
        return this.f31157a.toString();
    }
}
