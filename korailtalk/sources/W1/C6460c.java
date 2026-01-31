package w1;

/* renamed from: w1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6460c implements H6.b {

    /* renamed from: a, reason: collision with root package name */
    private static final C6460c f37375a = new C6460c();

    public static C6460c create() {
        return f37375a;
    }

    public static InterfaceC6458a eventClock() {
        return (InterfaceC6458a) H6.e.checkNotNull(AbstractC6459b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // H6.b, Q6.a, G6.a
    public InterfaceC6458a get() {
        return eventClock();
    }
}
