package f3;

import java.io.Serializable;

/* renamed from: f3.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5480p extends T0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final e3.l f31043a;

    /* renamed from: b, reason: collision with root package name */
    final T0 f31044b;

    C5480p(e3.l lVar, T0 t02) {
        this.f31043a = (e3.l) e3.w.checkNotNull(lVar);
        this.f31044b = (T0) e3.w.checkNotNull(t02);
    }

    @Override // f3.T0, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f31044b.compare(this.f31043a.apply(obj), this.f31043a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5480p)) {
            return false;
        }
        C5480p c5480p = (C5480p) obj;
        return this.f31043a.equals(c5480p.f31043a) && this.f31044b.equals(c5480p.f31044b);
    }

    public int hashCode() {
        return e3.r.hashCode(this.f31043a, this.f31044b);
    }

    public String toString() {
        return this.f31044b + ".onResultOf(" + this.f31043a + ")";
    }
}
