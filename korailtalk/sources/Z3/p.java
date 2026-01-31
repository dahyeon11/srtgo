package Z3;

/* loaded from: classes2.dex */
final class p extends q {

    /* renamed from: b, reason: collision with root package name */
    private final int f5732b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5733c;

    p(int i8, int i9, int i10) throws F3.h {
        super(i8);
        if (i9 < 0 || i9 > 10 || i10 < 0 || i10 > 10) {
            throw F3.h.getFormatInstance();
        }
        this.f5732b = i9;
        this.f5733c = i10;
    }

    int b() {
        return this.f5732b;
    }

    int c() {
        return this.f5733c;
    }

    boolean d() {
        return this.f5732b == 10;
    }

    boolean e() {
        return this.f5733c == 10;
    }
}
