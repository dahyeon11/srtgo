package K7;

import C7.F;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
final class i extends j {

    /* renamed from: c, reason: collision with root package name */
    final Method f2993c;

    /* renamed from: d, reason: collision with root package name */
    final Method f2994d;

    i(Method method, Method method2) {
        this.f2993c = method;
        this.f2994d = method2;
    }

    public static i buildIfSupported() {
        try {
            return new i(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // K7.j
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<F> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> listAlpnProtocolNames = j.alpnProtocolNames(list);
            this.f2993c.invoke(sSLParameters, listAlpnProtocolNames.toArray(new String[listAlpnProtocolNames.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw new AssertionError("failed to set SSL parameters", e8);
        }
    }

    @Override // K7.j
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f2994d.invoke(sSLSocket, null);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (IllegalAccessException e8) {
            throw new AssertionError("failed to get ALPN selected protocol", e8);
        } catch (InvocationTargetException e9) {
            if (e9.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw new AssertionError("failed to get ALPN selected protocol", e9);
        }
    }

    @Override // K7.j
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}
