package n7;

/* renamed from: n7.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5970a extends B0 implements InterfaceC6008t0, W6.d, L {

    /* renamed from: c */
    private final W6.g f34318c;

    public AbstractC5970a(W6.g gVar, boolean z8, boolean z9) {
        super(z9);
        if (z8) {
            v((InterfaceC6008t0) gVar.get(InterfaceC6008t0.Key));
        }
        this.f34318c = gVar.plus(this);
    }

    @Override // n7.B0
    protected final void H(Object obj) {
        if (!(obj instanceof C5966B)) {
            onCompleted(obj);
        } else {
            C5966B c5966b = (C5966B) obj;
            V(c5966b.cause, c5966b.getHandled());
        }
    }

    protected void U(Object obj) {
        f(obj);
    }

    @Override // W6.d
    public final W6.g getContext() {
        return this.f34318c;
    }

    @Override // n7.L
    public W6.g getCoroutineContext() {
        return this.f34318c;
    }

    @Override // n7.B0
    public final void handleOnCompletionException$kotlinx_coroutines_core(Throwable th) {
        K.handleCoroutineException(this.f34318c, th);
    }

    @Override // n7.B0, n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    public boolean isActive() {
        return super.isActive();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n7.B0
    public String k() {
        return P.getClassSimpleName(this) + " was cancelled";
    }

    @Override // n7.B0
    public String nameString$kotlinx_coroutines_core() {
        String coroutineName = H.getCoroutineName(this.f34318c);
        if (coroutineName == null) {
            return super.nameString$kotlinx_coroutines_core();
        }
        return '\"' + coroutineName + "\":" + super.nameString$kotlinx_coroutines_core();
    }

    @Override // W6.d
    public final void resumeWith(Object obj) {
        Object objMakeCompletingOnce$kotlinx_coroutines_core = makeCompletingOnce$kotlinx_coroutines_core(F.toState$default(obj, null, 1, null));
        if (objMakeCompletingOnce$kotlinx_coroutines_core == C0.COMPLETING_WAITING_CHILDREN) {
            return;
        }
        U(objMakeCompletingOnce$kotlinx_coroutines_core);
    }

    public final <R> void start(N n8, R r8, f7.p pVar) {
        n8.invoke(pVar, r8, this);
    }

    public static /* synthetic */ void getContext$annotations() {
    }

    protected void onCompleted(Object obj) {
    }

    protected void V(Throwable th, boolean z8) {
    }
}
