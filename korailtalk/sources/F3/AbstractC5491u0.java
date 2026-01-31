package f3;

/* renamed from: f3.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5491u0 extends AbstractC5483q0 {

    /* renamed from: f3.u0$a */
    class a extends AbstractC5465h0 {
        a() {
        }

        @Override // java.util.List
        public Object get(int i8) {
            return AbstractC5491u0.this.get(i8);
        }

        @Override // f3.AbstractC5457d0
        boolean isPartialView() {
            return AbstractC5491u0.this.isPartialView();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return AbstractC5491u0.this.size();
        }
    }

    AbstractC5491u0() {
    }

    @Override // f3.AbstractC5457d0
    int a(Object[] objArr, int i8) {
        return asList().a(objArr, i8);
    }

    abstract Object get(int i8);

    @Override // f3.AbstractC5483q0
    AbstractC5465h0 i() {
        return new a();
    }

    @Override // f3.AbstractC5483q0, f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public t1 iterator() {
        return asList().iterator();
    }
}
