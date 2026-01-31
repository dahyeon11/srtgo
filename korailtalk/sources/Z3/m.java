package Z3;

/* loaded from: classes2.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private int f5725a = 0;

    /* renamed from: b, reason: collision with root package name */
    private a f5726b = a.NUMERIC;

    private enum a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    m() {
    }

    int a() {
        return this.f5725a;
    }

    void b(int i8) {
        this.f5725a += i8;
    }

    boolean c() {
        return this.f5726b == a.ALPHA;
    }

    boolean d() {
        return this.f5726b == a.ISO_IEC_646;
    }

    void e() {
        this.f5726b = a.ALPHA;
    }

    void f() {
        this.f5726b = a.ISO_IEC_646;
    }

    void g() {
        this.f5726b = a.NUMERIC;
    }

    void h(int i8) {
        this.f5725a = i8;
    }
}
