package g7;

/* renamed from: g7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5559a {
    public static final C5559a INSTANCE = new C5559a();
    public static final double LN2 = Math.log(2.0d);
    public static final double epsilon;
    public static final double taylor_2_bound;
    public static final double taylor_n_bound;
    public static final double upper_taylor_2_bound;
    public static final double upper_taylor_n_bound;

    static {
        double dUlp = Math.ulp(1.0d);
        epsilon = dUlp;
        double dSqrt = Math.sqrt(dUlp);
        taylor_2_bound = dSqrt;
        double dSqrt2 = Math.sqrt(dSqrt);
        taylor_n_bound = dSqrt2;
        double d9 = 1;
        upper_taylor_2_bound = d9 / dSqrt;
        upper_taylor_n_bound = d9 / dSqrt2;
    }

    private C5559a() {
    }
}
