package K7;

import C7.F;
import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
class e extends f {
    e(Class cls) {
        super(cls, null, null, null, null, null);
    }

    public static j buildIfSupported() throws ClassNotFoundException {
        if (!j.isAndroid()) {
            return null;
        }
        try {
            if (f.h() >= 29) {
                return new e(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            }
        } catch (ReflectiveOperationException unused) {
        }
        return null;
    }

    private void i(SSLSocket sSLSocket) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
    }

    @Override // K7.f, K7.j
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<F> list) throws IOException {
        try {
            i(sSLSocket);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) j.alpnProtocolNames(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e8) {
            throw new IOException("Android internal error", e8);
        }
    }

    @Override // K7.f, K7.j
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
