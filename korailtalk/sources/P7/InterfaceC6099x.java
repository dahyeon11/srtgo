package p7;

import R6.G;
import s7.J;

/* renamed from: p7.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6099x {
    boolean close(Throwable th);

    v7.h getOnSend();

    void invokeOnClose(f7.l lVar);

    boolean isClosedForSend();

    boolean offer(Object obj);

    Object send(Object obj, W6.d<? super G> dVar);

    /* renamed from: trySend-JP2dKIU */
    Object mo535trySendJP2dKIU(Object obj);

    /* renamed from: p7.x$a */
    public static final class a {
        public static /* synthetic */ boolean close$default(InterfaceC6099x interfaceC6099x, Throwable th, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i8 & 1) != 0) {
                th = null;
            }
            return interfaceC6099x.close(th);
        }

        public static <E> boolean offer(InterfaceC6099x interfaceC6099x, E e8) throws Throwable {
            Object objMo535trySendJP2dKIU = interfaceC6099x.mo535trySendJP2dKIU(e8);
            if (C6071i.m550isSuccessimpl(objMo535trySendJP2dKIU)) {
                return true;
            }
            Throwable thM544exceptionOrNullimpl = C6071i.m544exceptionOrNullimpl(objMo535trySendJP2dKIU);
            if (thM544exceptionOrNullimpl == null) {
                return false;
            }
            throw J.recoverStackTrace(thM544exceptionOrNullimpl);
        }

        public static /* synthetic */ void isClosedForSend$annotations() {
        }
    }
}
