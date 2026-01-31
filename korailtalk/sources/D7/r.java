package d7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class r {
    public static final r SKIP = new r("SKIP", 0);
    public static final r TERMINATE = new r("TERMINATE", 1);

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ r[] f30131a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ Z6.a f30132b;

    static {
        r[] rVarArrA = a();
        f30131a = rVarArrA;
        f30132b = Z6.b.enumEntries(rVarArrA);
    }

    private r(String str, int i8) {
    }

    private static final /* synthetic */ r[] a() {
        return new r[]{SKIP, TERMINATE};
    }

    public static Z6.a getEntries() {
        return f30132b;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f30131a.clone();
    }
}
