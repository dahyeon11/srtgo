package K7;

import C7.F;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* loaded from: classes3.dex */
public class g extends j {
    private g() {
    }

    public static g buildIfSupported() throws ClassNotFoundException {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new g();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private Provider f() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // K7.j
    public void configureSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    @Override // K7.j
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<F> list) {
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.configureTlsExtensions(sSLSocket, str, list);
            return;
        }
        if (str != null) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setHostname(sSLSocket, str);
        }
        Conscrypt.setApplicationProtocols(sSLSocket, (String[]) j.alpnProtocolNames(list).toArray(new String[0]));
    }

    @Override // K7.j
    public SSLContext getSSLContext() {
        try {
            return SSLContext.getInstance("TLSv1.3", f());
        } catch (NoSuchAlgorithmException e8) {
            try {
                return SSLContext.getInstance("TLS", f());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e8);
            }
        }
    }

    @Override // K7.j
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.getSelectedProtocol(sSLSocket);
    }

    @Override // K7.j
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        if (!Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.trustManager(sSLSocketFactory);
        }
        try {
            Object objE = j.e(sSLSocketFactory, Object.class, "sslParameters");
            if (objE != null) {
                return (X509TrustManager) j.e(objE, X509TrustManager.class, "x509TrustManager");
            }
            return null;
        } catch (Exception e8) {
            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e8);
        }
    }
}
