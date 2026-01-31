package S6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class j0 {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ j0[] f4726a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ Z6.a f4727b;
    public static final j0 Ready = new j0("Ready", 0);
    public static final j0 NotReady = new j0("NotReady", 1);
    public static final j0 Done = new j0("Done", 2);
    public static final j0 Failed = new j0("Failed", 3);

    static {
        j0[] j0VarArrA = a();
        f4726a = j0VarArrA;
        f4727b = Z6.b.enumEntries(j0VarArrA);
    }

    private j0(String str, int i8) {
    }

    private static final /* synthetic */ j0[] a() {
        return new j0[]{Ready, NotReady, Done, Failed};
    }

    public static Z6.a getEntries() {
        return f4727b;
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f4726a.clone();
    }
}
