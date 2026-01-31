package R6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ m[] f4477a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ Z6.a f4478b;
    public static final m SYNCHRONIZED = new m("SYNCHRONIZED", 0);
    public static final m PUBLICATION = new m("PUBLICATION", 1);
    public static final m NONE = new m("NONE", 2);

    static {
        m[] mVarArrA = a();
        f4477a = mVarArrA;
        f4478b = Z6.b.enumEntries(mVarArrA);
    }

    private m(String str, int i8) {
    }

    private static final /* synthetic */ m[] a() {
        return new m[]{SYNCHRONIZED, PUBLICATION, NONE};
    }

    public static Z6.a getEntries() {
        return f4478b;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f4477a.clone();
    }
}
