package n7;

import t7.AbstractC6368a;

/* loaded from: classes3.dex */
final class E0 extends M0 {

    /* renamed from: d, reason: collision with root package name */
    private final W6.d f34302d;

    public E0(W6.g gVar, f7.p pVar) {
        super(gVar, false);
        this.f34302d = X6.b.createCoroutineUnintercepted(pVar, this, this);
    }

    @Override // n7.B0
    protected void I() throws Throwable {
        AbstractC6368a.startCoroutineCancellable((W6.d<? super R6.G>) this.f34302d, this);
    }
}
