package f3;

import f3.K0;
import f3.L0;
import java.util.Comparator;
import java.util.NavigableSet;

/* loaded from: classes2.dex */
final class v1 extends L0.l implements m1 {

    /* renamed from: d, reason: collision with root package name */
    private transient v1 f31156d;

    v1(m1 m1Var) {
        super(m1Var);
    }

    @Override // f3.m1, f3.j1
    public Comparator<Object> comparator() {
        return delegate().comparator();
    }

    @Override // f3.m1
    public m1 descendingMultiset() {
        v1 v1Var = this.f31156d;
        if (v1Var != null) {
            return v1Var;
        }
        v1 v1Var2 = new v1(delegate().descendingMultiset());
        v1Var2.f31156d = this;
        this.f31156d = v1Var2;
        return v1Var2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f3.L0.l
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public NavigableSet e() {
        return h1.unmodifiableNavigableSet(delegate().elementSet());
    }

    @Override // f3.m1
    public K0.a firstEntry() {
        return delegate().firstEntry();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f3.L0.l, f3.X
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public m1 delegate() {
        return (m1) super.delegate();
    }

    @Override // f3.m1
    public m1 headMultiset(Object obj, EnumC5478o enumC5478o) {
        return L0.unmodifiableSortedMultiset(delegate().headMultiset(obj, enumC5478o));
    }

    @Override // f3.m1
    public K0.a lastEntry() {
        return delegate().lastEntry();
    }

    @Override // f3.m1
    public K0.a pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // f3.m1
    public K0.a pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // f3.m1
    public m1 subMultiset(Object obj, EnumC5478o enumC5478o, Object obj2, EnumC5478o enumC5478o2) {
        return L0.unmodifiableSortedMultiset(delegate().subMultiset(obj, enumC5478o, obj2, enumC5478o2));
    }

    @Override // f3.m1
    public m1 tailMultiset(Object obj, EnumC5478o enumC5478o) {
        return L0.unmodifiableSortedMultiset(delegate().tailMultiset(obj, enumC5478o));
    }

    @Override // f3.L0.l, f3.AbstractC5449V, f3.K0
    public NavigableSet<Object> elementSet() {
        return (NavigableSet) super.elementSet();
    }
}
