package maum.m2u.map;

import M6.a;
import M6.c;
import com.google.common.util.concurrent.C;
import com.google.protobuf.C5269x;
import io.grpc.AbstractC5723f;
import io.grpc.C5721e;
import io.grpc.C5730i0;
import io.grpc.E0;
import io.grpc.H0;
import io.grpc.InterfaceC5717c;
import io.grpc.stub.b;
import io.grpc.stub.d;
import io.grpc.stub.g;
import io.grpc.stub.j;
import io.grpc.stub.k;
import maum.m2u.map.Map;

/* loaded from: classes3.dex */
public final class MaumToYouProxyServiceGrpc {
    private static final int METHODID_EVENT_STREAM = 3;
    private static final int METHODID_GET_DIRECTIVES = 2;
    private static final int METHODID_LIST_ASYNC_INTERFACES = 1;
    private static final int METHODID_PING = 0;
    public static final String SERVICE_NAME = "maum.m2u.map.MaumToYouProxyService";
    private static volatile C5730i0 getEventStreamMethod;
    private static volatile C5730i0 getGetDirectivesMethod;
    private static volatile C5730i0 getListAsyncInterfacesMethod;
    private static volatile C5730i0 getPingMethod;
    private static volatile H0 serviceDescriptor;

    /* renamed from: maum.m2u.map.MaumToYouProxyServiceGrpc$1 */
    class AnonymousClass1 implements d.a {
        AnonymousClass1() {
        }

        @Override // io.grpc.stub.d.a
        public MaumToYouProxyServiceStub newStub(AbstractC5723f abstractC5723f, C5721e c5721e) {
            return new MaumToYouProxyServiceStub(abstractC5723f, c5721e);
        }
    }

    /* renamed from: maum.m2u.map.MaumToYouProxyServiceGrpc$2 */
    class AnonymousClass2 implements d.a {
        AnonymousClass2() {
        }

        @Override // io.grpc.stub.d.a
        public MaumToYouProxyServiceBlockingStub newStub(AbstractC5723f abstractC5723f, C5721e c5721e) {
            return new MaumToYouProxyServiceBlockingStub(abstractC5723f, c5721e);
        }
    }

    /* renamed from: maum.m2u.map.MaumToYouProxyServiceGrpc$3 */
    class AnonymousClass3 implements d.a {
        AnonymousClass3() {
        }

        @Override // io.grpc.stub.d.a
        public MaumToYouProxyServiceFutureStub newStub(AbstractC5723f abstractC5723f, C5721e c5721e) {
            return new MaumToYouProxyServiceFutureStub(abstractC5723f, c5721e);
        }
    }

    public interface AsyncService {
        default k eventStream(k kVar) {
            return j.asyncUnimplementedStreamingCall(MaumToYouProxyServiceGrpc.getEventStreamMethod(), kVar);
        }

        default k getDirectives(k kVar) {
            return j.asyncUnimplementedStreamingCall(MaumToYouProxyServiceGrpc.getGetDirectivesMethod(), kVar);
        }

        default void listAsyncInterfaces(Map.AsyncInterface asyncInterface, k kVar) {
            j.asyncUnimplementedUnaryCall(MaumToYouProxyServiceGrpc.getListAsyncInterfacesMethod(), kVar);
        }

        default void ping(Map.PingRequest pingRequest, k kVar) {
            j.asyncUnimplementedUnaryCall(MaumToYouProxyServiceGrpc.getPingMethod(), kVar);
        }
    }

    private static abstract class MaumToYouProxyServiceBaseDescriptorSupplier implements a, c {
        MaumToYouProxyServiceBaseDescriptorSupplier() {
        }

        @Override // M6.a
        public C5269x.h getFileDescriptor() {
            return Map.getDescriptor();
        }

        @Override // M6.c
        public C5269x.m getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("MaumToYouProxyService");
        }
    }

    public static final class MaumToYouProxyServiceBlockingStub extends b {
        /* synthetic */ MaumToYouProxyServiceBlockingStub(AbstractC5723f abstractC5723f, C5721e c5721e, AnonymousClass1 anonymousClass1) {
            this(abstractC5723f, c5721e);
        }

        public Map.AsyncInterfaceList listAsyncInterfaces(Map.AsyncInterface asyncInterface) {
            return (Map.AsyncInterfaceList) g.blockingUnaryCall(getChannel(), MaumToYouProxyServiceGrpc.getListAsyncInterfacesMethod(), getCallOptions(), asyncInterface);
        }

        public Map.PongResponse ping(Map.PingRequest pingRequest) {
            return (Map.PongResponse) g.blockingUnaryCall(getChannel(), MaumToYouProxyServiceGrpc.getPingMethod(), getCallOptions(), pingRequest);
        }

        private MaumToYouProxyServiceBlockingStub(AbstractC5723f abstractC5723f, C5721e c5721e) {
            super(abstractC5723f, c5721e);
        }

        @Override // io.grpc.stub.d
        public MaumToYouProxyServiceBlockingStub build(AbstractC5723f abstractC5723f, C5721e c5721e) {
            return new MaumToYouProxyServiceBlockingStub(abstractC5723f, c5721e);
        }
    }

    private static final class MaumToYouProxyServiceFileDescriptorSupplier extends MaumToYouProxyServiceBaseDescriptorSupplier {
        MaumToYouProxyServiceFileDescriptorSupplier() {
        }
    }

    public static final class MaumToYouProxyServiceFutureStub extends io.grpc.stub.c {
        /* synthetic */ MaumToYouProxyServiceFutureStub(AbstractC5723f abstractC5723f, C5721e c5721e, AnonymousClass1 anonymousClass1) {
            this(abstractC5723f, c5721e);
        }

        public C listAsyncInterfaces(Map.AsyncInterface asyncInterface) {
            return g.futureUnaryCall(getChannel().newCall(MaumToYouProxyServiceGrpc.getListAsyncInterfacesMethod(), getCallOptions()), asyncInterface);
        }

        public C ping(Map.PingRequest pingRequest) {
            return g.futureUnaryCall(getChannel().newCall(MaumToYouProxyServiceGrpc.getPingMethod(), getCallOptions()), pingRequest);
        }

        private MaumToYouProxyServiceFutureStub(AbstractC5723f abstractC5723f, C5721e c5721e) {
            super(abstractC5723f, c5721e);
        }

        @Override // io.grpc.stub.d
        public MaumToYouProxyServiceFutureStub build(AbstractC5723f abstractC5723f, C5721e c5721e) {
            return new MaumToYouProxyServiceFutureStub(abstractC5723f, c5721e);
        }
    }

    public static abstract class MaumToYouProxyServiceImplBase implements InterfaceC5717c, AsyncService {
        @Override // io.grpc.InterfaceC5717c
        public final E0 bindService() {
            return MaumToYouProxyServiceGrpc.bindService(this);
        }
    }

    private static final class MaumToYouProxyServiceMethodDescriptorSupplier extends MaumToYouProxyServiceBaseDescriptorSupplier implements M6.b {
        private final String methodName;

        MaumToYouProxyServiceMethodDescriptorSupplier(String str) {
            this.methodName = str;
        }

        @Override // M6.b
        public C5269x.j getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(this.methodName);
        }
    }

    public static final class MaumToYouProxyServiceStub extends io.grpc.stub.a {
        /* synthetic */ MaumToYouProxyServiceStub(AbstractC5723f abstractC5723f, C5721e c5721e, AnonymousClass1 anonymousClass1) {
            this(abstractC5723f, c5721e);
        }

        public k eventStream(k kVar) {
            return g.asyncBidiStreamingCall(getChannel().newCall(MaumToYouProxyServiceGrpc.getEventStreamMethod(), getCallOptions()), kVar);
        }

        public k getDirectives(k kVar) {
            return g.asyncBidiStreamingCall(getChannel().newCall(MaumToYouProxyServiceGrpc.getGetDirectivesMethod(), getCallOptions()), kVar);
        }

        public void listAsyncInterfaces(Map.AsyncInterface asyncInterface, k kVar) {
            g.asyncUnaryCall(getChannel().newCall(MaumToYouProxyServiceGrpc.getListAsyncInterfacesMethod(), getCallOptions()), asyncInterface, kVar);
        }

        public void ping(Map.PingRequest pingRequest, k kVar) {
            g.asyncUnaryCall(getChannel().newCall(MaumToYouProxyServiceGrpc.getPingMethod(), getCallOptions()), pingRequest, kVar);
        }

        private MaumToYouProxyServiceStub(AbstractC5723f abstractC5723f, C5721e c5721e) {
            super(abstractC5723f, c5721e);
        }

        @Override // io.grpc.stub.d
        public MaumToYouProxyServiceStub build(AbstractC5723f abstractC5723f, C5721e c5721e) {
            return new MaumToYouProxyServiceStub(abstractC5723f, c5721e);
        }
    }

    private MaumToYouProxyServiceGrpc() {
    }

    public static final E0 bindService(AsyncService asyncService) {
        return E0.builder(getServiceDescriptor()).addMethod(getPingMethod(), j.asyncUnaryCall(new MethodHandlers(asyncService, 0))).addMethod(getGetDirectivesMethod(), j.asyncBidiStreamingCall(new MethodHandlers(asyncService, 2))).addMethod(getEventStreamMethod(), j.asyncBidiStreamingCall(new MethodHandlers(asyncService, 3))).addMethod(getListAsyncInterfacesMethod(), j.asyncUnaryCall(new MethodHandlers(asyncService, 1))).build();
    }

    public static C5730i0 getEventStreamMethod() {
        C5730i0 c5730i0Build = getEventStreamMethod;
        if (c5730i0Build == null) {
            synchronized (MaumToYouProxyServiceGrpc.class) {
                try {
                    c5730i0Build = getEventStreamMethod;
                    if (c5730i0Build == null) {
                        c5730i0Build = C5730i0.newBuilder().setType(C5730i0.d.BIDI_STREAMING).setFullMethodName(C5730i0.generateFullMethodName(SERVICE_NAME, "EventStream")).setSampledToLocalTracing(true).setRequestMarshaller(M6.d.marshaller(Map.MapEvent.getDefaultInstance())).setResponseMarshaller(M6.d.marshaller(Map.MapDirective.getDefaultInstance())).setSchemaDescriptor(new MaumToYouProxyServiceMethodDescriptorSupplier("EventStream")).build();
                        getEventStreamMethod = c5730i0Build;
                    }
                } finally {
                }
            }
        }
        return c5730i0Build;
    }

    public static C5730i0 getGetDirectivesMethod() {
        C5730i0 c5730i0Build = getGetDirectivesMethod;
        if (c5730i0Build == null) {
            synchronized (MaumToYouProxyServiceGrpc.class) {
                try {
                    c5730i0Build = getGetDirectivesMethod;
                    if (c5730i0Build == null) {
                        c5730i0Build = C5730i0.newBuilder().setType(C5730i0.d.BIDI_STREAMING).setFullMethodName(C5730i0.generateFullMethodName(SERVICE_NAME, "GetDirectives")).setSampledToLocalTracing(true).setRequestMarshaller(M6.d.marshaller(Map.MapEvent.getDefaultInstance())).setResponseMarshaller(M6.d.marshaller(Map.MapDirective.getDefaultInstance())).setSchemaDescriptor(new MaumToYouProxyServiceMethodDescriptorSupplier("GetDirectives")).build();
                        getGetDirectivesMethod = c5730i0Build;
                    }
                } finally {
                }
            }
        }
        return c5730i0Build;
    }

    public static C5730i0 getListAsyncInterfacesMethod() {
        C5730i0 c5730i0Build = getListAsyncInterfacesMethod;
        if (c5730i0Build == null) {
            synchronized (MaumToYouProxyServiceGrpc.class) {
                try {
                    c5730i0Build = getListAsyncInterfacesMethod;
                    if (c5730i0Build == null) {
                        c5730i0Build = C5730i0.newBuilder().setType(C5730i0.d.UNARY).setFullMethodName(C5730i0.generateFullMethodName(SERVICE_NAME, "ListAsyncInterfaces")).setSampledToLocalTracing(true).setRequestMarshaller(M6.d.marshaller(Map.AsyncInterface.getDefaultInstance())).setResponseMarshaller(M6.d.marshaller(Map.AsyncInterfaceList.getDefaultInstance())).setSchemaDescriptor(new MaumToYouProxyServiceMethodDescriptorSupplier("ListAsyncInterfaces")).build();
                        getListAsyncInterfacesMethod = c5730i0Build;
                    }
                } finally {
                }
            }
        }
        return c5730i0Build;
    }

    public static C5730i0 getPingMethod() {
        C5730i0 c5730i0Build = getPingMethod;
        if (c5730i0Build == null) {
            synchronized (MaumToYouProxyServiceGrpc.class) {
                try {
                    c5730i0Build = getPingMethod;
                    if (c5730i0Build == null) {
                        c5730i0Build = C5730i0.newBuilder().setType(C5730i0.d.UNARY).setFullMethodName(C5730i0.generateFullMethodName(SERVICE_NAME, "Ping")).setSampledToLocalTracing(true).setRequestMarshaller(M6.d.marshaller(Map.PingRequest.getDefaultInstance())).setResponseMarshaller(M6.d.marshaller(Map.PongResponse.getDefaultInstance())).setSchemaDescriptor(new MaumToYouProxyServiceMethodDescriptorSupplier("Ping")).build();
                        getPingMethod = c5730i0Build;
                    }
                } finally {
                }
            }
        }
        return c5730i0Build;
    }

    public static H0 getServiceDescriptor() {
        H0 h0Build = serviceDescriptor;
        if (h0Build == null) {
            synchronized (MaumToYouProxyServiceGrpc.class) {
                try {
                    h0Build = serviceDescriptor;
                    if (h0Build == null) {
                        h0Build = H0.newBuilder(SERVICE_NAME).setSchemaDescriptor(new MaumToYouProxyServiceFileDescriptorSupplier()).addMethod(getPingMethod()).addMethod(getGetDirectivesMethod()).addMethod(getEventStreamMethod()).addMethod(getListAsyncInterfacesMethod()).build();
                        serviceDescriptor = h0Build;
                    }
                } finally {
                }
            }
        }
        return h0Build;
    }

    public static MaumToYouProxyServiceBlockingStub newBlockingStub(AbstractC5723f abstractC5723f) {
        return (MaumToYouProxyServiceBlockingStub) b.newStub(new d.a() { // from class: maum.m2u.map.MaumToYouProxyServiceGrpc.2
            AnonymousClass2() {
            }

            @Override // io.grpc.stub.d.a
            public MaumToYouProxyServiceBlockingStub newStub(AbstractC5723f abstractC5723f2, C5721e c5721e) {
                return new MaumToYouProxyServiceBlockingStub(abstractC5723f2, c5721e);
            }
        }, abstractC5723f);
    }

    public static MaumToYouProxyServiceFutureStub newFutureStub(AbstractC5723f abstractC5723f) {
        return (MaumToYouProxyServiceFutureStub) io.grpc.stub.c.newStub(new d.a() { // from class: maum.m2u.map.MaumToYouProxyServiceGrpc.3
            AnonymousClass3() {
            }

            @Override // io.grpc.stub.d.a
            public MaumToYouProxyServiceFutureStub newStub(AbstractC5723f abstractC5723f2, C5721e c5721e) {
                return new MaumToYouProxyServiceFutureStub(abstractC5723f2, c5721e);
            }
        }, abstractC5723f);
    }

    public static MaumToYouProxyServiceStub newStub(AbstractC5723f abstractC5723f) {
        return (MaumToYouProxyServiceStub) io.grpc.stub.a.newStub(new d.a() { // from class: maum.m2u.map.MaumToYouProxyServiceGrpc.1
            AnonymousClass1() {
            }

            @Override // io.grpc.stub.d.a
            public MaumToYouProxyServiceStub newStub(AbstractC5723f abstractC5723f2, C5721e c5721e) {
                return new MaumToYouProxyServiceStub(abstractC5723f2, c5721e);
            }
        }, abstractC5723f);
    }

    private static final class MethodHandlers<Req, Resp> implements j.h, j.e, j.b, j.a {
        private final int methodId;
        private final AsyncService serviceImpl;

        MethodHandlers(AsyncService asyncService, int i8) {
            this.serviceImpl = asyncService;
            this.methodId = i8;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.grpc.stub.j.h, io.grpc.stub.j.i
        public void invoke(Req req, k kVar) {
            int i8 = this.methodId;
            if (i8 == 0) {
                this.serviceImpl.ping((Map.PingRequest) req, kVar);
            } else {
                if (i8 != 1) {
                    throw new AssertionError();
                }
                this.serviceImpl.listAsyncInterfaces((Map.AsyncInterface) req, kVar);
            }
        }

        @Override // io.grpc.stub.j.b, io.grpc.stub.j.f
        public k invoke(k kVar) {
            int i8 = this.methodId;
            if (i8 == 2) {
                return this.serviceImpl.getDirectives(kVar);
            }
            if (i8 == 3) {
                return this.serviceImpl.eventStream(kVar);
            }
            throw new AssertionError();
        }
    }
}
