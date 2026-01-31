package F7;

import C7.A;
import C7.C0467a;
import C7.InterfaceC0472f;
import C7.L;
import C7.u;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private final C0467a f1326a;

    /* renamed from: b, reason: collision with root package name */
    private final h f1327b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0472f f1328c;

    /* renamed from: d, reason: collision with root package name */
    private final u f1329d;

    /* renamed from: f, reason: collision with root package name */
    private int f1331f;

    /* renamed from: e, reason: collision with root package name */
    private List f1330e = Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    private List f1332g = Collections.emptyList();

    /* renamed from: h, reason: collision with root package name */
    private final List f1333h = new ArrayList();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f1334a;

        /* renamed from: b, reason: collision with root package name */
        private int f1335b = 0;

        a(List list) {
            this.f1334a = list;
        }

        public List<L> getAll() {
            return new ArrayList(this.f1334a);
        }

        public boolean hasNext() {
            return this.f1335b < this.f1334a.size();
        }

        public L next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            List list = this.f1334a;
            int i8 = this.f1335b;
            this.f1335b = i8 + 1;
            return (L) list.get(i8);
        }
    }

    j(C0467a c0467a, h hVar, InterfaceC0472f interfaceC0472f, u uVar) {
        this.f1326a = c0467a;
        this.f1327b = hVar;
        this.f1328c = interfaceC0472f;
        this.f1329d = uVar;
        e(c0467a.url(), c0467a.proxy());
    }

    static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    private boolean b() {
        return this.f1331f < this.f1330e.size();
    }

    private Proxy c() throws SocketException, UnknownHostException {
        if (b()) {
            List list = this.f1330e;
            int i8 = this.f1331f;
            this.f1331f = i8 + 1;
            Proxy proxy = (Proxy) list.get(i8);
            d(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f1326a.url().host() + "; exhausted proxy configurations: " + this.f1330e);
    }

    private void d(Proxy proxy) throws SocketException, UnknownHostException {
        String strHost;
        int iPort;
        this.f1332g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strHost = this.f1326a.url().host();
            iPort = this.f1326a.url().port();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strHost = a(inetSocketAddress);
            iPort = inetSocketAddress.getPort();
        }
        if (iPort < 1 || iPort > 65535) {
            throw new SocketException("No route to " + strHost + ":" + iPort + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.f1332g.add(InetSocketAddress.createUnresolved(strHost, iPort));
            return;
        }
        this.f1329d.dnsStart(this.f1328c, strHost);
        List<InetAddress> listLookup = this.f1326a.dns().lookup(strHost);
        if (listLookup.isEmpty()) {
            throw new UnknownHostException(this.f1326a.dns() + " returned no addresses for " + strHost);
        }
        this.f1329d.dnsEnd(this.f1328c, strHost, listLookup);
        int size = listLookup.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.f1332g.add(new InetSocketAddress(listLookup.get(i8), iPort));
        }
    }

    private void e(A a9, Proxy proxy) {
        if (proxy != null) {
            this.f1330e = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.f1326a.proxySelector().select(a9.uri());
            this.f1330e = (listSelect == null || listSelect.isEmpty()) ? D7.e.immutableList(Proxy.NO_PROXY) : D7.e.immutableList(listSelect);
        }
        this.f1331f = 0;
    }

    public boolean hasNext() {
        return b() || !this.f1333h.isEmpty();
    }

    public a next() throws SocketException, UnknownHostException {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyC = c();
            int size = this.f1332g.size();
            for (int i8 = 0; i8 < size; i8++) {
                L l8 = new L(this.f1326a, proxyC, (InetSocketAddress) this.f1332g.get(i8));
                if (this.f1327b.shouldPostpone(l8)) {
                    this.f1333h.add(l8);
                } else {
                    arrayList.add(l8);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f1333h);
            this.f1333h.clear();
        }
        return new a(arrayList);
    }
}
