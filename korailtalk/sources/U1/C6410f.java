package u1;

/* renamed from: u1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6410f implements H6.b {

    /* renamed from: a, reason: collision with root package name */
    private static final C6410f f37076a = new C6410f();

    public static C6410f create() {
        return f37076a;
    }

    public static int schemaVersion() {
        return AbstractC6409e.a();
    }

    @Override // H6.b, Q6.a, G6.a
    public Integer get() {
        return Integer.valueOf(schemaVersion());
    }
}
