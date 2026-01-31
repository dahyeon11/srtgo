package I6;

import J6.b;
import com.squareup.okhttp.CipherSuite;
import com.squareup.okhttp.ConnectionSpec;
import com.squareup.okhttp.TlsVersion;
import e3.w;
import io.grpc.C5728h0;
import io.grpc.O;
import io.grpc.V;
import io.grpc.internal.T0;
import java.net.Socket;
import java.net.SocketException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
abstract class r {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f2360a = Logger.getLogger(r.class.getName());

    private static byte[][] a(List list) {
        byte[][] bArr = new byte[list.size() * 2][];
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            K6.d dVar = (K6.d) it.next();
            int i9 = i8 + 1;
            bArr[i8] = dVar.name.toByteArray();
            i8 += 2;
            bArr[i9] = dVar.value.toByteArray();
        }
        return T0.toRawSerializedHeaders(bArr);
    }

    static J6.b b(ConnectionSpec connectionSpec) {
        w.checkArgument(connectionSpec.isTls(), "plaintext ConnectionSpec is not accepted");
        List listTlsVersions = connectionSpec.tlsVersions();
        int size = listTlsVersions.size();
        String[] strArr = new String[size];
        for (int i8 = 0; i8 < size; i8++) {
            strArr[i8] = ((TlsVersion) listTlsVersions.get(i8)).javaName();
        }
        List listCipherSuites = connectionSpec.cipherSuites();
        int size2 = listCipherSuites.size();
        J6.a[] aVarArr = new J6.a[size2];
        for (int i9 = 0; i9 < size2; i9++) {
            aVarArr[i9] = J6.a.valueOf(((CipherSuite) listCipherSuites.get(i9)).name());
        }
        return new b.C0047b(connectionSpec.isTls()).supportsTlsExtensions(connectionSpec.supportsTlsExtensions()).tlsVersions(strArr).cipherSuites(aVarArr).build();
    }

    static O.j c(Socket socket) {
        O.j.a aVar = new O.j.a();
        try {
            aVar.setSocketOptionLingerSeconds(Integer.valueOf(socket.getSoLinger()));
        } catch (SocketException e8) {
            f2360a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e8);
            aVar.addOption("SO_LINGER", "channelz_internal_error");
        }
        try {
            aVar.setSocketOptionTimeoutMillis(Integer.valueOf(socket.getSoTimeout()));
        } catch (Exception e9) {
            f2360a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e9);
            aVar.addOption("SO_TIMEOUT", "channelz_internal_error");
        }
        try {
            aVar.addOption("TCP_NODELAY", socket.getTcpNoDelay());
        } catch (SocketException e10) {
            f2360a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e10);
            aVar.addOption("TCP_NODELAY", "channelz_internal_error");
        }
        try {
            aVar.addOption("SO_REUSEADDR", socket.getReuseAddress());
        } catch (SocketException e11) {
            f2360a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e11);
            aVar.addOption("SO_REUSEADDR", "channelz_internal_error");
        }
        try {
            aVar.addOption("SO_SNDBUF", socket.getSendBufferSize());
        } catch (SocketException e12) {
            f2360a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e12);
            aVar.addOption("SO_SNDBUF", "channelz_internal_error");
        }
        try {
            aVar.addOption("SO_RECVBUF", socket.getReceiveBufferSize());
        } catch (SocketException e13) {
            f2360a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e13);
            aVar.addOption("SO_RECVBUF", "channelz_internal_error");
        }
        try {
            aVar.addOption("SO_KEEPALIVE", socket.getKeepAlive());
        } catch (SocketException e14) {
            f2360a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e14);
            aVar.addOption("SO_KEEPALIVE", "channelz_internal_error");
        }
        try {
            aVar.addOption("SO_OOBINLINE", socket.getOOBInline());
        } catch (SocketException e15) {
            f2360a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e15);
            aVar.addOption("SO_OOBINLINE", "channelz_internal_error");
        }
        try {
            aVar.addOption("IP_TOS", socket.getTrafficClass());
        } catch (SocketException e16) {
            f2360a.log(Level.SEVERE, "Exception caught while reading socket option", (Throwable) e16);
            aVar.addOption("IP_TOS", "channelz_internal_error");
        }
        return aVar.build();
    }

    public static C5728h0 convertHeaders(List<K6.d> list) {
        return V.newMetadata(a(list));
    }

    public static C5728h0 convertTrailers(List<K6.d> list) {
        return V.newMetadata(a(list));
    }
}
