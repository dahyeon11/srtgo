package e3;

import java.io.Serializable;

/* loaded from: classes2.dex */
final class m extends j implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final l f30395a;

    /* renamed from: b, reason: collision with root package name */
    private final j f30396b;

    m(l lVar, j jVar) {
        this.f30395a = (l) w.checkNotNull(lVar);
        this.f30396b = (j) w.checkNotNull(jVar);
    }

    @Override // e3.j
    protected boolean a(Object obj, Object obj2) {
        return this.f30396b.equivalent(this.f30395a.apply(obj), this.f30395a.apply(obj2));
    }

    @Override // e3.j
    protected int b(Object obj) {
        return this.f30396b.hash(this.f30395a.apply(obj));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f30395a.equals(mVar.f30395a) && this.f30396b.equals(mVar.f30396b);
    }

    public int hashCode() {
        return r.hashCode(this.f30395a, this.f30396b);
    }

    public String toString() {
        return this.f30396b + ".onResultOf(" + this.f30395a + ")";
    }
}
