package p7;

import R6.G;
import n7.K;
import p7.InterfaceC6099x;

/* renamed from: p7.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6095t extends C6068f implements InterfaceC6096u {
    public C6095t(W6.g gVar, InterfaceC6067e interfaceC6067e) {
        super(gVar, interfaceC6067e, true, true);
    }

    @Override // n7.AbstractC5970a
    protected void V(Throwable th, boolean z8) {
        if (W().close(th) || z8) {
            return;
        }
        K.handleCoroutineException(getContext(), th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n7.AbstractC5970a
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public void onCompleted(G g8) {
        InterfaceC6099x.a.close$default(W(), null, 1, null);
    }

    @Override // p7.InterfaceC6096u
    public /* bridge */ /* synthetic */ InterfaceC6099x getChannel() {
        return getChannel();
    }

    @Override // n7.AbstractC5970a, n7.B0, n7.InterfaceC6008t0, n7.InterfaceC6011v, n7.J0
    public boolean isActive() {
        return super.isActive();
    }
}
