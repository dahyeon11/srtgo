package io.grpc.internal;

import com.kakao.sdk.common.Constants;
import e3.InterfaceC5355E;
import io.grpc.M;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.internal.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5783x0 implements io.grpc.s0 {

    /* renamed from: d, reason: collision with root package name */
    private static final Logger f33209d = Logger.getLogger(C5783x0.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private static final c f33210e = new a();

    /* renamed from: f, reason: collision with root package name */
    private static final InterfaceC5355E f33211f = new b();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5355E f33212a;

    /* renamed from: b, reason: collision with root package name */
    private final c f33213b;

    /* renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f33214c;

    /* renamed from: io.grpc.internal.x0$a */
    class a implements c {
        a() {
        }

        @Override // io.grpc.internal.C5783x0.c
        public PasswordAuthentication requestPasswordAuthentication(String str, InetAddress inetAddress, int i8, String str2, String str3, String str4) {
            URL url;
            try {
                url = new URL(str2, str, i8, "");
            } catch (MalformedURLException unused) {
                C5783x0.f33209d.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{str2, str});
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i8, str2, str3, str4, url, Authenticator.RequestorType.PROXY);
        }
    }

    /* renamed from: io.grpc.internal.x0$b */
    class b implements InterfaceC5355E {
        b() {
        }

        @Override // e3.InterfaceC5355E
        public ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    /* renamed from: io.grpc.internal.x0$c */
    interface c {
        PasswordAuthentication requestPasswordAuthentication(String str, InetAddress inetAddress, int i8, String str2, String str3, String str4);
    }

    public C5783x0() {
        this(f33211f, f33210e, System.getenv("GRPC_PROXY_EXP"));
    }

    private io.grpc.r0 b(InetSocketAddress inetSocketAddress) {
        try {
            try {
                URI uri = new URI(Constants.SCHEME, null, U.getHost(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = (ProxySelector) this.f33212a.get();
                if (proxySelector == null) {
                    f33209d.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> listSelect = proxySelector.select(uri);
                if (listSelect.size() > 1) {
                    f33209d.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = listSelect.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication = this.f33213b.requestPasswordAuthentication(U.getHost(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), Constants.SCHEME, "", null);
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                M.b proxyAddress = io.grpc.M.newBuilder().setTargetAddress(inetSocketAddress).setProxyAddress(inetSocketAddress2);
                if (passwordAuthenticationRequestPasswordAuthentication == null) {
                    return proxyAddress.build();
                }
                return proxyAddress.setUsername(passwordAuthenticationRequestPasswordAuthentication.getUserName()).setPassword(passwordAuthenticationRequestPasswordAuthentication.getPassword() != null ? new String(passwordAuthenticationRequestPasswordAuthentication.getPassword()) : null).build();
            } catch (URISyntaxException e8) {
                f33209d.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e8);
                return null;
            }
        } catch (Throwable th) {
            f33209d.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }

    private static InetSocketAddress c(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(":", 2);
        int i8 = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        f33209d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        return new InetSocketAddress(strArrSplit[0], i8);
    }

    @Override // io.grpc.s0
    public io.grpc.r0 proxyFor(SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            return this.f33214c != null ? io.grpc.M.newBuilder().setProxyAddress(this.f33214c).setTargetAddress((InetSocketAddress) socketAddress).build() : b((InetSocketAddress) socketAddress);
        }
        return null;
    }

    C5783x0(InterfaceC5355E interfaceC5355E, c cVar, String str) {
        this.f33212a = (InterfaceC5355E) e3.w.checkNotNull(interfaceC5355E);
        this.f33213b = (c) e3.w.checkNotNull(cVar);
        if (str != null) {
            this.f33214c = c(str);
        } else {
            this.f33214c = null;
        }
    }
}
