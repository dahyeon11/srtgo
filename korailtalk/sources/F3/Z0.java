package f3;

import java.util.Objects;

/* loaded from: classes2.dex */
class Z0 extends AbstractC5465h0 {

    /* renamed from: e, reason: collision with root package name */
    static final AbstractC5465h0 f30851e = new Z0(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f30852c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f30853d;

    Z0(Object[] objArr, int i8) {
        this.f30852c = objArr;
        this.f30853d = i8;
    }

    @Override // f3.AbstractC5465h0, f3.AbstractC5457d0
    int a(Object[] objArr, int i8) {
        System.arraycopy(this.f30852c, 0, objArr, i8, this.f30853d);
        return i8 + this.f30853d;
    }

    @Override // f3.AbstractC5457d0
    Object[] b() {
        return this.f30852c;
    }

    @Override // f3.AbstractC5457d0
    int c() {
        return this.f30853d;
    }

    @Override // f3.AbstractC5457d0
    int d() {
        return 0;
    }

    @Override // java.util.List
    public Object get(int i8) {
        e3.w.checkElementIndex(i8, this.f30853d);
        Object obj = this.f30852c[i8];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // f3.AbstractC5457d0
    boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f30853d;
    }
}
