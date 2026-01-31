package w1;

/* loaded from: classes.dex */
public final class d implements H6.b {

    /* renamed from: a, reason: collision with root package name */
    private static final d f37376a = new d();

    public static d create() {
        return f37376a;
    }

    public static InterfaceC6458a uptimeClock() {
        return (InterfaceC6458a) H6.e.checkNotNull(AbstractC6459b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // H6.b, Q6.a, G6.a
    public InterfaceC6458a get() {
        return uptimeClock();
    }
}
