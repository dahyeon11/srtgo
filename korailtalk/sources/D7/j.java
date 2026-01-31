package d7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ j[] f30123a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ Z6.a f30124b;
    public static final j TOP_DOWN = new j("TOP_DOWN", 0);
    public static final j BOTTOM_UP = new j("BOTTOM_UP", 1);

    static {
        j[] jVarArrA = a();
        f30123a = jVarArrA;
        f30124b = Z6.b.enumEntries(jVarArrA);
    }

    private j(String str, int i8) {
    }

    private static final /* synthetic */ j[] a() {
        return new j[]{TOP_DOWN, BOTTOM_UP};
    }

    public static Z6.a getEntries() {
        return f30124b;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f30123a.clone();
    }
}
