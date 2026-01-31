package maum.m2u.map;

import M6.a;
import M6.c;
import M6.d;
import ai.maum.m2u.cdk.MapIf;
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
import maum.m2u.map.Authentication;

/* loaded from: classes3.dex */
public final class AuthorizationProviderGrpc {
    private static final int METHODID_GET_USER_INFO = 1;
    private static final int METHODID_IS_VALID = 0;
    public static final String SERVICE_NAME = "maum.m2u.map.AuthorizationProvider";
    private static volatile C5730i0 getGetUserInfoMethod;
    private static volatile C5730i0 getIsValidMethod;
    private static volatile H0 serviceDescriptor;

    public interface AsyncService {
        default void getUserInfo(Authentication.GetUserInfoRequest getUserInfoRequest, k kVar) {
            j.asyncUnimplementedUnaryCall(AuthorizationProviderGrpc.getGetUserInfoMethod(), kVar);
        }

        default void isValid(Authentication.IsValidRequest isValidRequest, k kVar) {
            j.asyncUnimplementedUnaryCall(AuthorizationProviderGrpc.getIsValidMethod(), kVar);
        }
    }

    private static abstract class AuthorizationProviderBaseDescriptorSupplier implements a, c {
        AuthorizationProviderBaseDescriptorSupplier() {
        }

        @Override // M6.a
        public C5269x.h getFileDescriptor() {
            return Authentication.getDescriptor();
        }

        @Override // M6.c
        public C5269x.m getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("AuthorizationProvider");
        }
    }

    public static final class AuthorizationProviderBlockingStub extends b {
        public Authentication.GetUserInfoResponse getUserInfo(Authentication.GetUserInfoRequest getUserInfoRequest) {
            return (Authentication.GetUserInfoResponse) g.blockingUnaryCall(getChannel(), AuthorizationProviderGrpc.getGetUserInfoMethod(), getCallOptions(), getUserInfoRequest);
        }

        public Authentication.IsValidResponse isValid(Authentication.IsValidRequest isValidRequest) {
            return (Authentication.IsValidResponse) g.blockingUnaryCall(getChannel(), AuthorizationProviderGrpc.getIsValidMethod(), getCallOptions(), isValidRequest);
        }

        private AuthorizationProviderBlockingStub(AbstractC5723f abstractC5723f, C5721e c5721e) {
            super(abstractC5723f, c5721e);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public AuthorizationProviderBlockingStub build(AbstractC5723f abstractC5723f, C5721e c5721e) {
            return new AuthorizationProviderBlockingStub(abstractC5723f, c5721e);
        }
    }

    private static final class AuthorizationProviderFileDescriptorSupplier extends AuthorizationProviderBaseDescriptorSupplier {
        AuthorizationProviderFileDescriptorSupplier() {
        }
    }

    public static final class AuthorizationProviderFutureStub extends io.grpc.stub.c {
        public C getUserInfo(Authentication.GetUserInfoRequest getUserInfoRequest) {
            return g.futureUnaryCall(getChannel().newCall(AuthorizationProviderGrpc.getGetUserInfoMethod(), getCallOptions()), getUserInfoRequest);
        }

        public C isValid(Authentication.IsValidRequest isValidRequest) {
            return g.futureUnaryCall(getChannel().newCall(AuthorizationProviderGrpc.getIsValidMethod(), getCallOptions()), isValidRequest);
        }

        private AuthorizationProviderFutureStub(AbstractC5723f abstractC5723f, C5721e c5721e) {
            super(abstractC5723f, c5721e);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public AuthorizationProviderFutureStub build(AbstractC5723f abstractC5723f, C5721e c5721e) {
            return new AuthorizationProviderFutureStub(abstractC5723f, c5721e);
        }
    }

    public static abstract class AuthorizationProviderImplBase implements InterfaceC5717c, AsyncService {
        @Override // io.grpc.InterfaceC5717c
        public final E0 bindService() {
            return AuthorizationProviderGrpc.bindService(this);
        }
    }

    private static final class AuthorizationProviderMethodDescriptorSupplier extends AuthorizationProviderBaseDescriptorSupplier implements M6.b {
        private final String methodName;

        AuthorizationProviderMethodDescriptorSupplier(String str) {
            this.methodName = str;
        }

        @Override // M6.b
        public C5269x.j getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(this.methodName);
        }
    }

    public static final class AuthorizationProviderStub extends io.grpc.stub.a {
        public void getUserInfo(Authentication.GetUserInfoRequest getUserInfoRequest, k kVar) {
            g.asyncUnaryCall(getChannel().newCall(AuthorizationProviderGrpc.getGetUserInfoMethod(), getCallOptions()), getUserInfoRequest, kVar);
        }

        public void isValid(Authentication.IsValidRequest isValidRequest, k kVar) {
            g.asyncUnaryCall(getChannel().newCall(AuthorizationProviderGrpc.getIsValidMethod(), getCallOptions()), isValidRequest, kVar);
        }

        private AuthorizationProviderStub(AbstractC5723f abstractC5723f, C5721e c5721e) {
            super(abstractC5723f, c5721e);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public AuthorizationProviderStub build(AbstractC5723f abstractC5723f, C5721e c5721e) {
            return new AuthorizationProviderStub(abstractC5723f, c5721e);
        }
    }

    private AuthorizationProviderGrpc() {
    }

    public static final E0 bindService(AsyncService asyncService) {
        return E0.builder(getServiceDescriptor()).addMethod(getIsValidMethod(), j.asyncUnaryCall(new MethodHandlers(asyncService, 0))).addMethod(getGetUserInfoMethod(), j.asyncUnaryCall(new MethodHandlers(asyncService, 1))).build();
    }

    public static C5730i0 getGetUserInfoMethod() {
        C5730i0 c5730i0Build = getGetUserInfoMethod;
        if (c5730i0Build == null) {
            synchronized (AuthorizationProviderGrpc.class) {
                try {
                    c5730i0Build = getGetUserInfoMethod;
                    if (c5730i0Build == null) {
                        c5730i0Build = C5730i0.newBuilder().setType(C5730i0.d.UNARY).setFullMethodName(C5730i0.generateFullMethodName(SERVICE_NAME, MapIf.AU_E_GET_USER_INFO)).setSampledToLocalTracing(true).setRequestMarshaller(d.marshaller(Authentication.GetUserInfoRequest.getDefaultInstance())).setResponseMarshaller(d.marshaller(Authentication.GetUserInfoResponse.getDefaultInstance())).setSchemaDescriptor(new AuthorizationProviderMethodDescriptorSupplier(MapIf.AU_E_GET_USER_INFO)).build();
                        getGetUserInfoMethod = c5730i0Build;
                    }
                } finally {
                }
            }
        }
        return c5730i0Build;
    }

    public static C5730i0 getIsValidMethod() {
        C5730i0 c5730i0Build = getIsValidMethod;
        if (c5730i0Build == null) {
            synchronized (AuthorizationProviderGrpc.class) {
                try {
                    c5730i0Build = getIsValidMethod;
                    if (c5730i0Build == null) {
                        c5730i0Build = C5730i0.newBuilder().setType(C5730i0.d.UNARY).setFullMethodName(C5730i0.generateFullMethodName(SERVICE_NAME, MapIf.AU_E_IS_VALID)).setSampledToLocalTracing(true).setRequestMarshaller(d.marshaller(Authentication.IsValidRequest.getDefaultInstance())).setResponseMarshaller(d.marshaller(Authentication.IsValidResponse.getDefaultInstance())).setSchemaDescriptor(new AuthorizationProviderMethodDescriptorSupplier(MapIf.AU_E_IS_VALID)).build();
                        getIsValidMethod = c5730i0Build;
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
            synchronized (AuthorizationProviderGrpc.class) {
                try {
                    h0Build = serviceDescriptor;
                    if (h0Build == null) {
                        h0Build = H0.newBuilder(SERVICE_NAME).setSchemaDescriptor(new AuthorizationProviderFileDescriptorSupplier()).addMethod(getIsValidMethod()).addMethod(getGetUserInfoMethod()).build();
                        serviceDescriptor = h0Build;
                    }
                } finally {
                }
            }
        }
        return h0Build;
    }

    public static AuthorizationProviderBlockingStub newBlockingStub(AbstractC5723f abstractC5723f) {
        return (AuthorizationProviderBlockingStub) b.newStub(new d.a() { // from class: maum.m2u.map.AuthorizationProviderGrpc.2
            @Override // io.grpc.stub.d.a
            public AuthorizationProviderBlockingStub newStub(AbstractC5723f abstractC5723f2, C5721e c5721e) {
                return new AuthorizationProviderBlockingStub(abstractC5723f2, c5721e);
            }
        }, abstractC5723f);
    }

    public static AuthorizationProviderFutureStub newFutureStub(AbstractC5723f abstractC5723f) {
        return (AuthorizationProviderFutureStub) io.grpc.stub.c.newStub(new d.a() { // from class: maum.m2u.map.AuthorizationProviderGrpc.3
            @Override // io.grpc.stub.d.a
            public AuthorizationProviderFutureStub newStub(AbstractC5723f abstractC5723f2, C5721e c5721e) {
                return new AuthorizationProviderFutureStub(abstractC5723f2, c5721e);
            }
        }, abstractC5723f);
    }

    public static AuthorizationProviderStub newStub(AbstractC5723f abstractC5723f) {
        return (AuthorizationProviderStub) io.grpc.stub.a.newStub(new d.a() { // from class: maum.m2u.map.AuthorizationProviderGrpc.1
            @Override // io.grpc.stub.d.a
            public AuthorizationProviderStub newStub(AbstractC5723f abstractC5723f2, C5721e c5721e) {
                return new AuthorizationProviderStub(abstractC5723f2, c5721e);
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
                this.serviceImpl.isValid((Authentication.IsValidRequest) req, kVar);
            } else {
                if (i8 != 1) {
                    throw new AssertionError();
                }
                this.serviceImpl.getUserInfo((Authentication.GetUserInfoRequest) req, kVar);
            }
        }

        @Override // io.grpc.stub.j.b, io.grpc.stub.j.f
        public k invoke(k kVar) {
            throw new AssertionError();
        }
    }
}
