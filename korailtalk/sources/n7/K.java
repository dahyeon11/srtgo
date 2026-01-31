package n7;

import R6.AbstractC0747a;
import n7.J;
import s7.AbstractC6248i;

/* loaded from: classes3.dex */
public abstract class K {

    public static final class a extends W6.a implements J {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f7.p f34306b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f7.p pVar, J.a aVar) {
            super(aVar);
            this.f34306b = pVar;
        }

        @Override // n7.J
        public void handleException(W6.g gVar, Throwable th) {
            this.f34306b.invoke(gVar, th);
        }
    }

    public static final J CoroutineExceptionHandler(f7.p pVar) {
        return new a(pVar, J.Key);
    }

    public static final void handleCoroutineException(W6.g gVar, Throwable th) {
        try {
            J j8 = (J) gVar.get(J.Key);
            if (j8 != null) {
                j8.handleException(gVar, th);
            } else {
                AbstractC6248i.handleUncaughtCoroutineException(gVar, th);
            }
        } catch (Throwable th2) {
            AbstractC6248i.handleUncaughtCoroutineException(gVar, handlerException(th, th2));
        }
    }

    public static final Throwable handlerException(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        AbstractC0747a.addSuppressed(runtimeException, th);
        return runtimeException;
    }
}
