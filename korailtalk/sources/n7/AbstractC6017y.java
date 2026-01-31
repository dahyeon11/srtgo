package n7;

/* renamed from: n7.y */
/* loaded from: classes3.dex */
public abstract class AbstractC6017y {
    public static final <T> InterfaceC6013w CompletableDeferred(InterfaceC6008t0 interfaceC6008t0) {
        return new C6015x(interfaceC6008t0);
    }

    public static /* synthetic */ InterfaceC6013w CompletableDeferred$default(InterfaceC6008t0 interfaceC6008t0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC6008t0 = null;
        }
        return CompletableDeferred(interfaceC6008t0);
    }

    public static final <T> boolean completeWith(InterfaceC6013w interfaceC6013w, Object obj) {
        Throwable thM70exceptionOrNullimpl = R6.q.m70exceptionOrNullimpl(obj);
        return thM70exceptionOrNullimpl == null ? interfaceC6013w.complete(obj) : interfaceC6013w.completeExceptionally(thM70exceptionOrNullimpl);
    }

    public static final <T> InterfaceC6013w CompletableDeferred(T t8) {
        C6015x c6015x = new C6015x(null);
        c6015x.complete(t8);
        return c6015x;
    }
}
