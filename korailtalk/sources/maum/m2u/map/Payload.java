package maum.m2u.map;

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

/* loaded from: classes3.dex */
public final class Payload {
    private static C5269x.h descriptor = C5269x.h.internalBuildGeneratedFileFrom(new String[]{"\n\u001amaum/m2u/map/payload.proto\u0012\fmaum.m2u.map\u001a\u001cgoogle/protobuf/struct.proto\"!\n\u0011RenderTextPayload\u0012\f\n\u0004text\u0018\u0001 \u0001(\t\"<\n\u0013RenderHiddenPayload\u0012%\n\u0004meta\u0018\u0001 \u0001(\u000b2\u0017.google.protobuf.Struct\"6\n\u0013ExpectSpeechPayload\u0012\u001f\n\u0017timeout_in_milliseconds\u0018\u0001 \u0001(\u0005b\u0006proto3"}, new C5269x.h[]{AbstractC5245r1.getDescriptor()});
    private static final C5269x.b internal_static_maum_m2u_map_ExpectSpeechPayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_ExpectSpeechPayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_RenderHiddenPayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_RenderHiddenPayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_map_RenderTextPayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_map_RenderTextPayload_fieldAccessorTable;

    public static final class ExpectSpeechPayload extends AbstractC5209f0 implements ExpectSpeechPayloadOrBuilder {
        private static final ExpectSpeechPayload DEFAULT_INSTANCE = new ExpectSpeechPayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Payload.ExpectSpeechPayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public ExpectSpeechPayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = ExpectSpeechPayload.newBuilder();
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
        public static final int TIMEOUT_IN_MILLISECONDS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int timeoutInMilliseconds_;

        public static ExpectSpeechPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Payload.internal_static_maum_m2u_map_ExpectSpeechPayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ExpectSpeechPayload parseDelimitedFrom(InputStream inputStream) {
            return (ExpectSpeechPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ExpectSpeechPayload parseFrom(ByteBuffer byteBuffer) {
            return (ExpectSpeechPayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ExpectSpeechPayload)) {
                return super.equals(obj);
            }
            ExpectSpeechPayload expectSpeechPayload = (ExpectSpeechPayload) obj;
            return getTimeoutInMilliseconds() == expectSpeechPayload.getTimeoutInMilliseconds() && getUnknownFields().equals(expectSpeechPayload.getUnknownFields());
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
            int i9 = this.timeoutInMilliseconds_;
            int iComputeInt32Size = (i9 != 0 ? AbstractC5248t.computeInt32Size(1, i9) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        @Override // maum.m2u.map.Payload.ExpectSpeechPayloadOrBuilder
        public int getTimeoutInMilliseconds() {
            return this.timeoutInMilliseconds_;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTimeoutInMilliseconds()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Payload.internal_static_maum_m2u_map_ExpectSpeechPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(ExpectSpeechPayload.class, Builder.class);
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
            return new ExpectSpeechPayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            int i8 = this.timeoutInMilliseconds_;
            if (i8 != 0) {
                abstractC5248t.writeInt32(1, i8);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        public static final class Builder extends AbstractC5209f0.b implements ExpectSpeechPayloadOrBuilder {
            private int bitField0_;
            private int timeoutInMilliseconds_;

            private void buildPartial0(ExpectSpeechPayload expectSpeechPayload) {
                if ((this.bitField0_ & 1) != 0) {
                    expectSpeechPayload.timeoutInMilliseconds_ = this.timeoutInMilliseconds_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return Payload.internal_static_maum_m2u_map_ExpectSpeechPayload_descriptor;
            }

            public Builder clearTimeoutInMilliseconds() {
                this.bitField0_ &= -2;
                this.timeoutInMilliseconds_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Payload.internal_static_maum_m2u_map_ExpectSpeechPayload_descriptor;
            }

            @Override // maum.m2u.map.Payload.ExpectSpeechPayloadOrBuilder
            public int getTimeoutInMilliseconds() {
                return this.timeoutInMilliseconds_;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Payload.internal_static_maum_m2u_map_ExpectSpeechPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(ExpectSpeechPayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder setTimeoutInMilliseconds(int i8) {
                this.timeoutInMilliseconds_ = i8;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public ExpectSpeechPayload build() {
                ExpectSpeechPayload expectSpeechPayloadBuildPartial = buildPartial();
                if (expectSpeechPayloadBuildPartial.isInitialized()) {
                    return expectSpeechPayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) expectSpeechPayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public ExpectSpeechPayload buildPartial() {
                ExpectSpeechPayload expectSpeechPayload = new ExpectSpeechPayload(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(expectSpeechPayload);
                }
                onBuilt();
                return expectSpeechPayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public ExpectSpeechPayload getDefaultInstanceForType() {
                return ExpectSpeechPayload.getDefaultInstance();
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
                this.timeoutInMilliseconds_ = 0;
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof ExpectSpeechPayload) {
                    return mergeFrom((ExpectSpeechPayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder mergeFrom(ExpectSpeechPayload expectSpeechPayload) {
                if (expectSpeechPayload == ExpectSpeechPayload.getDefaultInstance()) {
                    return this;
                }
                if (expectSpeechPayload.getTimeoutInMilliseconds() != 0) {
                    setTimeoutInMilliseconds(expectSpeechPayload.getTimeoutInMilliseconds());
                }
                mergeUnknownFields(expectSpeechPayload.getUnknownFields());
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
                                if (tag != 8) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.timeoutInMilliseconds_ = rVar.readInt32();
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

        private ExpectSpeechPayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.timeoutInMilliseconds_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(ExpectSpeechPayload expectSpeechPayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(expectSpeechPayload);
        }

        public static ExpectSpeechPayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (ExpectSpeechPayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static ExpectSpeechPayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (ExpectSpeechPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static ExpectSpeechPayload parseFrom(AbstractC5235o abstractC5235o) {
            return (ExpectSpeechPayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public ExpectSpeechPayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ExpectSpeechPayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (ExpectSpeechPayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ExpectSpeechPayload() {
            this.timeoutInMilliseconds_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ExpectSpeechPayload parseFrom(byte[] bArr) {
            return (ExpectSpeechPayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar);
        }

        public static ExpectSpeechPayload parseFrom(byte[] bArr, M m8) {
            return (ExpectSpeechPayload) PARSER.parseFrom(bArr, m8);
        }

        public static ExpectSpeechPayload parseFrom(InputStream inputStream) {
            return (ExpectSpeechPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static ExpectSpeechPayload parseFrom(InputStream inputStream, M m8) {
            return (ExpectSpeechPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static ExpectSpeechPayload parseFrom(r rVar) {
            return (ExpectSpeechPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static ExpectSpeechPayload parseFrom(r rVar, M m8) {
            return (ExpectSpeechPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface ExpectSpeechPayloadOrBuilder extends N0 {
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

        int getTimeoutInMilliseconds();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class RenderHiddenPayload extends AbstractC5209f0 implements RenderHiddenPayloadOrBuilder {
        public static final int META_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private C5240p1 meta_;
        private static final RenderHiddenPayload DEFAULT_INSTANCE = new RenderHiddenPayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Payload.RenderHiddenPayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public RenderHiddenPayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = RenderHiddenPayload.newBuilder();
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

        static /* synthetic */ int access$1476(RenderHiddenPayload renderHiddenPayload, int i8) {
            int i9 = i8 | renderHiddenPayload.bitField0_;
            renderHiddenPayload.bitField0_ = i9;
            return i9;
        }

        public static RenderHiddenPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Payload.internal_static_maum_m2u_map_RenderHiddenPayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RenderHiddenPayload parseDelimitedFrom(InputStream inputStream) {
            return (RenderHiddenPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RenderHiddenPayload parseFrom(ByteBuffer byteBuffer) {
            return (RenderHiddenPayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RenderHiddenPayload)) {
                return super.equals(obj);
            }
            RenderHiddenPayload renderHiddenPayload = (RenderHiddenPayload) obj;
            if (hasMeta() != renderHiddenPayload.hasMeta()) {
                return false;
            }
            return (!hasMeta() || getMeta().equals(renderHiddenPayload.getMeta())) && getUnknownFields().equals(renderHiddenPayload.getUnknownFields());
        }

        @Override // maum.m2u.map.Payload.RenderHiddenPayloadOrBuilder
        public C5240p1 getMeta() {
            C5240p1 c5240p1 = this.meta_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.map.Payload.RenderHiddenPayloadOrBuilder
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
            int iComputeMessageSize = ((this.bitField0_ & 1) != 0 ? AbstractC5248t.computeMessageSize(1, getMeta()) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeMessageSize;
            return iComputeMessageSize;
        }

        @Override // maum.m2u.map.Payload.RenderHiddenPayloadOrBuilder
        public boolean hasMeta() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasMeta()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getMeta().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Payload.internal_static_maum_m2u_map_RenderHiddenPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(RenderHiddenPayload.class, Builder.class);
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
            return new RenderHiddenPayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(1, getMeta());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        public static final class Builder extends AbstractC5209f0.b implements RenderHiddenPayloadOrBuilder {
            private int bitField0_;
            private C5228l1 metaBuilder_;
            private C5240p1 meta_;

            private void buildPartial0(RenderHiddenPayload renderHiddenPayload) {
                int i8 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    C5228l1 c5228l1 = this.metaBuilder_;
                    renderHiddenPayload.meta_ = c5228l1 == null ? this.meta_ : (C5240p1) c5228l1.build();
                } else {
                    i8 = 0;
                }
                RenderHiddenPayload.access$1476(renderHiddenPayload, i8);
            }

            public static final C5269x.b getDescriptor() {
                return Payload.internal_static_maum_m2u_map_RenderHiddenPayload_descriptor;
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
                this.bitField0_ &= -2;
                this.meta_ = null;
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.metaBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Payload.internal_static_maum_m2u_map_RenderHiddenPayload_descriptor;
            }

            @Override // maum.m2u.map.Payload.RenderHiddenPayloadOrBuilder
            public C5240p1 getMeta() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    return (C5240p1) c5228l1.getMessage();
                }
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            public C5240p1.b getMetaBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (C5240p1.b) getMetaFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.map.Payload.RenderHiddenPayloadOrBuilder
            public InterfaceC5243q1 getMetaOrBuilder() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                }
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.map.Payload.RenderHiddenPayloadOrBuilder
            public boolean hasMeta() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Payload.internal_static_maum_m2u_map_RenderHiddenPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(RenderHiddenPayload.class, Builder.class);
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
                } else if ((this.bitField0_ & 1) == 0 || (c5240p12 = this.meta_) == null || c5240p12 == C5240p1.getDefaultInstance()) {
                    this.meta_ = c5240p1;
                } else {
                    getMetaBuilder().mergeFrom(c5240p1);
                }
                if (this.meta_ != null) {
                    this.bitField0_ |= 1;
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
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public RenderHiddenPayload build() {
                RenderHiddenPayload renderHiddenPayloadBuildPartial = buildPartial();
                if (renderHiddenPayloadBuildPartial.isInitialized()) {
                    return renderHiddenPayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) renderHiddenPayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public RenderHiddenPayload buildPartial() {
                RenderHiddenPayload renderHiddenPayload = new RenderHiddenPayload(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(renderHiddenPayload);
                }
                onBuilt();
                return renderHiddenPayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public RenderHiddenPayload getDefaultInstanceForType() {
                return RenderHiddenPayload.getDefaultInstance();
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
                if (h02 instanceof RenderHiddenPayload) {
                    return mergeFrom((RenderHiddenPayload) h02);
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
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder mergeFrom(RenderHiddenPayload renderHiddenPayload) {
                if (renderHiddenPayload == RenderHiddenPayload.getDefaultInstance()) {
                    return this;
                }
                if (renderHiddenPayload.hasMeta()) {
                    mergeMeta(renderHiddenPayload.getMeta());
                }
                mergeUnknownFields(renderHiddenPayload.getUnknownFields());
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
                                    rVar.readMessage(getMetaFieldBuilder().getBuilder(), m8);
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

        private RenderHiddenPayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(RenderHiddenPayload renderHiddenPayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(renderHiddenPayload);
        }

        public static RenderHiddenPayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (RenderHiddenPayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static RenderHiddenPayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (RenderHiddenPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static RenderHiddenPayload parseFrom(AbstractC5235o abstractC5235o) {
            return (RenderHiddenPayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public RenderHiddenPayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private RenderHiddenPayload() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RenderHiddenPayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (RenderHiddenPayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static RenderHiddenPayload parseFrom(byte[] bArr) {
            return (RenderHiddenPayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar);
        }

        public static RenderHiddenPayload parseFrom(byte[] bArr, M m8) {
            return (RenderHiddenPayload) PARSER.parseFrom(bArr, m8);
        }

        public static RenderHiddenPayload parseFrom(InputStream inputStream) {
            return (RenderHiddenPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static RenderHiddenPayload parseFrom(InputStream inputStream, M m8) {
            return (RenderHiddenPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static RenderHiddenPayload parseFrom(r rVar) {
            return (RenderHiddenPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static RenderHiddenPayload parseFrom(r rVar, M m8) {
            return (RenderHiddenPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface RenderHiddenPayloadOrBuilder extends N0 {
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

    public static final class RenderTextPayload extends AbstractC5209f0 implements RenderTextPayloadOrBuilder {
        private static final RenderTextPayload DEFAULT_INSTANCE = new RenderTextPayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.map.Payload.RenderTextPayload.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public RenderTextPayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = RenderTextPayload.newBuilder();
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
        public static final int TEXT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object text_;

        public static RenderTextPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Payload.internal_static_maum_m2u_map_RenderTextPayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RenderTextPayload parseDelimitedFrom(InputStream inputStream) {
            return (RenderTextPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RenderTextPayload parseFrom(ByteBuffer byteBuffer) {
            return (RenderTextPayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RenderTextPayload)) {
                return super.equals(obj);
            }
            RenderTextPayload renderTextPayload = (RenderTextPayload) obj;
            return getText().equals(renderTextPayload.getText()) && getUnknownFields().equals(renderTextPayload.getUnknownFields());
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
            int iComputeStringSize = (!AbstractC5209f0.isStringEmpty(this.text_) ? AbstractC5209f0.computeStringSize(1, this.text_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeStringSize;
            return iComputeStringSize;
        }

        @Override // maum.m2u.map.Payload.RenderTextPayloadOrBuilder
        public String getText() {
            Object obj = this.text_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.text_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.map.Payload.RenderTextPayloadOrBuilder
        public AbstractC5235o getTextBytes() {
            Object obj = this.text_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.text_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getText().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Payload.internal_static_maum_m2u_map_RenderTextPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(RenderTextPayload.class, Builder.class);
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
            return new RenderTextPayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.text_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.text_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        public static final class Builder extends AbstractC5209f0.b implements RenderTextPayloadOrBuilder {
            private int bitField0_;
            private Object text_;

            private void buildPartial0(RenderTextPayload renderTextPayload) {
                if ((this.bitField0_ & 1) != 0) {
                    renderTextPayload.text_ = this.text_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return Payload.internal_static_maum_m2u_map_RenderTextPayload_descriptor;
            }

            public Builder clearText() {
                this.text_ = RenderTextPayload.getDefaultInstance().getText();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Payload.internal_static_maum_m2u_map_RenderTextPayload_descriptor;
            }

            @Override // maum.m2u.map.Payload.RenderTextPayloadOrBuilder
            public String getText() {
                Object obj = this.text_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.text_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.map.Payload.RenderTextPayloadOrBuilder
            public AbstractC5235o getTextBytes() {
                Object obj = this.text_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.text_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Payload.internal_static_maum_m2u_map_RenderTextPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(RenderTextPayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder setText(String str) {
                str.getClass();
                this.text_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTextBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.text_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                this.text_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public RenderTextPayload build() {
                RenderTextPayload renderTextPayloadBuildPartial = buildPartial();
                if (renderTextPayloadBuildPartial.isInitialized()) {
                    return renderTextPayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) renderTextPayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public RenderTextPayload buildPartial() {
                RenderTextPayload renderTextPayload = new RenderTextPayload(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(renderTextPayload);
                }
                onBuilt();
                return renderTextPayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public RenderTextPayload getDefaultInstanceForType() {
                return RenderTextPayload.getDefaultInstance();
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
                this.text_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.text_ = "";
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof RenderTextPayload) {
                    return mergeFrom((RenderTextPayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder mergeFrom(RenderTextPayload renderTextPayload) {
                if (renderTextPayload == RenderTextPayload.getDefaultInstance()) {
                    return this;
                }
                if (!renderTextPayload.getText().isEmpty()) {
                    this.text_ = renderTextPayload.text_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                mergeUnknownFields(renderTextPayload.getUnknownFields());
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
                                    this.text_ = rVar.readStringRequireUtf8();
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

        private RenderTextPayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.text_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(RenderTextPayload renderTextPayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(renderTextPayload);
        }

        public static RenderTextPayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (RenderTextPayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static RenderTextPayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (RenderTextPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static RenderTextPayload parseFrom(AbstractC5235o abstractC5235o) {
            return (RenderTextPayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public RenderTextPayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static RenderTextPayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (RenderTextPayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private RenderTextPayload() {
            this.text_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.text_ = "";
        }

        public static RenderTextPayload parseFrom(byte[] bArr) {
            return (RenderTextPayload) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar);
        }

        public static RenderTextPayload parseFrom(byte[] bArr, M m8) {
            return (RenderTextPayload) PARSER.parseFrom(bArr, m8);
        }

        public static RenderTextPayload parseFrom(InputStream inputStream) {
            return (RenderTextPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static RenderTextPayload parseFrom(InputStream inputStream, M m8) {
            return (RenderTextPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static RenderTextPayload parseFrom(r rVar) {
            return (RenderTextPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static RenderTextPayload parseFrom(r rVar, M m8) {
            return (RenderTextPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface RenderTextPayloadOrBuilder extends N0 {
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

        String getText();

        AbstractC5235o getTextBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    static {
        C5269x.b bVar = getDescriptor().getMessageTypes().get(0);
        internal_static_maum_m2u_map_RenderTextPayload_descriptor = bVar;
        internal_static_maum_m2u_map_RenderTextPayload_fieldAccessorTable = new AbstractC5209f0.g(bVar, new String[]{"Text"});
        C5269x.b bVar2 = getDescriptor().getMessageTypes().get(1);
        internal_static_maum_m2u_map_RenderHiddenPayload_descriptor = bVar2;
        internal_static_maum_m2u_map_RenderHiddenPayload_fieldAccessorTable = new AbstractC5209f0.g(bVar2, new String[]{"Meta"});
        C5269x.b bVar3 = getDescriptor().getMessageTypes().get(2);
        internal_static_maum_m2u_map_ExpectSpeechPayload_descriptor = bVar3;
        internal_static_maum_m2u_map_ExpectSpeechPayload_fieldAccessorTable = new AbstractC5209f0.g(bVar3, new String[]{"TimeoutInMilliseconds"});
        AbstractC5245r1.getDescriptor();
    }

    private Payload() {
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
