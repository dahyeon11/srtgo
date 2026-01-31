package X6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ a[] f5467a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ Z6.a f5468b;
    public static final a COROUTINE_SUSPENDED = new a("COROUTINE_SUSPENDED", 0);
    public static final a UNDECIDED = new a("UNDECIDED", 1);
    public static final a RESUMED = new a("RESUMED", 2);

    static {
        a[] aVarArrA = a();
        f5467a = aVarArrA;
        f5468b = Z6.b.enumEntries(aVarArrA);
    }

    private a(String str, int i8) {
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
    }

    public static Z6.a getEntries() {
        return f5468b;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f5467a.clone();
    }
}
