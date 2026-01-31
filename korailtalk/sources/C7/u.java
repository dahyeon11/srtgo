package C7;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class u {
    public static final u NONE = new a();

    class a extends u {
        a() {
        }
    }

    public interface b {
        u create(InterfaceC0472f interfaceC0472f);
    }

    static b b(final u uVar) {
        return new b() { // from class: C7.t
            @Override // C7.u.b
            public final u create(InterfaceC0472f interfaceC0472f) {
                return u.c(this.f703a, interfaceC0472f);
            }
        };
    }

    public void callEnd(InterfaceC0472f interfaceC0472f) {
    }

    public void callStart(InterfaceC0472f interfaceC0472f) {
    }

    public void requestBodyStart(InterfaceC0472f interfaceC0472f) {
    }

    public void requestHeadersStart(InterfaceC0472f interfaceC0472f) {
    }

    public void responseBodyStart(InterfaceC0472f interfaceC0472f) {
    }

    public void responseHeadersStart(InterfaceC0472f interfaceC0472f) {
    }

    public void secureConnectStart(InterfaceC0472f interfaceC0472f) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ u c(u uVar, InterfaceC0472f interfaceC0472f) {
        return uVar;
    }

    public void callFailed(InterfaceC0472f interfaceC0472f, IOException iOException) {
    }

    public void connectionAcquired(InterfaceC0472f interfaceC0472f, InterfaceC0478l interfaceC0478l) {
    }

    public void connectionReleased(InterfaceC0472f interfaceC0472f, InterfaceC0478l interfaceC0478l) {
    }

    public void dnsStart(InterfaceC0472f interfaceC0472f, String str) {
    }

    public void requestBodyEnd(InterfaceC0472f interfaceC0472f, long j8) {
    }

    public void requestFailed(InterfaceC0472f interfaceC0472f, IOException iOException) {
    }

    public void requestHeadersEnd(InterfaceC0472f interfaceC0472f, H h8) {
    }

    public void responseBodyEnd(InterfaceC0472f interfaceC0472f, long j8) {
    }

    public void responseFailed(InterfaceC0472f interfaceC0472f, IOException iOException) {
    }

    public void responseHeadersEnd(InterfaceC0472f interfaceC0472f, J j8) {
    }

    public void secureConnectEnd(InterfaceC0472f interfaceC0472f, w wVar) {
    }

    public void connectStart(InterfaceC0472f interfaceC0472f, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    public void dnsEnd(InterfaceC0472f interfaceC0472f, String str, List<InetAddress> list) {
    }

    public void connectEnd(InterfaceC0472f interfaceC0472f, InetSocketAddress inetSocketAddress, Proxy proxy, F f8) {
    }

    public void connectFailed(InterfaceC0472f interfaceC0472f, InetSocketAddress inetSocketAddress, Proxy proxy, F f8, IOException iOException) {
    }
}
