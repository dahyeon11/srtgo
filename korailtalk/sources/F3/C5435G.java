package f3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: f3.G, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5435G extends C5415E implements InterfaceC5441M {
    C5435G(g1 g1Var, e3.x xVar) {
        super(g1Var, xVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f3.C5415E, f3.AbstractC5462g
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Set b() {
        return h1.filter(unfiltered().entries(), entryPredicate());
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    public Set<Map.Entry<Object, Object>> entries() {
        return (Set) super.entries();
    }

    @Override // f3.C5415E, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public Set<Object> get(Object obj) {
        return (Set) super.get(obj);
    }

    @Override // f3.C5415E, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public Set<Object> removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    public Set<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        return (Set) super.replaceValues(obj, iterable);
    }

    @Override // f3.C5415E, f3.InterfaceC5439K
    public g1 unfiltered() {
        return (g1) this.f30672f;
    }
}
