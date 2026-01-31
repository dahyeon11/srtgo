package H;

/* loaded from: classes.dex */
final class f extends o {

    /* renamed from: b, reason: collision with root package name */
    private final int f1522b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1523c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1524d;

    /* renamed from: e, reason: collision with root package name */
    private final String f1525e;

    f(int i8, int i9, int i10, String str) {
        this.f1522b = i8;
        this.f1523c = i9;
        this.f1524d = i10;
        if (str == null) {
            throw new NullPointerException("Null description");
        }
        this.f1525e = str;
    }

    @Override // H.o
    String b() {
        return this.f1525e;
    }

    @Override // H.o
    int c() {
        return this.f1523c;
    }

    @Override // H.o
    int d() {
        return this.f1524d;
    }

    @Override // H.o
    public int getMajor() {
        return this.f1522b;
    }
}
