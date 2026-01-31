package io.grpc.internal;

import e3.C5352B;
import e3.C5353C;
import e3.InterfaceC5355E;
import io.grpc.AbstractC5714a0;
import io.grpc.AbstractC5794n;
import io.grpc.C5721e;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import io.grpc.J0;
import io.grpc.V;
import io.grpc.internal.InterfaceC5774t;
import io.grpc.internal.InterfaceC5776u;
import io.grpc.internal.L0;
import io.grpc.internal.Q0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class U {
    public static final C5352B ACCEPT_ENCODING_SPLITTER;
    public static final C5721e.c CALL_OPTIONS_RPC_OWNED_BY_BALANCER;
    public static final String CONTENT_ACCEPT_ENCODING = "accept-encoding";
    public static final C5728h0.i CONTENT_ACCEPT_ENCODING_KEY;
    public static final String CONTENT_ENCODING = "content-encoding";
    public static final C5728h0.i CONTENT_ENCODING_KEY;
    public static final String CONTENT_TYPE_GRPC = "application/grpc";
    public static final C5728h0.i CONTENT_TYPE_KEY;
    public static final long DEFAULT_KEEPALIVE_TIMEOUT_NANOS;
    public static final String DEFAULT_LB_POLICY = "pick_first";
    public static final int DEFAULT_MAX_HEADER_LIST_SIZE = 8192;
    public static final int DEFAULT_MAX_MESSAGE_SIZE = 4194304;
    public static final int DEFAULT_PORT_PLAINTEXT = 80;
    public static final int DEFAULT_PORT_SSL = 443;
    public static final io.grpc.s0 DEFAULT_PROXY_DETECTOR;
    public static final long DEFAULT_SERVER_KEEPALIVE_TIMEOUT_NANOS;
    public static final long DEFAULT_SERVER_KEEPALIVE_TIME_NANOS;
    public static final String HTTP_METHOD = "POST";
    public static final long KEEPALIVE_TIME_NANOS_DISABLED = Long.MAX_VALUE;
    public static final String MESSAGE_ACCEPT_ENCODING = "grpc-accept-encoding";
    public static final C5728h0.i MESSAGE_ACCEPT_ENCODING_KEY;
    public static final String MESSAGE_ENCODING = "grpc-encoding";
    public static final C5728h0.i MESSAGE_ENCODING_KEY;
    public static final io.grpc.s0 NOOP_PROXY_DETECTOR;
    public static final long SERVER_KEEPALIVE_TIME_NANOS_DISABLED = Long.MAX_VALUE;
    public static final L0.d SHARED_CHANNEL_EXECUTOR;
    public static final InterfaceC5355E STOPWATCH_SUPPLIER;
    public static final C5728h0.i TE_HEADER;
    public static final String TE_TRAILERS = "trailers";
    public static final L0.d TIMER_SERVICE;
    public static final C5728h0.i USER_AGENT_KEY;

    /* renamed from: c */
    static final C5728h0.i f32534c;

    /* renamed from: d */
    private static final AbstractC5794n f32535d;

    /* renamed from: a */
    private static final Logger f32532a = Logger.getLogger(U.class.getName());

    /* renamed from: b */
    private static final Set f32533b = Collections.unmodifiableSet(EnumSet.of(J0.b.OK, J0.b.INVALID_ARGUMENT, J0.b.NOT_FOUND, J0.b.ALREADY_EXISTS, J0.b.FAILED_PRECONDITION, J0.b.ABORTED, J0.b.OUT_OF_RANGE, J0.b.DATA_LOSS));
    public static final Charset US_ASCII = Charset.forName("US-ASCII");
    public static final String TIMEOUT = "grpc-timeout";
    public static final C5728h0.i TIMEOUT_KEY = C5728h0.i.of(TIMEOUT, new j());

    class a implements io.grpc.s0 {
        a() {
        }

        @Override // io.grpc.s0
        public io.grpc.r0 proxyFor(SocketAddress socketAddress) {
            return null;
        }
    }

    class b extends AbstractC5794n {
        b() {
        }
    }

    class c implements L0.d {
        c() {
        }

        public String toString() {
            return "grpc-default-executor";
        }

        @Override // io.grpc.internal.L0.d
        public void close(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.internal.L0.d
        public Executor create() {
            return Executors.newCachedThreadPool(U.getThreadFactory("grpc-default-executor-%d", true));
        }
    }

    class d implements L0.d {
        d() {
        }

        @Override // io.grpc.internal.L0.d
        public void close(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }

        @Override // io.grpc.internal.L0.d
        public ScheduledExecutorService create() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, U.getThreadFactory("grpc-timer-%d", true));
            try {
                scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e8) {
                throw e8;
            } catch (Exception e9) {
                throw new RuntimeException(e9);
            }
            return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
        }
    }

    class e implements InterfaceC5355E {
        e() {
        }

        @Override // e3.InterfaceC5355E
        public C5353C get() {
            return C5353C.createUnstarted();
        }
    }

    class f implements InterfaceC5776u {

        /* renamed from: a */
        final /* synthetic */ AbstractC5794n.a f32536a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC5776u f32537b;

        f(AbstractC5794n.a aVar, InterfaceC5776u interfaceC5776u) {
            this.f32536a = aVar;
            this.f32537b = interfaceC5776u;
        }

        @Override // io.grpc.internal.InterfaceC5776u, io.grpc.T, io.grpc.Y
        public io.grpc.U getLogId() {
            return this.f32537b.getLogId();
        }

        @Override // io.grpc.internal.InterfaceC5776u, io.grpc.T
        public com.google.common.util.concurrent.C getStats() {
            return this.f32537b.getStats();
        }

        @Override // io.grpc.internal.InterfaceC5776u
        public InterfaceC5772s newStream(C5730i0 c5730i0, C5728h0 c5728h0, C5721e c5721e, AbstractC5794n[] abstractC5794nArr) {
            AbstractC5794n abstractC5794nNewClientStreamTracer = this.f32536a.newClientStreamTracer(AbstractC5794n.b.newBuilder().setCallOptions(c5721e).build(), c5728h0);
            e3.w.checkState(abstractC5794nArr[abstractC5794nArr.length - 1] == U.f32535d, "lb tracer already assigned");
            abstractC5794nArr[abstractC5794nArr.length - 1] = abstractC5794nNewClientStreamTracer;
            return this.f32537b.newStream(c5730i0, c5728h0, c5721e, abstractC5794nArr);
        }

        @Override // io.grpc.internal.InterfaceC5776u
        public void ping(InterfaceC5776u.a aVar, Executor executor) {
            this.f32537b.ping(aVar, executor);
        }
    }

    private static final class g implements V.a {
        private g() {
        }

        @Override // io.grpc.V.a, io.grpc.C5728h0.m
        public byte[] parseAsciiString(byte[] bArr) {
            return bArr;
        }

        @Override // io.grpc.V.a, io.grpc.C5728h0.m
        public byte[] toAsciiString(byte[] bArr) {
            return bArr;
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    public static final class h {

        /* renamed from: a */
        private final String f32538a;

        /* renamed from: b */
        private final String f32539b;

        /* synthetic */ h(String str, String str2, a aVar) {
            this(str, str2);
        }

        public String getImplementationVersion() {
            return this.f32539b;
        }

        public String getUserAgent() {
            return this.f32538a;
        }

        public String toString() {
            return this.f32538a + Q7.X.SPACE + this.f32539b;
        }

        private h(String str, String str2) {
            this.f32538a = (String) e3.w.checkNotNull(str, "userAgentName");
            this.f32539b = (String) e3.w.checkNotNull(str2, "implementationVersion");
        }
    }

    public static final class i extends Enum {
        public static final i CANCEL;
        public static final i COMPRESSION_ERROR;
        public static final i CONNECT_ERROR;
        public static final i ENHANCE_YOUR_CALM;
        public static final i FLOW_CONTROL_ERROR;
        public static final i FRAME_SIZE_ERROR;
        public static final i HTTP_1_1_REQUIRED;
        public static final i INADEQUATE_SECURITY;
        public static final i INTERNAL_ERROR;
        public static final i NO_ERROR;
        public static final i PROTOCOL_ERROR;
        public static final i REFUSED_STREAM;
        public static final i SETTINGS_TIMEOUT;
        public static final i STREAM_CLOSED;

        /* renamed from: c */
        private static final i[] f32540c;

        /* renamed from: d */
        private static final /* synthetic */ i[] f32541d;

        /* renamed from: a */
        private final int f32542a;

        /* renamed from: b */
        private final io.grpc.J0 f32543b;

        static {
            io.grpc.J0 j02 = io.grpc.J0.UNAVAILABLE;
            i iVar = new i("NO_ERROR", 0, 0, j02);
            NO_ERROR = iVar;
            io.grpc.J0 j03 = io.grpc.J0.INTERNAL;
            i iVar2 = new i("PROTOCOL_ERROR", 1, 1, j03);
            PROTOCOL_ERROR = iVar2;
            i iVar3 = new i("INTERNAL_ERROR", 2, 2, j03);
            INTERNAL_ERROR = iVar3;
            i iVar4 = new i("FLOW_CONTROL_ERROR", 3, 3, j03);
            FLOW_CONTROL_ERROR = iVar4;
            i iVar5 = new i("SETTINGS_TIMEOUT", 4, 4, j03);
            SETTINGS_TIMEOUT = iVar5;
            i iVar6 = new i("STREAM_CLOSED", 5, 5, j03);
            STREAM_CLOSED = iVar6;
            i iVar7 = new i("FRAME_SIZE_ERROR", 6, 6, j03);
            FRAME_SIZE_ERROR = iVar7;
            i iVar8 = new i("REFUSED_STREAM", 7, 7, j02);
            REFUSED_STREAM = iVar8;
            i iVar9 = new i("CANCEL", 8, 8, io.grpc.J0.CANCELLED);
            CANCEL = iVar9;
            i iVar10 = new i("COMPRESSION_ERROR", 9, 9, j03);
            COMPRESSION_ERROR = iVar10;
            i iVar11 = new i("CONNECT_ERROR", 10, 10, j03);
            CONNECT_ERROR = iVar11;
            i iVar12 = new i("ENHANCE_YOUR_CALM", 11, 11, io.grpc.J0.RESOURCE_EXHAUSTED.withDescription("Bandwidth exhausted"));
            ENHANCE_YOUR_CALM = iVar12;
            i iVar13 = new i("INADEQUATE_SECURITY", 12, 12, io.grpc.J0.PERMISSION_DENIED.withDescription("Permission denied as protocol is not secure enough to call"));
            INADEQUATE_SECURITY = iVar13;
            i iVar14 = new i("HTTP_1_1_REQUIRED", 13, 13, io.grpc.J0.UNKNOWN);
            HTTP_1_1_REQUIRED = iVar14;
            f32541d = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14};
            f32540c = a();
        }

        private i(String str, int i8, int i9, io.grpc.J0 j02) {
            super(str, i8);
            this.f32542a = i9;
            String str2 = "HTTP/2 error code: " + name();
            if (j02.getDescription() != null) {
                str2 = str2 + " (" + j02.getDescription() + ")";
            }
            this.f32543b = j02.withDescription(str2);
        }

        private static i[] a() {
            i[] iVarArrValues = values();
            i[] iVarArr = new i[((int) iVarArrValues[iVarArrValues.length - 1].code()) + 1];
            for (i iVar : iVarArrValues) {
                iVarArr[(int) iVar.code()] = iVar;
            }
            return iVarArr;
        }

        public static i forCode(long j8) {
            i[] iVarArr = f32540c;
            if (j8 >= iVarArr.length || j8 < 0) {
                return null;
            }
            return iVarArr[(int) j8];
        }

        public static io.grpc.J0 statusForCode(long j8) {
            i iVarForCode = forCode(j8);
            if (iVarForCode != null) {
                return iVarForCode.status();
            }
            return io.grpc.J0.fromCodeValue(INTERNAL_ERROR.status().getCode().value()).withDescription("Unrecognized HTTP/2 error code: " + j8);
        }

        public static i valueOf(String str) {
            return (i) Enum.valueOf(i.class, str);
        }

        public static i[] values() {
            return (i[]) f32541d.clone();
        }

        public long code() {
            return this.f32542a;
        }

        public io.grpc.J0 status() {
            return this.f32543b;
        }
    }

    static class j implements C5728h0.d {
        j() {
        }

        @Override // io.grpc.C5728h0.d
        public Long parseAsciiString(String str) throws NumberFormatException {
            e3.w.checkArgument(str.length() > 0, "empty timeout");
            e3.w.checkArgument(str.length() <= 9, "bad timeout format");
            long j8 = Long.parseLong(str.substring(0, str.length() - 1));
            char cCharAt = str.charAt(str.length() - 1);
            if (cCharAt == 'H') {
                return Long.valueOf(TimeUnit.HOURS.toNanos(j8));
            }
            if (cCharAt == 'M') {
                return Long.valueOf(TimeUnit.MINUTES.toNanos(j8));
            }
            if (cCharAt == 'S') {
                return Long.valueOf(TimeUnit.SECONDS.toNanos(j8));
            }
            if (cCharAt == 'u') {
                return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j8));
            }
            if (cCharAt == 'm') {
                return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j8));
            }
            if (cCharAt == 'n') {
                return Long.valueOf(j8);
            }
            throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(cCharAt)));
        }

        @Override // io.grpc.C5728h0.d
        public String toAsciiString(Long l8) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l8.longValue() < 0) {
                throw new IllegalArgumentException("Timeout too small");
            }
            if (l8.longValue() < 100000000) {
                return l8 + "n";
            }
            if (l8.longValue() < 100000000000L) {
                return timeUnit.toMicros(l8.longValue()) + "u";
            }
            if (l8.longValue() < 100000000000000L) {
                return timeUnit.toMillis(l8.longValue()) + "m";
            }
            if (l8.longValue() < 100000000000000000L) {
                return timeUnit.toSeconds(l8.longValue()) + "S";
            }
            if (l8.longValue() < 6000000000000000000L) {
                return timeUnit.toMinutes(l8.longValue()) + "M";
            }
            return timeUnit.toHours(l8.longValue()) + "H";
        }
    }

    static {
        C5728h0.d dVar = C5728h0.ASCII_STRING_MARSHALLER;
        MESSAGE_ENCODING_KEY = C5728h0.i.of(MESSAGE_ENCODING, dVar);
        MESSAGE_ACCEPT_ENCODING_KEY = io.grpc.V.keyOf(MESSAGE_ACCEPT_ENCODING, new g(null));
        CONTENT_ENCODING_KEY = C5728h0.i.of(CONTENT_ENCODING, dVar);
        CONTENT_ACCEPT_ENCODING_KEY = io.grpc.V.keyOf(CONTENT_ACCEPT_ENCODING, new g(null));
        f32534c = C5728h0.i.of("content-length", dVar);
        CONTENT_TYPE_KEY = C5728h0.i.of("content-type", dVar);
        TE_HEADER = C5728h0.i.of("te", dVar);
        USER_AGENT_KEY = C5728h0.i.of("user-agent", dVar);
        ACCEPT_ENCODING_SPLITTER = C5352B.on(',').trimResults();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        DEFAULT_KEEPALIVE_TIMEOUT_NANOS = timeUnit.toNanos(20L);
        DEFAULT_SERVER_KEEPALIVE_TIME_NANOS = TimeUnit.HOURS.toNanos(2L);
        DEFAULT_SERVER_KEEPALIVE_TIMEOUT_NANOS = timeUnit.toNanos(20L);
        DEFAULT_PROXY_DETECTOR = new C5783x0();
        NOOP_PROXY_DETECTOR = new a();
        CALL_OPTIONS_RPC_OWNED_BY_BALANCER = C5721e.c.create("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        f32535d = new b();
        SHARED_CHANNEL_EXECUTOR = new c();
        TIMER_SERVICE = new d();
        STOPWATCH_SUPPLIER = new e();
    }

    public static String authorityFromHostAndPort(String str, int i8) {
        try {
            return new URI(null, null, str, i8, null, null, null).getAuthority();
        } catch (URISyntaxException e8) {
            throw new IllegalArgumentException("Invalid host or port: " + str + Q7.X.SPACE + i8, e8);
        }
    }

    public static URI authorityToUri(String str) {
        e3.w.checkNotNull(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e8) {
            throw new IllegalArgumentException("Invalid authority: " + str, e8);
        }
    }

    static void b(Q0.a aVar) throws IOException {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            } else {
                closeQuietly(next);
            }
        }
    }

    static InterfaceC5776u c(AbstractC5714a0.e eVar, boolean z8) {
        AbstractC5714a0.h subchannel = eVar.getSubchannel();
        InterfaceC5776u interfaceC5776uObtainActiveTransport = subchannel != null ? ((U0) subchannel.getInternalSubchannel()).obtainActiveTransport() : null;
        if (interfaceC5776uObtainActiveTransport != null) {
            AbstractC5794n.a streamTracerFactory = eVar.getStreamTracerFactory();
            return streamTracerFactory == null ? interfaceC5776uObtainActiveTransport : new f(streamTracerFactory, interfaceC5776uObtainActiveTransport);
        }
        if (!eVar.getStatus().isOk()) {
            if (eVar.isDrop()) {
                return new I(replaceInappropriateControlPlaneStatus(eVar.getStatus()), InterfaceC5774t.a.DROPPED);
            }
            if (!z8) {
                return new I(replaceInappropriateControlPlaneStatus(eVar.getStatus()), InterfaceC5774t.a.PROCESSED);
            }
        }
        return null;
    }

    public static String checkAuthority(String str) {
        URI uriAuthorityToUri = authorityToUri(str);
        e3.w.checkArgument(uriAuthorityToUri.getHost() != null, "No host in authority '%s'", str);
        e3.w.checkArgument(uriAuthorityToUri.getUserInfo() == null, "Userinfo must not be present on authority: '%s'", str);
        return str;
    }

    public static void closeQuietly(Closeable closeable) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e8) {
            f32532a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e8);
        }
    }

    private static J0.b d(int i8) {
        if (i8 >= 100 && i8 < 200) {
            return J0.b.INTERNAL;
        }
        if (i8 != 400) {
            if (i8 == 401) {
                return J0.b.UNAUTHENTICATED;
            }
            if (i8 == 403) {
                return J0.b.PERMISSION_DENIED;
            }
            if (i8 == 404) {
                return J0.b.UNIMPLEMENTED;
            }
            if (i8 != 429) {
                if (i8 != 431) {
                    switch (i8) {
                        case GRPC_IDR_ERROR_VALUE:
                        case GRPC_TTS_ERROR_VALUE:
                        case GRPC_AUTH_SIGN_IN_ERROR_VALUE:
                            break;
                        default:
                            return J0.b.UNKNOWN;
                    }
                }
            }
            return J0.b.UNAVAILABLE;
        }
        return J0.b.INTERNAL;
    }

    public static void exhaust(InputStream inputStream) {
        while (inputStream.read(new byte[256]) != -1) {
        }
    }

    public static AbstractC5794n[] getClientStreamTracers(C5721e c5721e, C5728h0 c5728h0, int i8, boolean z8) {
        List<AbstractC5794n.a> streamTracerFactories = c5721e.getStreamTracerFactories();
        int size = streamTracerFactories.size();
        AbstractC5794n[] abstractC5794nArr = new AbstractC5794n[size + 1];
        AbstractC5794n.b bVarBuild = AbstractC5794n.b.newBuilder().setCallOptions(c5721e).setPreviousAttempts(i8).setIsTransparentRetry(z8).build();
        for (int i9 = 0; i9 < streamTracerFactories.size(); i9++) {
            abstractC5794nArr[i9] = streamTracerFactories.get(i9).newClientStreamTracer(bVarBuild, c5728h0);
        }
        abstractC5794nArr[size] = f32535d;
        return abstractC5794nArr;
    }

    public static h getGrpcBuildVersion() {
        return new h("gRPC Java", "1.57.0", null);
    }

    public static String getGrpcUserAgent(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append('/');
        sb.append("1.57.0");
        return sb.toString();
    }

    public static String getHost(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static ThreadFactory getThreadFactory(String str, boolean z8) {
        return new com.google.common.util.concurrent.N().setDaemon(z8).setNameFormat(str).build();
    }

    public static io.grpc.J0 httpStatusToGrpcStatus(int i8) {
        return d(i8).toStatus().withDescription("HTTP status code " + i8);
    }

    public static boolean isGrpcContentType(String str) {
        if (str == null || 16 > str.length()) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if (!lowerCase.startsWith(CONTENT_TYPE_GRPC)) {
            return false;
        }
        if (lowerCase.length() == 16) {
            return true;
        }
        char cCharAt = lowerCase.charAt(16);
        return cCharAt == '+' || cCharAt == ';';
    }

    public static io.grpc.J0 replaceInappropriateControlPlaneStatus(io.grpc.J0 j02) {
        e3.w.checkArgument(j02 != null);
        if (!f32533b.contains(j02.getCode())) {
            return j02;
        }
        return io.grpc.J0.INTERNAL.withDescription("Inappropriate status code from control plane: " + j02.getCode() + Q7.X.SPACE + j02.getDescription()).withCause(j02.getCause());
    }

    public static boolean shouldBeCountedForInUse(C5721e c5721e) {
        return !Boolean.TRUE.equals(c5721e.getOption(CALL_OPTIONS_RPC_OWNED_BY_BALANCER));
    }
}
