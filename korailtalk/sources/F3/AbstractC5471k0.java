package f3;

import java.util.Map;

/* renamed from: f3.k0 */
/* loaded from: classes2.dex */
abstract class AbstractC5471k0 extends AbstractC5483q0 {
    AbstractC5471k0() {
    }

    @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = l().get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // f3.AbstractC5483q0, java.util.Collection, java.util.Set
    public int hashCode() {
        return l().hashCode();
    }

    @Override // f3.AbstractC5457d0
    boolean isPartialView() {
        return l().e();
    }

    @Override // f3.AbstractC5483q0
    boolean j() {
        return l().d();
    }

    abstract AbstractC5469j0 l();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return l().size();
    }
}
