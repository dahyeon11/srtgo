package Y6;

import R6.G;
import R6.q;
import R6.r;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a implements W6.d, e, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final W6.d f5652a;

    public a(W6.d<Object> dVar) {
        this.f5652a = dVar;
    }

    public W6.d<G> create(W6.d<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // Y6.e
    public e getCallerFrame() {
        W6.d dVar = this.f5652a;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final W6.d<Object> getCompletion() {
        return this.f5652a;
    }

    @Override // W6.d
    public abstract /* synthetic */ W6.g getContext();

    @Override // Y6.e
    public StackTraceElement getStackTraceElement() {
        return g.getStackTraceElement(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    @Override // W6.d
    public final void resumeWith(Object obj) {
        Object objInvokeSuspend;
        W6.d dVar = this;
        while (true) {
            h.probeCoroutineResumed(dVar);
            a aVar = (a) dVar;
            W6.d dVar2 = aVar.f5652a;
            Intrinsics.checkNotNull(dVar2);
            try {
                objInvokeSuspend = aVar.invokeSuspend(obj);
            } catch (Throwable th) {
                q.a aVar2 = q.Companion;
                obj = q.m67constructorimpl(r.createFailure(th));
            }
            if (objInvokeSuspend == X6.b.getCOROUTINE_SUSPENDED()) {
                return;
            }
            obj = q.m67constructorimpl(objInvokeSuspend);
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public W6.d<G> create(Object obj, W6.d<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    protected void releaseIntercepted() {
    }
}
