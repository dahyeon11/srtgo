package io.grpc;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: io.grpc.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5730i0 {

    /* renamed from: a, reason: collision with root package name */
    private final d f32150a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32151b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32152c;

    /* renamed from: d, reason: collision with root package name */
    private final c f32153d;

    /* renamed from: e, reason: collision with root package name */
    private final c f32154e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f32155f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f32156g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f32157h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f32158i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReferenceArray f32159j;

    /* renamed from: io.grpc.i0$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private c f32160a;

        /* renamed from: b, reason: collision with root package name */
        private c f32161b;

        /* renamed from: c, reason: collision with root package name */
        private d f32162c;

        /* renamed from: d, reason: collision with root package name */
        private String f32163d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f32164e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f32165f;

        /* renamed from: g, reason: collision with root package name */
        private Object f32166g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f32167h;

        public C5730i0 build() {
            return new C5730i0(this.f32162c, this.f32163d, this.f32160a, this.f32161b, this.f32166g, this.f32164e, this.f32165f, this.f32167h);
        }

        public b setFullMethodName(String str) {
            this.f32163d = str;
            return this;
        }

        public b setIdempotent(boolean z8) {
            this.f32164e = z8;
            if (!z8) {
                this.f32165f = false;
            }
            return this;
        }

        public b setRequestMarshaller(c cVar) {
            this.f32160a = cVar;
            return this;
        }

        public b setResponseMarshaller(c cVar) {
            this.f32161b = cVar;
            return this;
        }

        public b setSafe(boolean z8) {
            this.f32165f = z8;
            if (z8) {
                this.f32164e = true;
            }
            return this;
        }

        public b setSampledToLocalTracing(boolean z8) {
            this.f32167h = z8;
            return this;
        }

        public b setSchemaDescriptor(Object obj) {
            this.f32166g = obj;
            return this;
        }

        public b setType(d dVar) {
            this.f32162c = dVar;
            return this;
        }

        private b() {
        }
    }

    /* renamed from: io.grpc.i0$c */
    public interface c {
        Object parse(InputStream inputStream);

        InputStream stream(Object obj);
    }

    /* renamed from: io.grpc.i0$d */
    public enum d {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN;

        public final boolean clientSendsOneMessage() {
            return this == UNARY || this == SERVER_STREAMING;
        }

        public final boolean serverSendsOneMessage() {
            return this == UNARY || this == CLIENT_STREAMING;
        }
    }

    /* renamed from: io.grpc.i0$e */
    public interface e extends f {
        @Override // io.grpc.C5730i0.f
        /* synthetic */ Class getMessageClass();

        Object getMessagePrototype();

        @Override // io.grpc.C5730i0.f, io.grpc.C5730i0.c
        /* synthetic */ Object parse(InputStream inputStream);

        @Override // io.grpc.C5730i0.f, io.grpc.C5730i0.c
        /* synthetic */ InputStream stream(Object obj);
    }

    /* renamed from: io.grpc.i0$f */
    public interface f extends c {
        Class<Object> getMessageClass();

        @Override // io.grpc.C5730i0.c
        /* synthetic */ Object parse(InputStream inputStream);

        @Override // io.grpc.C5730i0.c
        /* synthetic */ InputStream stream(Object obj);
    }

    @Deprecated
    public static <RequestT, ResponseT> C5730i0 create(d dVar, String str, c cVar, c cVar2) {
        return new C5730i0(dVar, str, cVar, cVar2, null, false, false, false);
    }

    public static String extractBareMethodName(String str) {
        int iLastIndexOf = ((String) e3.w.checkNotNull(str, "fullMethodName")).lastIndexOf(47);
        if (iLastIndexOf == -1) {
            return null;
        }
        return str.substring(iLastIndexOf + 1);
    }

    public static String extractFullServiceName(String str) {
        int iLastIndexOf = ((String) e3.w.checkNotNull(str, "fullMethodName")).lastIndexOf(47);
        if (iLastIndexOf == -1) {
            return null;
        }
        return str.substring(0, iLastIndexOf);
    }

    public static String generateFullMethodName(String str, String str2) {
        return ((String) e3.w.checkNotNull(str, "fullServiceName")) + "/" + ((String) e3.w.checkNotNull(str2, "methodName"));
    }

    public static <ReqT, RespT> b newBuilder() {
        return newBuilder(null, null);
    }

    public String getBareMethodName() {
        return extractBareMethodName(this.f32151b);
    }

    public String getFullMethodName() {
        return this.f32151b;
    }

    public c getRequestMarshaller() {
        return this.f32153d;
    }

    public c getResponseMarshaller() {
        return this.f32154e;
    }

    public Object getSchemaDescriptor() {
        return this.f32155f;
    }

    public String getServiceName() {
        return this.f32152c;
    }

    public d getType() {
        return this.f32150a;
    }

    public boolean isIdempotent() {
        return this.f32156g;
    }

    public boolean isSafe() {
        return this.f32157h;
    }

    public boolean isSampledToLocalTracing() {
        return this.f32158i;
    }

    public Object parseRequest(InputStream inputStream) {
        return this.f32153d.parse(inputStream);
    }

    public Object parseResponse(InputStream inputStream) {
        return this.f32154e.parse(inputStream);
    }

    public InputStream streamRequest(Object obj) {
        return this.f32153d.stream(obj);
    }

    public InputStream streamResponse(Object obj) {
        return this.f32154e.stream(obj);
    }

    public b toBuilder() {
        return toBuilder(this.f32153d, this.f32154e);
    }

    public String toString() {
        return e3.p.toStringHelper(this).add("fullMethodName", this.f32151b).add("type", this.f32150a).add("idempotent", this.f32156g).add("safe", this.f32157h).add("sampledToLocalTracing", this.f32158i).add("requestMarshaller", this.f32153d).add("responseMarshaller", this.f32154e).add("schemaDescriptor", this.f32155f).omitNullValues().toString();
    }

    private C5730i0(d dVar, String str, c cVar, c cVar2, Object obj, boolean z8, boolean z9, boolean z10) {
        this.f32159j = new AtomicReferenceArray(2);
        this.f32150a = (d) e3.w.checkNotNull(dVar, "type");
        this.f32151b = (String) e3.w.checkNotNull(str, "fullMethodName");
        this.f32152c = extractFullServiceName(str);
        this.f32153d = (c) e3.w.checkNotNull(cVar, "requestMarshaller");
        this.f32154e = (c) e3.w.checkNotNull(cVar2, "responseMarshaller");
        this.f32155f = obj;
        this.f32156g = z8;
        this.f32157h = z9;
        this.f32158i = z10;
    }

    public static <ReqT, RespT> b newBuilder(c cVar, c cVar2) {
        return new b().setRequestMarshaller(cVar).setResponseMarshaller(cVar2);
    }

    public <NewReqT, NewRespT> b toBuilder(c cVar, c cVar2) {
        return newBuilder().setRequestMarshaller(cVar).setResponseMarshaller(cVar2).setType(this.f32150a).setFullMethodName(this.f32151b).setIdempotent(this.f32156g).setSafe(this.f32157h).setSampledToLocalTracing(this.f32158i).setSchemaDescriptor(this.f32155f);
    }
}
