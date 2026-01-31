package f3;

import f3.C5437I;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: f3.J, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5438J extends C5437I implements InterfaceC5441M {

    /* renamed from: f3.J$a */
    class a extends C5437I.c implements Set {
        a(C5438J c5438j) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return h1.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return h1.b(this);
        }
    }

    C5438J(g1 g1Var, e3.x xVar) {
        super(g1Var, xVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f3.C5437I, f3.AbstractC5462g
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set b() {
        return new a(this);
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    public Set<Map.Entry<Object, Object>> entries() {
        return (Set) super.entries();
    }

    @Override // f3.C5437I, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public Set<Object> get(Object obj) {
        return (Set) super.get(obj);
    }

    @Override // f3.C5437I, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public Set<Object> removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    public Set<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        return (Set) super.replaceValues(obj, iterable);
    }

    @Override // f3.C5437I, f3.InterfaceC5439K
    public g1 unfiltered() {
        return (g1) this.f30771f;
    }
}
