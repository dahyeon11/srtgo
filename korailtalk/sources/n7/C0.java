package n7;

/* loaded from: classes3.dex */
public abstract class C0 {

    /* renamed from: a, reason: collision with root package name */
    private static final s7.K f34295a = new s7.K("COMPLETING_ALREADY");
    public static final s7.K COMPLETING_WAITING_CHILDREN = new s7.K("COMPLETING_WAITING_CHILDREN");

    /* renamed from: b, reason: collision with root package name */
    private static final s7.K f34296b = new s7.K("COMPLETING_RETRY");

    /* renamed from: c, reason: collision with root package name */
    private static final s7.K f34297c = new s7.K("TOO_LATE_TO_CANCEL");

    /* renamed from: d, reason: collision with root package name */
    private static final s7.K f34298d = new s7.K("SEALED");

    /* renamed from: e, reason: collision with root package name */
    private static final C5979e0 f34299e = new C5979e0(false);

    /* renamed from: f, reason: collision with root package name */
    private static final C5979e0 f34300f = new C5979e0(true);

    public static final Object boxIncomplete(Object obj) {
        return obj instanceof InterfaceC5999o0 ? new C6001p0((InterfaceC5999o0) obj) : obj;
    }

    public static final Object unboxState(Object obj) {
        InterfaceC5999o0 interfaceC5999o0;
        C6001p0 c6001p0 = obj instanceof C6001p0 ? (C6001p0) obj : null;
        return (c6001p0 == null || (interfaceC5999o0 = c6001p0.state) == null) ? obj : interfaceC5999o0;
    }
}
