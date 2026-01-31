package f3;

import java.util.Map;

/* renamed from: f3.m0 */
/* loaded from: classes2.dex */
final class C5475m0 extends AbstractC5457d0 {

    /* renamed from: b */
    private final AbstractC5469j0 f31013b;

    /* renamed from: f3.m0$a */
    class a extends t1 {

        /* renamed from: a */
        final t1 f31014a;

        a() {
            this.f31014a = C5475m0.this.f31013b.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31014a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return ((Map.Entry) this.f31014a.next()).getValue();
        }
    }

    /* renamed from: f3.m0$b */
    class b extends AbstractC5465h0 {

        /* renamed from: c */
        final /* synthetic */ AbstractC5465h0 f31016c;

        b(C5475m0 c5475m0, AbstractC5465h0 abstractC5465h0) {
            this.f31016c = abstractC5465h0;
        }

        @Override // java.util.List
        public Object get(int i8) {
            return ((Map.Entry) this.f31016c.get(i8)).getValue();
        }

        @Override // f3.AbstractC5457d0
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f31016c.size();
        }
    }

    C5475m0(AbstractC5469j0 abstractC5469j0) {
        this.f31013b = abstractC5469j0;
    }

    @Override // f3.AbstractC5457d0
    public AbstractC5465h0 asList() {
        return new b(this, this.f31013b.entrySet().asList());
    }

    @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return obj != null && AbstractC5495w0.contains(iterator(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f31013b.size();
    }

    @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public t1 iterator() {
        return new a();
    }
}
