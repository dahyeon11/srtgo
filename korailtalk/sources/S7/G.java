package s7;

import n7.AbstractC5970a;

/* loaded from: classes3.dex */
public class G extends AbstractC5970a implements Y6.e {
    public final W6.d<Object> uCont;

    public G(W6.g gVar, W6.d<Object> dVar) {
        super(gVar, true, true);
        this.uCont = dVar;
    }

    @Override // n7.AbstractC5970a
    protected void U(Object obj) {
        W6.d<Object> dVar = this.uCont;
        dVar.resumeWith(n7.F.recoverResult(obj, dVar));
    }

    @Override // n7.B0
    protected void f(Object obj) {
        AbstractC6252m.resumeCancellableWith$default(X6.b.intercepted(this.uCont), n7.F.recoverResult(obj, this.uCont), null, 2, null);
    }

    @Override // Y6.e
    public final Y6.e getCallerFrame() {
        W6.d<Object> dVar = this.uCont;
        if (dVar instanceof Y6.e) {
            return (Y6.e) dVar;
        }
        return null;
    }

    @Override // Y6.e
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // n7.B0
    protected final boolean w() {
        return true;
    }
}
