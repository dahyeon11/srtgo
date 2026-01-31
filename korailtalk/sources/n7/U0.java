package n7;

/* loaded from: classes3.dex */
public final class U0 extends s7.G {

    /* renamed from: d */
    private final ThreadLocal f34314d;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public U0(W6.g gVar, W6.d<Object> dVar) {
        V0 v02 = V0.INSTANCE;
        super(gVar.get(v02) == null ? gVar.plus(v02) : gVar, dVar);
        this.f34314d = new ThreadLocal();
        if (dVar.getContext().get(W6.e.Key) instanceof I) {
            return;
        }
        Object objUpdateThreadContext = s7.O.updateThreadContext(gVar, null);
        s7.O.restoreThreadContext(gVar, objUpdateThreadContext);
        saveThreadContext(gVar, objUpdateThreadContext);
    }

    @Override // s7.G, n7.AbstractC5970a
    protected void U(Object obj) {
        if (this.threadLocalIsSet) {
            R6.p pVar = (R6.p) this.f34314d.get();
            if (pVar != null) {
                s7.O.restoreThreadContext((W6.g) pVar.component1(), pVar.component2());
            }
            this.f34314d.remove();
        }
        Object objRecoverResult = F.recoverResult(obj, this.uCont);
        W6.d<Object> dVar = this.uCont;
        W6.g context = dVar.getContext();
        Object objUpdateThreadContext = s7.O.updateThreadContext(context, null);
        U0 u0UpdateUndispatchedCompletion = objUpdateThreadContext != s7.O.NO_THREAD_ELEMENTS ? H.updateUndispatchedCompletion(dVar, context, objUpdateThreadContext) : null;
        try {
            this.uCont.resumeWith(objRecoverResult);
            R6.G g8 = R6.G.INSTANCE;
        } finally {
            if (u0UpdateUndispatchedCompletion == null || u0UpdateUndispatchedCompletion.clearThreadContext()) {
                s7.O.restoreThreadContext(context, objUpdateThreadContext);
            }
        }
    }

    public final boolean clearThreadContext() {
        boolean z8 = this.threadLocalIsSet && this.f34314d.get() == null;
        this.f34314d.remove();
        return !z8;
    }

    public final void saveThreadContext(W6.g gVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f34314d.set(R6.v.to(gVar, obj));
    }
}
