package maum.m2u.common;

import B7.b;
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
import com.google.protobuf.C5247s0;
import com.google.protobuf.C5269x;
import com.google.protobuf.E1;
import com.google.protobuf.G1;
import com.google.protobuf.H0;
import com.google.protobuf.InterfaceC5204d1;
import com.google.protobuf.InterfaceC5207e1;
import com.google.protobuf.InterfaceC5243q1;
import com.google.protobuf.InterfaceC5249t0;
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
import maum.m2u.common.DeviceOuterClass;
import maum.m2u.common.LocationOuterClass;
import maum.m2u.common.UserOuterClass;

/* loaded from: classes3.dex */
public final class Dialog {
    private static C5269x.h descriptor = C5269x.h.internalBuildGeneratedFileFrom(new String[]{"\n\u001cmaum/m2u/common/dialog.proto\u0012\u000fmaum.m2u.common\u001a\u001cgoogle/protobuf/struct.proto\u001a\u0016maum/common/lang.proto\u001a\u001amaum/m2u/common/user.proto\u001a\u001cmaum/m2u/common/device.proto\u001a\u001emaum/m2u/common/location.proto\"\u0095\u0002\n\u0005Utter\u0012\r\n\u0005utter\u0018\u0001 \u0001(\t\u00124\n\ninput_type\u0018\u0002 \u0001(\u000e2 .maum.m2u.common.Utter.InputType\u0012\u001f\n\u0004lang\u0018\u0003 \u0001(\u000e2\u0011.maum.common.Lang\u0012\u0012\n\nalt_utters\u0018\u0004 \u0003(\t\u0012%\n\u0004meta\u0018e \u0001(\u000b2\u0017.google.protobuf.Struct\"k\n\tInputType\u0012\n\n\u0006SPEECH\u0010\u0000\u0012\f\n\bKEYBOARD\u0010\u0001\u0012\n\n\u0006TOUTCH\u0010\u0002\u0012\t\n\u0005IMAGE\u0010\u0003\u0012\u0012\n\u000eIMAGE_DOCUMENT\u0010\u0004\u0012\t\n\u0005VIDEO\u0010\u0005\u0012\u000e\n\nOPEN_EVENT\u0010d\"s\n\tOpenUtter\u0012\u000f\n\u0007chatbot\u0018\u0001 \u0001(\t\u0012\u001f\n\u0004lang\u0018\u0002 \u0001(\u000e2\u0011.maum.common.Lang\u0012\r\n\u0005utter\u0018\u000b \u0001(\t\u0012%\n\u0004meta\u0018e \u0001(\u000b2\u0017.google.protobuf.Struct\"`\n\u0006Speech\u0012\u001f\n\u0004lang\u0018\u0001 \u0001(\u000e2\u0011.maum.common.Lang\u0012\r\n\u0005utter\u0018\u0002 \u0001(\t\u0012\u0014\n\fspeech_utter\u0018\u0003 \u0001(\t\u0012\u0010\n\breprompt\u0018\u0004 \u0001(\b\"?\n\u0007Session\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0003\u0012(\n\u0007context\u0018\u0002 \u0001(\u000b2\u0017.google.protobuf.Struct\"\u008a\u0001\n\rSystemContext\u0012#\n\u0004user\u0018\u0001 \u0001(\u000b2\u0015.maum.m2u.common.User\u0012'\n\u0006device\u0018\u0002 \u0001(\u000b2\u0017.maum.m2u.common.Device\u0012+\n\blocation\u0018\u0003 \u0001(\u000b2\u0019.maum.m2u.common.Locationb\u0006proto3"}, new C5269x.h[]{AbstractC5245r1.getDescriptor(), b.getDescriptor(), UserOuterClass.getDescriptor(), DeviceOuterClass.getDescriptor(), LocationOuterClass.getDescriptor()});
    private static final C5269x.b internal_static_maum_m2u_common_OpenUtter_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_OpenUtter_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_Session_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_Session_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_Speech_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_Speech_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_SystemContext_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_SystemContext_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_Utter_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_Utter_fieldAccessorTable;

    public static final class OpenUtter extends AbstractC5209f0 implements OpenUtterOrBuilder {
        public static final int CHATBOT_FIELD_NUMBER = 1;
        public static final int LANG_FIELD_NUMBER = 2;
        public static final int META_FIELD_NUMBER = 101;
        public static final int UTTER_FIELD_NUMBER = 11;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object chatbot_;
        private int lang_;
        private byte memoizedIsInitialized;
        private C5240p1 meta_;
        private volatile Object utter_;
        private static final OpenUtter DEFAULT_INSTANCE = new OpenUtter();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.Dialog.OpenUtter.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public OpenUtter parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = OpenUtter.newBuilder();
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

        static /* synthetic */ int access$2476(OpenUtter openUtter, int i8) {
            int i9 = i8 | openUtter.bitField0_;
            openUtter.bitField0_ = i9;
            return i9;
        }

        public static OpenUtter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Dialog.internal_static_maum_m2u_common_OpenUtter_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OpenUtter parseDelimitedFrom(InputStream inputStream) {
            return (OpenUtter) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static OpenUtter parseFrom(ByteBuffer byteBuffer) {
            return (OpenUtter) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OpenUtter)) {
                return super.equals(obj);
            }
            OpenUtter openUtter = (OpenUtter) obj;
            if (getChatbot().equals(openUtter.getChatbot()) && this.lang_ == openUtter.lang_ && getUtter().equals(openUtter.getUtter()) && hasMeta() == openUtter.hasMeta()) {
                return (!hasMeta() || getMeta().equals(openUtter.getMeta())) && getUnknownFields().equals(openUtter.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.Dialog.OpenUtterOrBuilder
        public String getChatbot() {
            Object obj = this.chatbot_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.chatbot_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.Dialog.OpenUtterOrBuilder
        public AbstractC5235o getChatbotBytes() {
            Object obj = this.chatbot_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.chatbot_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.Dialog.OpenUtterOrBuilder
        public b.a getLang() {
            b.a aVarForNumber = b.a.forNumber(this.lang_);
            return aVarForNumber == null ? b.a.UNRECOGNIZED : aVarForNumber;
        }

        @Override // maum.m2u.common.Dialog.OpenUtterOrBuilder
        public int getLangValue() {
            return this.lang_;
        }

        @Override // maum.m2u.common.Dialog.OpenUtterOrBuilder
        public C5240p1 getMeta() {
            C5240p1 c5240p1 = this.meta_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.common.Dialog.OpenUtterOrBuilder
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
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.chatbot_) ? AbstractC5209f0.computeStringSize(1, this.chatbot_) : 0;
            if (this.lang_ != b.a.ko_KR.getNumber()) {
                iComputeStringSize += AbstractC5248t.computeEnumSize(2, this.lang_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.utter_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(11, this.utter_);
            }
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(101, getMeta());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.Dialog.OpenUtterOrBuilder
        public String getUtter() {
            Object obj = this.utter_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.utter_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.Dialog.OpenUtterOrBuilder
        public AbstractC5235o getUtterBytes() {
            Object obj = this.utter_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.utter_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.Dialog.OpenUtterOrBuilder
        public boolean hasMeta() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getChatbot().hashCode()) * 37) + 2) * 53) + this.lang_) * 37) + 11) * 53) + getUtter().hashCode();
            if (hasMeta()) {
                iHashCode = (((iHashCode * 37) + 101) * 53) + getMeta().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Dialog.internal_static_maum_m2u_common_OpenUtter_fieldAccessorTable.ensureFieldAccessorsInitialized(OpenUtter.class, Builder.class);
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
            return new OpenUtter();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.chatbot_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.chatbot_);
            }
            if (this.lang_ != b.a.ko_KR.getNumber()) {
                abstractC5248t.writeEnum(2, this.lang_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.utter_)) {
                AbstractC5209f0.writeString(abstractC5248t, 11, this.utter_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(101, getMeta());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        public static final class Builder extends AbstractC5209f0.b implements OpenUtterOrBuilder {
            private int bitField0_;
            private Object chatbot_;
            private int lang_;
            private C5228l1 metaBuilder_;
            private C5240p1 meta_;
            private Object utter_;

            private void buildPartial0(OpenUtter openUtter) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    openUtter.chatbot_ = this.chatbot_;
                }
                if ((i9 & 2) != 0) {
                    openUtter.lang_ = this.lang_;
                }
                if ((i9 & 4) != 0) {
                    openUtter.utter_ = this.utter_;
                }
                if ((i9 & 8) != 0) {
                    C5228l1 c5228l1 = this.metaBuilder_;
                    openUtter.meta_ = c5228l1 == null ? this.meta_ : (C5240p1) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                OpenUtter.access$2476(openUtter, i8);
            }

            public static final C5269x.b getDescriptor() {
                return Dialog.internal_static_maum_m2u_common_OpenUtter_descriptor;
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

            public Builder clearChatbot() {
                this.chatbot_ = OpenUtter.getDefaultInstance().getChatbot();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearLang() {
                this.bitField0_ &= -3;
                this.lang_ = 0;
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

            public Builder clearUtter() {
                this.utter_ = OpenUtter.getDefaultInstance().getUtter();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // maum.m2u.common.Dialog.OpenUtterOrBuilder
            public String getChatbot() {
                Object obj = this.chatbot_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.chatbot_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.Dialog.OpenUtterOrBuilder
            public AbstractC5235o getChatbotBytes() {
                Object obj = this.chatbot_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.chatbot_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Dialog.internal_static_maum_m2u_common_OpenUtter_descriptor;
            }

            @Override // maum.m2u.common.Dialog.OpenUtterOrBuilder
            public b.a getLang() {
                b.a aVarForNumber = b.a.forNumber(this.lang_);
                return aVarForNumber == null ? b.a.UNRECOGNIZED : aVarForNumber;
            }

            @Override // maum.m2u.common.Dialog.OpenUtterOrBuilder
            public int getLangValue() {
                return this.lang_;
            }

            @Override // maum.m2u.common.Dialog.OpenUtterOrBuilder
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

            @Override // maum.m2u.common.Dialog.OpenUtterOrBuilder
            public InterfaceC5243q1 getMetaOrBuilder() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                }
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.common.Dialog.OpenUtterOrBuilder
            public String getUtter() {
                Object obj = this.utter_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.utter_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.Dialog.OpenUtterOrBuilder
            public AbstractC5235o getUtterBytes() {
                Object obj = this.utter_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.utter_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.Dialog.OpenUtterOrBuilder
            public boolean hasMeta() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Dialog.internal_static_maum_m2u_common_OpenUtter_fieldAccessorTable.ensureFieldAccessorsInitialized(OpenUtter.class, Builder.class);
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

            public Builder setChatbot(String str) {
                str.getClass();
                this.chatbot_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setChatbotBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.chatbot_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLang(b.a aVar) {
                aVar.getClass();
                this.bitField0_ |= 2;
                this.lang_ = aVar.getNumber();
                onChanged();
                return this;
            }

            public Builder setLangValue(int i8) {
                this.lang_ = i8;
                this.bitField0_ |= 2;
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

            public Builder setUtter(String str) {
                str.getClass();
                this.utter_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setUtterBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.utter_ = abstractC5235o;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            private Builder() {
                this.chatbot_ = "";
                this.lang_ = 0;
                this.utter_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public OpenUtter build() {
                OpenUtter openUtterBuildPartial = buildPartial();
                if (openUtterBuildPartial.isInitialized()) {
                    return openUtterBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) openUtterBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public OpenUtter buildPartial() {
                OpenUtter openUtter = new OpenUtter(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(openUtter);
                }
                onBuilt();
                return openUtter;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public OpenUtter getDefaultInstanceForType() {
                return OpenUtter.getDefaultInstance();
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
                this.chatbot_ = "";
                this.lang_ = 0;
                this.utter_ = "";
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
                if (h02 instanceof OpenUtter) {
                    return mergeFrom((OpenUtter) h02);
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
                this.chatbot_ = "";
                this.lang_ = 0;
                this.utter_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(OpenUtter openUtter) {
                if (openUtter == OpenUtter.getDefaultInstance()) {
                    return this;
                }
                if (!openUtter.getChatbot().isEmpty()) {
                    this.chatbot_ = openUtter.chatbot_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (openUtter.lang_ != 0) {
                    setLangValue(openUtter.getLangValue());
                }
                if (!openUtter.getUtter().isEmpty()) {
                    this.utter_ = openUtter.utter_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (openUtter.hasMeta()) {
                    mergeMeta(openUtter.getMeta());
                }
                mergeUnknownFields(openUtter.getUnknownFields());
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
                                    this.chatbot_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.lang_ = rVar.readEnum();
                                    this.bitField0_ |= 2;
                                } else if (tag == 90) {
                                    this.utter_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                } else if (tag != 810) {
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

        private OpenUtter(AbstractC5209f0.b bVar) {
            super(bVar);
            this.chatbot_ = "";
            this.lang_ = 0;
            this.utter_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(OpenUtter openUtter) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(openUtter);
        }

        public static OpenUtter parseFrom(ByteBuffer byteBuffer, M m8) {
            return (OpenUtter) PARSER.parseFrom(byteBuffer, m8);
        }

        public static OpenUtter parseDelimitedFrom(InputStream inputStream, M m8) {
            return (OpenUtter) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static OpenUtter parseFrom(AbstractC5235o abstractC5235o) {
            return (OpenUtter) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public OpenUtter getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static OpenUtter parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (OpenUtter) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static OpenUtter parseFrom(byte[] bArr) {
            return (OpenUtter) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar);
        }

        public static OpenUtter parseFrom(byte[] bArr, M m8) {
            return (OpenUtter) PARSER.parseFrom(bArr, m8);
        }

        private OpenUtter() {
            this.chatbot_ = "";
            this.lang_ = 0;
            this.utter_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.chatbot_ = "";
            this.lang_ = 0;
            this.utter_ = "";
        }

        public static OpenUtter parseFrom(InputStream inputStream) {
            return (OpenUtter) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static OpenUtter parseFrom(InputStream inputStream, M m8) {
            return (OpenUtter) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static OpenUtter parseFrom(r rVar) {
            return (OpenUtter) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static OpenUtter parseFrom(r rVar, M m8) {
            return (OpenUtter) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface OpenUtterOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        String getChatbot();

        AbstractC5235o getChatbotBytes();

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

        b.a getLang();

        int getLangValue();

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

        String getUtter();

        AbstractC5235o getUtterBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        boolean hasMeta();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class Session extends AbstractC5209f0 implements SessionOrBuilder {
        public static final int CONTEXT_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private C5240p1 context_;
        private long id_;
        private byte memoizedIsInitialized;
        private static final Session DEFAULT_INSTANCE = new Session();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.Dialog.Session.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public Session parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = Session.newBuilder();
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

        static /* synthetic */ int access$4676(Session session, int i8) {
            int i9 = i8 | session.bitField0_;
            session.bitField0_ = i9;
            return i9;
        }

        public static Session getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Dialog.internal_static_maum_m2u_common_Session_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Session parseDelimitedFrom(InputStream inputStream) {
            return (Session) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Session parseFrom(ByteBuffer byteBuffer) {
            return (Session) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Session)) {
                return super.equals(obj);
            }
            Session session = (Session) obj;
            if (getId() == session.getId() && hasContext() == session.hasContext()) {
                return (!hasContext() || getContext().equals(session.getContext())) && getUnknownFields().equals(session.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.Dialog.SessionOrBuilder
        public C5240p1 getContext() {
            C5240p1 c5240p1 = this.context_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.common.Dialog.SessionOrBuilder
        public InterfaceC5243q1 getContextOrBuilder() {
            C5240p1 c5240p1 = this.context_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.common.Dialog.SessionOrBuilder
        public long getId() {
            return this.id_;
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
            long j8 = this.id_;
            int iComputeInt64Size = j8 != 0 ? AbstractC5248t.computeInt64Size(1, j8) : 0;
            if ((this.bitField0_ & 1) != 0) {
                iComputeInt64Size += AbstractC5248t.computeMessageSize(2, getContext());
            }
            int serializedSize = iComputeInt64Size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.Dialog.SessionOrBuilder
        public boolean hasContext() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + AbstractC5227l0.hashLong(getId());
            if (hasContext()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getContext().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Dialog.internal_static_maum_m2u_common_Session_fieldAccessorTable.ensureFieldAccessorsInitialized(Session.class, Builder.class);
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
            return new Session();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            long j8 = this.id_;
            if (j8 != 0) {
                abstractC5248t.writeInt64(1, j8);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(2, getContext());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        public static final class Builder extends AbstractC5209f0.b implements SessionOrBuilder {
            private int bitField0_;
            private C5228l1 contextBuilder_;
            private C5240p1 context_;
            private long id_;

            private void buildPartial0(Session session) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    session.id_ = this.id_;
                }
                if ((i9 & 2) != 0) {
                    C5228l1 c5228l1 = this.contextBuilder_;
                    session.context_ = c5228l1 == null ? this.context_ : (C5240p1) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                Session.access$4676(session, i8);
            }

            private C5228l1 getContextFieldBuilder() {
                if (this.contextBuilder_ == null) {
                    this.contextBuilder_ = new C5228l1(getContext(), getParentForChildren(), isClean());
                    this.context_ = null;
                }
                return this.contextBuilder_;
            }

            public static final C5269x.b getDescriptor() {
                return Dialog.internal_static_maum_m2u_common_Session_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getContextFieldBuilder();
                }
            }

            public Builder clearContext() {
                this.bitField0_ &= -3;
                this.context_ = null;
                C5228l1 c5228l1 = this.contextBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.contextBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0L;
                onChanged();
                return this;
            }

            @Override // maum.m2u.common.Dialog.SessionOrBuilder
            public C5240p1 getContext() {
                C5228l1 c5228l1 = this.contextBuilder_;
                if (c5228l1 != null) {
                    return (C5240p1) c5228l1.getMessage();
                }
                C5240p1 c5240p1 = this.context_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            public C5240p1.b getContextBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (C5240p1.b) getContextFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.Dialog.SessionOrBuilder
            public InterfaceC5243q1 getContextOrBuilder() {
                C5228l1 c5228l1 = this.contextBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                }
                C5240p1 c5240p1 = this.context_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Dialog.internal_static_maum_m2u_common_Session_descriptor;
            }

            @Override // maum.m2u.common.Dialog.SessionOrBuilder
            public long getId() {
                return this.id_;
            }

            @Override // maum.m2u.common.Dialog.SessionOrBuilder
            public boolean hasContext() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Dialog.internal_static_maum_m2u_common_Session_fieldAccessorTable.ensureFieldAccessorsInitialized(Session.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeContext(C5240p1 c5240p1) {
                C5240p1 c5240p12;
                C5228l1 c5228l1 = this.contextBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(c5240p1);
                } else if ((this.bitField0_ & 2) == 0 || (c5240p12 = this.context_) == null || c5240p12 == C5240p1.getDefaultInstance()) {
                    this.context_ = c5240p1;
                } else {
                    getContextBuilder().mergeFrom(c5240p1);
                }
                if (this.context_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder setContext(C5240p1 c5240p1) {
                C5228l1 c5228l1 = this.contextBuilder_;
                if (c5228l1 == null) {
                    c5240p1.getClass();
                    this.context_ = c5240p1;
                } else {
                    c5228l1.setMessage(c5240p1);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setId(long j8) {
                this.id_ = j8;
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
            public Session build() {
                Session sessionBuildPartial = buildPartial();
                if (sessionBuildPartial.isInitialized()) {
                    return sessionBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) sessionBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Session buildPartial() {
                Session session = new Session(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(session);
                }
                onBuilt();
                return session;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public Session getDefaultInstanceForType() {
                return Session.getDefaultInstance();
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
                this.id_ = 0L;
                this.context_ = null;
                C5228l1 c5228l1 = this.contextBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.contextBuilder_ = null;
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
                if (h02 instanceof Session) {
                    return mergeFrom((Session) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setContext(C5240p1.b bVar) {
                C5228l1 c5228l1 = this.contextBuilder_;
                if (c5228l1 == null) {
                    this.context_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFrom(Session session) {
                if (session == Session.getDefaultInstance()) {
                    return this;
                }
                if (session.getId() != 0) {
                    setId(session.getId());
                }
                if (session.hasContext()) {
                    mergeContext(session.getContext());
                }
                mergeUnknownFields(session.getUnknownFields());
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
                                    this.id_ = rVar.readInt64();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getContextFieldBuilder().getBuilder(), m8);
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

        private Session(AbstractC5209f0.b bVar) {
            super(bVar);
            this.id_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(Session session) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(session);
        }

        public static Session parseFrom(ByteBuffer byteBuffer, M m8) {
            return (Session) PARSER.parseFrom(byteBuffer, m8);
        }

        public static Session parseDelimitedFrom(InputStream inputStream, M m8) {
            return (Session) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static Session parseFrom(AbstractC5235o abstractC5235o) {
            return (Session) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public Session getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Session parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (Session) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Session() {
            this.id_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Session parseFrom(byte[] bArr) {
            return (Session) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar);
        }

        public static Session parseFrom(byte[] bArr, M m8) {
            return (Session) PARSER.parseFrom(bArr, m8);
        }

        public static Session parseFrom(InputStream inputStream) {
            return (Session) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static Session parseFrom(InputStream inputStream, M m8) {
            return (Session) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static Session parseFrom(r rVar) {
            return (Session) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static Session parseFrom(r rVar, M m8) {
            return (Session) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface SessionOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        C5240p1 getContext();

        InterfaceC5243q1 getContextOrBuilder();

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

        long getId();

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

        boolean hasContext();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class Speech extends AbstractC5209f0 implements SpeechOrBuilder {
        public static final int LANG_FIELD_NUMBER = 1;
        public static final int REPROMPT_FIELD_NUMBER = 4;
        public static final int SPEECH_UTTER_FIELD_NUMBER = 3;
        public static final int UTTER_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int lang_;
        private byte memoizedIsInitialized;
        private boolean reprompt_;
        private volatile Object speechUtter_;
        private volatile Object utter_;
        private static final Speech DEFAULT_INSTANCE = new Speech();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.Dialog.Speech.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public Speech parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = Speech.newBuilder();
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

        public static Speech getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Dialog.internal_static_maum_m2u_common_Speech_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Speech parseDelimitedFrom(InputStream inputStream) {
            return (Speech) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Speech parseFrom(ByteBuffer byteBuffer) {
            return (Speech) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Speech)) {
                return super.equals(obj);
            }
            Speech speech = (Speech) obj;
            return this.lang_ == speech.lang_ && getUtter().equals(speech.getUtter()) && getSpeechUtter().equals(speech.getSpeechUtter()) && getReprompt() == speech.getReprompt() && getUnknownFields().equals(speech.getUnknownFields());
        }

        @Override // maum.m2u.common.Dialog.SpeechOrBuilder
        public b.a getLang() {
            b.a aVarForNumber = b.a.forNumber(this.lang_);
            return aVarForNumber == null ? b.a.UNRECOGNIZED : aVarForNumber;
        }

        @Override // maum.m2u.common.Dialog.SpeechOrBuilder
        public int getLangValue() {
            return this.lang_;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.common.Dialog.SpeechOrBuilder
        public boolean getReprompt() {
            return this.reprompt_;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeEnumSize = this.lang_ != b.a.ko_KR.getNumber() ? AbstractC5248t.computeEnumSize(1, this.lang_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.utter_)) {
                iComputeEnumSize += AbstractC5209f0.computeStringSize(2, this.utter_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.speechUtter_)) {
                iComputeEnumSize += AbstractC5209f0.computeStringSize(3, this.speechUtter_);
            }
            boolean z8 = this.reprompt_;
            if (z8) {
                iComputeEnumSize += AbstractC5248t.computeBoolSize(4, z8);
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.Dialog.SpeechOrBuilder
        public String getSpeechUtter() {
            Object obj = this.speechUtter_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.speechUtter_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.Dialog.SpeechOrBuilder
        public AbstractC5235o getSpeechUtterBytes() {
            Object obj = this.speechUtter_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.speechUtter_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.Dialog.SpeechOrBuilder
        public String getUtter() {
            Object obj = this.utter_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.utter_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.Dialog.SpeechOrBuilder
        public AbstractC5235o getUtterBytes() {
            Object obj = this.utter_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.utter_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.lang_) * 37) + 2) * 53) + getUtter().hashCode()) * 37) + 3) * 53) + getSpeechUtter().hashCode()) * 37) + 4) * 53) + AbstractC5227l0.hashBoolean(getReprompt())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Dialog.internal_static_maum_m2u_common_Speech_fieldAccessorTable.ensureFieldAccessorsInitialized(Speech.class, Builder.class);
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
            return new Speech();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (this.lang_ != b.a.ko_KR.getNumber()) {
                abstractC5248t.writeEnum(1, this.lang_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.utter_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.utter_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.speechUtter_)) {
                AbstractC5209f0.writeString(abstractC5248t, 3, this.speechUtter_);
            }
            boolean z8 = this.reprompt_;
            if (z8) {
                abstractC5248t.writeBool(4, z8);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        public static final class Builder extends AbstractC5209f0.b implements SpeechOrBuilder {
            private int bitField0_;
            private int lang_;
            private boolean reprompt_;
            private Object speechUtter_;
            private Object utter_;

            private void buildPartial0(Speech speech) {
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    speech.lang_ = this.lang_;
                }
                if ((i8 & 2) != 0) {
                    speech.utter_ = this.utter_;
                }
                if ((i8 & 4) != 0) {
                    speech.speechUtter_ = this.speechUtter_;
                }
                if ((i8 & 8) != 0) {
                    speech.reprompt_ = this.reprompt_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return Dialog.internal_static_maum_m2u_common_Speech_descriptor;
            }

            public Builder clearLang() {
                this.bitField0_ &= -2;
                this.lang_ = 0;
                onChanged();
                return this;
            }

            public Builder clearReprompt() {
                this.bitField0_ &= -9;
                this.reprompt_ = false;
                onChanged();
                return this;
            }

            public Builder clearSpeechUtter() {
                this.speechUtter_ = Speech.getDefaultInstance().getSpeechUtter();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearUtter() {
                this.utter_ = Speech.getDefaultInstance().getUtter();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Dialog.internal_static_maum_m2u_common_Speech_descriptor;
            }

            @Override // maum.m2u.common.Dialog.SpeechOrBuilder
            public b.a getLang() {
                b.a aVarForNumber = b.a.forNumber(this.lang_);
                return aVarForNumber == null ? b.a.UNRECOGNIZED : aVarForNumber;
            }

            @Override // maum.m2u.common.Dialog.SpeechOrBuilder
            public int getLangValue() {
                return this.lang_;
            }

            @Override // maum.m2u.common.Dialog.SpeechOrBuilder
            public boolean getReprompt() {
                return this.reprompt_;
            }

            @Override // maum.m2u.common.Dialog.SpeechOrBuilder
            public String getSpeechUtter() {
                Object obj = this.speechUtter_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.speechUtter_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.Dialog.SpeechOrBuilder
            public AbstractC5235o getSpeechUtterBytes() {
                Object obj = this.speechUtter_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.speechUtter_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.Dialog.SpeechOrBuilder
            public String getUtter() {
                Object obj = this.utter_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.utter_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.Dialog.SpeechOrBuilder
            public AbstractC5235o getUtterBytes() {
                Object obj = this.utter_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.utter_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Dialog.internal_static_maum_m2u_common_Speech_fieldAccessorTable.ensureFieldAccessorsInitialized(Speech.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder setLang(b.a aVar) {
                aVar.getClass();
                this.bitField0_ |= 1;
                this.lang_ = aVar.getNumber();
                onChanged();
                return this;
            }

            public Builder setLangValue(int i8) {
                this.lang_ = i8;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setReprompt(boolean z8) {
                this.reprompt_ = z8;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSpeechUtter(String str) {
                str.getClass();
                this.speechUtter_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSpeechUtterBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.speechUtter_ = abstractC5235o;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setUtter(String str) {
                str.getClass();
                this.utter_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUtterBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.utter_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            private Builder() {
                this.lang_ = 0;
                this.utter_ = "";
                this.speechUtter_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Speech build() {
                Speech speechBuildPartial = buildPartial();
                if (speechBuildPartial.isInitialized()) {
                    return speechBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) speechBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Speech buildPartial() {
                Speech speech = new Speech(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(speech);
                }
                onBuilt();
                return speech;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public Speech getDefaultInstanceForType() {
                return Speech.getDefaultInstance();
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
                this.lang_ = 0;
                this.utter_ = "";
                this.speechUtter_ = "";
                this.reprompt_ = false;
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.lang_ = 0;
                this.utter_ = "";
                this.speechUtter_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof Speech) {
                    return mergeFrom((Speech) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder mergeFrom(Speech speech) {
                if (speech == Speech.getDefaultInstance()) {
                    return this;
                }
                if (speech.lang_ != 0) {
                    setLangValue(speech.getLangValue());
                }
                if (!speech.getUtter().isEmpty()) {
                    this.utter_ = speech.utter_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!speech.getSpeechUtter().isEmpty()) {
                    this.speechUtter_ = speech.speechUtter_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (speech.getReprompt()) {
                    setReprompt(speech.getReprompt());
                }
                mergeUnknownFields(speech.getUnknownFields());
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
                                    this.lang_ = rVar.readEnum();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.utter_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.speechUtter_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                } else if (tag != 32) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.reprompt_ = rVar.readBool();
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

        private Speech(AbstractC5209f0.b bVar) {
            super(bVar);
            this.lang_ = 0;
            this.utter_ = "";
            this.speechUtter_ = "";
            this.reprompt_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(Speech speech) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(speech);
        }

        public static Speech parseFrom(ByteBuffer byteBuffer, M m8) {
            return (Speech) PARSER.parseFrom(byteBuffer, m8);
        }

        public static Speech parseDelimitedFrom(InputStream inputStream, M m8) {
            return (Speech) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static Speech parseFrom(AbstractC5235o abstractC5235o) {
            return (Speech) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public Speech getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Speech parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (Speech) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Speech parseFrom(byte[] bArr) {
            return (Speech) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar);
        }

        public static Speech parseFrom(byte[] bArr, M m8) {
            return (Speech) PARSER.parseFrom(bArr, m8);
        }

        public static Speech parseFrom(InputStream inputStream) {
            return (Speech) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        private Speech() {
            this.lang_ = 0;
            this.utter_ = "";
            this.speechUtter_ = "";
            this.reprompt_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.lang_ = 0;
            this.utter_ = "";
            this.speechUtter_ = "";
        }

        public static Speech parseFrom(InputStream inputStream, M m8) {
            return (Speech) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static Speech parseFrom(r rVar) {
            return (Speech) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static Speech parseFrom(r rVar, M m8) {
            return (Speech) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface SpeechOrBuilder extends N0 {
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

        b.a getLang();

        int getLangValue();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        boolean getReprompt();

        String getSpeechUtter();

        AbstractC5235o getSpeechUtterBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        String getUtter();

        AbstractC5235o getUtterBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class SystemContext extends AbstractC5209f0 implements SystemContextOrBuilder {
        public static final int DEVICE_FIELD_NUMBER = 2;
        public static final int LOCATION_FIELD_NUMBER = 3;
        public static final int USER_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DeviceOuterClass.Device device_;
        private LocationOuterClass.Location location_;
        private byte memoizedIsInitialized;
        private UserOuterClass.User user_;
        private static final SystemContext DEFAULT_INSTANCE = new SystemContext();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.Dialog.SystemContext.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public SystemContext parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = SystemContext.newBuilder();
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

        static /* synthetic */ int access$5676(SystemContext systemContext, int i8) {
            int i9 = i8 | systemContext.bitField0_;
            systemContext.bitField0_ = i9;
            return i9;
        }

        public static SystemContext getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Dialog.internal_static_maum_m2u_common_SystemContext_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SystemContext parseDelimitedFrom(InputStream inputStream) {
            return (SystemContext) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SystemContext parseFrom(ByteBuffer byteBuffer) {
            return (SystemContext) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SystemContext)) {
                return super.equals(obj);
            }
            SystemContext systemContext = (SystemContext) obj;
            if (hasUser() != systemContext.hasUser()) {
                return false;
            }
            if ((hasUser() && !getUser().equals(systemContext.getUser())) || hasDevice() != systemContext.hasDevice()) {
                return false;
            }
            if ((!hasDevice() || getDevice().equals(systemContext.getDevice())) && hasLocation() == systemContext.hasLocation()) {
                return (!hasLocation() || getLocation().equals(systemContext.getLocation())) && getUnknownFields().equals(systemContext.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.Dialog.SystemContextOrBuilder
        public DeviceOuterClass.Device getDevice() {
            DeviceOuterClass.Device device = this.device_;
            return device == null ? DeviceOuterClass.Device.getDefaultInstance() : device;
        }

        @Override // maum.m2u.common.Dialog.SystemContextOrBuilder
        public DeviceOuterClass.DeviceOrBuilder getDeviceOrBuilder() {
            DeviceOuterClass.Device device = this.device_;
            return device == null ? DeviceOuterClass.Device.getDefaultInstance() : device;
        }

        @Override // maum.m2u.common.Dialog.SystemContextOrBuilder
        public LocationOuterClass.Location getLocation() {
            LocationOuterClass.Location location = this.location_;
            return location == null ? LocationOuterClass.Location.getDefaultInstance() : location;
        }

        @Override // maum.m2u.common.Dialog.SystemContextOrBuilder
        public LocationOuterClass.LocationOrBuilder getLocationOrBuilder() {
            LocationOuterClass.Location location = this.location_;
            return location == null ? LocationOuterClass.Location.getDefaultInstance() : location;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? AbstractC5248t.computeMessageSize(1, getUser()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(2, getDevice());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(3, getLocation());
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.Dialog.SystemContextOrBuilder
        public UserOuterClass.User getUser() {
            UserOuterClass.User user = this.user_;
            return user == null ? UserOuterClass.User.getDefaultInstance() : user;
        }

        @Override // maum.m2u.common.Dialog.SystemContextOrBuilder
        public UserOuterClass.UserOrBuilder getUserOrBuilder() {
            UserOuterClass.User user = this.user_;
            return user == null ? UserOuterClass.User.getDefaultInstance() : user;
        }

        @Override // maum.m2u.common.Dialog.SystemContextOrBuilder
        public boolean hasDevice() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // maum.m2u.common.Dialog.SystemContextOrBuilder
        public boolean hasLocation() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // maum.m2u.common.Dialog.SystemContextOrBuilder
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
            if (hasDevice()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getDevice().hashCode();
            }
            if (hasLocation()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getLocation().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Dialog.internal_static_maum_m2u_common_SystemContext_fieldAccessorTable.ensureFieldAccessorsInitialized(SystemContext.class, Builder.class);
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
            return new SystemContext();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(1, getUser());
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC5248t.writeMessage(2, getDevice());
            }
            if ((this.bitField0_ & 4) != 0) {
                abstractC5248t.writeMessage(3, getLocation());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        public static final class Builder extends AbstractC5209f0.b implements SystemContextOrBuilder {
            private int bitField0_;
            private C5228l1 deviceBuilder_;
            private DeviceOuterClass.Device device_;
            private C5228l1 locationBuilder_;
            private LocationOuterClass.Location location_;
            private C5228l1 userBuilder_;
            private UserOuterClass.User user_;

            private void buildPartial0(SystemContext systemContext) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    C5228l1 c5228l1 = this.userBuilder_;
                    systemContext.user_ = c5228l1 == null ? this.user_ : (UserOuterClass.User) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if ((i9 & 2) != 0) {
                    C5228l1 c5228l12 = this.deviceBuilder_;
                    systemContext.device_ = c5228l12 == null ? this.device_ : (DeviceOuterClass.Device) c5228l12.build();
                    i8 |= 2;
                }
                if ((i9 & 4) != 0) {
                    C5228l1 c5228l13 = this.locationBuilder_;
                    systemContext.location_ = c5228l13 == null ? this.location_ : (LocationOuterClass.Location) c5228l13.build();
                    i8 |= 4;
                }
                SystemContext.access$5676(systemContext, i8);
            }

            public static final C5269x.b getDescriptor() {
                return Dialog.internal_static_maum_m2u_common_SystemContext_descriptor;
            }

            private C5228l1 getDeviceFieldBuilder() {
                if (this.deviceBuilder_ == null) {
                    this.deviceBuilder_ = new C5228l1(getDevice(), getParentForChildren(), isClean());
                    this.device_ = null;
                }
                return this.deviceBuilder_;
            }

            private C5228l1 getLocationFieldBuilder() {
                if (this.locationBuilder_ == null) {
                    this.locationBuilder_ = new C5228l1(getLocation(), getParentForChildren(), isClean());
                    this.location_ = null;
                }
                return this.locationBuilder_;
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
                    getDeviceFieldBuilder();
                    getLocationFieldBuilder();
                }
            }

            public Builder clearDevice() {
                this.bitField0_ &= -3;
                this.device_ = null;
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.deviceBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLocation() {
                this.bitField0_ &= -5;
                this.location_ = null;
                C5228l1 c5228l1 = this.locationBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.locationBuilder_ = null;
                }
                onChanged();
                return this;
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
                return Dialog.internal_static_maum_m2u_common_SystemContext_descriptor;
            }

            @Override // maum.m2u.common.Dialog.SystemContextOrBuilder
            public DeviceOuterClass.Device getDevice() {
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 != null) {
                    return (DeviceOuterClass.Device) c5228l1.getMessage();
                }
                DeviceOuterClass.Device device = this.device_;
                return device == null ? DeviceOuterClass.Device.getDefaultInstance() : device;
            }

            public DeviceOuterClass.Device.Builder getDeviceBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DeviceOuterClass.Device.Builder) getDeviceFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.Dialog.SystemContextOrBuilder
            public DeviceOuterClass.DeviceOrBuilder getDeviceOrBuilder() {
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 != null) {
                    return (DeviceOuterClass.DeviceOrBuilder) c5228l1.getMessageOrBuilder();
                }
                DeviceOuterClass.Device device = this.device_;
                return device == null ? DeviceOuterClass.Device.getDefaultInstance() : device;
            }

            @Override // maum.m2u.common.Dialog.SystemContextOrBuilder
            public LocationOuterClass.Location getLocation() {
                C5228l1 c5228l1 = this.locationBuilder_;
                if (c5228l1 != null) {
                    return (LocationOuterClass.Location) c5228l1.getMessage();
                }
                LocationOuterClass.Location location = this.location_;
                return location == null ? LocationOuterClass.Location.getDefaultInstance() : location;
            }

            public LocationOuterClass.Location.Builder getLocationBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (LocationOuterClass.Location.Builder) getLocationFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.Dialog.SystemContextOrBuilder
            public LocationOuterClass.LocationOrBuilder getLocationOrBuilder() {
                C5228l1 c5228l1 = this.locationBuilder_;
                if (c5228l1 != null) {
                    return (LocationOuterClass.LocationOrBuilder) c5228l1.getMessageOrBuilder();
                }
                LocationOuterClass.Location location = this.location_;
                return location == null ? LocationOuterClass.Location.getDefaultInstance() : location;
            }

            @Override // maum.m2u.common.Dialog.SystemContextOrBuilder
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

            @Override // maum.m2u.common.Dialog.SystemContextOrBuilder
            public UserOuterClass.UserOrBuilder getUserOrBuilder() {
                C5228l1 c5228l1 = this.userBuilder_;
                if (c5228l1 != null) {
                    return (UserOuterClass.UserOrBuilder) c5228l1.getMessageOrBuilder();
                }
                UserOuterClass.User user = this.user_;
                return user == null ? UserOuterClass.User.getDefaultInstance() : user;
            }

            @Override // maum.m2u.common.Dialog.SystemContextOrBuilder
            public boolean hasDevice() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // maum.m2u.common.Dialog.SystemContextOrBuilder
            public boolean hasLocation() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // maum.m2u.common.Dialog.SystemContextOrBuilder
            public boolean hasUser() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Dialog.internal_static_maum_m2u_common_SystemContext_fieldAccessorTable.ensureFieldAccessorsInitialized(SystemContext.class, Builder.class);
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
                } else if ((this.bitField0_ & 2) == 0 || (device2 = this.device_) == null || device2 == DeviceOuterClass.Device.getDefaultInstance()) {
                    this.device_ = device;
                } else {
                    getDeviceBuilder().mergeFrom(device);
                }
                if (this.device_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeLocation(LocationOuterClass.Location location) {
                LocationOuterClass.Location location2;
                C5228l1 c5228l1 = this.locationBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(location);
                } else if ((this.bitField0_ & 4) == 0 || (location2 = this.location_) == null || location2 == LocationOuterClass.Location.getDefaultInstance()) {
                    this.location_ = location;
                } else {
                    getLocationBuilder().mergeFrom(location);
                }
                if (this.location_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
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

            public Builder setDevice(DeviceOuterClass.Device device) {
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 == null) {
                    device.getClass();
                    this.device_ = device;
                } else {
                    c5228l1.setMessage(device);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setLocation(LocationOuterClass.Location location) {
                C5228l1 c5228l1 = this.locationBuilder_;
                if (c5228l1 == null) {
                    location.getClass();
                    this.location_ = location;
                } else {
                    c5228l1.setMessage(location);
                }
                this.bitField0_ |= 4;
                onChanged();
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

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public SystemContext build() {
                SystemContext systemContextBuildPartial = buildPartial();
                if (systemContextBuildPartial.isInitialized()) {
                    return systemContextBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) systemContextBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public SystemContext buildPartial() {
                SystemContext systemContext = new SystemContext(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(systemContext);
                }
                onBuilt();
                return systemContext;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public SystemContext getDefaultInstanceForType() {
                return SystemContext.getDefaultInstance();
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
                this.device_ = null;
                C5228l1 c5228l12 = this.deviceBuilder_;
                if (c5228l12 != null) {
                    c5228l12.dispose();
                    this.deviceBuilder_ = null;
                }
                this.location_ = null;
                C5228l1 c5228l13 = this.locationBuilder_;
                if (c5228l13 != null) {
                    c5228l13.dispose();
                    this.locationBuilder_ = null;
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
                if (h02 instanceof SystemContext) {
                    return mergeFrom((SystemContext) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setDevice(DeviceOuterClass.Device.Builder builder) {
                C5228l1 c5228l1 = this.deviceBuilder_;
                if (c5228l1 == null) {
                    this.device_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setLocation(LocationOuterClass.Location.Builder builder) {
                C5228l1 c5228l1 = this.locationBuilder_;
                if (c5228l1 == null) {
                    this.location_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
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

            public Builder mergeFrom(SystemContext systemContext) {
                if (systemContext == SystemContext.getDefaultInstance()) {
                    return this;
                }
                if (systemContext.hasUser()) {
                    mergeUser(systemContext.getUser());
                }
                if (systemContext.hasDevice()) {
                    mergeDevice(systemContext.getDevice());
                }
                if (systemContext.hasLocation()) {
                    mergeLocation(systemContext.getLocation());
                }
                mergeUnknownFields(systemContext.getUnknownFields());
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
                                    rVar.readMessage(getUserFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    rVar.readMessage(getDeviceFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getLocationFieldBuilder().getBuilder(), m8);
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

        private SystemContext(AbstractC5209f0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SystemContext systemContext) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(systemContext);
        }

        public static SystemContext parseFrom(ByteBuffer byteBuffer, M m8) {
            return (SystemContext) PARSER.parseFrom(byteBuffer, m8);
        }

        public static SystemContext parseDelimitedFrom(InputStream inputStream, M m8) {
            return (SystemContext) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static SystemContext parseFrom(AbstractC5235o abstractC5235o) {
            return (SystemContext) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public SystemContext getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private SystemContext() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SystemContext parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (SystemContext) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SystemContext parseFrom(byte[] bArr) {
            return (SystemContext) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar);
        }

        public static SystemContext parseFrom(byte[] bArr, M m8) {
            return (SystemContext) PARSER.parseFrom(bArr, m8);
        }

        public static SystemContext parseFrom(InputStream inputStream) {
            return (SystemContext) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static SystemContext parseFrom(InputStream inputStream, M m8) {
            return (SystemContext) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static SystemContext parseFrom(r rVar) {
            return (SystemContext) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static SystemContext parseFrom(r rVar, M m8) {
            return (SystemContext) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface SystemContextOrBuilder extends N0 {
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

        DeviceOuterClass.Device getDevice();

        DeviceOuterClass.DeviceOrBuilder getDeviceOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        LocationOuterClass.Location getLocation();

        LocationOuterClass.LocationOrBuilder getLocationOrBuilder();

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

        boolean hasDevice();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        boolean hasLocation();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        boolean hasUser();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class Utter extends AbstractC5209f0 implements UtterOrBuilder {
        public static final int ALT_UTTERS_FIELD_NUMBER = 4;
        public static final int INPUT_TYPE_FIELD_NUMBER = 2;
        public static final int LANG_FIELD_NUMBER = 3;
        public static final int META_FIELD_NUMBER = 101;
        public static final int UTTER_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private C5247s0 altUtters_;
        private int bitField0_;
        private int inputType_;
        private int lang_;
        private byte memoizedIsInitialized;
        private C5240p1 meta_;
        private volatile Object utter_;
        private static final Utter DEFAULT_INSTANCE = new Utter();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.Dialog.Utter.1
            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public Utter parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = Utter.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements UtterOrBuilder {
            private C5247s0 altUtters_;
            private int bitField0_;
            private int inputType_;
            private int lang_;
            private C5228l1 metaBuilder_;
            private C5240p1 meta_;
            private Object utter_;

            private void buildPartial0(Utter utter) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    utter.utter_ = this.utter_;
                }
                if ((i9 & 2) != 0) {
                    utter.inputType_ = this.inputType_;
                }
                if ((i9 & 4) != 0) {
                    utter.lang_ = this.lang_;
                }
                if ((i9 & 8) != 0) {
                    this.altUtters_.makeImmutable();
                    utter.altUtters_ = this.altUtters_;
                }
                if ((i9 & 16) != 0) {
                    C5228l1 c5228l1 = this.metaBuilder_;
                    utter.meta_ = c5228l1 == null ? this.meta_ : (C5240p1) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                Utter.access$1176(utter, i8);
            }

            private void ensureAltUttersIsMutable() {
                if (!this.altUtters_.isModifiable()) {
                    this.altUtters_ = new C5247s0((InterfaceC5249t0) this.altUtters_);
                }
                this.bitField0_ |= 8;
            }

            public static final C5269x.b getDescriptor() {
                return Dialog.internal_static_maum_m2u_common_Utter_descriptor;
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

            public Builder addAllAltUtters(Iterable<String> iterable) {
                ensureAltUttersIsMutable();
                AbstractC5196b.a.addAll((Iterable) iterable, (List) this.altUtters_);
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder addAltUtters(String str) {
                str.getClass();
                ensureAltUttersIsMutable();
                this.altUtters_.add(str);
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder addAltUttersBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                ensureAltUttersIsMutable();
                this.altUtters_.add(abstractC5235o);
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder clearAltUtters() {
                this.altUtters_ = C5247s0.emptyList();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearInputType() {
                this.bitField0_ &= -3;
                this.inputType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLang() {
                this.bitField0_ &= -5;
                this.lang_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMeta() {
                this.bitField0_ &= -17;
                this.meta_ = null;
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.metaBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUtter() {
                this.utter_ = Utter.getDefaultInstance().getUtter();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // maum.m2u.common.Dialog.UtterOrBuilder
            public String getAltUtters(int i8) {
                return this.altUtters_.get(i8);
            }

            @Override // maum.m2u.common.Dialog.UtterOrBuilder
            public AbstractC5235o getAltUttersBytes(int i8) {
                return this.altUtters_.getByteString(i8);
            }

            @Override // maum.m2u.common.Dialog.UtterOrBuilder
            public int getAltUttersCount() {
                return this.altUtters_.size();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return Dialog.internal_static_maum_m2u_common_Utter_descriptor;
            }

            @Override // maum.m2u.common.Dialog.UtterOrBuilder
            public InputType getInputType() {
                InputType inputTypeForNumber = InputType.forNumber(this.inputType_);
                return inputTypeForNumber == null ? InputType.UNRECOGNIZED : inputTypeForNumber;
            }

            @Override // maum.m2u.common.Dialog.UtterOrBuilder
            public int getInputTypeValue() {
                return this.inputType_;
            }

            @Override // maum.m2u.common.Dialog.UtterOrBuilder
            public b.a getLang() {
                b.a aVarForNumber = b.a.forNumber(this.lang_);
                return aVarForNumber == null ? b.a.UNRECOGNIZED : aVarForNumber;
            }

            @Override // maum.m2u.common.Dialog.UtterOrBuilder
            public int getLangValue() {
                return this.lang_;
            }

            @Override // maum.m2u.common.Dialog.UtterOrBuilder
            public C5240p1 getMeta() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    return (C5240p1) c5228l1.getMessage();
                }
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            public C5240p1.b getMetaBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (C5240p1.b) getMetaFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.Dialog.UtterOrBuilder
            public InterfaceC5243q1 getMetaOrBuilder() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                }
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.common.Dialog.UtterOrBuilder
            public String getUtter() {
                Object obj = this.utter_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.utter_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.Dialog.UtterOrBuilder
            public AbstractC5235o getUtterBytes() {
                Object obj = this.utter_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.utter_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.Dialog.UtterOrBuilder
            public boolean hasMeta() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return Dialog.internal_static_maum_m2u_common_Utter_fieldAccessorTable.ensureFieldAccessorsInitialized(Utter.class, Builder.class);
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
                } else if ((this.bitField0_ & 16) == 0 || (c5240p12 = this.meta_) == null || c5240p12 == C5240p1.getDefaultInstance()) {
                    this.meta_ = c5240p1;
                } else {
                    getMetaBuilder().mergeFrom(c5240p1);
                }
                if (this.meta_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder setAltUtters(int i8, String str) {
                str.getClass();
                ensureAltUttersIsMutable();
                this.altUtters_.set(i8, str);
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setInputType(InputType inputType) {
                inputType.getClass();
                this.bitField0_ |= 2;
                this.inputType_ = inputType.getNumber();
                onChanged();
                return this;
            }

            public Builder setInputTypeValue(int i8) {
                this.inputType_ = i8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setLang(b.a aVar) {
                aVar.getClass();
                this.bitField0_ |= 4;
                this.lang_ = aVar.getNumber();
                onChanged();
                return this;
            }

            public Builder setLangValue(int i8) {
                this.lang_ = i8;
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
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setUtter(String str) {
                str.getClass();
                this.utter_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUtterBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.utter_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // maum.m2u.common.Dialog.UtterOrBuilder
            public InterfaceC5207e1 getAltUttersList() {
                this.altUtters_.makeImmutable();
                return this.altUtters_;
            }

            private Builder() {
                this.utter_ = "";
                this.inputType_ = 0;
                this.lang_ = 0;
                this.altUtters_ = C5247s0.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Utter build() {
                Utter utterBuildPartial = buildPartial();
                if (utterBuildPartial.isInitialized()) {
                    return utterBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) utterBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Utter buildPartial() {
                Utter utter = new Utter(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(utter);
                }
                onBuilt();
                return utter;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public Utter getDefaultInstanceForType() {
                return Utter.getDefaultInstance();
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
                this.utter_ = "";
                this.inputType_ = 0;
                this.lang_ = 0;
                this.altUtters_ = C5247s0.emptyList();
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
                if (h02 instanceof Utter) {
                    return mergeFrom((Utter) h02);
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
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.utter_ = "";
                this.inputType_ = 0;
                this.lang_ = 0;
                this.altUtters_ = C5247s0.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Utter utter) {
                if (utter == Utter.getDefaultInstance()) {
                    return this;
                }
                if (!utter.getUtter().isEmpty()) {
                    this.utter_ = utter.utter_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (utter.inputType_ != 0) {
                    setInputTypeValue(utter.getInputTypeValue());
                }
                if (utter.lang_ != 0) {
                    setLangValue(utter.getLangValue());
                }
                if (!utter.altUtters_.isEmpty()) {
                    if (this.altUtters_.isEmpty()) {
                        this.altUtters_ = utter.altUtters_;
                        this.bitField0_ |= 8;
                    } else {
                        ensureAltUttersIsMutable();
                        this.altUtters_.addAll(utter.altUtters_);
                    }
                    onChanged();
                }
                if (utter.hasMeta()) {
                    mergeMeta(utter.getMeta());
                }
                mergeUnknownFields(utter.getUnknownFields());
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
                                    this.utter_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.inputType_ = rVar.readEnum();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.lang_ = rVar.readEnum();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    String stringRequireUtf8 = rVar.readStringRequireUtf8();
                                    ensureAltUttersIsMutable();
                                    this.altUtters_.add(stringRequireUtf8);
                                } else if (tag != 810) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getMetaFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 16;
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

        public enum InputType implements InterfaceC5204d1 {
            SPEECH(0),
            KEYBOARD(1),
            TOUTCH(2),
            IMAGE(3),
            IMAGE_DOCUMENT(4),
            VIDEO(5),
            OPEN_EVENT(100),
            UNRECOGNIZED(-1);

            public static final int IMAGE_DOCUMENT_VALUE = 4;
            public static final int IMAGE_VALUE = 3;
            public static final int KEYBOARD_VALUE = 1;
            public static final int OPEN_EVENT_VALUE = 100;
            public static final int SPEECH_VALUE = 0;
            public static final int TOUTCH_VALUE = 2;
            public static final int VIDEO_VALUE = 5;
            private final int value;
            private static final AbstractC5227l0.d internalValueMap = new AbstractC5227l0.d() { // from class: maum.m2u.common.Dialog.Utter.InputType.1
                @Override // com.google.protobuf.AbstractC5227l0.d
                public InputType findValueByNumber(int i8) {
                    return InputType.forNumber(i8);
                }
            };
            private static final InputType[] VALUES = values();

            InputType(int i8) {
                this.value = i8;
            }

            public static InputType forNumber(int i8) {
                if (i8 == 0) {
                    return SPEECH;
                }
                if (i8 == 1) {
                    return KEYBOARD;
                }
                if (i8 == 2) {
                    return TOUTCH;
                }
                if (i8 == 3) {
                    return IMAGE;
                }
                if (i8 == 4) {
                    return IMAGE_DOCUMENT;
                }
                if (i8 == 5) {
                    return VIDEO;
                }
                if (i8 != 100) {
                    return null;
                }
                return OPEN_EVENT;
            }

            public static final C5269x.e getDescriptor() {
                return Utter.getDescriptor().getEnumTypes().get(0);
            }

            public static AbstractC5227l0.d internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.InterfaceC5204d1
            public final C5269x.e getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.InterfaceC5204d1, com.google.protobuf.AbstractC5227l0.c
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Override // com.google.protobuf.InterfaceC5204d1
            public final C5269x.f getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return getDescriptor().getValues().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static InputType valueOf(int i8) {
                return forNumber(i8);
            }

            public static InputType valueOf(C5269x.f fVar) {
                if (fVar.getType() == getDescriptor()) {
                    if (fVar.getIndex() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[fVar.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        static /* synthetic */ int access$1176(Utter utter, int i8) {
            int i9 = i8 | utter.bitField0_;
            utter.bitField0_ = i9;
            return i9;
        }

        public static Utter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return Dialog.internal_static_maum_m2u_common_Utter_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Utter parseDelimitedFrom(InputStream inputStream) {
            return (Utter) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Utter parseFrom(ByteBuffer byteBuffer) {
            return (Utter) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Utter)) {
                return super.equals(obj);
            }
            Utter utter = (Utter) obj;
            if (getUtter().equals(utter.getUtter()) && this.inputType_ == utter.inputType_ && this.lang_ == utter.lang_ && getAltUttersList().equals(utter.getAltUttersList()) && hasMeta() == utter.hasMeta()) {
                return (!hasMeta() || getMeta().equals(utter.getMeta())) && getUnknownFields().equals(utter.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.Dialog.UtterOrBuilder
        public String getAltUtters(int i8) {
            return this.altUtters_.get(i8);
        }

        @Override // maum.m2u.common.Dialog.UtterOrBuilder
        public AbstractC5235o getAltUttersBytes(int i8) {
            return this.altUtters_.getByteString(i8);
        }

        @Override // maum.m2u.common.Dialog.UtterOrBuilder
        public int getAltUttersCount() {
            return this.altUtters_.size();
        }

        @Override // maum.m2u.common.Dialog.UtterOrBuilder
        public InputType getInputType() {
            InputType inputTypeForNumber = InputType.forNumber(this.inputType_);
            return inputTypeForNumber == null ? InputType.UNRECOGNIZED : inputTypeForNumber;
        }

        @Override // maum.m2u.common.Dialog.UtterOrBuilder
        public int getInputTypeValue() {
            return this.inputType_;
        }

        @Override // maum.m2u.common.Dialog.UtterOrBuilder
        public b.a getLang() {
            b.a aVarForNumber = b.a.forNumber(this.lang_);
            return aVarForNumber == null ? b.a.UNRECOGNIZED : aVarForNumber;
        }

        @Override // maum.m2u.common.Dialog.UtterOrBuilder
        public int getLangValue() {
            return this.lang_;
        }

        @Override // maum.m2u.common.Dialog.UtterOrBuilder
        public C5240p1 getMeta() {
            C5240p1 c5240p1 = this.meta_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.common.Dialog.UtterOrBuilder
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
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.utter_) ? AbstractC5209f0.computeStringSize(1, this.utter_) : 0;
            if (this.inputType_ != InputType.SPEECH.getNumber()) {
                iComputeStringSize += AbstractC5248t.computeEnumSize(2, this.inputType_);
            }
            if (this.lang_ != b.a.ko_KR.getNumber()) {
                iComputeStringSize += AbstractC5248t.computeEnumSize(3, this.lang_);
            }
            int iComputeStringSizeNoTag = 0;
            for (int i9 = 0; i9 < this.altUtters_.size(); i9++) {
                iComputeStringSizeNoTag += AbstractC5209f0.computeStringSizeNoTag(this.altUtters_.getRaw(i9));
            }
            int size = iComputeStringSize + iComputeStringSizeNoTag + getAltUttersList().size();
            if ((1 & this.bitField0_) != 0) {
                size += AbstractC5248t.computeMessageSize(101, getMeta());
            }
            int serializedSize = size + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.Dialog.UtterOrBuilder
        public String getUtter() {
            Object obj = this.utter_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.utter_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.Dialog.UtterOrBuilder
        public AbstractC5235o getUtterBytes() {
            Object obj = this.utter_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.utter_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.Dialog.UtterOrBuilder
        public boolean hasMeta() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUtter().hashCode()) * 37) + 2) * 53) + this.inputType_) * 37) + 3) * 53) + this.lang_;
            if (getAltUttersCount() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getAltUttersList().hashCode();
            }
            if (hasMeta()) {
                iHashCode = (((iHashCode * 37) + 101) * 53) + getMeta().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return Dialog.internal_static_maum_m2u_common_Utter_fieldAccessorTable.ensureFieldAccessorsInitialized(Utter.class, Builder.class);
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
            return new Utter();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.utter_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.utter_);
            }
            if (this.inputType_ != InputType.SPEECH.getNumber()) {
                abstractC5248t.writeEnum(2, this.inputType_);
            }
            if (this.lang_ != b.a.ko_KR.getNumber()) {
                abstractC5248t.writeEnum(3, this.lang_);
            }
            for (int i8 = 0; i8 < this.altUtters_.size(); i8++) {
                AbstractC5209f0.writeString(abstractC5248t, 4, this.altUtters_.getRaw(i8));
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(101, getMeta());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private Utter(AbstractC5209f0.b bVar) {
            super(bVar);
            this.utter_ = "";
            this.inputType_ = 0;
            this.lang_ = 0;
            this.altUtters_ = C5247s0.emptyList();
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(Utter utter) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(utter);
        }

        public static Utter parseFrom(ByteBuffer byteBuffer, M m8) {
            return (Utter) PARSER.parseFrom(byteBuffer, m8);
        }

        @Override // maum.m2u.common.Dialog.UtterOrBuilder
        public InterfaceC5207e1 getAltUttersList() {
            return this.altUtters_;
        }

        public static Utter parseDelimitedFrom(InputStream inputStream, M m8) {
            return (Utter) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static Utter parseFrom(AbstractC5235o abstractC5235o) {
            return (Utter) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public Utter getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Utter parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (Utter) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Utter parseFrom(byte[] bArr) {
            return (Utter) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar);
        }

        public static Utter parseFrom(byte[] bArr, M m8) {
            return (Utter) PARSER.parseFrom(bArr, m8);
        }

        public static Utter parseFrom(InputStream inputStream) {
            return (Utter) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        private Utter() {
            this.utter_ = "";
            this.inputType_ = 0;
            this.lang_ = 0;
            this.altUtters_ = C5247s0.emptyList();
            this.memoizedIsInitialized = (byte) -1;
            this.utter_ = "";
            this.inputType_ = 0;
            this.lang_ = 0;
            this.altUtters_ = C5247s0.emptyList();
        }

        public static Utter parseFrom(InputStream inputStream, M m8) {
            return (Utter) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static Utter parseFrom(r rVar) {
            return (Utter) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static Utter parseFrom(r rVar, M m8) {
            return (Utter) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface UtterOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        String getAltUtters(int i8);

        AbstractC5235o getAltUttersBytes(int i8);

        int getAltUttersCount();

        List<String> getAltUttersList();

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

        Utter.InputType getInputType();

        int getInputTypeValue();

        b.a getLang();

        int getLangValue();

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

        String getUtter();

        AbstractC5235o getUtterBytes();

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
        internal_static_maum_m2u_common_Utter_descriptor = bVar;
        internal_static_maum_m2u_common_Utter_fieldAccessorTable = new AbstractC5209f0.g(bVar, new String[]{"Utter", "InputType", "Lang", "AltUtters", "Meta"});
        C5269x.b bVar2 = getDescriptor().getMessageTypes().get(1);
        internal_static_maum_m2u_common_OpenUtter_descriptor = bVar2;
        internal_static_maum_m2u_common_OpenUtter_fieldAccessorTable = new AbstractC5209f0.g(bVar2, new String[]{"Chatbot", "Lang", "Utter", "Meta"});
        C5269x.b bVar3 = getDescriptor().getMessageTypes().get(2);
        internal_static_maum_m2u_common_Speech_descriptor = bVar3;
        internal_static_maum_m2u_common_Speech_fieldAccessorTable = new AbstractC5209f0.g(bVar3, new String[]{"Lang", "Utter", "SpeechUtter", "Reprompt"});
        C5269x.b bVar4 = getDescriptor().getMessageTypes().get(3);
        internal_static_maum_m2u_common_Session_descriptor = bVar4;
        internal_static_maum_m2u_common_Session_fieldAccessorTable = new AbstractC5209f0.g(bVar4, new String[]{"Id", "Context"});
        C5269x.b bVar5 = getDescriptor().getMessageTypes().get(4);
        internal_static_maum_m2u_common_SystemContext_descriptor = bVar5;
        internal_static_maum_m2u_common_SystemContext_fieldAccessorTable = new AbstractC5209f0.g(bVar5, new String[]{"User", "Device", "Location"});
        AbstractC5245r1.getDescriptor();
        b.getDescriptor();
        UserOuterClass.getDescriptor();
        DeviceOuterClass.getDescriptor();
        LocationOuterClass.getDescriptor();
    }

    private Dialog() {
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
