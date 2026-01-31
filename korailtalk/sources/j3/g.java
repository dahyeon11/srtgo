package J3;

/* loaded from: classes2.dex */
abstract class g {

    /* renamed from: b, reason: collision with root package name */
    static final g f2595b = new e(null, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final g f2596a;

    g(g gVar) {
        this.f2596a = gVar;
    }

    final g a(int i8, int i9) {
        return new e(this, i8, i9);
    }

    abstract void appendTo(M3.a aVar, byte[] bArr);

    final g b(int i8, int i9) {
        return new b(this, i8, i9);
    }

    final g c() {
        return this.f2596a;
    }
}
