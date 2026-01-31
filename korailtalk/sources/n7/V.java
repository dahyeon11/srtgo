package n7;

/* loaded from: classes3.dex */
public interface V {

    public static final class a {
        public static Object delay(V v8, long j8, W6.d<? super R6.G> dVar) {
            if (j8 <= 0) {
                return R6.G.INSTANCE;
            }
            C5998o c5998o = new C5998o(X6.b.intercepted(dVar), 1);
            c5998o.initCancellability();
            v8.mo571scheduleResumeAfterDelay(j8, c5998o);
            Object result = c5998o.getResult();
            if (result == X6.b.getCOROUTINE_SUSPENDED()) {
                Y6.h.probeCoroutineSuspended(dVar);
            }
            return result == X6.b.getCOROUTINE_SUSPENDED() ? result : R6.G.INSTANCE;
        }

        public static InterfaceC5973b0 invokeOnTimeout(V v8, long j8, Runnable runnable, W6.g gVar) {
            return S.getDefaultDelay().invokeOnTimeout(j8, runnable, gVar);
        }
    }

    Object delay(long j8, W6.d<? super R6.G> dVar);

    InterfaceC5973b0 invokeOnTimeout(long j8, Runnable runnable, W6.g gVar);

    /* renamed from: scheduleResumeAfterDelay */
    void mo571scheduleResumeAfterDelay(long j8, InterfaceC5996n interfaceC5996n);
}
