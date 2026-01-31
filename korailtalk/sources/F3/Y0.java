package f3;

import f3.a1;

/* loaded from: classes2.dex */
final class Y0 extends AbstractC5455c0 {

    /* renamed from: k, reason: collision with root package name */
    static final Y0 f30845k = new Y0();

    /* renamed from: f, reason: collision with root package name */
    private final transient Object f30846f;

    /* renamed from: g, reason: collision with root package name */
    final transient Object[] f30847g;

    /* renamed from: h, reason: collision with root package name */
    private final transient int f30848h;

    /* renamed from: i, reason: collision with root package name */
    private final transient int f30849i;

    /* renamed from: j, reason: collision with root package name */
    private final transient Y0 f30850j;

    private Y0() {
        this.f30846f = null;
        this.f30847g = new Object[0];
        this.f30848h = 0;
        this.f30849i = 0;
        this.f30850j = this;
    }

    @Override // f3.AbstractC5469j0
    AbstractC5483q0 a() {
        return new a1.a(this, this.f30847g, this.f30848h, this.f30849i);
    }

    @Override // f3.AbstractC5469j0
    AbstractC5483q0 b() {
        return new a1.b(this, new a1.c(this.f30847g, this.f30848h, this.f30849i));
    }

    @Override // f3.AbstractC5469j0
    boolean e() {
        return false;
    }

    @Override // f3.AbstractC5469j0, java.util.Map
    public Object get(Object obj) {
        Object objK = a1.k(this.f30846f, this.f30847g, this.f30849i, this.f30848h, obj);
        if (objK == null) {
            return null;
        }
        return objK;
    }

    @Override // java.util.Map
    public int size() {
        return this.f30849i;
    }

    @Override // f3.AbstractC5455c0, f3.InterfaceC5476n
    public AbstractC5455c0 inverse() {
        return this.f30850j;
    }

    Y0(Object[] objArr, int i8) {
        this.f30847g = objArr;
        this.f30849i = i8;
        this.f30848h = 0;
        int iG = i8 >= 2 ? AbstractC5483q0.g(i8) : 0;
        this.f30846f = a1.j(objArr, i8, iG, 0);
        this.f30850j = new Y0(a1.j(objArr, i8, iG, 1), objArr, i8, this);
    }

    private Y0(Object obj, Object[] objArr, int i8, Y0 y02) {
        this.f30846f = obj;
        this.f30847g = objArr;
        this.f30848h = 1;
        this.f30849i = i8;
        this.f30850j = y02;
    }
}
