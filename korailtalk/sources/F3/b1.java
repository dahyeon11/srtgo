package f3;

import f3.K0;
import j3.AbstractC5820b;

/* loaded from: classes2.dex */
class b1 extends AbstractC5479o0 {

    /* renamed from: g */
    static final b1 f30874g = new b1(R0.a());

    /* renamed from: d */
    final transient R0 f30875d;

    /* renamed from: e */
    private final transient int f30876e;

    /* renamed from: f */
    private transient AbstractC5483q0 f30877f;

    private final class b extends AbstractC5491u0 {
        private b() {
        }

        @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return b1.this.contains(obj);
        }

        @Override // f3.AbstractC5491u0
        Object get(int i8) {
            return b1.this.f30875d.g(i8);
        }

        @Override // f3.AbstractC5457d0
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b1.this.f30875d.v();
        }

        /* synthetic */ b(b1 b1Var, a aVar) {
            this();
        }
    }

    b1(R0 r02) {
        this.f30875d = r02;
        long jI = 0;
        for (int i8 = 0; i8 < r02.v(); i8++) {
            jI += r02.i(i8);
        }
        this.f30876e = AbstractC5820b.saturatedCast(jI);
    }

    @Override // f3.AbstractC5479o0, f3.K0
    public int count(Object obj) {
        return this.f30875d.get(obj);
    }

    @Override // f3.AbstractC5479o0
    K0.a h(int i8) {
        return this.f30875d.e(i8);
    }

    @Override // f3.AbstractC5457d0
    boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, f3.K0
    public int size() {
        return this.f30876e;
    }

    @Override // f3.AbstractC5479o0, f3.K0
    public AbstractC5483q0 elementSet() {
        AbstractC5483q0 abstractC5483q0 = this.f30877f;
        if (abstractC5483q0 != null) {
            return abstractC5483q0;
        }
        b bVar = new b();
        this.f30877f = bVar;
        return bVar;
    }
}
