package io.grpc.internal;

import Q7.C0709m;
import e3.C5353C;
import io.grpc.AbstractC5787j0;
import io.grpc.C5713a;
import io.grpc.internal.L0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class E extends AbstractC5787j0 {

    /* renamed from: A, reason: collision with root package name */
    private static final g f32418A;

    /* renamed from: B, reason: collision with root package name */
    private static String f32419B;

    /* renamed from: s, reason: collision with root package name */
    private static final Logger f32420s = Logger.getLogger(E.class.getName());

    /* renamed from: t, reason: collision with root package name */
    private static final Set f32421t = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));

    /* renamed from: u, reason: collision with root package name */
    private static final String f32422u;

    /* renamed from: v, reason: collision with root package name */
    private static final String f32423v;

    /* renamed from: w, reason: collision with root package name */
    private static final String f32424w;

    /* renamed from: x, reason: collision with root package name */
    static boolean f32425x;

    /* renamed from: y, reason: collision with root package name */
    static boolean f32426y;

    /* renamed from: z, reason: collision with root package name */
    protected static boolean f32427z;

    /* renamed from: a, reason: collision with root package name */
    final io.grpc.s0 f32428a;

    /* renamed from: b, reason: collision with root package name */
    private final Random f32429b = new Random();

    /* renamed from: c, reason: collision with root package name */
    protected volatile b f32430c = d.INSTANCE;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f32431d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    private final String f32432e;

    /* renamed from: f, reason: collision with root package name */
    private final String f32433f;

    /* renamed from: g, reason: collision with root package name */
    private final int f32434g;

    /* renamed from: h, reason: collision with root package name */
    private final L0.d f32435h;

    /* renamed from: i, reason: collision with root package name */
    private final long f32436i;

    /* renamed from: j, reason: collision with root package name */
    private final io.grpc.N0 f32437j;

    /* renamed from: k, reason: collision with root package name */
    private final C5353C f32438k;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f32439l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f32440m;

    /* renamed from: n, reason: collision with root package name */
    private Executor f32441n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f32442o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC5787j0.h f32443p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f32444q;

    /* renamed from: r, reason: collision with root package name */
    private AbstractC5787j0.e f32445r;

    public interface b {
        List<InetAddress> resolveAddress(String str);
    }

    protected static final class c {

        /* renamed from: a, reason: collision with root package name */
        private io.grpc.J0 f32446a;
        public C5713a attributes;

        /* renamed from: b, reason: collision with root package name */
        private List f32447b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC5787j0.c f32448c;

        private c() {
        }
    }

    private enum d implements b {
        INSTANCE;

        @Override // io.grpc.internal.E.b
        public List<InetAddress> resolveAddress(String str) {
            return Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
        }
    }

    private final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC5787j0.e f32450a;

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f32452a;

            a(boolean z8) {
                this.f32452a = z8;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f32452a) {
                    E e8 = E.this;
                    e8.f32439l = true;
                    if (e8.f32436i > 0) {
                        E.this.f32438k.reset().start();
                    }
                }
                E.this.f32444q = false;
            }
        }

        e(AbstractC5787j0.e eVar) {
            this.f32450a = (AbstractC5787j0.e) e3.w.checkNotNull(eVar, "savedListener");
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z8;
            io.grpc.N0 n02;
            a aVar;
            Logger logger = E.f32420s;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                E.f32420s.finer("Attempting DNS resolution of " + E.this.f32433f);
            }
            c cVarJ = null;
            try {
                try {
                    io.grpc.C cI = E.this.i();
                    AbstractC5787j0.g.a aVarNewBuilder = AbstractC5787j0.g.newBuilder();
                    if (cI != null) {
                        if (E.f32420s.isLoggable(level)) {
                            E.f32420s.finer("Using proxy address " + cI);
                        }
                        aVarNewBuilder.setAddresses(Collections.singletonList(cI));
                    } else {
                        cVarJ = E.this.j(false);
                        if (cVarJ.f32446a != null) {
                            this.f32450a.onError(cVarJ.f32446a);
                            E.this.f32437j.execute(new a(cVarJ != null && cVarJ.f32446a == null));
                            return;
                        }
                        if (cVarJ.f32447b != null) {
                            aVarNewBuilder.setAddresses(cVarJ.f32447b);
                        }
                        if (cVarJ.f32448c != null) {
                            aVarNewBuilder.setServiceConfig(cVarJ.f32448c);
                        }
                        C5713a c5713a = cVarJ.attributes;
                        if (c5713a != null) {
                            aVarNewBuilder.setAttributes(c5713a);
                        }
                    }
                    this.f32450a.onResult(aVarNewBuilder.build());
                    z8 = cVarJ != null && cVarJ.f32446a == null;
                    n02 = E.this.f32437j;
                    aVar = new a(z8);
                } catch (IOException e8) {
                    this.f32450a.onError(io.grpc.J0.UNAVAILABLE.withDescription("Unable to resolve host " + E.this.f32433f).withCause(e8));
                    z8 = 0 != 0 && null.f32446a == null;
                    n02 = E.this.f32437j;
                    aVar = new a(z8);
                }
                n02.execute(aVar);
            } catch (Throwable th) {
                E.this.f32437j.execute(new a(0 != 0 && null.f32446a == null));
                throw th;
            }
        }
    }

    public interface f {
        List<h> resolveSrv(String str);

        List<String> resolveTxt(String str);
    }

    interface g {
        f newResourceResolver();

        Throwable unavailabilityCause();
    }

    public static final class h {
        public final String host;
        public final int port;

        public h(String str, int i8) {
            this.host = str;
            this.port = i8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || h.class != obj.getClass()) {
                return false;
            }
            h hVar = (h) obj;
            return this.port == hVar.port && this.host.equals(hVar.host);
        }

        public int hashCode() {
            return e3.r.hashCode(this.host, Integer.valueOf(this.port));
        }

        public String toString() {
            return e3.p.toStringHelper(this).add("host", this.host).add("port", this.port).toString();
        }
    }

    static {
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", C0709m.TRUE);
        f32422u = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", C0709m.FALSE);
        f32423v = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", C0709m.FALSE);
        f32424w = property3;
        f32425x = Boolean.parseBoolean(property);
        f32426y = Boolean.parseBoolean(property2);
        f32427z = Boolean.parseBoolean(property3);
        f32418A = q(E.class.getClassLoader());
    }

    protected E(String str, String str2, AbstractC5787j0.b bVar, L0.d dVar, C5353C c5353c, boolean z8) {
        e3.w.checkNotNull(bVar, "args");
        this.f32435h = dVar;
        URI uriCreate = URI.create("//" + ((String) e3.w.checkNotNull(str2, "name")));
        e3.w.checkArgument(uriCreate.getHost() != null, "Invalid DNS name: %s", str2);
        this.f32432e = (String) e3.w.checkNotNull(uriCreate.getAuthority(), "nameUri (%s) doesn't have an authority", uriCreate);
        this.f32433f = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.f32434g = bVar.getDefaultPort();
        } else {
            this.f32434g = uriCreate.getPort();
        }
        this.f32428a = (io.grpc.s0) e3.w.checkNotNull(bVar.getProxyDetector(), "proxyDetector");
        this.f32436i = n(z8);
        this.f32438k = (C5353C) e3.w.checkNotNull(c5353c, androidx.core.app.r.CATEGORY_STOPWATCH);
        this.f32437j = (io.grpc.N0) e3.w.checkNotNull(bVar.getSynchronizationContext(), "syncContext");
        Executor offloadExecutor = bVar.getOffloadExecutor();
        this.f32441n = offloadExecutor;
        this.f32442o = offloadExecutor == null;
        this.f32443p = (AbstractC5787j0.h) e3.w.checkNotNull(bVar.getServiceConfigParser(), "serviceConfigParser");
    }

    private boolean h() {
        if (this.f32439l) {
            long j8 = this.f32436i;
            if (j8 != 0 && (j8 <= 0 || this.f32438k.elapsed(TimeUnit.NANOSECONDS) <= this.f32436i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.grpc.C i() {
        io.grpc.r0 r0VarProxyFor = this.f32428a.proxyFor(InetSocketAddress.createUnresolved(this.f32433f, this.f32434g));
        if (r0VarProxyFor != null) {
            return new io.grpc.C(r0VarProxyFor);
        }
        return null;
    }

    private static final List k(Map map) {
        return C5745e0.getListOfStrings(map, "clientLanguage");
    }

    private static final List l(Map map) {
        return C5745e0.getListOfStrings(map, "clientHostname");
    }

    private static String m() {
        if (f32419B == null) {
            try {
                f32419B = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e8) {
                throw new RuntimeException(e8);
            }
        }
        return f32419B;
    }

    private static long n(boolean z8) throws NumberFormatException {
        if (z8) {
            return 0L;
        }
        String property = System.getProperty("networkaddress.cache.ttl");
        long j8 = 30;
        if (property != null) {
            try {
                j8 = Long.parseLong(property);
            } catch (NumberFormatException unused) {
                f32420s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
            }
        }
        return j8 > 0 ? TimeUnit.SECONDS.toNanos(j8) : j8;
    }

    private static final Double o(Map map) {
        return C5745e0.getNumberAsDouble(map, "percentage");
    }

    static g q(ClassLoader classLoader) {
        try {
            try {
                try {
                    g gVar = (g) Class.forName("io.grpc.internal.c0", true, classLoader).asSubclass(g.class).getConstructor(null).newInstance(null);
                    if (gVar.unavailabilityCause() == null) {
                        return gVar;
                    }
                    f32420s.log(Level.FINE, "JndiResourceResolverFactory not available, skipping.", gVar.unavailabilityCause());
                    return null;
                } catch (Exception e8) {
                    f32420s.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e8);
                    return null;
                }
            } catch (Exception e9) {
                f32420s.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e9);
                return null;
            }
        } catch (ClassCastException e10) {
            f32420s.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e10);
            return null;
        } catch (ClassNotFoundException e11) {
            f32420s.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e11);
            return null;
        }
    }

    static Map r(Map map, Random random, String str) {
        for (Map.Entry entry : map.entrySet()) {
            e3.H.verify(f32421t.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List listK = k(map);
        if (listK != null && !listK.isEmpty()) {
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double dO = o(map);
        if (dO != null) {
            int iIntValue = dO.intValue();
            e3.H.verify(iIntValue >= 0 && iIntValue <= 100, "Bad percentage: %s", dO);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List listL = l(map);
        if (listL != null && !listL.isEmpty()) {
            Iterator it2 = listL.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map<String, ?> object = C5745e0.getObject(map, "serviceConfig");
        if (object != null) {
            return object;
        }
        throw new e3.I(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    static AbstractC5787j0.c s(List list, Random random, String str) {
        try {
            Iterator it = t(list).iterator();
            Map mapR = null;
            while (it.hasNext()) {
                try {
                    mapR = r((Map) it.next(), random, str);
                    if (mapR != null) {
                        break;
                    }
                } catch (RuntimeException e8) {
                    return AbstractC5787j0.c.fromError(io.grpc.J0.UNKNOWN.withDescription("failed to pick service config choice").withCause(e8));
                }
            }
            if (mapR == null) {
                return null;
            }
            return AbstractC5787j0.c.fromConfig(mapR);
        } catch (IOException | RuntimeException e9) {
            return AbstractC5787j0.c.fromError(io.grpc.J0.UNKNOWN.withDescription("failed to parse TXT records").withCause(e9));
        }
    }

    static List t(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("grpc_config=")) {
                Object obj = AbstractC5743d0.parse(str.substring(12));
                if (!(obj instanceof List)) {
                    throw new ClassCastException("wrong type " + obj);
                }
                arrayList.addAll(C5745e0.checkObjectList((List) obj));
            } else {
                f32420s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    private void u() {
        if (this.f32444q || this.f32440m || !h()) {
            return;
        }
        this.f32444q = true;
        this.f32441n.execute(new e(this.f32445r));
    }

    private List v() {
        Exception e8 = null;
        try {
            try {
                List<InetAddress> listResolveAddress = this.f32430c.resolveAddress(this.f32433f);
                ArrayList arrayList = new ArrayList(listResolveAddress.size());
                Iterator<InetAddress> it = listResolveAddress.iterator();
                while (it.hasNext()) {
                    arrayList.add(new io.grpc.C(new InetSocketAddress(it.next(), this.f32434g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e9) {
                e8 = e9;
                e3.F.throwIfUnchecked(e8);
                throw new RuntimeException(e8);
            }
        } catch (Throwable th) {
            if (e8 != null) {
                f32420s.log(Level.FINE, "Address resolution failure", (Throwable) e8);
            }
            throw th;
        }
    }

    private AbstractC5787j0.c w() {
        List<String> listEmptyList = Collections.emptyList();
        f fVarP = p();
        if (fVarP != null) {
            try {
                listEmptyList = fVarP.resolveTxt("_grpc_config." + this.f32433f);
            } catch (Exception e8) {
                f32420s.log(Level.FINE, "ServiceConfig resolution failure", (Throwable) e8);
            }
        }
        if (listEmptyList.isEmpty()) {
            f32420s.log(Level.FINE, "No TXT records found for {0}", new Object[]{this.f32433f});
            return null;
        }
        AbstractC5787j0.c cVarS = s(listEmptyList, this.f32429b, m());
        if (cVarS == null) {
            return null;
        }
        if (cVarS.getError() != null) {
            return AbstractC5787j0.c.fromError(cVarS.getError());
        }
        return this.f32443p.parseServiceConfig((Map) cVarS.getConfig());
    }

    protected static boolean x(boolean z8, boolean z9, String str) {
        if (!z8) {
            return false;
        }
        if ("localhost".equalsIgnoreCase(str)) {
            return z9;
        }
        if (str.contains(":")) {
            return false;
        }
        boolean z10 = true;
        for (int i8 = 0; i8 < str.length(); i8++) {
            char cCharAt = str.charAt(i8);
            if (cCharAt != '.') {
                z10 &= cCharAt >= '0' && cCharAt <= '9';
            }
        }
        return true ^ z10;
    }

    @Override // io.grpc.AbstractC5787j0
    public String getServiceAuthority() {
        return this.f32432e;
    }

    protected c j(boolean z8) {
        c cVar = new c();
        try {
            cVar.f32447b = v();
        } catch (Exception e8) {
            if (!z8) {
                cVar.f32446a = io.grpc.J0.UNAVAILABLE.withDescription("Unable to resolve host " + this.f32433f).withCause(e8);
                return cVar;
            }
        }
        if (f32427z) {
            cVar.f32448c = w();
        }
        return cVar;
    }

    protected f p() {
        g gVar;
        if (!x(f32425x, f32426y, this.f32433f)) {
            return null;
        }
        f fVar = (f) this.f32431d.get();
        return (fVar != null || (gVar = f32418A) == null) ? fVar : gVar.newResourceResolver();
    }

    @Override // io.grpc.AbstractC5787j0
    public void refresh() {
        e3.w.checkState(this.f32445r != null, "not started");
        u();
    }

    @Override // io.grpc.AbstractC5787j0
    public void shutdown() {
        if (this.f32440m) {
            return;
        }
        this.f32440m = true;
        Executor executor = this.f32441n;
        if (executor == null || !this.f32442o) {
            return;
        }
        this.f32441n = (Executor) L0.release(this.f32435h, executor);
    }

    @Override // io.grpc.AbstractC5787j0
    public void start(AbstractC5787j0.e eVar) {
        e3.w.checkState(this.f32445r == null, "already started");
        if (this.f32442o) {
            this.f32441n = (Executor) L0.get(this.f32435h);
        }
        this.f32445r = (AbstractC5787j0.e) e3.w.checkNotNull(eVar, "listener");
        u();
    }
}
