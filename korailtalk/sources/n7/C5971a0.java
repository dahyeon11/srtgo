package n7;

/* renamed from: n7.a0 */
/* loaded from: classes3.dex */
public final class C5971a0 {
    public static final C5971a0 INSTANCE = new C5971a0();

    /* renamed from: a */
    private static final I f34319a = u7.c.INSTANCE;

    /* renamed from: b */
    private static final I f34320b = T0.INSTANCE;

    /* renamed from: c */
    private static final I f34321c = u7.b.INSTANCE;

    private C5971a0() {
    }

    public static final I getDefault() {
        return f34319a;
    }

    public static final I getIO() {
        return f34321c;
    }

    public static final F0 getMain() {
        return s7.z.dispatcher;
    }

    public static final I getUnconfined() {
        return f34320b;
    }

    public final void shutdown() {
        Q.INSTANCE.shutdown();
        u7.c.INSTANCE.shutdown$kotlinx_coroutines_core();
    }

    public static /* synthetic */ void getDefault$annotations() {
    }

    public static /* synthetic */ void getIO$annotations() {
    }

    public static /* synthetic */ void getMain$annotations() {
    }

    public static /* synthetic */ void getUnconfined$annotations() {
    }
}
