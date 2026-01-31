package f3;

import java.util.Collection;
import java.util.List;

/* renamed from: f3.H, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5436H extends C5437I implements InterfaceC5501z0 {
    C5436H(InterfaceC5501z0 interfaceC5501z0, e3.x xVar) {
        super(interfaceC5501z0, xVar);
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // f3.C5437I, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public List<Object> get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // f3.C5437I, f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K
    public List<Object> removeAll(Object obj) {
        return (List) super.removeAll(obj);
    }

    @Override // f3.AbstractC5462g, f3.F0, f3.InterfaceC5439K, f3.InterfaceC5441M, f3.g1
    public List<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        return (List) super.replaceValues(obj, iterable);
    }

    @Override // f3.C5437I, f3.InterfaceC5439K
    public InterfaceC5501z0 unfiltered() {
        return (InterfaceC5501z0) super.unfiltered();
    }
}
