package f3;

import java.util.Map;

/* renamed from: f3.l0 */
/* loaded from: classes2.dex */
final class C5473l0 extends AbstractC5491u0 {

    /* renamed from: c */
    private final AbstractC5469j0 f31012c;

    C5473l0(AbstractC5469j0 abstractC5469j0) {
        this.f31012c = abstractC5469j0;
    }

    @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f31012c.containsKey(obj);
    }

    @Override // f3.AbstractC5491u0
    Object get(int i8) {
        return ((Map.Entry) this.f31012c.entrySet().asList().get(i8)).getKey();
    }

    @Override // f3.AbstractC5457d0
    boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f31012c.size();
    }

    @Override // f3.AbstractC5491u0, f3.AbstractC5483q0, f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public t1 iterator() {
        return this.f31012c.f();
    }
}
