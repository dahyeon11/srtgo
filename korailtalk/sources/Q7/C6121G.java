package q7;

/* renamed from: q7.G, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6121G extends AbstractC6139a {

    /* renamed from: a, reason: collision with root package name */
    private final f7.p f35179a;

    public C6121G(f7.p pVar) {
        this.f35179a = pVar;
    }

    @Override // q7.AbstractC6139a
    public Object collectSafely(InterfaceC6148j interfaceC6148j, W6.d<? super R6.G> dVar) {
        Object objInvoke = this.f35179a.invoke(interfaceC6148j, dVar);
        return objInvoke == X6.b.getCOROUTINE_SUSPENDED() ? objInvoke : R6.G.INSTANCE;
    }
}
