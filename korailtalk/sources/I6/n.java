package I6;

import e3.w;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
abstract class n {

    /* renamed from: a, reason: collision with root package name */
    static final List f2343a = Collections.unmodifiableList(Arrays.asList(J6.i.HTTP_2));

    static String a(String str) {
        return (str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str;
    }

    public static SSLSocket upgrade(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i8, J6.b bVar) throws SSLPeerUnverifiedException {
        w.checkNotNull(sSLSocketFactory, "sslSocketFactory");
        w.checkNotNull(socket, "socket");
        w.checkNotNull(bVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i8, true);
        bVar.apply(sSLSocket, false);
        String strNegotiate = k.get().negotiate(sSLSocket, str, bVar.supportsTlsExtensions() ? f2343a : null);
        List list = f2343a;
        w.checkState(list.contains(J6.i.get(strNegotiate)), "Only " + list + " are supported, but negotiated protocol is %s", strNegotiate);
        if (hostnameVerifier == null) {
            hostnameVerifier = J6.f.INSTANCE;
        }
        if (hostnameVerifier.verify(a(str), sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str);
    }
}
