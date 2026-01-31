package G7;

import C7.B;
import C7.H;
import C7.J;
import P7.n;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes3.dex */
public final class b implements B {

    /* renamed from: a */
    private final boolean f1492a;

    public b(boolean z8) {
        this.f1492a = z8;
    }

    @Override // C7.B
    public J intercept(B.a aVar) throws IOException {
        boolean z8;
        g gVar = (g) aVar;
        F7.c cVarExchange = gVar.exchange();
        H hRequest = gVar.request();
        long jCurrentTimeMillis = System.currentTimeMillis();
        cVarExchange.writeRequestHeaders(hRequest);
        J.a responseHeaders = null;
        if (!f.permitsRequestBody(hRequest.method()) || hRequest.body() == null) {
            cVarExchange.noRequestBody();
            z8 = false;
        } else {
            if ("100-continue".equalsIgnoreCase(hRequest.header("Expect"))) {
                cVarExchange.flushRequest();
                cVarExchange.responseHeadersStart();
                responseHeaders = cVarExchange.readResponseHeaders(true);
                z8 = true;
            } else {
                z8 = false;
            }
            if (responseHeaders != null) {
                cVarExchange.noRequestBody();
                if (!cVarExchange.connection().isMultiplexed()) {
                    cVarExchange.noNewExchangesOnConnection();
                }
            } else if (hRequest.body().isDuplex()) {
                cVarExchange.flushRequest();
                hRequest.body().writeTo(n.buffer(cVarExchange.createRequestBody(hRequest, true)));
            } else {
                P7.d dVarBuffer = n.buffer(cVarExchange.createRequestBody(hRequest, false));
                hRequest.body().writeTo(dVarBuffer);
                dVarBuffer.close();
            }
        }
        if (hRequest.body() == null || !hRequest.body().isDuplex()) {
            cVarExchange.finishRequest();
        }
        if (!z8) {
            cVarExchange.responseHeadersStart();
        }
        if (responseHeaders == null) {
            responseHeaders = cVarExchange.readResponseHeaders(false);
        }
        J jBuild = responseHeaders.request(hRequest).handshake(cVarExchange.connection().handshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int iCode = jBuild.code();
        if (iCode == 100) {
            jBuild = cVarExchange.readResponseHeaders(false).request(hRequest).handshake(cVarExchange.connection().handshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            iCode = jBuild.code();
        }
        cVarExchange.responseHeadersEnd(jBuild);
        J jBuild2 = (this.f1492a && iCode == 101) ? jBuild.newBuilder().body(D7.e.EMPTY_RESPONSE).build() : jBuild.newBuilder().body(cVarExchange.openResponseBody(jBuild)).build();
        if ("close".equalsIgnoreCase(jBuild2.request().header("Connection")) || "close".equalsIgnoreCase(jBuild2.header("Connection"))) {
            cVarExchange.noNewExchangesOnConnection();
        }
        if ((iCode != 204 && iCode != 205) || jBuild2.body().contentLength() <= 0) {
            return jBuild2;
        }
        throw new ProtocolException("HTTP " + iCode + " had non-zero Content-Length: " + jBuild2.body().contentLength());
    }
}
