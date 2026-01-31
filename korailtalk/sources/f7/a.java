package F7;

import C7.B;
import C7.E;
import C7.H;
import C7.J;

/* loaded from: classes3.dex */
public final class a implements B {
    public final E client;

    public a(E e8) {
        this.client = e8;
    }

    @Override // C7.B
    public J intercept(B.a aVar) {
        G7.g gVar = (G7.g) aVar;
        H hRequest = gVar.request();
        k kVarTransmitter = gVar.transmitter();
        return gVar.proceed(hRequest, kVarTransmitter, kVarTransmitter.e(aVar, !hRequest.method().equals("GET")));
    }
}
