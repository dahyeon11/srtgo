package f3;

/* loaded from: classes2.dex */
final class i1 extends AbstractC5483q0 {

    /* renamed from: c */
    final transient Object f30992c;

    i1(Object obj) {
        this.f30992c = e3.w.checkNotNull(obj);
    }

    @Override // f3.AbstractC5457d0
    int a(Object[] objArr, int i8) {
        objArr[i8] = this.f30992c;
        return i8 + 1;
    }

    @Override // f3.AbstractC5483q0, f3.AbstractC5457d0
    public AbstractC5465h0 asList() {
        return AbstractC5465h0.of(this.f30992c);
    }

    @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f30992c.equals(obj);
    }

    @Override // f3.AbstractC5483q0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f30992c.hashCode();
    }

    @Override // f3.AbstractC5457d0
    boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f30992c.toString() + ']';
    }

    @Override // f3.AbstractC5483q0, f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public t1 iterator() {
        return AbstractC5495w0.singletonIterator(this.f30992c);
    }
}
