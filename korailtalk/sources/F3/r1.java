package f3;

import java.util.Iterator;

/* loaded from: classes2.dex */
abstract class r1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f31086a;

    r1(Iterator it) {
        this.f31086a = (Iterator) e3.w.checkNotNull(it);
    }

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31086a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f31086a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f31086a.remove();
    }
}
