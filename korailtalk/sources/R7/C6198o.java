package r7;

import s7.G;

/* renamed from: r7.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6198o extends G {
    public C6198o(W6.g gVar, W6.d<Object> dVar) {
        super(gVar, dVar);
    }

    @Override // n7.B0
    public boolean childCancelled(Throwable th) {
        if (th instanceof C6195l) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(th);
    }
}
