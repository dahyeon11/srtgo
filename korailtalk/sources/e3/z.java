package e3;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
final class z extends s {

    /* renamed from: a, reason: collision with root package name */
    private final Object f30433a;

    z(Object obj) {
        this.f30433a = obj;
    }

    @Override // e3.s
    public Set<Object> asSet() {
        return Collections.singleton(this.f30433a);
    }

    @Override // e3.s
    public boolean equals(Object obj) {
        if (obj instanceof z) {
            return this.f30433a.equals(((z) obj).f30433a);
        }
        return false;
    }

    @Override // e3.s
    public Object get() {
        return this.f30433a;
    }

    @Override // e3.s
    public int hashCode() {
        return this.f30433a.hashCode() + 1502476572;
    }

    @Override // e3.s
    public boolean isPresent() {
        return true;
    }

    @Override // e3.s
    public Object or(Object obj) {
        w.checkNotNull(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.f30433a;
    }

    @Override // e3.s
    public Object orNull() {
        return this.f30433a;
    }

    @Override // e3.s
    public String toString() {
        return "Optional.of(" + this.f30433a + ")";
    }

    @Override // e3.s
    public <V> s transform(l lVar) {
        return new z(w.checkNotNull(lVar.apply(this.f30433a), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // e3.s
    public s or(s sVar) {
        w.checkNotNull(sVar);
        return this;
    }

    @Override // e3.s
    public Object or(InterfaceC5355E interfaceC5355E) {
        w.checkNotNull(interfaceC5355E);
        return this.f30433a;
    }
}
