package n7;

/* loaded from: classes3.dex */
public final class R0 {
    public static final R0 INSTANCE = new R0();

    /* renamed from: a */
    private static final ThreadLocal f34311a = s7.P.commonThreadLocal(new s7.K("ThreadLocalEventLoop"));

    private R0() {
    }

    public final AbstractC5981f0 currentOrNull$kotlinx_coroutines_core() {
        return (AbstractC5981f0) f34311a.get();
    }

    public final AbstractC5981f0 getEventLoop$kotlinx_coroutines_core() {
        ThreadLocal threadLocal = f34311a;
        AbstractC5981f0 abstractC5981f0 = (AbstractC5981f0) threadLocal.get();
        if (abstractC5981f0 != null) {
            return abstractC5981f0;
        }
        AbstractC5981f0 abstractC5981f0CreateEventLoop = AbstractC5987i0.createEventLoop();
        threadLocal.set(abstractC5981f0CreateEventLoop);
        return abstractC5981f0CreateEventLoop;
    }

    public final void resetEventLoop$kotlinx_coroutines_core() {
        f34311a.set(null);
    }

    public final void setEventLoop$kotlinx_coroutines_core(AbstractC5981f0 abstractC5981f0) {
        f34311a.set(abstractC5981f0);
    }
}
