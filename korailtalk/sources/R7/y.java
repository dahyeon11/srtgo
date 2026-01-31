package r7;

import R6.G;
import p7.InterfaceC6099x;
import q7.InterfaceC6148j;

/* loaded from: classes3.dex */
public final class y implements InterfaceC6148j {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6099x f35928a;

    public y(InterfaceC6099x interfaceC6099x) {
        this.f35928a = interfaceC6099x;
    }

    @Override // q7.InterfaceC6148j
    public Object emit(Object obj, W6.d<? super G> dVar) {
        Object objSend = this.f35928a.send(obj, dVar);
        return objSend == X6.b.getCOROUTINE_SUSPENDED() ? objSend : G.INSTANCE;
    }
}
