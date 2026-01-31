package F7;

import C7.C0480n;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List f1268a;

    /* renamed from: b, reason: collision with root package name */
    private int f1269b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1270c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1271d;

    b(List list) {
        this.f1268a = list;
    }

    private boolean c(SSLSocket sSLSocket) {
        for (int i8 = this.f1269b; i8 < this.f1268a.size(); i8++) {
            if (((C0480n) this.f1268a.get(i8)).isCompatible(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    C0480n a(SSLSocket sSLSocket) throws UnknownServiceException {
        C0480n c0480n;
        int i8 = this.f1269b;
        int size = this.f1268a.size();
        while (true) {
            if (i8 >= size) {
                c0480n = null;
                break;
            }
            c0480n = (C0480n) this.f1268a.get(i8);
            if (c0480n.isCompatible(sSLSocket)) {
                this.f1269b = i8 + 1;
                break;
            }
            i8++;
        }
        if (c0480n != null) {
            this.f1270c = c(sSLSocket);
            D7.a.instance.apply(c0480n, sSLSocket, this.f1271d);
            return c0480n;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f1271d + ", modes=" + this.f1268a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    boolean b(IOException iOException) {
        this.f1271d = true;
        if (!this.f1270c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return iOException instanceof SSLException;
    }
}
