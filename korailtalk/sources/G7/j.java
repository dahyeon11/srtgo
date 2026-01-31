package G7;

import C7.A;
import C7.B;
import C7.E;
import C7.H;
import C7.I;
import C7.J;
import C7.L;
import com.kakao.sdk.common.Constants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes3.dex */
public final class j implements B {

    /* renamed from: a */
    private final E f1511a;

    public j(E e8) {
        this.f1511a = e8;
    }

    private H a(J j8, L l8) throws ProtocolException {
        String strHeader;
        A aResolve;
        if (j8 == null) {
            throw new IllegalStateException();
        }
        int iCode = j8.code();
        String strMethod = j8.request().method();
        if (iCode == 307 || iCode == 308) {
            if (!strMethod.equals("GET") && !strMethod.equals("HEAD")) {
                return null;
            }
        } else {
            if (iCode == 401) {
                return this.f1511a.authenticator().authenticate(l8, j8);
            }
            if (iCode == 503) {
                if ((j8.priorResponse() == null || j8.priorResponse().code() != 503) && e(j8, Integer.MAX_VALUE) == 0) {
                    return j8.request();
                }
                return null;
            }
            if (iCode == 407) {
                if ((l8 != null ? l8.proxy() : this.f1511a.proxy()).type() == Proxy.Type.HTTP) {
                    return this.f1511a.proxyAuthenticator().authenticate(l8, j8);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iCode == 408) {
                if (!this.f1511a.retryOnConnectionFailure()) {
                    return null;
                }
                I iBody = j8.request().body();
                if (iBody != null && iBody.isOneShot()) {
                    return null;
                }
                if ((j8.priorResponse() == null || j8.priorResponse().code() != 408) && e(j8, 0) <= 0) {
                    return j8.request();
                }
                return null;
            }
            switch (iCode) {
                case 300:
                case AUTH_IS_VAILD_FAILED_VALUE:
                case AUTH_INVALID_AUTH_TOKEN_VALUE:
                case AUTH_FAILED_VALUE:
                    break;
                default:
                    return null;
            }
        }
        if (!this.f1511a.followRedirects() || (strHeader = j8.header("Location")) == null || (aResolve = j8.request().url().resolve(strHeader)) == null) {
            return null;
        }
        if (!aResolve.scheme().equals(j8.request().url().scheme()) && !this.f1511a.followSslRedirects()) {
            return null;
        }
        H.a aVarNewBuilder = j8.request().newBuilder();
        if (f.permitsRequestBody(strMethod)) {
            boolean zRedirectsWithBody = f.redirectsWithBody(strMethod);
            if (f.redirectsToGet(strMethod)) {
                aVarNewBuilder.method("GET", null);
            } else {
                aVarNewBuilder.method(strMethod, zRedirectsWithBody ? j8.request().body() : null);
            }
            if (!zRedirectsWithBody) {
                aVarNewBuilder.removeHeader("Transfer-Encoding");
                aVarNewBuilder.removeHeader("Content-Length");
                aVarNewBuilder.removeHeader("Content-Type");
            }
        }
        if (!D7.e.sameConnection(j8.request().url(), aResolve)) {
            aVarNewBuilder.removeHeader(Constants.AUTHORIZATION);
        }
        return aVarNewBuilder.url(aResolve).build();
    }

    private boolean b(IOException iOException, boolean z8) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z8 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private boolean c(IOException iOException, F7.k kVar, boolean z8, H h8) {
        if (this.f1511a.retryOnConnectionFailure()) {
            return !(z8 && d(iOException, h8)) && b(iOException, z8) && kVar.canRetry();
        }
        return false;
    }

    private boolean d(IOException iOException, H h8) {
        I iBody = h8.body();
        return (iBody != null && iBody.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    private int e(J j8, int i8) {
        String strHeader = j8.header("Retry-After");
        if (strHeader == null) {
            return i8;
        }
        if (strHeader.matches("\\d+")) {
            return Integer.valueOf(strHeader).intValue();
        }
        return Integer.MAX_VALUE;
    }

    @Override // C7.B
    public J intercept(B.a aVar) throws IOException {
        F7.c cVarExchange;
        H hA;
        H hRequest = aVar.request();
        g gVar = (g) aVar;
        F7.k kVarTransmitter = gVar.transmitter();
        int i8 = 0;
        J j8 = null;
        while (true) {
            kVarTransmitter.prepareToConnect(hRequest);
            if (kVarTransmitter.isCanceled()) {
                throw new IOException("Canceled");
            }
            try {
                try {
                    J jProceed = gVar.proceed(hRequest, kVarTransmitter, null);
                    if (j8 != null) {
                        jProceed = jProceed.newBuilder().priorResponse(j8.newBuilder().body(null).build()).build();
                    }
                    j8 = jProceed;
                    cVarExchange = D7.a.instance.exchange(j8);
                    hA = a(j8, cVarExchange != null ? cVarExchange.connection().route() : null);
                } catch (F7.i e8) {
                    if (!c(e8.getLastConnectException(), kVarTransmitter, false, hRequest)) {
                        throw e8.getFirstConnectException();
                    }
                } catch (IOException e9) {
                    if (!c(e9, kVarTransmitter, !(e9 instanceof I7.a), hRequest)) {
                        throw e9;
                    }
                }
                if (hA == null) {
                    if (cVarExchange != null && cVarExchange.isDuplex()) {
                        kVarTransmitter.timeoutEarlyExit();
                    }
                    return j8;
                }
                I iBody = hA.body();
                if (iBody != null && iBody.isOneShot()) {
                    return j8;
                }
                D7.e.closeQuietly(j8.body());
                if (kVarTransmitter.hasExchange()) {
                    cVarExchange.detachWithViolence();
                }
                i8++;
                if (i8 > 20) {
                    throw new ProtocolException("Too many follow-up requests: " + i8);
                }
                hRequest = hA;
            } finally {
                kVarTransmitter.exchangeDoneDueToException();
            }
        }
    }
}
