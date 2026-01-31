package io.grpc.internal;

import io.grpc.AbstractC5715b;
import io.grpc.AbstractC5719d;
import io.grpc.AbstractC5720d0;
import io.grpc.AbstractC5722e0;
import io.grpc.AbstractC5725g;
import io.grpc.AbstractC5787j0;
import io.grpc.C5713a;
import io.grpc.C5791l0;
import io.grpc.C5801s;
import io.grpc.C5808z;
import io.grpc.InterfaceC5788k;
import io.grpc.internal.G;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* renamed from: io.grpc.internal.k0 */
/* loaded from: classes.dex */
public final class C5758k0 extends AbstractC5722e0 {

    /* renamed from: K */
    private static final Logger f32937K = Logger.getLogger(C5758k0.class.getName());

    /* renamed from: L */
    static final long f32938L = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: M */
    static final long f32939M = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: N */
    private static final InterfaceC5773s0 f32940N = M0.forResource(U.SHARED_CHANNEL_EXECUTOR);

    /* renamed from: O */
    private static final C5808z f32941O = C5808z.getDefaultInstance();

    /* renamed from: P */
    private static final C5801s f32942P = C5801s.getDefaultInstance();

    /* renamed from: A */
    io.grpc.s0 f32943A;

    /* renamed from: B */
    private boolean f32944B;

    /* renamed from: C */
    private boolean f32945C;

    /* renamed from: D */
    private boolean f32946D;

    /* renamed from: E */
    private boolean f32947E;

    /* renamed from: F */
    private boolean f32948F;

    /* renamed from: G */
    private boolean f32949G;

    /* renamed from: H */
    private boolean f32950H;

    /* renamed from: I */
    private final c f32951I;

    /* renamed from: J */
    private final b f32952J;

    /* renamed from: a */
    InterfaceC5773s0 f32953a;

    /* renamed from: b */
    InterfaceC5773s0 f32954b;

    /* renamed from: c */
    private final List f32955c;

    /* renamed from: d */
    final C5791l0 f32956d;

    /* renamed from: e */
    AbstractC5787j0.d f32957e;

    /* renamed from: f */
    final String f32958f;

    /* renamed from: g */
    final AbstractC5725g f32959g;

    /* renamed from: h */
    final AbstractC5719d f32960h;

    /* renamed from: i */
    private final SocketAddress f32961i;

    /* renamed from: j */
    String f32962j;

    /* renamed from: k */
    String f32963k;

    /* renamed from: l */
    String f32964l;

    /* renamed from: m */
    boolean f32965m;

    /* renamed from: n */
    C5808z f32966n;

    /* renamed from: o */
    C5801s f32967o;

    /* renamed from: p */
    long f32968p;

    /* renamed from: q */
    int f32969q;

    /* renamed from: r */
    int f32970r;

    /* renamed from: s */
    long f32971s;

    /* renamed from: t */
    long f32972t;

    /* renamed from: u */
    boolean f32973u;

    /* renamed from: v */
    io.grpc.O f32974v;

    /* renamed from: w */
    int f32975w;

    /* renamed from: x */
    Map f32976x;

    /* renamed from: y */
    boolean f32977y;

    /* renamed from: z */
    AbstractC5715b f32978z;

    /* renamed from: io.grpc.internal.k0$b */
    public interface b {
        int getDefaultPort();
    }

    /* renamed from: io.grpc.internal.k0$c */
    public interface c {
        InterfaceC5778v buildClientTransportFactory();
    }

    /* renamed from: io.grpc.internal.k0$d */
    private static class d extends AbstractC5787j0.d {

        /* renamed from: a */
        final SocketAddress f32979a;

        /* renamed from: b */
        final String f32980b;

        /* renamed from: io.grpc.internal.k0$d$a */
        class a extends AbstractC5787j0 {
            a() {
            }

            @Override // io.grpc.AbstractC5787j0
            public String getServiceAuthority() {
                return d.this.f32980b;
            }

            @Override // io.grpc.AbstractC5787j0
            public void shutdown() {
            }

            @Override // io.grpc.AbstractC5787j0
            public void start(AbstractC5787j0.e eVar) {
                eVar.onResult(AbstractC5787j0.g.newBuilder().setAddresses(Collections.singletonList(new io.grpc.C(d.this.f32979a))).setAttributes(C5713a.EMPTY).build());
            }
        }

        d(SocketAddress socketAddress, String str) {
            this.f32979a = socketAddress;
            this.f32980b = str;
        }

        @Override // io.grpc.AbstractC5787j0.d
        public String getDefaultScheme() {
            return "directaddress";
        }

        @Override // io.grpc.AbstractC5787j0.d
        public AbstractC5787j0 newNameResolver(URI uri, AbstractC5787j0.b bVar) {
            return new a();
        }
    }

    /* renamed from: io.grpc.internal.k0$e */
    public static final class e implements b {

        /* renamed from: a */
        private final int f32982a;

        public e(int i8) {
            this.f32982a = i8;
        }

        @Override // io.grpc.internal.C5758k0.b
        public int getDefaultPort() {
            return this.f32982a;
        }
    }

    /* renamed from: io.grpc.internal.k0$f */
    private static final class f implements b {
        private f() {
        }

        @Override // io.grpc.internal.C5758k0.b
        public int getDefaultPort() {
            return U.DEFAULT_PORT_SSL;
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    public C5758k0(String str, c cVar, b bVar) {
        this(str, null, null, cVar, bVar);
    }

    private static List c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj == null) {
                arrayList.add(null);
            } else if (obj instanceof Map) {
                arrayList.add(d((Map) obj));
            } else if (obj instanceof List) {
                arrayList.add(c((List) obj));
            } else if (obj instanceof String) {
                arrayList.add(obj);
            } else if (obj instanceof Double) {
                arrayList.add(obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("The entry '" + obj + "' is of type '" + obj.getClass() + "', which is not supported");
                }
                arrayList.add(obj);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static Map d(Map map) {
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            e3.w.checkArgument(entry.getKey() instanceof String, "The key of the entry '%s' is not of String type", entry);
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                linkedHashMap.put(str, null);
            } else if (value instanceof Map) {
                linkedHashMap.put(str, d((Map) value));
            } else if (value instanceof List) {
                linkedHashMap.put(str, c((List) value));
            } else if (value instanceof String) {
                linkedHashMap.put(str, value);
            } else if (value instanceof Double) {
                linkedHashMap.put(str, value);
            } else {
                if (!(value instanceof Boolean)) {
                    throw new IllegalArgumentException("The value of the map entry '" + entry + "' is of type '" + value.getClass() + "', which is not supported");
                }
                linkedHashMap.put(str, value);
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public static AbstractC5722e0 forAddress(String str, int i8) {
        throw new UnsupportedOperationException("ClientTransportFactoryBuilder is required, use a constructor");
    }

    public static AbstractC5722e0 forTarget(String str) {
        throw new UnsupportedOperationException("ClientTransportFactoryBuilder is required, use a constructor");
    }

    static String g(SocketAddress socketAddress) {
        try {
            return new URI("directaddress", "", "/" + socketAddress, null).toString();
        } catch (URISyntaxException e8) {
            throw new RuntimeException(e8);
        }
    }

    String b(String str) {
        return this.f32944B ? str : U.checkAuthority(str);
    }

    @Override // io.grpc.AbstractC5722e0
    public AbstractC5720d0 build() {
        return new C5760l0(new C5755j0(this, this.f32951I.buildClientTransportFactory(), new G.a(), M0.forResource(U.SHARED_CHANNEL_EXECUTOR), U.STOPWATCH_SUPPLIER, f(), S0.SYSTEM_TIME_PROVIDER));
    }

    @Override // io.grpc.AbstractC5722e0
    public /* bridge */ /* synthetic */ AbstractC5722e0 defaultServiceConfig(Map map) {
        return defaultServiceConfig((Map<String, ?>) map);
    }

    public C5758k0 disableCheckAuthority() {
        this.f32944B = true;
        return this;
    }

    int e() {
        return this.f32952J.getDefaultPort();
    }

    public C5758k0 enableCheckAuthority() {
        this.f32944B = false;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.util.List f() throws java.lang.ClassNotFoundException {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r11.f32955c
            r0.<init>(r1)
            java.util.List r1 = io.grpc.S.getClientInterceptors()
            r2 = 0
            if (r1 == 0) goto L13
            r0.addAll(r1)
            r1 = 1
            goto L14
        L13:
            r1 = r2
        L14:
            java.lang.String r3 = "getClientInterceptor"
            r4 = 0
            java.lang.String r5 = "Unable to apply census stats"
            if (r1 != 0) goto L7f
            boolean r6 = r11.f32945C
            if (r6 == 0) goto L7f
            java.lang.String r6 = "io.grpc.census.InternalCensusStatsAccessor"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L56 java.lang.ClassNotFoundException -> L58
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L56 java.lang.ClassNotFoundException -> L58
            java.lang.Class[] r7 = new java.lang.Class[]{r7, r7, r7, r7}     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L56 java.lang.ClassNotFoundException -> L58
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r3, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L56 java.lang.ClassNotFoundException -> L58
            boolean r7 = r11.f32946D     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L56 java.lang.ClassNotFoundException -> L58
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L56 java.lang.ClassNotFoundException -> L58
            boolean r8 = r11.f32947E     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L56 java.lang.ClassNotFoundException -> L58
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L56 java.lang.ClassNotFoundException -> L58
            boolean r9 = r11.f32948F     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L56 java.lang.ClassNotFoundException -> L58
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L56 java.lang.ClassNotFoundException -> L58
            boolean r10 = r11.f32949G     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L56 java.lang.ClassNotFoundException -> L58
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L56 java.lang.ClassNotFoundException -> L58
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r8, r9, r10}     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L56 java.lang.ClassNotFoundException -> L58
            java.lang.Object r6 = r6.invoke(r4, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L56 java.lang.ClassNotFoundException -> L58
            io.grpc.k r6 = (io.grpc.InterfaceC5788k) r6     // Catch: java.lang.reflect.InvocationTargetException -> L52 java.lang.IllegalAccessException -> L54 java.lang.NoSuchMethodException -> L56 java.lang.ClassNotFoundException -> L58
            goto L7a
        L52:
            r6 = move-exception
            goto L5a
        L54:
            r6 = move-exception
            goto L62
        L56:
            r6 = move-exception
            goto L6a
        L58:
            r6 = move-exception
            goto L72
        L5a:
            java.util.logging.Logger r7 = io.grpc.internal.C5758k0.f32937K
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            r7.log(r8, r5, r6)
            goto L79
        L62:
            java.util.logging.Logger r7 = io.grpc.internal.C5758k0.f32937K
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            r7.log(r8, r5, r6)
            goto L79
        L6a:
            java.util.logging.Logger r7 = io.grpc.internal.C5758k0.f32937K
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            r7.log(r8, r5, r6)
            goto L79
        L72:
            java.util.logging.Logger r7 = io.grpc.internal.C5758k0.f32937K
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            r7.log(r8, r5, r6)
        L79:
            r6 = r4
        L7a:
            if (r6 == 0) goto L7f
            r0.add(r2, r6)
        L7f:
            if (r1 != 0) goto Lc3
            boolean r1 = r11.f32950H
            if (r1 == 0) goto Lc3
            java.lang.String r1 = "io.grpc.census.InternalCensusTracingAccessor"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L97 java.lang.IllegalAccessException -> L99 java.lang.NoSuchMethodException -> L9b java.lang.ClassNotFoundException -> L9d
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L97 java.lang.IllegalAccessException -> L99 java.lang.NoSuchMethodException -> L9b java.lang.ClassNotFoundException -> L9d
            java.lang.Object r1 = r1.invoke(r4, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L97 java.lang.IllegalAccessException -> L99 java.lang.NoSuchMethodException -> L9b java.lang.ClassNotFoundException -> L9d
            io.grpc.k r1 = (io.grpc.InterfaceC5788k) r1     // Catch: java.lang.reflect.InvocationTargetException -> L97 java.lang.IllegalAccessException -> L99 java.lang.NoSuchMethodException -> L9b java.lang.ClassNotFoundException -> L9d
            r4 = r1
            goto Lbe
        L97:
            r1 = move-exception
            goto L9f
        L99:
            r1 = move-exception
            goto La7
        L9b:
            r1 = move-exception
            goto Laf
        L9d:
            r1 = move-exception
            goto Lb7
        L9f:
            java.util.logging.Logger r3 = io.grpc.internal.C5758k0.f32937K
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            r3.log(r6, r5, r1)
            goto Lbe
        La7:
            java.util.logging.Logger r3 = io.grpc.internal.C5758k0.f32937K
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            r3.log(r6, r5, r1)
            goto Lbe
        Laf:
            java.util.logging.Logger r3 = io.grpc.internal.C5758k0.f32937K
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            r3.log(r6, r5, r1)
            goto Lbe
        Lb7:
            java.util.logging.Logger r3 = io.grpc.internal.C5758k0.f32937K
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            r3.log(r6, r5, r1)
        Lbe:
            if (r4 == 0) goto Lc3
            r0.add(r2, r4)
        Lc3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.C5758k0.f():java.util.List");
    }

    public InterfaceC5773s0 getOffloadExecutorPool() {
        return this.f32954b;
    }

    @Override // io.grpc.AbstractC5722e0
    public /* bridge */ /* synthetic */ AbstractC5722e0 intercept(List list) {
        return intercept((List<InterfaceC5788k>) list);
    }

    public void setStatsEnabled(boolean z8) {
        this.f32945C = z8;
    }

    public void setStatsRecordFinishedRpcs(boolean z8) {
        this.f32947E = z8;
    }

    public void setStatsRecordRealTimeMetrics(boolean z8) {
        this.f32948F = z8;
    }

    public void setStatsRecordRetryMetrics(boolean z8) {
        this.f32949G = z8;
    }

    public void setStatsRecordStartedRpcs(boolean z8) {
        this.f32946D = z8;
    }

    public void setTracingEnabled(boolean z8) {
        this.f32950H = z8;
    }

    public C5758k0(String str, AbstractC5725g abstractC5725g, AbstractC5719d abstractC5719d, c cVar, b bVar) {
        InterfaceC5773s0 interfaceC5773s0 = f32940N;
        this.f32953a = interfaceC5773s0;
        this.f32954b = interfaceC5773s0;
        this.f32955c = new ArrayList();
        C5791l0 defaultRegistry = C5791l0.getDefaultRegistry();
        this.f32956d = defaultRegistry;
        this.f32957e = defaultRegistry.asFactory();
        this.f32964l = U.DEFAULT_LB_POLICY;
        this.f32966n = f32941O;
        this.f32967o = f32942P;
        this.f32968p = f32938L;
        this.f32969q = 5;
        this.f32970r = 5;
        this.f32971s = 16777216L;
        this.f32972t = 1048576L;
        this.f32973u = true;
        this.f32974v = io.grpc.O.instance();
        this.f32977y = true;
        this.f32945C = true;
        this.f32946D = true;
        this.f32947E = true;
        this.f32948F = false;
        this.f32949G = true;
        this.f32950H = true;
        this.f32958f = (String) e3.w.checkNotNull(str, "target");
        this.f32959g = abstractC5725g;
        this.f32960h = abstractC5719d;
        this.f32951I = (c) e3.w.checkNotNull(cVar, "clientTransportFactoryBuilder");
        this.f32961i = null;
        if (bVar != null) {
            this.f32952J = bVar;
        } else {
            this.f32952J = new f();
        }
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 compressorRegistry(C5801s c5801s) {
        if (c5801s != null) {
            this.f32967o = c5801s;
        } else {
            this.f32967o = f32942P;
        }
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 decompressorRegistry(C5808z c5808z) {
        if (c5808z != null) {
            this.f32966n = c5808z;
        } else {
            this.f32966n = f32941O;
        }
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 defaultLoadBalancingPolicy(String str) {
        SocketAddress socketAddress = this.f32961i;
        e3.w.checkState(socketAddress == null, "directServerAddress is set (%s), which forbids the use of load-balancing policy", socketAddress);
        e3.w.checkArgument(str != null, "policy cannot be null");
        this.f32964l = str;
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 defaultServiceConfig(Map<String, ?> map) {
        this.f32976x = d(map);
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 directExecutor() {
        return executor(com.google.common.util.concurrent.H.directExecutor());
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 disableRetry() {
        this.f32973u = false;
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 disableServiceConfigLookUp() {
        this.f32977y = false;
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 enableFullStreamDecompression() {
        this.f32965m = true;
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 enableRetry() {
        this.f32973u = true;
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 executor(Executor executor) {
        if (executor != null) {
            this.f32953a = new J(executor);
        } else {
            this.f32953a = f32940N;
        }
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 idleTimeout(long j8, TimeUnit timeUnit) {
        e3.w.checkArgument(j8 > 0, "idle timeout is %s, but must be positive", j8);
        if (timeUnit.toDays(j8) >= 30) {
            this.f32968p = -1L;
        } else {
            this.f32968p = Math.max(timeUnit.toMillis(j8), f32939M);
        }
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 maxHedgedAttempts(int i8) {
        this.f32970r = i8;
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 maxRetryAttempts(int i8) {
        this.f32969q = i8;
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 maxTraceEvents(int i8) {
        e3.w.checkArgument(i8 >= 0, "maxTraceEvents must be non-negative");
        this.f32975w = i8;
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    @Deprecated
    public C5758k0 nameResolverFactory(AbstractC5787j0.d dVar) {
        SocketAddress socketAddress = this.f32961i;
        e3.w.checkState(socketAddress == null, "directServerAddress is set (%s), which forbids the use of NameResolverFactory", socketAddress);
        if (dVar != null) {
            this.f32957e = dVar;
        } else {
            this.f32957e = this.f32956d.asFactory();
        }
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 offloadExecutor(Executor executor) {
        if (executor != null) {
            this.f32954b = new J(executor);
        } else {
            this.f32954b = f32940N;
        }
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 overrideAuthority(String str) {
        this.f32963k = b(str);
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 perRpcBufferLimit(long j8) {
        e3.w.checkArgument(j8 > 0, "per RPC buffer limit must be positive");
        this.f32972t = j8;
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 proxyDetector(io.grpc.s0 s0Var) {
        this.f32943A = s0Var;
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 retryBufferSize(long j8) {
        e3.w.checkArgument(j8 > 0, "retry buffer size must be positive");
        this.f32971s = j8;
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 setBinaryLog(AbstractC5715b abstractC5715b) {
        this.f32978z = abstractC5715b;
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 userAgent(String str) {
        this.f32962j = str;
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 intercept(List<InterfaceC5788k> list) {
        this.f32955c.addAll(list);
        return this;
    }

    @Override // io.grpc.AbstractC5722e0
    public C5758k0 intercept(InterfaceC5788k... interfaceC5788kArr) {
        return intercept(Arrays.asList(interfaceC5788kArr));
    }

    public C5758k0(SocketAddress socketAddress, String str, c cVar, b bVar) {
        this(socketAddress, str, null, null, cVar, bVar);
    }

    public C5758k0(SocketAddress socketAddress, String str, AbstractC5725g abstractC5725g, AbstractC5719d abstractC5719d, c cVar, b bVar) {
        InterfaceC5773s0 interfaceC5773s0 = f32940N;
        this.f32953a = interfaceC5773s0;
        this.f32954b = interfaceC5773s0;
        this.f32955c = new ArrayList();
        C5791l0 defaultRegistry = C5791l0.getDefaultRegistry();
        this.f32956d = defaultRegistry;
        this.f32957e = defaultRegistry.asFactory();
        this.f32964l = U.DEFAULT_LB_POLICY;
        this.f32966n = f32941O;
        this.f32967o = f32942P;
        this.f32968p = f32938L;
        this.f32969q = 5;
        this.f32970r = 5;
        this.f32971s = 16777216L;
        this.f32972t = 1048576L;
        this.f32973u = true;
        this.f32974v = io.grpc.O.instance();
        this.f32977y = true;
        this.f32945C = true;
        this.f32946D = true;
        this.f32947E = true;
        this.f32948F = false;
        this.f32949G = true;
        this.f32950H = true;
        this.f32958f = g(socketAddress);
        this.f32959g = abstractC5725g;
        this.f32960h = abstractC5719d;
        this.f32951I = (c) e3.w.checkNotNull(cVar, "clientTransportFactoryBuilder");
        this.f32961i = socketAddress;
        this.f32957e = new d(socketAddress, str);
        if (bVar != null) {
            this.f32952J = bVar;
        } else {
            this.f32952J = new f();
        }
    }
}
