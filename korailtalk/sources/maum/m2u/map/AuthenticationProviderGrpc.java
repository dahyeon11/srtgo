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
public final class AuthenticationProviderGrpc {
    private static final int METHODID_GET_USER_SETTINGS = 4;
    private static final int METHODID_MULTI_FACTOR_VERIFY = 1;
    private static final int METHODID_SIGN_IN = 0;
    private static final int METHODID_SIGN_OUT = 2;
    private static final int METHODID_UPDATE_USER_SETTINGS = 3;
    public static final String SERVICE_NAME = "maum.m2u.map.AuthenticationProvider";
    private static volatile C5730i0 getGetUserSettingsMethod;
    private static volatile C5730i0 getMultiFactorVerifyMethod;
    private static volatile C5730i0 getSignInMethod;
    private static volatile C5730i0 getSignOutMethod;
    private static volatile C5730i0 getUpdateUserSettingsMethod;
    private static volatile H0 serviceDescriptor;

    public interface AsyncService {
        default void getUserSettings(Authentication.UserKey userKey, k kVar) {
            j.asyncUnimplementedUnaryCall(AuthenticationProviderGrpc.getGetUserSettingsMethod(), kVar);
        }

        default void multiFactorVerify(Authentication.MultiFactorVerifyPayload multiFactorVerifyPayload, k kVar) {
            j.asyncUnimplementedUnaryCall(AuthenticationProviderGrpc.getMultiFactorVerifyMethod(), kVar);
        }

        default void signIn(Authentication.SignInPayload signInPayload, k kVar) {
            j.asyncUnimplementedUnaryCall(AuthenticationProviderGrpc.getSignInMethod(), kVar);
        }

        default void signOut(Authentication.SignOutPayload signOutPayload, k kVar) {
            j.asyncUnimplementedUnaryCall(AuthenticationProviderGrpc.getSignOutMethod(), kVar);
        }

        default void updateUserSettings(Authentication.UserSettings userSettings, k kVar) {
            j.asyncUnimplementedUnaryCall(AuthenticationProviderGrpc.getUpdateUserSettingsMethod(), kVar);
        }
    }

    private static abstract class AuthenticationProviderBaseDescriptorSupplier implements a, c {
        AuthenticationProviderBaseDescriptorSupplier() {
        }

        @Override // M6.a
        public C5269x.h getFileDescriptor() {
            return Authentication.getDescriptor();
        }

        @Override // M6.c
        public C5269x.m getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("AuthenticationProvider");
        }
    }

    public static final class AuthenticationProviderBlockingStub extends b {
        public Authentication.UserSettings getUserSettings(Authentication.UserKey userKey) {
            return (Authentication.UserSettings) g.blockingUnaryCall(getChannel(), AuthenticationProviderGrpc.getGetUserSettingsMethod(), getCallOptions(), userKey);
        }

        public Authentication.SignInResultPayload multiFactorVerify(Authentication.MultiFactorVerifyPayload multiFactorVerifyPayload) {
            return (Authentication.SignInResultPayload) g.blockingUnaryCall(getChannel(), AuthenticationProviderGrpc.getMultiFactorVerifyMethod(), getCallOptions(), multiFactorVerifyPayload);
        }

        public Authentication.SignInResultPayload signIn(Authentication.SignInPayload signInPayload) {
            return (Authentication.SignInResultPayload) g.blockingUnaryCall(getChannel(), AuthenticationProviderGrpc.getSignInMethod(), getCallOptions(), signInPayload);
        }

        public Authentication.SignOutResultPayload signOut(Authentication.SignOutPayload signOutPayload) {
            return (Authentication.SignOutResultPayload) g.blockingUnaryCall(getChannel(), AuthenticationProviderGrpc.getSignOutMethod(), getCallOptions(), signOutPayload);
        }

        public Authentication.UserSettings updateUserSettings(Authentication.UserSettings userSettings) {
            return (Authentication.UserSettings) g.blockingUnaryCall(getChannel(), AuthenticationProviderGrpc.getUpdateUserSettingsMethod(), getCallOptions(), userSettings);
        }

        private AuthenticationProviderBlockingStub(AbstractC5723f abstractC5723f, C5721e c5721e) {
            super(abstractC5723f, c5721e);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public AuthenticationProviderBlockingStub build(AbstractC5723f abstractC5723f, C5721e c5721e) {
            return new AuthenticationProviderBlockingStub(abstractC5723f, c5721e);
        }
    }

    private static final class AuthenticationProviderFileDescriptorSupplier extends AuthenticationProviderBaseDescriptorSupplier {
        AuthenticationProviderFileDescriptorSupplier() {
        }
    }

    public static final class AuthenticationProviderFutureStub extends io.grpc.stub.c {
        public C getUserSettings(Authentication.UserKey userKey) {
            return g.futureUnaryCall(getChannel().newCall(AuthenticationProviderGrpc.getGetUserSettingsMethod(), getCallOptions()), userKey);
        }

        public C multiFactorVerify(Authentication.MultiFactorVerifyPayload multiFactorVerifyPayload) {
            return g.futureUnaryCall(getChannel().newCall(AuthenticationProviderGrpc.getMultiFactorVerifyMethod(), getCallOptions()), multiFactorVerifyPayload);
        }

        public C signIn(Authentication.SignInPayload signInPayload) {
            return g.futureUnaryCall(getChannel().newCall(AuthenticationProviderGrpc.getSignInMethod(), getCallOptions()), signInPayload);
        }

        public C signOut(Authentication.SignOutPayload signOutPayload) {
            return g.futureUnaryCall(getChannel().newCall(AuthenticationProviderGrpc.getSignOutMethod(), getCallOptions()), signOutPayload);
        }

        public C updateUserSettings(Authentication.UserSettings userSettings) {
            return g.futureUnaryCall(getChannel().newCall(AuthenticationProviderGrpc.getUpdateUserSettingsMethod(), getCallOptions()), userSettings);
        }

        private AuthenticationProviderFutureStub(AbstractC5723f abstractC5723f, C5721e c5721e) {
            super(abstractC5723f, c5721e);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public AuthenticationProviderFutureStub build(AbstractC5723f abstractC5723f, C5721e c5721e) {
            return new AuthenticationProviderFutureStub(abstractC5723f, c5721e);
        }
    }

    public static abstract class AuthenticationProviderImplBase implements InterfaceC5717c, AsyncService {
        @Override // io.grpc.InterfaceC5717c
        public final E0 bindService() {
            return AuthenticationProviderGrpc.bindService(this);
        }
    }

    private static final class AuthenticationProviderMethodDescriptorSupplier extends AuthenticationProviderBaseDescriptorSupplier implements M6.b {
        private final String methodName;

        AuthenticationProviderMethodDescriptorSupplier(String str) {
            this.methodName = str;
        }

        @Override // M6.b
        public C5269x.j getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(this.methodName);
        }
    }

    public static final class AuthenticationProviderStub extends io.grpc.stub.a {
        public void getUserSettings(Authentication.UserKey userKey, k kVar) {
            g.asyncUnaryCall(getChannel().newCall(AuthenticationProviderGrpc.getGetUserSettingsMethod(), getCallOptions()), userKey, kVar);
        }

        public void multiFactorVerify(Authentication.MultiFactorVerifyPayload multiFactorVerifyPayload, k kVar) {
            g.asyncUnaryCall(getChannel().newCall(AuthenticationProviderGrpc.getMultiFactorVerifyMethod(), getCallOptions()), multiFactorVerifyPayload, kVar);
        }

        public void signIn(Authentication.SignInPayload signInPayload, k kVar) {
            g.asyncUnaryCall(getChannel().newCall(AuthenticationProviderGrpc.getSignInMethod(), getCallOptions()), signInPayload, kVar);
        }

        public void signOut(Authentication.SignOutPayload signOutPayload, k kVar) {
            g.asyncUnaryCall(getChannel().newCall(AuthenticationProviderGrpc.getSignOutMethod(), getCallOptions()), signOutPayload, kVar);
        }

        public void updateUserSettings(Authentication.UserSettings userSettings, k kVar) {
            g.asyncUnaryCall(getChannel().newCall(AuthenticationProviderGrpc.getUpdateUserSettingsMethod(), getCallOptions()), userSettings, kVar);
        }

        private AuthenticationProviderStub(AbstractC5723f abstractC5723f, C5721e c5721e) {
            super(abstractC5723f, c5721e);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public AuthenticationProviderStub build(AbstractC5723f abstractC5723f, C5721e c5721e) {
            return new AuthenticationProviderStub(abstractC5723f, c5721e);
        }
    }

    private AuthenticationProviderGrpc() {
    }

    public static final E0 bindService(AsyncService asyncService) {
        return E0.builder(getServiceDescriptor()).addMethod(getSignInMethod(), j.asyncUnaryCall(new MethodHandlers(asyncService, 0))).addMethod(getMultiFactorVerifyMethod(), j.asyncUnaryCall(new MethodHandlers(asyncService, 1))).addMethod(getSignOutMethod(), j.asyncUnaryCall(new MethodHandlers(asyncService, 2))).addMethod(getUpdateUserSettingsMethod(), j.asyncUnaryCall(new MethodHandlers(asyncService, 3))).addMethod(getGetUserSettingsMethod(), j.asyncUnaryCall(new MethodHandlers(asyncService, 4))).build();
    }

    public static C5730i0 getGetUserSettingsMethod() {
        C5730i0 c5730i0Build = getGetUserSettingsMethod;
        if (c5730i0Build == null) {
            synchronized (AuthenticationProviderGrpc.class) {
                try {
                    c5730i0Build = getGetUserSettingsMethod;
                    if (c5730i0Build == null) {
                        c5730i0Build = C5730i0.newBuilder().setType(C5730i0.d.UNARY).setFullMethodName(C5730i0.generateFullMethodName(SERVICE_NAME, MapIf.AU_E_GET_USER_SETTINS)).setSampledToLocalTracing(true).setRequestMarshaller(d.marshaller(Authentication.UserKey.getDefaultInstance())).setResponseMarshaller(d.marshaller(Authentication.UserSettings.getDefaultInstance())).setSchemaDescriptor(new AuthenticationProviderMethodDescriptorSupplier(MapIf.AU_E_GET_USER_SETTINS)).build();
                        getGetUserSettingsMethod = c5730i0Build;
                    }
                } finally {
                }
            }
        }
        return c5730i0Build;
    }

    public static C5730i0 getMultiFactorVerifyMethod() {
        C5730i0 c5730i0Build = getMultiFactorVerifyMethod;
        if (c5730i0Build == null) {
            synchronized (AuthenticationProviderGrpc.class) {
                try {
                    c5730i0Build = getMultiFactorVerifyMethod;
                    if (c5730i0Build == null) {
                        c5730i0Build = C5730i0.newBuilder().setType(C5730i0.d.UNARY).setFullMethodName(C5730i0.generateFullMethodName(SERVICE_NAME, MapIf.AU_E_MULTI_FACTOR_VERIFY)).setSampledToLocalTracing(true).setRequestMarshaller(d.marshaller(Authentication.MultiFactorVerifyPayload.getDefaultInstance())).setResponseMarshaller(d.marshaller(Authentication.SignInResultPayload.getDefaultInstance())).setSchemaDescriptor(new AuthenticationProviderMethodDescriptorSupplier(MapIf.AU_E_MULTI_FACTOR_VERIFY)).build();
                        getMultiFactorVerifyMethod = c5730i0Build;
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
            synchronized (AuthenticationProviderGrpc.class) {
                try {
                    h0Build = serviceDescriptor;
                    if (h0Build == null) {
                        h0Build = H0.newBuilder(SERVICE_NAME).setSchemaDescriptor(new AuthenticationProviderFileDescriptorSupplier()).addMethod(getSignInMethod()).addMethod(getMultiFactorVerifyMethod()).addMethod(getSignOutMethod()).addMethod(getUpdateUserSettingsMethod()).addMethod(getGetUserSettingsMethod()).build();
                        serviceDescriptor = h0Build;
                    }
                } finally {
                }
            }
        }
        return h0Build;
    }

    public static C5730i0 getSignInMethod() {
        C5730i0 c5730i0Build = getSignInMethod;
        if (c5730i0Build == null) {
            synchronized (AuthenticationProviderGrpc.class) {
                try {
                    c5730i0Build = getSignInMethod;
                    if (c5730i0Build == null) {
                        c5730i0Build = C5730i0.newBuilder().setType(C5730i0.d.UNARY).setFullMethodName(C5730i0.generateFullMethodName(SERVICE_NAME, MapIf.AU_E_SIGN_IN)).setSampledToLocalTracing(true).setRequestMarshaller(d.marshaller(Authentication.SignInPayload.getDefaultInstance())).setResponseMarshaller(d.marshaller(Authentication.SignInResultPayload.getDefaultInstance())).setSchemaDescriptor(new AuthenticationProviderMethodDescriptorSupplier(MapIf.AU_E_SIGN_IN)).build();
                        getSignInMethod = c5730i0Build;
                    }
                } finally {
                }
            }
        }
        return c5730i0Build;
    }

    public static C5730i0 getSignOutMethod() {
        C5730i0 c5730i0Build = getSignOutMethod;
        if (c5730i0Build == null) {
            synchronized (AuthenticationProviderGrpc.class) {
                try {
                    c5730i0Build = getSignOutMethod;
                    if (c5730i0Build == null) {
                        c5730i0Build = C5730i0.newBuilder().setType(C5730i0.d.UNARY).setFullMethodName(C5730i0.generateFullMethodName(SERVICE_NAME, MapIf.AU_E_SIGN_OUT)).setSampledToLocalTracing(true).setRequestMarshaller(d.marshaller(Authentication.SignOutPayload.getDefaultInstance())).setResponseMarshaller(d.marshaller(Authentication.SignOutResultPayload.getDefaultInstance())).setSchemaDescriptor(new AuthenticationProviderMethodDescriptorSupplier(MapIf.AU_E_SIGN_OUT)).build();
                        getSignOutMethod = c5730i0Build;
                    }
                } finally {
                }
            }
        }
        return c5730i0Build;
    }

    public static C5730i0 getUpdateUserSettingsMethod() {
        C5730i0 c5730i0Build = getUpdateUserSettingsMethod;
        if (c5730i0Build == null) {
            synchronized (AuthenticationProviderGrpc.class) {
                try {
                    c5730i0Build = getUpdateUserSettingsMethod;
                    if (c5730i0Build == null) {
                        c5730i0Build = C5730i0.newBuilder().setType(C5730i0.d.UNARY).setFullMethodName(C5730i0.generateFullMethodName(SERVICE_NAME, MapIf.AU_E_UPDATE_USER_SETTINGS)).setSampledToLocalTracing(true).setRequestMarshaller(d.marshaller(Authentication.UserSettings.getDefaultInstance())).setResponseMarshaller(d.marshaller(Authentication.UserSettings.getDefaultInstance())).setSchemaDescriptor(new AuthenticationProviderMethodDescriptorSupplier(MapIf.AU_E_UPDATE_USER_SETTINGS)).build();
                        getUpdateUserSettingsMethod = c5730i0Build;
                    }
                } finally {
                }
            }
        }
        return c5730i0Build;
    }

    public static AuthenticationProviderBlockingStub newBlockingStub(AbstractC5723f abstractC5723f) {
        return (AuthenticationProviderBlockingStub) b.newStub(new d.a() { // from class: maum.m2u.map.AuthenticationProviderGrpc.2
            @Override // io.grpc.stub.d.a
            public AuthenticationProviderBlockingStub newStub(AbstractC5723f abstractC5723f2, C5721e c5721e) {
                return new AuthenticationProviderBlockingStub(abstractC5723f2, c5721e);
            }
        }, abstractC5723f);
    }

    public static AuthenticationProviderFutureStub newFutureStub(AbstractC5723f abstractC5723f) {
        return (AuthenticationProviderFutureStub) io.grpc.stub.c.newStub(new d.a() { // from class: maum.m2u.map.AuthenticationProviderGrpc.3
            @Override // io.grpc.stub.d.a
            public AuthenticationProviderFutureStub newStub(AbstractC5723f abstractC5723f2, C5721e c5721e) {
                return new AuthenticationProviderFutureStub(abstractC5723f2, c5721e);
            }
        }, abstractC5723f);
    }

    public static AuthenticationProviderStub newStub(AbstractC5723f abstractC5723f) {
        return (AuthenticationProviderStub) io.grpc.stub.a.newStub(new d.a() { // from class: maum.m2u.map.AuthenticationProviderGrpc.1
            @Override // io.grpc.stub.d.a
            public AuthenticationProviderStub newStub(AbstractC5723f abstractC5723f2, C5721e c5721e) {
                return new AuthenticationProviderStub(abstractC5723f2, c5721e);
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
                this.serviceImpl.signIn((Authentication.SignInPayload) req, kVar);
                return;
            }
            if (i8 == 1) {
                this.serviceImpl.multiFactorVerify((Authentication.MultiFactorVerifyPayload) req, kVar);
                return;
            }
            if (i8 == 2) {
                this.serviceImpl.signOut((Authentication.SignOutPayload) req, kVar);
            } else if (i8 == 3) {
                this.serviceImpl.updateUserSettings((Authentication.UserSettings) req, kVar);
            } else {
                if (i8 != 4) {
                    throw new AssertionError();
                }
                this.serviceImpl.getUserSettings((Authentication.UserKey) req, kVar);
            }
        }

        @Override // io.grpc.stub.j.b, io.grpc.stub.j.f
        public k invoke(k kVar) {
            throw new AssertionError();
        }
    }
}
