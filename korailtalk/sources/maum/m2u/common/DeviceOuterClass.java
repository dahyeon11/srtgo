package maum.m2u.common;

import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5196b;
import com.google.protobuf.AbstractC5199c;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.AbstractC5227l0;
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
import com.google.protobuf.w1;
import com.google.protobuf.x1;
import com.google.protobuf.y1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class DeviceOuterClass {
    private static C5269x.h descriptor = C5269x.h.internalBuildGeneratedFileFrom(new String[]{"\n\u001cmaum/m2u/common/device.proto\u0012\u000fmaum.m2u.common\u001a\u001cgoogle/protobuf/struct.proto\u001a\u001fgoogle/protobuf/timestamp.proto\"Ó\u0003\n\u0006Device\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\f\n\u0004type\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007version\u0018\u0003 \u0001(\t\u0012\u000f\n\u0007channel\u0018\u0004 \u0001(\t\u00123\n\u0007support\u0018\u000b \u0001(\u000b2\".maum.m2u.common.Device.Capability\u0012-\n\ttimestamp\u0018b \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012\u0010\n\btimezone\u0018c \u0001(\t\u0012%\n\u0004meta\u0018d \u0001(\u000b2\u0017.google.protobuf.Struct\u001aï\u0001\n\nCapability\u0012\u001b\n\u0013support_render_text\u0018\u0001 \u0001(\b\u0012\u001b\n\u0013support_render_card\u0018\u0002 \u0001(\b\u0012\"\n\u001asupport_speech_synthesizer\u0018\u0003 \u0001(\b\u0012\u001a\n\u0012support_play_audio\u0018\u0004 \u0001(\b\u0012\u001a\n\u0012support_play_video\u0018\u0005 \u0001(\b\u0012\u0016\n\u000esupport_action\u0018\u0006 \u0001(\b\u0012\u0014\n\fsupport_move\u0018\u0007 \u0001(\b\u0012\u001d\n\u0015support_expect_speech\u0018\u000b \u0001(\bb\u0006proto3"}, new C5269x.h[]{AbstractC5245r1.getDescriptor(), y1.getDescriptor()});
    private static final C5269x.b internal_static_maum_m2u_common_Device_Capability_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_Device_Capability_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_Device_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_Device_fieldAccessorTable;

    public static final class Device extends AbstractC5209f0 implements DeviceOrBuilder {
        public static final int CHANNEL_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int META_FIELD_NUMBER = 100;
        public static final int SUPPORT_FIELD_NUMBER = 11;
        public static final int TIMESTAMP_FIELD_NUMBER = 98;
        public static final int TIMEZONE_FIELD_NUMBER = 99;
        public static final int TYPE_FIELD_NUMBER = 2;
        public static final int VERSION_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object channel_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private C5240p1 meta_;
        private Capability support_;
        private w1 timestamp_;
        private volatile Object timezone_;
        private volatile Object type_;
        private volatile Object version_;
        private static final Device DEFAULT_INSTANCE = new Device();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DeviceOuterClass.Device.1
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public Device parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = Device.newBuilder();
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

        /* renamed from: maum.m2u.common.DeviceOuterClass$Device$1 */
        class AnonymousClass1 extends AbstractC5199c {
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public Device parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = Device.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements DeviceOrBuilder {
            private int bitField0_;
            private Object channel_;
            private Object id_;
            private C5228l1 metaBuilder_;
            private C5240p1 meta_;
            private C5228l1 supportBuilder_;
            private Capability support_;
            private C5228l1 timestampBuilder_;
            private w1 timestamp_;
            private Object timezone_;
            private Object type_;
            private Object version_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(Device device) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    device.id_ = this.id_;
                }
                if ((i9 & 2) != 0) {
                    device.type_ = this.type_;
                }
                if ((i9 & 4) != 0) {
                    device.version_ = this.version_;
                }
                if ((i9 & 8) != 0) {
                    device.channel_ = this.channel_;
                }
                if ((i9 & 16) != 0) {
                    C5228l1 c5228l1 = this.supportBuilder_;
                    device.support_ = c5228l1 == null ? this.support_ : (Capability) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if ((i9 & 32) != 0) {
                    C5228l1 c5228l12 = this.timestampBuilder_;
                    device.timestamp_ = c5228l12 == null ? this.timestamp_ : (w1) c5228l12.build();
                    i8 |= 2;
                }
                if ((i9 & 64) != 0) {
                    device.timezone_ = this.timezone_;
                }
                if ((i9 & 128) != 0) {
                    C5228l1 c5228l13 = this.metaBuilder_;
                    device.meta_ = c5228l13 == null ? this.meta_ : (C5240p1) c5228l13.build();
                    i8 |= 4;
                }
                Device.access$2776(device, i8);
            }

            public static final C5269x.b getDescriptor() {
                return DeviceOuterClass.internal_static_maum_m2u_common_Device_descriptor;
            }

            private C5228l1 getMetaFieldBuilder() {
                if (this.metaBuilder_ == null) {
                    this.metaBuilder_ = new C5228l1(getMeta(), getParentForChildren(), isClean());
                    this.meta_ = null;
                }
                return this.metaBuilder_;
            }

            private C5228l1 getSupportFieldBuilder() {
                if (this.supportBuilder_ == null) {
                    this.supportBuilder_ = new C5228l1(getSupport(), getParentForChildren(), isClean());
                    this.support_ = null;
                }
                return this.supportBuilder_;
            }

            private C5228l1 getTimestampFieldBuilder() {
                if (this.timestampBuilder_ == null) {
                    this.timestampBuilder_ = new C5228l1(getTimestamp(), getParentForChildren(), isClean());
                    this.timestamp_ = null;
                }
                return this.timestampBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getSupportFieldBuilder();
                    getTimestampFieldBuilder();
                    getMetaFieldBuilder();
                }
            }

            public Builder clearChannel() {
                this.channel_ = Device.getDefaultInstance().getChannel();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = Device.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearMeta() {
                this.bitField0_ &= -129;
                this.meta_ = null;
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.metaBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSupport() {
                this.bitField0_ &= -17;
                this.support_ = null;
                C5228l1 c5228l1 = this.supportBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.supportBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTimestamp() {
                this.bitField0_ &= -33;
                this.timestamp_ = null;
                C5228l1 c5228l1 = this.timestampBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.timestampBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTimezone() {
                this.timezone_ = Device.getDefaultInstance().getTimezone();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = Device.getDefaultInstance().getType();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearVersion() {
                this.version_ = Device.getDefaultInstance().getVersion();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
            public String getChannel() {
                Object obj = this.channel_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.channel_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
            public AbstractC5235o getChannelBytes() {
                Object obj = this.channel_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.channel_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return DeviceOuterClass.internal_static_maum_m2u_common_Device_descriptor;
            }

            @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
            public AbstractC5235o getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.id_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
            public C5240p1 getMeta() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    return (C5240p1) c5228l1.getMessage();
                }
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            public C5240p1.b getMetaBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (C5240p1.b) getMetaFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
            public InterfaceC5243q1 getMetaOrBuilder() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                }
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
            public Capability getSupport() {
                C5228l1 c5228l1 = this.supportBuilder_;
                if (c5228l1 != null) {
                    return (Capability) c5228l1.getMessage();
                }
                Capability capability = this.support_;
                return capability == null ? Capability.getDefaultInstance() : capability;
            }

            public Capability.Builder getSupportBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (Capability.Builder) getSupportFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
            public CapabilityOrBuilder getSupportOrBuilder() {
                C5228l1 c5228l1 = this.supportBuilder_;
                if (c5228l1 != null) {
                    return (CapabilityOrBuilder) c5228l1.getMessageOrBuilder();
                }
                Capability capability = this.support_;
                return capability == null ? Capability.getDefaultInstance() : capability;
            }

            @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
            public w1 getTimestamp() {
                C5228l1 c5228l1 = this.timestampBuilder_;
                if (c5228l1 != null) {
                    return (w1) c5228l1.getMessage();
                }
                w1 w1Var = this.timestamp_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            public w1.b getTimestampBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (w1.b) getTimestampFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
            public x1 getTimestampOrBuilder() {
                C5228l1 c5228l1 = this.timestampBuilder_;
                if (c5228l1 != null) {
                    return (x1) c5228l1.getMessageOrBuilder();
                }
                w1 w1Var = this.timestamp_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
            public String getTimezone() {
                Object obj = this.timezone_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.timezone_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
            public AbstractC5235o getTimezoneBytes() {
                Object obj = this.timezone_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.timezone_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
            public String getType() {
                Object obj = this.type_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.type_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
            public AbstractC5235o getTypeBytes() {
                Object obj = this.type_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.type_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
            public String getVersion() {
                Object obj = this.version_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.version_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
            public AbstractC5235o getVersionBytes() {
                Object obj = this.version_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.version_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
            public boolean hasMeta() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
            public boolean hasSupport() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
            public boolean hasTimestamp() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DeviceOuterClass.internal_static_maum_m2u_common_Device_fieldAccessorTable.ensureFieldAccessorsInitialized(Device.class, Builder.class);
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
                } else if ((this.bitField0_ & 128) == 0 || (c5240p12 = this.meta_) == null || c5240p12 == C5240p1.getDefaultInstance()) {
                    this.meta_ = c5240p1;
                } else {
                    getMetaBuilder().mergeFrom(c5240p1);
                }
                if (this.meta_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSupport(Capability capability) {
                Capability capability2;
                C5228l1 c5228l1 = this.supportBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(capability);
                } else if ((this.bitField0_ & 16) == 0 || (capability2 = this.support_) == null || capability2 == Capability.getDefaultInstance()) {
                    this.support_ = capability;
                } else {
                    getSupportBuilder().mergeFrom(capability);
                }
                if (this.support_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTimestamp(w1 w1Var) {
                w1 w1Var2;
                C5228l1 c5228l1 = this.timestampBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(w1Var);
                } else if ((this.bitField0_ & 32) == 0 || (w1Var2 = this.timestamp_) == null || w1Var2 == w1.getDefaultInstance()) {
                    this.timestamp_ = w1Var;
                } else {
                    getTimestampBuilder().mergeFrom(w1Var);
                }
                if (this.timestamp_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder setChannel(String str) {
                str.getClass();
                this.channel_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setChannelBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.channel_ = abstractC5235o;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setId(String str) {
                str.getClass();
                this.id_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIdBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.id_ = abstractC5235o;
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
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setSupport(Capability capability) {
                C5228l1 c5228l1 = this.supportBuilder_;
                if (c5228l1 == null) {
                    capability.getClass();
                    this.support_ = capability;
                } else {
                    c5228l1.setMessage(capability);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTimestamp(w1 w1Var) {
                C5228l1 c5228l1 = this.timestampBuilder_;
                if (c5228l1 == null) {
                    w1Var.getClass();
                    this.timestamp_ = w1Var;
                } else {
                    c5228l1.setMessage(w1Var);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setTimezone(String str) {
                str.getClass();
                this.timezone_ = str;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setTimezoneBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.timezone_ = abstractC5235o;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setType(String str) {
                str.getClass();
                this.type_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTypeBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.type_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setVersion(String str) {
                str.getClass();
                this.version_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setVersionBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.version_ = abstractC5235o;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.id_ = "";
                this.type_ = "";
                this.version_ = "";
                this.channel_ = "";
                this.timezone_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Device build() {
                Device deviceBuildPartial = buildPartial();
                if (deviceBuildPartial.isInitialized()) {
                    return deviceBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) deviceBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Device buildPartial() {
                Device device = new Device(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(device);
                }
                onBuilt();
                return device;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public Device getDefaultInstanceForType() {
                return Device.getDefaultInstance();
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
                this.id_ = "";
                this.type_ = "";
                this.version_ = "";
                this.channel_ = "";
                this.support_ = null;
                C5228l1 c5228l1 = this.supportBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.supportBuilder_ = null;
                }
                this.timestamp_ = null;
                C5228l1 c5228l12 = this.timestampBuilder_;
                if (c5228l12 != null) {
                    c5228l12.dispose();
                    this.timestampBuilder_ = null;
                }
                this.timezone_ = "";
                this.meta_ = null;
                C5228l1 c5228l13 = this.metaBuilder_;
                if (c5228l13 != null) {
                    c5228l13.dispose();
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
                if (h02 instanceof Device) {
                    return mergeFrom((Device) h02);
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
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setSupport(Capability.Builder builder) {
                C5228l1 c5228l1 = this.supportBuilder_;
                if (c5228l1 == null) {
                    this.support_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTimestamp(w1.b bVar) {
                C5228l1 c5228l1 = this.timestampBuilder_;
                if (c5228l1 == null) {
                    this.timestamp_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.id_ = "";
                this.type_ = "";
                this.version_ = "";
                this.channel_ = "";
                this.timezone_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Device device) {
                if (device == Device.getDefaultInstance()) {
                    return this;
                }
                if (!device.getId().isEmpty()) {
                    this.id_ = device.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!device.getType().isEmpty()) {
                    this.type_ = device.type_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!device.getVersion().isEmpty()) {
                    this.version_ = device.version_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (!device.getChannel().isEmpty()) {
                    this.channel_ = device.channel_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (device.hasSupport()) {
                    mergeSupport(device.getSupport());
                }
                if (device.hasTimestamp()) {
                    mergeTimestamp(device.getTimestamp());
                }
                if (!device.getTimezone().isEmpty()) {
                    this.timezone_ = device.timezone_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                if (device.hasMeta()) {
                    mergeMeta(device.getMeta());
                }
                mergeUnknownFields(device.getUnknownFields());
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
                                    this.id_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.type_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.version_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.channel_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 8;
                                } else if (tag == 90) {
                                    rVar.readMessage(getSupportFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 16;
                                } else if (tag == 786) {
                                    rVar.readMessage(getTimestampFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 32;
                                } else if (tag == 794) {
                                    this.timezone_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 64;
                                } else if (tag != 802) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getMetaFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 128;
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

        public static final class Capability extends AbstractC5209f0 implements CapabilityOrBuilder {
            private static final Capability DEFAULT_INSTANCE = new Capability();
            private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.DeviceOuterClass.Device.Capability.1
                AnonymousClass1() {
                }

                @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
                public Capability parsePartialFrom(r rVar, M m8) throws C5230m0 {
                    Builder builderNewBuilder = Capability.newBuilder();
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
            public static final int SUPPORT_ACTION_FIELD_NUMBER = 6;
            public static final int SUPPORT_EXPECT_SPEECH_FIELD_NUMBER = 11;
            public static final int SUPPORT_MOVE_FIELD_NUMBER = 7;
            public static final int SUPPORT_PLAY_AUDIO_FIELD_NUMBER = 4;
            public static final int SUPPORT_PLAY_VIDEO_FIELD_NUMBER = 5;
            public static final int SUPPORT_RENDER_CARD_FIELD_NUMBER = 2;
            public static final int SUPPORT_RENDER_TEXT_FIELD_NUMBER = 1;
            public static final int SUPPORT_SPEECH_SYNTHESIZER_FIELD_NUMBER = 3;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private boolean supportAction_;
            private boolean supportExpectSpeech_;
            private boolean supportMove_;
            private boolean supportPlayAudio_;
            private boolean supportPlayVideo_;
            private boolean supportRenderCard_;
            private boolean supportRenderText_;
            private boolean supportSpeechSynthesizer_;

            /* renamed from: maum.m2u.common.DeviceOuterClass$Device$Capability$1 */
            class AnonymousClass1 extends AbstractC5199c {
                AnonymousClass1() {
                }

                @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
                public Capability parsePartialFrom(r rVar, M m8) throws C5230m0 {
                    Builder builderNewBuilder = Capability.newBuilder();
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

            public static final class Builder extends AbstractC5209f0.b implements CapabilityOrBuilder {
                private int bitField0_;
                private boolean supportAction_;
                private boolean supportExpectSpeech_;
                private boolean supportMove_;
                private boolean supportPlayAudio_;
                private boolean supportPlayVideo_;
                private boolean supportRenderCard_;
                private boolean supportRenderText_;
                private boolean supportSpeechSynthesizer_;

                /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                    this(cVar);
                }

                private void buildPartial0(Capability capability) {
                    int i8 = this.bitField0_;
                    if ((i8 & 1) != 0) {
                        capability.supportRenderText_ = this.supportRenderText_;
                    }
                    if ((i8 & 2) != 0) {
                        capability.supportRenderCard_ = this.supportRenderCard_;
                    }
                    if ((i8 & 4) != 0) {
                        capability.supportSpeechSynthesizer_ = this.supportSpeechSynthesizer_;
                    }
                    if ((i8 & 8) != 0) {
                        capability.supportPlayAudio_ = this.supportPlayAudio_;
                    }
                    if ((i8 & 16) != 0) {
                        capability.supportPlayVideo_ = this.supportPlayVideo_;
                    }
                    if ((i8 & 32) != 0) {
                        capability.supportAction_ = this.supportAction_;
                    }
                    if ((i8 & 64) != 0) {
                        capability.supportMove_ = this.supportMove_;
                    }
                    if ((i8 & 128) != 0) {
                        capability.supportExpectSpeech_ = this.supportExpectSpeech_;
                    }
                }

                public static final C5269x.b getDescriptor() {
                    return DeviceOuterClass.internal_static_maum_m2u_common_Device_Capability_descriptor;
                }

                public Builder clearSupportAction() {
                    this.bitField0_ &= -33;
                    this.supportAction_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearSupportExpectSpeech() {
                    this.bitField0_ &= -129;
                    this.supportExpectSpeech_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearSupportMove() {
                    this.bitField0_ &= -65;
                    this.supportMove_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearSupportPlayAudio() {
                    this.bitField0_ &= -9;
                    this.supportPlayAudio_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearSupportPlayVideo() {
                    this.bitField0_ &= -17;
                    this.supportPlayVideo_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearSupportRenderCard() {
                    this.bitField0_ &= -3;
                    this.supportRenderCard_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearSupportRenderText() {
                    this.bitField0_ &= -2;
                    this.supportRenderText_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearSupportSpeechSynthesizer() {
                    this.bitField0_ &= -5;
                    this.supportSpeechSynthesizer_ = false;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
                public C5269x.b getDescriptorForType() {
                    return DeviceOuterClass.internal_static_maum_m2u_common_Device_Capability_descriptor;
                }

                @Override // maum.m2u.common.DeviceOuterClass.Device.CapabilityOrBuilder
                public boolean getSupportAction() {
                    return this.supportAction_;
                }

                @Override // maum.m2u.common.DeviceOuterClass.Device.CapabilityOrBuilder
                public boolean getSupportExpectSpeech() {
                    return this.supportExpectSpeech_;
                }

                @Override // maum.m2u.common.DeviceOuterClass.Device.CapabilityOrBuilder
                public boolean getSupportMove() {
                    return this.supportMove_;
                }

                @Override // maum.m2u.common.DeviceOuterClass.Device.CapabilityOrBuilder
                public boolean getSupportPlayAudio() {
                    return this.supportPlayAudio_;
                }

                @Override // maum.m2u.common.DeviceOuterClass.Device.CapabilityOrBuilder
                public boolean getSupportPlayVideo() {
                    return this.supportPlayVideo_;
                }

                @Override // maum.m2u.common.DeviceOuterClass.Device.CapabilityOrBuilder
                public boolean getSupportRenderCard() {
                    return this.supportRenderCard_;
                }

                @Override // maum.m2u.common.DeviceOuterClass.Device.CapabilityOrBuilder
                public boolean getSupportRenderText() {
                    return this.supportRenderText_;
                }

                @Override // maum.m2u.common.DeviceOuterClass.Device.CapabilityOrBuilder
                public boolean getSupportSpeechSynthesizer() {
                    return this.supportSpeechSynthesizer_;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b
                protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                    return DeviceOuterClass.internal_static_maum_m2u_common_Device_Capability_fieldAccessorTable.ensureFieldAccessorsInitialized(Capability.class, Builder.class);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setSupportAction(boolean z8) {
                    this.supportAction_ = z8;
                    this.bitField0_ |= 32;
                    onChanged();
                    return this;
                }

                public Builder setSupportExpectSpeech(boolean z8) {
                    this.supportExpectSpeech_ = z8;
                    this.bitField0_ |= 128;
                    onChanged();
                    return this;
                }

                public Builder setSupportMove(boolean z8) {
                    this.supportMove_ = z8;
                    this.bitField0_ |= 64;
                    onChanged();
                    return this;
                }

                public Builder setSupportPlayAudio(boolean z8) {
                    this.supportPlayAudio_ = z8;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder setSupportPlayVideo(boolean z8) {
                    this.supportPlayVideo_ = z8;
                    this.bitField0_ |= 16;
                    onChanged();
                    return this;
                }

                public Builder setSupportRenderCard(boolean z8) {
                    this.supportRenderCard_ = z8;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setSupportRenderText(boolean z8) {
                    this.supportRenderText_ = z8;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setSupportSpeechSynthesizer(boolean z8) {
                    this.supportSpeechSynthesizer_ = z8;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                private Builder() {
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                    return (Builder) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Capability build() {
                    Capability capabilityBuildPartial = buildPartial();
                    if (capabilityBuildPartial.isInitialized()) {
                        return capabilityBuildPartial;
                    }
                    throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) capabilityBuildPartial);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
                public Capability buildPartial() {
                    Capability capability = new Capability(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(capability);
                    }
                    onBuilt();
                    return capability;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder clearField(C5269x.g gVar) {
                    return (Builder) super.clearField(gVar);
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
                public Capability getDefaultInstanceForType() {
                    return Capability.getDefaultInstance();
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

                private Builder(AbstractC5209f0.c cVar) {
                    super(cVar);
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
                    this.supportRenderText_ = false;
                    this.supportRenderCard_ = false;
                    this.supportSpeechSynthesizer_ = false;
                    this.supportPlayAudio_ = false;
                    this.supportPlayVideo_ = false;
                    this.supportAction_ = false;
                    this.supportMove_ = false;
                    this.supportExpectSpeech_ = false;
                    return this;
                }

                @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
                /* renamed from: clone */
                public Builder mo3clone() {
                    return (Builder) super.mo3clone();
                }

                @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
                public Builder mergeFrom(H0 h02) {
                    if (h02 instanceof Capability) {
                        return mergeFrom((Capability) h02);
                    }
                    super.mergeFrom(h02);
                    return this;
                }

                public Builder mergeFrom(Capability capability) {
                    if (capability == Capability.getDefaultInstance()) {
                        return this;
                    }
                    if (capability.getSupportRenderText()) {
                        setSupportRenderText(capability.getSupportRenderText());
                    }
                    if (capability.getSupportRenderCard()) {
                        setSupportRenderCard(capability.getSupportRenderCard());
                    }
                    if (capability.getSupportSpeechSynthesizer()) {
                        setSupportSpeechSynthesizer(capability.getSupportSpeechSynthesizer());
                    }
                    if (capability.getSupportPlayAudio()) {
                        setSupportPlayAudio(capability.getSupportPlayAudio());
                    }
                    if (capability.getSupportPlayVideo()) {
                        setSupportPlayVideo(capability.getSupportPlayVideo());
                    }
                    if (capability.getSupportAction()) {
                        setSupportAction(capability.getSupportAction());
                    }
                    if (capability.getSupportMove()) {
                        setSupportMove(capability.getSupportMove());
                    }
                    if (capability.getSupportExpectSpeech()) {
                        setSupportExpectSpeech(capability.getSupportExpectSpeech());
                    }
                    mergeUnknownFields(capability.getUnknownFields());
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
                                        this.supportRenderText_ = rVar.readBool();
                                        this.bitField0_ |= 1;
                                    } else if (tag == 16) {
                                        this.supportRenderCard_ = rVar.readBool();
                                        this.bitField0_ |= 2;
                                    } else if (tag == 24) {
                                        this.supportSpeechSynthesizer_ = rVar.readBool();
                                        this.bitField0_ |= 4;
                                    } else if (tag == 32) {
                                        this.supportPlayAudio_ = rVar.readBool();
                                        this.bitField0_ |= 8;
                                    } else if (tag == 40) {
                                        this.supportPlayVideo_ = rVar.readBool();
                                        this.bitField0_ |= 16;
                                    } else if (tag == 48) {
                                        this.supportAction_ = rVar.readBool();
                                        this.bitField0_ |= 32;
                                    } else if (tag == 56) {
                                        this.supportMove_ = rVar.readBool();
                                        this.bitField0_ |= 64;
                                    } else if (tag != 88) {
                                        if (!super.parseUnknownField(rVar, m8, tag)) {
                                        }
                                    } else {
                                        this.supportExpectSpeech_ = rVar.readBool();
                                        this.bitField0_ |= 128;
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

            /* synthetic */ Capability(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
                this(bVar);
            }

            public static Capability getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final C5269x.b getDescriptor() {
                return DeviceOuterClass.internal_static_maum_m2u_common_Device_Capability_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Capability parseDelimitedFrom(InputStream inputStream) {
                return (Capability) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Capability parseFrom(ByteBuffer byteBuffer) {
                return (Capability) PARSER.parseFrom(byteBuffer);
            }

            public static Z0 parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Capability)) {
                    return super.equals(obj);
                }
                Capability capability = (Capability) obj;
                return getSupportRenderText() == capability.getSupportRenderText() && getSupportRenderCard() == capability.getSupportRenderCard() && getSupportSpeechSynthesizer() == capability.getSupportSpeechSynthesizer() && getSupportPlayAudio() == capability.getSupportPlayAudio() && getSupportPlayVideo() == capability.getSupportPlayVideo() && getSupportAction() == capability.getSupportAction() && getSupportMove() == capability.getSupportMove() && getSupportExpectSpeech() == capability.getSupportExpectSpeech() && getUnknownFields().equals(capability.getUnknownFields());
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
                boolean z8 = this.supportRenderText_;
                int iComputeBoolSize = z8 ? AbstractC5248t.computeBoolSize(1, z8) : 0;
                boolean z9 = this.supportRenderCard_;
                if (z9) {
                    iComputeBoolSize += AbstractC5248t.computeBoolSize(2, z9);
                }
                boolean z10 = this.supportSpeechSynthesizer_;
                if (z10) {
                    iComputeBoolSize += AbstractC5248t.computeBoolSize(3, z10);
                }
                boolean z11 = this.supportPlayAudio_;
                if (z11) {
                    iComputeBoolSize += AbstractC5248t.computeBoolSize(4, z11);
                }
                boolean z12 = this.supportPlayVideo_;
                if (z12) {
                    iComputeBoolSize += AbstractC5248t.computeBoolSize(5, z12);
                }
                boolean z13 = this.supportAction_;
                if (z13) {
                    iComputeBoolSize += AbstractC5248t.computeBoolSize(6, z13);
                }
                boolean z14 = this.supportMove_;
                if (z14) {
                    iComputeBoolSize += AbstractC5248t.computeBoolSize(7, z14);
                }
                boolean z15 = this.supportExpectSpeech_;
                if (z15) {
                    iComputeBoolSize += AbstractC5248t.computeBoolSize(11, z15);
                }
                int serializedSize = iComputeBoolSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // maum.m2u.common.DeviceOuterClass.Device.CapabilityOrBuilder
            public boolean getSupportAction() {
                return this.supportAction_;
            }

            @Override // maum.m2u.common.DeviceOuterClass.Device.CapabilityOrBuilder
            public boolean getSupportExpectSpeech() {
                return this.supportExpectSpeech_;
            }

            @Override // maum.m2u.common.DeviceOuterClass.Device.CapabilityOrBuilder
            public boolean getSupportMove() {
                return this.supportMove_;
            }

            @Override // maum.m2u.common.DeviceOuterClass.Device.CapabilityOrBuilder
            public boolean getSupportPlayAudio() {
                return this.supportPlayAudio_;
            }

            @Override // maum.m2u.common.DeviceOuterClass.Device.CapabilityOrBuilder
            public boolean getSupportPlayVideo() {
                return this.supportPlayVideo_;
            }

            @Override // maum.m2u.common.DeviceOuterClass.Device.CapabilityOrBuilder
            public boolean getSupportRenderCard() {
                return this.supportRenderCard_;
            }

            @Override // maum.m2u.common.DeviceOuterClass.Device.CapabilityOrBuilder
            public boolean getSupportRenderText() {
                return this.supportRenderText_;
            }

            @Override // maum.m2u.common.DeviceOuterClass.Device.CapabilityOrBuilder
            public boolean getSupportSpeechSynthesizer() {
                return this.supportSpeechSynthesizer_;
            }

            @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
            public int hashCode() {
                int i8 = this.memoizedHashCode;
                if (i8 != 0) {
                    return i8;
                }
                int iHashCode = ((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + AbstractC5227l0.hashBoolean(getSupportRenderText())) * 37) + 2) * 53) + AbstractC5227l0.hashBoolean(getSupportRenderCard())) * 37) + 3) * 53) + AbstractC5227l0.hashBoolean(getSupportSpeechSynthesizer())) * 37) + 4) * 53) + AbstractC5227l0.hashBoolean(getSupportPlayAudio())) * 37) + 5) * 53) + AbstractC5227l0.hashBoolean(getSupportPlayVideo())) * 37) + 6) * 53) + AbstractC5227l0.hashBoolean(getSupportAction())) * 37) + 7) * 53) + AbstractC5227l0.hashBoolean(getSupportMove())) * 37) + 11) * 53) + AbstractC5227l0.hashBoolean(getSupportExpectSpeech())) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.AbstractC5209f0
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return DeviceOuterClass.internal_static_maum_m2u_common_Device_Capability_fieldAccessorTable.ensureFieldAccessorsInitialized(Capability.class, Builder.class);
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
                return new Capability();
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public void writeTo(AbstractC5248t abstractC5248t) {
                boolean z8 = this.supportRenderText_;
                if (z8) {
                    abstractC5248t.writeBool(1, z8);
                }
                boolean z9 = this.supportRenderCard_;
                if (z9) {
                    abstractC5248t.writeBool(2, z9);
                }
                boolean z10 = this.supportSpeechSynthesizer_;
                if (z10) {
                    abstractC5248t.writeBool(3, z10);
                }
                boolean z11 = this.supportPlayAudio_;
                if (z11) {
                    abstractC5248t.writeBool(4, z11);
                }
                boolean z12 = this.supportPlayVideo_;
                if (z12) {
                    abstractC5248t.writeBool(5, z12);
                }
                boolean z13 = this.supportAction_;
                if (z13) {
                    abstractC5248t.writeBool(6, z13);
                }
                boolean z14 = this.supportMove_;
                if (z14) {
                    abstractC5248t.writeBool(7, z14);
                }
                boolean z15 = this.supportExpectSpeech_;
                if (z15) {
                    abstractC5248t.writeBool(11, z15);
                }
                getUnknownFields().writeTo(abstractC5248t);
            }

            private Capability(AbstractC5209f0.b bVar) {
                super(bVar);
                this.supportRenderText_ = false;
                this.supportRenderCard_ = false;
                this.supportSpeechSynthesizer_ = false;
                this.supportPlayAudio_ = false;
                this.supportPlayVideo_ = false;
                this.supportAction_ = false;
                this.supportMove_ = false;
                this.supportExpectSpeech_ = false;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(Capability capability) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(capability);
            }

            public static Capability parseFrom(ByteBuffer byteBuffer, M m8) {
                return (Capability) PARSER.parseFrom(byteBuffer, m8);
            }

            public static Capability parseDelimitedFrom(InputStream inputStream, M m8) {
                return (Capability) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
            }

            public static Capability parseFrom(AbstractC5235o abstractC5235o) {
                return (Capability) PARSER.parseFrom(abstractC5235o);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public Capability getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Capability parseFrom(AbstractC5235o abstractC5235o, M m8) {
                return (Capability) PARSER.parseFrom(abstractC5235o, m8);
            }

            @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Capability parseFrom(byte[] bArr) {
                return (Capability) PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.AbstractC5209f0
            public Builder newBuilderForType(AbstractC5209f0.c cVar) {
                return new Builder(cVar);
            }

            public static Capability parseFrom(byte[] bArr, M m8) {
                return (Capability) PARSER.parseFrom(bArr, m8);
            }

            public static Capability parseFrom(InputStream inputStream) {
                return (Capability) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
            }

            public static Capability parseFrom(InputStream inputStream, M m8) {
                return (Capability) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
            }

            public static Capability parseFrom(r rVar) {
                return (Capability) AbstractC5209f0.parseWithIOException(PARSER, rVar);
            }

            private Capability() {
                this.supportRenderText_ = false;
                this.supportRenderCard_ = false;
                this.supportSpeechSynthesizer_ = false;
                this.supportPlayAudio_ = false;
                this.supportPlayVideo_ = false;
                this.supportAction_ = false;
                this.supportMove_ = false;
                this.supportExpectSpeech_ = false;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Capability parseFrom(r rVar, M m8) {
                return (Capability) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
            }
        }

        public interface CapabilityOrBuilder extends N0 {
            @Override // com.google.protobuf.N0
            /* synthetic */ List findInitializationErrors();

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

            @Override // com.google.protobuf.N0
            /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

            @Override // com.google.protobuf.N0
            /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

            boolean getSupportAction();

            boolean getSupportExpectSpeech();

            boolean getSupportMove();

            boolean getSupportPlayAudio();

            boolean getSupportPlayVideo();

            boolean getSupportRenderCard();

            boolean getSupportRenderText();

            boolean getSupportSpeechSynthesizer();

            @Override // com.google.protobuf.N0
            /* synthetic */ G1 getUnknownFields();

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasField(C5269x.g gVar);

            @Override // com.google.protobuf.N0
            /* synthetic */ boolean hasOneof(C5269x.l lVar);

            @Override // com.google.protobuf.N0, A7.a.c
            /* synthetic */ boolean isInitialized();
        }

        /* synthetic */ Device(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$2776(Device device, int i8) {
            int i9 = i8 | device.bitField0_;
            device.bitField0_ = i9;
            return i9;
        }

        public static Device getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return DeviceOuterClass.internal_static_maum_m2u_common_Device_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Device parseDelimitedFrom(InputStream inputStream) {
            return (Device) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Device parseFrom(ByteBuffer byteBuffer) {
            return (Device) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Device)) {
                return super.equals(obj);
            }
            Device device = (Device) obj;
            if (!getId().equals(device.getId()) || !getType().equals(device.getType()) || !getVersion().equals(device.getVersion()) || !getChannel().equals(device.getChannel()) || hasSupport() != device.hasSupport()) {
                return false;
            }
            if ((hasSupport() && !getSupport().equals(device.getSupport())) || hasTimestamp() != device.hasTimestamp()) {
                return false;
            }
            if ((!hasTimestamp() || getTimestamp().equals(device.getTimestamp())) && getTimezone().equals(device.getTimezone()) && hasMeta() == device.hasMeta()) {
                return (!hasMeta() || getMeta().equals(device.getMeta())) && getUnknownFields().equals(device.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
        public String getChannel() {
            Object obj = this.channel_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.channel_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
        public AbstractC5235o getChannelBytes() {
            Object obj = this.channel_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.channel_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
        public AbstractC5235o getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.id_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
        public C5240p1 getMeta() {
            C5240p1 c5240p1 = this.meta_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
        public InterfaceC5243q1 getMetaOrBuilder() {
            C5240p1 c5240p1 = this.meta_;
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
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.id_) ? AbstractC5209f0.computeStringSize(1, this.id_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.type_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.type_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.version_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(3, this.version_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.channel_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(4, this.channel_);
            }
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(11, getSupport());
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(98, getTimestamp());
            }
            if (!AbstractC5209f0.isStringEmpty(this.timezone_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(99, this.timezone_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(100, getMeta());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
        public Capability getSupport() {
            Capability capability = this.support_;
            return capability == null ? Capability.getDefaultInstance() : capability;
        }

        @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
        public CapabilityOrBuilder getSupportOrBuilder() {
            Capability capability = this.support_;
            return capability == null ? Capability.getDefaultInstance() : capability;
        }

        @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
        public w1 getTimestamp() {
            w1 w1Var = this.timestamp_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
        public x1 getTimestampOrBuilder() {
            w1 w1Var = this.timestamp_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
        public String getTimezone() {
            Object obj = this.timezone_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.timezone_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
        public AbstractC5235o getTimezoneBytes() {
            Object obj = this.timezone_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.timezone_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
        public String getType() {
            Object obj = this.type_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.type_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
        public AbstractC5235o getTypeBytes() {
            Object obj = this.type_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.type_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
        public String getVersion() {
            Object obj = this.version_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.version_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
        public AbstractC5235o getVersionBytes() {
            Object obj = this.version_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.version_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
        public boolean hasMeta() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
        public boolean hasSupport() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // maum.m2u.common.DeviceOuterClass.DeviceOrBuilder
        public boolean hasTimestamp() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getType().hashCode()) * 37) + 3) * 53) + getVersion().hashCode()) * 37) + 4) * 53) + getChannel().hashCode();
            if (hasSupport()) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + getSupport().hashCode();
            }
            if (hasTimestamp()) {
                iHashCode = (((iHashCode * 37) + 98) * 53) + getTimestamp().hashCode();
            }
            int iHashCode2 = (((iHashCode * 37) + 99) * 53) + getTimezone().hashCode();
            if (hasMeta()) {
                iHashCode2 = (((iHashCode2 * 37) + 100) * 53) + getMeta().hashCode();
            }
            int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return DeviceOuterClass.internal_static_maum_m2u_common_Device_fieldAccessorTable.ensureFieldAccessorsInitialized(Device.class, Builder.class);
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
            return new Device();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.id_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.id_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.type_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.type_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.version_)) {
                AbstractC5209f0.writeString(abstractC5248t, 3, this.version_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.channel_)) {
                AbstractC5209f0.writeString(abstractC5248t, 4, this.channel_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(11, getSupport());
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC5248t.writeMessage(98, getTimestamp());
            }
            if (!AbstractC5209f0.isStringEmpty(this.timezone_)) {
                AbstractC5209f0.writeString(abstractC5248t, 99, this.timezone_);
            }
            if ((this.bitField0_ & 4) != 0) {
                abstractC5248t.writeMessage(100, getMeta());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private Device(AbstractC5209f0.b bVar) {
            super(bVar);
            this.id_ = "";
            this.type_ = "";
            this.version_ = "";
            this.channel_ = "";
            this.timezone_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(Device device) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(device);
        }

        public static Device parseFrom(ByteBuffer byteBuffer, M m8) {
            return (Device) PARSER.parseFrom(byteBuffer, m8);
        }

        public static Device parseDelimitedFrom(InputStream inputStream, M m8) {
            return (Device) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static Device parseFrom(AbstractC5235o abstractC5235o) {
            return (Device) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public Device getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Device parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (Device) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Device parseFrom(byte[] bArr) {
            return (Device) PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar);
        }

        public static Device parseFrom(byte[] bArr, M m8) {
            return (Device) PARSER.parseFrom(bArr, m8);
        }

        public static Device parseFrom(InputStream inputStream) {
            return (Device) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        private Device() {
            this.id_ = "";
            this.type_ = "";
            this.version_ = "";
            this.channel_ = "";
            this.timezone_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.type_ = "";
            this.version_ = "";
            this.channel_ = "";
            this.timezone_ = "";
        }

        public static Device parseFrom(InputStream inputStream, M m8) {
            return (Device) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static Device parseFrom(r rVar) {
            return (Device) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static Device parseFrom(r rVar, M m8) {
            return (Device) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface DeviceOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        String getChannel();

        AbstractC5235o getChannelBytes();

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

        String getId();

        AbstractC5235o getIdBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        C5240p1 getMeta();

        InterfaceC5243q1 getMetaOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        Device.Capability getSupport();

        Device.CapabilityOrBuilder getSupportOrBuilder();

        w1 getTimestamp();

        x1 getTimestampOrBuilder();

        String getTimezone();

        AbstractC5235o getTimezoneBytes();

        String getType();

        AbstractC5235o getTypeBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        String getVersion();

        AbstractC5235o getVersionBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        boolean hasMeta();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        boolean hasSupport();

        boolean hasTimestamp();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    static {
        C5269x.b bVar = getDescriptor().getMessageTypes().get(0);
        internal_static_maum_m2u_common_Device_descriptor = bVar;
        internal_static_maum_m2u_common_Device_fieldAccessorTable = new AbstractC5209f0.g(bVar, new String[]{"Id", "Type", "Version", "Channel", "Support", "Timestamp", "Timezone", "Meta"});
        C5269x.b bVar2 = bVar.getNestedTypes().get(0);
        internal_static_maum_m2u_common_Device_Capability_descriptor = bVar2;
        internal_static_maum_m2u_common_Device_Capability_fieldAccessorTable = new AbstractC5209f0.g(bVar2, new String[]{"SupportRenderText", "SupportRenderCard", "SupportSpeechSynthesizer", "SupportPlayAudio", "SupportPlayVideo", "SupportAction", "SupportMove", "SupportExpectSpeech"});
        AbstractC5245r1.getDescriptor();
        y1.getDescriptor();
    }

    private DeviceOuterClass() {
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
