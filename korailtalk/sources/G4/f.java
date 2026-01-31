package g4;

/* loaded from: classes2.dex */
public enum f {
    L(1),
    M(0),
    Q(3),
    H(2);


    /* renamed from: b, reason: collision with root package name */
    private static final f[] f31340b;

    /* renamed from: a, reason: collision with root package name */
    private final int f31342a;

    static {
        f fVar = L;
        f fVar2 = M;
        f fVar3 = Q;
        f31340b = new f[]{fVar2, fVar, H, fVar3};
    }

    f(int i8) {
        this.f31342a = i8;
    }

    public static f forBits(int i8) {
        if (i8 >= 0) {
            f[] fVarArr = f31340b;
            if (i8 < fVarArr.length) {
                return fVarArr[i8];
            }
        }
        throw new IllegalArgumentException();
    }

    public int getBits() {
        return this.f31342a;
    }
}
