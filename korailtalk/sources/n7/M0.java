package n7;

/* loaded from: classes3.dex */
class M0 extends AbstractC5970a {
    public M0(W6.g gVar, boolean z8) {
        super(gVar, true, z8);
    }

    @Override // n7.B0
    protected boolean u(Throwable th) {
        K.handleCoroutineException(getContext(), th);
        return true;
    }
}
