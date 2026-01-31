package O3;

import maum.m2u.map.Map;

/* loaded from: classes2.dex */
public final class a {
    public static final a AZTEC_DATA_6;
    public static final a AZTEC_DATA_8;
    public static final a AZTEC_PARAM;
    public static final a DATA_MATRIX_FIELD_256;
    public static final a MAXICODE_FIELD_64;
    public static final a QR_CODE_FIELD_256;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f3411a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f3412b;

    /* renamed from: c, reason: collision with root package name */
    private final b f3413c;

    /* renamed from: d, reason: collision with root package name */
    private final b f3414d;

    /* renamed from: e, reason: collision with root package name */
    private final int f3415e;

    /* renamed from: f, reason: collision with root package name */
    private final int f3416f;

    /* renamed from: g, reason: collision with root package name */
    private final int f3417g;
    public static final a AZTEC_DATA_12 = new a(4201, 4096, 1);
    public static final a AZTEC_DATA_10 = new a(1033, 1024, 1);

    static {
        a aVar = new a(67, 64, 1);
        AZTEC_DATA_6 = aVar;
        AZTEC_PARAM = new a(19, 16, 1);
        QR_CODE_FIELD_256 = new a(285, 256, 0);
        a aVar2 = new a(Map.MapException.StatusCode.AUTH_IS_VAILD_FAILED_VALUE, 256, 1);
        DATA_MATRIX_FIELD_256 = aVar2;
        AZTEC_DATA_8 = aVar2;
        MAXICODE_FIELD_64 = aVar;
    }

    public a(int i8, int i9, int i10) {
        this.f3416f = i8;
        this.f3415e = i9;
        this.f3417g = i10;
        this.f3411a = new int[i9];
        this.f3412b = new int[i9];
        int i11 = 1;
        for (int i12 = 0; i12 < i9; i12++) {
            this.f3411a[i12] = i11;
            i11 <<= 1;
            if (i11 >= i9) {
                i11 = (i11 ^ i8) & (i9 - 1);
            }
        }
        for (int i13 = 0; i13 < i9 - 1; i13++) {
            this.f3412b[this.f3411a[i13]] = i13;
        }
        this.f3413c = new b(this, new int[]{0});
        this.f3414d = new b(this, new int[]{1});
    }

    static int a(int i8, int i9) {
        return i8 ^ i9;
    }

    b b(int i8, int i9) {
        if (i8 < 0) {
            throw new IllegalArgumentException();
        }
        if (i9 == 0) {
            return this.f3413c;
        }
        int[] iArr = new int[i8 + 1];
        iArr[0] = i9;
        return new b(this, iArr);
    }

    int c(int i8) {
        return this.f3411a[i8];
    }

    b d() {
        return this.f3414d;
    }

    b e() {
        return this.f3413c;
    }

    int f(int i8) {
        if (i8 != 0) {
            return this.f3411a[(this.f3415e - this.f3412b[i8]) - 1];
        }
        throw new ArithmeticException();
    }

    int g(int i8) {
        if (i8 != 0) {
            return this.f3412b[i8];
        }
        throw new IllegalArgumentException();
    }

    public int getGeneratorBase() {
        return this.f3417g;
    }

    public int getSize() {
        return this.f3415e;
    }

    int h(int i8, int i9) {
        if (i8 == 0 || i9 == 0) {
            return 0;
        }
        int[] iArr = this.f3411a;
        int[] iArr2 = this.f3412b;
        return iArr[(iArr2[i8] + iArr2[i9]) % (this.f3415e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f3416f) + ',' + this.f3415e + ')';
    }
}
