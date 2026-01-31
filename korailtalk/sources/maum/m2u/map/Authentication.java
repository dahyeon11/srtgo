package maum.m2u.map;

import ai.maum.m2u.cdk.MapIf;
import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5196b;
import com.google.protobuf.AbstractC5199c;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.AbstractC5227l0;
import com.google.protobuf.AbstractC5235o;
import com.google.protobuf.AbstractC5245r1;
import com.google.protobuf.AbstractC5248t;
import com.google.protobuf.C5213g1;
import com.google.protobuf.C5228l1;
import com.google.protobuf.C5230m0;
import com.google.protobuf.C5240p1;
import com.google.protobuf.C5269x;
import com.google.protobuf.E1;
import com.google.protobuf.G1;
import com.google.protobuf.H0;
import com.google.protobuf.InterfaceC5243q1;
import com.google.protobuf.K;
import com.google.protobuf.K0;
import com.google.protobuf.M;
import com.google.protobuf.N0;
import com.google.protobuf.Z0;
import com.google.protobuf.r;
import com.google.protobuf.w1;
import com.google.protobuf.x1;
import com.google.protobuf.y1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import maum.m2u.common.DeviceOuterClass;
import maum.m2u.common.UserOuterClass;

/* loaded from: classes3.dex */
public final class Authentication {
    private static C5269x.h descriptor = C5269x.h.internalBuildGeneratedFileFrom(new String[]{"\n!maum/m2u/map/authentication.proto\u0012\fmaum.m2u.map\u001a\u001fgoogle/protobuf/timestamp.proto\u001a\u001cgoogle/protobuf/struct.proto\u001a\u001amaum/m2u/common/user.proto\u001a\u001cmaum/m2u/common/device.proto\"\u001d\n\u0007UserKey\u0012\u0012\n\nauth_token\u0018\u0001 \u0001(\t\"M\n\fUserSettings\u0012\u0012\n\nauth_token\u0018\u0001 \u0001(\t\u0012)\n\bsettings\u0018\u0002 \u0001(\u000b2\u0017.google.protobuf.Struct\"4\n\u0013AuthenticationParam\u0012\u000e\n\u0006method\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t\"\u0095\u0001\n\rSignInPayload\u0012\u000f\n\u0007userkey\u0018\u0001 \u0001(\t\u0012\u0012\n\npassphrase\u0018\u0002 \u0001(\t\u00126\n\u000bauth_params\u0018\u0003 \u0003(\u000b2!.maum.m2u.map.AuthenticationParam\u0012'\n\u0006device\u0018\u0004 \u0001(\u000b2\u0017.maum.m2u.common.Device\"è\u0001\n\u0013SignInResultPayload\u00126\n\fauth_success\u0018\u0001 \u0001(\u000b2\u001e.maum.m2u.map.AuthTokenPayloadH\u0000\u00128\n\fauth_failure\u0018\u0002 \u0001(\u000b2 .maum.m2u.map.AuthFailurePayloadH\u0000\u0012P\n\u0019multi_factor_auth_request\u0018\u0003 \u0001(\u000b2+.maum.m2u.map.MultiFactorAuthRequestPayloadH\u0000B\r\n\u000btest_result\"c\n\u0010AuthTokenPayload\u0012\u0012\n\nauth_token\u0018\u0001 \u0001(\t\u0012\u0014\n\fmulti_factor\u0018\u0002 \u0001(\b\u0012%\n\u0004meta\u0018\u0003 \u0001(\u000b2\u0017.google.protobuf.Struct\"O\n\u0012AuthFailurePayload\u0012\u0010\n\bres_code\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007message\u0018\u0002 \u0001(\t\u0012\u0016\n\u000edetail_message\u0018\u0003 \u0001(\t\"ï\u0001\n\u001dMultiFactorAuthRequestPayload\u0012\u0017\n\u000ftemp_auth_token\u0018\u0001 \u0001(\t\u0012d\n\u0019multi_factor_auth_methods\u0018\u0002 \u0003(\u000b2A.maum.m2u.map.MultiFactorAuthRequestPayload.MultiFactorAuthMethod\u001aO\n\u0015MultiFactorAuthMethod\u0012\u000e\n\u0006method\u0018\u0001 \u0001(\t\u0012&\n\u0005param\u0018\u0002 \u0001(\u000b2\u0017.google.protobuf.Struct\"Ô\u0002\n\u0018MultiFactorVerifyPayload\u0012\u0017\n\u000ftemp_auth_token\u0018\u0001 \u0001(\t\u00126\n\u000bauth_params\u0018\u0002 \u0003(\u000b2!.maum.m2u.map.AuthenticationParam\u0012_\n\u0019multi_factor_auth_results\u0018\u0003 \u0003(\u000b2<.maum.m2u.map.MultiFactorVerifyPayload.MultiFactorAuthResult\u0012'\n\u0006device\u0018\u0004 \u0001(\u000b2\u0017.maum.m2u.common.Device\u001a]\n\u0015MultiFactorAuthResult\u0012\u000e\n\u0006method\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t\u0012%\n\u0004meta\u0018\u0003 \u0001(\u000b2\u0017.google.protobuf.Struct\"6\n\u000eSignOutPayload\u0012\u0012\n\nauth_token\u0018\u0001 \u0001(\t\u0012\u0010\n\buser_key\u0018\u0002 \u0001(\t\"'\n\u0014SignOutResultPayload\u0012\u000f\n\u0007message\u0018\u0001 \u0001(\t\"$\n\u000eIsValidRequest\u0012\u0012\n\nauth_token\u0018\u0001 \u0001(\t\"\u009e\u0001\n\u000fIsValidResponse\u0012\u0010\n\bis_valid\u0018\u0001 \u0001(\b\u0012\u0014\n\faccess_token\u0018\u0002 \u0001(\t\u0012.\n\nexpired_at\u0018\u0003 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u00123\n\u0012volitile_user_meta\u0018\u0004 \u0001(\u000b2\u0017.google.protobuf.Struct\"*\n\u0012GetUserInfoRequest\u0012\u0014\n\faccess_token\u0018\u0001 \u0001(\t\":\n\u0013GetUserInfoResponse\u0012#\n\u0004user\u0018\u0001 \u0001(\u000b2\u0015.maum.m2u.common.User2£\u0003\n\u0016AuthenticationProvider\u0012H\n\u0006SignIn\u0012\u001b.maum.m2u.map.SignInPayload\u001a!.maum.m2u.map.SignInResultPayload\u0012^\n\u0011MultiFactorVerify\u0012&.maum.m2u.map.MultiFactorVerifyPayload\u001a!.maum.m2u.map.SignInResultPayload\u0012K\n\u0007SignOut\u0012\u001c.maum.m2u.map.SignOutPayload\u001a\".maum.m2u.map.SignOutResultPayload\u0012L\n\u0012UpdateUserSettings\u0012\u001a.maum.m2u.map.UserSettings\u001a\u001a.maum.m2u.map.UserSettings\u0012D\n\u000fGetUserSettings\u0012\u0015.maum.m2u.map.UserKey\u001a\u001a.maum.m2u.map.UserSettings2³\u0001\n\u0015AuthorizationProvider\u0012F\n\u0007IsValid\u0012\u001c.maum.m2u.map.IsValidRequest\u001a\u001d.maum.m2u.map.IsValidResponse\u0012R\n\u000bGetUserInfo\u0012 .maum.m2u.map.GetUserInfoRequest\u001a!.maum.m2u.map.GetUserInfoResponseb\u0006proto3"}, new C5269x.h[]{y1.getDescriptor(), AbstractC5245r1.getDescriptor(), UserOuterClass.getDescriptor(), DeviceOuterClass.getDescriptor()});
    private static final C5269x.b internal_static_maum_m2u_map_AuthFailurePayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_AuthFailurePayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_AuthTokenPayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_AuthTokenPayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_AuthenticationParam_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_AuthenticationParam_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_GetUserInfoRequest_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_GetUserInfoRequest_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_GetUserInfoResponse_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_GetUserInfoResponse_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_IsValidRequest_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_IsValidRequest_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_IsValidResponse_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_IsValidResponse_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_MultiFactorAuthRequestPayload_MultiFactorAuthMethod_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_MultiFactorAuthRequestPayload_MultiFactorAuthMethod_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_MultiFactorAuthRequestPayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_MultiFactorAuthRequestPayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_MultiFactorVerifyPayload_MultiFactorAuthResult_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_MultiFactorVerifyPayload_MultiFactorAuthResult_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_MultiFactorVerifyPayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_MultiFactorVerifyPayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_SignInPayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_SignInPayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_SignInResultPayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_SignInResultPayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_SignOutPayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_SignOutPayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_SignOutResultPayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_SignOutResultPayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_UserKey_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_UserKey_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_UserSettings_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_UserSettings_fieldAccessorTable;

    /* renamed from: maum.m2u.map.Authentication$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$maum$m2u$map$Authentication$SignInResultPayload$TestResultCase;

        static {
            int[] iArr = new int[SignInResultPayload.TestResultCase.values().length];
            $SwitchMap$maum$m2u$map$Authentication$SignInResultPayload$TestResultCase = iArr;
            try {
                iArr[SignInResultPayload.TestResultCase.AUTH_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$maum$m2u$map$Authentication$SignInResultPayload$TestResultCase[SignInResultPayload.TestResultCase.AUTH_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$maum$m2u$map$Authentication$SignInResultPayload$TestResultCase[SignInResultPayload.TestResultCase.MULTI_FACTOR_AUTH_REQUEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$maum$m2u$map$Authentication$SignInResultPayload$TestResultCase[SignInResultPayload.TestResultCase.TESTRESULT_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class AuthFailurePayload extends AbstractC5209f0 implements AuthFailurePayloadOrBuilder {
        public static final int DETAIL_MESSAGE_FIELD_NUMBER = 3;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        public static final int RES_CODE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object detailMessage_;
        private byte memoizedIsInitialized;
        private volatile Object message_;
        private volatile Object resCode_;
        private static final AuthFailurePayload DEFAULT_INSTANCE = new AuthFailurePayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Authentication.AuthFailurePayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public AuthFailurePayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = AuthFailurePayload.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements AuthFailurePayloadOrBuilder {
            private int bitField0_;
            private Object detailMessage_;
            private Object message_;
            private Object resCode_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(AuthFailurePayload authFailurePayload) {
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    authFailurePayload.resCode_ = this.resCode_;
                }
                if ((i8 & 2) != 0) {
                    authFailurePayload.message_ = this.message_;
                }
                if ((i8 & 4) != 0) {
                    authFailurePayload.detailMessage_ = this.detailMessage_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return Authentication.internal_static_maum_m2u_map_AuthFailurePayload_descriptor;
            }

            public Builder clearDetailMessage() {
                this.detailMessage_ = AuthFailurePayload.getDefaultInstance().getDetailMessage();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearMessage() {
                this.message_ = AuthFailurePayload.getDefaultInstance().getMessage();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearResCode() {
                this.resCode_ = AuthFailurePayload.getDefaultInstance().getResCode();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Authentication.internal_static_maum_m2u_map_AuthFailurePayload_descriptor;
            }

            @Override // maum.m2u.map.Authentication.AuthFailurePayloadOrBuilder
            public String getDetailMessage() {
                Object obj = this.detailMessage_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.detailMessage_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Authentication.AuthFailurePayloadOrBuilder
            public AbstractC5235o getDetailMessageBytes() {
                Object obj = this.detailMessage_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.detailMessage_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Authentication.AuthFailurePayloadOrBuilder
            public String getMessage() {
                Object obj = this.message_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.message_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Authentication.AuthFailurePayloadOrBuilder
            public AbstractC5235o getMessageBytes() {
                Object obj = this.message_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.message_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Authentication.AuthFailurePayloadOrBuilder
            public String getResCode() {
                Object obj = this.resCode_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.resCode_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Authentication.AuthFailurePayloadOrBuilder
            public AbstractC5235o getResCodeBytes() {
                Object obj = this.resCode_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.resCode_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Authentication.internal_static_maum_m2u_map_AuthFailurePayload_fieldAccessorTable.ensureFieldAccessorsInitialized(AuthFailurePayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDetailMessage(String str) {
                str.getClass();
                this.detailMessage_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setDetailMessageBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.detailMessage_ = abstractC5235o;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMessage(String str) {
                str.getClass();
                this.message_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMessageBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.message_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setResCode(String str) {
                str.getClass();
                this.resCode_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setResCodeBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.resCode_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.resCode_ = "";
                this.message_ = "";
                this.detailMessage_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public AuthFailurePayload build() {
                AuthFailurePayload authFailurePayloadBuildPartial = buildPartial();
                if (authFailurePayloadBuildPartial.isInitialized()) {
                    return authFailurePayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) authFailurePayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public AuthFailurePayload buildPartial() {
                AuthFailurePayload authFailurePayload = new AuthFailurePayload(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(authFailurePayload);
                }
                onBuilt();
                return authFailurePayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public AuthFailurePayload getDefaultInstanceForType() {
                return AuthFailurePayload.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.resCode_ = "";
                this.message_ = "";
                this.detailMessage_ = "";
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.resCode_ = "";
                this.message_ = "";
                this.detailMessage_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof AuthFailurePayload) {
                    return mergeFrom((AuthFailurePayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder mergeFrom(AuthFailurePayload authFailurePayload) {
                if (authFailurePayload == AuthFailurePayload.getDefaultInstance()) {
                    return this;
                }
                if (!authFailurePayload.getResCode().isEmpty()) {
                    this.resCode_ = authFailurePayload.resCode_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!authFailurePayload.getMessage().isEmpty()) {
                    this.message_ = authFailurePayload.message_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!authFailurePayload.getDetailMessage().isEmpty()) {
                    this.detailMessage_ = authFailurePayload.detailMessage_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                mergeUnknownFields(authFailurePayload.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.resCode_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.message_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.detailMessage_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ AuthFailurePayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static AuthFailurePayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Authentication.internal_static_maum_m2u_map_AuthFailurePayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AuthFailurePayload parseDelimitedFrom(InputStream inputStream) {
            return (AuthFailurePayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AuthFailurePayload parseFrom(ByteBuffer byteBuffer) {
            return (AuthFailurePayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AuthFailurePayload)) {
                return super.equals(obj);
            }
            AuthFailurePayload authFailurePayload = (AuthFailurePayload) obj;
            return getResCode().equals(authFailurePayload.getResCode()) && getMessage().equals(authFailurePayload.getMessage()) && getDetailMessage().equals(authFailurePayload.getDetailMessage()) && getUnknownFields().equals(authFailurePayload.getUnknownFields());
        }

        @Override // maum.m2u.map.Authentication.AuthFailurePayloadOrBuilder
        public String getDetailMessage() {
            Object obj = this.detailMessage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.detailMessage_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Authentication.AuthFailurePayloadOrBuilder
        public AbstractC5235o getDetailMessageBytes() {
            Object obj = this.detailMessage_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.detailMessage_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.map.Authentication.AuthFailurePayloadOrBuilder
        public String getMessage() {
            Object obj = this.message_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.message_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Authentication.AuthFailurePayloadOrBuilder
        public AbstractC5235o getMessageBytes() {
            Object obj = this.message_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.message_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.map.Authentication.AuthFailurePayloadOrBuilder
        public String getResCode() {
            Object obj = this.resCode_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.resCode_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Authentication.AuthFailurePayloadOrBuilder
        public AbstractC5235o getResCodeBytes() {
            Object obj = this.resCode_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.resCode_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.resCode_) ? AbstractC5209f0.computeStringSize(1, this.resCode_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.message_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.message_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.detailMessage_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(3, this.detailMessage_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getResCode().hashCode()) * 37) + 2) * 53) + getMessage().hashCode()) * 37) + 3) * 53) + getDetailMessage().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Authentication.internal_static_maum_m2u_map_AuthFailurePayload_fieldAccessorTable.ensureFieldAccessorsInitialized(AuthFailurePayload.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new AuthFailurePayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.resCode_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.resCode_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.message_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.message_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.detailMessage_)) {
                AbstractC5209f0.writeString(abstractC5248t, 3, this.detailMessage_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private AuthFailurePayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.resCode_ = "";
            this.message_ = "";
            this.detailMessage_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(AuthFailurePayload authFailurePayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(authFailurePayload);
        }

        public static AuthFailurePayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (AuthFailurePayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static AuthFailurePayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (AuthFailurePayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static AuthFailurePayload parseFrom(AbstractC5235o abstractC5235o) {
            return (AuthFailurePayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public AuthFailurePayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static AuthFailurePayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (AuthFailurePayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AuthFailurePayload parseFrom(byte[] bArr) {
            return (AuthFailurePayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static AuthFailurePayload parseFrom(byte[] bArr, M m8) {
            return (AuthFailurePayload) PARSER.parseFrom(bArr, m8);
        }

        private AuthFailurePayload() {
            this.resCode_ = "";
            this.message_ = "";
            this.detailMessage_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.resCode_ = "";
            this.message_ = "";
            this.detailMessage_ = "";
        }

        public static AuthFailurePayload parseFrom(InputStream inputStream) {
            return (AuthFailurePayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static AuthFailurePayload parseFrom(InputStream inputStream, M m8) {
            return (AuthFailurePayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static AuthFailurePayload parseFrom(r rVar) {
            return (AuthFailurePayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static AuthFailurePayload parseFrom(r rVar, M m8) {
            return (AuthFailurePayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface AuthFailurePayloadOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        String getDetailMessage();

        AbstractC5235o getDetailMessageBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        String getMessage();

        AbstractC5235o getMessageBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        String getResCode();

        AbstractC5235o getResCodeBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class AuthTokenPayload extends AbstractC5209f0 implements AuthTokenPayloadOrBuilder {
        public static final int AUTH_TOKEN_FIELD_NUMBER = 1;
        public static final int META_FIELD_NUMBER = 3;
        public static final int MULTI_FACTOR_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private volatile Object authToken_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private C5240p1 meta_;
        private boolean multiFactor_;
        private static final AuthTokenPayload DEFAULT_INSTANCE = new AuthTokenPayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Authentication.AuthTokenPayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public AuthTokenPayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = AuthTokenPayload.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements AuthTokenPayloadOrBuilder {
            private Object authToken_;
            private int bitField0_;
            private C5228l1 metaBuilder_;
            private C5240p1 meta_;
            private boolean multiFactor_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(AuthTokenPayload authTokenPayload) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    authTokenPayload.authToken_ = this.authToken_;
                }
                if ((i9 & 2) != 0) {
                    authTokenPayload.multiFactor_ = this.multiFactor_;
                }
                if ((i9 & 4) != 0) {
                    C5228l1 c5228l1 = this.metaBuilder_;
                    authTokenPayload.meta_ = c5228l1 == null ? this.meta_ : (C5240p1) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                AuthTokenPayload.access$5676(authTokenPayload, i8);
            }

            public static final C5269x.b getDescriptor() {
                return Authentication.internal_static_maum_m2u_map_AuthTokenPayload_descriptor;
            }

            private C5228l1 getMetaFieldBuilder() {
                if (this.metaBuilder_ == null) {
                    this.metaBuilder_ = new C5228l1(getMeta(), getParentForChildren(), isClean());
                    this.meta_ = null;
                }
                return this.metaBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getMetaFieldBuilder();
                }
            }

            public Builder clearAuthToken() {
                this.authToken_ = AuthTokenPayload.getDefaultInstance().getAuthToken();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearMeta() {
                this.bitField0_ &= -5;
                this.meta_ = null;
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.metaBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearMultiFactor() {
                this.bitField0_ &= -3;
                this.multiFactor_ = false;
                onChanged();
                return this;
            }

            @Override // maum.m2u.map.Authentication.AuthTokenPayloadOrBuilder
            public String getAuthToken() {
                Object obj = this.authToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.authToken_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Authentication.AuthTokenPayloadOrBuilder
            public AbstractC5235o getAuthTokenBytes() {
                Object obj = this.authToken_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.authToken_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Authentication.internal_static_maum_m2u_map_AuthTokenPayload_descriptor;
            }

            @Override // maum.m2u.map.Authentication.AuthTokenPayloadOrBuilder
            public C5240p1 getMeta() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    return (C5240p1) c5228l1.getMessage();
                }
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            public C5240p1.b getMetaBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (C5240p1.b) getMetaFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Authentication.AuthTokenPayloadOrBuilder
            public InterfaceC5243q1 getMetaOrBuilder() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                }
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.map.Authentication.AuthTokenPayloadOrBuilder
            public boolean getMultiFactor() {
                return this.multiFactor_;
            }

            @Override // maum.m2u.map.Authentication.AuthTokenPayloadOrBuilder
            public boolean hasMeta() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Authentication.internal_static_maum_m2u_map_AuthTokenPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(AuthTokenPayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeMeta(C5240p1 c5240p1) {
                C5240p1 c5240p12;
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(c5240p1);
                } else if ((this.bitField0_ & 4) == 0 || (c5240p12 = this.meta_) == null || c5240p12 == C5240p1.getDefaultInstance()) {
                    this.meta_ = c5240p1;
                } else {
                    getMetaBuilder().mergeFrom(c5240p1);
                }
                if (this.meta_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder setAuthToken(String str) {
                str.getClass();
                this.authToken_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAuthTokenBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.authToken_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMeta(C5240p1 c5240p1) {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 == null) {
                    c5240p1.getClass();
                    this.meta_ = c5240p1;
                } else {
                    c5228l1.setMessage(c5240p1);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMultiFactor(boolean z8) {
                this.multiFactor_ = z8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.authToken_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public AuthTokenPayload build() {
                AuthTokenPayload authTokenPayloadBuildPartial = buildPartial();
                if (authTokenPayloadBuildPartial.isInitialized()) {
                    return authTokenPayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) authTokenPayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public AuthTokenPayload buildPartial() {
                AuthTokenPayload authTokenPayload = new AuthTokenPayload(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(authTokenPayload);
                }
                onBuilt();
                return authTokenPayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public AuthTokenPayload getDefaultInstanceForType() {
                return AuthTokenPayload.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.authToken_ = "";
                this.multiFactor_ = false;
                this.meta_ = null;
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.metaBuilder_ = null;
                }
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.authToken_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof AuthTokenPayload) {
                    return mergeFrom((AuthTokenPayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setMeta(C5240p1.b bVar) {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 == null) {
                    this.meta_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder mergeFrom(AuthTokenPayload authTokenPayload) {
                if (authTokenPayload == AuthTokenPayload.getDefaultInstance()) {
                    return this;
                }
                if (!authTokenPayload.getAuthToken().isEmpty()) {
                    this.authToken_ = authTokenPayload.authToken_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (authTokenPayload.getMultiFactor()) {
                    setMultiFactor(authTokenPayload.getMultiFactor());
                }
                if (authTokenPayload.hasMeta()) {
                    mergeMeta(authTokenPayload.getMeta());
                }
                mergeUnknownFields(authTokenPayload.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.authToken_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.multiFactor_ = rVar.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getMetaFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 4;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ AuthTokenPayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$5676(AuthTokenPayload authTokenPayload, int i8) {
            int i9 = i8 | authTokenPayload.bitField0_;
            authTokenPayload.bitField0_ = i9;
            return i9;
        }

        public static AuthTokenPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Authentication.internal_static_maum_m2u_map_AuthTokenPayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AuthTokenPayload parseDelimitedFrom(InputStream inputStream) {
            return (AuthTokenPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AuthTokenPayload parseFrom(ByteBuffer byteBuffer) {
            return (AuthTokenPayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AuthTokenPayload)) {
                return super.equals(obj);
            }
            AuthTokenPayload authTokenPayload = (AuthTokenPayload) obj;
            if (getAuthToken().equals(authTokenPayload.getAuthToken()) && getMultiFactor() == authTokenPayload.getMultiFactor() && hasMeta() == authTokenPayload.hasMeta()) {
                return (!hasMeta() || getMeta().equals(authTokenPayload.getMeta())) && getUnknownFields().equals(authTokenPayload.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.map.Authentication.AuthTokenPayloadOrBuilder
        public String getAuthToken() {
            Object obj = this.authToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.authToken_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Authentication.AuthTokenPayloadOrBuilder
        public AbstractC5235o getAuthTokenBytes() {
            Object obj = this.authToken_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.authToken_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.map.Authentication.AuthTokenPayloadOrBuilder
        public C5240p1 getMeta() {
            C5240p1 c5240p1 = this.meta_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.map.Authentication.AuthTokenPayloadOrBuilder
        public InterfaceC5243q1 getMetaOrBuilder() {
            C5240p1 c5240p1 = this.meta_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.map.Authentication.AuthTokenPayloadOrBuilder
        public boolean getMultiFactor() {
            return this.multiFactor_;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.authToken_) ? AbstractC5209f0.computeStringSize(1, this.authToken_) : 0;
            boolean z8 = this.multiFactor_;
            if (z8) {
                iComputeStringSize += AbstractC5248t.computeBoolSize(2, z8);
            }
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(3, getMeta());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Authentication.AuthTokenPayloadOrBuilder
        public boolean hasMeta() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAuthToken().hashCode()) * 37) + 2) * 53) + AbstractC5227l0.hashBoolean(getMultiFactor());
            if (hasMeta()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getMeta().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Authentication.internal_static_maum_m2u_map_AuthTokenPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(AuthTokenPayload.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new AuthTokenPayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.authToken_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.authToken_);
            }
            boolean z8 = this.multiFactor_;
            if (z8) {
                abstractC5248t.writeBool(2, z8);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(3, getMeta());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private AuthTokenPayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.authToken_ = "";
            this.multiFactor_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(AuthTokenPayload authTokenPayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(authTokenPayload);
        }

        public static AuthTokenPayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (AuthTokenPayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static AuthTokenPayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (AuthTokenPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static AuthTokenPayload parseFrom(AbstractC5235o abstractC5235o) {
            return (AuthTokenPayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public AuthTokenPayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static AuthTokenPayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (AuthTokenPayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AuthTokenPayload parseFrom(byte[] bArr) {
            return (AuthTokenPayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        private AuthTokenPayload() {
            this.authToken_ = "";
            this.multiFactor_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.authToken_ = "";
        }

        public static AuthTokenPayload parseFrom(byte[] bArr, M m8) {
            return (AuthTokenPayload) PARSER.parseFrom(bArr, m8);
        }

        public static AuthTokenPayload parseFrom(InputStream inputStream) {
            return (AuthTokenPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static AuthTokenPayload parseFrom(InputStream inputStream, M m8) {
            return (AuthTokenPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static AuthTokenPayload parseFrom(r rVar) {
            return (AuthTokenPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static AuthTokenPayload parseFrom(r rVar, M m8) {
            return (AuthTokenPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface AuthTokenPayloadOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        String getAuthToken();

        AbstractC5235o getAuthTokenBytes();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        C5240p1 getMeta();

        InterfaceC5243q1 getMetaOrBuilder();

        boolean getMultiFactor();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        boolean hasMeta();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class AuthenticationParam extends AbstractC5209f0 implements AuthenticationParamOrBuilder {
        public static final int METHOD_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object method_;
        private volatile Object value_;
        private static final AuthenticationParam DEFAULT_INSTANCE = new AuthenticationParam();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Authentication.AuthenticationParam.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public AuthenticationParam parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = AuthenticationParam.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements AuthenticationParamOrBuilder {
            private int bitField0_;
            private Object method_;
            private Object value_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(AuthenticationParam authenticationParam) {
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    authenticationParam.method_ = this.method_;
                }
                if ((i8 & 2) != 0) {
                    authenticationParam.value_ = this.value_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return Authentication.internal_static_maum_m2u_map_AuthenticationParam_descriptor;
            }

            public Builder clearMethod() {
                this.method_ = AuthenticationParam.getDefaultInstance().getMethod();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearValue() {
                this.value_ = AuthenticationParam.getDefaultInstance().getValue();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Authentication.internal_static_maum_m2u_map_AuthenticationParam_descriptor;
            }

            @Override // maum.m2u.map.Authentication.AuthenticationParamOrBuilder
            public String getMethod() {
                Object obj = this.method_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.method_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Authentication.AuthenticationParamOrBuilder
            public AbstractC5235o getMethodBytes() {
                Object obj = this.method_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.method_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Authentication.AuthenticationParamOrBuilder
            public String getValue() {
                Object obj = this.value_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.value_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Authentication.AuthenticationParamOrBuilder
            public AbstractC5235o getValueBytes() {
                Object obj = this.value_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.value_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Authentication.internal_static_maum_m2u_map_AuthenticationParam_fieldAccessorTable.ensureFieldAccessorsInitialized(AuthenticationParam.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder setMethod(String str) {
                str.getClass();
                this.method_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMethodBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.method_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setValue(String str) {
                str.getClass();
                this.value_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setValueBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.value_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.method_ = "";
                this.value_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public AuthenticationParam build() {
                AuthenticationParam authenticationParamBuildPartial = buildPartial();
                if (authenticationParamBuildPartial.isInitialized()) {
                    return authenticationParamBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) authenticationParamBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public AuthenticationParam buildPartial() {
                AuthenticationParam authenticationParam = new AuthenticationParam(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(authenticationParam);
                }
                onBuilt();
                return authenticationParam;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public AuthenticationParam getDefaultInstanceForType() {
                return AuthenticationParam.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.method_ = "";
                this.value_ = "";
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.method_ = "";
                this.value_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof AuthenticationParam) {
                    return mergeFrom((AuthenticationParam) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder mergeFrom(AuthenticationParam authenticationParam) {
                if (authenticationParam == AuthenticationParam.getDefaultInstance()) {
                    return this;
                }
                if (!authenticationParam.getMethod().isEmpty()) {
                    this.method_ = authenticationParam.method_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!authenticationParam.getValue().isEmpty()) {
                    this.value_ = authenticationParam.value_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(authenticationParam.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.method_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.value_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ AuthenticationParam(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static AuthenticationParam getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Authentication.internal_static_maum_m2u_map_AuthenticationParam_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AuthenticationParam parseDelimitedFrom(InputStream inputStream) {
            return (AuthenticationParam) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AuthenticationParam parseFrom(ByteBuffer byteBuffer) {
            return (AuthenticationParam) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AuthenticationParam)) {
                return super.equals(obj);
            }
            AuthenticationParam authenticationParam = (AuthenticationParam) obj;
            return getMethod().equals(authenticationParam.getMethod()) && getValue().equals(authenticationParam.getValue()) && getUnknownFields().equals(authenticationParam.getUnknownFields());
        }

        @Override // maum.m2u.map.Authentication.AuthenticationParamOrBuilder
        public String getMethod() {
            Object obj = this.method_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.method_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Authentication.AuthenticationParamOrBuilder
        public AbstractC5235o getMethodBytes() {
            Object obj = this.method_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.method_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.method_) ? AbstractC5209f0.computeStringSize(1, this.method_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.value_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.value_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Authentication.AuthenticationParamOrBuilder
        public String getValue() {
            Object obj = this.value_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.value_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Authentication.AuthenticationParamOrBuilder
        public AbstractC5235o getValueBytes() {
            Object obj = this.value_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.value_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getMethod().hashCode()) * 37) + 2) * 53) + getValue().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Authentication.internal_static_maum_m2u_map_AuthenticationParam_fieldAccessorTable.ensureFieldAccessorsInitialized(AuthenticationParam.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new AuthenticationParam();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.method_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.method_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.value_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.value_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private AuthenticationParam(AbstractC5209f0.b bVar) {
            super(bVar);
            this.method_ = "";
            this.value_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(AuthenticationParam authenticationParam) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(authenticationParam);
        }

        public static AuthenticationParam parseFrom(ByteBuffer byteBuffer, M m8) {
            return (AuthenticationParam) PARSER.parseFrom(byteBuffer, m8);
        }

        public static AuthenticationParam parseDelimitedFrom(InputStream inputStream, M m8) {
            return (AuthenticationParam) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static AuthenticationParam parseFrom(AbstractC5235o abstractC5235o) {
            return (AuthenticationParam) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public AuthenticationParam getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static AuthenticationParam parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (AuthenticationParam) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AuthenticationParam parseFrom(byte[] bArr) {
            return (AuthenticationParam) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        private AuthenticationParam() {
            this.method_ = "";
            this.value_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.method_ = "";
            this.value_ = "";
        }

        public static AuthenticationParam parseFrom(byte[] bArr, M m8) {
            return (AuthenticationParam) PARSER.parseFrom(bArr, m8);
        }

        public static AuthenticationParam parseFrom(InputStream inputStream) {
            return (AuthenticationParam) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static AuthenticationParam parseFrom(InputStream inputStream, M m8) {
            return (AuthenticationParam) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static AuthenticationParam parseFrom(r rVar) {
            return (AuthenticationParam) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static AuthenticationParam parseFrom(r rVar, M m8) {
            return (AuthenticationParam) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface AuthenticationParamOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        String getMethod();

        AbstractC5235o getMethodBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        String getValue();

        AbstractC5235o getValueBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class GetUserInfoRequest extends AbstractC5209f0 implements GetUserInfoRequestOrBuilder {
        public static final int ACCESS_TOKEN_FIELD_NUMBER = 1;
        private static final GetUserInfoRequest DEFAULT_INSTANCE = new GetUserInfoRequest();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Authentication.GetUserInfoRequest.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public GetUserInfoRequest parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = GetUserInfoRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private volatile Object accessToken_;
        private byte memoizedIsInitialized;

        public static final class Builder extends AbstractC5209f0.b implements GetUserInfoRequestOrBuilder {
            private Object accessToken_;
            private int bitField0_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(GetUserInfoRequest getUserInfoRequest) {
                if ((this.bitField0_ & 1) != 0) {
                    getUserInfoRequest.accessToken_ = this.accessToken_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return Authentication.internal_static_maum_m2u_map_GetUserInfoRequest_descriptor;
            }

            public Builder clearAccessToken() {
                this.accessToken_ = GetUserInfoRequest.getDefaultInstance().getAccessToken();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // maum.m2u.map.Authentication.GetUserInfoRequestOrBuilder
            public String getAccessToken() {
                Object obj = this.accessToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.accessToken_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Authentication.GetUserInfoRequestOrBuilder
            public AbstractC5235o getAccessTokenBytes() {
                Object obj = this.accessToken_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.accessToken_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Authentication.internal_static_maum_m2u_map_GetUserInfoRequest_descriptor;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Authentication.internal_static_maum_m2u_map_GetUserInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetUserInfoRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAccessToken(String str) {
                str.getClass();
                this.accessToken_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAccessTokenBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.accessToken_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.accessToken_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public GetUserInfoRequest build() {
                GetUserInfoRequest getUserInfoRequestBuildPartial = buildPartial();
                if (getUserInfoRequestBuildPartial.isInitialized()) {
                    return getUserInfoRequestBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) getUserInfoRequestBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public GetUserInfoRequest buildPartial() {
                GetUserInfoRequest getUserInfoRequest = new GetUserInfoRequest(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(getUserInfoRequest);
                }
                onBuilt();
                return getUserInfoRequest;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public GetUserInfoRequest getDefaultInstanceForType() {
                return GetUserInfoRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.accessToken_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.accessToken_ = "";
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof GetUserInfoRequest) {
                    return mergeFrom((GetUserInfoRequest) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder mergeFrom(GetUserInfoRequest getUserInfoRequest) {
                if (getUserInfoRequest == GetUserInfoRequest.getDefaultInstance()) {
                    return this;
                }
                if (!getUserInfoRequest.getAccessToken().isEmpty()) {
                    this.accessToken_ = getUserInfoRequest.accessToken_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                mergeUnknownFields(getUserInfoRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag != 10) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.accessToken_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ GetUserInfoRequest(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static GetUserInfoRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Authentication.internal_static_maum_m2u_map_GetUserInfoRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetUserInfoRequest parseDelimitedFrom(InputStream inputStream) {
            return (GetUserInfoRequest) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetUserInfoRequest parseFrom(ByteBuffer byteBuffer) {
            return (GetUserInfoRequest) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetUserInfoRequest)) {
                return super.equals(obj);
            }
            GetUserInfoRequest getUserInfoRequest = (GetUserInfoRequest) obj;
            return getAccessToken().equals(getUserInfoRequest.getAccessToken()) && getUnknownFields().equals(getUserInfoRequest.getUnknownFields());
        }

        @Override // maum.m2u.map.Authentication.GetUserInfoRequestOrBuilder
        public String getAccessToken() {
            Object obj = this.accessToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.accessToken_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Authentication.GetUserInfoRequestOrBuilder
        public AbstractC5235o getAccessTokenBytes() {
            Object obj = this.accessToken_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.accessToken_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = (!AbstractC5209f0.isStringEmpty(this.accessToken_) ? AbstractC5209f0.computeStringSize(1, this.accessToken_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeStringSize;
            return iComputeStringSize;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAccessToken().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Authentication.internal_static_maum_m2u_map_GetUserInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetUserInfoRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new GetUserInfoRequest();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.accessToken_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.accessToken_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private GetUserInfoRequest(AbstractC5209f0.b bVar) {
            super(bVar);
            this.accessToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(GetUserInfoRequest getUserInfoRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getUserInfoRequest);
        }

        public static GetUserInfoRequest parseFrom(ByteBuffer byteBuffer, M m8) {
            return (GetUserInfoRequest) PARSER.parseFrom(byteBuffer, m8);
        }

        public static GetUserInfoRequest parseDelimitedFrom(InputStream inputStream, M m8) {
            return (GetUserInfoRequest) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static GetUserInfoRequest parseFrom(AbstractC5235o abstractC5235o) {
            return (GetUserInfoRequest) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public GetUserInfoRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static GetUserInfoRequest parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (GetUserInfoRequest) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private GetUserInfoRequest() {
            this.accessToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.accessToken_ = "";
        }

        public static GetUserInfoRequest parseFrom(byte[] bArr) {
            return (GetUserInfoRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static GetUserInfoRequest parseFrom(byte[] bArr, M m8) {
            return (GetUserInfoRequest) PARSER.parseFrom(bArr, m8);
        }

        public static GetUserInfoRequest parseFrom(InputStream inputStream) {
            return (GetUserInfoRequest) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static GetUserInfoRequest parseFrom(InputStream inputStream, M m8) {
            return (GetUserInfoRequest) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static GetUserInfoRequest parseFrom(r rVar) {
            return (GetUserInfoRequest) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static GetUserInfoRequest parseFrom(r rVar, M m8) {
            return (GetUserInfoRequest) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface GetUserInfoRequestOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        String getAccessToken();

        AbstractC5235o getAccessTokenBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class GetUserInfoResponse extends AbstractC5209f0 implements GetUserInfoResponseOrBuilder {
        private static final GetUserInfoResponse DEFAULT_INSTANCE = new GetUserInfoResponse();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Authentication.GetUserInfoResponse.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public GetUserInfoResponse parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = GetUserInfoResponse.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int USER_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private UserOuterClass.User user_;

        public static final class Builder extends AbstractC5209f0.b implements GetUserInfoResponseOrBuilder {
            private int bitField0_;
            private C5228l1 userBuilder_;
            private UserOuterClass.User user_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(GetUserInfoResponse getUserInfoResponse) {
                int i8 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    C5228l1 c5228l1 = this.userBuilder_;
                    getUserInfoResponse.user_ = c5228l1 == null ? this.user_ : (UserOuterClass.User) c5228l1.build();
                } else {
                    i8 = 0;
                }
                GetUserInfoResponse.access$16376(getUserInfoResponse, i8);
            }

            public static final C5269x.b getDescriptor() {
                return Authentication.internal_static_maum_m2u_map_GetUserInfoResponse_descriptor;
            }

            private C5228l1 getUserFieldBuilder() {
                if (this.userBuilder_ == null) {
                    this.userBuilder_ = new C5228l1(getUser(), getParentForChildren(), isClean());
                    this.user_ = null;
                }
                return this.userBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getUserFieldBuilder();
                }
            }

            public Builder clearUser() {
                this.bitField0_ &= -2;
                this.user_ = null;
                C5228l1 c5228l1 = this.userBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.userBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Authentication.internal_static_maum_m2u_map_GetUserInfoResponse_descriptor;
            }

            @Override // maum.m2u.map.Authentication.GetUserInfoResponseOrBuilder
            public UserOuterClass.User getUser() {
                C5228l1 c5228l1 = this.userBuilder_;
                if (c5228l1 != null) {
                    return (UserOuterClass.User) c5228l1.getMessage();
                }
                UserOuterClass.User user = this.user_;
                return user == null ? UserOuterClass.User.getDefaultInstance() : user;
            }

            public UserOuterClass.User.Builder getUserBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (UserOuterClass.User.Builder) getUserFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Authentication.GetUserInfoResponseOrBuilder
            public UserOuterClass.UserOrBuilder getUserOrBuilder() {
                C5228l1 c5228l1 = this.userBuilder_;
                if (c5228l1 != null) {
                    return (UserOuterClass.UserOrBuilder) c5228l1.getMessageOrBuilder();
                }
                UserOuterClass.User user = this.user_;
                return user == null ? UserOuterClass.User.getDefaultInstance() : user;
            }

            @Override // maum.m2u.map.Authentication.GetUserInfoResponseOrBuilder
            public boolean hasUser() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Authentication.internal_static_maum_m2u_map_GetUserInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetUserInfoResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeUser(UserOuterClass.User user) {
                UserOuterClass.User user2;
                C5228l1 c5228l1 = this.userBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(user);
                } else if ((this.bitField0_ & 1) == 0 || (user2 = this.user_) == null || user2 == UserOuterClass.User.getDefaultInstance()) {
                    this.user_ = user;
                } else {
                    getUserBuilder().mergeFrom(user);
                }
                if (this.user_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder setUser(UserOuterClass.User user) {
                C5228l1 c5228l1 = this.userBuilder_;
                if (c5228l1 == null) {
                    user.getClass();
                    this.user_ = user;
                } else {
                    c5228l1.setMessage(user);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public GetUserInfoResponse build() {
                GetUserInfoResponse getUserInfoResponseBuildPartial = buildPartial();
                if (getUserInfoResponseBuildPartial.isInitialized()) {
                    return getUserInfoResponseBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) getUserInfoResponseBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public GetUserInfoResponse buildPartial() {
                GetUserInfoResponse getUserInfoResponse = new GetUserInfoResponse(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(getUserInfoResponse);
                }
                onBuilt();
                return getUserInfoResponse;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public GetUserInfoResponse getDefaultInstanceForType() {
                return GetUserInfoResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.user_ = null;
                C5228l1 c5228l1 = this.userBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.userBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof GetUserInfoResponse) {
                    return mergeFrom((GetUserInfoResponse) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setUser(UserOuterClass.User.Builder builder) {
                C5228l1 c5228l1 = this.userBuilder_;
                if (c5228l1 == null) {
                    this.user_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder mergeFrom(GetUserInfoResponse getUserInfoResponse) {
                if (getUserInfoResponse == GetUserInfoResponse.getDefaultInstance()) {
                    return this;
                }
                if (getUserInfoResponse.hasUser()) {
                    mergeUser(getUserInfoResponse.getUser());
                }
                mergeUnknownFields(getUserInfoResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag != 10) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getUserFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 1;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ GetUserInfoResponse(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$16376(GetUserInfoResponse getUserInfoResponse, int i8) {
            int i9 = i8 | getUserInfoResponse.bitField0_;
            getUserInfoResponse.bitField0_ = i9;
            return i9;
        }

        public static GetUserInfoResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Authentication.internal_static_maum_m2u_map_GetUserInfoResponse_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetUserInfoResponse parseDelimitedFrom(InputStream inputStream) {
            return (GetUserInfoResponse) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetUserInfoResponse parseFrom(ByteBuffer byteBuffer) {
            return (GetUserInfoResponse) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetUserInfoResponse)) {
                return super.equals(obj);
            }
            GetUserInfoResponse getUserInfoResponse = (GetUserInfoResponse) obj;
            if (hasUser() != getUserInfoResponse.hasUser()) {
                return false;
            }
            return (!hasUser() || getUser().equals(getUserInfoResponse.getUser())) && getUnknownFields().equals(getUserInfoResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeMessageSize = ((this.bitField0_ & 1) != 0 ? AbstractC5248t.computeMessageSize(1, getUser()) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeMessageSize;
            return iComputeMessageSize;
        }

        @Override // maum.m2u.map.Authentication.GetUserInfoResponseOrBuilder
        public UserOuterClass.User getUser() {
            UserOuterClass.User user = this.user_;
            return user == null ? UserOuterClass.User.getDefaultInstance() : user;
        }

        @Override // maum.m2u.map.Authentication.GetUserInfoResponseOrBuilder
        public UserOuterClass.UserOrBuilder getUserOrBuilder() {
            UserOuterClass.User user = this.user_;
            return user == null ? UserOuterClass.User.getDefaultInstance() : user;
        }

        @Override // maum.m2u.map.Authentication.GetUserInfoResponseOrBuilder
        public boolean hasUser() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasUser()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getUser().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Authentication.internal_static_maum_m2u_map_GetUserInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetUserInfoResponse.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new GetUserInfoResponse();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(1, getUser());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private GetUserInfoResponse(AbstractC5209f0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(GetUserInfoResponse getUserInfoResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getUserInfoResponse);
        }

        public static GetUserInfoResponse parseFrom(ByteBuffer byteBuffer, M m8) {
            return (GetUserInfoResponse) PARSER.parseFrom(byteBuffer, m8);
        }

        public static GetUserInfoResponse parseDelimitedFrom(InputStream inputStream, M m8) {
            return (GetUserInfoResponse) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static GetUserInfoResponse parseFrom(AbstractC5235o abstractC5235o) {
            return (GetUserInfoResponse) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public GetUserInfoResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        private GetUserInfoResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetUserInfoResponse parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (GetUserInfoResponse) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetUserInfoResponse parseFrom(byte[] bArr) {
            return (GetUserInfoResponse) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static GetUserInfoResponse parseFrom(byte[] bArr, M m8) {
            return (GetUserInfoResponse) PARSER.parseFrom(bArr, m8);
        }

        public static GetUserInfoResponse parseFrom(InputStream inputStream) {
            return (GetUserInfoResponse) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static GetUserInfoResponse parseFrom(InputStream inputStream, M m8) {
            return (GetUserInfoResponse) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static GetUserInfoResponse parseFrom(r rVar) {
            return (GetUserInfoResponse) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static GetUserInfoResponse parseFrom(r rVar, M m8) {
            return (GetUserInfoResponse) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface GetUserInfoResponseOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        UserOuterClass.User getUser();

        UserOuterClass.UserOrBuilder getUserOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        boolean hasUser();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class IsValidRequest extends AbstractC5209f0 implements IsValidRequestOrBuilder {
        public static final int AUTH_TOKEN_FIELD_NUMBER = 1;
        private static final IsValidRequest DEFAULT_INSTANCE = new IsValidRequest();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Authentication.IsValidRequest.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public IsValidRequest parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = IsValidRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private volatile Object authToken_;
        private byte memoizedIsInitialized;

        public static final class Builder extends AbstractC5209f0.b implements IsValidRequestOrBuilder {
            private Object authToken_;
            private int bitField0_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(IsValidRequest isValidRequest) {
                if ((this.bitField0_ & 1) != 0) {
                    isValidRequest.authToken_ = this.authToken_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return Authentication.internal_static_maum_m2u_map_IsValidRequest_descriptor;
            }

            public Builder clearAuthToken() {
                this.authToken_ = IsValidRequest.getDefaultInstance().getAuthToken();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // maum.m2u.map.Authentication.IsValidRequestOrBuilder
            public String getAuthToken() {
                Object obj = this.authToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.authToken_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Authentication.IsValidRequestOrBuilder
            public AbstractC5235o getAuthTokenBytes() {
                Object obj = this.authToken_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.authToken_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Authentication.internal_static_maum_m2u_map_IsValidRequest_descriptor;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Authentication.internal_static_maum_m2u_map_IsValidRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(IsValidRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAuthToken(String str) {
                str.getClass();
                this.authToken_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAuthTokenBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.authToken_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.authToken_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public IsValidRequest build() {
                IsValidRequest isValidRequestBuildPartial = buildPartial();
                if (isValidRequestBuildPartial.isInitialized()) {
                    return isValidRequestBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) isValidRequestBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public IsValidRequest buildPartial() {
                IsValidRequest isValidRequest = new IsValidRequest(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(isValidRequest);
                }
                onBuilt();
                return isValidRequest;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public IsValidRequest getDefaultInstanceForType() {
                return IsValidRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.authToken_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.authToken_ = "";
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof IsValidRequest) {
                    return mergeFrom((IsValidRequest) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder mergeFrom(IsValidRequest isValidRequest) {
                if (isValidRequest == IsValidRequest.getDefaultInstance()) {
                    return this;
                }
                if (!isValidRequest.getAuthToken().isEmpty()) {
                    this.authToken_ = isValidRequest.authToken_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                mergeUnknownFields(isValidRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag != 10) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.authToken_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ IsValidRequest(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static IsValidRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Authentication.internal_static_maum_m2u_map_IsValidRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static IsValidRequest parseDelimitedFrom(InputStream inputStream) {
            return (IsValidRequest) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static IsValidRequest parseFrom(ByteBuffer byteBuffer) {
            return (IsValidRequest) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IsValidRequest)) {
                return super.equals(obj);
            }
            IsValidRequest isValidRequest = (IsValidRequest) obj;
            return getAuthToken().equals(isValidRequest.getAuthToken()) && getUnknownFields().equals(isValidRequest.getUnknownFields());
        }

        @Override // maum.m2u.map.Authentication.IsValidRequestOrBuilder
        public String getAuthToken() {
            Object obj = this.authToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.authToken_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Authentication.IsValidRequestOrBuilder
        public AbstractC5235o getAuthTokenBytes() {
            Object obj = this.authToken_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.authToken_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = (!AbstractC5209f0.isStringEmpty(this.authToken_) ? AbstractC5209f0.computeStringSize(1, this.authToken_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeStringSize;
            return iComputeStringSize;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAuthToken().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Authentication.internal_static_maum_m2u_map_IsValidRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(IsValidRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new IsValidRequest();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.authToken_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.authToken_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private IsValidRequest(AbstractC5209f0.b bVar) {
            super(bVar);
            this.authToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(IsValidRequest isValidRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(isValidRequest);
        }

        public static IsValidRequest parseFrom(ByteBuffer byteBuffer, M m8) {
            return (IsValidRequest) PARSER.parseFrom(byteBuffer, m8);
        }

        public static IsValidRequest parseDelimitedFrom(InputStream inputStream, M m8) {
            return (IsValidRequest) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static IsValidRequest parseFrom(AbstractC5235o abstractC5235o) {
            return (IsValidRequest) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public IsValidRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static IsValidRequest parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (IsValidRequest) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private IsValidRequest() {
            this.authToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.authToken_ = "";
        }

        public static IsValidRequest parseFrom(byte[] bArr) {
            return (IsValidRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static IsValidRequest parseFrom(byte[] bArr, M m8) {
            return (IsValidRequest) PARSER.parseFrom(bArr, m8);
        }

        public static IsValidRequest parseFrom(InputStream inputStream) {
            return (IsValidRequest) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static IsValidRequest parseFrom(InputStream inputStream, M m8) {
            return (IsValidRequest) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static IsValidRequest parseFrom(r rVar) {
            return (IsValidRequest) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static IsValidRequest parseFrom(r rVar, M m8) {
            return (IsValidRequest) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface IsValidRequestOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        String getAuthToken();

        AbstractC5235o getAuthTokenBytes();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class IsValidResponse extends AbstractC5209f0 implements IsValidResponseOrBuilder {
        public static final int ACCESS_TOKEN_FIELD_NUMBER = 2;
        public static final int EXPIRED_AT_FIELD_NUMBER = 3;
        public static final int IS_VALID_FIELD_NUMBER = 1;
        public static final int VOLITILE_USER_META_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private volatile Object accessToken_;
        private int bitField0_;
        private w1 expiredAt_;
        private boolean isValid_;
        private byte memoizedIsInitialized;
        private C5240p1 volitileUserMeta_;
        private static final IsValidResponse DEFAULT_INSTANCE = new IsValidResponse();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Authentication.IsValidResponse.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public IsValidResponse parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = IsValidResponse.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements IsValidResponseOrBuilder {
            private Object accessToken_;
            private int bitField0_;
            private C5228l1 expiredAtBuilder_;
            private w1 expiredAt_;
            private boolean isValid_;
            private C5228l1 volitileUserMetaBuilder_;
            private C5240p1 volitileUserMeta_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(IsValidResponse isValidResponse) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    isValidResponse.isValid_ = this.isValid_;
                }
                if ((i9 & 2) != 0) {
                    isValidResponse.accessToken_ = this.accessToken_;
                }
                if ((i9 & 4) != 0) {
                    C5228l1 c5228l1 = this.expiredAtBuilder_;
                    isValidResponse.expiredAt_ = c5228l1 == null ? this.expiredAt_ : (w1) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if ((i9 & 8) != 0) {
                    C5228l1 c5228l12 = this.volitileUserMetaBuilder_;
                    isValidResponse.volitileUserMeta_ = c5228l12 == null ? this.volitileUserMeta_ : (C5240p1) c5228l12.build();
                    i8 |= 2;
                }
                IsValidResponse.access$14776(isValidResponse, i8);
            }

            public static final C5269x.b getDescriptor() {
                return Authentication.internal_static_maum_m2u_map_IsValidResponse_descriptor;
            }

            private C5228l1 getExpiredAtFieldBuilder() {
                if (this.expiredAtBuilder_ == null) {
                    this.expiredAtBuilder_ = new C5228l1(getExpiredAt(), getParentForChildren(), isClean());
                    this.expiredAt_ = null;
                }
                return this.expiredAtBuilder_;
            }

            private C5228l1 getVolitileUserMetaFieldBuilder() {
                if (this.volitileUserMetaBuilder_ == null) {
                    this.volitileUserMetaBuilder_ = new C5228l1(getVolitileUserMeta(), getParentForChildren(), isClean());
                    this.volitileUserMeta_ = null;
                }
                return this.volitileUserMetaBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getExpiredAtFieldBuilder();
                    getVolitileUserMetaFieldBuilder();
                }
            }

            public Builder clearAccessToken() {
                this.accessToken_ = IsValidResponse.getDefaultInstance().getAccessToken();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearExpiredAt() {
                this.bitField0_ &= -5;
                this.expiredAt_ = null;
                C5228l1 c5228l1 = this.expiredAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.expiredAtBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearIsValid() {
                this.bitField0_ &= -2;
                this.isValid_ = false;
                onChanged();
                return this;
            }

            public Builder clearVolitileUserMeta() {
                this.bitField0_ &= -9;
                this.volitileUserMeta_ = null;
                C5228l1 c5228l1 = this.volitileUserMetaBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.volitileUserMetaBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // maum.m2u.map.Authentication.IsValidResponseOrBuilder
            public String getAccessToken() {
                Object obj = this.accessToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.accessToken_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Authentication.IsValidResponseOrBuilder
            public AbstractC5235o getAccessTokenBytes() {
                Object obj = this.accessToken_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.accessToken_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Authentication.internal_static_maum_m2u_map_IsValidResponse_descriptor;
            }

            @Override // maum.m2u.map.Authentication.IsValidResponseOrBuilder
            public w1 getExpiredAt() {
                C5228l1 c5228l1 = this.expiredAtBuilder_;
                if (c5228l1 != null) {
                    return (w1) c5228l1.getMessage();
                }
                w1 w1Var = this.expiredAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            public w1.b getExpiredAtBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (w1.b) getExpiredAtFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Authentication.IsValidResponseOrBuilder
            public x1 getExpiredAtOrBuilder() {
                C5228l1 c5228l1 = this.expiredAtBuilder_;
                if (c5228l1 != null) {
                    return (x1) c5228l1.getMessageOrBuilder();
                }
                w1 w1Var = this.expiredAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            @Override // maum.m2u.map.Authentication.IsValidResponseOrBuilder
            public boolean getIsValid() {
                return this.isValid_;
            }

            @Override // maum.m2u.map.Authentication.IsValidResponseOrBuilder
            public C5240p1 getVolitileUserMeta() {
                C5228l1 c5228l1 = this.volitileUserMetaBuilder_;
                if (c5228l1 != null) {
                    return (C5240p1) c5228l1.getMessage();
                }
                C5240p1 c5240p1 = this.volitileUserMeta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            public C5240p1.b getVolitileUserMetaBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (C5240p1.b) getVolitileUserMetaFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Authentication.IsValidResponseOrBuilder
            public InterfaceC5243q1 getVolitileUserMetaOrBuilder() {
                C5228l1 c5228l1 = this.volitileUserMetaBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                }
                C5240p1 c5240p1 = this.volitileUserMeta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.map.Authentication.IsValidResponseOrBuilder
            public boolean hasExpiredAt() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // maum.m2u.map.Authentication.IsValidResponseOrBuilder
            public boolean hasVolitileUserMeta() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Authentication.internal_static_maum_m2u_map_IsValidResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(IsValidResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeExpiredAt(w1 w1Var) {
                w1 w1Var2;
                C5228l1 c5228l1 = this.expiredAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(w1Var);
                } else if ((this.bitField0_ & 4) == 0 || (w1Var2 = this.expiredAt_) == null || w1Var2 == w1.getDefaultInstance()) {
                    this.expiredAt_ = w1Var;
                } else {
                    getExpiredAtBuilder().mergeFrom(w1Var);
                }
                if (this.expiredAt_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeVolitileUserMeta(C5240p1 c5240p1) {
                C5240p1 c5240p12;
                C5228l1 c5228l1 = this.volitileUserMetaBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(c5240p1);
                } else if ((this.bitField0_ & 8) == 0 || (c5240p12 = this.volitileUserMeta_) == null || c5240p12 == C5240p1.getDefaultInstance()) {
                    this.volitileUserMeta_ = c5240p1;
                } else {
                    getVolitileUserMetaBuilder().mergeFrom(c5240p1);
                }
                if (this.volitileUserMeta_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder setAccessToken(String str) {
                str.getClass();
                this.accessToken_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setAccessTokenBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.accessToken_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setExpiredAt(w1 w1Var) {
                C5228l1 c5228l1 = this.expiredAtBuilder_;
                if (c5228l1 == null) {
                    w1Var.getClass();
                    this.expiredAt_ = w1Var;
                } else {
                    c5228l1.setMessage(w1Var);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setIsValid(boolean z8) {
                this.isValid_ = z8;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setVolitileUserMeta(C5240p1 c5240p1) {
                C5228l1 c5228l1 = this.volitileUserMetaBuilder_;
                if (c5228l1 == null) {
                    c5240p1.getClass();
                    this.volitileUserMeta_ = c5240p1;
                } else {
                    c5228l1.setMessage(c5240p1);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.accessToken_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public IsValidResponse build() {
                IsValidResponse isValidResponseBuildPartial = buildPartial();
                if (isValidResponseBuildPartial.isInitialized()) {
                    return isValidResponseBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) isValidResponseBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public IsValidResponse buildPartial() {
                IsValidResponse isValidResponse = new IsValidResponse(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(isValidResponse);
                }
                onBuilt();
                return isValidResponse;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public IsValidResponse getDefaultInstanceForType() {
                return IsValidResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.isValid_ = false;
                this.accessToken_ = "";
                this.expiredAt_ = null;
                C5228l1 c5228l1 = this.expiredAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.expiredAtBuilder_ = null;
                }
                this.volitileUserMeta_ = null;
                C5228l1 c5228l12 = this.volitileUserMetaBuilder_;
                if (c5228l12 != null) {
                    c5228l12.dispose();
                    this.volitileUserMetaBuilder_ = null;
                }
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.accessToken_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof IsValidResponse) {
                    return mergeFrom((IsValidResponse) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setExpiredAt(w1.b bVar) {
                C5228l1 c5228l1 = this.expiredAtBuilder_;
                if (c5228l1 == null) {
                    this.expiredAt_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setVolitileUserMeta(C5240p1.b bVar) {
                C5228l1 c5228l1 = this.volitileUserMetaBuilder_;
                if (c5228l1 == null) {
                    this.volitileUserMeta_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder mergeFrom(IsValidResponse isValidResponse) {
                if (isValidResponse == IsValidResponse.getDefaultInstance()) {
                    return this;
                }
                if (isValidResponse.getIsValid()) {
                    setIsValid(isValidResponse.getIsValid());
                }
                if (!isValidResponse.getAccessToken().isEmpty()) {
                    this.accessToken_ = isValidResponse.accessToken_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (isValidResponse.hasExpiredAt()) {
                    mergeExpiredAt(isValidResponse.getExpiredAt());
                }
                if (isValidResponse.hasVolitileUserMeta()) {
                    mergeVolitileUserMeta(isValidResponse.getVolitileUserMeta());
                }
                mergeUnknownFields(isValidResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.isValid_ = rVar.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.accessToken_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    rVar.readMessage(getExpiredAtFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 4;
                                } else if (tag != 34) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getVolitileUserMetaFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 8;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ IsValidResponse(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$14776(IsValidResponse isValidResponse, int i8) {
            int i9 = i8 | isValidResponse.bitField0_;
            isValidResponse.bitField0_ = i9;
            return i9;
        }

        public static IsValidResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Authentication.internal_static_maum_m2u_map_IsValidResponse_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static IsValidResponse parseDelimitedFrom(InputStream inputStream) {
            return (IsValidResponse) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static IsValidResponse parseFrom(ByteBuffer byteBuffer) {
            return (IsValidResponse) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IsValidResponse)) {
                return super.equals(obj);
            }
            IsValidResponse isValidResponse = (IsValidResponse) obj;
            if (getIsValid() != isValidResponse.getIsValid() || !getAccessToken().equals(isValidResponse.getAccessToken()) || hasExpiredAt() != isValidResponse.hasExpiredAt()) {
                return false;
            }
            if ((!hasExpiredAt() || getExpiredAt().equals(isValidResponse.getExpiredAt())) && hasVolitileUserMeta() == isValidResponse.hasVolitileUserMeta()) {
                return (!hasVolitileUserMeta() || getVolitileUserMeta().equals(isValidResponse.getVolitileUserMeta())) && getUnknownFields().equals(isValidResponse.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.map.Authentication.IsValidResponseOrBuilder
        public String getAccessToken() {
            Object obj = this.accessToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.accessToken_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Authentication.IsValidResponseOrBuilder
        public AbstractC5235o getAccessTokenBytes() {
            Object obj = this.accessToken_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.accessToken_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.map.Authentication.IsValidResponseOrBuilder
        public w1 getExpiredAt() {
            w1 w1Var = this.expiredAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // maum.m2u.map.Authentication.IsValidResponseOrBuilder
        public x1 getExpiredAtOrBuilder() {
            w1 w1Var = this.expiredAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // maum.m2u.map.Authentication.IsValidResponseOrBuilder
        public boolean getIsValid() {
            return this.isValid_;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            boolean z8 = this.isValid_;
            int iComputeBoolSize = z8 ? AbstractC5248t.computeBoolSize(1, z8) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.accessToken_)) {
                iComputeBoolSize += AbstractC5209f0.computeStringSize(2, this.accessToken_);
            }
            if ((1 & this.bitField0_) != 0) {
                iComputeBoolSize += AbstractC5248t.computeMessageSize(3, getExpiredAt());
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += AbstractC5248t.computeMessageSize(4, getVolitileUserMeta());
            }
            int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Authentication.IsValidResponseOrBuilder
        public C5240p1 getVolitileUserMeta() {
            C5240p1 c5240p1 = this.volitileUserMeta_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.map.Authentication.IsValidResponseOrBuilder
        public InterfaceC5243q1 getVolitileUserMetaOrBuilder() {
            C5240p1 c5240p1 = this.volitileUserMeta_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.map.Authentication.IsValidResponseOrBuilder
        public boolean hasExpiredAt() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // maum.m2u.map.Authentication.IsValidResponseOrBuilder
        public boolean hasVolitileUserMeta() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + AbstractC5227l0.hashBoolean(getIsValid())) * 37) + 2) * 53) + getAccessToken().hashCode();
            if (hasExpiredAt()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getExpiredAt().hashCode();
            }
            if (hasVolitileUserMeta()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getVolitileUserMeta().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Authentication.internal_static_maum_m2u_map_IsValidResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(IsValidResponse.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new IsValidResponse();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            boolean z8 = this.isValid_;
            if (z8) {
                abstractC5248t.writeBool(1, z8);
            }
            if (!AbstractC5209f0.isStringEmpty(this.accessToken_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.accessToken_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(3, getExpiredAt());
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC5248t.writeMessage(4, getVolitileUserMeta());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private IsValidResponse(AbstractC5209f0.b bVar) {
            super(bVar);
            this.isValid_ = false;
            this.accessToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(IsValidResponse isValidResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(isValidResponse);
        }

        public static IsValidResponse parseFrom(ByteBuffer byteBuffer, M m8) {
            return (IsValidResponse) PARSER.parseFrom(byteBuffer, m8);
        }

        public static IsValidResponse parseDelimitedFrom(InputStream inputStream, M m8) {
            return (IsValidResponse) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static IsValidResponse parseFrom(AbstractC5235o abstractC5235o) {
            return (IsValidResponse) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public IsValidResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static IsValidResponse parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (IsValidResponse) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static IsValidResponse parseFrom(byte[] bArr) {
            return (IsValidResponse) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        private IsValidResponse() {
            this.isValid_ = false;
            this.accessToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.accessToken_ = "";
        }

        public static IsValidResponse parseFrom(byte[] bArr, M m8) {
            return (IsValidResponse) PARSER.parseFrom(bArr, m8);
        }

        public static IsValidResponse parseFrom(InputStream inputStream) {
            return (IsValidResponse) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static IsValidResponse parseFrom(InputStream inputStream, M m8) {
            return (IsValidResponse) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static IsValidResponse parseFrom(r rVar) {
            return (IsValidResponse) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static IsValidResponse parseFrom(r rVar, M m8) {
            return (IsValidResponse) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface IsValidResponseOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        String getAccessToken();

        AbstractC5235o getAccessTokenBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        w1 getExpiredAt();

        x1 getExpiredAtOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        boolean getIsValid();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        C5240p1 getVolitileUserMeta();

        InterfaceC5243q1 getVolitileUserMetaOrBuilder();

        boolean hasExpiredAt();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        boolean hasVolitileUserMeta();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class MultiFactorAuthRequestPayload extends AbstractC5209f0 implements MultiFactorAuthRequestPayloadOrBuilder {
        public static final int MULTI_FACTOR_AUTH_METHODS_FIELD_NUMBER = 2;
        public static final int TEMP_AUTH_TOKEN_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<MultiFactorAuthMethod> multiFactorAuthMethods_;
        private volatile Object tempAuthToken_;
        private static final MultiFactorAuthRequestPayload DEFAULT_INSTANCE = new MultiFactorAuthRequestPayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Authentication.MultiFactorAuthRequestPayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public MultiFactorAuthRequestPayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = MultiFactorAuthRequestPayload.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements MultiFactorAuthRequestPayloadOrBuilder {
            private int bitField0_;
            private C5213g1 multiFactorAuthMethodsBuilder_;
            private List<MultiFactorAuthMethod> multiFactorAuthMethods_;
            private Object tempAuthToken_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(MultiFactorAuthRequestPayload multiFactorAuthRequestPayload) {
                if ((this.bitField0_ & 1) != 0) {
                    multiFactorAuthRequestPayload.tempAuthToken_ = this.tempAuthToken_;
                }
            }

            private void buildPartialRepeatedFields(MultiFactorAuthRequestPayload multiFactorAuthRequestPayload) {
                C5213g1 c5213g1 = this.multiFactorAuthMethodsBuilder_;
                if (c5213g1 != null) {
                    multiFactorAuthRequestPayload.multiFactorAuthMethods_ = c5213g1.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.multiFactorAuthMethods_ = Collections.unmodifiableList(this.multiFactorAuthMethods_);
                    this.bitField0_ &= -3;
                }
                multiFactorAuthRequestPayload.multiFactorAuthMethods_ = this.multiFactorAuthMethods_;
            }

            private void ensureMultiFactorAuthMethodsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.multiFactorAuthMethods_ = new ArrayList(this.multiFactorAuthMethods_);
                    this.bitField0_ |= 2;
                }
            }

            public static final C5269x.b getDescriptor() {
                return Authentication.internal_static_maum_m2u_map_MultiFactorAuthRequestPayload_descriptor;
            }

            private C5213g1 getMultiFactorAuthMethodsFieldBuilder() {
                if (this.multiFactorAuthMethodsBuilder_ == null) {
                    this.multiFactorAuthMethodsBuilder_ = new C5213g1(this.multiFactorAuthMethods_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.multiFactorAuthMethods_ = null;
                }
                return this.multiFactorAuthMethodsBuilder_;
            }

            public Builder addAllMultiFactorAuthMethods(Iterable<? extends MultiFactorAuthMethod> iterable) {
                C5213g1 c5213g1 = this.multiFactorAuthMethodsBuilder_;
                if (c5213g1 == null) {
                    ensureMultiFactorAuthMethodsIsMutable();
                    AbstractC5196b.a.addAll((Iterable) iterable, (List) this.multiFactorAuthMethods_);
                    onChanged();
                } else {
                    c5213g1.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addMultiFactorAuthMethods(MultiFactorAuthMethod multiFactorAuthMethod) {
                C5213g1 c5213g1 = this.multiFactorAuthMethodsBuilder_;
                if (c5213g1 == null) {
                    multiFactorAuthMethod.getClass();
                    ensureMultiFactorAuthMethodsIsMutable();
                    this.multiFactorAuthMethods_.add(multiFactorAuthMethod);
                    onChanged();
                } else {
                    c5213g1.addMessage(multiFactorAuthMethod);
                }
                return this;
            }

            public MultiFactorAuthMethod.Builder addMultiFactorAuthMethodsBuilder() {
                return (MultiFactorAuthMethod.Builder) getMultiFactorAuthMethodsFieldBuilder().addBuilder(MultiFactorAuthMethod.getDefaultInstance());
            }

            public Builder clearMultiFactorAuthMethods() {
                C5213g1 c5213g1 = this.multiFactorAuthMethodsBuilder_;
                if (c5213g1 == null) {
                    this.multiFactorAuthMethods_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    c5213g1.clear();
                }
                return this;
            }

            public Builder clearTempAuthToken() {
                this.tempAuthToken_ = MultiFactorAuthRequestPayload.getDefaultInstance().getTempAuthToken();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Authentication.internal_static_maum_m2u_map_MultiFactorAuthRequestPayload_descriptor;
            }

            @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayloadOrBuilder
            public MultiFactorAuthMethod getMultiFactorAuthMethods(int i8) {
                C5213g1 c5213g1 = this.multiFactorAuthMethodsBuilder_;
                return c5213g1 == null ? this.multiFactorAuthMethods_.get(i8) : (MultiFactorAuthMethod) c5213g1.getMessage(i8);
            }

            public MultiFactorAuthMethod.Builder getMultiFactorAuthMethodsBuilder(int i8) {
                return (MultiFactorAuthMethod.Builder) getMultiFactorAuthMethodsFieldBuilder().getBuilder(i8);
            }

            public List<MultiFactorAuthMethod.Builder> getMultiFactorAuthMethodsBuilderList() {
                return getMultiFactorAuthMethodsFieldBuilder().getBuilderList();
            }

            @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayloadOrBuilder
            public int getMultiFactorAuthMethodsCount() {
                C5213g1 c5213g1 = this.multiFactorAuthMethodsBuilder_;
                return c5213g1 == null ? this.multiFactorAuthMethods_.size() : c5213g1.getCount();
            }

            @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayloadOrBuilder
            public List<MultiFactorAuthMethod> getMultiFactorAuthMethodsList() {
                C5213g1 c5213g1 = this.multiFactorAuthMethodsBuilder_;
                return c5213g1 == null ? Collections.unmodifiableList(this.multiFactorAuthMethods_) : c5213g1.getMessageList();
            }

            @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayloadOrBuilder
            public MultiFactorAuthMethodOrBuilder getMultiFactorAuthMethodsOrBuilder(int i8) {
                C5213g1 c5213g1 = this.multiFactorAuthMethodsBuilder_;
                return c5213g1 == null ? this.multiFactorAuthMethods_.get(i8) : (MultiFactorAuthMethodOrBuilder) c5213g1.getMessageOrBuilder(i8);
            }

            @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayloadOrBuilder
            public List<? extends MultiFactorAuthMethodOrBuilder> getMultiFactorAuthMethodsOrBuilderList() {
                C5213g1 c5213g1 = this.multiFactorAuthMethodsBuilder_;
                return c5213g1 != null ? c5213g1.getMessageOrBuilderList() : Collections.unmodifiableList(this.multiFactorAuthMethods_);
            }

            @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayloadOrBuilder
            public String getTempAuthToken() {
                Object obj = this.tempAuthToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.tempAuthToken_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayloadOrBuilder
            public AbstractC5235o getTempAuthTokenBytes() {
                Object obj = this.tempAuthToken_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.tempAuthToken_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Authentication.internal_static_maum_m2u_map_MultiFactorAuthRequestPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(MultiFactorAuthRequestPayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeMultiFactorAuthMethods(int i8) {
                C5213g1 c5213g1 = this.multiFactorAuthMethodsBuilder_;
                if (c5213g1 == null) {
                    ensureMultiFactorAuthMethodsIsMutable();
                    this.multiFactorAuthMethods_.remove(i8);
                    onChanged();
                } else {
                    c5213g1.remove(i8);
                }
                return this;
            }

            public Builder setMultiFactorAuthMethods(int i8, MultiFactorAuthMethod multiFactorAuthMethod) {
                C5213g1 c5213g1 = this.multiFactorAuthMethodsBuilder_;
                if (c5213g1 == null) {
                    multiFactorAuthMethod.getClass();
                    ensureMultiFactorAuthMethodsIsMutable();
                    this.multiFactorAuthMethods_.set(i8, multiFactorAuthMethod);
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, multiFactorAuthMethod);
                }
                return this;
            }

            public Builder setTempAuthToken(String str) {
                str.getClass();
                this.tempAuthToken_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTempAuthTokenBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.tempAuthToken_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.tempAuthToken_ = "";
                this.multiFactorAuthMethods_ = Collections.emptyList();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public MultiFactorAuthRequestPayload build() {
                MultiFactorAuthRequestPayload multiFactorAuthRequestPayloadBuildPartial = buildPartial();
                if (multiFactorAuthRequestPayloadBuildPartial.isInitialized()) {
                    return multiFactorAuthRequestPayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) multiFactorAuthRequestPayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public MultiFactorAuthRequestPayload buildPartial() {
                MultiFactorAuthRequestPayload multiFactorAuthRequestPayload = new MultiFactorAuthRequestPayload(this, null);
                buildPartialRepeatedFields(multiFactorAuthRequestPayload);
                if (this.bitField0_ != 0) {
                    buildPartial0(multiFactorAuthRequestPayload);
                }
                onBuilt();
                return multiFactorAuthRequestPayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public MultiFactorAuthRequestPayload getDefaultInstanceForType() {
                return MultiFactorAuthRequestPayload.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            public MultiFactorAuthMethod.Builder addMultiFactorAuthMethodsBuilder(int i8) {
                return (MultiFactorAuthMethod.Builder) getMultiFactorAuthMethodsFieldBuilder().addBuilder(i8, MultiFactorAuthMethod.getDefaultInstance());
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.tempAuthToken_ = "";
                C5213g1 c5213g1 = this.multiFactorAuthMethodsBuilder_;
                if (c5213g1 == null) {
                    this.multiFactorAuthMethods_ = Collections.emptyList();
                } else {
                    this.multiFactorAuthMethods_ = null;
                    c5213g1.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.tempAuthToken_ = "";
                this.multiFactorAuthMethods_ = Collections.emptyList();
            }

            public Builder addMultiFactorAuthMethods(int i8, MultiFactorAuthMethod multiFactorAuthMethod) {
                C5213g1 c5213g1 = this.multiFactorAuthMethodsBuilder_;
                if (c5213g1 == null) {
                    multiFactorAuthMethod.getClass();
                    ensureMultiFactorAuthMethodsIsMutable();
                    this.multiFactorAuthMethods_.add(i8, multiFactorAuthMethod);
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, multiFactorAuthMethod);
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof MultiFactorAuthRequestPayload) {
                    return mergeFrom((MultiFactorAuthRequestPayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setMultiFactorAuthMethods(int i8, MultiFactorAuthMethod.Builder builder) {
                C5213g1 c5213g1 = this.multiFactorAuthMethodsBuilder_;
                if (c5213g1 == null) {
                    ensureMultiFactorAuthMethodsIsMutable();
                    this.multiFactorAuthMethods_.set(i8, builder.build());
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(MultiFactorAuthRequestPayload multiFactorAuthRequestPayload) {
                if (multiFactorAuthRequestPayload == MultiFactorAuthRequestPayload.getDefaultInstance()) {
                    return this;
                }
                if (!multiFactorAuthRequestPayload.getTempAuthToken().isEmpty()) {
                    this.tempAuthToken_ = multiFactorAuthRequestPayload.tempAuthToken_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (this.multiFactorAuthMethodsBuilder_ == null) {
                    if (!multiFactorAuthRequestPayload.multiFactorAuthMethods_.isEmpty()) {
                        if (this.multiFactorAuthMethods_.isEmpty()) {
                            this.multiFactorAuthMethods_ = multiFactorAuthRequestPayload.multiFactorAuthMethods_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureMultiFactorAuthMethodsIsMutable();
                            this.multiFactorAuthMethods_.addAll(multiFactorAuthRequestPayload.multiFactorAuthMethods_);
                        }
                        onChanged();
                    }
                } else if (!multiFactorAuthRequestPayload.multiFactorAuthMethods_.isEmpty()) {
                    if (!this.multiFactorAuthMethodsBuilder_.isEmpty()) {
                        this.multiFactorAuthMethodsBuilder_.addAllMessages(multiFactorAuthRequestPayload.multiFactorAuthMethods_);
                    } else {
                        this.multiFactorAuthMethodsBuilder_.dispose();
                        this.multiFactorAuthMethodsBuilder_ = null;
                        this.multiFactorAuthMethods_ = multiFactorAuthRequestPayload.multiFactorAuthMethods_;
                        this.bitField0_ &= -3;
                        this.multiFactorAuthMethodsBuilder_ = AbstractC5209f0.alwaysUseFieldBuilders ? getMultiFactorAuthMethodsFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(multiFactorAuthRequestPayload.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder addMultiFactorAuthMethods(MultiFactorAuthMethod.Builder builder) {
                C5213g1 c5213g1 = this.multiFactorAuthMethodsBuilder_;
                if (c5213g1 == null) {
                    ensureMultiFactorAuthMethodsIsMutable();
                    this.multiFactorAuthMethods_.add(builder.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(builder.build());
                }
                return this;
            }

            public Builder addMultiFactorAuthMethods(int i8, MultiFactorAuthMethod.Builder builder) {
                C5213g1 c5213g1 = this.multiFactorAuthMethodsBuilder_;
                if (c5213g1 == null) {
                    ensureMultiFactorAuthMethodsIsMutable();
                    this.multiFactorAuthMethods_.add(i8, builder.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, builder.build());
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.tempAuthToken_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    MultiFactorAuthMethod multiFactorAuthMethod = (MultiFactorAuthMethod) rVar.readMessage(MultiFactorAuthMethod.parser(), m8);
                                    C5213g1 c5213g1 = this.multiFactorAuthMethodsBuilder_;
                                    if (c5213g1 == null) {
                                        ensureMultiFactorAuthMethodsIsMutable();
                                        this.multiFactorAuthMethods_.add(multiFactorAuthMethod);
                                    } else {
                                        c5213g1.addMessage(multiFactorAuthMethod);
                                    }
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        public static final class MultiFactorAuthMethod extends AbstractC5209f0 implements MultiFactorAuthMethodOrBuilder {
            public static final int METHOD_FIELD_NUMBER = 1;
            public static final int PARAM_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private volatile Object method_;
            private C5240p1 param_;
            private static final MultiFactorAuthMethod DEFAULT_INSTANCE = new MultiFactorAuthMethod();
            private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Authentication.MultiFactorAuthRequestPayload.MultiFactorAuthMethod.1
                @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
                public MultiFactorAuthMethod parsePartialFrom(r rVar, M m8) throws C5230m0 {
                    Builder builderNewBuilder = MultiFactorAuthMethod.newBuilder();
                    try {
                        builderNewBuilder.mergeFrom(rVar, m8);
                        return builderNewBuilder.buildPartial();
                    } catch (E1 e8) {
                        throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (C5230m0 e9) {
                        throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (IOException e10) {
                        throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                    }
                }
            };

            public static final class Builder extends AbstractC5209f0.b implements MultiFactorAuthMethodOrBuilder {
                private int bitField0_;
                private Object method_;
                private C5228l1 paramBuilder_;
                private C5240p1 param_;

                /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                    this(cVar);
                }

                private void buildPartial0(MultiFactorAuthMethod multiFactorAuthMethod) {
                    int i8;
                    int i9 = this.bitField0_;
                    if ((i9 & 1) != 0) {
                        multiFactorAuthMethod.method_ = this.method_;
                    }
                    if ((i9 & 2) != 0) {
                        C5228l1 c5228l1 = this.paramBuilder_;
                        multiFactorAuthMethod.param_ = c5228l1 == null ? this.param_ : (C5240p1) c5228l1.build();
                        i8 = 1;
                    } else {
                        i8 = 0;
                    }
                    MultiFactorAuthMethod.access$7976(multiFactorAuthMethod, i8);
                }

                public static final C5269x.b getDescriptor() {
                    return Authentication.internal_static_maum_m2u_map_MultiFactorAuthRequestPayload_MultiFactorAuthMethod_descriptor;
                }

                private C5228l1 getParamFieldBuilder() {
                    if (this.paramBuilder_ == null) {
                        this.paramBuilder_ = new C5228l1(getParam(), getParentForChildren(), isClean());
                        this.param_ = null;
                    }
                    return this.paramBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (AbstractC5209f0.alwaysUseFieldBuilders) {
                        getParamFieldBuilder();
                    }
                }

                public Builder clearMethod() {
                    this.method_ = MultiFactorAuthMethod.getDefaultInstance().getMethod();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearParam() {
                    this.bitField0_ &= -3;
                    this.param_ = null;
                    C5228l1 c5228l1 = this.paramBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.dispose();
                        this.paramBuilder_ = null;
                    }
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
                public C5269x.b getDescriptorForType() {
                    return Authentication.internal_static_maum_m2u_map_MultiFactorAuthRequestPayload_MultiFactorAuthMethod_descriptor;
                }

                @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayload.MultiFactorAuthMethodOrBuilder
                public String getMethod() {
                    Object obj = this.method_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.method_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayload.MultiFactorAuthMethodOrBuilder
                public AbstractC5235o getMethodBytes() {
                    Object obj = this.method_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.method_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayload.MultiFactorAuthMethodOrBuilder
                public C5240p1 getParam() {
                    C5228l1 c5228l1 = this.paramBuilder_;
                    if (c5228l1 != null) {
                        return (C5240p1) c5228l1.getMessage();
                    }
                    C5240p1 c5240p1 = this.param_;
                    return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
                }

                public C5240p1.b getParamBuilder() {
                    this.bitField0_ |= 2;
                    onChanged();
                    return (C5240p1.b) getParamFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayload.MultiFactorAuthMethodOrBuilder
                public InterfaceC5243q1 getParamOrBuilder() {
                    C5228l1 c5228l1 = this.paramBuilder_;
                    if (c5228l1 != null) {
                        return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                    }
                    C5240p1 c5240p1 = this.param_;
                    return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
                }

                @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayload.MultiFactorAuthMethodOrBuilder
                public boolean hasParam() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b
                protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                    return Authentication.internal_static_maum_m2u_map_MultiFactorAuthRequestPayload_MultiFactorAuthMethod_fieldAccessorTable.ensureFieldAccessorsInitialized(MultiFactorAuthMethod.class, Builder.class);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeParam(C5240p1 c5240p1) {
                    C5240p1 c5240p12;
                    C5228l1 c5228l1 = this.paramBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.mergeFrom(c5240p1);
                    } else if ((this.bitField0_ & 2) == 0 || (c5240p12 = this.param_) == null || c5240p12 == C5240p1.getDefaultInstance()) {
                        this.param_ = c5240p1;
                    } else {
                        getParamBuilder().mergeFrom(c5240p1);
                    }
                    if (this.param_ != null) {
                        this.bitField0_ |= 2;
                        onChanged();
                    }
                    return this;
                }

                public Builder setMethod(String str) {
                    str.getClass();
                    this.method_ = str;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setMethodBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.method_ = abstractC5235o;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setParam(C5240p1 c5240p1) {
                    C5228l1 c5228l1 = this.paramBuilder_;
                    if (c5228l1 == null) {
                        c5240p1.getClass();
                        this.param_ = c5240p1;
                    } else {
                        c5228l1.setMessage(c5240p1);
                    }
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    this.method_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                    return (Builder) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public MultiFactorAuthMethod build() {
                    MultiFactorAuthMethod multiFactorAuthMethodBuildPartial = buildPartial();
                    if (multiFactorAuthMethodBuildPartial.isInitialized()) {
                        return multiFactorAuthMethodBuildPartial;
                    }
                    throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) multiFactorAuthMethodBuildPartial);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public MultiFactorAuthMethod buildPartial() {
                    MultiFactorAuthMethod multiFactorAuthMethod = new MultiFactorAuthMethod(this, null);
                    if (this.bitField0_ != 0) {
                        buildPartial0(multiFactorAuthMethod);
                    }
                    onBuilt();
                    return multiFactorAuthMethod;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearField(C5269x.g gVar) {
                    return (Builder) super.clearField(gVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public MultiFactorAuthMethod getDefaultInstanceForType() {
                    return MultiFactorAuthMethod.getDefaultInstance();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setField(C5269x.g gVar, Object obj) {
                    return (Builder) super.setField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                    return (Builder) super.setRepeatedField(gVar, i8, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder setUnknownFields(G1 g12) {
                    return (Builder) super.setUnknownFields(g12);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearOneof(C5269x.l lVar) {
                    return (Builder) super.clearOneof(lVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder mergeUnknownFields(G1 g12) {
                    return (Builder) super.mergeUnknownFields(g12);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.method_ = "";
                    this.param_ = null;
                    C5228l1 c5228l1 = this.paramBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.dispose();
                        this.paramBuilder_ = null;
                    }
                    return this;
                }

                private Builder(AbstractC5209f0.c cVar) {
                    super(cVar);
                    this.method_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
                /* renamed from: clone */
                public Builder mo3clone() {
                    return (Builder) super.mo3clone();
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder mergeFrom(H0 h02) {
                    if (h02 instanceof MultiFactorAuthMethod) {
                        return mergeFrom((MultiFactorAuthMethod) h02);
                    }
                    super.mergeFrom(h02);
                    return this;
                }

                public Builder setParam(C5240p1.b bVar) {
                    C5228l1 c5228l1 = this.paramBuilder_;
                    if (c5228l1 == null) {
                        this.param_ = bVar.build();
                    } else {
                        c5228l1.setMessage(bVar.build());
                    }
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder mergeFrom(MultiFactorAuthMethod multiFactorAuthMethod) {
                    if (multiFactorAuthMethod == MultiFactorAuthMethod.getDefaultInstance()) {
                        return this;
                    }
                    if (!multiFactorAuthMethod.getMethod().isEmpty()) {
                        this.method_ = multiFactorAuthMethod.method_;
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    if (multiFactorAuthMethod.hasParam()) {
                        mergeParam(multiFactorAuthMethod.getParam());
                    }
                    mergeUnknownFields(multiFactorAuthMethod.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder mergeFrom(r rVar, M m8) {
                    m8.getClass();
                    boolean z8 = false;
                    while (!z8) {
                        try {
                            try {
                                int tag = rVar.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.method_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 1;
                                    } else if (tag != 18) {
                                        if (!super.parseUnknownField(rVar, m8, tag)) {
                                        }
                                    } else {
                                        rVar.readMessage(getParamFieldBuilder().getBuilder(), m8);
                                        this.bitField0_ |= 2;
                                    }
                                }
                                z8 = true;
                            } catch (C5230m0 e8) {
                                throw e8.unwrapIOException();
                            }
                        } catch (Throwable th) {
                            onChanged();
                            throw th;
                        }
                    }
                    onChanged();
                    return this;
                }
            }

            /* synthetic */ MultiFactorAuthMethod(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
                this(bVar);
            }

            static /* synthetic */ int access$7976(MultiFactorAuthMethod multiFactorAuthMethod, int i8) {
                int i9 = i8 | multiFactorAuthMethod.bitField0_;
                multiFactorAuthMethod.bitField0_ = i9;
                return i9;
            }

            public static MultiFactorAuthMethod getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final C5269x.b getDescriptor() {
                return Authentication.internal_static_maum_m2u_map_MultiFactorAuthRequestPayload_MultiFactorAuthMethod_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static MultiFactorAuthMethod parseDelimitedFrom(InputStream inputStream) {
                return (MultiFactorAuthMethod) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static MultiFactorAuthMethod parseFrom(ByteBuffer byteBuffer) {
                return (MultiFactorAuthMethod) PARSER.parseFrom(byteBuffer);
            }

            public static Z0 parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MultiFactorAuthMethod)) {
                    return super.equals(obj);
                }
                MultiFactorAuthMethod multiFactorAuthMethod = (MultiFactorAuthMethod) obj;
                if (getMethod().equals(multiFactorAuthMethod.getMethod()) && hasParam() == multiFactorAuthMethod.hasParam()) {
                    return (!hasParam() || getParam().equals(multiFactorAuthMethod.getParam())) && getUnknownFields().equals(multiFactorAuthMethod.getUnknownFields());
                }
                return false;
            }

            @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayload.MultiFactorAuthMethodOrBuilder
            public String getMethod() {
                Object obj = this.method_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.method_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayload.MultiFactorAuthMethodOrBuilder
            public AbstractC5235o getMethodBytes() {
                Object obj = this.method_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.method_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayload.MultiFactorAuthMethodOrBuilder
            public C5240p1 getParam() {
                C5240p1 c5240p1 = this.param_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayload.MultiFactorAuthMethodOrBuilder
            public InterfaceC5243q1 getParamOrBuilder() {
                C5240p1 c5240p1 = this.param_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Z0 getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public int getSerializedSize() {
                int i8 = this.memoizedSize;
                if (i8 != -1) {
                    return i8;
                }
                int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.method_) ? AbstractC5209f0.computeStringSize(1, this.method_) : 0;
                if ((1 & this.bitField0_) != 0) {
                    iComputeStringSize += AbstractC5248t.computeMessageSize(2, getParam());
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayload.MultiFactorAuthMethodOrBuilder
            public boolean hasParam() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public int hashCode() {
                int i8 = this.memoizedHashCode;
                if (i8 != 0) {
                    return i8;
                }
                int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getMethod().hashCode();
                if (hasParam()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getParam().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Authentication.internal_static_maum_m2u_map_MultiFactorAuthRequestPayload_MultiFactorAuthMethod_fieldAccessorTable.ensureFieldAccessorsInitialized(MultiFactorAuthMethod.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                byte b9 = this.memoizedIsInitialized;
                if (b9 == 1) {
                    return true;
                }
                if (b9 == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected Object newInstance(AbstractC5209f0.h hVar) {
                return new MultiFactorAuthMethod();
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public void writeTo(AbstractC5248t abstractC5248t) {
                if (!AbstractC5209f0.isStringEmpty(this.method_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 1, this.method_);
                }
                if ((this.bitField0_ & 1) != 0) {
                    abstractC5248t.writeMessage(2, getParam());
                }
                getUnknownFields().writeTo(abstractC5248t);
            }

            private MultiFactorAuthMethod(AbstractC5209f0.b bVar) {
                super(bVar);
                this.method_ = "";
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(MultiFactorAuthMethod multiFactorAuthMethod) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiFactorAuthMethod);
            }

            public static MultiFactorAuthMethod parseFrom(ByteBuffer byteBuffer, M m8) {
                return (MultiFactorAuthMethod) PARSER.parseFrom(byteBuffer, m8);
            }

            public static MultiFactorAuthMethod parseDelimitedFrom(InputStream inputStream, M m8) {
                return (MultiFactorAuthMethod) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
            }

            public static MultiFactorAuthMethod parseFrom(AbstractC5235o abstractC5235o) {
                return (MultiFactorAuthMethod) PARSER.parseFrom(abstractC5235o);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public MultiFactorAuthMethod getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder toBuilder() {
                AnonymousClass1 anonymousClass1 = null;
                return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
            }

            public static MultiFactorAuthMethod parseFrom(AbstractC5235o abstractC5235o, M m8) {
                return (MultiFactorAuthMethod) PARSER.parseFrom(abstractC5235o, m8);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private MultiFactorAuthMethod() {
                this.method_ = "";
                this.memoizedIsInitialized = (byte) -1;
                this.method_ = "";
            }

            public static MultiFactorAuthMethod parseFrom(byte[] bArr) {
                return (MultiFactorAuthMethod) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.AbstractC5209f0
            public Builder newBuilderForType(AbstractC5209f0.c cVar) {
                return new Builder(cVar, null);
            }

            public static MultiFactorAuthMethod parseFrom(byte[] bArr, M m8) {
                return (MultiFactorAuthMethod) PARSER.parseFrom(bArr, m8);
            }

            public static MultiFactorAuthMethod parseFrom(InputStream inputStream) {
                return (MultiFactorAuthMethod) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
            }

            public static MultiFactorAuthMethod parseFrom(InputStream inputStream, M m8) {
                return (MultiFactorAuthMethod) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
            }

            public static MultiFactorAuthMethod parseFrom(r rVar) {
                return (MultiFactorAuthMethod) AbstractC5209f0.parseWithIOException(PARSER, rVar);
            }

            public static MultiFactorAuthMethod parseFrom(r rVar, M m8) {
                return (MultiFactorAuthMethod) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
            }
        }

        public interface MultiFactorAuthMethodOrBuilder extends N0 {
            @Override // com.google.protobuf.N0
            /* synthetic */ List findInitializationErrors();

            @Override // com.google.protobuf.N0
            /* synthetic */ java.util.Map getAllFields();

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ H0 getDefaultInstanceForType();

            @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ C5269x.b getDescriptorForType();

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getField(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ String getInitializationErrorString();

            String getMethod();

            AbstractC5235o getMethodBytes();

            @Override // com.google.protobuf.N0
            /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

            C5240p1 getParam();

            InterfaceC5243q1 getParamOrBuilder();

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

            @Override // com.google.protobuf.N0
            /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ G1 getUnknownFields();

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasField(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasOneof(C5269x.l lVar);

            boolean hasParam();

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ boolean isInitialized();
        }

        /* synthetic */ MultiFactorAuthRequestPayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static MultiFactorAuthRequestPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Authentication.internal_static_maum_m2u_map_MultiFactorAuthRequestPayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiFactorAuthRequestPayload parseDelimitedFrom(InputStream inputStream) {
            return (MultiFactorAuthRequestPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MultiFactorAuthRequestPayload parseFrom(ByteBuffer byteBuffer) {
            return (MultiFactorAuthRequestPayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MultiFactorAuthRequestPayload)) {
                return super.equals(obj);
            }
            MultiFactorAuthRequestPayload multiFactorAuthRequestPayload = (MultiFactorAuthRequestPayload) obj;
            return getTempAuthToken().equals(multiFactorAuthRequestPayload.getTempAuthToken()) && getMultiFactorAuthMethodsList().equals(multiFactorAuthRequestPayload.getMultiFactorAuthMethodsList()) && getUnknownFields().equals(multiFactorAuthRequestPayload.getUnknownFields());
        }

        @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayloadOrBuilder
        public MultiFactorAuthMethod getMultiFactorAuthMethods(int i8) {
            return this.multiFactorAuthMethods_.get(i8);
        }

        @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayloadOrBuilder
        public int getMultiFactorAuthMethodsCount() {
            return this.multiFactorAuthMethods_.size();
        }

        @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayloadOrBuilder
        public List<MultiFactorAuthMethod> getMultiFactorAuthMethodsList() {
            return this.multiFactorAuthMethods_;
        }

        @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayloadOrBuilder
        public MultiFactorAuthMethodOrBuilder getMultiFactorAuthMethodsOrBuilder(int i8) {
            return this.multiFactorAuthMethods_.get(i8);
        }

        @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayloadOrBuilder
        public List<? extends MultiFactorAuthMethodOrBuilder> getMultiFactorAuthMethodsOrBuilderList() {
            return this.multiFactorAuthMethods_;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.tempAuthToken_) ? AbstractC5209f0.computeStringSize(1, this.tempAuthToken_) : 0;
            for (int i9 = 0; i9 < this.multiFactorAuthMethods_.size(); i9++) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(2, this.multiFactorAuthMethods_.get(i9));
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayloadOrBuilder
        public String getTempAuthToken() {
            Object obj = this.tempAuthToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.tempAuthToken_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Authentication.MultiFactorAuthRequestPayloadOrBuilder
        public AbstractC5235o getTempAuthTokenBytes() {
            Object obj = this.tempAuthToken_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.tempAuthToken_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTempAuthToken().hashCode();
            if (getMultiFactorAuthMethodsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getMultiFactorAuthMethodsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Authentication.internal_static_maum_m2u_map_MultiFactorAuthRequestPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(MultiFactorAuthRequestPayload.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new MultiFactorAuthRequestPayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.tempAuthToken_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.tempAuthToken_);
            }
            for (int i8 = 0; i8 < this.multiFactorAuthMethods_.size(); i8++) {
                abstractC5248t.writeMessage(2, this.multiFactorAuthMethods_.get(i8));
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private MultiFactorAuthRequestPayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.tempAuthToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(MultiFactorAuthRequestPayload multiFactorAuthRequestPayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiFactorAuthRequestPayload);
        }

        public static MultiFactorAuthRequestPayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (MultiFactorAuthRequestPayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static MultiFactorAuthRequestPayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (MultiFactorAuthRequestPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static MultiFactorAuthRequestPayload parseFrom(AbstractC5235o abstractC5235o) {
            return (MultiFactorAuthRequestPayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public MultiFactorAuthRequestPayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static MultiFactorAuthRequestPayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (MultiFactorAuthRequestPayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MultiFactorAuthRequestPayload() {
            this.tempAuthToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.tempAuthToken_ = "";
            this.multiFactorAuthMethods_ = Collections.emptyList();
        }

        public static MultiFactorAuthRequestPayload parseFrom(byte[] bArr) {
            return (MultiFactorAuthRequestPayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static MultiFactorAuthRequestPayload parseFrom(byte[] bArr, M m8) {
            return (MultiFactorAuthRequestPayload) PARSER.parseFrom(bArr, m8);
        }

        public static MultiFactorAuthRequestPayload parseFrom(InputStream inputStream) {
            return (MultiFactorAuthRequestPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static MultiFactorAuthRequestPayload parseFrom(InputStream inputStream, M m8) {
            return (MultiFactorAuthRequestPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static MultiFactorAuthRequestPayload parseFrom(r rVar) {
            return (MultiFactorAuthRequestPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static MultiFactorAuthRequestPayload parseFrom(r rVar, M m8) {
            return (MultiFactorAuthRequestPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface MultiFactorAuthRequestPayloadOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        MultiFactorAuthRequestPayload.MultiFactorAuthMethod getMultiFactorAuthMethods(int i8);

        int getMultiFactorAuthMethodsCount();

        List<MultiFactorAuthRequestPayload.MultiFactorAuthMethod> getMultiFactorAuthMethodsList();

        MultiFactorAuthRequestPayload.MultiFactorAuthMethodOrBuilder getMultiFactorAuthMethodsOrBuilder(int i8);

        List<? extends MultiFactorAuthRequestPayload.MultiFactorAuthMethodOrBuilder> getMultiFactorAuthMethodsOrBuilderList();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        String getTempAuthToken();

        AbstractC5235o getTempAuthTokenBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class MultiFactorVerifyPayload extends AbstractC5209f0 implements MultiFactorVerifyPayloadOrBuilder {
        public static final int AUTH_PARAMS_FIELD_NUMBER = 2;
        public static final int DEVICE_FIELD_NUMBER = 4;
        public static final int MULTI_FACTOR_AUTH_RESULTS_FIELD_NUMBER = 3;
        public static final int TEMP_AUTH_TOKEN_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<AuthenticationParam> authParams_;
        private int bitField0_;
        private DeviceOuterClass.Device device_;
        private byte memoizedIsInitialized;
        private List<MultiFactorAuthResult> multiFactorAuthResults_;
        private volatile Object tempAuthToken_;
        private static final MultiFactorVerifyPayload DEFAULT_INSTANCE = new MultiFactorVerifyPayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Authentication.MultiFactorVerifyPayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public MultiFactorVerifyPayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = MultiFactorVerifyPayload.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements MultiFactorVerifyPayloadOrBuilder {
            private C5213g1 authParamsBuilder_;
            private List<AuthenticationParam> authParams_;
            private int bitField0_;
            private C5228l1 deviceBuilder_;
            private DeviceOuterClass.Device device_;
            private C5213g1 multiFactorAuthResultsBuilder_;
            private List<MultiFactorAuthResult> multiFactorAuthResults_;
            private Object tempAuthToken_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(MultiFactorVerifyPayload multiFactorVerifyPayload) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    multiFactorVerifyPayload.tempAuthToken_ = this.tempAuthToken_;
                }
                if ((i9 & 8) != 0) {
                    C5228l1 c5228l1 = this.deviceBuilder_;
                    multiFactorVerifyPayload.device_ = c5228l1 == null ? this.device_ : (DeviceOuterClass.Device) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                MultiFactorVerifyPayload.access$11076(multiFactorVerifyPayload, i8);
            }

            private void buildPartialRepeatedFields(MultiFactorVerifyPayload multiFactorVerifyPayload) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.authParams_ = Collections.unmodifiableList(this.authParams_);
                        this.bitField0_ &= -3;
                    }
                    multiFactorVerifyPayload.authParams_ = this.authParams_;
                } else {
                    multiFactorVerifyPayload.authParams_ = c5213g1.build();
                }
                C5213g1 c5213g12 = this.multiFactorAuthResultsBuilder_;
                if (c5213g12 != null) {
                    multiFactorVerifyPayload.multiFactorAuthResults_ = c5213g12.build();
                    return;
                }
                if ((this.bitField0_ & 4) != 0) {
                    this.multiFactorAuthResults_ = Collections.unmodifiableList(this.multiFactorAuthResults_);
                    this.bitField0_ &= -5;
                }
                multiFactorVerifyPayload.multiFactorAuthResults_ = this.multiFactorAuthResults_;
            }

            private void ensureAuthParamsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.authParams_ = new ArrayList(this.authParams_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureMultiFactorAuthResultsIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.multiFactorAuthResults_ = new ArrayList(this.multiFactorAuthResults_);
                    this.bitField0_ |= 4;
                }
            }

            private C5213g1 getAuthParamsFieldBuilder() {
                if (this.authParamsBuilder_ == null) {
                    this.authParamsBuilder_ = new C5213g1(this.authParams_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.authParams_ = null;
                }
                return this.authParamsBuilder_;
            }

            public static final C5269x.b getDescriptor() {
                return Authentication.internal_static_maum_m2u_map_MultiFactorVerifyPayload_descriptor;
            }

            private C5228l1 getDeviceFieldBuilder() {
                if (this.deviceBuilder_ == null) {
                    this.deviceBuilder_ = new C5228l1(getDevice(), getParentForChildren(), isClean());
                    this.device_ = null;
                }
                return this.deviceBuilder_;
            }

            private C5213g1 getMultiFactorAuthResultsFieldBuilder() {
                if (this.multiFactorAuthResultsBuilder_ == null) {
                    this.multiFactorAuthResultsBuilder_ = new C5213g1(this.multiFactorAuthResults_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.multiFactorAuthResults_ = null;
                }
                return this.multiFactorAuthResultsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getAuthParamsFieldBuilder();
                    getMultiFactorAuthResultsFieldBuilder();
                    getDeviceFieldBuilder();
                }
            }

            public Builder addAllAuthParams(Iterable<? extends AuthenticationParam> iterable) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 == null) {
                    ensureAuthParamsIsMutable();
                    AbstractC5196b.a.addAll((Iterable) iterable, (List) this.authParams_);
                    onChanged();
                } else {
                    c5213g1.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addAllMultiFactorAuthResults(Iterable<? extends MultiFactorAuthResult> iterable) {
                C5213g1 c5213g1 = this.multiFactorAuthResultsBuilder_;
                if (c5213g1 == null) {
                    ensureMultiFactorAuthResultsIsMutable();
                    AbstractC5196b.a.addAll((Iterable) iterable, (List) this.multiFactorAuthResults_);
                    onChanged();
                } else {
                    c5213g1.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addAuthParams(AuthenticationParam authenticationParam) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 == null) {
                    authenticationParam.getClass();
                    ensureAuthParamsIsMutable();
                    this.authParams_.add(authenticationParam);
                    onChanged();
                } else {
                    c5213g1.addMessage(authenticationParam);
                }
                return this;
            }

            public AuthenticationParam.Builder addAuthParamsBuilder() {
                return (AuthenticationParam.Builder) getAuthParamsFieldBuilder().addBuilder(AuthenticationParam.getDefaultInstance());
            }

            public Builder addMultiFactorAuthResults(MultiFactorAuthResult multiFactorAuthResult) {
                C5213g1 c5213g1 = this.multiFactorAuthResultsBuilder_;
                if (c5213g1 == null) {
                    multiFactorAuthResult.getClass();
                    ensureMultiFactorAuthResultsIsMutable();
                    this.multiFactorAuthResults_.add(multiFactorAuthResult);
                    onChanged();
                } else {
                    c5213g1.addMessage(multiFactorAuthResult);
                }
                return this;
            }

            public MultiFactorAuthResult.Builder addMultiFactorAuthResultsBuilder() {
                return (MultiFactorAuthResult.Builder) getMultiFactorAuthResultsFieldBuilder().addBuilder(MultiFactorAuthResult.getDefaultInstance());
            }

            public Builder clearAuthParams() {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 == null) {
                    this.authParams_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    c5213g1.clear();
                }
                return this;
            }

            public Builder clearDevice() {
                this.bitField0_ &= -9;
                this.device_ = null;
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.deviceBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearMultiFactorAuthResults() {
                C5213g1 c5213g1 = this.multiFactorAuthResultsBuilder_;
                if (c5213g1 == null) {
                    this.multiFactorAuthResults_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                    onChanged();
                } else {
                    c5213g1.clear();
                }
                return this;
            }

            public Builder clearTempAuthToken() {
                this.tempAuthToken_ = MultiFactorVerifyPayload.getDefaultInstance().getTempAuthToken();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
            public AuthenticationParam getAuthParams(int i8) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                return c5213g1 == null ? this.authParams_.get(i8) : (AuthenticationParam) c5213g1.getMessage(i8);
            }

            public AuthenticationParam.Builder getAuthParamsBuilder(int i8) {
                return (AuthenticationParam.Builder) getAuthParamsFieldBuilder().getBuilder(i8);
            }

            public List<AuthenticationParam.Builder> getAuthParamsBuilderList() {
                return getAuthParamsFieldBuilder().getBuilderList();
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
            public int getAuthParamsCount() {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                return c5213g1 == null ? this.authParams_.size() : c5213g1.getCount();
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
            public List<AuthenticationParam> getAuthParamsList() {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                return c5213g1 == null ? Collections.unmodifiableList(this.authParams_) : c5213g1.getMessageList();
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
            public AuthenticationParamOrBuilder getAuthParamsOrBuilder(int i8) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                return c5213g1 == null ? this.authParams_.get(i8) : (AuthenticationParamOrBuilder) c5213g1.getMessageOrBuilder(i8);
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
            public List<? extends AuthenticationParamOrBuilder> getAuthParamsOrBuilderList() {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                return c5213g1 != null ? c5213g1.getMessageOrBuilderList() : Collections.unmodifiableList(this.authParams_);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Authentication.internal_static_maum_m2u_map_MultiFactorVerifyPayload_descriptor;
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
            public DeviceOuterClass.Device getDevice() {
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 != null) {
                    return (DeviceOuterClass.Device) c5228l1.getMessage();
                }
                DeviceOuterClass.Device device = this.device_;
                return device == null ? DeviceOuterClass.Device.getDefaultInstance() : device;
            }

            public DeviceOuterClass.Device.Builder getDeviceBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (DeviceOuterClass.Device.Builder) getDeviceFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
            public DeviceOuterClass.DeviceOrBuilder getDeviceOrBuilder() {
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 != null) {
                    return (DeviceOuterClass.DeviceOrBuilder) c5228l1.getMessageOrBuilder();
                }
                DeviceOuterClass.Device device = this.device_;
                return device == null ? DeviceOuterClass.Device.getDefaultInstance() : device;
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
            public MultiFactorAuthResult getMultiFactorAuthResults(int i8) {
                C5213g1 c5213g1 = this.multiFactorAuthResultsBuilder_;
                return c5213g1 == null ? this.multiFactorAuthResults_.get(i8) : (MultiFactorAuthResult) c5213g1.getMessage(i8);
            }

            public MultiFactorAuthResult.Builder getMultiFactorAuthResultsBuilder(int i8) {
                return (MultiFactorAuthResult.Builder) getMultiFactorAuthResultsFieldBuilder().getBuilder(i8);
            }

            public List<MultiFactorAuthResult.Builder> getMultiFactorAuthResultsBuilderList() {
                return getMultiFactorAuthResultsFieldBuilder().getBuilderList();
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
            public int getMultiFactorAuthResultsCount() {
                C5213g1 c5213g1 = this.multiFactorAuthResultsBuilder_;
                return c5213g1 == null ? this.multiFactorAuthResults_.size() : c5213g1.getCount();
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
            public List<MultiFactorAuthResult> getMultiFactorAuthResultsList() {
                C5213g1 c5213g1 = this.multiFactorAuthResultsBuilder_;
                return c5213g1 == null ? Collections.unmodifiableList(this.multiFactorAuthResults_) : c5213g1.getMessageList();
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
            public MultiFactorAuthResultOrBuilder getMultiFactorAuthResultsOrBuilder(int i8) {
                C5213g1 c5213g1 = this.multiFactorAuthResultsBuilder_;
                return c5213g1 == null ? this.multiFactorAuthResults_.get(i8) : (MultiFactorAuthResultOrBuilder) c5213g1.getMessageOrBuilder(i8);
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
            public List<? extends MultiFactorAuthResultOrBuilder> getMultiFactorAuthResultsOrBuilderList() {
                C5213g1 c5213g1 = this.multiFactorAuthResultsBuilder_;
                return c5213g1 != null ? c5213g1.getMessageOrBuilderList() : Collections.unmodifiableList(this.multiFactorAuthResults_);
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
            public String getTempAuthToken() {
                Object obj = this.tempAuthToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.tempAuthToken_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
            public AbstractC5235o getTempAuthTokenBytes() {
                Object obj = this.tempAuthToken_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.tempAuthToken_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
            public boolean hasDevice() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Authentication.internal_static_maum_m2u_map_MultiFactorVerifyPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(MultiFactorVerifyPayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDevice(DeviceOuterClass.Device device) {
                DeviceOuterClass.Device device2;
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(device);
                } else if ((this.bitField0_ & 8) == 0 || (device2 = this.device_) == null || device2 == DeviceOuterClass.Device.getDefaultInstance()) {
                    this.device_ = device;
                } else {
                    getDeviceBuilder().mergeFrom(device);
                }
                if (this.device_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder removeAuthParams(int i8) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 == null) {
                    ensureAuthParamsIsMutable();
                    this.authParams_.remove(i8);
                    onChanged();
                } else {
                    c5213g1.remove(i8);
                }
                return this;
            }

            public Builder removeMultiFactorAuthResults(int i8) {
                C5213g1 c5213g1 = this.multiFactorAuthResultsBuilder_;
                if (c5213g1 == null) {
                    ensureMultiFactorAuthResultsIsMutable();
                    this.multiFactorAuthResults_.remove(i8);
                    onChanged();
                } else {
                    c5213g1.remove(i8);
                }
                return this;
            }

            public Builder setAuthParams(int i8, AuthenticationParam authenticationParam) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 == null) {
                    authenticationParam.getClass();
                    ensureAuthParamsIsMutable();
                    this.authParams_.set(i8, authenticationParam);
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, authenticationParam);
                }
                return this;
            }

            public Builder setDevice(DeviceOuterClass.Device device) {
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 == null) {
                    device.getClass();
                    this.device_ = device;
                } else {
                    c5228l1.setMessage(device);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setMultiFactorAuthResults(int i8, MultiFactorAuthResult multiFactorAuthResult) {
                C5213g1 c5213g1 = this.multiFactorAuthResultsBuilder_;
                if (c5213g1 == null) {
                    multiFactorAuthResult.getClass();
                    ensureMultiFactorAuthResultsIsMutable();
                    this.multiFactorAuthResults_.set(i8, multiFactorAuthResult);
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, multiFactorAuthResult);
                }
                return this;
            }

            public Builder setTempAuthToken(String str) {
                str.getClass();
                this.tempAuthToken_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTempAuthTokenBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.tempAuthToken_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.tempAuthToken_ = "";
                this.authParams_ = Collections.emptyList();
                this.multiFactorAuthResults_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public MultiFactorVerifyPayload build() {
                MultiFactorVerifyPayload multiFactorVerifyPayloadBuildPartial = buildPartial();
                if (multiFactorVerifyPayloadBuildPartial.isInitialized()) {
                    return multiFactorVerifyPayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) multiFactorVerifyPayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public MultiFactorVerifyPayload buildPartial() {
                MultiFactorVerifyPayload multiFactorVerifyPayload = new MultiFactorVerifyPayload(this, null);
                buildPartialRepeatedFields(multiFactorVerifyPayload);
                if (this.bitField0_ != 0) {
                    buildPartial0(multiFactorVerifyPayload);
                }
                onBuilt();
                return multiFactorVerifyPayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public MultiFactorVerifyPayload getDefaultInstanceForType() {
                return MultiFactorVerifyPayload.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            public AuthenticationParam.Builder addAuthParamsBuilder(int i8) {
                return (AuthenticationParam.Builder) getAuthParamsFieldBuilder().addBuilder(i8, AuthenticationParam.getDefaultInstance());
            }

            public MultiFactorAuthResult.Builder addMultiFactorAuthResultsBuilder(int i8) {
                return (MultiFactorAuthResult.Builder) getMultiFactorAuthResultsFieldBuilder().addBuilder(i8, MultiFactorAuthResult.getDefaultInstance());
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.tempAuthToken_ = "";
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 == null) {
                    this.authParams_ = Collections.emptyList();
                } else {
                    this.authParams_ = null;
                    c5213g1.clear();
                }
                this.bitField0_ &= -3;
                C5213g1 c5213g12 = this.multiFactorAuthResultsBuilder_;
                if (c5213g12 == null) {
                    this.multiFactorAuthResults_ = Collections.emptyList();
                } else {
                    this.multiFactorAuthResults_ = null;
                    c5213g12.clear();
                }
                this.bitField0_ &= -5;
                this.device_ = null;
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.deviceBuilder_ = null;
                }
                return this;
            }

            public Builder addAuthParams(int i8, AuthenticationParam authenticationParam) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 == null) {
                    authenticationParam.getClass();
                    ensureAuthParamsIsMutable();
                    this.authParams_.add(i8, authenticationParam);
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, authenticationParam);
                }
                return this;
            }

            public Builder addMultiFactorAuthResults(int i8, MultiFactorAuthResult multiFactorAuthResult) {
                C5213g1 c5213g1 = this.multiFactorAuthResultsBuilder_;
                if (c5213g1 == null) {
                    multiFactorAuthResult.getClass();
                    ensureMultiFactorAuthResultsIsMutable();
                    this.multiFactorAuthResults_.add(i8, multiFactorAuthResult);
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, multiFactorAuthResult);
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof MultiFactorVerifyPayload) {
                    return mergeFrom((MultiFactorVerifyPayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setAuthParams(int i8, AuthenticationParam.Builder builder) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 == null) {
                    ensureAuthParamsIsMutable();
                    this.authParams_.set(i8, builder.build());
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, builder.build());
                }
                return this;
            }

            public Builder setDevice(DeviceOuterClass.Device.Builder builder) {
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 == null) {
                    this.device_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setMultiFactorAuthResults(int i8, MultiFactorAuthResult.Builder builder) {
                C5213g1 c5213g1 = this.multiFactorAuthResultsBuilder_;
                if (c5213g1 == null) {
                    ensureMultiFactorAuthResultsIsMutable();
                    this.multiFactorAuthResults_.set(i8, builder.build());
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, builder.build());
                }
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.tempAuthToken_ = "";
                this.authParams_ = Collections.emptyList();
                this.multiFactorAuthResults_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(MultiFactorVerifyPayload multiFactorVerifyPayload) {
                if (multiFactorVerifyPayload == MultiFactorVerifyPayload.getDefaultInstance()) {
                    return this;
                }
                if (!multiFactorVerifyPayload.getTempAuthToken().isEmpty()) {
                    this.tempAuthToken_ = multiFactorVerifyPayload.tempAuthToken_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (this.authParamsBuilder_ == null) {
                    if (!multiFactorVerifyPayload.authParams_.isEmpty()) {
                        if (this.authParams_.isEmpty()) {
                            this.authParams_ = multiFactorVerifyPayload.authParams_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureAuthParamsIsMutable();
                            this.authParams_.addAll(multiFactorVerifyPayload.authParams_);
                        }
                        onChanged();
                    }
                } else if (!multiFactorVerifyPayload.authParams_.isEmpty()) {
                    if (!this.authParamsBuilder_.isEmpty()) {
                        this.authParamsBuilder_.addAllMessages(multiFactorVerifyPayload.authParams_);
                    } else {
                        this.authParamsBuilder_.dispose();
                        this.authParamsBuilder_ = null;
                        this.authParams_ = multiFactorVerifyPayload.authParams_;
                        this.bitField0_ &= -3;
                        this.authParamsBuilder_ = AbstractC5209f0.alwaysUseFieldBuilders ? getAuthParamsFieldBuilder() : null;
                    }
                }
                if (this.multiFactorAuthResultsBuilder_ == null) {
                    if (!multiFactorVerifyPayload.multiFactorAuthResults_.isEmpty()) {
                        if (this.multiFactorAuthResults_.isEmpty()) {
                            this.multiFactorAuthResults_ = multiFactorVerifyPayload.multiFactorAuthResults_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureMultiFactorAuthResultsIsMutable();
                            this.multiFactorAuthResults_.addAll(multiFactorVerifyPayload.multiFactorAuthResults_);
                        }
                        onChanged();
                    }
                } else if (!multiFactorVerifyPayload.multiFactorAuthResults_.isEmpty()) {
                    if (!this.multiFactorAuthResultsBuilder_.isEmpty()) {
                        this.multiFactorAuthResultsBuilder_.addAllMessages(multiFactorVerifyPayload.multiFactorAuthResults_);
                    } else {
                        this.multiFactorAuthResultsBuilder_.dispose();
                        this.multiFactorAuthResultsBuilder_ = null;
                        this.multiFactorAuthResults_ = multiFactorVerifyPayload.multiFactorAuthResults_;
                        this.bitField0_ &= -5;
                        this.multiFactorAuthResultsBuilder_ = AbstractC5209f0.alwaysUseFieldBuilders ? getMultiFactorAuthResultsFieldBuilder() : null;
                    }
                }
                if (multiFactorVerifyPayload.hasDevice()) {
                    mergeDevice(multiFactorVerifyPayload.getDevice());
                }
                mergeUnknownFields(multiFactorVerifyPayload.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder addAuthParams(AuthenticationParam.Builder builder) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 == null) {
                    ensureAuthParamsIsMutable();
                    this.authParams_.add(builder.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(builder.build());
                }
                return this;
            }

            public Builder addMultiFactorAuthResults(MultiFactorAuthResult.Builder builder) {
                C5213g1 c5213g1 = this.multiFactorAuthResultsBuilder_;
                if (c5213g1 == null) {
                    ensureMultiFactorAuthResultsIsMutable();
                    this.multiFactorAuthResults_.add(builder.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(builder.build());
                }
                return this;
            }

            public Builder addAuthParams(int i8, AuthenticationParam.Builder builder) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 == null) {
                    ensureAuthParamsIsMutable();
                    this.authParams_.add(i8, builder.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, builder.build());
                }
                return this;
            }

            public Builder addMultiFactorAuthResults(int i8, MultiFactorAuthResult.Builder builder) {
                C5213g1 c5213g1 = this.multiFactorAuthResultsBuilder_;
                if (c5213g1 == null) {
                    ensureMultiFactorAuthResultsIsMutable();
                    this.multiFactorAuthResults_.add(i8, builder.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, builder.build());
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.tempAuthToken_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    AuthenticationParam authenticationParam = (AuthenticationParam) rVar.readMessage(AuthenticationParam.parser(), m8);
                                    C5213g1 c5213g1 = this.authParamsBuilder_;
                                    if (c5213g1 == null) {
                                        ensureAuthParamsIsMutable();
                                        this.authParams_.add(authenticationParam);
                                    } else {
                                        c5213g1.addMessage(authenticationParam);
                                    }
                                } else if (tag == 26) {
                                    MultiFactorAuthResult multiFactorAuthResult = (MultiFactorAuthResult) rVar.readMessage(MultiFactorAuthResult.parser(), m8);
                                    C5213g1 c5213g12 = this.multiFactorAuthResultsBuilder_;
                                    if (c5213g12 == null) {
                                        ensureMultiFactorAuthResultsIsMutable();
                                        this.multiFactorAuthResults_.add(multiFactorAuthResult);
                                    } else {
                                        c5213g12.addMessage(multiFactorAuthResult);
                                    }
                                } else if (tag != 34) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getDeviceFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 8;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        public static final class MultiFactorAuthResult extends AbstractC5209f0 implements MultiFactorAuthResultOrBuilder {
            public static final int META_FIELD_NUMBER = 3;
            public static final int METHOD_FIELD_NUMBER = 1;
            public static final int VALUE_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private C5240p1 meta_;
            private volatile Object method_;
            private volatile Object value_;
            private static final MultiFactorAuthResult DEFAULT_INSTANCE = new MultiFactorAuthResult();
            private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Authentication.MultiFactorVerifyPayload.MultiFactorAuthResult.1
                @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
                public MultiFactorAuthResult parsePartialFrom(r rVar, M m8) throws C5230m0 {
                    Builder builderNewBuilder = MultiFactorAuthResult.newBuilder();
                    try {
                        builderNewBuilder.mergeFrom(rVar, m8);
                        return builderNewBuilder.buildPartial();
                    } catch (E1 e8) {
                        throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (C5230m0 e9) {
                        throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (IOException e10) {
                        throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                    }
                }
            };

            public static final class Builder extends AbstractC5209f0.b implements MultiFactorAuthResultOrBuilder {
                private int bitField0_;
                private C5228l1 metaBuilder_;
                private C5240p1 meta_;
                private Object method_;
                private Object value_;

                /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                    this(cVar);
                }

                private void buildPartial0(MultiFactorAuthResult multiFactorAuthResult) {
                    int i8;
                    int i9 = this.bitField0_;
                    if ((i9 & 1) != 0) {
                        multiFactorAuthResult.method_ = this.method_;
                    }
                    if ((i9 & 2) != 0) {
                        multiFactorAuthResult.value_ = this.value_;
                    }
                    if ((i9 & 4) != 0) {
                        C5228l1 c5228l1 = this.metaBuilder_;
                        multiFactorAuthResult.meta_ = c5228l1 == null ? this.meta_ : (C5240p1) c5228l1.build();
                        i8 = 1;
                    } else {
                        i8 = 0;
                    }
                    MultiFactorAuthResult.access$9976(multiFactorAuthResult, i8);
                }

                public static final C5269x.b getDescriptor() {
                    return Authentication.internal_static_maum_m2u_map_MultiFactorVerifyPayload_MultiFactorAuthResult_descriptor;
                }

                private C5228l1 getMetaFieldBuilder() {
                    if (this.metaBuilder_ == null) {
                        this.metaBuilder_ = new C5228l1(getMeta(), getParentForChildren(), isClean());
                        this.meta_ = null;
                    }
                    return this.metaBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (AbstractC5209f0.alwaysUseFieldBuilders) {
                        getMetaFieldBuilder();
                    }
                }

                public Builder clearMeta() {
                    this.bitField0_ &= -5;
                    this.meta_ = null;
                    C5228l1 c5228l1 = this.metaBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.dispose();
                        this.metaBuilder_ = null;
                    }
                    onChanged();
                    return this;
                }

                public Builder clearMethod() {
                    this.method_ = MultiFactorAuthResult.getDefaultInstance().getMethod();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearValue() {
                    this.value_ = MultiFactorAuthResult.getDefaultInstance().getValue();
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
                public C5269x.b getDescriptorForType() {
                    return Authentication.internal_static_maum_m2u_map_MultiFactorVerifyPayload_MultiFactorAuthResult_descriptor;
                }

                @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayload.MultiFactorAuthResultOrBuilder
                public C5240p1 getMeta() {
                    C5228l1 c5228l1 = this.metaBuilder_;
                    if (c5228l1 != null) {
                        return (C5240p1) c5228l1.getMessage();
                    }
                    C5240p1 c5240p1 = this.meta_;
                    return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
                }

                public C5240p1.b getMetaBuilder() {
                    this.bitField0_ |= 4;
                    onChanged();
                    return (C5240p1.b) getMetaFieldBuilder().getBuilder();
                }

                @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayload.MultiFactorAuthResultOrBuilder
                public InterfaceC5243q1 getMetaOrBuilder() {
                    C5228l1 c5228l1 = this.metaBuilder_;
                    if (c5228l1 != null) {
                        return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                    }
                    C5240p1 c5240p1 = this.meta_;
                    return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
                }

                @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayload.MultiFactorAuthResultOrBuilder
                public String getMethod() {
                    Object obj = this.method_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.method_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayload.MultiFactorAuthResultOrBuilder
                public AbstractC5235o getMethodBytes() {
                    Object obj = this.method_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.method_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayload.MultiFactorAuthResultOrBuilder
                public String getValue() {
                    Object obj = this.value_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayload.MultiFactorAuthResultOrBuilder
                public AbstractC5235o getValueBytes() {
                    Object obj = this.value_;
                    if (!(obj instanceof String)) {
                        return (AbstractC5235o) obj;
                    }
                    AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                    this.value_ = abstractC5235oCopyFromUtf8;
                    return abstractC5235oCopyFromUtf8;
                }

                @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayload.MultiFactorAuthResultOrBuilder
                public boolean hasMeta() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b
                protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                    return Authentication.internal_static_maum_m2u_map_MultiFactorVerifyPayload_MultiFactorAuthResult_fieldAccessorTable.ensureFieldAccessorsInitialized(MultiFactorAuthResult.class, Builder.class);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeMeta(C5240p1 c5240p1) {
                    C5240p1 c5240p12;
                    C5228l1 c5228l1 = this.metaBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.mergeFrom(c5240p1);
                    } else if ((this.bitField0_ & 4) == 0 || (c5240p12 = this.meta_) == null || c5240p12 == C5240p1.getDefaultInstance()) {
                        this.meta_ = c5240p1;
                    } else {
                        getMetaBuilder().mergeFrom(c5240p1);
                    }
                    if (this.meta_ != null) {
                        this.bitField0_ |= 4;
                        onChanged();
                    }
                    return this;
                }

                public Builder setMeta(C5240p1 c5240p1) {
                    C5228l1 c5228l1 = this.metaBuilder_;
                    if (c5228l1 == null) {
                        c5240p1.getClass();
                        this.meta_ = c5240p1;
                    } else {
                        c5228l1.setMessage(c5240p1);
                    }
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setMethod(String str) {
                    str.getClass();
                    this.method_ = str;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setMethodBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.method_ = abstractC5235o;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setValue(String str) {
                    str.getClass();
                    this.value_ = str;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setValueBytes(AbstractC5235o abstractC5235o) {
                    abstractC5235o.getClass();
                    AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                    this.value_ = abstractC5235o;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                    this.method_ = "";
                    this.value_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                    return (Builder) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public MultiFactorAuthResult build() {
                    MultiFactorAuthResult multiFactorAuthResultBuildPartial = buildPartial();
                    if (multiFactorAuthResultBuildPartial.isInitialized()) {
                        return multiFactorAuthResultBuildPartial;
                    }
                    throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) multiFactorAuthResultBuildPartial);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public MultiFactorAuthResult buildPartial() {
                    MultiFactorAuthResult multiFactorAuthResult = new MultiFactorAuthResult(this, null);
                    if (this.bitField0_ != 0) {
                        buildPartial0(multiFactorAuthResult);
                    }
                    onBuilt();
                    return multiFactorAuthResult;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearField(C5269x.g gVar) {
                    return (Builder) super.clearField(gVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public MultiFactorAuthResult getDefaultInstanceForType() {
                    return MultiFactorAuthResult.getDefaultInstance();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setField(C5269x.g gVar, Object obj) {
                    return (Builder) super.setField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                    return (Builder) super.setRepeatedField(gVar, i8, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder setUnknownFields(G1 g12) {
                    return (Builder) super.setUnknownFields(g12);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearOneof(C5269x.l lVar) {
                    return (Builder) super.clearOneof(lVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public final Builder mergeUnknownFields(G1 g12) {
                    return (Builder) super.mergeUnknownFields(g12);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.method_ = "";
                    this.value_ = "";
                    this.meta_ = null;
                    C5228l1 c5228l1 = this.metaBuilder_;
                    if (c5228l1 != null) {
                        c5228l1.dispose();
                        this.metaBuilder_ = null;
                    }
                    return this;
                }

                private Builder(AbstractC5209f0.c cVar) {
                    super(cVar);
                    this.method_ = "";
                    this.value_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
                /* renamed from: clone */
                public Builder mo3clone() {
                    return (Builder) super.mo3clone();
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder mergeFrom(H0 h02) {
                    if (h02 instanceof MultiFactorAuthResult) {
                        return mergeFrom((MultiFactorAuthResult) h02);
                    }
                    super.mergeFrom(h02);
                    return this;
                }

                public Builder setMeta(C5240p1.b bVar) {
                    C5228l1 c5228l1 = this.metaBuilder_;
                    if (c5228l1 == null) {
                        this.meta_ = bVar.build();
                    } else {
                        c5228l1.setMessage(bVar.build());
                    }
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder mergeFrom(MultiFactorAuthResult multiFactorAuthResult) {
                    if (multiFactorAuthResult == MultiFactorAuthResult.getDefaultInstance()) {
                        return this;
                    }
                    if (!multiFactorAuthResult.getMethod().isEmpty()) {
                        this.method_ = multiFactorAuthResult.method_;
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    if (!multiFactorAuthResult.getValue().isEmpty()) {
                        this.value_ = multiFactorAuthResult.value_;
                        this.bitField0_ |= 2;
                        onChanged();
                    }
                    if (multiFactorAuthResult.hasMeta()) {
                        mergeMeta(multiFactorAuthResult.getMeta());
                    }
                    mergeUnknownFields(multiFactorAuthResult.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Builder mergeFrom(r rVar, M m8) {
                    m8.getClass();
                    boolean z8 = false;
                    while (!z8) {
                        try {
                            try {
                                int tag = rVar.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.method_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 1;
                                    } else if (tag == 18) {
                                        this.value_ = rVar.readStringRequireUtf8();
                                        this.bitField0_ |= 2;
                                    } else if (tag != 26) {
                                        if (!super.parseUnknownField(rVar, m8, tag)) {
                                        }
                                    } else {
                                        rVar.readMessage(getMetaFieldBuilder().getBuilder(), m8);
                                        this.bitField0_ |= 4;
                                    }
                                }
                                z8 = true;
                            } catch (C5230m0 e8) {
                                throw e8.unwrapIOException();
                            }
                        } catch (Throwable th) {
                            onChanged();
                            throw th;
                        }
                    }
                    onChanged();
                    return this;
                }
            }

            /* synthetic */ MultiFactorAuthResult(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
                this(bVar);
            }

            static /* synthetic */ int access$9976(MultiFactorAuthResult multiFactorAuthResult, int i8) {
                int i9 = i8 | multiFactorAuthResult.bitField0_;
                multiFactorAuthResult.bitField0_ = i9;
                return i9;
            }

            public static MultiFactorAuthResult getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final C5269x.b getDescriptor() {
                return Authentication.internal_static_maum_m2u_map_MultiFactorVerifyPayload_MultiFactorAuthResult_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static MultiFactorAuthResult parseDelimitedFrom(InputStream inputStream) {
                return (MultiFactorAuthResult) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static MultiFactorAuthResult parseFrom(ByteBuffer byteBuffer) {
                return (MultiFactorAuthResult) PARSER.parseFrom(byteBuffer);
            }

            public static Z0 parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MultiFactorAuthResult)) {
                    return super.equals(obj);
                }
                MultiFactorAuthResult multiFactorAuthResult = (MultiFactorAuthResult) obj;
                if (getMethod().equals(multiFactorAuthResult.getMethod()) && getValue().equals(multiFactorAuthResult.getValue()) && hasMeta() == multiFactorAuthResult.hasMeta()) {
                    return (!hasMeta() || getMeta().equals(multiFactorAuthResult.getMeta())) && getUnknownFields().equals(multiFactorAuthResult.getUnknownFields());
                }
                return false;
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayload.MultiFactorAuthResultOrBuilder
            public C5240p1 getMeta() {
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayload.MultiFactorAuthResultOrBuilder
            public InterfaceC5243q1 getMetaOrBuilder() {
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayload.MultiFactorAuthResultOrBuilder
            public String getMethod() {
                Object obj = this.method_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.method_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayload.MultiFactorAuthResultOrBuilder
            public AbstractC5235o getMethodBytes() {
                Object obj = this.method_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.method_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Z0 getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public int getSerializedSize() {
                int i8 = this.memoizedSize;
                if (i8 != -1) {
                    return i8;
                }
                int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.method_) ? AbstractC5209f0.computeStringSize(1, this.method_) : 0;
                if (!AbstractC5209f0.isStringEmpty(this.value_)) {
                    iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.value_);
                }
                if ((1 & this.bitField0_) != 0) {
                    iComputeStringSize += AbstractC5248t.computeMessageSize(3, getMeta());
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayload.MultiFactorAuthResultOrBuilder
            public String getValue() {
                Object obj = this.value_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.value_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayload.MultiFactorAuthResultOrBuilder
            public AbstractC5235o getValueBytes() {
                Object obj = this.value_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.value_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayload.MultiFactorAuthResultOrBuilder
            public boolean hasMeta() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public int hashCode() {
                int i8 = this.memoizedHashCode;
                if (i8 != 0) {
                    return i8;
                }
                int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getMethod().hashCode()) * 37) + 2) * 53) + getValue().hashCode();
                if (hasMeta()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getMeta().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Authentication.internal_static_maum_m2u_map_MultiFactorVerifyPayload_MultiFactorAuthResult_fieldAccessorTable.ensureFieldAccessorsInitialized(MultiFactorAuthResult.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                byte b9 = this.memoizedIsInitialized;
                if (b9 == 1) {
                    return true;
                }
                if (b9 == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected Object newInstance(AbstractC5209f0.h hVar) {
                return new MultiFactorAuthResult();
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public void writeTo(AbstractC5248t abstractC5248t) {
                if (!AbstractC5209f0.isStringEmpty(this.method_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 1, this.method_);
                }
                if (!AbstractC5209f0.isStringEmpty(this.value_)) {
                    AbstractC5209f0.writeString(abstractC5248t, 2, this.value_);
                }
                if ((this.bitField0_ & 1) != 0) {
                    abstractC5248t.writeMessage(3, getMeta());
                }
                getUnknownFields().writeTo(abstractC5248t);
            }

            private MultiFactorAuthResult(AbstractC5209f0.b bVar) {
                super(bVar);
                this.method_ = "";
                this.value_ = "";
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(MultiFactorAuthResult multiFactorAuthResult) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiFactorAuthResult);
            }

            public static MultiFactorAuthResult parseFrom(ByteBuffer byteBuffer, M m8) {
                return (MultiFactorAuthResult) PARSER.parseFrom(byteBuffer, m8);
            }

            public static MultiFactorAuthResult parseDelimitedFrom(InputStream inputStream, M m8) {
                return (MultiFactorAuthResult) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
            }

            public static MultiFactorAuthResult parseFrom(AbstractC5235o abstractC5235o) {
                return (MultiFactorAuthResult) PARSER.parseFrom(abstractC5235o);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public MultiFactorAuthResult getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder toBuilder() {
                AnonymousClass1 anonymousClass1 = null;
                return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
            }

            public static MultiFactorAuthResult parseFrom(AbstractC5235o abstractC5235o, M m8) {
                return (MultiFactorAuthResult) PARSER.parseFrom(abstractC5235o, m8);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static MultiFactorAuthResult parseFrom(byte[] bArr) {
                return (MultiFactorAuthResult) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.AbstractC5209f0
            public Builder newBuilderForType(AbstractC5209f0.c cVar) {
                return new Builder(cVar, null);
            }

            private MultiFactorAuthResult() {
                this.method_ = "";
                this.value_ = "";
                this.memoizedIsInitialized = (byte) -1;
                this.method_ = "";
                this.value_ = "";
            }

            public static MultiFactorAuthResult parseFrom(byte[] bArr, M m8) {
                return (MultiFactorAuthResult) PARSER.parseFrom(bArr, m8);
            }

            public static MultiFactorAuthResult parseFrom(InputStream inputStream) {
                return (MultiFactorAuthResult) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
            }

            public static MultiFactorAuthResult parseFrom(InputStream inputStream, M m8) {
                return (MultiFactorAuthResult) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
            }

            public static MultiFactorAuthResult parseFrom(r rVar) {
                return (MultiFactorAuthResult) AbstractC5209f0.parseWithIOException(PARSER, rVar);
            }

            public static MultiFactorAuthResult parseFrom(r rVar, M m8) {
                return (MultiFactorAuthResult) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
            }
        }

        public interface MultiFactorAuthResultOrBuilder extends N0 {
            @Override // com.google.protobuf.N0
            /* synthetic */ List findInitializationErrors();

            @Override // com.google.protobuf.N0
            /* synthetic */ java.util.Map getAllFields();

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ H0 getDefaultInstanceForType();

            @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ C5269x.b getDescriptorForType();

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getField(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ String getInitializationErrorString();

            C5240p1 getMeta();

            InterfaceC5243q1 getMetaOrBuilder();

            String getMethod();

            AbstractC5235o getMethodBytes();

            @Override // com.google.protobuf.N0
            /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

            @Override // com.google.protobuf.N0
            /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ G1 getUnknownFields();

            String getValue();

            AbstractC5235o getValueBytes();

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasField(C5269x.g gVar);

            boolean hasMeta();

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasOneof(C5269x.l lVar);

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ boolean isInitialized();
        }

        /* synthetic */ MultiFactorVerifyPayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$11076(MultiFactorVerifyPayload multiFactorVerifyPayload, int i8) {
            int i9 = i8 | multiFactorVerifyPayload.bitField0_;
            multiFactorVerifyPayload.bitField0_ = i9;
            return i9;
        }

        public static MultiFactorVerifyPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Authentication.internal_static_maum_m2u_map_MultiFactorVerifyPayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MultiFactorVerifyPayload parseDelimitedFrom(InputStream inputStream) {
            return (MultiFactorVerifyPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MultiFactorVerifyPayload parseFrom(ByteBuffer byteBuffer) {
            return (MultiFactorVerifyPayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MultiFactorVerifyPayload)) {
                return super.equals(obj);
            }
            MultiFactorVerifyPayload multiFactorVerifyPayload = (MultiFactorVerifyPayload) obj;
            if (getTempAuthToken().equals(multiFactorVerifyPayload.getTempAuthToken()) && getAuthParamsList().equals(multiFactorVerifyPayload.getAuthParamsList()) && getMultiFactorAuthResultsList().equals(multiFactorVerifyPayload.getMultiFactorAuthResultsList()) && hasDevice() == multiFactorVerifyPayload.hasDevice()) {
                return (!hasDevice() || getDevice().equals(multiFactorVerifyPayload.getDevice())) && getUnknownFields().equals(multiFactorVerifyPayload.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
        public AuthenticationParam getAuthParams(int i8) {
            return this.authParams_.get(i8);
        }

        @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
        public int getAuthParamsCount() {
            return this.authParams_.size();
        }

        @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
        public List<AuthenticationParam> getAuthParamsList() {
            return this.authParams_;
        }

        @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
        public AuthenticationParamOrBuilder getAuthParamsOrBuilder(int i8) {
            return this.authParams_.get(i8);
        }

        @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
        public List<? extends AuthenticationParamOrBuilder> getAuthParamsOrBuilderList() {
            return this.authParams_;
        }

        @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
        public DeviceOuterClass.Device getDevice() {
            DeviceOuterClass.Device device = this.device_;
            return device == null ? DeviceOuterClass.Device.getDefaultInstance() : device;
        }

        @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
        public DeviceOuterClass.DeviceOrBuilder getDeviceOrBuilder() {
            DeviceOuterClass.Device device = this.device_;
            return device == null ? DeviceOuterClass.Device.getDefaultInstance() : device;
        }

        @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
        public MultiFactorAuthResult getMultiFactorAuthResults(int i8) {
            return this.multiFactorAuthResults_.get(i8);
        }

        @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
        public int getMultiFactorAuthResultsCount() {
            return this.multiFactorAuthResults_.size();
        }

        @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
        public List<MultiFactorAuthResult> getMultiFactorAuthResultsList() {
            return this.multiFactorAuthResults_;
        }

        @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
        public MultiFactorAuthResultOrBuilder getMultiFactorAuthResultsOrBuilder(int i8) {
            return this.multiFactorAuthResults_.get(i8);
        }

        @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
        public List<? extends MultiFactorAuthResultOrBuilder> getMultiFactorAuthResultsOrBuilderList() {
            return this.multiFactorAuthResults_;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.tempAuthToken_) ? AbstractC5209f0.computeStringSize(1, this.tempAuthToken_) : 0;
            for (int i9 = 0; i9 < this.authParams_.size(); i9++) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(2, this.authParams_.get(i9));
            }
            for (int i10 = 0; i10 < this.multiFactorAuthResults_.size(); i10++) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(3, this.multiFactorAuthResults_.get(i10));
            }
            if ((this.bitField0_ & 1) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(4, getDevice());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
        public String getTempAuthToken() {
            Object obj = this.tempAuthToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.tempAuthToken_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
        public AbstractC5235o getTempAuthTokenBytes() {
            Object obj = this.tempAuthToken_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.tempAuthToken_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.map.Authentication.MultiFactorVerifyPayloadOrBuilder
        public boolean hasDevice() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTempAuthToken().hashCode();
            if (getAuthParamsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getAuthParamsList().hashCode();
            }
            if (getMultiFactorAuthResultsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getMultiFactorAuthResultsList().hashCode();
            }
            if (hasDevice()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getDevice().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Authentication.internal_static_maum_m2u_map_MultiFactorVerifyPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(MultiFactorVerifyPayload.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new MultiFactorVerifyPayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.tempAuthToken_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.tempAuthToken_);
            }
            for (int i8 = 0; i8 < this.authParams_.size(); i8++) {
                abstractC5248t.writeMessage(2, this.authParams_.get(i8));
            }
            for (int i9 = 0; i9 < this.multiFactorAuthResults_.size(); i9++) {
                abstractC5248t.writeMessage(3, this.multiFactorAuthResults_.get(i9));
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(4, getDevice());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private MultiFactorVerifyPayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.tempAuthToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(MultiFactorVerifyPayload multiFactorVerifyPayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(multiFactorVerifyPayload);
        }

        public static MultiFactorVerifyPayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (MultiFactorVerifyPayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static MultiFactorVerifyPayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (MultiFactorVerifyPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static MultiFactorVerifyPayload parseFrom(AbstractC5235o abstractC5235o) {
            return (MultiFactorVerifyPayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public MultiFactorVerifyPayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static MultiFactorVerifyPayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (MultiFactorVerifyPayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MultiFactorVerifyPayload() {
            this.tempAuthToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.tempAuthToken_ = "";
            this.authParams_ = Collections.emptyList();
            this.multiFactorAuthResults_ = Collections.emptyList();
        }

        public static MultiFactorVerifyPayload parseFrom(byte[] bArr) {
            return (MultiFactorVerifyPayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static MultiFactorVerifyPayload parseFrom(byte[] bArr, M m8) {
            return (MultiFactorVerifyPayload) PARSER.parseFrom(bArr, m8);
        }

        public static MultiFactorVerifyPayload parseFrom(InputStream inputStream) {
            return (MultiFactorVerifyPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static MultiFactorVerifyPayload parseFrom(InputStream inputStream, M m8) {
            return (MultiFactorVerifyPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static MultiFactorVerifyPayload parseFrom(r rVar) {
            return (MultiFactorVerifyPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static MultiFactorVerifyPayload parseFrom(r rVar, M m8) {
            return (MultiFactorVerifyPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface MultiFactorVerifyPayloadOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        AuthenticationParam getAuthParams(int i8);

        int getAuthParamsCount();

        List<AuthenticationParam> getAuthParamsList();

        AuthenticationParamOrBuilder getAuthParamsOrBuilder(int i8);

        List<? extends AuthenticationParamOrBuilder> getAuthParamsOrBuilderList();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        DeviceOuterClass.Device getDevice();

        DeviceOuterClass.DeviceOrBuilder getDeviceOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        MultiFactorVerifyPayload.MultiFactorAuthResult getMultiFactorAuthResults(int i8);

        int getMultiFactorAuthResultsCount();

        List<MultiFactorVerifyPayload.MultiFactorAuthResult> getMultiFactorAuthResultsList();

        MultiFactorVerifyPayload.MultiFactorAuthResultOrBuilder getMultiFactorAuthResultsOrBuilder(int i8);

        List<? extends MultiFactorVerifyPayload.MultiFactorAuthResultOrBuilder> getMultiFactorAuthResultsOrBuilderList();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        String getTempAuthToken();

        AbstractC5235o getTempAuthTokenBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        boolean hasDevice();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class SignInPayload extends AbstractC5209f0 implements SignInPayloadOrBuilder {
        public static final int AUTH_PARAMS_FIELD_NUMBER = 3;
        public static final int DEVICE_FIELD_NUMBER = 4;
        public static final int PASSPHRASE_FIELD_NUMBER = 2;
        public static final int USERKEY_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<AuthenticationParam> authParams_;
        private int bitField0_;
        private DeviceOuterClass.Device device_;
        private byte memoizedIsInitialized;
        private volatile Object passphrase_;
        private volatile Object userkey_;
        private static final SignInPayload DEFAULT_INSTANCE = new SignInPayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Authentication.SignInPayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public SignInPayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = SignInPayload.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements SignInPayloadOrBuilder {
            private C5213g1 authParamsBuilder_;
            private List<AuthenticationParam> authParams_;
            private int bitField0_;
            private C5228l1 deviceBuilder_;
            private DeviceOuterClass.Device device_;
            private Object passphrase_;
            private Object userkey_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(SignInPayload signInPayload) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    signInPayload.userkey_ = this.userkey_;
                }
                if ((i9 & 2) != 0) {
                    signInPayload.passphrase_ = this.passphrase_;
                }
                if ((i9 & 8) != 0) {
                    C5228l1 c5228l1 = this.deviceBuilder_;
                    signInPayload.device_ = c5228l1 == null ? this.device_ : (DeviceOuterClass.Device) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                SignInPayload.access$3676(signInPayload, i8);
            }

            private void buildPartialRepeatedFields(SignInPayload signInPayload) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 != null) {
                    signInPayload.authParams_ = c5213g1.build();
                    return;
                }
                if ((this.bitField0_ & 4) != 0) {
                    this.authParams_ = Collections.unmodifiableList(this.authParams_);
                    this.bitField0_ &= -5;
                }
                signInPayload.authParams_ = this.authParams_;
            }

            private void ensureAuthParamsIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.authParams_ = new ArrayList(this.authParams_);
                    this.bitField0_ |= 4;
                }
            }

            private C5213g1 getAuthParamsFieldBuilder() {
                if (this.authParamsBuilder_ == null) {
                    this.authParamsBuilder_ = new C5213g1(this.authParams_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.authParams_ = null;
                }
                return this.authParamsBuilder_;
            }

            public static final C5269x.b getDescriptor() {
                return Authentication.internal_static_maum_m2u_map_SignInPayload_descriptor;
            }

            private C5228l1 getDeviceFieldBuilder() {
                if (this.deviceBuilder_ == null) {
                    this.deviceBuilder_ = new C5228l1(getDevice(), getParentForChildren(), isClean());
                    this.device_ = null;
                }
                return this.deviceBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getAuthParamsFieldBuilder();
                    getDeviceFieldBuilder();
                }
            }

            public Builder addAllAuthParams(Iterable<? extends AuthenticationParam> iterable) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 == null) {
                    ensureAuthParamsIsMutable();
                    AbstractC5196b.a.addAll((Iterable) iterable, (List) this.authParams_);
                    onChanged();
                } else {
                    c5213g1.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addAuthParams(AuthenticationParam authenticationParam) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 == null) {
                    authenticationParam.getClass();
                    ensureAuthParamsIsMutable();
                    this.authParams_.add(authenticationParam);
                    onChanged();
                } else {
                    c5213g1.addMessage(authenticationParam);
                }
                return this;
            }

            public AuthenticationParam.Builder addAuthParamsBuilder() {
                return (AuthenticationParam.Builder) getAuthParamsFieldBuilder().addBuilder(AuthenticationParam.getDefaultInstance());
            }

            public Builder clearAuthParams() {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 == null) {
                    this.authParams_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                    onChanged();
                } else {
                    c5213g1.clear();
                }
                return this;
            }

            public Builder clearDevice() {
                this.bitField0_ &= -9;
                this.device_ = null;
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.deviceBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPassphrase() {
                this.passphrase_ = SignInPayload.getDefaultInstance().getPassphrase();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearUserkey() {
                this.userkey_ = SignInPayload.getDefaultInstance().getUserkey();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
            public AuthenticationParam getAuthParams(int i8) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                return c5213g1 == null ? this.authParams_.get(i8) : (AuthenticationParam) c5213g1.getMessage(i8);
            }

            public AuthenticationParam.Builder getAuthParamsBuilder(int i8) {
                return (AuthenticationParam.Builder) getAuthParamsFieldBuilder().getBuilder(i8);
            }

            public List<AuthenticationParam.Builder> getAuthParamsBuilderList() {
                return getAuthParamsFieldBuilder().getBuilderList();
            }

            @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
            public int getAuthParamsCount() {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                return c5213g1 == null ? this.authParams_.size() : c5213g1.getCount();
            }

            @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
            public List<AuthenticationParam> getAuthParamsList() {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                return c5213g1 == null ? Collections.unmodifiableList(this.authParams_) : c5213g1.getMessageList();
            }

            @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
            public AuthenticationParamOrBuilder getAuthParamsOrBuilder(int i8) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                return c5213g1 == null ? this.authParams_.get(i8) : (AuthenticationParamOrBuilder) c5213g1.getMessageOrBuilder(i8);
            }

            @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
            public List<? extends AuthenticationParamOrBuilder> getAuthParamsOrBuilderList() {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                return c5213g1 != null ? c5213g1.getMessageOrBuilderList() : Collections.unmodifiableList(this.authParams_);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Authentication.internal_static_maum_m2u_map_SignInPayload_descriptor;
            }

            @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
            public DeviceOuterClass.Device getDevice() {
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 != null) {
                    return (DeviceOuterClass.Device) c5228l1.getMessage();
                }
                DeviceOuterClass.Device device = this.device_;
                return device == null ? DeviceOuterClass.Device.getDefaultInstance() : device;
            }

            public DeviceOuterClass.Device.Builder getDeviceBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (DeviceOuterClass.Device.Builder) getDeviceFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
            public DeviceOuterClass.DeviceOrBuilder getDeviceOrBuilder() {
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 != null) {
                    return (DeviceOuterClass.DeviceOrBuilder) c5228l1.getMessageOrBuilder();
                }
                DeviceOuterClass.Device device = this.device_;
                return device == null ? DeviceOuterClass.Device.getDefaultInstance() : device;
            }

            @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
            public String getPassphrase() {
                Object obj = this.passphrase_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.passphrase_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
            public AbstractC5235o getPassphraseBytes() {
                Object obj = this.passphrase_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.passphrase_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
            public String getUserkey() {
                Object obj = this.userkey_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.userkey_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
            public AbstractC5235o getUserkeyBytes() {
                Object obj = this.userkey_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.userkey_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
            public boolean hasDevice() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Authentication.internal_static_maum_m2u_map_SignInPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(SignInPayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDevice(DeviceOuterClass.Device device) {
                DeviceOuterClass.Device device2;
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(device);
                } else if ((this.bitField0_ & 8) == 0 || (device2 = this.device_) == null || device2 == DeviceOuterClass.Device.getDefaultInstance()) {
                    this.device_ = device;
                } else {
                    getDeviceBuilder().mergeFrom(device);
                }
                if (this.device_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder removeAuthParams(int i8) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 == null) {
                    ensureAuthParamsIsMutable();
                    this.authParams_.remove(i8);
                    onChanged();
                } else {
                    c5213g1.remove(i8);
                }
                return this;
            }

            public Builder setAuthParams(int i8, AuthenticationParam authenticationParam) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 == null) {
                    authenticationParam.getClass();
                    ensureAuthParamsIsMutable();
                    this.authParams_.set(i8, authenticationParam);
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, authenticationParam);
                }
                return this;
            }

            public Builder setDevice(DeviceOuterClass.Device device) {
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 == null) {
                    device.getClass();
                    this.device_ = device;
                } else {
                    c5228l1.setMessage(device);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setPassphrase(String str) {
                str.getClass();
                this.passphrase_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPassphraseBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.passphrase_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUserkey(String str) {
                str.getClass();
                this.userkey_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUserkeyBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.userkey_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.userkey_ = "";
                this.passphrase_ = "";
                this.authParams_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public SignInPayload build() {
                SignInPayload signInPayloadBuildPartial = buildPartial();
                if (signInPayloadBuildPartial.isInitialized()) {
                    return signInPayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) signInPayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public SignInPayload buildPartial() {
                SignInPayload signInPayload = new SignInPayload(this, null);
                buildPartialRepeatedFields(signInPayload);
                if (this.bitField0_ != 0) {
                    buildPartial0(signInPayload);
                }
                onBuilt();
                return signInPayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public SignInPayload getDefaultInstanceForType() {
                return SignInPayload.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            public AuthenticationParam.Builder addAuthParamsBuilder(int i8) {
                return (AuthenticationParam.Builder) getAuthParamsFieldBuilder().addBuilder(i8, AuthenticationParam.getDefaultInstance());
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.userkey_ = "";
                this.passphrase_ = "";
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 == null) {
                    this.authParams_ = Collections.emptyList();
                } else {
                    this.authParams_ = null;
                    c5213g1.clear();
                }
                this.bitField0_ &= -5;
                this.device_ = null;
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.deviceBuilder_ = null;
                }
                return this;
            }

            public Builder addAuthParams(int i8, AuthenticationParam authenticationParam) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 == null) {
                    authenticationParam.getClass();
                    ensureAuthParamsIsMutable();
                    this.authParams_.add(i8, authenticationParam);
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, authenticationParam);
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof SignInPayload) {
                    return mergeFrom((SignInPayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setAuthParams(int i8, AuthenticationParam.Builder builder) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 == null) {
                    ensureAuthParamsIsMutable();
                    this.authParams_.set(i8, builder.build());
                    onChanged();
                } else {
                    c5213g1.setMessage(i8, builder.build());
                }
                return this;
            }

            public Builder setDevice(DeviceOuterClass.Device.Builder builder) {
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 == null) {
                    this.device_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.userkey_ = "";
                this.passphrase_ = "";
                this.authParams_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(SignInPayload signInPayload) {
                if (signInPayload == SignInPayload.getDefaultInstance()) {
                    return this;
                }
                if (!signInPayload.getUserkey().isEmpty()) {
                    this.userkey_ = signInPayload.userkey_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!signInPayload.getPassphrase().isEmpty()) {
                    this.passphrase_ = signInPayload.passphrase_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (this.authParamsBuilder_ == null) {
                    if (!signInPayload.authParams_.isEmpty()) {
                        if (this.authParams_.isEmpty()) {
                            this.authParams_ = signInPayload.authParams_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureAuthParamsIsMutable();
                            this.authParams_.addAll(signInPayload.authParams_);
                        }
                        onChanged();
                    }
                } else if (!signInPayload.authParams_.isEmpty()) {
                    if (!this.authParamsBuilder_.isEmpty()) {
                        this.authParamsBuilder_.addAllMessages(signInPayload.authParams_);
                    } else {
                        this.authParamsBuilder_.dispose();
                        this.authParamsBuilder_ = null;
                        this.authParams_ = signInPayload.authParams_;
                        this.bitField0_ &= -5;
                        this.authParamsBuilder_ = AbstractC5209f0.alwaysUseFieldBuilders ? getAuthParamsFieldBuilder() : null;
                    }
                }
                if (signInPayload.hasDevice()) {
                    mergeDevice(signInPayload.getDevice());
                }
                mergeUnknownFields(signInPayload.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder addAuthParams(AuthenticationParam.Builder builder) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 == null) {
                    ensureAuthParamsIsMutable();
                    this.authParams_.add(builder.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(builder.build());
                }
                return this;
            }

            public Builder addAuthParams(int i8, AuthenticationParam.Builder builder) {
                C5213g1 c5213g1 = this.authParamsBuilder_;
                if (c5213g1 == null) {
                    ensureAuthParamsIsMutable();
                    this.authParams_.add(i8, builder.build());
                    onChanged();
                } else {
                    c5213g1.addMessage(i8, builder.build());
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.userkey_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.passphrase_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    AuthenticationParam authenticationParam = (AuthenticationParam) rVar.readMessage(AuthenticationParam.parser(), m8);
                                    C5213g1 c5213g1 = this.authParamsBuilder_;
                                    if (c5213g1 == null) {
                                        ensureAuthParamsIsMutable();
                                        this.authParams_.add(authenticationParam);
                                    } else {
                                        c5213g1.addMessage(authenticationParam);
                                    }
                                } else if (tag != 34) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getDeviceFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 8;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ SignInPayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$3676(SignInPayload signInPayload, int i8) {
            int i9 = i8 | signInPayload.bitField0_;
            signInPayload.bitField0_ = i9;
            return i9;
        }

        public static SignInPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Authentication.internal_static_maum_m2u_map_SignInPayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SignInPayload parseDelimitedFrom(InputStream inputStream) {
            return (SignInPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SignInPayload parseFrom(ByteBuffer byteBuffer) {
            return (SignInPayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SignInPayload)) {
                return super.equals(obj);
            }
            SignInPayload signInPayload = (SignInPayload) obj;
            if (getUserkey().equals(signInPayload.getUserkey()) && getPassphrase().equals(signInPayload.getPassphrase()) && getAuthParamsList().equals(signInPayload.getAuthParamsList()) && hasDevice() == signInPayload.hasDevice()) {
                return (!hasDevice() || getDevice().equals(signInPayload.getDevice())) && getUnknownFields().equals(signInPayload.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
        public AuthenticationParam getAuthParams(int i8) {
            return this.authParams_.get(i8);
        }

        @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
        public int getAuthParamsCount() {
            return this.authParams_.size();
        }

        @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
        public List<AuthenticationParam> getAuthParamsList() {
            return this.authParams_;
        }

        @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
        public AuthenticationParamOrBuilder getAuthParamsOrBuilder(int i8) {
            return this.authParams_.get(i8);
        }

        @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
        public List<? extends AuthenticationParamOrBuilder> getAuthParamsOrBuilderList() {
            return this.authParams_;
        }

        @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
        public DeviceOuterClass.Device getDevice() {
            DeviceOuterClass.Device device = this.device_;
            return device == null ? DeviceOuterClass.Device.getDefaultInstance() : device;
        }

        @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
        public DeviceOuterClass.DeviceOrBuilder getDeviceOrBuilder() {
            DeviceOuterClass.Device device = this.device_;
            return device == null ? DeviceOuterClass.Device.getDefaultInstance() : device;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
        public String getPassphrase() {
            Object obj = this.passphrase_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.passphrase_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
        public AbstractC5235o getPassphraseBytes() {
            Object obj = this.passphrase_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.passphrase_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.userkey_) ? AbstractC5209f0.computeStringSize(1, this.userkey_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.passphrase_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.passphrase_);
            }
            for (int i9 = 0; i9 < this.authParams_.size(); i9++) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(3, this.authParams_.get(i9));
            }
            if ((this.bitField0_ & 1) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(4, getDevice());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
        public String getUserkey() {
            Object obj = this.userkey_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.userkey_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
        public AbstractC5235o getUserkeyBytes() {
            Object obj = this.userkey_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.userkey_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.map.Authentication.SignInPayloadOrBuilder
        public boolean hasDevice() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUserkey().hashCode()) * 37) + 2) * 53) + getPassphrase().hashCode();
            if (getAuthParamsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getAuthParamsList().hashCode();
            }
            if (hasDevice()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getDevice().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Authentication.internal_static_maum_m2u_map_SignInPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(SignInPayload.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new SignInPayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.userkey_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.userkey_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.passphrase_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.passphrase_);
            }
            for (int i8 = 0; i8 < this.authParams_.size(); i8++) {
                abstractC5248t.writeMessage(3, this.authParams_.get(i8));
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(4, getDevice());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private SignInPayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.userkey_ = "";
            this.passphrase_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SignInPayload signInPayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(signInPayload);
        }

        public static SignInPayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (SignInPayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static SignInPayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (SignInPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static SignInPayload parseFrom(AbstractC5235o abstractC5235o) {
            return (SignInPayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public SignInPayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static SignInPayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (SignInPayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SignInPayload parseFrom(byte[] bArr) {
            return (SignInPayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        private SignInPayload() {
            this.userkey_ = "";
            this.passphrase_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.userkey_ = "";
            this.passphrase_ = "";
            this.authParams_ = Collections.emptyList();
        }

        public static SignInPayload parseFrom(byte[] bArr, M m8) {
            return (SignInPayload) PARSER.parseFrom(bArr, m8);
        }

        public static SignInPayload parseFrom(InputStream inputStream) {
            return (SignInPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static SignInPayload parseFrom(InputStream inputStream, M m8) {
            return (SignInPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static SignInPayload parseFrom(r rVar) {
            return (SignInPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static SignInPayload parseFrom(r rVar, M m8) {
            return (SignInPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface SignInPayloadOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        AuthenticationParam getAuthParams(int i8);

        int getAuthParamsCount();

        List<AuthenticationParam> getAuthParamsList();

        AuthenticationParamOrBuilder getAuthParamsOrBuilder(int i8);

        List<? extends AuthenticationParamOrBuilder> getAuthParamsOrBuilderList();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        DeviceOuterClass.Device getDevice();

        DeviceOuterClass.DeviceOrBuilder getDeviceOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        String getPassphrase();

        AbstractC5235o getPassphraseBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        String getUserkey();

        AbstractC5235o getUserkeyBytes();

        boolean hasDevice();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class SignInResultPayload extends AbstractC5209f0 implements SignInResultPayloadOrBuilder {
        public static final int AUTH_FAILURE_FIELD_NUMBER = 2;
        public static final int AUTH_SUCCESS_FIELD_NUMBER = 1;
        public static final int MULTI_FACTOR_AUTH_REQUEST_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int testResultCase_;
        private Object testResult_;
        private static final SignInResultPayload DEFAULT_INSTANCE = new SignInResultPayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Authentication.SignInResultPayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public SignInResultPayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = SignInResultPayload.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements SignInResultPayloadOrBuilder {
            private C5228l1 authFailureBuilder_;
            private C5228l1 authSuccessBuilder_;
            private int bitField0_;
            private C5228l1 multiFactorAuthRequestBuilder_;
            private int testResultCase_;
            private Object testResult_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(SignInResultPayload signInResultPayload) {
            }

            private void buildPartialOneofs(SignInResultPayload signInResultPayload) {
                C5228l1 c5228l1;
                C5228l1 c5228l12;
                C5228l1 c5228l13;
                signInResultPayload.testResultCase_ = this.testResultCase_;
                signInResultPayload.testResult_ = this.testResult_;
                if (this.testResultCase_ == 1 && (c5228l13 = this.authSuccessBuilder_) != null) {
                    signInResultPayload.testResult_ = c5228l13.build();
                }
                if (this.testResultCase_ == 2 && (c5228l12 = this.authFailureBuilder_) != null) {
                    signInResultPayload.testResult_ = c5228l12.build();
                }
                if (this.testResultCase_ != 3 || (c5228l1 = this.multiFactorAuthRequestBuilder_) == null) {
                    return;
                }
                signInResultPayload.testResult_ = c5228l1.build();
            }

            private C5228l1 getAuthFailureFieldBuilder() {
                if (this.authFailureBuilder_ == null) {
                    if (this.testResultCase_ != 2) {
                        this.testResult_ = AuthFailurePayload.getDefaultInstance();
                    }
                    this.authFailureBuilder_ = new C5228l1((AuthFailurePayload) this.testResult_, getParentForChildren(), isClean());
                    this.testResult_ = null;
                }
                this.testResultCase_ = 2;
                onChanged();
                return this.authFailureBuilder_;
            }

            private C5228l1 getAuthSuccessFieldBuilder() {
                if (this.authSuccessBuilder_ == null) {
                    if (this.testResultCase_ != 1) {
                        this.testResult_ = AuthTokenPayload.getDefaultInstance();
                    }
                    this.authSuccessBuilder_ = new C5228l1((AuthTokenPayload) this.testResult_, getParentForChildren(), isClean());
                    this.testResult_ = null;
                }
                this.testResultCase_ = 1;
                onChanged();
                return this.authSuccessBuilder_;
            }

            public static final C5269x.b getDescriptor() {
                return Authentication.internal_static_maum_m2u_map_SignInResultPayload_descriptor;
            }

            private C5228l1 getMultiFactorAuthRequestFieldBuilder() {
                if (this.multiFactorAuthRequestBuilder_ == null) {
                    if (this.testResultCase_ != 3) {
                        this.testResult_ = MultiFactorAuthRequestPayload.getDefaultInstance();
                    }
                    this.multiFactorAuthRequestBuilder_ = new C5228l1((MultiFactorAuthRequestPayload) this.testResult_, getParentForChildren(), isClean());
                    this.testResult_ = null;
                }
                this.testResultCase_ = 3;
                onChanged();
                return this.multiFactorAuthRequestBuilder_;
            }

            public Builder clearAuthFailure() {
                C5228l1 c5228l1 = this.authFailureBuilder_;
                if (c5228l1 != null) {
                    if (this.testResultCase_ == 2) {
                        this.testResultCase_ = 0;
                        this.testResult_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testResultCase_ == 2) {
                    this.testResultCase_ = 0;
                    this.testResult_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearAuthSuccess() {
                C5228l1 c5228l1 = this.authSuccessBuilder_;
                if (c5228l1 != null) {
                    if (this.testResultCase_ == 1) {
                        this.testResultCase_ = 0;
                        this.testResult_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testResultCase_ == 1) {
                    this.testResultCase_ = 0;
                    this.testResult_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearMultiFactorAuthRequest() {
                C5228l1 c5228l1 = this.multiFactorAuthRequestBuilder_;
                if (c5228l1 != null) {
                    if (this.testResultCase_ == 3) {
                        this.testResultCase_ = 0;
                        this.testResult_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testResultCase_ == 3) {
                    this.testResultCase_ = 0;
                    this.testResult_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearTestResult() {
                this.testResultCase_ = 0;
                this.testResult_ = null;
                onChanged();
                return this;
            }

            @Override // maum.m2u.map.Authentication.SignInResultPayloadOrBuilder
            public AuthFailurePayload getAuthFailure() {
                C5228l1 c5228l1 = this.authFailureBuilder_;
                return c5228l1 == null ? this.testResultCase_ == 2 ? (AuthFailurePayload) this.testResult_ : AuthFailurePayload.getDefaultInstance() : this.testResultCase_ == 2 ? (AuthFailurePayload) c5228l1.getMessage() : AuthFailurePayload.getDefaultInstance();
            }

            public AuthFailurePayload.Builder getAuthFailureBuilder() {
                return (AuthFailurePayload.Builder) getAuthFailureFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Authentication.SignInResultPayloadOrBuilder
            public AuthFailurePayloadOrBuilder getAuthFailureOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testResultCase_;
                return (i8 != 2 || (c5228l1 = this.authFailureBuilder_) == null) ? i8 == 2 ? (AuthFailurePayload) this.testResult_ : AuthFailurePayload.getDefaultInstance() : (AuthFailurePayloadOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.map.Authentication.SignInResultPayloadOrBuilder
            public AuthTokenPayload getAuthSuccess() {
                C5228l1 c5228l1 = this.authSuccessBuilder_;
                return c5228l1 == null ? this.testResultCase_ == 1 ? (AuthTokenPayload) this.testResult_ : AuthTokenPayload.getDefaultInstance() : this.testResultCase_ == 1 ? (AuthTokenPayload) c5228l1.getMessage() : AuthTokenPayload.getDefaultInstance();
            }

            public AuthTokenPayload.Builder getAuthSuccessBuilder() {
                return (AuthTokenPayload.Builder) getAuthSuccessFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Authentication.SignInResultPayloadOrBuilder
            public AuthTokenPayloadOrBuilder getAuthSuccessOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testResultCase_;
                return (i8 != 1 || (c5228l1 = this.authSuccessBuilder_) == null) ? i8 == 1 ? (AuthTokenPayload) this.testResult_ : AuthTokenPayload.getDefaultInstance() : (AuthTokenPayloadOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Authentication.internal_static_maum_m2u_map_SignInResultPayload_descriptor;
            }

            @Override // maum.m2u.map.Authentication.SignInResultPayloadOrBuilder
            public MultiFactorAuthRequestPayload getMultiFactorAuthRequest() {
                C5228l1 c5228l1 = this.multiFactorAuthRequestBuilder_;
                return c5228l1 == null ? this.testResultCase_ == 3 ? (MultiFactorAuthRequestPayload) this.testResult_ : MultiFactorAuthRequestPayload.getDefaultInstance() : this.testResultCase_ == 3 ? (MultiFactorAuthRequestPayload) c5228l1.getMessage() : MultiFactorAuthRequestPayload.getDefaultInstance();
            }

            public MultiFactorAuthRequestPayload.Builder getMultiFactorAuthRequestBuilder() {
                return (MultiFactorAuthRequestPayload.Builder) getMultiFactorAuthRequestFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Authentication.SignInResultPayloadOrBuilder
            public MultiFactorAuthRequestPayloadOrBuilder getMultiFactorAuthRequestOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testResultCase_;
                return (i8 != 3 || (c5228l1 = this.multiFactorAuthRequestBuilder_) == null) ? i8 == 3 ? (MultiFactorAuthRequestPayload) this.testResult_ : MultiFactorAuthRequestPayload.getDefaultInstance() : (MultiFactorAuthRequestPayloadOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.map.Authentication.SignInResultPayloadOrBuilder
            public TestResultCase getTestResultCase() {
                return TestResultCase.forNumber(this.testResultCase_);
            }

            @Override // maum.m2u.map.Authentication.SignInResultPayloadOrBuilder
            public boolean hasAuthFailure() {
                return this.testResultCase_ == 2;
            }

            @Override // maum.m2u.map.Authentication.SignInResultPayloadOrBuilder
            public boolean hasAuthSuccess() {
                return this.testResultCase_ == 1;
            }

            @Override // maum.m2u.map.Authentication.SignInResultPayloadOrBuilder
            public boolean hasMultiFactorAuthRequest() {
                return this.testResultCase_ == 3;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Authentication.internal_static_maum_m2u_map_SignInResultPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(SignInResultPayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAuthFailure(AuthFailurePayload authFailurePayload) {
                C5228l1 c5228l1 = this.authFailureBuilder_;
                if (c5228l1 == null) {
                    if (this.testResultCase_ != 2 || this.testResult_ == AuthFailurePayload.getDefaultInstance()) {
                        this.testResult_ = authFailurePayload;
                    } else {
                        this.testResult_ = AuthFailurePayload.newBuilder((AuthFailurePayload) this.testResult_).mergeFrom(authFailurePayload).buildPartial();
                    }
                    onChanged();
                } else if (this.testResultCase_ == 2) {
                    c5228l1.mergeFrom(authFailurePayload);
                } else {
                    c5228l1.setMessage(authFailurePayload);
                }
                this.testResultCase_ = 2;
                return this;
            }

            public Builder mergeAuthSuccess(AuthTokenPayload authTokenPayload) {
                C5228l1 c5228l1 = this.authSuccessBuilder_;
                if (c5228l1 == null) {
                    if (this.testResultCase_ != 1 || this.testResult_ == AuthTokenPayload.getDefaultInstance()) {
                        this.testResult_ = authTokenPayload;
                    } else {
                        this.testResult_ = AuthTokenPayload.newBuilder((AuthTokenPayload) this.testResult_).mergeFrom(authTokenPayload).buildPartial();
                    }
                    onChanged();
                } else if (this.testResultCase_ == 1) {
                    c5228l1.mergeFrom(authTokenPayload);
                } else {
                    c5228l1.setMessage(authTokenPayload);
                }
                this.testResultCase_ = 1;
                return this;
            }

            public Builder mergeMultiFactorAuthRequest(MultiFactorAuthRequestPayload multiFactorAuthRequestPayload) {
                C5228l1 c5228l1 = this.multiFactorAuthRequestBuilder_;
                if (c5228l1 == null) {
                    if (this.testResultCase_ != 3 || this.testResult_ == MultiFactorAuthRequestPayload.getDefaultInstance()) {
                        this.testResult_ = multiFactorAuthRequestPayload;
                    } else {
                        this.testResult_ = MultiFactorAuthRequestPayload.newBuilder((MultiFactorAuthRequestPayload) this.testResult_).mergeFrom(multiFactorAuthRequestPayload).buildPartial();
                    }
                    onChanged();
                } else if (this.testResultCase_ == 3) {
                    c5228l1.mergeFrom(multiFactorAuthRequestPayload);
                } else {
                    c5228l1.setMessage(multiFactorAuthRequestPayload);
                }
                this.testResultCase_ = 3;
                return this;
            }

            public Builder setAuthFailure(AuthFailurePayload authFailurePayload) {
                C5228l1 c5228l1 = this.authFailureBuilder_;
                if (c5228l1 == null) {
                    authFailurePayload.getClass();
                    this.testResult_ = authFailurePayload;
                    onChanged();
                } else {
                    c5228l1.setMessage(authFailurePayload);
                }
                this.testResultCase_ = 2;
                return this;
            }

            public Builder setAuthSuccess(AuthTokenPayload authTokenPayload) {
                C5228l1 c5228l1 = this.authSuccessBuilder_;
                if (c5228l1 == null) {
                    authTokenPayload.getClass();
                    this.testResult_ = authTokenPayload;
                    onChanged();
                } else {
                    c5228l1.setMessage(authTokenPayload);
                }
                this.testResultCase_ = 1;
                return this;
            }

            public Builder setMultiFactorAuthRequest(MultiFactorAuthRequestPayload multiFactorAuthRequestPayload) {
                C5228l1 c5228l1 = this.multiFactorAuthRequestBuilder_;
                if (c5228l1 == null) {
                    multiFactorAuthRequestPayload.getClass();
                    this.testResult_ = multiFactorAuthRequestPayload;
                    onChanged();
                } else {
                    c5228l1.setMessage(multiFactorAuthRequestPayload);
                }
                this.testResultCase_ = 3;
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.testResultCase_ = 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public SignInResultPayload build() {
                SignInResultPayload signInResultPayloadBuildPartial = buildPartial();
                if (signInResultPayloadBuildPartial.isInitialized()) {
                    return signInResultPayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) signInResultPayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public SignInResultPayload buildPartial() {
                SignInResultPayload signInResultPayload = new SignInResultPayload(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(signInResultPayload);
                }
                buildPartialOneofs(signInResultPayload);
                onBuilt();
                return signInResultPayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public SignInResultPayload getDefaultInstanceForType() {
                return SignInResultPayload.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.testResultCase_ = 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                C5228l1 c5228l1 = this.authSuccessBuilder_;
                if (c5228l1 != null) {
                    c5228l1.clear();
                }
                C5228l1 c5228l12 = this.authFailureBuilder_;
                if (c5228l12 != null) {
                    c5228l12.clear();
                }
                C5228l1 c5228l13 = this.multiFactorAuthRequestBuilder_;
                if (c5228l13 != null) {
                    c5228l13.clear();
                }
                this.testResultCase_ = 0;
                this.testResult_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof SignInResultPayload) {
                    return mergeFrom((SignInResultPayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setAuthFailure(AuthFailurePayload.Builder builder) {
                C5228l1 c5228l1 = this.authFailureBuilder_;
                if (c5228l1 == null) {
                    this.testResult_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testResultCase_ = 2;
                return this;
            }

            public Builder setAuthSuccess(AuthTokenPayload.Builder builder) {
                C5228l1 c5228l1 = this.authSuccessBuilder_;
                if (c5228l1 == null) {
                    this.testResult_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testResultCase_ = 1;
                return this;
            }

            public Builder setMultiFactorAuthRequest(MultiFactorAuthRequestPayload.Builder builder) {
                C5228l1 c5228l1 = this.multiFactorAuthRequestBuilder_;
                if (c5228l1 == null) {
                    this.testResult_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testResultCase_ = 3;
                return this;
            }

            public Builder mergeFrom(SignInResultPayload signInResultPayload) {
                if (signInResultPayload == SignInResultPayload.getDefaultInstance()) {
                    return this;
                }
                int i8 = AnonymousClass1.$SwitchMap$maum$m2u$map$Authentication$SignInResultPayload$TestResultCase[signInResultPayload.getTestResultCase().ordinal()];
                if (i8 == 1) {
                    mergeAuthSuccess(signInResultPayload.getAuthSuccess());
                } else if (i8 == 2) {
                    mergeAuthFailure(signInResultPayload.getAuthFailure());
                } else if (i8 == 3) {
                    mergeMultiFactorAuthRequest(signInResultPayload.getMultiFactorAuthRequest());
                }
                mergeUnknownFields(signInResultPayload.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    rVar.readMessage(getAuthSuccessFieldBuilder().getBuilder(), m8);
                                    this.testResultCase_ = 1;
                                } else if (tag == 18) {
                                    rVar.readMessage(getAuthFailureFieldBuilder().getBuilder(), m8);
                                    this.testResultCase_ = 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getMultiFactorAuthRequestFieldBuilder().getBuilder(), m8);
                                    this.testResultCase_ = 3;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        public enum TestResultCase implements AbstractC5227l0.c, AbstractC5196b.InterfaceC0220b {
            AUTH_SUCCESS(1),
            AUTH_FAILURE(2),
            MULTI_FACTOR_AUTH_REQUEST(3),
            TESTRESULT_NOT_SET(0);

            private final int value;

            TestResultCase(int i8) {
                this.value = i8;
            }

            public static TestResultCase forNumber(int i8) {
                if (i8 == 0) {
                    return TESTRESULT_NOT_SET;
                }
                if (i8 == 1) {
                    return AUTH_SUCCESS;
                }
                if (i8 == 2) {
                    return AUTH_FAILURE;
                }
                if (i8 != 3) {
                    return null;
                }
                return MULTI_FACTOR_AUTH_REQUEST;
            }

            @Override // com.google.protobuf.AbstractC5227l0.c
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static TestResultCase valueOf(int i8) {
                return forNumber(i8);
            }
        }

        /* synthetic */ SignInResultPayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static SignInResultPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Authentication.internal_static_maum_m2u_map_SignInResultPayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SignInResultPayload parseDelimitedFrom(InputStream inputStream) {
            return (SignInResultPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SignInResultPayload parseFrom(ByteBuffer byteBuffer) {
            return (SignInResultPayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SignInResultPayload)) {
                return super.equals(obj);
            }
            SignInResultPayload signInResultPayload = (SignInResultPayload) obj;
            if (!getTestResultCase().equals(signInResultPayload.getTestResultCase())) {
                return false;
            }
            int i8 = this.testResultCase_;
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3 && !getMultiFactorAuthRequest().equals(signInResultPayload.getMultiFactorAuthRequest())) {
                        return false;
                    }
                } else if (!getAuthFailure().equals(signInResultPayload.getAuthFailure())) {
                    return false;
                }
            } else if (!getAuthSuccess().equals(signInResultPayload.getAuthSuccess())) {
                return false;
            }
            return getUnknownFields().equals(signInResultPayload.getUnknownFields());
        }

        @Override // maum.m2u.map.Authentication.SignInResultPayloadOrBuilder
        public AuthFailurePayload getAuthFailure() {
            return this.testResultCase_ == 2 ? (AuthFailurePayload) this.testResult_ : AuthFailurePayload.getDefaultInstance();
        }

        @Override // maum.m2u.map.Authentication.SignInResultPayloadOrBuilder
        public AuthFailurePayloadOrBuilder getAuthFailureOrBuilder() {
            return this.testResultCase_ == 2 ? (AuthFailurePayload) this.testResult_ : AuthFailurePayload.getDefaultInstance();
        }

        @Override // maum.m2u.map.Authentication.SignInResultPayloadOrBuilder
        public AuthTokenPayload getAuthSuccess() {
            return this.testResultCase_ == 1 ? (AuthTokenPayload) this.testResult_ : AuthTokenPayload.getDefaultInstance();
        }

        @Override // maum.m2u.map.Authentication.SignInResultPayloadOrBuilder
        public AuthTokenPayloadOrBuilder getAuthSuccessOrBuilder() {
            return this.testResultCase_ == 1 ? (AuthTokenPayload) this.testResult_ : AuthTokenPayload.getDefaultInstance();
        }

        @Override // maum.m2u.map.Authentication.SignInResultPayloadOrBuilder
        public MultiFactorAuthRequestPayload getMultiFactorAuthRequest() {
            return this.testResultCase_ == 3 ? (MultiFactorAuthRequestPayload) this.testResult_ : MultiFactorAuthRequestPayload.getDefaultInstance();
        }

        @Override // maum.m2u.map.Authentication.SignInResultPayloadOrBuilder
        public MultiFactorAuthRequestPayloadOrBuilder getMultiFactorAuthRequestOrBuilder() {
            return this.testResultCase_ == 3 ? (MultiFactorAuthRequestPayload) this.testResult_ : MultiFactorAuthRequestPayload.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeMessageSize = this.testResultCase_ == 1 ? AbstractC5248t.computeMessageSize(1, (AuthTokenPayload) this.testResult_) : 0;
            if (this.testResultCase_ == 2) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(2, (AuthFailurePayload) this.testResult_);
            }
            if (this.testResultCase_ == 3) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(3, (MultiFactorAuthRequestPayload) this.testResult_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Authentication.SignInResultPayloadOrBuilder
        public TestResultCase getTestResultCase() {
            return TestResultCase.forNumber(this.testResultCase_);
        }

        @Override // maum.m2u.map.Authentication.SignInResultPayloadOrBuilder
        public boolean hasAuthFailure() {
            return this.testResultCase_ == 2;
        }

        @Override // maum.m2u.map.Authentication.SignInResultPayloadOrBuilder
        public boolean hasAuthSuccess() {
            return this.testResultCase_ == 1;
        }

        @Override // maum.m2u.map.Authentication.SignInResultPayloadOrBuilder
        public boolean hasMultiFactorAuthRequest() {
            return this.testResultCase_ == 3;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8;
            int iHashCode;
            int i9 = this.memoizedHashCode;
            if (i9 != 0) {
                return i9;
            }
            int iHashCode2 = 779 + getDescriptor().hashCode();
            int i10 = this.testResultCase_;
            if (i10 == 1) {
                i8 = ((iHashCode2 * 37) + 1) * 53;
                iHashCode = getAuthSuccess().hashCode();
            } else {
                if (i10 != 2) {
                    if (i10 == 3) {
                        i8 = ((iHashCode2 * 37) + 3) * 53;
                        iHashCode = getMultiFactorAuthRequest().hashCode();
                    }
                    int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }
                i8 = ((iHashCode2 * 37) + 2) * 53;
                iHashCode = getAuthFailure().hashCode();
            }
            iHashCode2 = i8 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Authentication.internal_static_maum_m2u_map_SignInResultPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(SignInResultPayload.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new SignInResultPayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (this.testResultCase_ == 1) {
                abstractC5248t.writeMessage(1, (AuthTokenPayload) this.testResult_);
            }
            if (this.testResultCase_ == 2) {
                abstractC5248t.writeMessage(2, (AuthFailurePayload) this.testResult_);
            }
            if (this.testResultCase_ == 3) {
                abstractC5248t.writeMessage(3, (MultiFactorAuthRequestPayload) this.testResult_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private SignInResultPayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.testResultCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SignInResultPayload signInResultPayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(signInResultPayload);
        }

        public static SignInResultPayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (SignInResultPayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static SignInResultPayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (SignInResultPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static SignInResultPayload parseFrom(AbstractC5235o abstractC5235o) {
            return (SignInResultPayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public SignInResultPayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static SignInResultPayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (SignInResultPayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SignInResultPayload() {
            this.testResultCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SignInResultPayload parseFrom(byte[] bArr) {
            return (SignInResultPayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static SignInResultPayload parseFrom(byte[] bArr, M m8) {
            return (SignInResultPayload) PARSER.parseFrom(bArr, m8);
        }

        public static SignInResultPayload parseFrom(InputStream inputStream) {
            return (SignInResultPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static SignInResultPayload parseFrom(InputStream inputStream, M m8) {
            return (SignInResultPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static SignInResultPayload parseFrom(r rVar) {
            return (SignInResultPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static SignInResultPayload parseFrom(r rVar, M m8) {
            return (SignInResultPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface SignInResultPayloadOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        AuthFailurePayload getAuthFailure();

        AuthFailurePayloadOrBuilder getAuthFailureOrBuilder();

        AuthTokenPayload getAuthSuccess();

        AuthTokenPayloadOrBuilder getAuthSuccessOrBuilder();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        MultiFactorAuthRequestPayload getMultiFactorAuthRequest();

        MultiFactorAuthRequestPayloadOrBuilder getMultiFactorAuthRequestOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        SignInResultPayload.TestResultCase getTestResultCase();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        boolean hasAuthFailure();

        boolean hasAuthSuccess();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        boolean hasMultiFactorAuthRequest();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class SignOutPayload extends AbstractC5209f0 implements SignOutPayloadOrBuilder {
        public static final int AUTH_TOKEN_FIELD_NUMBER = 1;
        private static final SignOutPayload DEFAULT_INSTANCE = new SignOutPayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Authentication.SignOutPayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public SignOutPayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = SignOutPayload.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int USER_KEY_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private volatile Object authToken_;
        private byte memoizedIsInitialized;
        private volatile Object userKey_;

        public static final class Builder extends AbstractC5209f0.b implements SignOutPayloadOrBuilder {
            private Object authToken_;
            private int bitField0_;
            private Object userKey_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(SignOutPayload signOutPayload) {
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    signOutPayload.authToken_ = this.authToken_;
                }
                if ((i8 & 2) != 0) {
                    signOutPayload.userKey_ = this.userKey_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return Authentication.internal_static_maum_m2u_map_SignOutPayload_descriptor;
            }

            public Builder clearAuthToken() {
                this.authToken_ = SignOutPayload.getDefaultInstance().getAuthToken();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearUserKey() {
                this.userKey_ = SignOutPayload.getDefaultInstance().getUserKey();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // maum.m2u.map.Authentication.SignOutPayloadOrBuilder
            public String getAuthToken() {
                Object obj = this.authToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.authToken_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Authentication.SignOutPayloadOrBuilder
            public AbstractC5235o getAuthTokenBytes() {
                Object obj = this.authToken_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.authToken_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Authentication.internal_static_maum_m2u_map_SignOutPayload_descriptor;
            }

            @Override // maum.m2u.map.Authentication.SignOutPayloadOrBuilder
            public String getUserKey() {
                Object obj = this.userKey_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.userKey_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Authentication.SignOutPayloadOrBuilder
            public AbstractC5235o getUserKeyBytes() {
                Object obj = this.userKey_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.userKey_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Authentication.internal_static_maum_m2u_map_SignOutPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(SignOutPayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAuthToken(String str) {
                str.getClass();
                this.authToken_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAuthTokenBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.authToken_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUserKey(String str) {
                str.getClass();
                this.userKey_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUserKeyBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.userKey_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.authToken_ = "";
                this.userKey_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public SignOutPayload build() {
                SignOutPayload signOutPayloadBuildPartial = buildPartial();
                if (signOutPayloadBuildPartial.isInitialized()) {
                    return signOutPayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) signOutPayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public SignOutPayload buildPartial() {
                SignOutPayload signOutPayload = new SignOutPayload(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(signOutPayload);
                }
                onBuilt();
                return signOutPayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public SignOutPayload getDefaultInstanceForType() {
                return SignOutPayload.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.authToken_ = "";
                this.userKey_ = "";
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.authToken_ = "";
                this.userKey_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof SignOutPayload) {
                    return mergeFrom((SignOutPayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder mergeFrom(SignOutPayload signOutPayload) {
                if (signOutPayload == SignOutPayload.getDefaultInstance()) {
                    return this;
                }
                if (!signOutPayload.getAuthToken().isEmpty()) {
                    this.authToken_ = signOutPayload.authToken_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!signOutPayload.getUserKey().isEmpty()) {
                    this.userKey_ = signOutPayload.userKey_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(signOutPayload.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.authToken_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.userKey_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ SignOutPayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static SignOutPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Authentication.internal_static_maum_m2u_map_SignOutPayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SignOutPayload parseDelimitedFrom(InputStream inputStream) {
            return (SignOutPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SignOutPayload parseFrom(ByteBuffer byteBuffer) {
            return (SignOutPayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SignOutPayload)) {
                return super.equals(obj);
            }
            SignOutPayload signOutPayload = (SignOutPayload) obj;
            return getAuthToken().equals(signOutPayload.getAuthToken()) && getUserKey().equals(signOutPayload.getUserKey()) && getUnknownFields().equals(signOutPayload.getUnknownFields());
        }

        @Override // maum.m2u.map.Authentication.SignOutPayloadOrBuilder
        public String getAuthToken() {
            Object obj = this.authToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.authToken_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Authentication.SignOutPayloadOrBuilder
        public AbstractC5235o getAuthTokenBytes() {
            Object obj = this.authToken_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.authToken_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.authToken_) ? AbstractC5209f0.computeStringSize(1, this.authToken_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.userKey_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.userKey_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Authentication.SignOutPayloadOrBuilder
        public String getUserKey() {
            Object obj = this.userKey_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.userKey_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Authentication.SignOutPayloadOrBuilder
        public AbstractC5235o getUserKeyBytes() {
            Object obj = this.userKey_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.userKey_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAuthToken().hashCode()) * 37) + 2) * 53) + getUserKey().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Authentication.internal_static_maum_m2u_map_SignOutPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(SignOutPayload.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new SignOutPayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.authToken_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.authToken_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.userKey_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.userKey_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private SignOutPayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.authToken_ = "";
            this.userKey_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SignOutPayload signOutPayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(signOutPayload);
        }

        public static SignOutPayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (SignOutPayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static SignOutPayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (SignOutPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static SignOutPayload parseFrom(AbstractC5235o abstractC5235o) {
            return (SignOutPayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public SignOutPayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static SignOutPayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (SignOutPayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SignOutPayload parseFrom(byte[] bArr) {
            return (SignOutPayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        private SignOutPayload() {
            this.authToken_ = "";
            this.userKey_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.authToken_ = "";
            this.userKey_ = "";
        }

        public static SignOutPayload parseFrom(byte[] bArr, M m8) {
            return (SignOutPayload) PARSER.parseFrom(bArr, m8);
        }

        public static SignOutPayload parseFrom(InputStream inputStream) {
            return (SignOutPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static SignOutPayload parseFrom(InputStream inputStream, M m8) {
            return (SignOutPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static SignOutPayload parseFrom(r rVar) {
            return (SignOutPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static SignOutPayload parseFrom(r rVar, M m8) {
            return (SignOutPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface SignOutPayloadOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        String getAuthToken();

        AbstractC5235o getAuthTokenBytes();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        String getUserKey();

        AbstractC5235o getUserKeyBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class SignOutResultPayload extends AbstractC5209f0 implements SignOutResultPayloadOrBuilder {
        public static final int MESSAGE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object message_;
        private static final SignOutResultPayload DEFAULT_INSTANCE = new SignOutResultPayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Authentication.SignOutResultPayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public SignOutResultPayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = SignOutResultPayload.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        public static final class Builder extends AbstractC5209f0.b implements SignOutResultPayloadOrBuilder {
            private int bitField0_;
            private Object message_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(SignOutResultPayload signOutResultPayload) {
                if ((this.bitField0_ & 1) != 0) {
                    signOutResultPayload.message_ = this.message_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return Authentication.internal_static_maum_m2u_map_SignOutResultPayload_descriptor;
            }

            public Builder clearMessage() {
                this.message_ = SignOutResultPayload.getDefaultInstance().getMessage();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Authentication.internal_static_maum_m2u_map_SignOutResultPayload_descriptor;
            }

            @Override // maum.m2u.map.Authentication.SignOutResultPayloadOrBuilder
            public String getMessage() {
                Object obj = this.message_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.message_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Authentication.SignOutResultPayloadOrBuilder
            public AbstractC5235o getMessageBytes() {
                Object obj = this.message_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.message_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Authentication.internal_static_maum_m2u_map_SignOutResultPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(SignOutResultPayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder setMessage(String str) {
                str.getClass();
                this.message_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMessageBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.message_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.message_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public SignOutResultPayload build() {
                SignOutResultPayload signOutResultPayloadBuildPartial = buildPartial();
                if (signOutResultPayloadBuildPartial.isInitialized()) {
                    return signOutResultPayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) signOutResultPayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public SignOutResultPayload buildPartial() {
                SignOutResultPayload signOutResultPayload = new SignOutResultPayload(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(signOutResultPayload);
                }
                onBuilt();
                return signOutResultPayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public SignOutResultPayload getDefaultInstanceForType() {
                return SignOutResultPayload.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.message_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.message_ = "";
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof SignOutResultPayload) {
                    return mergeFrom((SignOutResultPayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder mergeFrom(SignOutResultPayload signOutResultPayload) {
                if (signOutResultPayload == SignOutResultPayload.getDefaultInstance()) {
                    return this;
                }
                if (!signOutResultPayload.getMessage().isEmpty()) {
                    this.message_ = signOutResultPayload.message_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                mergeUnknownFields(signOutResultPayload.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag != 10) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.message_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ SignOutResultPayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static SignOutResultPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Authentication.internal_static_maum_m2u_map_SignOutResultPayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SignOutResultPayload parseDelimitedFrom(InputStream inputStream) {
            return (SignOutResultPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SignOutResultPayload parseFrom(ByteBuffer byteBuffer) {
            return (SignOutResultPayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SignOutResultPayload)) {
                return super.equals(obj);
            }
            SignOutResultPayload signOutResultPayload = (SignOutResultPayload) obj;
            return getMessage().equals(signOutResultPayload.getMessage()) && getUnknownFields().equals(signOutResultPayload.getUnknownFields());
        }

        @Override // maum.m2u.map.Authentication.SignOutResultPayloadOrBuilder
        public String getMessage() {
            Object obj = this.message_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.message_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Authentication.SignOutResultPayloadOrBuilder
        public AbstractC5235o getMessageBytes() {
            Object obj = this.message_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.message_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = (!AbstractC5209f0.isStringEmpty(this.message_) ? AbstractC5209f0.computeStringSize(1, this.message_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeStringSize;
            return iComputeStringSize;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getMessage().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Authentication.internal_static_maum_m2u_map_SignOutResultPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(SignOutResultPayload.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new SignOutResultPayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.message_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.message_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private SignOutResultPayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.message_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SignOutResultPayload signOutResultPayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(signOutResultPayload);
        }

        public static SignOutResultPayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (SignOutResultPayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static SignOutResultPayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (SignOutResultPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static SignOutResultPayload parseFrom(AbstractC5235o abstractC5235o) {
            return (SignOutResultPayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public SignOutResultPayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static SignOutResultPayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (SignOutResultPayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SignOutResultPayload() {
            this.message_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.message_ = "";
        }

        public static SignOutResultPayload parseFrom(byte[] bArr) {
            return (SignOutResultPayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static SignOutResultPayload parseFrom(byte[] bArr, M m8) {
            return (SignOutResultPayload) PARSER.parseFrom(bArr, m8);
        }

        public static SignOutResultPayload parseFrom(InputStream inputStream) {
            return (SignOutResultPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static SignOutResultPayload parseFrom(InputStream inputStream, M m8) {
            return (SignOutResultPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static SignOutResultPayload parseFrom(r rVar) {
            return (SignOutResultPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static SignOutResultPayload parseFrom(r rVar, M m8) {
            return (SignOutResultPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface SignOutResultPayloadOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        String getMessage();

        AbstractC5235o getMessageBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class UserKey extends AbstractC5209f0 implements UserKeyOrBuilder {
        public static final int AUTH_TOKEN_FIELD_NUMBER = 1;
        private static final UserKey DEFAULT_INSTANCE = new UserKey();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Authentication.UserKey.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public UserKey parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = UserKey.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private volatile Object authToken_;
        private byte memoizedIsInitialized;

        public static final class Builder extends AbstractC5209f0.b implements UserKeyOrBuilder {
            private Object authToken_;
            private int bitField0_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(UserKey userKey) {
                if ((this.bitField0_ & 1) != 0) {
                    userKey.authToken_ = this.authToken_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return Authentication.internal_static_maum_m2u_map_UserKey_descriptor;
            }

            public Builder clearAuthToken() {
                this.authToken_ = UserKey.getDefaultInstance().getAuthToken();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // maum.m2u.map.Authentication.UserKeyOrBuilder
            public String getAuthToken() {
                Object obj = this.authToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.authToken_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Authentication.UserKeyOrBuilder
            public AbstractC5235o getAuthTokenBytes() {
                Object obj = this.authToken_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.authToken_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Authentication.internal_static_maum_m2u_map_UserKey_descriptor;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Authentication.internal_static_maum_m2u_map_UserKey_fieldAccessorTable.ensureFieldAccessorsInitialized(UserKey.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAuthToken(String str) {
                str.getClass();
                this.authToken_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAuthTokenBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.authToken_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.authToken_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public UserKey build() {
                UserKey userKeyBuildPartial = buildPartial();
                if (userKeyBuildPartial.isInitialized()) {
                    return userKeyBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) userKeyBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public UserKey buildPartial() {
                UserKey userKey = new UserKey(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(userKey);
                }
                onBuilt();
                return userKey;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public UserKey getDefaultInstanceForType() {
                return UserKey.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.authToken_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.authToken_ = "";
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof UserKey) {
                    return mergeFrom((UserKey) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder mergeFrom(UserKey userKey) {
                if (userKey == UserKey.getDefaultInstance()) {
                    return this;
                }
                if (!userKey.getAuthToken().isEmpty()) {
                    this.authToken_ = userKey.authToken_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                mergeUnknownFields(userKey.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag != 10) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.authToken_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ UserKey(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static UserKey getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Authentication.internal_static_maum_m2u_map_UserKey_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserKey parseDelimitedFrom(InputStream inputStream) {
            return (UserKey) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserKey parseFrom(ByteBuffer byteBuffer) {
            return (UserKey) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserKey)) {
                return super.equals(obj);
            }
            UserKey userKey = (UserKey) obj;
            return getAuthToken().equals(userKey.getAuthToken()) && getUnknownFields().equals(userKey.getUnknownFields());
        }

        @Override // maum.m2u.map.Authentication.UserKeyOrBuilder
        public String getAuthToken() {
            Object obj = this.authToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.authToken_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Authentication.UserKeyOrBuilder
        public AbstractC5235o getAuthTokenBytes() {
            Object obj = this.authToken_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.authToken_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = (!AbstractC5209f0.isStringEmpty(this.authToken_) ? AbstractC5209f0.computeStringSize(1, this.authToken_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeStringSize;
            return iComputeStringSize;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAuthToken().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Authentication.internal_static_maum_m2u_map_UserKey_fieldAccessorTable.ensureFieldAccessorsInitialized(UserKey.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new UserKey();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.authToken_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.authToken_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private UserKey(AbstractC5209f0.b bVar) {
            super(bVar);
            this.authToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(UserKey userKey) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userKey);
        }

        public static UserKey parseFrom(ByteBuffer byteBuffer, M m8) {
            return (UserKey) PARSER.parseFrom(byteBuffer, m8);
        }

        public static UserKey parseDelimitedFrom(InputStream inputStream, M m8) {
            return (UserKey) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static UserKey parseFrom(AbstractC5235o abstractC5235o) {
            return (UserKey) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public UserKey getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static UserKey parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (UserKey) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private UserKey() {
            this.authToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.authToken_ = "";
        }

        public static UserKey parseFrom(byte[] bArr) {
            return (UserKey) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static UserKey parseFrom(byte[] bArr, M m8) {
            return (UserKey) PARSER.parseFrom(bArr, m8);
        }

        public static UserKey parseFrom(InputStream inputStream) {
            return (UserKey) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static UserKey parseFrom(InputStream inputStream, M m8) {
            return (UserKey) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static UserKey parseFrom(r rVar) {
            return (UserKey) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static UserKey parseFrom(r rVar, M m8) {
            return (UserKey) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface UserKeyOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        String getAuthToken();

        AbstractC5235o getAuthTokenBytes();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class UserSettings extends AbstractC5209f0 implements UserSettingsOrBuilder {
        public static final int AUTH_TOKEN_FIELD_NUMBER = 1;
        private static final UserSettings DEFAULT_INSTANCE = new UserSettings();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Authentication.UserSettings.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public UserSettings parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = UserSettings.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(rVar, m8);
                    return builderNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int SETTINGS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private volatile Object authToken_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private C5240p1 settings_;

        public static final class Builder extends AbstractC5209f0.b implements UserSettingsOrBuilder {
            private Object authToken_;
            private int bitField0_;
            private C5228l1 settingsBuilder_;
            private C5240p1 settings_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(UserSettings userSettings) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    userSettings.authToken_ = this.authToken_;
                }
                if ((i9 & 2) != 0) {
                    C5228l1 c5228l1 = this.settingsBuilder_;
                    userSettings.settings_ = c5228l1 == null ? this.settings_ : (C5240p1) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                UserSettings.access$1576(userSettings, i8);
            }

            public static final C5269x.b getDescriptor() {
                return Authentication.internal_static_maum_m2u_map_UserSettings_descriptor;
            }

            private C5228l1 getSettingsFieldBuilder() {
                if (this.settingsBuilder_ == null) {
                    this.settingsBuilder_ = new C5228l1(getSettings(), getParentForChildren(), isClean());
                    this.settings_ = null;
                }
                return this.settingsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getSettingsFieldBuilder();
                }
            }

            public Builder clearAuthToken() {
                this.authToken_ = UserSettings.getDefaultInstance().getAuthToken();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearSettings() {
                this.bitField0_ &= -3;
                this.settings_ = null;
                C5228l1 c5228l1 = this.settingsBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.settingsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // maum.m2u.map.Authentication.UserSettingsOrBuilder
            public String getAuthToken() {
                Object obj = this.authToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.authToken_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Authentication.UserSettingsOrBuilder
            public AbstractC5235o getAuthTokenBytes() {
                Object obj = this.authToken_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.authToken_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Authentication.internal_static_maum_m2u_map_UserSettings_descriptor;
            }

            @Override // maum.m2u.map.Authentication.UserSettingsOrBuilder
            public C5240p1 getSettings() {
                C5228l1 c5228l1 = this.settingsBuilder_;
                if (c5228l1 != null) {
                    return (C5240p1) c5228l1.getMessage();
                }
                C5240p1 c5240p1 = this.settings_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            public C5240p1.b getSettingsBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (C5240p1.b) getSettingsFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Authentication.UserSettingsOrBuilder
            public InterfaceC5243q1 getSettingsOrBuilder() {
                C5228l1 c5228l1 = this.settingsBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                }
                C5240p1 c5240p1 = this.settings_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.map.Authentication.UserSettingsOrBuilder
            public boolean hasSettings() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Authentication.internal_static_maum_m2u_map_UserSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(UserSettings.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeSettings(C5240p1 c5240p1) {
                C5240p1 c5240p12;
                C5228l1 c5228l1 = this.settingsBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(c5240p1);
                } else if ((this.bitField0_ & 2) == 0 || (c5240p12 = this.settings_) == null || c5240p12 == C5240p1.getDefaultInstance()) {
                    this.settings_ = c5240p1;
                } else {
                    getSettingsBuilder().mergeFrom(c5240p1);
                }
                if (this.settings_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder setAuthToken(String str) {
                str.getClass();
                this.authToken_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAuthTokenBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.authToken_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSettings(C5240p1 c5240p1) {
                C5228l1 c5228l1 = this.settingsBuilder_;
                if (c5228l1 == null) {
                    c5240p1.getClass();
                    this.settings_ = c5240p1;
                } else {
                    c5228l1.setMessage(c5240p1);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.authToken_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public UserSettings build() {
                UserSettings userSettingsBuildPartial = buildPartial();
                if (userSettingsBuildPartial.isInitialized()) {
                    return userSettingsBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) userSettingsBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public UserSettings buildPartial() {
                UserSettings userSettings = new UserSettings(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(userSettings);
                }
                onBuilt();
                return userSettings;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public UserSettings getDefaultInstanceForType() {
                return UserSettings.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setField(C5269x.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder setUnknownFields(G1 g12) {
                return (Builder) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearOneof(C5269x.l lVar) {
                return (Builder) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final Builder mergeUnknownFields(G1 g12) {
                return (Builder) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.authToken_ = "";
                this.settings_ = null;
                C5228l1 c5228l1 = this.settingsBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.settingsBuilder_ = null;
                }
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.authToken_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof UserSettings) {
                    return mergeFrom((UserSettings) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setSettings(C5240p1.b bVar) {
                C5228l1 c5228l1 = this.settingsBuilder_;
                if (c5228l1 == null) {
                    this.settings_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFrom(UserSettings userSettings) {
                if (userSettings == UserSettings.getDefaultInstance()) {
                    return this;
                }
                if (!userSettings.getAuthToken().isEmpty()) {
                    this.authToken_ = userSettings.authToken_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (userSettings.hasSettings()) {
                    mergeSettings(userSettings.getSettings());
                }
                mergeUnknownFields(userSettings.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.authToken_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getSettingsFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 2;
                                }
                            }
                            z8 = true;
                        } catch (C5230m0 e8) {
                            throw e8.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }
        }

        /* synthetic */ UserSettings(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$1576(UserSettings userSettings, int i8) {
            int i9 = i8 | userSettings.bitField0_;
            userSettings.bitField0_ = i9;
            return i9;
        }

        public static UserSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Authentication.internal_static_maum_m2u_map_UserSettings_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserSettings parseDelimitedFrom(InputStream inputStream) {
            return (UserSettings) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserSettings parseFrom(ByteBuffer byteBuffer) {
            return (UserSettings) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserSettings)) {
                return super.equals(obj);
            }
            UserSettings userSettings = (UserSettings) obj;
            if (getAuthToken().equals(userSettings.getAuthToken()) && hasSettings() == userSettings.hasSettings()) {
                return (!hasSettings() || getSettings().equals(userSettings.getSettings())) && getUnknownFields().equals(userSettings.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.map.Authentication.UserSettingsOrBuilder
        public String getAuthToken() {
            Object obj = this.authToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.authToken_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Authentication.UserSettingsOrBuilder
        public AbstractC5235o getAuthTokenBytes() {
            Object obj = this.authToken_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.authToken_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.authToken_) ? AbstractC5209f0.computeStringSize(1, this.authToken_) : 0;
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(2, getSettings());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.map.Authentication.UserSettingsOrBuilder
        public C5240p1 getSettings() {
            C5240p1 c5240p1 = this.settings_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.map.Authentication.UserSettingsOrBuilder
        public InterfaceC5243q1 getSettingsOrBuilder() {
            C5240p1 c5240p1 = this.settings_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.map.Authentication.UserSettingsOrBuilder
        public boolean hasSettings() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAuthToken().hashCode();
            if (hasSettings()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSettings().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Authentication.internal_static_maum_m2u_map_UserSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(UserSettings.class, Builder.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.memoizedIsInitialized;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new UserSettings();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.authToken_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.authToken_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(2, getSettings());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private UserSettings(AbstractC5209f0.b bVar) {
            super(bVar);
            this.authToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(UserSettings userSettings) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userSettings);
        }

        public static UserSettings parseFrom(ByteBuffer byteBuffer, M m8) {
            return (UserSettings) PARSER.parseFrom(byteBuffer, m8);
        }

        public static UserSettings parseDelimitedFrom(InputStream inputStream, M m8) {
            return (UserSettings) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static UserSettings parseFrom(AbstractC5235o abstractC5235o) {
            return (UserSettings) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public UserSettings getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            AnonymousClass1 anonymousClass1 = null;
            return this == DEFAULT_INSTANCE ? new Builder(anonymousClass1) : new Builder(anonymousClass1).mergeFrom(this);
        }

        public static UserSettings parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (UserSettings) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private UserSettings() {
            this.authToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.authToken_ = "";
        }

        public static UserSettings parseFrom(byte[] bArr) {
            return (UserSettings) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static UserSettings parseFrom(byte[] bArr, M m8) {
            return (UserSettings) PARSER.parseFrom(bArr, m8);
        }

        public static UserSettings parseFrom(InputStream inputStream) {
            return (UserSettings) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static UserSettings parseFrom(InputStream inputStream, M m8) {
            return (UserSettings) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static UserSettings parseFrom(r rVar) {
            return (UserSettings) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static UserSettings parseFrom(r rVar, M m8) {
            return (UserSettings) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface UserSettingsOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ java.util.Map getAllFields();

        String getAuthToken();

        AbstractC5235o getAuthTokenBytes();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ C5269x.b getDescriptorForType();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        C5240p1 getSettings();

        InterfaceC5243q1 getSettingsOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        boolean hasSettings();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    static {
        C5269x.b bVar = getDescriptor().getMessageTypes().get(0);
        internal_static_maum_m2u_map_UserKey_descriptor = bVar;
        internal_static_maum_m2u_map_UserKey_fieldAccessorTable = new AbstractC5209f0.g(bVar, new String[]{"AuthToken"});
        C5269x.b bVar2 = getDescriptor().getMessageTypes().get(1);
        internal_static_maum_m2u_map_UserSettings_descriptor = bVar2;
        internal_static_maum_m2u_map_UserSettings_fieldAccessorTable = new AbstractC5209f0.g(bVar2, new String[]{"AuthToken", "Settings"});
        C5269x.b bVar3 = getDescriptor().getMessageTypes().get(2);
        internal_static_maum_m2u_map_AuthenticationParam_descriptor = bVar3;
        internal_static_maum_m2u_map_AuthenticationParam_fieldAccessorTable = new AbstractC5209f0.g(bVar3, new String[]{"Method", "Value"});
        C5269x.b bVar4 = getDescriptor().getMessageTypes().get(3);
        internal_static_maum_m2u_map_SignInPayload_descriptor = bVar4;
        internal_static_maum_m2u_map_SignInPayload_fieldAccessorTable = new AbstractC5209f0.g(bVar4, new String[]{"Userkey", "Passphrase", "AuthParams", "Device"});
        C5269x.b bVar5 = getDescriptor().getMessageTypes().get(4);
        internal_static_maum_m2u_map_SignInResultPayload_descriptor = bVar5;
        internal_static_maum_m2u_map_SignInResultPayload_fieldAccessorTable = new AbstractC5209f0.g(bVar5, new String[]{"AuthSuccess", "AuthFailure", "MultiFactorAuthRequest", "TestResult"});
        C5269x.b bVar6 = getDescriptor().getMessageTypes().get(5);
        internal_static_maum_m2u_map_AuthTokenPayload_descriptor = bVar6;
        internal_static_maum_m2u_map_AuthTokenPayload_fieldAccessorTable = new AbstractC5209f0.g(bVar6, new String[]{"AuthToken", "MultiFactor", "Meta"});
        C5269x.b bVar7 = getDescriptor().getMessageTypes().get(6);
        internal_static_maum_m2u_map_AuthFailurePayload_descriptor = bVar7;
        internal_static_maum_m2u_map_AuthFailurePayload_fieldAccessorTable = new AbstractC5209f0.g(bVar7, new String[]{"ResCode", "Message", "DetailMessage"});
        C5269x.b bVar8 = getDescriptor().getMessageTypes().get(7);
        internal_static_maum_m2u_map_MultiFactorAuthRequestPayload_descriptor = bVar8;
        internal_static_maum_m2u_map_MultiFactorAuthRequestPayload_fieldAccessorTable = new AbstractC5209f0.g(bVar8, new String[]{"TempAuthToken", "MultiFactorAuthMethods"});
        C5269x.b bVar9 = bVar8.getNestedTypes().get(0);
        internal_static_maum_m2u_map_MultiFactorAuthRequestPayload_MultiFactorAuthMethod_descriptor = bVar9;
        internal_static_maum_m2u_map_MultiFactorAuthRequestPayload_MultiFactorAuthMethod_fieldAccessorTable = new AbstractC5209f0.g(bVar9, new String[]{"Method", "Param"});
        C5269x.b bVar10 = getDescriptor().getMessageTypes().get(8);
        internal_static_maum_m2u_map_MultiFactorVerifyPayload_descriptor = bVar10;
        internal_static_maum_m2u_map_MultiFactorVerifyPayload_fieldAccessorTable = new AbstractC5209f0.g(bVar10, new String[]{"TempAuthToken", "AuthParams", "MultiFactorAuthResults", "Device"});
        C5269x.b bVar11 = bVar10.getNestedTypes().get(0);
        internal_static_maum_m2u_map_MultiFactorVerifyPayload_MultiFactorAuthResult_descriptor = bVar11;
        internal_static_maum_m2u_map_MultiFactorVerifyPayload_MultiFactorAuthResult_fieldAccessorTable = new AbstractC5209f0.g(bVar11, new String[]{"Method", "Value", "Meta"});
        C5269x.b bVar12 = getDescriptor().getMessageTypes().get(9);
        internal_static_maum_m2u_map_SignOutPayload_descriptor = bVar12;
        internal_static_maum_m2u_map_SignOutPayload_fieldAccessorTable = new AbstractC5209f0.g(bVar12, new String[]{"AuthToken", "UserKey"});
        C5269x.b bVar13 = getDescriptor().getMessageTypes().get(10);
        internal_static_maum_m2u_map_SignOutResultPayload_descriptor = bVar13;
        internal_static_maum_m2u_map_SignOutResultPayload_fieldAccessorTable = new AbstractC5209f0.g(bVar13, new String[]{"Message"});
        C5269x.b bVar14 = getDescriptor().getMessageTypes().get(11);
        internal_static_maum_m2u_map_IsValidRequest_descriptor = bVar14;
        internal_static_maum_m2u_map_IsValidRequest_fieldAccessorTable = new AbstractC5209f0.g(bVar14, new String[]{"AuthToken"});
        C5269x.b bVar15 = getDescriptor().getMessageTypes().get(12);
        internal_static_maum_m2u_map_IsValidResponse_descriptor = bVar15;
        internal_static_maum_m2u_map_IsValidResponse_fieldAccessorTable = new AbstractC5209f0.g(bVar15, new String[]{MapIf.AU_E_IS_VALID, "AccessToken", "ExpiredAt", "VolitileUserMeta"});
        C5269x.b bVar16 = getDescriptor().getMessageTypes().get(13);
        internal_static_maum_m2u_map_GetUserInfoRequest_descriptor = bVar16;
        internal_static_maum_m2u_map_GetUserInfoRequest_fieldAccessorTable = new AbstractC5209f0.g(bVar16, new String[]{"AccessToken"});
        C5269x.b bVar17 = getDescriptor().getMessageTypes().get(14);
        internal_static_maum_m2u_map_GetUserInfoResponse_descriptor = bVar17;
        internal_static_maum_m2u_map_GetUserInfoResponse_fieldAccessorTable = new AbstractC5209f0.g(bVar17, new String[]{"User"});
        y1.getDescriptor();
        AbstractC5245r1.getDescriptor();
        UserOuterClass.getDescriptor();
        DeviceOuterClass.getDescriptor();
    }

    private Authentication() {
    }

    public static C5269x.h getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(M m8) {
    }

    public static void registerAllExtensions(K k8) {
        registerAllExtensions((M) k8);
    }
}
