package f3;

/* loaded from: classes2.dex */
final class c1 extends AbstractC5483q0 {

    /* renamed from: h */
    private static final Object[] f30879h;

    /* renamed from: i */
    static final c1 f30880i;

    /* renamed from: c */
    final transient Object[] f30881c;

    /* renamed from: d */
    private final transient int f30882d;

    /* renamed from: e */
    final transient Object[] f30883e;

    /* renamed from: f */
    private final transient int f30884f;

    /* renamed from: g */
    private final transient int f30885g;

    static {
        Object[] objArr = new Object[0];
        f30879h = objArr;
        f30880i = new c1(objArr, 0, objArr, 0, 0);
    }

    c1(Object[] objArr, int i8, Object[] objArr2, int i9, int i10) {
        this.f30881c = objArr;
        this.f30882d = i8;
        this.f30883e = objArr2;
        this.f30884f = i9;
        this.f30885g = i10;
    }

    @Override // f3.AbstractC5457d0
    int a(Object[] objArr, int i8) {
        System.arraycopy(this.f30881c, 0, objArr, i8, this.f30885g);
        return i8 + this.f30885g;
    }

    @Override // f3.AbstractC5457d0
    Object[] b() {
        return this.f30881c;
    }

    @Override // f3.AbstractC5457d0
    int c() {
        return this.f30885g;
    }

    @Override // f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f30883e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iC = AbstractC5453b0.c(obj);
        while (true) {
            int i8 = iC & this.f30884f;
            Object obj2 = objArr[i8];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iC = i8 + 1;
        }
    }

    @Override // f3.AbstractC5457d0
    int d() {
        return 0;
    }

    @Override // f3.AbstractC5483q0, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f30882d;
    }

    @Override // f3.AbstractC5483q0
    AbstractC5465h0 i() {
        return AbstractC5465h0.f(this.f30881c, this.f30885g);
    }

    @Override // f3.AbstractC5457d0
    boolean isPartialView() {
        return false;
    }

    @Override // f3.AbstractC5483q0
    boolean j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f30885g;
    }

    @Override // f3.AbstractC5483q0, f3.AbstractC5457d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public t1 iterator() {
        return asList().iterator();
    }
}
