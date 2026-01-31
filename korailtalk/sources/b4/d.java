package b4;

/* loaded from: classes2.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f11411a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11412b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11413c;

    /* renamed from: d, reason: collision with root package name */
    private final int f11414d;

    /* renamed from: e, reason: collision with root package name */
    private int f11415e = -1;

    d(int i8, int i9, int i10, int i11) {
        this.f11411a = i8;
        this.f11412b = i9;
        this.f11413c = i10;
        this.f11414d = i11;
    }

    int a() {
        return this.f11413c;
    }

    int b() {
        return this.f11412b;
    }

    int c() {
        return this.f11415e;
    }

    int d() {
        return this.f11411a;
    }

    int e() {
        return this.f11414d;
    }

    int f() {
        return this.f11412b - this.f11411a;
    }

    boolean g() {
        return h(this.f11415e);
    }

    boolean h(int i8) {
        return i8 != -1 && this.f11413c == (i8 % 3) * 3;
    }

    void i(int i8) {
        this.f11415e = i8;
    }

    void j() {
        this.f11415e = ((this.f11414d / 30) * 3) + (this.f11413c / 3);
    }

    public String toString() {
        return this.f11415e + "|" + this.f11414d;
    }
}
