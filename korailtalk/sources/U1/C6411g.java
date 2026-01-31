package u1;

/* renamed from: u1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6411g implements H6.b {

    /* renamed from: a, reason: collision with root package name */
    private static final C6411g f37077a = new C6411g();

    public static C6411g create() {
        return f37077a;
    }

    public static AbstractC6408d storeConfig() {
        return (AbstractC6408d) H6.e.checkNotNull(AbstractC6409e.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // H6.b, Q6.a, G6.a
    public AbstractC6408d get() {
        return storeConfig();
    }
}
