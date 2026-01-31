package maum.m2u.common;

import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5196b;
import com.google.protobuf.AbstractC5199c;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.AbstractC5235o;
import com.google.protobuf.AbstractC5245r1;
import com.google.protobuf.AbstractC5248t;
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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class UserOuterClass {
    private static C5269x.h descriptor = C5269x.h.internalBuildGeneratedFileFrom(new String[]{"\n\u001amaum/m2u/common/user.proto\u0012\u000fmaum.m2u.common\u001a\u001cgoogle/protobuf/struct.proto\"b\n\u0004User\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\t\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012\u0014\n\faccess_token\u0018\u0003 \u0001(\t\u0012%\n\u0004meta\u0018\u000b \u0001(\u000b2\u0017.google.protobuf.Structb\u0006proto3"}, new C5269x.h[]{AbstractC5245r1.getDescriptor()});
    private static final C5269x.b internal_static_maum_m2u_common_User_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_User_fieldAccessorTable;

    public static final class User extends AbstractC5209f0 implements UserOrBuilder {
        public static final int ACCESS_TOKEN_FIELD_NUMBER = 3;
        public static final int META_FIELD_NUMBER = 11;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int USER_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object accessToken_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private C5240p1 meta_;
        private volatile Object name_;
        private volatile Object userId_;
        private static final User DEFAULT_INSTANCE = new User();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.UserOuterClass.User.1
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public User parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = User.newBuilder();
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

        /* renamed from: maum.m2u.common.UserOuterClass$User$1 */
        class AnonymousClass1 extends AbstractC5199c {
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public User parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = User.newBuilder();
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
        }

        public static final class Builder extends AbstractC5209f0.b implements UserOrBuilder {
            private Object accessToken_;
            private int bitField0_;
            private C5228l1 metaBuilder_;
            private C5240p1 meta_;
            private Object name_;
            private Object userId_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(User user) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    user.userId_ = this.userId_;
                }
                if ((i9 & 2) != 0) {
                    user.name_ = this.name_;
                }
                if ((i9 & 4) != 0) {
                    user.accessToken_ = this.accessToken_;
                }
                if ((i9 & 8) != 0) {
                    C5228l1 c5228l1 = this.metaBuilder_;
                    user.meta_ = c5228l1 == null ? this.meta_ : (C5240p1) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                User.access$1076(user, i8);
            }

            public static final C5269x.b getDescriptor() {
                return UserOuterClass.internal_static_maum_m2u_common_User_descriptor;
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

            public Builder clearAccessToken() {
                this.accessToken_ = User.getDefaultInstance().getAccessToken();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearMeta() {
                this.bitField0_ &= -9;
                this.meta_ = null;
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.metaBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = User.getDefaultInstance().getName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearUserId() {
                this.userId_ = User.getDefaultInstance().getUserId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // maum.m2u.common.UserOuterClass.UserOrBuilder
            public String getAccessToken() {
                Object obj = this.accessToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.accessToken_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.UserOuterClass.UserOrBuilder
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
                return UserOuterClass.internal_static_maum_m2u_common_User_descriptor;
            }

            @Override // maum.m2u.common.UserOuterClass.UserOrBuilder
            public C5240p1 getMeta() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    return (C5240p1) c5228l1.getMessage();
                }
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            public C5240p1.b getMetaBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (C5240p1.b) getMetaFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.UserOuterClass.UserOrBuilder
            public InterfaceC5243q1 getMetaOrBuilder() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                }
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.common.UserOuterClass.UserOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.UserOuterClass.UserOrBuilder
            public AbstractC5235o getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.name_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.UserOuterClass.UserOrBuilder
            public String getUserId() {
                Object obj = this.userId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.userId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.UserOuterClass.UserOrBuilder
            public AbstractC5235o getUserIdBytes() {
                Object obj = this.userId_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.userId_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.UserOuterClass.UserOrBuilder
            public boolean hasMeta() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return UserOuterClass.internal_static_maum_m2u_common_User_fieldAccessorTable.ensureFieldAccessorsInitialized(User.class, Builder.class);
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
                } else if ((this.bitField0_ & 8) == 0 || (c5240p12 = this.meta_) == null || c5240p12 == C5240p1.getDefaultInstance()) {
                    this.meta_ = c5240p1;
                } else {
                    getMetaBuilder().mergeFrom(c5240p1);
                }
                if (this.meta_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder setAccessToken(String str) {
                str.getClass();
                this.accessToken_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setAccessTokenBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.accessToken_ = abstractC5235o;
                this.bitField0_ |= 4;
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
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setNameBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.name_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUserId(String str) {
                str.getClass();
                this.userId_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUserIdBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.userId_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.userId_ = "";
                this.name_ = "";
                this.accessToken_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public User build() {
                User userBuildPartial = buildPartial();
                if (userBuildPartial.isInitialized()) {
                    return userBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) userBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public User buildPartial() {
                User user = new User(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(user);
                }
                onBuilt();
                return user;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public User getDefaultInstanceForType() {
                return User.getDefaultInstance();
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
                this.userId_ = "";
                this.name_ = "";
                this.accessToken_ = "";
                this.meta_ = null;
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.metaBuilder_ = null;
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
                if (h02 instanceof User) {
                    return mergeFrom((User) h02);
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
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.userId_ = "";
                this.name_ = "";
                this.accessToken_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(User user) {
                if (user == User.getDefaultInstance()) {
                    return this;
                }
                if (!user.getUserId().isEmpty()) {
                    this.userId_ = user.userId_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!user.getName().isEmpty()) {
                    this.name_ = user.name_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!user.getAccessToken().isEmpty()) {
                    this.accessToken_ = user.accessToken_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (user.hasMeta()) {
                    mergeMeta(user.getMeta());
                }
                mergeUnknownFields(user.getUnknownFields());
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
                                    this.userId_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.name_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.accessToken_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                } else if (tag != 90) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getMetaFieldBuilder().getBuilder(), m8);
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

        /* synthetic */ User(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$1076(User user, int i8) {
            int i9 = i8 | user.bitField0_;
            user.bitField0_ = i9;
            return i9;
        }

        public static User getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return UserOuterClass.internal_static_maum_m2u_common_User_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static User parseDelimitedFrom(InputStream inputStream) {
            return (User) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static User parseFrom(ByteBuffer byteBuffer) {
            return (User) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof User)) {
                return super.equals(obj);
            }
            User user = (User) obj;
            if (getUserId().equals(user.getUserId()) && getName().equals(user.getName()) && getAccessToken().equals(user.getAccessToken()) && hasMeta() == user.hasMeta()) {
                return (!hasMeta() || getMeta().equals(user.getMeta())) && getUnknownFields().equals(user.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.UserOuterClass.UserOrBuilder
        public String getAccessToken() {
            Object obj = this.accessToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.accessToken_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.UserOuterClass.UserOrBuilder
        public AbstractC5235o getAccessTokenBytes() {
            Object obj = this.accessToken_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.accessToken_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.UserOuterClass.UserOrBuilder
        public C5240p1 getMeta() {
            C5240p1 c5240p1 = this.meta_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.common.UserOuterClass.UserOrBuilder
        public InterfaceC5243q1 getMetaOrBuilder() {
            C5240p1 c5240p1 = this.meta_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.common.UserOuterClass.UserOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.UserOuterClass.UserOrBuilder
        public AbstractC5235o getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.name_ = abstractC5235oCopyFromUtf8;
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
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.userId_) ? AbstractC5209f0.computeStringSize(1, this.userId_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.name_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.name_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.accessToken_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(3, this.accessToken_);
            }
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(11, getMeta());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.UserOuterClass.UserOrBuilder
        public String getUserId() {
            Object obj = this.userId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.userId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.UserOuterClass.UserOrBuilder
        public AbstractC5235o getUserIdBytes() {
            Object obj = this.userId_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.userId_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.UserOuterClass.UserOrBuilder
        public boolean hasMeta() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUserId().hashCode()) * 37) + 2) * 53) + getName().hashCode()) * 37) + 3) * 53) + getAccessToken().hashCode();
            if (hasMeta()) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + getMeta().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return UserOuterClass.internal_static_maum_m2u_common_User_fieldAccessorTable.ensureFieldAccessorsInitialized(User.class, Builder.class);
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
            return new User();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.userId_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.userId_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.name_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.name_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.accessToken_)) {
                AbstractC5209f0.writeString(abstractC5248t, 3, this.accessToken_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(11, getMeta());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private User(AbstractC5209f0.b bVar) {
            super(bVar);
            this.userId_ = "";
            this.name_ = "";
            this.accessToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(User user) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(user);
        }

        public static User parseFrom(ByteBuffer byteBuffer, M m8) {
            return (User) PARSER.parseFrom(byteBuffer, m8);
        }

        public static User parseDelimitedFrom(InputStream inputStream, M m8) {
            return (User) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static User parseFrom(AbstractC5235o abstractC5235o) {
            return (User) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public User getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static User parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (User) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static User parseFrom(byte[] bArr) {
            return (User) PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar);
        }

        public static User parseFrom(byte[] bArr, M m8) {
            return (User) PARSER.parseFrom(bArr, m8);
        }

        private User() {
            this.userId_ = "";
            this.name_ = "";
            this.accessToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.userId_ = "";
            this.name_ = "";
            this.accessToken_ = "";
        }

        public static User parseFrom(InputStream inputStream) {
            return (User) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static User parseFrom(InputStream inputStream, M m8) {
            return (User) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static User parseFrom(r rVar) {
            return (User) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static User parseFrom(r rVar, M m8) {
            return (User) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface UserOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        String getAccessToken();

        AbstractC5235o getAccessTokenBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

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

        String getName();

        AbstractC5235o getNameBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        String getUserId();

        AbstractC5235o getUserIdBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        boolean hasMeta();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    static {
        C5269x.b bVar = getDescriptor().getMessageTypes().get(0);
        internal_static_maum_m2u_common_User_descriptor = bVar;
        internal_static_maum_m2u_common_User_fieldAccessorTable = new AbstractC5209f0.g(bVar, new String[]{"UserId", "Name", "AccessToken", "Meta"});
        AbstractC5245r1.getDescriptor();
    }

    private UserOuterClass() {
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
