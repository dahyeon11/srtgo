package e3;

import java.util.Collections;
import java.util.Set;

/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5356a extends s {

    /* renamed from: a, reason: collision with root package name */
    static final C5356a f30333a = new C5356a();

    private C5356a() {
    }

    static s a() {
        return f30333a;
    }

    @Override // e3.s
    public Set<Object> asSet() {
        return Collections.emptySet();
    }

    @Override // e3.s
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // e3.s
    public Object get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // e3.s
    public int hashCode() {
        return 2040732332;
    }

    @Override // e3.s
    public boolean isPresent() {
        return false;
    }

    @Override // e3.s
    public Object or(Object obj) {
        return w.checkNotNull(obj, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // e3.s
    public Object orNull() {
        return null;
    }

    @Override // e3.s
    public String toString() {
        return "Optional.absent()";
    }

    @Override // e3.s
    public <V> s transform(l lVar) {
        w.checkNotNull(lVar);
        return s.absent();
    }

    @Override // e3.s
    public s or(s sVar) {
        return (s) w.checkNotNull(sVar);
    }

    @Override // e3.s
    public Object or(InterfaceC5355E interfaceC5355E) {
        return w.checkNotNull(interfaceC5355E.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }
}
