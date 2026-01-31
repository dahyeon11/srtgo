package Z3;

/* loaded from: classes2.dex */
final class o extends q {

    /* renamed from: b, reason: collision with root package name */
    private final String f5729b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5730c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5731d;

    o(int i8, String str) {
        super(i8);
        this.f5729b = str;
        this.f5731d = false;
        this.f5730c = 0;
    }

    String b() {
        return this.f5729b;
    }

    int c() {
        return this.f5730c;
    }

    boolean d() {
        return this.f5731d;
    }

    o(int i8, String str, int i9) {
        super(i8);
        this.f5731d = true;
        this.f5730c = i9;
        this.f5729b = str;
    }
}
