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
import com.google.protobuf.InterfaceC5207e1;
import com.google.protobuf.InterfaceC5243q1;
import com.google.protobuf.InterfaceC5249t0;
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
public final class EventOuterClass {
    private static C5269x.h descriptor = C5269x.h.internalBuildGeneratedFileFrom(new String[]{"\n\u001bmaum/m2u/common/event.proto\u0012\u000fmaum.m2u.common\u001a\u001cgoogle/protobuf/struct.proto\u001a\u001fgoogle/protobuf/timestamp.proto\u001a\u0016maum/common/lang.proto\"\u0098\u0001\n\u0005Event\u0012\u0011\n\tinterface\u0018\u0001 \u0001(\t\u0012\u0011\n\toperation\u0018\u0002 \u0001(\t\u00129\n\u0005param\u0018\u0003 \u0001(\u000b2*.maum.m2u.common.DialogAgentForwarderParam\u0012.\n\u0007payload\u0018\u0004 \u0001(\u000b2\u001d.maum.m2u.common.EventPayload\" \u0001\n\rDelegateEvent\u0012\u0011\n\tinterface\u0018\u0001 \u0001(\t\u0012\u0011\n\toperation\u0018\u0002 \u0001(\t\u00129\n\u0005param\u0018\u0003 \u0001(\u000b2*.maum.m2u.common.DialogAgentForwarderParam\u0012.\n\u0007payload\u0018\u0004 \u0001(\u000b2\u001d.maum.m2u.common.EventPayload\"\u0084\u0001\n\u0012LauncherAuthorized\u0012\u0014\n\faccess_token\u0018\u0001 \u0001(\t\u00121\n\rauthorized_at\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012%\n\u0004meta\u0018d \u0001(\u000b2\u0017.google.protobuf.Struct\"b\n\u0017LauncherAuthorizeFailed\u0012\u0014\n\faccess_token\u0018\u0001 \u0001(\t\u00121\n\rauthorized_at\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.Timestamp\"\\\n\u0013LauncherSlotsFilled\u0012-\n\ffilled_slots\u0018\u0001 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012\u0016\n\u000eunfilled_slots\u0018\u0002 \u0003(\t\"-\n\u000fAudioPlayerPlay\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006reason\u0018\u0002 \u0001(\t\"\u0080\u0001\n\u0019DialogAgentForwarderParam\u0012\u000f\n\u0007chatbot\u0018\u0001 \u0001(\t\u0012\r\n\u0005skill\u0018\u0002 \u0001(\t\u0012\u000e\n\u0006intent\u0018\u0003 \u0001(\t\u0012\u001f\n\u0004lang\u0018\u0004 \u0001(\u000e2\u0011.maum.common.Lang\u0012\u0012\n\nsession_id\u0018\u000b \u0001(\u0003\"0\n\u0014LauncherDocumentRead\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\f\n\u0004read\u0018\u0002 \u0001(\b\"þ\u0002\n\fEventPayload\u0012B\n\u0013launcher_authorized\u0018\u000b \u0001(\u000b2#.maum.m2u.common.LauncherAuthorizedH\u0000\u0012M\n\u0019launcher_authorize_failed\u0018\f \u0001(\u000b2(.maum.m2u.common.LauncherAuthorizeFailedH\u0000\u0012E\n\u0015launcher_slots_filled\u0018\r \u0001(\u000b2$.maum.m2u.common.LauncherSlotsFilledH\u0000\u0012=\n\u0011audio_player_play\u0018\u000e \u0001(\u000b2 .maum.m2u.common.AudioPlayerPlayH\u0000\u0012G\n\u0016launcher_document_read\u0018\u000f \u0001(\u000b2%.maum.m2u.common.LauncherDocumentReadH\u0000B\f\n\ntest_eventb\u0006proto3"}, new C5269x.h[]{AbstractC5245r1.getDescriptor(), y1.getDescriptor(), b.getDescriptor()});
    private static final C5269x.b internal_static_maum_m2u_common_AudioPlayerPlay_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_AudioPlayerPlay_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_DelegateEvent_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_DelegateEvent_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_DialogAgentForwarderParam_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_DialogAgentForwarderParam_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_EventPayload_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_EventPayload_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_Event_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_Event_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_LauncherAuthorizeFailed_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_LauncherAuthorizeFailed_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_LauncherAuthorized_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_LauncherAuthorized_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_LauncherDocumentRead_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_LauncherDocumentRead_fieldAccessorTable;
    private static final C5269x.b internal_static_maum_m2u_common_LauncherSlotsFilled_descriptor;
    private static final AbstractC5209f0.g internal_static_maum_m2u_common_LauncherSlotsFilled_fieldAccessorTable;

    /* renamed from: maum.m2u.common.EventOuterClass$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$maum$m2u$common$EventOuterClass$EventPayload$TestEventCase;

        static {
            int[] iArr = new int[EventPayload.TestEventCase.values().length];
            $SwitchMap$maum$m2u$common$EventOuterClass$EventPayload$TestEventCase = iArr;
            try {
                iArr[EventPayload.TestEventCase.LAUNCHER_AUTHORIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$maum$m2u$common$EventOuterClass$EventPayload$TestEventCase[EventPayload.TestEventCase.LAUNCHER_AUTHORIZE_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$maum$m2u$common$EventOuterClass$EventPayload$TestEventCase[EventPayload.TestEventCase.LAUNCHER_SLOTS_FILLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$maum$m2u$common$EventOuterClass$EventPayload$TestEventCase[EventPayload.TestEventCase.AUDIO_PLAYER_PLAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$maum$m2u$common$EventOuterClass$EventPayload$TestEventCase[EventPayload.TestEventCase.LAUNCHER_DOCUMENT_READ.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$maum$m2u$common$EventOuterClass$EventPayload$TestEventCase[EventPayload.TestEventCase.TESTEVENT_NOT_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class AudioPlayerPlay extends AbstractC5209f0 implements AudioPlayerPlayOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int REASON_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private volatile Object reason_;
        private static final AudioPlayerPlay DEFAULT_INSTANCE = new AudioPlayerPlay();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.EventOuterClass.AudioPlayerPlay.1
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public AudioPlayerPlay parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = AudioPlayerPlay.newBuilder();
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

        /* renamed from: maum.m2u.common.EventOuterClass$AudioPlayerPlay$1 */
        class AnonymousClass1 extends AbstractC5199c {
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public AudioPlayerPlay parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = AudioPlayerPlay.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements AudioPlayerPlayOrBuilder {
            private int bitField0_;
            private Object id_;
            private Object reason_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(AudioPlayerPlay audioPlayerPlay) {
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    audioPlayerPlay.id_ = this.id_;
                }
                if ((i8 & 2) != 0) {
                    audioPlayerPlay.reason_ = this.reason_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return EventOuterClass.internal_static_maum_m2u_common_AudioPlayerPlay_descriptor;
            }

            public Builder clearId() {
                this.id_ = AudioPlayerPlay.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearReason() {
                this.reason_ = AudioPlayerPlay.getDefaultInstance().getReason();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return EventOuterClass.internal_static_maum_m2u_common_AudioPlayerPlay_descriptor;
            }

            @Override // maum.m2u.common.EventOuterClass.AudioPlayerPlayOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.EventOuterClass.AudioPlayerPlayOrBuilder
            public AbstractC5235o getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.id_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.EventOuterClass.AudioPlayerPlayOrBuilder
            public String getReason() {
                Object obj = this.reason_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.reason_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.EventOuterClass.AudioPlayerPlayOrBuilder
            public AbstractC5235o getReasonBytes() {
                Object obj = this.reason_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.reason_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return EventOuterClass.internal_static_maum_m2u_common_AudioPlayerPlay_fieldAccessorTable.ensureFieldAccessorsInitialized(AudioPlayerPlay.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
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

            public Builder setReason(String str) {
                str.getClass();
                this.reason_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setReasonBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.reason_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.id_ = "";
                this.reason_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public AudioPlayerPlay build() {
                AudioPlayerPlay audioPlayerPlayBuildPartial = buildPartial();
                if (audioPlayerPlayBuildPartial.isInitialized()) {
                    return audioPlayerPlayBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) audioPlayerPlayBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public AudioPlayerPlay buildPartial() {
                AudioPlayerPlay audioPlayerPlay = new AudioPlayerPlay(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(audioPlayerPlay);
                }
                onBuilt();
                return audioPlayerPlay;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public AudioPlayerPlay getDefaultInstanceForType() {
                return AudioPlayerPlay.getDefaultInstance();
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
                this.reason_ = "";
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.id_ = "";
                this.reason_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof AudioPlayerPlay) {
                    return mergeFrom((AudioPlayerPlay) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder mergeFrom(AudioPlayerPlay audioPlayerPlay) {
                if (audioPlayerPlay == AudioPlayerPlay.getDefaultInstance()) {
                    return this;
                }
                if (!audioPlayerPlay.getId().isEmpty()) {
                    this.id_ = audioPlayerPlay.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!audioPlayerPlay.getReason().isEmpty()) {
                    this.reason_ = audioPlayerPlay.reason_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(audioPlayerPlay.getUnknownFields());
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
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.reason_ = rVar.readStringRequireUtf8();
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

        /* synthetic */ AudioPlayerPlay(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static AudioPlayerPlay getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return EventOuterClass.internal_static_maum_m2u_common_AudioPlayerPlay_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AudioPlayerPlay parseDelimitedFrom(InputStream inputStream) {
            return (AudioPlayerPlay) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AudioPlayerPlay parseFrom(ByteBuffer byteBuffer) {
            return (AudioPlayerPlay) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AudioPlayerPlay)) {
                return super.equals(obj);
            }
            AudioPlayerPlay audioPlayerPlay = (AudioPlayerPlay) obj;
            return getId().equals(audioPlayerPlay.getId()) && getReason().equals(audioPlayerPlay.getReason()) && getUnknownFields().equals(audioPlayerPlay.getUnknownFields());
        }

        @Override // maum.m2u.common.EventOuterClass.AudioPlayerPlayOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.EventOuterClass.AudioPlayerPlayOrBuilder
        public AbstractC5235o getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.id_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.common.EventOuterClass.AudioPlayerPlayOrBuilder
        public String getReason() {
            Object obj = this.reason_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.reason_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.EventOuterClass.AudioPlayerPlayOrBuilder
        public AbstractC5235o getReasonBytes() {
            Object obj = this.reason_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.reason_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.id_) ? AbstractC5209f0.computeStringSize(1, this.id_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.reason_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.reason_);
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
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getReason().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return EventOuterClass.internal_static_maum_m2u_common_AudioPlayerPlay_fieldAccessorTable.ensureFieldAccessorsInitialized(AudioPlayerPlay.class, Builder.class);
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
            return new AudioPlayerPlay();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.id_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.id_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.reason_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.reason_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private AudioPlayerPlay(AbstractC5209f0.b bVar) {
            super(bVar);
            this.id_ = "";
            this.reason_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(AudioPlayerPlay audioPlayerPlay) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(audioPlayerPlay);
        }

        public static AudioPlayerPlay parseFrom(ByteBuffer byteBuffer, M m8) {
            return (AudioPlayerPlay) PARSER.parseFrom(byteBuffer, m8);
        }

        public static AudioPlayerPlay parseDelimitedFrom(InputStream inputStream, M m8) {
            return (AudioPlayerPlay) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static AudioPlayerPlay parseFrom(AbstractC5235o abstractC5235o) {
            return (AudioPlayerPlay) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public AudioPlayerPlay getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((AnonymousClass1) null) : new Builder((AnonymousClass1) null).mergeFrom(this);
        }

        public static AudioPlayerPlay parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (AudioPlayerPlay) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AudioPlayerPlay parseFrom(byte[] bArr) {
            return (AudioPlayerPlay) PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        private AudioPlayerPlay() {
            this.id_ = "";
            this.reason_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.reason_ = "";
        }

        public static AudioPlayerPlay parseFrom(byte[] bArr, M m8) {
            return (AudioPlayerPlay) PARSER.parseFrom(bArr, m8);
        }

        public static AudioPlayerPlay parseFrom(InputStream inputStream) {
            return (AudioPlayerPlay) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static AudioPlayerPlay parseFrom(InputStream inputStream, M m8) {
            return (AudioPlayerPlay) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static AudioPlayerPlay parseFrom(r rVar) {
            return (AudioPlayerPlay) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static AudioPlayerPlay parseFrom(r rVar, M m8) {
            return (AudioPlayerPlay) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface AudioPlayerPlayOrBuilder extends N0 {
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

        String getId();

        AbstractC5235o getIdBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        String getReason();

        AbstractC5235o getReasonBytes();

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

    public static final class DelegateEvent extends AbstractC5209f0 implements DelegateEventOrBuilder {
        public static final int INTERFACE_FIELD_NUMBER = 1;
        public static final int OPERATION_FIELD_NUMBER = 2;
        public static final int PARAM_FIELD_NUMBER = 3;
        public static final int PAYLOAD_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object interface_;
        private byte memoizedIsInitialized;
        private volatile Object operation_;
        private DialogAgentForwarderParam param_;
        private EventPayload payload_;
        private static final DelegateEvent DEFAULT_INSTANCE = new DelegateEvent();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.EventOuterClass.DelegateEvent.1
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public DelegateEvent parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = DelegateEvent.newBuilder();
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

        /* renamed from: maum.m2u.common.EventOuterClass$DelegateEvent$1 */
        class AnonymousClass1 extends AbstractC5199c {
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public DelegateEvent parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = DelegateEvent.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements DelegateEventOrBuilder {
            private int bitField0_;
            private Object interface_;
            private Object operation_;
            private C5228l1 paramBuilder_;
            private DialogAgentForwarderParam param_;
            private C5228l1 payloadBuilder_;
            private EventPayload payload_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(DelegateEvent delegateEvent) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    delegateEvent.interface_ = this.interface_;
                }
                if ((i9 & 2) != 0) {
                    delegateEvent.operation_ = this.operation_;
                }
                if ((i9 & 4) != 0) {
                    C5228l1 c5228l1 = this.paramBuilder_;
                    delegateEvent.param_ = c5228l1 == null ? this.param_ : (DialogAgentForwarderParam) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if ((i9 & 8) != 0) {
                    C5228l1 c5228l12 = this.payloadBuilder_;
                    delegateEvent.payload_ = c5228l12 == null ? this.payload_ : (EventPayload) c5228l12.build();
                    i8 |= 2;
                }
                DelegateEvent.access$2376(delegateEvent, i8);
            }

            public static final C5269x.b getDescriptor() {
                return EventOuterClass.internal_static_maum_m2u_common_DelegateEvent_descriptor;
            }

            private C5228l1 getParamFieldBuilder() {
                if (this.paramBuilder_ == null) {
                    this.paramBuilder_ = new C5228l1(getParam(), getParentForChildren(), isClean());
                    this.param_ = null;
                }
                return this.paramBuilder_;
            }

            private C5228l1 getPayloadFieldBuilder() {
                if (this.payloadBuilder_ == null) {
                    this.payloadBuilder_ = new C5228l1(getPayload(), getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                return this.payloadBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getParamFieldBuilder();
                    getPayloadFieldBuilder();
                }
            }

            public Builder clearInterface() {
                this.interface_ = DelegateEvent.getDefaultInstance().getInterface();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearOperation() {
                this.operation_ = DelegateEvent.getDefaultInstance().getOperation();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearParam() {
                this.bitField0_ &= -5;
                this.param_ = null;
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.paramBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPayload() {
                this.bitField0_ &= -9;
                this.payload_ = null;
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.payloadBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return EventOuterClass.internal_static_maum_m2u_common_DelegateEvent_descriptor;
            }

            @Override // maum.m2u.common.EventOuterClass.DelegateEventOrBuilder
            public String getInterface() {
                Object obj = this.interface_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.interface_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.EventOuterClass.DelegateEventOrBuilder
            public AbstractC5235o getInterfaceBytes() {
                Object obj = this.interface_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.interface_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.EventOuterClass.DelegateEventOrBuilder
            public String getOperation() {
                Object obj = this.operation_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.operation_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.EventOuterClass.DelegateEventOrBuilder
            public AbstractC5235o getOperationBytes() {
                Object obj = this.operation_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.operation_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.EventOuterClass.DelegateEventOrBuilder
            public DialogAgentForwarderParam getParam() {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    return (DialogAgentForwarderParam) c5228l1.getMessage();
                }
                DialogAgentForwarderParam dialogAgentForwarderParam = this.param_;
                return dialogAgentForwarderParam == null ? DialogAgentForwarderParam.getDefaultInstance() : dialogAgentForwarderParam;
            }

            public DialogAgentForwarderParam.Builder getParamBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (DialogAgentForwarderParam.Builder) getParamFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.EventOuterClass.DelegateEventOrBuilder
            public DialogAgentForwarderParamOrBuilder getParamOrBuilder() {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    return (DialogAgentForwarderParamOrBuilder) c5228l1.getMessageOrBuilder();
                }
                DialogAgentForwarderParam dialogAgentForwarderParam = this.param_;
                return dialogAgentForwarderParam == null ? DialogAgentForwarderParam.getDefaultInstance() : dialogAgentForwarderParam;
            }

            @Override // maum.m2u.common.EventOuterClass.DelegateEventOrBuilder
            public EventPayload getPayload() {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    return (EventPayload) c5228l1.getMessage();
                }
                EventPayload eventPayload = this.payload_;
                return eventPayload == null ? EventPayload.getDefaultInstance() : eventPayload;
            }

            public EventPayload.Builder getPayloadBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (EventPayload.Builder) getPayloadFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.EventOuterClass.DelegateEventOrBuilder
            public EventPayloadOrBuilder getPayloadOrBuilder() {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    return (EventPayloadOrBuilder) c5228l1.getMessageOrBuilder();
                }
                EventPayload eventPayload = this.payload_;
                return eventPayload == null ? EventPayload.getDefaultInstance() : eventPayload;
            }

            @Override // maum.m2u.common.EventOuterClass.DelegateEventOrBuilder
            public boolean hasParam() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // maum.m2u.common.EventOuterClass.DelegateEventOrBuilder
            public boolean hasPayload() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return EventOuterClass.internal_static_maum_m2u_common_DelegateEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(DelegateEvent.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeParam(DialogAgentForwarderParam dialogAgentForwarderParam) {
                DialogAgentForwarderParam dialogAgentForwarderParam2;
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(dialogAgentForwarderParam);
                } else if ((this.bitField0_ & 4) == 0 || (dialogAgentForwarderParam2 = this.param_) == null || dialogAgentForwarderParam2 == DialogAgentForwarderParam.getDefaultInstance()) {
                    this.param_ = dialogAgentForwarderParam;
                } else {
                    getParamBuilder().mergeFrom(dialogAgentForwarderParam);
                }
                if (this.param_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergePayload(EventPayload eventPayload) {
                EventPayload eventPayload2;
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(eventPayload);
                } else if ((this.bitField0_ & 8) == 0 || (eventPayload2 = this.payload_) == null || eventPayload2 == EventPayload.getDefaultInstance()) {
                    this.payload_ = eventPayload;
                } else {
                    getPayloadBuilder().mergeFrom(eventPayload);
                }
                if (this.payload_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder setInterface(String str) {
                str.getClass();
                this.interface_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setInterfaceBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.interface_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setOperation(String str) {
                str.getClass();
                this.operation_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setOperationBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.operation_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setParam(DialogAgentForwarderParam dialogAgentForwarderParam) {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 == null) {
                    dialogAgentForwarderParam.getClass();
                    this.param_ = dialogAgentForwarderParam;
                } else {
                    c5228l1.setMessage(dialogAgentForwarderParam);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPayload(EventPayload eventPayload) {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 == null) {
                    eventPayload.getClass();
                    this.payload_ = eventPayload;
                } else {
                    c5228l1.setMessage(eventPayload);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.interface_ = "";
                this.operation_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public DelegateEvent build() {
                DelegateEvent delegateEventBuildPartial = buildPartial();
                if (delegateEventBuildPartial.isInitialized()) {
                    return delegateEventBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) delegateEventBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public DelegateEvent buildPartial() {
                DelegateEvent delegateEvent = new DelegateEvent(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(delegateEvent);
                }
                onBuilt();
                return delegateEvent;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public DelegateEvent getDefaultInstanceForType() {
                return DelegateEvent.getDefaultInstance();
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
                this.interface_ = "";
                this.operation_ = "";
                this.param_ = null;
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.paramBuilder_ = null;
                }
                this.payload_ = null;
                C5228l1 c5228l12 = this.payloadBuilder_;
                if (c5228l12 != null) {
                    c5228l12.dispose();
                    this.payloadBuilder_ = null;
                }
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.interface_ = "";
                this.operation_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof DelegateEvent) {
                    return mergeFrom((DelegateEvent) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setParam(DialogAgentForwarderParam.Builder builder) {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 == null) {
                    this.param_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPayload(EventPayload.Builder builder) {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 == null) {
                    this.payload_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder mergeFrom(DelegateEvent delegateEvent) {
                if (delegateEvent == DelegateEvent.getDefaultInstance()) {
                    return this;
                }
                if (!delegateEvent.getInterface().isEmpty()) {
                    this.interface_ = delegateEvent.interface_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!delegateEvent.getOperation().isEmpty()) {
                    this.operation_ = delegateEvent.operation_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (delegateEvent.hasParam()) {
                    mergeParam(delegateEvent.getParam());
                }
                if (delegateEvent.hasPayload()) {
                    mergePayload(delegateEvent.getPayload());
                }
                mergeUnknownFields(delegateEvent.getUnknownFields());
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
                                    this.interface_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.operation_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    rVar.readMessage(getParamFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 4;
                                } else if (tag != 34) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getPayloadFieldBuilder().getBuilder(), m8);
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

        /* synthetic */ DelegateEvent(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$2376(DelegateEvent delegateEvent, int i8) {
            int i9 = i8 | delegateEvent.bitField0_;
            delegateEvent.bitField0_ = i9;
            return i9;
        }

        public static DelegateEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return EventOuterClass.internal_static_maum_m2u_common_DelegateEvent_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DelegateEvent parseDelimitedFrom(InputStream inputStream) {
            return (DelegateEvent) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DelegateEvent parseFrom(ByteBuffer byteBuffer) {
            return (DelegateEvent) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DelegateEvent)) {
                return super.equals(obj);
            }
            DelegateEvent delegateEvent = (DelegateEvent) obj;
            if (!getInterface().equals(delegateEvent.getInterface()) || !getOperation().equals(delegateEvent.getOperation()) || hasParam() != delegateEvent.hasParam()) {
                return false;
            }
            if ((!hasParam() || getParam().equals(delegateEvent.getParam())) && hasPayload() == delegateEvent.hasPayload()) {
                return (!hasPayload() || getPayload().equals(delegateEvent.getPayload())) && getUnknownFields().equals(delegateEvent.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.EventOuterClass.DelegateEventOrBuilder
        public String getInterface() {
            Object obj = this.interface_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.interface_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.EventOuterClass.DelegateEventOrBuilder
        public AbstractC5235o getInterfaceBytes() {
            Object obj = this.interface_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.interface_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.EventOuterClass.DelegateEventOrBuilder
        public String getOperation() {
            Object obj = this.operation_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.operation_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.EventOuterClass.DelegateEventOrBuilder
        public AbstractC5235o getOperationBytes() {
            Object obj = this.operation_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.operation_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.EventOuterClass.DelegateEventOrBuilder
        public DialogAgentForwarderParam getParam() {
            DialogAgentForwarderParam dialogAgentForwarderParam = this.param_;
            return dialogAgentForwarderParam == null ? DialogAgentForwarderParam.getDefaultInstance() : dialogAgentForwarderParam;
        }

        @Override // maum.m2u.common.EventOuterClass.DelegateEventOrBuilder
        public DialogAgentForwarderParamOrBuilder getParamOrBuilder() {
            DialogAgentForwarderParam dialogAgentForwarderParam = this.param_;
            return dialogAgentForwarderParam == null ? DialogAgentForwarderParam.getDefaultInstance() : dialogAgentForwarderParam;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.common.EventOuterClass.DelegateEventOrBuilder
        public EventPayload getPayload() {
            EventPayload eventPayload = this.payload_;
            return eventPayload == null ? EventPayload.getDefaultInstance() : eventPayload;
        }

        @Override // maum.m2u.common.EventOuterClass.DelegateEventOrBuilder
        public EventPayloadOrBuilder getPayloadOrBuilder() {
            EventPayload eventPayload = this.payload_;
            return eventPayload == null ? EventPayload.getDefaultInstance() : eventPayload;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.interface_) ? AbstractC5209f0.computeStringSize(1, this.interface_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.operation_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.operation_);
            }
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(3, getParam());
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(4, getPayload());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.EventOuterClass.DelegateEventOrBuilder
        public boolean hasParam() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // maum.m2u.common.EventOuterClass.DelegateEventOrBuilder
        public boolean hasPayload() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getInterface().hashCode()) * 37) + 2) * 53) + getOperation().hashCode();
            if (hasParam()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getParam().hashCode();
            }
            if (hasPayload()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getPayload().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return EventOuterClass.internal_static_maum_m2u_common_DelegateEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(DelegateEvent.class, Builder.class);
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
            return new DelegateEvent();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.interface_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.interface_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.operation_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.operation_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(3, getParam());
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC5248t.writeMessage(4, getPayload());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private DelegateEvent(AbstractC5209f0.b bVar) {
            super(bVar);
            this.interface_ = "";
            this.operation_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(DelegateEvent delegateEvent) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(delegateEvent);
        }

        public static DelegateEvent parseFrom(ByteBuffer byteBuffer, M m8) {
            return (DelegateEvent) PARSER.parseFrom(byteBuffer, m8);
        }

        public static DelegateEvent parseDelimitedFrom(InputStream inputStream, M m8) {
            return (DelegateEvent) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static DelegateEvent parseFrom(AbstractC5235o abstractC5235o) {
            return (DelegateEvent) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public DelegateEvent getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((AnonymousClass1) null) : new Builder((AnonymousClass1) null).mergeFrom(this);
        }

        public static DelegateEvent parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (DelegateEvent) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DelegateEvent parseFrom(byte[] bArr) {
            return (DelegateEvent) PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        private DelegateEvent() {
            this.interface_ = "";
            this.operation_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.interface_ = "";
            this.operation_ = "";
        }

        public static DelegateEvent parseFrom(byte[] bArr, M m8) {
            return (DelegateEvent) PARSER.parseFrom(bArr, m8);
        }

        public static DelegateEvent parseFrom(InputStream inputStream) {
            return (DelegateEvent) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static DelegateEvent parseFrom(InputStream inputStream, M m8) {
            return (DelegateEvent) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static DelegateEvent parseFrom(r rVar) {
            return (DelegateEvent) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static DelegateEvent parseFrom(r rVar, M m8) {
            return (DelegateEvent) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface DelegateEventOrBuilder extends N0 {
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

        String getInterface();

        AbstractC5235o getInterfaceBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        String getOperation();

        AbstractC5235o getOperationBytes();

        DialogAgentForwarderParam getParam();

        DialogAgentForwarderParamOrBuilder getParamOrBuilder();

        EventPayload getPayload();

        EventPayloadOrBuilder getPayloadOrBuilder();

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

        boolean hasPayload();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class DialogAgentForwarderParam extends AbstractC5209f0 implements DialogAgentForwarderParamOrBuilder {
        public static final int CHATBOT_FIELD_NUMBER = 1;
        public static final int INTENT_FIELD_NUMBER = 3;
        public static final int LANG_FIELD_NUMBER = 4;
        public static final int SESSION_ID_FIELD_NUMBER = 11;
        public static final int SKILL_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private volatile Object chatbot_;
        private volatile Object intent_;
        private int lang_;
        private byte memoizedIsInitialized;
        private long sessionId_;
        private volatile Object skill_;
        private static final DialogAgentForwarderParam DEFAULT_INSTANCE = new DialogAgentForwarderParam();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.EventOuterClass.DialogAgentForwarderParam.1
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public DialogAgentForwarderParam parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = DialogAgentForwarderParam.newBuilder();
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

        /* renamed from: maum.m2u.common.EventOuterClass$DialogAgentForwarderParam$1 */
        class AnonymousClass1 extends AbstractC5199c {
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public DialogAgentForwarderParam parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = DialogAgentForwarderParam.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements DialogAgentForwarderParamOrBuilder {
            private int bitField0_;
            private Object chatbot_;
            private Object intent_;
            private int lang_;
            private long sessionId_;
            private Object skill_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(DialogAgentForwarderParam dialogAgentForwarderParam) {
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    dialogAgentForwarderParam.chatbot_ = this.chatbot_;
                }
                if ((i8 & 2) != 0) {
                    dialogAgentForwarderParam.skill_ = this.skill_;
                }
                if ((i8 & 4) != 0) {
                    dialogAgentForwarderParam.intent_ = this.intent_;
                }
                if ((i8 & 8) != 0) {
                    dialogAgentForwarderParam.lang_ = this.lang_;
                }
                if ((i8 & 16) != 0) {
                    dialogAgentForwarderParam.sessionId_ = this.sessionId_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return EventOuterClass.internal_static_maum_m2u_common_DialogAgentForwarderParam_descriptor;
            }

            public Builder clearChatbot() {
                this.chatbot_ = DialogAgentForwarderParam.getDefaultInstance().getChatbot();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearIntent() {
                this.intent_ = DialogAgentForwarderParam.getDefaultInstance().getIntent();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearLang() {
                this.bitField0_ &= -9;
                this.lang_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSessionId() {
                this.bitField0_ &= -17;
                this.sessionId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearSkill() {
                this.skill_ = DialogAgentForwarderParam.getDefaultInstance().getSkill();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // maum.m2u.common.EventOuterClass.DialogAgentForwarderParamOrBuilder
            public String getChatbot() {
                Object obj = this.chatbot_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.chatbot_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.EventOuterClass.DialogAgentForwarderParamOrBuilder
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
                return EventOuterClass.internal_static_maum_m2u_common_DialogAgentForwarderParam_descriptor;
            }

            @Override // maum.m2u.common.EventOuterClass.DialogAgentForwarderParamOrBuilder
            public String getIntent() {
                Object obj = this.intent_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.intent_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.EventOuterClass.DialogAgentForwarderParamOrBuilder
            public AbstractC5235o getIntentBytes() {
                Object obj = this.intent_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.intent_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.EventOuterClass.DialogAgentForwarderParamOrBuilder
            public b.a getLang() {
                b.a aVarForNumber = b.a.forNumber(this.lang_);
                return aVarForNumber == null ? b.a.UNRECOGNIZED : aVarForNumber;
            }

            @Override // maum.m2u.common.EventOuterClass.DialogAgentForwarderParamOrBuilder
            public int getLangValue() {
                return this.lang_;
            }

            @Override // maum.m2u.common.EventOuterClass.DialogAgentForwarderParamOrBuilder
            public long getSessionId() {
                return this.sessionId_;
            }

            @Override // maum.m2u.common.EventOuterClass.DialogAgentForwarderParamOrBuilder
            public String getSkill() {
                Object obj = this.skill_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.skill_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.EventOuterClass.DialogAgentForwarderParamOrBuilder
            public AbstractC5235o getSkillBytes() {
                Object obj = this.skill_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.skill_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return EventOuterClass.internal_static_maum_m2u_common_DialogAgentForwarderParam_fieldAccessorTable.ensureFieldAccessorsInitialized(DialogAgentForwarderParam.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
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

            public Builder setIntent(String str) {
                str.getClass();
                this.intent_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setIntentBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.intent_ = abstractC5235o;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLang(b.a aVar) {
                aVar.getClass();
                this.bitField0_ |= 8;
                this.lang_ = aVar.getNumber();
                onChanged();
                return this;
            }

            public Builder setLangValue(int i8) {
                this.lang_ = i8;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSessionId(long j8) {
                this.sessionId_ = j8;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSkill(String str) {
                str.getClass();
                this.skill_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSkillBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.skill_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.chatbot_ = "";
                this.skill_ = "";
                this.intent_ = "";
                this.lang_ = 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public DialogAgentForwarderParam build() {
                DialogAgentForwarderParam dialogAgentForwarderParamBuildPartial = buildPartial();
                if (dialogAgentForwarderParamBuildPartial.isInitialized()) {
                    return dialogAgentForwarderParamBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) dialogAgentForwarderParamBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public DialogAgentForwarderParam buildPartial() {
                DialogAgentForwarderParam dialogAgentForwarderParam = new DialogAgentForwarderParam(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(dialogAgentForwarderParam);
                }
                onBuilt();
                return dialogAgentForwarderParam;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public DialogAgentForwarderParam getDefaultInstanceForType() {
                return DialogAgentForwarderParam.getDefaultInstance();
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
                this.skill_ = "";
                this.intent_ = "";
                this.lang_ = 0;
                this.sessionId_ = 0L;
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof DialogAgentForwarderParam) {
                    return mergeFrom((DialogAgentForwarderParam) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.chatbot_ = "";
                this.skill_ = "";
                this.intent_ = "";
                this.lang_ = 0;
            }

            public Builder mergeFrom(DialogAgentForwarderParam dialogAgentForwarderParam) {
                if (dialogAgentForwarderParam == DialogAgentForwarderParam.getDefaultInstance()) {
                    return this;
                }
                if (!dialogAgentForwarderParam.getChatbot().isEmpty()) {
                    this.chatbot_ = dialogAgentForwarderParam.chatbot_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!dialogAgentForwarderParam.getSkill().isEmpty()) {
                    this.skill_ = dialogAgentForwarderParam.skill_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!dialogAgentForwarderParam.getIntent().isEmpty()) {
                    this.intent_ = dialogAgentForwarderParam.intent_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (dialogAgentForwarderParam.lang_ != 0) {
                    setLangValue(dialogAgentForwarderParam.getLangValue());
                }
                if (dialogAgentForwarderParam.getSessionId() != 0) {
                    setSessionId(dialogAgentForwarderParam.getSessionId());
                }
                mergeUnknownFields(dialogAgentForwarderParam.getUnknownFields());
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
                                } else if (tag == 18) {
                                    this.skill_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.intent_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.lang_ = rVar.readEnum();
                                    this.bitField0_ |= 8;
                                } else if (tag != 88) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.sessionId_ = rVar.readInt64();
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

        /* synthetic */ DialogAgentForwarderParam(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static DialogAgentForwarderParam getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return EventOuterClass.internal_static_maum_m2u_common_DialogAgentForwarderParam_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DialogAgentForwarderParam parseDelimitedFrom(InputStream inputStream) {
            return (DialogAgentForwarderParam) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DialogAgentForwarderParam parseFrom(ByteBuffer byteBuffer) {
            return (DialogAgentForwarderParam) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DialogAgentForwarderParam)) {
                return super.equals(obj);
            }
            DialogAgentForwarderParam dialogAgentForwarderParam = (DialogAgentForwarderParam) obj;
            return getChatbot().equals(dialogAgentForwarderParam.getChatbot()) && getSkill().equals(dialogAgentForwarderParam.getSkill()) && getIntent().equals(dialogAgentForwarderParam.getIntent()) && this.lang_ == dialogAgentForwarderParam.lang_ && getSessionId() == dialogAgentForwarderParam.getSessionId() && getUnknownFields().equals(dialogAgentForwarderParam.getUnknownFields());
        }

        @Override // maum.m2u.common.EventOuterClass.DialogAgentForwarderParamOrBuilder
        public String getChatbot() {
            Object obj = this.chatbot_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.chatbot_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.EventOuterClass.DialogAgentForwarderParamOrBuilder
        public AbstractC5235o getChatbotBytes() {
            Object obj = this.chatbot_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.chatbot_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.EventOuterClass.DialogAgentForwarderParamOrBuilder
        public String getIntent() {
            Object obj = this.intent_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.intent_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.EventOuterClass.DialogAgentForwarderParamOrBuilder
        public AbstractC5235o getIntentBytes() {
            Object obj = this.intent_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.intent_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.EventOuterClass.DialogAgentForwarderParamOrBuilder
        public b.a getLang() {
            b.a aVarForNumber = b.a.forNumber(this.lang_);
            return aVarForNumber == null ? b.a.UNRECOGNIZED : aVarForNumber;
        }

        @Override // maum.m2u.common.EventOuterClass.DialogAgentForwarderParamOrBuilder
        public int getLangValue() {
            return this.lang_;
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
            if (!AbstractC5209f0.isStringEmpty(this.skill_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.skill_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.intent_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(3, this.intent_);
            }
            if (this.lang_ != b.a.ko_KR.getNumber()) {
                iComputeStringSize += AbstractC5248t.computeEnumSize(4, this.lang_);
            }
            long j8 = this.sessionId_;
            if (j8 != 0) {
                iComputeStringSize += AbstractC5248t.computeInt64Size(11, j8);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.EventOuterClass.DialogAgentForwarderParamOrBuilder
        public long getSessionId() {
            return this.sessionId_;
        }

        @Override // maum.m2u.common.EventOuterClass.DialogAgentForwarderParamOrBuilder
        public String getSkill() {
            Object obj = this.skill_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.skill_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.EventOuterClass.DialogAgentForwarderParamOrBuilder
        public AbstractC5235o getSkillBytes() {
            Object obj = this.skill_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.skill_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getChatbot().hashCode()) * 37) + 2) * 53) + getSkill().hashCode()) * 37) + 3) * 53) + getIntent().hashCode()) * 37) + 4) * 53) + this.lang_) * 37) + 11) * 53) + AbstractC5227l0.hashLong(getSessionId())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return EventOuterClass.internal_static_maum_m2u_common_DialogAgentForwarderParam_fieldAccessorTable.ensureFieldAccessorsInitialized(DialogAgentForwarderParam.class, Builder.class);
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
            return new DialogAgentForwarderParam();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.chatbot_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.chatbot_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.skill_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.skill_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.intent_)) {
                AbstractC5209f0.writeString(abstractC5248t, 3, this.intent_);
            }
            if (this.lang_ != b.a.ko_KR.getNumber()) {
                abstractC5248t.writeEnum(4, this.lang_);
            }
            long j8 = this.sessionId_;
            if (j8 != 0) {
                abstractC5248t.writeInt64(11, j8);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private DialogAgentForwarderParam(AbstractC5209f0.b bVar) {
            super(bVar);
            this.chatbot_ = "";
            this.skill_ = "";
            this.intent_ = "";
            this.lang_ = 0;
            this.sessionId_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(DialogAgentForwarderParam dialogAgentForwarderParam) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dialogAgentForwarderParam);
        }

        public static DialogAgentForwarderParam parseFrom(ByteBuffer byteBuffer, M m8) {
            return (DialogAgentForwarderParam) PARSER.parseFrom(byteBuffer, m8);
        }

        public static DialogAgentForwarderParam parseDelimitedFrom(InputStream inputStream, M m8) {
            return (DialogAgentForwarderParam) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static DialogAgentForwarderParam parseFrom(AbstractC5235o abstractC5235o) {
            return (DialogAgentForwarderParam) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public DialogAgentForwarderParam getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((AnonymousClass1) null) : new Builder((AnonymousClass1) null).mergeFrom(this);
        }

        public static DialogAgentForwarderParam parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (DialogAgentForwarderParam) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DialogAgentForwarderParam parseFrom(byte[] bArr) {
            return (DialogAgentForwarderParam) PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static DialogAgentForwarderParam parseFrom(byte[] bArr, M m8) {
            return (DialogAgentForwarderParam) PARSER.parseFrom(bArr, m8);
        }

        public static DialogAgentForwarderParam parseFrom(InputStream inputStream) {
            return (DialogAgentForwarderParam) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        private DialogAgentForwarderParam() {
            this.chatbot_ = "";
            this.skill_ = "";
            this.intent_ = "";
            this.lang_ = 0;
            this.sessionId_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
            this.chatbot_ = "";
            this.skill_ = "";
            this.intent_ = "";
            this.lang_ = 0;
        }

        public static DialogAgentForwarderParam parseFrom(InputStream inputStream, M m8) {
            return (DialogAgentForwarderParam) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static DialogAgentForwarderParam parseFrom(r rVar) {
            return (DialogAgentForwarderParam) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static DialogAgentForwarderParam parseFrom(r rVar, M m8) {
            return (DialogAgentForwarderParam) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface DialogAgentForwarderParamOrBuilder extends N0 {
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

        String getIntent();

        AbstractC5235o getIntentBytes();

        b.a getLang();

        int getLangValue();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        long getSessionId();

        String getSkill();

        AbstractC5235o getSkillBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class Event extends AbstractC5209f0 implements EventOrBuilder {
        public static final int INTERFACE_FIELD_NUMBER = 1;
        public static final int OPERATION_FIELD_NUMBER = 2;
        public static final int PARAM_FIELD_NUMBER = 3;
        public static final int PAYLOAD_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object interface_;
        private byte memoizedIsInitialized;
        private volatile Object operation_;
        private DialogAgentForwarderParam param_;
        private EventPayload payload_;
        private static final Event DEFAULT_INSTANCE = new Event();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.EventOuterClass.Event.1
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public Event parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = Event.newBuilder();
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

        /* renamed from: maum.m2u.common.EventOuterClass$Event$1 */
        class AnonymousClass1 extends AbstractC5199c {
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public Event parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = Event.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements EventOrBuilder {
            private int bitField0_;
            private Object interface_;
            private Object operation_;
            private C5228l1 paramBuilder_;
            private DialogAgentForwarderParam param_;
            private C5228l1 payloadBuilder_;
            private EventPayload payload_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(Event event) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    event.interface_ = this.interface_;
                }
                if ((i9 & 2) != 0) {
                    event.operation_ = this.operation_;
                }
                if ((i9 & 4) != 0) {
                    C5228l1 c5228l1 = this.paramBuilder_;
                    event.param_ = c5228l1 == null ? this.param_ : (DialogAgentForwarderParam) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if ((i9 & 8) != 0) {
                    C5228l1 c5228l12 = this.payloadBuilder_;
                    event.payload_ = c5228l12 == null ? this.payload_ : (EventPayload) c5228l12.build();
                    i8 |= 2;
                }
                Event.access$1076(event, i8);
            }

            public static final C5269x.b getDescriptor() {
                return EventOuterClass.internal_static_maum_m2u_common_Event_descriptor;
            }

            private C5228l1 getParamFieldBuilder() {
                if (this.paramBuilder_ == null) {
                    this.paramBuilder_ = new C5228l1(getParam(), getParentForChildren(), isClean());
                    this.param_ = null;
                }
                return this.paramBuilder_;
            }

            private C5228l1 getPayloadFieldBuilder() {
                if (this.payloadBuilder_ == null) {
                    this.payloadBuilder_ = new C5228l1(getPayload(), getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                return this.payloadBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getParamFieldBuilder();
                    getPayloadFieldBuilder();
                }
            }

            public Builder clearInterface() {
                this.interface_ = Event.getDefaultInstance().getInterface();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearOperation() {
                this.operation_ = Event.getDefaultInstance().getOperation();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearParam() {
                this.bitField0_ &= -5;
                this.param_ = null;
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.paramBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPayload() {
                this.bitField0_ &= -9;
                this.payload_ = null;
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.payloadBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return EventOuterClass.internal_static_maum_m2u_common_Event_descriptor;
            }

            @Override // maum.m2u.common.EventOuterClass.EventOrBuilder
            public String getInterface() {
                Object obj = this.interface_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.interface_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.EventOuterClass.EventOrBuilder
            public AbstractC5235o getInterfaceBytes() {
                Object obj = this.interface_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.interface_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.EventOuterClass.EventOrBuilder
            public String getOperation() {
                Object obj = this.operation_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.operation_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.EventOuterClass.EventOrBuilder
            public AbstractC5235o getOperationBytes() {
                Object obj = this.operation_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.operation_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.EventOuterClass.EventOrBuilder
            public DialogAgentForwarderParam getParam() {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    return (DialogAgentForwarderParam) c5228l1.getMessage();
                }
                DialogAgentForwarderParam dialogAgentForwarderParam = this.param_;
                return dialogAgentForwarderParam == null ? DialogAgentForwarderParam.getDefaultInstance() : dialogAgentForwarderParam;
            }

            public DialogAgentForwarderParam.Builder getParamBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (DialogAgentForwarderParam.Builder) getParamFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.EventOuterClass.EventOrBuilder
            public DialogAgentForwarderParamOrBuilder getParamOrBuilder() {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    return (DialogAgentForwarderParamOrBuilder) c5228l1.getMessageOrBuilder();
                }
                DialogAgentForwarderParam dialogAgentForwarderParam = this.param_;
                return dialogAgentForwarderParam == null ? DialogAgentForwarderParam.getDefaultInstance() : dialogAgentForwarderParam;
            }

            @Override // maum.m2u.common.EventOuterClass.EventOrBuilder
            public EventPayload getPayload() {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    return (EventPayload) c5228l1.getMessage();
                }
                EventPayload eventPayload = this.payload_;
                return eventPayload == null ? EventPayload.getDefaultInstance() : eventPayload;
            }

            public EventPayload.Builder getPayloadBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (EventPayload.Builder) getPayloadFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.EventOuterClass.EventOrBuilder
            public EventPayloadOrBuilder getPayloadOrBuilder() {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    return (EventPayloadOrBuilder) c5228l1.getMessageOrBuilder();
                }
                EventPayload eventPayload = this.payload_;
                return eventPayload == null ? EventPayload.getDefaultInstance() : eventPayload;
            }

            @Override // maum.m2u.common.EventOuterClass.EventOrBuilder
            public boolean hasParam() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // maum.m2u.common.EventOuterClass.EventOrBuilder
            public boolean hasPayload() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return EventOuterClass.internal_static_maum_m2u_common_Event_fieldAccessorTable.ensureFieldAccessorsInitialized(Event.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeParam(DialogAgentForwarderParam dialogAgentForwarderParam) {
                DialogAgentForwarderParam dialogAgentForwarderParam2;
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(dialogAgentForwarderParam);
                } else if ((this.bitField0_ & 4) == 0 || (dialogAgentForwarderParam2 = this.param_) == null || dialogAgentForwarderParam2 == DialogAgentForwarderParam.getDefaultInstance()) {
                    this.param_ = dialogAgentForwarderParam;
                } else {
                    getParamBuilder().mergeFrom(dialogAgentForwarderParam);
                }
                if (this.param_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergePayload(EventPayload eventPayload) {
                EventPayload eventPayload2;
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(eventPayload);
                } else if ((this.bitField0_ & 8) == 0 || (eventPayload2 = this.payload_) == null || eventPayload2 == EventPayload.getDefaultInstance()) {
                    this.payload_ = eventPayload;
                } else {
                    getPayloadBuilder().mergeFrom(eventPayload);
                }
                if (this.payload_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder setInterface(String str) {
                str.getClass();
                this.interface_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setInterfaceBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.interface_ = abstractC5235o;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setOperation(String str) {
                str.getClass();
                this.operation_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setOperationBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.operation_ = abstractC5235o;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setParam(DialogAgentForwarderParam dialogAgentForwarderParam) {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 == null) {
                    dialogAgentForwarderParam.getClass();
                    this.param_ = dialogAgentForwarderParam;
                } else {
                    c5228l1.setMessage(dialogAgentForwarderParam);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPayload(EventPayload eventPayload) {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 == null) {
                    eventPayload.getClass();
                    this.payload_ = eventPayload;
                } else {
                    c5228l1.setMessage(eventPayload);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.interface_ = "";
                this.operation_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Event build() {
                Event eventBuildPartial = buildPartial();
                if (eventBuildPartial.isInitialized()) {
                    return eventBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) eventBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Event buildPartial() {
                Event event = new Event(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(event);
                }
                onBuilt();
                return event;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public Event getDefaultInstanceForType() {
                return Event.getDefaultInstance();
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
                this.interface_ = "";
                this.operation_ = "";
                this.param_ = null;
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.paramBuilder_ = null;
                }
                this.payload_ = null;
                C5228l1 c5228l12 = this.payloadBuilder_;
                if (c5228l12 != null) {
                    c5228l12.dispose();
                    this.payloadBuilder_ = null;
                }
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.interface_ = "";
                this.operation_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof Event) {
                    return mergeFrom((Event) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setParam(DialogAgentForwarderParam.Builder builder) {
                C5228l1 c5228l1 = this.paramBuilder_;
                if (c5228l1 == null) {
                    this.param_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPayload(EventPayload.Builder builder) {
                C5228l1 c5228l1 = this.payloadBuilder_;
                if (c5228l1 == null) {
                    this.payload_ = builder.build();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder mergeFrom(Event event) {
                if (event == Event.getDefaultInstance()) {
                    return this;
                }
                if (!event.getInterface().isEmpty()) {
                    this.interface_ = event.interface_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!event.getOperation().isEmpty()) {
                    this.operation_ = event.operation_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (event.hasParam()) {
                    mergeParam(event.getParam());
                }
                if (event.hasPayload()) {
                    mergePayload(event.getPayload());
                }
                mergeUnknownFields(event.getUnknownFields());
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
                                    this.interface_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.operation_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    rVar.readMessage(getParamFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 4;
                                } else if (tag != 34) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getPayloadFieldBuilder().getBuilder(), m8);
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

        /* synthetic */ Event(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$1076(Event event, int i8) {
            int i9 = i8 | event.bitField0_;
            event.bitField0_ = i9;
            return i9;
        }

        public static Event getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return EventOuterClass.internal_static_maum_m2u_common_Event_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Event parseDelimitedFrom(InputStream inputStream) {
            return (Event) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Event parseFrom(ByteBuffer byteBuffer) {
            return (Event) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Event)) {
                return super.equals(obj);
            }
            Event event = (Event) obj;
            if (!getInterface().equals(event.getInterface()) || !getOperation().equals(event.getOperation()) || hasParam() != event.hasParam()) {
                return false;
            }
            if ((!hasParam() || getParam().equals(event.getParam())) && hasPayload() == event.hasPayload()) {
                return (!hasPayload() || getPayload().equals(event.getPayload())) && getUnknownFields().equals(event.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.EventOuterClass.EventOrBuilder
        public String getInterface() {
            Object obj = this.interface_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.interface_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.EventOuterClass.EventOrBuilder
        public AbstractC5235o getInterfaceBytes() {
            Object obj = this.interface_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.interface_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.EventOuterClass.EventOrBuilder
        public String getOperation() {
            Object obj = this.operation_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.operation_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.EventOuterClass.EventOrBuilder
        public AbstractC5235o getOperationBytes() {
            Object obj = this.operation_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.operation_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.EventOuterClass.EventOrBuilder
        public DialogAgentForwarderParam getParam() {
            DialogAgentForwarderParam dialogAgentForwarderParam = this.param_;
            return dialogAgentForwarderParam == null ? DialogAgentForwarderParam.getDefaultInstance() : dialogAgentForwarderParam;
        }

        @Override // maum.m2u.common.EventOuterClass.EventOrBuilder
        public DialogAgentForwarderParamOrBuilder getParamOrBuilder() {
            DialogAgentForwarderParam dialogAgentForwarderParam = this.param_;
            return dialogAgentForwarderParam == null ? DialogAgentForwarderParam.getDefaultInstance() : dialogAgentForwarderParam;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.common.EventOuterClass.EventOrBuilder
        public EventPayload getPayload() {
            EventPayload eventPayload = this.payload_;
            return eventPayload == null ? EventPayload.getDefaultInstance() : eventPayload;
        }

        @Override // maum.m2u.common.EventOuterClass.EventOrBuilder
        public EventPayloadOrBuilder getPayloadOrBuilder() {
            EventPayload eventPayload = this.payload_;
            return eventPayload == null ? EventPayload.getDefaultInstance() : eventPayload;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.interface_) ? AbstractC5209f0.computeStringSize(1, this.interface_) : 0;
            if (!AbstractC5209f0.isStringEmpty(this.operation_)) {
                iComputeStringSize += AbstractC5209f0.computeStringSize(2, this.operation_);
            }
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(3, getParam());
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(4, getPayload());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.EventOuterClass.EventOrBuilder
        public boolean hasParam() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // maum.m2u.common.EventOuterClass.EventOrBuilder
        public boolean hasPayload() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getInterface().hashCode()) * 37) + 2) * 53) + getOperation().hashCode();
            if (hasParam()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getParam().hashCode();
            }
            if (hasPayload()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getPayload().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return EventOuterClass.internal_static_maum_m2u_common_Event_fieldAccessorTable.ensureFieldAccessorsInitialized(Event.class, Builder.class);
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
            return new Event();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.interface_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.interface_);
            }
            if (!AbstractC5209f0.isStringEmpty(this.operation_)) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.operation_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(3, getParam());
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC5248t.writeMessage(4, getPayload());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private Event(AbstractC5209f0.b bVar) {
            super(bVar);
            this.interface_ = "";
            this.operation_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(Event event) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(event);
        }

        public static Event parseFrom(ByteBuffer byteBuffer, M m8) {
            return (Event) PARSER.parseFrom(byteBuffer, m8);
        }

        public static Event parseDelimitedFrom(InputStream inputStream, M m8) {
            return (Event) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static Event parseFrom(AbstractC5235o abstractC5235o) {
            return (Event) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public Event getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((AnonymousClass1) null) : new Builder((AnonymousClass1) null).mergeFrom(this);
        }

        public static Event parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (Event) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Event parseFrom(byte[] bArr) {
            return (Event) PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        private Event() {
            this.interface_ = "";
            this.operation_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.interface_ = "";
            this.operation_ = "";
        }

        public static Event parseFrom(byte[] bArr, M m8) {
            return (Event) PARSER.parseFrom(bArr, m8);
        }

        public static Event parseFrom(InputStream inputStream) {
            return (Event) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static Event parseFrom(InputStream inputStream, M m8) {
            return (Event) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static Event parseFrom(r rVar) {
            return (Event) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static Event parseFrom(r rVar, M m8) {
            return (Event) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface EventOrBuilder extends N0 {
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

        String getInterface();

        AbstractC5235o getInterfaceBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        String getOperation();

        AbstractC5235o getOperationBytes();

        DialogAgentForwarderParam getParam();

        DialogAgentForwarderParamOrBuilder getParamOrBuilder();

        EventPayload getPayload();

        EventPayloadOrBuilder getPayloadOrBuilder();

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

        boolean hasPayload();

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class EventPayload extends AbstractC5209f0 implements EventPayloadOrBuilder {
        public static final int AUDIO_PLAYER_PLAY_FIELD_NUMBER = 14;
        public static final int LAUNCHER_AUTHORIZED_FIELD_NUMBER = 11;
        public static final int LAUNCHER_AUTHORIZE_FAILED_FIELD_NUMBER = 12;
        public static final int LAUNCHER_DOCUMENT_READ_FIELD_NUMBER = 15;
        public static final int LAUNCHER_SLOTS_FILLED_FIELD_NUMBER = 13;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int testEventCase_;
        private Object testEvent_;
        private static final EventPayload DEFAULT_INSTANCE = new EventPayload();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.EventOuterClass.EventPayload.1
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public EventPayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = EventPayload.newBuilder();
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

        /* renamed from: maum.m2u.common.EventOuterClass$EventPayload$1 */
        class AnonymousClass1 extends AbstractC5199c {
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public EventPayload parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = EventPayload.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements EventPayloadOrBuilder {
            private C5228l1 audioPlayerPlayBuilder_;
            private int bitField0_;
            private C5228l1 launcherAuthorizeFailedBuilder_;
            private C5228l1 launcherAuthorizedBuilder_;
            private C5228l1 launcherDocumentReadBuilder_;
            private C5228l1 launcherSlotsFilledBuilder_;
            private int testEventCase_;
            private Object testEvent_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(EventPayload eventPayload) {
            }

            private void buildPartialOneofs(EventPayload eventPayload) {
                C5228l1 c5228l1;
                C5228l1 c5228l12;
                C5228l1 c5228l13;
                C5228l1 c5228l14;
                C5228l1 c5228l15;
                eventPayload.testEventCase_ = this.testEventCase_;
                eventPayload.testEvent_ = this.testEvent_;
                if (this.testEventCase_ == 11 && (c5228l15 = this.launcherAuthorizedBuilder_) != null) {
                    eventPayload.testEvent_ = c5228l15.build();
                }
                if (this.testEventCase_ == 12 && (c5228l14 = this.launcherAuthorizeFailedBuilder_) != null) {
                    eventPayload.testEvent_ = c5228l14.build();
                }
                if (this.testEventCase_ == 13 && (c5228l13 = this.launcherSlotsFilledBuilder_) != null) {
                    eventPayload.testEvent_ = c5228l13.build();
                }
                if (this.testEventCase_ == 14 && (c5228l12 = this.audioPlayerPlayBuilder_) != null) {
                    eventPayload.testEvent_ = c5228l12.build();
                }
                if (this.testEventCase_ != 15 || (c5228l1 = this.launcherDocumentReadBuilder_) == null) {
                    return;
                }
                eventPayload.testEvent_ = c5228l1.build();
            }

            private C5228l1 getAudioPlayerPlayFieldBuilder() {
                if (this.audioPlayerPlayBuilder_ == null) {
                    if (this.testEventCase_ != 14) {
                        this.testEvent_ = AudioPlayerPlay.getDefaultInstance();
                    }
                    this.audioPlayerPlayBuilder_ = new C5228l1((AudioPlayerPlay) this.testEvent_, getParentForChildren(), isClean());
                    this.testEvent_ = null;
                }
                this.testEventCase_ = 14;
                onChanged();
                return this.audioPlayerPlayBuilder_;
            }

            public static final C5269x.b getDescriptor() {
                return EventOuterClass.internal_static_maum_m2u_common_EventPayload_descriptor;
            }

            private C5228l1 getLauncherAuthorizeFailedFieldBuilder() {
                if (this.launcherAuthorizeFailedBuilder_ == null) {
                    if (this.testEventCase_ != 12) {
                        this.testEvent_ = LauncherAuthorizeFailed.getDefaultInstance();
                    }
                    this.launcherAuthorizeFailedBuilder_ = new C5228l1((LauncherAuthorizeFailed) this.testEvent_, getParentForChildren(), isClean());
                    this.testEvent_ = null;
                }
                this.testEventCase_ = 12;
                onChanged();
                return this.launcherAuthorizeFailedBuilder_;
            }

            private C5228l1 getLauncherAuthorizedFieldBuilder() {
                if (this.launcherAuthorizedBuilder_ == null) {
                    if (this.testEventCase_ != 11) {
                        this.testEvent_ = LauncherAuthorized.getDefaultInstance();
                    }
                    this.launcherAuthorizedBuilder_ = new C5228l1((LauncherAuthorized) this.testEvent_, getParentForChildren(), isClean());
                    this.testEvent_ = null;
                }
                this.testEventCase_ = 11;
                onChanged();
                return this.launcherAuthorizedBuilder_;
            }

            private C5228l1 getLauncherDocumentReadFieldBuilder() {
                if (this.launcherDocumentReadBuilder_ == null) {
                    if (this.testEventCase_ != 15) {
                        this.testEvent_ = LauncherDocumentRead.getDefaultInstance();
                    }
                    this.launcherDocumentReadBuilder_ = new C5228l1((LauncherDocumentRead) this.testEvent_, getParentForChildren(), isClean());
                    this.testEvent_ = null;
                }
                this.testEventCase_ = 15;
                onChanged();
                return this.launcherDocumentReadBuilder_;
            }

            private C5228l1 getLauncherSlotsFilledFieldBuilder() {
                if (this.launcherSlotsFilledBuilder_ == null) {
                    if (this.testEventCase_ != 13) {
                        this.testEvent_ = LauncherSlotsFilled.getDefaultInstance();
                    }
                    this.launcherSlotsFilledBuilder_ = new C5228l1((LauncherSlotsFilled) this.testEvent_, getParentForChildren(), isClean());
                    this.testEvent_ = null;
                }
                this.testEventCase_ = 13;
                onChanged();
                return this.launcherSlotsFilledBuilder_;
            }

            public Builder clearAudioPlayerPlay() {
                C5228l1 c5228l1 = this.audioPlayerPlayBuilder_;
                if (c5228l1 != null) {
                    if (this.testEventCase_ == 14) {
                        this.testEventCase_ = 0;
                        this.testEvent_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testEventCase_ == 14) {
                    this.testEventCase_ = 0;
                    this.testEvent_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearLauncherAuthorizeFailed() {
                C5228l1 c5228l1 = this.launcherAuthorizeFailedBuilder_;
                if (c5228l1 != null) {
                    if (this.testEventCase_ == 12) {
                        this.testEventCase_ = 0;
                        this.testEvent_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testEventCase_ == 12) {
                    this.testEventCase_ = 0;
                    this.testEvent_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearLauncherAuthorized() {
                C5228l1 c5228l1 = this.launcherAuthorizedBuilder_;
                if (c5228l1 != null) {
                    if (this.testEventCase_ == 11) {
                        this.testEventCase_ = 0;
                        this.testEvent_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testEventCase_ == 11) {
                    this.testEventCase_ = 0;
                    this.testEvent_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearLauncherDocumentRead() {
                C5228l1 c5228l1 = this.launcherDocumentReadBuilder_;
                if (c5228l1 != null) {
                    if (this.testEventCase_ == 15) {
                        this.testEventCase_ = 0;
                        this.testEvent_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testEventCase_ == 15) {
                    this.testEventCase_ = 0;
                    this.testEvent_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearLauncherSlotsFilled() {
                C5228l1 c5228l1 = this.launcherSlotsFilledBuilder_;
                if (c5228l1 != null) {
                    if (this.testEventCase_ == 13) {
                        this.testEventCase_ = 0;
                        this.testEvent_ = null;
                    }
                    c5228l1.clear();
                } else if (this.testEventCase_ == 13) {
                    this.testEventCase_ = 0;
                    this.testEvent_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearTestEvent() {
                this.testEventCase_ = 0;
                this.testEvent_ = null;
                onChanged();
                return this;
            }

            @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
            public AudioPlayerPlay getAudioPlayerPlay() {
                C5228l1 c5228l1 = this.audioPlayerPlayBuilder_;
                return c5228l1 == null ? this.testEventCase_ == 14 ? (AudioPlayerPlay) this.testEvent_ : AudioPlayerPlay.getDefaultInstance() : this.testEventCase_ == 14 ? (AudioPlayerPlay) c5228l1.getMessage() : AudioPlayerPlay.getDefaultInstance();
            }

            public AudioPlayerPlay.Builder getAudioPlayerPlayBuilder() {
                return (AudioPlayerPlay.Builder) getAudioPlayerPlayFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
            public AudioPlayerPlayOrBuilder getAudioPlayerPlayOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testEventCase_;
                return (i8 != 14 || (c5228l1 = this.audioPlayerPlayBuilder_) == null) ? i8 == 14 ? (AudioPlayerPlay) this.testEvent_ : AudioPlayerPlay.getDefaultInstance() : (AudioPlayerPlayOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return EventOuterClass.internal_static_maum_m2u_common_EventPayload_descriptor;
            }

            @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
            public LauncherAuthorizeFailed getLauncherAuthorizeFailed() {
                C5228l1 c5228l1 = this.launcherAuthorizeFailedBuilder_;
                return c5228l1 == null ? this.testEventCase_ == 12 ? (LauncherAuthorizeFailed) this.testEvent_ : LauncherAuthorizeFailed.getDefaultInstance() : this.testEventCase_ == 12 ? (LauncherAuthorizeFailed) c5228l1.getMessage() : LauncherAuthorizeFailed.getDefaultInstance();
            }

            public LauncherAuthorizeFailed.Builder getLauncherAuthorizeFailedBuilder() {
                return (LauncherAuthorizeFailed.Builder) getLauncherAuthorizeFailedFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
            public LauncherAuthorizeFailedOrBuilder getLauncherAuthorizeFailedOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testEventCase_;
                return (i8 != 12 || (c5228l1 = this.launcherAuthorizeFailedBuilder_) == null) ? i8 == 12 ? (LauncherAuthorizeFailed) this.testEvent_ : LauncherAuthorizeFailed.getDefaultInstance() : (LauncherAuthorizeFailedOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
            public LauncherAuthorized getLauncherAuthorized() {
                C5228l1 c5228l1 = this.launcherAuthorizedBuilder_;
                return c5228l1 == null ? this.testEventCase_ == 11 ? (LauncherAuthorized) this.testEvent_ : LauncherAuthorized.getDefaultInstance() : this.testEventCase_ == 11 ? (LauncherAuthorized) c5228l1.getMessage() : LauncherAuthorized.getDefaultInstance();
            }

            public LauncherAuthorized.Builder getLauncherAuthorizedBuilder() {
                return (LauncherAuthorized.Builder) getLauncherAuthorizedFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
            public LauncherAuthorizedOrBuilder getLauncherAuthorizedOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testEventCase_;
                return (i8 != 11 || (c5228l1 = this.launcherAuthorizedBuilder_) == null) ? i8 == 11 ? (LauncherAuthorized) this.testEvent_ : LauncherAuthorized.getDefaultInstance() : (LauncherAuthorizedOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
            public LauncherDocumentRead getLauncherDocumentRead() {
                C5228l1 c5228l1 = this.launcherDocumentReadBuilder_;
                return c5228l1 == null ? this.testEventCase_ == 15 ? (LauncherDocumentRead) this.testEvent_ : LauncherDocumentRead.getDefaultInstance() : this.testEventCase_ == 15 ? (LauncherDocumentRead) c5228l1.getMessage() : LauncherDocumentRead.getDefaultInstance();
            }

            public LauncherDocumentRead.Builder getLauncherDocumentReadBuilder() {
                return (LauncherDocumentRead.Builder) getLauncherDocumentReadFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
            public LauncherDocumentReadOrBuilder getLauncherDocumentReadOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testEventCase_;
                return (i8 != 15 || (c5228l1 = this.launcherDocumentReadBuilder_) == null) ? i8 == 15 ? (LauncherDocumentRead) this.testEvent_ : LauncherDocumentRead.getDefaultInstance() : (LauncherDocumentReadOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
            public LauncherSlotsFilled getLauncherSlotsFilled() {
                C5228l1 c5228l1 = this.launcherSlotsFilledBuilder_;
                return c5228l1 == null ? this.testEventCase_ == 13 ? (LauncherSlotsFilled) this.testEvent_ : LauncherSlotsFilled.getDefaultInstance() : this.testEventCase_ == 13 ? (LauncherSlotsFilled) c5228l1.getMessage() : LauncherSlotsFilled.getDefaultInstance();
            }

            public LauncherSlotsFilled.Builder getLauncherSlotsFilledBuilder() {
                return (LauncherSlotsFilled.Builder) getLauncherSlotsFilledFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
            public LauncherSlotsFilledOrBuilder getLauncherSlotsFilledOrBuilder() {
                C5228l1 c5228l1;
                int i8 = this.testEventCase_;
                return (i8 != 13 || (c5228l1 = this.launcherSlotsFilledBuilder_) == null) ? i8 == 13 ? (LauncherSlotsFilled) this.testEvent_ : LauncherSlotsFilled.getDefaultInstance() : (LauncherSlotsFilledOrBuilder) c5228l1.getMessageOrBuilder();
            }

            @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
            public TestEventCase getTestEventCase() {
                return TestEventCase.forNumber(this.testEventCase_);
            }

            @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
            public boolean hasAudioPlayerPlay() {
                return this.testEventCase_ == 14;
            }

            @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
            public boolean hasLauncherAuthorizeFailed() {
                return this.testEventCase_ == 12;
            }

            @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
            public boolean hasLauncherAuthorized() {
                return this.testEventCase_ == 11;
            }

            @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
            public boolean hasLauncherDocumentRead() {
                return this.testEventCase_ == 15;
            }

            @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
            public boolean hasLauncherSlotsFilled() {
                return this.testEventCase_ == 13;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return EventOuterClass.internal_static_maum_m2u_common_EventPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(EventPayload.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAudioPlayerPlay(AudioPlayerPlay audioPlayerPlay) {
                C5228l1 c5228l1 = this.audioPlayerPlayBuilder_;
                if (c5228l1 == null) {
                    if (this.testEventCase_ != 14 || this.testEvent_ == AudioPlayerPlay.getDefaultInstance()) {
                        this.testEvent_ = audioPlayerPlay;
                    } else {
                        this.testEvent_ = AudioPlayerPlay.newBuilder((AudioPlayerPlay) this.testEvent_).mergeFrom(audioPlayerPlay).buildPartial();
                    }
                    onChanged();
                } else if (this.testEventCase_ == 14) {
                    c5228l1.mergeFrom(audioPlayerPlay);
                } else {
                    c5228l1.setMessage(audioPlayerPlay);
                }
                this.testEventCase_ = 14;
                return this;
            }

            public Builder mergeLauncherAuthorizeFailed(LauncherAuthorizeFailed launcherAuthorizeFailed) {
                C5228l1 c5228l1 = this.launcherAuthorizeFailedBuilder_;
                if (c5228l1 == null) {
                    if (this.testEventCase_ != 12 || this.testEvent_ == LauncherAuthorizeFailed.getDefaultInstance()) {
                        this.testEvent_ = launcherAuthorizeFailed;
                    } else {
                        this.testEvent_ = LauncherAuthorizeFailed.newBuilder((LauncherAuthorizeFailed) this.testEvent_).mergeFrom(launcherAuthorizeFailed).buildPartial();
                    }
                    onChanged();
                } else if (this.testEventCase_ == 12) {
                    c5228l1.mergeFrom(launcherAuthorizeFailed);
                } else {
                    c5228l1.setMessage(launcherAuthorizeFailed);
                }
                this.testEventCase_ = 12;
                return this;
            }

            public Builder mergeLauncherAuthorized(LauncherAuthorized launcherAuthorized) {
                C5228l1 c5228l1 = this.launcherAuthorizedBuilder_;
                if (c5228l1 == null) {
                    if (this.testEventCase_ != 11 || this.testEvent_ == LauncherAuthorized.getDefaultInstance()) {
                        this.testEvent_ = launcherAuthorized;
                    } else {
                        this.testEvent_ = LauncherAuthorized.newBuilder((LauncherAuthorized) this.testEvent_).mergeFrom(launcherAuthorized).buildPartial();
                    }
                    onChanged();
                } else if (this.testEventCase_ == 11) {
                    c5228l1.mergeFrom(launcherAuthorized);
                } else {
                    c5228l1.setMessage(launcherAuthorized);
                }
                this.testEventCase_ = 11;
                return this;
            }

            public Builder mergeLauncherDocumentRead(LauncherDocumentRead launcherDocumentRead) {
                C5228l1 c5228l1 = this.launcherDocumentReadBuilder_;
                if (c5228l1 == null) {
                    if (this.testEventCase_ != 15 || this.testEvent_ == LauncherDocumentRead.getDefaultInstance()) {
                        this.testEvent_ = launcherDocumentRead;
                    } else {
                        this.testEvent_ = LauncherDocumentRead.newBuilder((LauncherDocumentRead) this.testEvent_).mergeFrom(launcherDocumentRead).buildPartial();
                    }
                    onChanged();
                } else if (this.testEventCase_ == 15) {
                    c5228l1.mergeFrom(launcherDocumentRead);
                } else {
                    c5228l1.setMessage(launcherDocumentRead);
                }
                this.testEventCase_ = 15;
                return this;
            }

            public Builder mergeLauncherSlotsFilled(LauncherSlotsFilled launcherSlotsFilled) {
                C5228l1 c5228l1 = this.launcherSlotsFilledBuilder_;
                if (c5228l1 == null) {
                    if (this.testEventCase_ != 13 || this.testEvent_ == LauncherSlotsFilled.getDefaultInstance()) {
                        this.testEvent_ = launcherSlotsFilled;
                    } else {
                        this.testEvent_ = LauncherSlotsFilled.newBuilder((LauncherSlotsFilled) this.testEvent_).mergeFrom(launcherSlotsFilled).buildPartial();
                    }
                    onChanged();
                } else if (this.testEventCase_ == 13) {
                    c5228l1.mergeFrom(launcherSlotsFilled);
                } else {
                    c5228l1.setMessage(launcherSlotsFilled);
                }
                this.testEventCase_ = 13;
                return this;
            }

            public Builder setAudioPlayerPlay(AudioPlayerPlay audioPlayerPlay) {
                C5228l1 c5228l1 = this.audioPlayerPlayBuilder_;
                if (c5228l1 == null) {
                    audioPlayerPlay.getClass();
                    this.testEvent_ = audioPlayerPlay;
                    onChanged();
                } else {
                    c5228l1.setMessage(audioPlayerPlay);
                }
                this.testEventCase_ = 14;
                return this;
            }

            public Builder setLauncherAuthorizeFailed(LauncherAuthorizeFailed launcherAuthorizeFailed) {
                C5228l1 c5228l1 = this.launcherAuthorizeFailedBuilder_;
                if (c5228l1 == null) {
                    launcherAuthorizeFailed.getClass();
                    this.testEvent_ = launcherAuthorizeFailed;
                    onChanged();
                } else {
                    c5228l1.setMessage(launcherAuthorizeFailed);
                }
                this.testEventCase_ = 12;
                return this;
            }

            public Builder setLauncherAuthorized(LauncherAuthorized launcherAuthorized) {
                C5228l1 c5228l1 = this.launcherAuthorizedBuilder_;
                if (c5228l1 == null) {
                    launcherAuthorized.getClass();
                    this.testEvent_ = launcherAuthorized;
                    onChanged();
                } else {
                    c5228l1.setMessage(launcherAuthorized);
                }
                this.testEventCase_ = 11;
                return this;
            }

            public Builder setLauncherDocumentRead(LauncherDocumentRead launcherDocumentRead) {
                C5228l1 c5228l1 = this.launcherDocumentReadBuilder_;
                if (c5228l1 == null) {
                    launcherDocumentRead.getClass();
                    this.testEvent_ = launcherDocumentRead;
                    onChanged();
                } else {
                    c5228l1.setMessage(launcherDocumentRead);
                }
                this.testEventCase_ = 15;
                return this;
            }

            public Builder setLauncherSlotsFilled(LauncherSlotsFilled launcherSlotsFilled) {
                C5228l1 c5228l1 = this.launcherSlotsFilledBuilder_;
                if (c5228l1 == null) {
                    launcherSlotsFilled.getClass();
                    this.testEvent_ = launcherSlotsFilled;
                    onChanged();
                } else {
                    c5228l1.setMessage(launcherSlotsFilled);
                }
                this.testEventCase_ = 13;
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.testEventCase_ = 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public EventPayload build() {
                EventPayload eventPayloadBuildPartial = buildPartial();
                if (eventPayloadBuildPartial.isInitialized()) {
                    return eventPayloadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) eventPayloadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public EventPayload buildPartial() {
                EventPayload eventPayload = new EventPayload(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(eventPayload);
                }
                buildPartialOneofs(eventPayload);
                onBuilt();
                return eventPayload;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public EventPayload getDefaultInstanceForType() {
                return EventPayload.getDefaultInstance();
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
                this.testEventCase_ = 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                C5228l1 c5228l1 = this.launcherAuthorizedBuilder_;
                if (c5228l1 != null) {
                    c5228l1.clear();
                }
                C5228l1 c5228l12 = this.launcherAuthorizeFailedBuilder_;
                if (c5228l12 != null) {
                    c5228l12.clear();
                }
                C5228l1 c5228l13 = this.launcherSlotsFilledBuilder_;
                if (c5228l13 != null) {
                    c5228l13.clear();
                }
                C5228l1 c5228l14 = this.audioPlayerPlayBuilder_;
                if (c5228l14 != null) {
                    c5228l14.clear();
                }
                C5228l1 c5228l15 = this.launcherDocumentReadBuilder_;
                if (c5228l15 != null) {
                    c5228l15.clear();
                }
                this.testEventCase_ = 0;
                this.testEvent_ = null;
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof EventPayload) {
                    return mergeFrom((EventPayload) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setAudioPlayerPlay(AudioPlayerPlay.Builder builder) {
                C5228l1 c5228l1 = this.audioPlayerPlayBuilder_;
                if (c5228l1 == null) {
                    this.testEvent_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testEventCase_ = 14;
                return this;
            }

            public Builder setLauncherAuthorizeFailed(LauncherAuthorizeFailed.Builder builder) {
                C5228l1 c5228l1 = this.launcherAuthorizeFailedBuilder_;
                if (c5228l1 == null) {
                    this.testEvent_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testEventCase_ = 12;
                return this;
            }

            public Builder setLauncherAuthorized(LauncherAuthorized.Builder builder) {
                C5228l1 c5228l1 = this.launcherAuthorizedBuilder_;
                if (c5228l1 == null) {
                    this.testEvent_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testEventCase_ = 11;
                return this;
            }

            public Builder setLauncherDocumentRead(LauncherDocumentRead.Builder builder) {
                C5228l1 c5228l1 = this.launcherDocumentReadBuilder_;
                if (c5228l1 == null) {
                    this.testEvent_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testEventCase_ = 15;
                return this;
            }

            public Builder setLauncherSlotsFilled(LauncherSlotsFilled.Builder builder) {
                C5228l1 c5228l1 = this.launcherSlotsFilledBuilder_;
                if (c5228l1 == null) {
                    this.testEvent_ = builder.build();
                    onChanged();
                } else {
                    c5228l1.setMessage(builder.build());
                }
                this.testEventCase_ = 13;
                return this;
            }

            public Builder mergeFrom(EventPayload eventPayload) {
                if (eventPayload == EventPayload.getDefaultInstance()) {
                    return this;
                }
                int i8 = AnonymousClass1.$SwitchMap$maum$m2u$common$EventOuterClass$EventPayload$TestEventCase[eventPayload.getTestEventCase().ordinal()];
                if (i8 == 1) {
                    mergeLauncherAuthorized(eventPayload.getLauncherAuthorized());
                } else if (i8 == 2) {
                    mergeLauncherAuthorizeFailed(eventPayload.getLauncherAuthorizeFailed());
                } else if (i8 == 3) {
                    mergeLauncherSlotsFilled(eventPayload.getLauncherSlotsFilled());
                } else if (i8 == 4) {
                    mergeAudioPlayerPlay(eventPayload.getAudioPlayerPlay());
                } else if (i8 == 5) {
                    mergeLauncherDocumentRead(eventPayload.getLauncherDocumentRead());
                }
                mergeUnknownFields(eventPayload.getUnknownFields());
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
                                if (tag == 90) {
                                    rVar.readMessage(getLauncherAuthorizedFieldBuilder().getBuilder(), m8);
                                    this.testEventCase_ = 11;
                                } else if (tag == 98) {
                                    rVar.readMessage(getLauncherAuthorizeFailedFieldBuilder().getBuilder(), m8);
                                    this.testEventCase_ = 12;
                                } else if (tag == 106) {
                                    rVar.readMessage(getLauncherSlotsFilledFieldBuilder().getBuilder(), m8);
                                    this.testEventCase_ = 13;
                                } else if (tag == 114) {
                                    rVar.readMessage(getAudioPlayerPlayFieldBuilder().getBuilder(), m8);
                                    this.testEventCase_ = 14;
                                } else if (tag != 122) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getLauncherDocumentReadFieldBuilder().getBuilder(), m8);
                                    this.testEventCase_ = 15;
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

        public enum TestEventCase implements AbstractC5227l0.c, AbstractC5196b.InterfaceC0220b {
            LAUNCHER_AUTHORIZED(11),
            LAUNCHER_AUTHORIZE_FAILED(12),
            LAUNCHER_SLOTS_FILLED(13),
            AUDIO_PLAYER_PLAY(14),
            LAUNCHER_DOCUMENT_READ(15),
            TESTEVENT_NOT_SET(0);

            private final int value;

            TestEventCase(int i8) {
                this.value = i8;
            }

            public static TestEventCase forNumber(int i8) {
                if (i8 == 0) {
                    return TESTEVENT_NOT_SET;
                }
                switch (i8) {
                    case 11:
                        return LAUNCHER_AUTHORIZED;
                    case 12:
                        return LAUNCHER_AUTHORIZE_FAILED;
                    case 13:
                        return LAUNCHER_SLOTS_FILLED;
                    case 14:
                        return AUDIO_PLAYER_PLAY;
                    case 15:
                        return LAUNCHER_DOCUMENT_READ;
                    default:
                        return null;
                }
            }

            @Override // com.google.protobuf.AbstractC5227l0.c
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static TestEventCase valueOf(int i8) {
                return forNumber(i8);
            }
        }

        /* synthetic */ EventPayload(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static EventPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return EventOuterClass.internal_static_maum_m2u_common_EventPayload_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EventPayload parseDelimitedFrom(InputStream inputStream) {
            return (EventPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EventPayload parseFrom(ByteBuffer byteBuffer) {
            return (EventPayload) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EventPayload)) {
                return super.equals(obj);
            }
            EventPayload eventPayload = (EventPayload) obj;
            if (!getTestEventCase().equals(eventPayload.getTestEventCase())) {
                return false;
            }
            switch (this.testEventCase_) {
                case 11:
                    if (!getLauncherAuthorized().equals(eventPayload.getLauncherAuthorized())) {
                        return false;
                    }
                    break;
                case 12:
                    if (!getLauncherAuthorizeFailed().equals(eventPayload.getLauncherAuthorizeFailed())) {
                        return false;
                    }
                    break;
                case 13:
                    if (!getLauncherSlotsFilled().equals(eventPayload.getLauncherSlotsFilled())) {
                        return false;
                    }
                    break;
                case 14:
                    if (!getAudioPlayerPlay().equals(eventPayload.getAudioPlayerPlay())) {
                        return false;
                    }
                    break;
                case 15:
                    if (!getLauncherDocumentRead().equals(eventPayload.getLauncherDocumentRead())) {
                        return false;
                    }
                    break;
            }
            return getUnknownFields().equals(eventPayload.getUnknownFields());
        }

        @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
        public AudioPlayerPlay getAudioPlayerPlay() {
            return this.testEventCase_ == 14 ? (AudioPlayerPlay) this.testEvent_ : AudioPlayerPlay.getDefaultInstance();
        }

        @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
        public AudioPlayerPlayOrBuilder getAudioPlayerPlayOrBuilder() {
            return this.testEventCase_ == 14 ? (AudioPlayerPlay) this.testEvent_ : AudioPlayerPlay.getDefaultInstance();
        }

        @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
        public LauncherAuthorizeFailed getLauncherAuthorizeFailed() {
            return this.testEventCase_ == 12 ? (LauncherAuthorizeFailed) this.testEvent_ : LauncherAuthorizeFailed.getDefaultInstance();
        }

        @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
        public LauncherAuthorizeFailedOrBuilder getLauncherAuthorizeFailedOrBuilder() {
            return this.testEventCase_ == 12 ? (LauncherAuthorizeFailed) this.testEvent_ : LauncherAuthorizeFailed.getDefaultInstance();
        }

        @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
        public LauncherAuthorized getLauncherAuthorized() {
            return this.testEventCase_ == 11 ? (LauncherAuthorized) this.testEvent_ : LauncherAuthorized.getDefaultInstance();
        }

        @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
        public LauncherAuthorizedOrBuilder getLauncherAuthorizedOrBuilder() {
            return this.testEventCase_ == 11 ? (LauncherAuthorized) this.testEvent_ : LauncherAuthorized.getDefaultInstance();
        }

        @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
        public LauncherDocumentRead getLauncherDocumentRead() {
            return this.testEventCase_ == 15 ? (LauncherDocumentRead) this.testEvent_ : LauncherDocumentRead.getDefaultInstance();
        }

        @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
        public LauncherDocumentReadOrBuilder getLauncherDocumentReadOrBuilder() {
            return this.testEventCase_ == 15 ? (LauncherDocumentRead) this.testEvent_ : LauncherDocumentRead.getDefaultInstance();
        }

        @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
        public LauncherSlotsFilled getLauncherSlotsFilled() {
            return this.testEventCase_ == 13 ? (LauncherSlotsFilled) this.testEvent_ : LauncherSlotsFilled.getDefaultInstance();
        }

        @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
        public LauncherSlotsFilledOrBuilder getLauncherSlotsFilledOrBuilder() {
            return this.testEventCase_ == 13 ? (LauncherSlotsFilled) this.testEvent_ : LauncherSlotsFilled.getDefaultInstance();
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
            int iComputeMessageSize = this.testEventCase_ == 11 ? AbstractC5248t.computeMessageSize(11, (LauncherAuthorized) this.testEvent_) : 0;
            if (this.testEventCase_ == 12) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(12, (LauncherAuthorizeFailed) this.testEvent_);
            }
            if (this.testEventCase_ == 13) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(13, (LauncherSlotsFilled) this.testEvent_);
            }
            if (this.testEventCase_ == 14) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(14, (AudioPlayerPlay) this.testEvent_);
            }
            if (this.testEventCase_ == 15) {
                iComputeMessageSize += AbstractC5248t.computeMessageSize(15, (LauncherDocumentRead) this.testEvent_);
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
        public TestEventCase getTestEventCase() {
            return TestEventCase.forNumber(this.testEventCase_);
        }

        @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
        public boolean hasAudioPlayerPlay() {
            return this.testEventCase_ == 14;
        }

        @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
        public boolean hasLauncherAuthorizeFailed() {
            return this.testEventCase_ == 12;
        }

        @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
        public boolean hasLauncherAuthorized() {
            return this.testEventCase_ == 11;
        }

        @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
        public boolean hasLauncherDocumentRead() {
            return this.testEventCase_ == 15;
        }

        @Override // maum.m2u.common.EventOuterClass.EventPayloadOrBuilder
        public boolean hasLauncherSlotsFilled() {
            return this.testEventCase_ == 13;
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
            switch (this.testEventCase_) {
                case 11:
                    i8 = ((iHashCode2 * 37) + 11) * 53;
                    iHashCode = getLauncherAuthorized().hashCode();
                    break;
                case 12:
                    i8 = ((iHashCode2 * 37) + 12) * 53;
                    iHashCode = getLauncherAuthorizeFailed().hashCode();
                    break;
                case 13:
                    i8 = ((iHashCode2 * 37) + 13) * 53;
                    iHashCode = getLauncherSlotsFilled().hashCode();
                    break;
                case 14:
                    i8 = ((iHashCode2 * 37) + 14) * 53;
                    iHashCode = getAudioPlayerPlay().hashCode();
                    break;
                case 15:
                    i8 = ((iHashCode2 * 37) + 15) * 53;
                    iHashCode = getLauncherDocumentRead().hashCode();
                    break;
                default:
                    int iHashCode3 = (iHashCode2 * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
            }
            iHashCode2 = i8 + iHashCode;
            int iHashCode32 = (iHashCode2 * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode32;
            return iHashCode32;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return EventOuterClass.internal_static_maum_m2u_common_EventPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(EventPayload.class, Builder.class);
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
            return new EventPayload();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (this.testEventCase_ == 11) {
                abstractC5248t.writeMessage(11, (LauncherAuthorized) this.testEvent_);
            }
            if (this.testEventCase_ == 12) {
                abstractC5248t.writeMessage(12, (LauncherAuthorizeFailed) this.testEvent_);
            }
            if (this.testEventCase_ == 13) {
                abstractC5248t.writeMessage(13, (LauncherSlotsFilled) this.testEvent_);
            }
            if (this.testEventCase_ == 14) {
                abstractC5248t.writeMessage(14, (AudioPlayerPlay) this.testEvent_);
            }
            if (this.testEventCase_ == 15) {
                abstractC5248t.writeMessage(15, (LauncherDocumentRead) this.testEvent_);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private EventPayload(AbstractC5209f0.b bVar) {
            super(bVar);
            this.testEventCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(EventPayload eventPayload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(eventPayload);
        }

        public static EventPayload parseFrom(ByteBuffer byteBuffer, M m8) {
            return (EventPayload) PARSER.parseFrom(byteBuffer, m8);
        }

        public static EventPayload parseDelimitedFrom(InputStream inputStream, M m8) {
            return (EventPayload) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static EventPayload parseFrom(AbstractC5235o abstractC5235o) {
            return (EventPayload) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public EventPayload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((AnonymousClass1) null) : new Builder((AnonymousClass1) null).mergeFrom(this);
        }

        public static EventPayload parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (EventPayload) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private EventPayload() {
            this.testEventCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EventPayload parseFrom(byte[] bArr) {
            return (EventPayload) PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static EventPayload parseFrom(byte[] bArr, M m8) {
            return (EventPayload) PARSER.parseFrom(bArr, m8);
        }

        public static EventPayload parseFrom(InputStream inputStream) {
            return (EventPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static EventPayload parseFrom(InputStream inputStream, M m8) {
            return (EventPayload) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static EventPayload parseFrom(r rVar) {
            return (EventPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static EventPayload parseFrom(r rVar, M m8) {
            return (EventPayload) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface EventPayloadOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        AudioPlayerPlay getAudioPlayerPlay();

        AudioPlayerPlayOrBuilder getAudioPlayerPlayOrBuilder();

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

        LauncherAuthorizeFailed getLauncherAuthorizeFailed();

        LauncherAuthorizeFailedOrBuilder getLauncherAuthorizeFailedOrBuilder();

        LauncherAuthorized getLauncherAuthorized();

        LauncherAuthorizedOrBuilder getLauncherAuthorizedOrBuilder();

        LauncherDocumentRead getLauncherDocumentRead();

        LauncherDocumentReadOrBuilder getLauncherDocumentReadOrBuilder();

        LauncherSlotsFilled getLauncherSlotsFilled();

        LauncherSlotsFilledOrBuilder getLauncherSlotsFilledOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        EventPayload.TestEventCase getTestEventCase();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        boolean hasAudioPlayerPlay();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        boolean hasLauncherAuthorizeFailed();

        boolean hasLauncherAuthorized();

        boolean hasLauncherDocumentRead();

        boolean hasLauncherSlotsFilled();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class LauncherAuthorizeFailed extends AbstractC5209f0 implements LauncherAuthorizeFailedOrBuilder {
        public static final int ACCESS_TOKEN_FIELD_NUMBER = 1;
        public static final int AUTHORIZED_AT_FIELD_NUMBER = 2;
        private static final LauncherAuthorizeFailed DEFAULT_INSTANCE = new LauncherAuthorizeFailed();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.EventOuterClass.LauncherAuthorizeFailed.1
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public LauncherAuthorizeFailed parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = LauncherAuthorizeFailed.newBuilder();
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
        private w1 authorizedAt_;
        private int bitField0_;
        private byte memoizedIsInitialized;

        /* renamed from: maum.m2u.common.EventOuterClass$LauncherAuthorizeFailed$1 */
        class AnonymousClass1 extends AbstractC5199c {
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public LauncherAuthorizeFailed parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = LauncherAuthorizeFailed.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements LauncherAuthorizeFailedOrBuilder {
            private Object accessToken_;
            private C5228l1 authorizedAtBuilder_;
            private w1 authorizedAt_;
            private int bitField0_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(LauncherAuthorizeFailed launcherAuthorizeFailed) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    launcherAuthorizeFailed.accessToken_ = this.accessToken_;
                }
                if ((i9 & 2) != 0) {
                    C5228l1 c5228l1 = this.authorizedAtBuilder_;
                    launcherAuthorizeFailed.authorizedAt_ = c5228l1 == null ? this.authorizedAt_ : (w1) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                LauncherAuthorizeFailed.access$4576(launcherAuthorizeFailed, i8);
            }

            private C5228l1 getAuthorizedAtFieldBuilder() {
                if (this.authorizedAtBuilder_ == null) {
                    this.authorizedAtBuilder_ = new C5228l1(getAuthorizedAt(), getParentForChildren(), isClean());
                    this.authorizedAt_ = null;
                }
                return this.authorizedAtBuilder_;
            }

            public static final C5269x.b getDescriptor() {
                return EventOuterClass.internal_static_maum_m2u_common_LauncherAuthorizeFailed_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getAuthorizedAtFieldBuilder();
                }
            }

            public Builder clearAccessToken() {
                this.accessToken_ = LauncherAuthorizeFailed.getDefaultInstance().getAccessToken();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearAuthorizedAt() {
                this.bitField0_ &= -3;
                this.authorizedAt_ = null;
                C5228l1 c5228l1 = this.authorizedAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.authorizedAtBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizeFailedOrBuilder
            public String getAccessToken() {
                Object obj = this.accessToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.accessToken_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizeFailedOrBuilder
            public AbstractC5235o getAccessTokenBytes() {
                Object obj = this.accessToken_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.accessToken_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizeFailedOrBuilder
            public w1 getAuthorizedAt() {
                C5228l1 c5228l1 = this.authorizedAtBuilder_;
                if (c5228l1 != null) {
                    return (w1) c5228l1.getMessage();
                }
                w1 w1Var = this.authorizedAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            public w1.b getAuthorizedAtBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (w1.b) getAuthorizedAtFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizeFailedOrBuilder
            public x1 getAuthorizedAtOrBuilder() {
                C5228l1 c5228l1 = this.authorizedAtBuilder_;
                if (c5228l1 != null) {
                    return (x1) c5228l1.getMessageOrBuilder();
                }
                w1 w1Var = this.authorizedAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return EventOuterClass.internal_static_maum_m2u_common_LauncherAuthorizeFailed_descriptor;
            }

            @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizeFailedOrBuilder
            public boolean hasAuthorizedAt() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return EventOuterClass.internal_static_maum_m2u_common_LauncherAuthorizeFailed_fieldAccessorTable.ensureFieldAccessorsInitialized(LauncherAuthorizeFailed.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAuthorizedAt(w1 w1Var) {
                w1 w1Var2;
                C5228l1 c5228l1 = this.authorizedAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(w1Var);
                } else if ((this.bitField0_ & 2) == 0 || (w1Var2 = this.authorizedAt_) == null || w1Var2 == w1.getDefaultInstance()) {
                    this.authorizedAt_ = w1Var;
                } else {
                    getAuthorizedAtBuilder().mergeFrom(w1Var);
                }
                if (this.authorizedAt_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
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

            public Builder setAuthorizedAt(w1 w1Var) {
                C5228l1 c5228l1 = this.authorizedAtBuilder_;
                if (c5228l1 == null) {
                    w1Var.getClass();
                    this.authorizedAt_ = w1Var;
                } else {
                    c5228l1.setMessage(w1Var);
                }
                this.bitField0_ |= 2;
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
            public LauncherAuthorizeFailed build() {
                LauncherAuthorizeFailed launcherAuthorizeFailedBuildPartial = buildPartial();
                if (launcherAuthorizeFailedBuildPartial.isInitialized()) {
                    return launcherAuthorizeFailedBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) launcherAuthorizeFailedBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public LauncherAuthorizeFailed buildPartial() {
                LauncherAuthorizeFailed launcherAuthorizeFailed = new LauncherAuthorizeFailed(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(launcherAuthorizeFailed);
                }
                onBuilt();
                return launcherAuthorizeFailed;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public LauncherAuthorizeFailed getDefaultInstanceForType() {
                return LauncherAuthorizeFailed.getDefaultInstance();
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
                this.accessToken_ = "";
                this.authorizedAt_ = null;
                C5228l1 c5228l1 = this.authorizedAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.authorizedAtBuilder_ = null;
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
                if (h02 instanceof LauncherAuthorizeFailed) {
                    return mergeFrom((LauncherAuthorizeFailed) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setAuthorizedAt(w1.b bVar) {
                C5228l1 c5228l1 = this.authorizedAtBuilder_;
                if (c5228l1 == null) {
                    this.authorizedAt_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFrom(LauncherAuthorizeFailed launcherAuthorizeFailed) {
                if (launcherAuthorizeFailed == LauncherAuthorizeFailed.getDefaultInstance()) {
                    return this;
                }
                if (!launcherAuthorizeFailed.getAccessToken().isEmpty()) {
                    this.accessToken_ = launcherAuthorizeFailed.accessToken_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (launcherAuthorizeFailed.hasAuthorizedAt()) {
                    mergeAuthorizedAt(launcherAuthorizeFailed.getAuthorizedAt());
                }
                mergeUnknownFields(launcherAuthorizeFailed.getUnknownFields());
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
                                    this.accessToken_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    rVar.readMessage(getAuthorizedAtFieldBuilder().getBuilder(), m8);
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

        /* synthetic */ LauncherAuthorizeFailed(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$4576(LauncherAuthorizeFailed launcherAuthorizeFailed, int i8) {
            int i9 = i8 | launcherAuthorizeFailed.bitField0_;
            launcherAuthorizeFailed.bitField0_ = i9;
            return i9;
        }

        public static LauncherAuthorizeFailed getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return EventOuterClass.internal_static_maum_m2u_common_LauncherAuthorizeFailed_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LauncherAuthorizeFailed parseDelimitedFrom(InputStream inputStream) {
            return (LauncherAuthorizeFailed) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LauncherAuthorizeFailed parseFrom(ByteBuffer byteBuffer) {
            return (LauncherAuthorizeFailed) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LauncherAuthorizeFailed)) {
                return super.equals(obj);
            }
            LauncherAuthorizeFailed launcherAuthorizeFailed = (LauncherAuthorizeFailed) obj;
            if (getAccessToken().equals(launcherAuthorizeFailed.getAccessToken()) && hasAuthorizedAt() == launcherAuthorizeFailed.hasAuthorizedAt()) {
                return (!hasAuthorizedAt() || getAuthorizedAt().equals(launcherAuthorizeFailed.getAuthorizedAt())) && getUnknownFields().equals(launcherAuthorizeFailed.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizeFailedOrBuilder
        public String getAccessToken() {
            Object obj = this.accessToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.accessToken_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizeFailedOrBuilder
        public AbstractC5235o getAccessTokenBytes() {
            Object obj = this.accessToken_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.accessToken_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizeFailedOrBuilder
        public w1 getAuthorizedAt() {
            w1 w1Var = this.authorizedAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizeFailedOrBuilder
        public x1 getAuthorizedAtOrBuilder() {
            w1 w1Var = this.authorizedAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
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
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.accessToken_) ? AbstractC5209f0.computeStringSize(1, this.accessToken_) : 0;
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(2, getAuthorizedAt());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizeFailedOrBuilder
        public boolean hasAuthorizedAt() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAccessToken().hashCode();
            if (hasAuthorizedAt()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getAuthorizedAt().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return EventOuterClass.internal_static_maum_m2u_common_LauncherAuthorizeFailed_fieldAccessorTable.ensureFieldAccessorsInitialized(LauncherAuthorizeFailed.class, Builder.class);
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
            return new LauncherAuthorizeFailed();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.accessToken_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.accessToken_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(2, getAuthorizedAt());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private LauncherAuthorizeFailed(AbstractC5209f0.b bVar) {
            super(bVar);
            this.accessToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(LauncherAuthorizeFailed launcherAuthorizeFailed) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(launcherAuthorizeFailed);
        }

        public static LauncherAuthorizeFailed parseFrom(ByteBuffer byteBuffer, M m8) {
            return (LauncherAuthorizeFailed) PARSER.parseFrom(byteBuffer, m8);
        }

        public static LauncherAuthorizeFailed parseDelimitedFrom(InputStream inputStream, M m8) {
            return (LauncherAuthorizeFailed) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static LauncherAuthorizeFailed parseFrom(AbstractC5235o abstractC5235o) {
            return (LauncherAuthorizeFailed) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public LauncherAuthorizeFailed getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((AnonymousClass1) null) : new Builder((AnonymousClass1) null).mergeFrom(this);
        }

        public static LauncherAuthorizeFailed parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (LauncherAuthorizeFailed) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private LauncherAuthorizeFailed() {
            this.accessToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.accessToken_ = "";
        }

        public static LauncherAuthorizeFailed parseFrom(byte[] bArr) {
            return (LauncherAuthorizeFailed) PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static LauncherAuthorizeFailed parseFrom(byte[] bArr, M m8) {
            return (LauncherAuthorizeFailed) PARSER.parseFrom(bArr, m8);
        }

        public static LauncherAuthorizeFailed parseFrom(InputStream inputStream) {
            return (LauncherAuthorizeFailed) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static LauncherAuthorizeFailed parseFrom(InputStream inputStream, M m8) {
            return (LauncherAuthorizeFailed) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static LauncherAuthorizeFailed parseFrom(r rVar) {
            return (LauncherAuthorizeFailed) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static LauncherAuthorizeFailed parseFrom(r rVar, M m8) {
            return (LauncherAuthorizeFailed) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface LauncherAuthorizeFailedOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        String getAccessToken();

        AbstractC5235o getAccessTokenBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        w1 getAuthorizedAt();

        x1 getAuthorizedAtOrBuilder();

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

        boolean hasAuthorizedAt();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class LauncherAuthorized extends AbstractC5209f0 implements LauncherAuthorizedOrBuilder {
        public static final int ACCESS_TOKEN_FIELD_NUMBER = 1;
        public static final int AUTHORIZED_AT_FIELD_NUMBER = 2;
        public static final int META_FIELD_NUMBER = 100;
        private static final long serialVersionUID = 0;
        private volatile Object accessToken_;
        private w1 authorizedAt_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private C5240p1 meta_;
        private static final LauncherAuthorized DEFAULT_INSTANCE = new LauncherAuthorized();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.EventOuterClass.LauncherAuthorized.1
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public LauncherAuthorized parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = LauncherAuthorized.newBuilder();
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

        /* renamed from: maum.m2u.common.EventOuterClass$LauncherAuthorized$1 */
        class AnonymousClass1 extends AbstractC5199c {
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public LauncherAuthorized parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = LauncherAuthorized.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements LauncherAuthorizedOrBuilder {
            private Object accessToken_;
            private C5228l1 authorizedAtBuilder_;
            private w1 authorizedAt_;
            private int bitField0_;
            private C5228l1 metaBuilder_;
            private C5240p1 meta_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(LauncherAuthorized launcherAuthorized) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    launcherAuthorized.accessToken_ = this.accessToken_;
                }
                if ((i9 & 2) != 0) {
                    C5228l1 c5228l1 = this.authorizedAtBuilder_;
                    launcherAuthorized.authorizedAt_ = c5228l1 == null ? this.authorizedAt_ : (w1) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if ((i9 & 4) != 0) {
                    C5228l1 c5228l12 = this.metaBuilder_;
                    launcherAuthorized.meta_ = c5228l12 == null ? this.meta_ : (C5240p1) c5228l12.build();
                    i8 |= 2;
                }
                LauncherAuthorized.access$3576(launcherAuthorized, i8);
            }

            private C5228l1 getAuthorizedAtFieldBuilder() {
                if (this.authorizedAtBuilder_ == null) {
                    this.authorizedAtBuilder_ = new C5228l1(getAuthorizedAt(), getParentForChildren(), isClean());
                    this.authorizedAt_ = null;
                }
                return this.authorizedAtBuilder_;
            }

            public static final C5269x.b getDescriptor() {
                return EventOuterClass.internal_static_maum_m2u_common_LauncherAuthorized_descriptor;
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
                    getAuthorizedAtFieldBuilder();
                    getMetaFieldBuilder();
                }
            }

            public Builder clearAccessToken() {
                this.accessToken_ = LauncherAuthorized.getDefaultInstance().getAccessToken();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearAuthorizedAt() {
                this.bitField0_ &= -3;
                this.authorizedAt_ = null;
                C5228l1 c5228l1 = this.authorizedAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.authorizedAtBuilder_ = null;
                }
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

            @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizedOrBuilder
            public String getAccessToken() {
                Object obj = this.accessToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.accessToken_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizedOrBuilder
            public AbstractC5235o getAccessTokenBytes() {
                Object obj = this.accessToken_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.accessToken_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizedOrBuilder
            public w1 getAuthorizedAt() {
                C5228l1 c5228l1 = this.authorizedAtBuilder_;
                if (c5228l1 != null) {
                    return (w1) c5228l1.getMessage();
                }
                w1 w1Var = this.authorizedAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            public w1.b getAuthorizedAtBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (w1.b) getAuthorizedAtFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizedOrBuilder
            public x1 getAuthorizedAtOrBuilder() {
                C5228l1 c5228l1 = this.authorizedAtBuilder_;
                if (c5228l1 != null) {
                    return (x1) c5228l1.getMessageOrBuilder();
                }
                w1 w1Var = this.authorizedAt_;
                return w1Var == null ? w1.getDefaultInstance() : w1Var;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return EventOuterClass.internal_static_maum_m2u_common_LauncherAuthorized_descriptor;
            }

            @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizedOrBuilder
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

            @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizedOrBuilder
            public InterfaceC5243q1 getMetaOrBuilder() {
                C5228l1 c5228l1 = this.metaBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                }
                C5240p1 c5240p1 = this.meta_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizedOrBuilder
            public boolean hasAuthorizedAt() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizedOrBuilder
            public boolean hasMeta() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return EventOuterClass.internal_static_maum_m2u_common_LauncherAuthorized_fieldAccessorTable.ensureFieldAccessorsInitialized(LauncherAuthorized.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAuthorizedAt(w1 w1Var) {
                w1 w1Var2;
                C5228l1 c5228l1 = this.authorizedAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(w1Var);
                } else if ((this.bitField0_ & 2) == 0 || (w1Var2 = this.authorizedAt_) == null || w1Var2 == w1.getDefaultInstance()) {
                    this.authorizedAt_ = w1Var;
                } else {
                    getAuthorizedAtBuilder().mergeFrom(w1Var);
                }
                if (this.authorizedAt_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
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

            public Builder setAuthorizedAt(w1 w1Var) {
                C5228l1 c5228l1 = this.authorizedAtBuilder_;
                if (c5228l1 == null) {
                    w1Var.getClass();
                    this.authorizedAt_ = w1Var;
                } else {
                    c5228l1.setMessage(w1Var);
                }
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
                this.bitField0_ |= 4;
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
            public LauncherAuthorized build() {
                LauncherAuthorized launcherAuthorizedBuildPartial = buildPartial();
                if (launcherAuthorizedBuildPartial.isInitialized()) {
                    return launcherAuthorizedBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) launcherAuthorizedBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public LauncherAuthorized buildPartial() {
                LauncherAuthorized launcherAuthorized = new LauncherAuthorized(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(launcherAuthorized);
                }
                onBuilt();
                return launcherAuthorized;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public LauncherAuthorized getDefaultInstanceForType() {
                return LauncherAuthorized.getDefaultInstance();
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
                this.accessToken_ = "";
                this.authorizedAt_ = null;
                C5228l1 c5228l1 = this.authorizedAtBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.authorizedAtBuilder_ = null;
                }
                this.meta_ = null;
                C5228l1 c5228l12 = this.metaBuilder_;
                if (c5228l12 != null) {
                    c5228l12.dispose();
                    this.metaBuilder_ = null;
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
                if (h02 instanceof LauncherAuthorized) {
                    return mergeFrom((LauncherAuthorized) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setAuthorizedAt(w1.b bVar) {
                C5228l1 c5228l1 = this.authorizedAtBuilder_;
                if (c5228l1 == null) {
                    this.authorizedAt_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 2;
                onChanged();
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

            public Builder mergeFrom(LauncherAuthorized launcherAuthorized) {
                if (launcherAuthorized == LauncherAuthorized.getDefaultInstance()) {
                    return this;
                }
                if (!launcherAuthorized.getAccessToken().isEmpty()) {
                    this.accessToken_ = launcherAuthorized.accessToken_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (launcherAuthorized.hasAuthorizedAt()) {
                    mergeAuthorizedAt(launcherAuthorized.getAuthorizedAt());
                }
                if (launcherAuthorized.hasMeta()) {
                    mergeMeta(launcherAuthorized.getMeta());
                }
                mergeUnknownFields(launcherAuthorized.getUnknownFields());
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
                                    this.accessToken_ = rVar.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    rVar.readMessage(getAuthorizedAtFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 2;
                                } else if (tag != 802) {
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

        /* synthetic */ LauncherAuthorized(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$3576(LauncherAuthorized launcherAuthorized, int i8) {
            int i9 = i8 | launcherAuthorized.bitField0_;
            launcherAuthorized.bitField0_ = i9;
            return i9;
        }

        public static LauncherAuthorized getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return EventOuterClass.internal_static_maum_m2u_common_LauncherAuthorized_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LauncherAuthorized parseDelimitedFrom(InputStream inputStream) {
            return (LauncherAuthorized) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LauncherAuthorized parseFrom(ByteBuffer byteBuffer) {
            return (LauncherAuthorized) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LauncherAuthorized)) {
                return super.equals(obj);
            }
            LauncherAuthorized launcherAuthorized = (LauncherAuthorized) obj;
            if (!getAccessToken().equals(launcherAuthorized.getAccessToken()) || hasAuthorizedAt() != launcherAuthorized.hasAuthorizedAt()) {
                return false;
            }
            if ((!hasAuthorizedAt() || getAuthorizedAt().equals(launcherAuthorized.getAuthorizedAt())) && hasMeta() == launcherAuthorized.hasMeta()) {
                return (!hasMeta() || getMeta().equals(launcherAuthorized.getMeta())) && getUnknownFields().equals(launcherAuthorized.getUnknownFields());
            }
            return false;
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizedOrBuilder
        public String getAccessToken() {
            Object obj = this.accessToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.accessToken_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizedOrBuilder
        public AbstractC5235o getAccessTokenBytes() {
            Object obj = this.accessToken_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.accessToken_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizedOrBuilder
        public w1 getAuthorizedAt() {
            w1 w1Var = this.authorizedAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizedOrBuilder
        public x1 getAuthorizedAtOrBuilder() {
            w1 w1Var = this.authorizedAt_;
            return w1Var == null ? w1.getDefaultInstance() : w1Var;
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizedOrBuilder
        public C5240p1 getMeta() {
            C5240p1 c5240p1 = this.meta_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizedOrBuilder
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
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.accessToken_) ? AbstractC5209f0.computeStringSize(1, this.accessToken_) : 0;
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(2, getAuthorizedAt());
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += AbstractC5248t.computeMessageSize(100, getMeta());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizedOrBuilder
        public boolean hasAuthorizedAt() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherAuthorizedOrBuilder
        public boolean hasMeta() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAccessToken().hashCode();
            if (hasAuthorizedAt()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getAuthorizedAt().hashCode();
            }
            if (hasMeta()) {
                iHashCode = (((iHashCode * 37) + 100) * 53) + getMeta().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return EventOuterClass.internal_static_maum_m2u_common_LauncherAuthorized_fieldAccessorTable.ensureFieldAccessorsInitialized(LauncherAuthorized.class, Builder.class);
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
            return new LauncherAuthorized();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.accessToken_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.accessToken_);
            }
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(2, getAuthorizedAt());
            }
            if ((this.bitField0_ & 2) != 0) {
                abstractC5248t.writeMessage(100, getMeta());
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private LauncherAuthorized(AbstractC5209f0.b bVar) {
            super(bVar);
            this.accessToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(LauncherAuthorized launcherAuthorized) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(launcherAuthorized);
        }

        public static LauncherAuthorized parseFrom(ByteBuffer byteBuffer, M m8) {
            return (LauncherAuthorized) PARSER.parseFrom(byteBuffer, m8);
        }

        public static LauncherAuthorized parseDelimitedFrom(InputStream inputStream, M m8) {
            return (LauncherAuthorized) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static LauncherAuthorized parseFrom(AbstractC5235o abstractC5235o) {
            return (LauncherAuthorized) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public LauncherAuthorized getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((AnonymousClass1) null) : new Builder((AnonymousClass1) null).mergeFrom(this);
        }

        public static LauncherAuthorized parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (LauncherAuthorized) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private LauncherAuthorized() {
            this.accessToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.accessToken_ = "";
        }

        public static LauncherAuthorized parseFrom(byte[] bArr) {
            return (LauncherAuthorized) PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static LauncherAuthorized parseFrom(byte[] bArr, M m8) {
            return (LauncherAuthorized) PARSER.parseFrom(bArr, m8);
        }

        public static LauncherAuthorized parseFrom(InputStream inputStream) {
            return (LauncherAuthorized) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static LauncherAuthorized parseFrom(InputStream inputStream, M m8) {
            return (LauncherAuthorized) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static LauncherAuthorized parseFrom(r rVar) {
            return (LauncherAuthorized) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static LauncherAuthorized parseFrom(r rVar, M m8) {
            return (LauncherAuthorized) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface LauncherAuthorizedOrBuilder extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        String getAccessToken();

        AbstractC5235o getAccessTokenBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        w1 getAuthorizedAt();

        x1 getAuthorizedAtOrBuilder();

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

        boolean hasAuthorizedAt();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        boolean hasMeta();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    public static final class LauncherDocumentRead extends AbstractC5209f0 implements LauncherDocumentReadOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int READ_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private boolean read_;
        private static final LauncherDocumentRead DEFAULT_INSTANCE = new LauncherDocumentRead();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.EventOuterClass.LauncherDocumentRead.1
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public LauncherDocumentRead parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = LauncherDocumentRead.newBuilder();
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

        /* renamed from: maum.m2u.common.EventOuterClass$LauncherDocumentRead$1 */
        class AnonymousClass1 extends AbstractC5199c {
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public LauncherDocumentRead parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = LauncherDocumentRead.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements LauncherDocumentReadOrBuilder {
            private int bitField0_;
            private Object id_;
            private boolean read_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(LauncherDocumentRead launcherDocumentRead) {
                int i8 = this.bitField0_;
                if ((i8 & 1) != 0) {
                    launcherDocumentRead.id_ = this.id_;
                }
                if ((i8 & 2) != 0) {
                    launcherDocumentRead.read_ = this.read_;
                }
            }

            public static final C5269x.b getDescriptor() {
                return EventOuterClass.internal_static_maum_m2u_common_LauncherDocumentRead_descriptor;
            }

            public Builder clearId() {
                this.id_ = LauncherDocumentRead.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearRead() {
                this.bitField0_ &= -3;
                this.read_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return EventOuterClass.internal_static_maum_m2u_common_LauncherDocumentRead_descriptor;
            }

            @Override // maum.m2u.common.EventOuterClass.LauncherDocumentReadOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // maum.m2u.common.EventOuterClass.LauncherDocumentReadOrBuilder
            public AbstractC5235o getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.id_ = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // maum.m2u.common.EventOuterClass.LauncherDocumentReadOrBuilder
            public boolean getRead() {
                return this.read_;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return EventOuterClass.internal_static_maum_m2u_common_LauncherDocumentRead_fieldAccessorTable.ensureFieldAccessorsInitialized(LauncherDocumentRead.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
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

            public Builder setRead(boolean z8) {
                this.read_ = z8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                this.id_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public LauncherDocumentRead build() {
                LauncherDocumentRead launcherDocumentReadBuildPartial = buildPartial();
                if (launcherDocumentReadBuildPartial.isInitialized()) {
                    return launcherDocumentReadBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) launcherDocumentReadBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public LauncherDocumentRead buildPartial() {
                LauncherDocumentRead launcherDocumentRead = new LauncherDocumentRead(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(launcherDocumentRead);
                }
                onBuilt();
                return launcherDocumentRead;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public LauncherDocumentRead getDefaultInstanceForType() {
                return LauncherDocumentRead.getDefaultInstance();
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
                this.id_ = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.read_ = false;
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof LauncherDocumentRead) {
                    return mergeFrom((LauncherDocumentRead) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder mergeFrom(LauncherDocumentRead launcherDocumentRead) {
                if (launcherDocumentRead == LauncherDocumentRead.getDefaultInstance()) {
                    return this;
                }
                if (!launcherDocumentRead.getId().isEmpty()) {
                    this.id_ = launcherDocumentRead.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (launcherDocumentRead.getRead()) {
                    setRead(launcherDocumentRead.getRead());
                }
                mergeUnknownFields(launcherDocumentRead.getUnknownFields());
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
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.read_ = rVar.readBool();
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

        /* synthetic */ LauncherDocumentRead(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        public static LauncherDocumentRead getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return EventOuterClass.internal_static_maum_m2u_common_LauncherDocumentRead_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LauncherDocumentRead parseDelimitedFrom(InputStream inputStream) {
            return (LauncherDocumentRead) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LauncherDocumentRead parseFrom(ByteBuffer byteBuffer) {
            return (LauncherDocumentRead) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LauncherDocumentRead)) {
                return super.equals(obj);
            }
            LauncherDocumentRead launcherDocumentRead = (LauncherDocumentRead) obj;
            return getId().equals(launcherDocumentRead.getId()) && getRead() == launcherDocumentRead.getRead() && getUnknownFields().equals(launcherDocumentRead.getUnknownFields());
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherDocumentReadOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherDocumentReadOrBuilder
        public AbstractC5235o getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.id_ = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return PARSER;
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherDocumentReadOrBuilder
        public boolean getRead() {
            return this.read_;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeStringSize = !AbstractC5209f0.isStringEmpty(this.id_) ? AbstractC5209f0.computeStringSize(1, this.id_) : 0;
            boolean z8 = this.read_;
            if (z8) {
                iComputeStringSize += AbstractC5248t.computeBoolSize(2, z8);
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
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + AbstractC5227l0.hashBoolean(getRead())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return EventOuterClass.internal_static_maum_m2u_common_LauncherDocumentRead_fieldAccessorTable.ensureFieldAccessorsInitialized(LauncherDocumentRead.class, Builder.class);
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
            return new LauncherDocumentRead();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (!AbstractC5209f0.isStringEmpty(this.id_)) {
                AbstractC5209f0.writeString(abstractC5248t, 1, this.id_);
            }
            boolean z8 = this.read_;
            if (z8) {
                abstractC5248t.writeBool(2, z8);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private LauncherDocumentRead(AbstractC5209f0.b bVar) {
            super(bVar);
            this.id_ = "";
            this.read_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(LauncherDocumentRead launcherDocumentRead) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(launcherDocumentRead);
        }

        public static LauncherDocumentRead parseFrom(ByteBuffer byteBuffer, M m8) {
            return (LauncherDocumentRead) PARSER.parseFrom(byteBuffer, m8);
        }

        public static LauncherDocumentRead parseDelimitedFrom(InputStream inputStream, M m8) {
            return (LauncherDocumentRead) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static LauncherDocumentRead parseFrom(AbstractC5235o abstractC5235o) {
            return (LauncherDocumentRead) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public LauncherDocumentRead getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((AnonymousClass1) null) : new Builder((AnonymousClass1) null).mergeFrom(this);
        }

        public static LauncherDocumentRead parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (LauncherDocumentRead) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LauncherDocumentRead parseFrom(byte[] bArr) {
            return (LauncherDocumentRead) PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        private LauncherDocumentRead() {
            this.id_ = "";
            this.read_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
        }

        public static LauncherDocumentRead parseFrom(byte[] bArr, M m8) {
            return (LauncherDocumentRead) PARSER.parseFrom(bArr, m8);
        }

        public static LauncherDocumentRead parseFrom(InputStream inputStream) {
            return (LauncherDocumentRead) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static LauncherDocumentRead parseFrom(InputStream inputStream, M m8) {
            return (LauncherDocumentRead) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static LauncherDocumentRead parseFrom(r rVar) {
            return (LauncherDocumentRead) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static LauncherDocumentRead parseFrom(r rVar, M m8) {
            return (LauncherDocumentRead) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface LauncherDocumentReadOrBuilder extends N0 {
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

        String getId();

        AbstractC5235o getIdBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        boolean getRead();

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

    public static final class LauncherSlotsFilled extends AbstractC5209f0 implements LauncherSlotsFilledOrBuilder {
        public static final int FILLED_SLOTS_FIELD_NUMBER = 1;
        public static final int UNFILLED_SLOTS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private C5240p1 filledSlots_;
        private byte memoizedIsInitialized;
        private C5247s0 unfilledSlots_;
        private static final LauncherSlotsFilled DEFAULT_INSTANCE = new LauncherSlotsFilled();
        private static final Z0 PARSER = new AbstractC5199c() { // from class: maum.m2u.common.EventOuterClass.LauncherSlotsFilled.1
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public LauncherSlotsFilled parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = LauncherSlotsFilled.newBuilder();
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

        /* renamed from: maum.m2u.common.EventOuterClass$LauncherSlotsFilled$1 */
        class AnonymousClass1 extends AbstractC5199c {
            AnonymousClass1() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public LauncherSlotsFilled parsePartialFrom(r rVar, M m8) throws C5230m0 {
                Builder builderNewBuilder = LauncherSlotsFilled.newBuilder();
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

        public static final class Builder extends AbstractC5209f0.b implements LauncherSlotsFilledOrBuilder {
            private int bitField0_;
            private C5228l1 filledSlotsBuilder_;
            private C5240p1 filledSlots_;
            private C5247s0 unfilledSlots_;

            /* synthetic */ Builder(AbstractC5209f0.c cVar, AnonymousClass1 anonymousClass1) {
                this(cVar);
            }

            private void buildPartial0(LauncherSlotsFilled launcherSlotsFilled) {
                int i8;
                int i9 = this.bitField0_;
                if ((i9 & 1) != 0) {
                    C5228l1 c5228l1 = this.filledSlotsBuilder_;
                    launcherSlotsFilled.filledSlots_ = c5228l1 == null ? this.filledSlots_ : (C5240p1) c5228l1.build();
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if ((i9 & 2) != 0) {
                    this.unfilledSlots_.makeImmutable();
                    launcherSlotsFilled.unfilledSlots_ = this.unfilledSlots_;
                }
                LauncherSlotsFilled.access$5576(launcherSlotsFilled, i8);
            }

            private void ensureUnfilledSlotsIsMutable() {
                if (!this.unfilledSlots_.isModifiable()) {
                    this.unfilledSlots_ = new C5247s0((InterfaceC5249t0) this.unfilledSlots_);
                }
                this.bitField0_ |= 2;
            }

            public static final C5269x.b getDescriptor() {
                return EventOuterClass.internal_static_maum_m2u_common_LauncherSlotsFilled_descriptor;
            }

            private C5228l1 getFilledSlotsFieldBuilder() {
                if (this.filledSlotsBuilder_ == null) {
                    this.filledSlotsBuilder_ = new C5228l1(getFilledSlots(), getParentForChildren(), isClean());
                    this.filledSlots_ = null;
                }
                return this.filledSlotsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (AbstractC5209f0.alwaysUseFieldBuilders) {
                    getFilledSlotsFieldBuilder();
                }
            }

            public Builder addAllUnfilledSlots(Iterable<String> iterable) {
                ensureUnfilledSlotsIsMutable();
                AbstractC5196b.a.addAll((Iterable) iterable, (List) this.unfilledSlots_);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder addUnfilledSlots(String str) {
                str.getClass();
                ensureUnfilledSlotsIsMutable();
                this.unfilledSlots_.add(str);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder addUnfilledSlotsBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                ensureUnfilledSlotsIsMutable();
                this.unfilledSlots_.add(abstractC5235o);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder clearFilledSlots() {
                this.bitField0_ &= -2;
                this.filledSlots_ = null;
                C5228l1 c5228l1 = this.filledSlotsBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.filledSlotsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUnfilledSlots() {
                this.unfilledSlots_ = C5247s0.emptyList();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return EventOuterClass.internal_static_maum_m2u_common_LauncherSlotsFilled_descriptor;
            }

            @Override // maum.m2u.common.EventOuterClass.LauncherSlotsFilledOrBuilder
            public C5240p1 getFilledSlots() {
                C5228l1 c5228l1 = this.filledSlotsBuilder_;
                if (c5228l1 != null) {
                    return (C5240p1) c5228l1.getMessage();
                }
                C5240p1 c5240p1 = this.filledSlots_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            public C5240p1.b getFilledSlotsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (C5240p1.b) getFilledSlotsFieldBuilder().getBuilder();
            }

            @Override // maum.m2u.common.EventOuterClass.LauncherSlotsFilledOrBuilder
            public InterfaceC5243q1 getFilledSlotsOrBuilder() {
                C5228l1 c5228l1 = this.filledSlotsBuilder_;
                if (c5228l1 != null) {
                    return (InterfaceC5243q1) c5228l1.getMessageOrBuilder();
                }
                C5240p1 c5240p1 = this.filledSlots_;
                return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
            }

            @Override // maum.m2u.common.EventOuterClass.LauncherSlotsFilledOrBuilder
            public String getUnfilledSlots(int i8) {
                return this.unfilledSlots_.get(i8);
            }

            @Override // maum.m2u.common.EventOuterClass.LauncherSlotsFilledOrBuilder
            public AbstractC5235o getUnfilledSlotsBytes(int i8) {
                return this.unfilledSlots_.getByteString(i8);
            }

            @Override // maum.m2u.common.EventOuterClass.LauncherSlotsFilledOrBuilder
            public int getUnfilledSlotsCount() {
                return this.unfilledSlots_.size();
            }

            @Override // maum.m2u.common.EventOuterClass.LauncherSlotsFilledOrBuilder
            public boolean hasFilledSlots() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return EventOuterClass.internal_static_maum_m2u_common_LauncherSlotsFilled_fieldAccessorTable.ensureFieldAccessorsInitialized(LauncherSlotsFilled.class, Builder.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFilledSlots(C5240p1 c5240p1) {
                C5240p1 c5240p12;
                C5228l1 c5228l1 = this.filledSlotsBuilder_;
                if (c5228l1 != null) {
                    c5228l1.mergeFrom(c5240p1);
                } else if ((this.bitField0_ & 1) == 0 || (c5240p12 = this.filledSlots_) == null || c5240p12 == C5240p1.getDefaultInstance()) {
                    this.filledSlots_ = c5240p1;
                } else {
                    getFilledSlotsBuilder().mergeFrom(c5240p1);
                }
                if (this.filledSlots_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder setFilledSlots(C5240p1 c5240p1) {
                C5228l1 c5228l1 = this.filledSlotsBuilder_;
                if (c5228l1 == null) {
                    c5240p1.getClass();
                    this.filledSlots_ = c5240p1;
                } else {
                    c5228l1.setMessage(c5240p1);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUnfilledSlots(int i8, String str) {
                str.getClass();
                ensureUnfilledSlotsIsMutable();
                this.unfilledSlots_.set(i8, str);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            @Override // maum.m2u.common.EventOuterClass.LauncherSlotsFilledOrBuilder
            public InterfaceC5207e1 getUnfilledSlotsList() {
                this.unfilledSlots_.makeImmutable();
                return this.unfilledSlots_;
            }

            private Builder() {
                this.unfilledSlots_ = C5247s0.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder addRepeatedField(C5269x.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public LauncherSlotsFilled build() {
                LauncherSlotsFilled launcherSlotsFilledBuildPartial = buildPartial();
                if (launcherSlotsFilledBuildPartial.isInitialized()) {
                    return launcherSlotsFilledBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) launcherSlotsFilledBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public LauncherSlotsFilled buildPartial() {
                LauncherSlotsFilled launcherSlotsFilled = new LauncherSlotsFilled(this, null);
                if (this.bitField0_ != 0) {
                    buildPartial0(launcherSlotsFilled);
                }
                onBuilt();
                return launcherSlotsFilled;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder clearField(C5269x.g gVar) {
                return (Builder) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public LauncherSlotsFilled getDefaultInstanceForType() {
                return LauncherSlotsFilled.getDefaultInstance();
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
                this.filledSlots_ = null;
                C5228l1 c5228l1 = this.filledSlotsBuilder_;
                if (c5228l1 != null) {
                    c5228l1.dispose();
                    this.filledSlotsBuilder_ = null;
                }
                this.unfilledSlots_ = C5247s0.emptyList();
                return this;
            }

            private Builder(AbstractC5209f0.c cVar) {
                super(cVar);
                this.unfilledSlots_ = C5247s0.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public Builder mo3clone() {
                return (Builder) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public Builder mergeFrom(H0 h02) {
                if (h02 instanceof LauncherSlotsFilled) {
                    return mergeFrom((LauncherSlotsFilled) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public Builder setFilledSlots(C5240p1.b bVar) {
                C5228l1 c5228l1 = this.filledSlotsBuilder_;
                if (c5228l1 == null) {
                    this.filledSlots_ = bVar.build();
                } else {
                    c5228l1.setMessage(bVar.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder mergeFrom(LauncherSlotsFilled launcherSlotsFilled) {
                if (launcherSlotsFilled == LauncherSlotsFilled.getDefaultInstance()) {
                    return this;
                }
                if (launcherSlotsFilled.hasFilledSlots()) {
                    mergeFilledSlots(launcherSlotsFilled.getFilledSlots());
                }
                if (!launcherSlotsFilled.unfilledSlots_.isEmpty()) {
                    if (this.unfilledSlots_.isEmpty()) {
                        this.unfilledSlots_ = launcherSlotsFilled.unfilledSlots_;
                        this.bitField0_ |= 2;
                    } else {
                        ensureUnfilledSlotsIsMutable();
                        this.unfilledSlots_.addAll(launcherSlotsFilled.unfilledSlots_);
                    }
                    onChanged();
                }
                mergeUnknownFields(launcherSlotsFilled.getUnknownFields());
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
                                    rVar.readMessage(getFilledSlotsFieldBuilder().getBuilder(), m8);
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    String stringRequireUtf8 = rVar.readStringRequireUtf8();
                                    ensureUnfilledSlotsIsMutable();
                                    this.unfilledSlots_.add(stringRequireUtf8);
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

        /* synthetic */ LauncherSlotsFilled(AbstractC5209f0.b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        static /* synthetic */ int access$5576(LauncherSlotsFilled launcherSlotsFilled, int i8) {
            int i9 = i8 | launcherSlotsFilled.bitField0_;
            launcherSlotsFilled.bitField0_ = i9;
            return i9;
        }

        public static LauncherSlotsFilled getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C5269x.b getDescriptor() {
            return EventOuterClass.internal_static_maum_m2u_common_LauncherSlotsFilled_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LauncherSlotsFilled parseDelimitedFrom(InputStream inputStream) {
            return (LauncherSlotsFilled) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LauncherSlotsFilled parseFrom(ByteBuffer byteBuffer) {
            return (LauncherSlotsFilled) PARSER.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LauncherSlotsFilled)) {
                return super.equals(obj);
            }
            LauncherSlotsFilled launcherSlotsFilled = (LauncherSlotsFilled) obj;
            if (hasFilledSlots() != launcherSlotsFilled.hasFilledSlots()) {
                return false;
            }
            return (!hasFilledSlots() || getFilledSlots().equals(launcherSlotsFilled.getFilledSlots())) && getUnfilledSlotsList().equals(launcherSlotsFilled.getUnfilledSlotsList()) && getUnknownFields().equals(launcherSlotsFilled.getUnknownFields());
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherSlotsFilledOrBuilder
        public C5240p1 getFilledSlots() {
            C5240p1 c5240p1 = this.filledSlots_;
            return c5240p1 == null ? C5240p1.getDefaultInstance() : c5240p1;
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherSlotsFilledOrBuilder
        public InterfaceC5243q1 getFilledSlotsOrBuilder() {
            C5240p1 c5240p1 = this.filledSlots_;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? AbstractC5248t.computeMessageSize(1, getFilledSlots()) : 0;
            int iComputeStringSizeNoTag = 0;
            for (int i9 = 0; i9 < this.unfilledSlots_.size(); i9++) {
                iComputeStringSizeNoTag += AbstractC5209f0.computeStringSizeNoTag(this.unfilledSlots_.getRaw(i9));
            }
            int size = iComputeMessageSize + iComputeStringSizeNoTag + getUnfilledSlotsList().size() + getUnknownFields().getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherSlotsFilledOrBuilder
        public String getUnfilledSlots(int i8) {
            return this.unfilledSlots_.get(i8);
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherSlotsFilledOrBuilder
        public AbstractC5235o getUnfilledSlotsBytes(int i8) {
            return this.unfilledSlots_.getByteString(i8);
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherSlotsFilledOrBuilder
        public int getUnfilledSlotsCount() {
            return this.unfilledSlots_.size();
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherSlotsFilledOrBuilder
        public boolean hasFilledSlots() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasFilledSlots()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getFilledSlots().hashCode();
            }
            if (getUnfilledSlotsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getUnfilledSlotsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return EventOuterClass.internal_static_maum_m2u_common_LauncherSlotsFilled_fieldAccessorTable.ensureFieldAccessorsInitialized(LauncherSlotsFilled.class, Builder.class);
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
            return new LauncherSlotsFilled();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if ((this.bitField0_ & 1) != 0) {
                abstractC5248t.writeMessage(1, getFilledSlots());
            }
            for (int i8 = 0; i8 < this.unfilledSlots_.size(); i8++) {
                AbstractC5209f0.writeString(abstractC5248t, 2, this.unfilledSlots_.getRaw(i8));
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private LauncherSlotsFilled(AbstractC5209f0.b bVar) {
            super(bVar);
            this.unfilledSlots_ = C5247s0.emptyList();
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(LauncherSlotsFilled launcherSlotsFilled) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(launcherSlotsFilled);
        }

        public static LauncherSlotsFilled parseFrom(ByteBuffer byteBuffer, M m8) {
            return (LauncherSlotsFilled) PARSER.parseFrom(byteBuffer, m8);
        }

        @Override // maum.m2u.common.EventOuterClass.LauncherSlotsFilledOrBuilder
        public InterfaceC5207e1 getUnfilledSlotsList() {
            return this.unfilledSlots_;
        }

        public static LauncherSlotsFilled parseDelimitedFrom(InputStream inputStream, M m8) {
            return (LauncherSlotsFilled) AbstractC5209f0.parseDelimitedWithIOException(PARSER, inputStream, m8);
        }

        public static LauncherSlotsFilled parseFrom(AbstractC5235o abstractC5235o) {
            return (LauncherSlotsFilled) PARSER.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public LauncherSlotsFilled getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder((AnonymousClass1) null) : new Builder((AnonymousClass1) null).mergeFrom(this);
        }

        public static LauncherSlotsFilled parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (LauncherSlotsFilled) PARSER.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private LauncherSlotsFilled() {
            this.unfilledSlots_ = C5247s0.emptyList();
            this.memoizedIsInitialized = (byte) -1;
            this.unfilledSlots_ = C5247s0.emptyList();
        }

        public static LauncherSlotsFilled parseFrom(byte[] bArr) {
            return (LauncherSlotsFilled) PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC5209f0
        public Builder newBuilderForType(AbstractC5209f0.c cVar) {
            return new Builder(cVar, null);
        }

        public static LauncherSlotsFilled parseFrom(byte[] bArr, M m8) {
            return (LauncherSlotsFilled) PARSER.parseFrom(bArr, m8);
        }

        public static LauncherSlotsFilled parseFrom(InputStream inputStream) {
            return (LauncherSlotsFilled) AbstractC5209f0.parseWithIOException(PARSER, inputStream);
        }

        public static LauncherSlotsFilled parseFrom(InputStream inputStream, M m8) {
            return (LauncherSlotsFilled) AbstractC5209f0.parseWithIOException(PARSER, inputStream, m8);
        }

        public static LauncherSlotsFilled parseFrom(r rVar) {
            return (LauncherSlotsFilled) AbstractC5209f0.parseWithIOException(PARSER, rVar);
        }

        public static LauncherSlotsFilled parseFrom(r rVar, M m8) {
            return (LauncherSlotsFilled) AbstractC5209f0.parseWithIOException(PARSER, rVar, m8);
        }
    }

    public interface LauncherSlotsFilledOrBuilder extends N0 {
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

        C5240p1 getFilledSlots();

        InterfaceC5243q1 getFilledSlotsOrBuilder();

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        String getUnfilledSlots(int i8);

        AbstractC5235o getUnfilledSlotsBytes(int i8);

        int getUnfilledSlotsCount();

        List<String> getUnfilledSlotsList();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        boolean hasFilledSlots();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    static {
        C5269x.b bVar = getDescriptor().getMessageTypes().get(0);
        internal_static_maum_m2u_common_Event_descriptor = bVar;
        internal_static_maum_m2u_common_Event_fieldAccessorTable = new AbstractC5209f0.g(bVar, new String[]{"Interface", "Operation", "Param", "Payload"});
        C5269x.b bVar2 = getDescriptor().getMessageTypes().get(1);
        internal_static_maum_m2u_common_DelegateEvent_descriptor = bVar2;
        internal_static_maum_m2u_common_DelegateEvent_fieldAccessorTable = new AbstractC5209f0.g(bVar2, new String[]{"Interface", "Operation", "Param", "Payload"});
        C5269x.b bVar3 = getDescriptor().getMessageTypes().get(2);
        internal_static_maum_m2u_common_LauncherAuthorized_descriptor = bVar3;
        internal_static_maum_m2u_common_LauncherAuthorized_fieldAccessorTable = new AbstractC5209f0.g(bVar3, new String[]{"AccessToken", "AuthorizedAt", "Meta"});
        C5269x.b bVar4 = getDescriptor().getMessageTypes().get(3);
        internal_static_maum_m2u_common_LauncherAuthorizeFailed_descriptor = bVar4;
        internal_static_maum_m2u_common_LauncherAuthorizeFailed_fieldAccessorTable = new AbstractC5209f0.g(bVar4, new String[]{"AccessToken", "AuthorizedAt"});
        C5269x.b bVar5 = getDescriptor().getMessageTypes().get(4);
        internal_static_maum_m2u_common_LauncherSlotsFilled_descriptor = bVar5;
        internal_static_maum_m2u_common_LauncherSlotsFilled_fieldAccessorTable = new AbstractC5209f0.g(bVar5, new String[]{"FilledSlots", "UnfilledSlots"});
        C5269x.b bVar6 = getDescriptor().getMessageTypes().get(5);
        internal_static_maum_m2u_common_AudioPlayerPlay_descriptor = bVar6;
        internal_static_maum_m2u_common_AudioPlayerPlay_fieldAccessorTable = new AbstractC5209f0.g(bVar6, new String[]{"Id", "Reason"});
        C5269x.b bVar7 = getDescriptor().getMessageTypes().get(6);
        internal_static_maum_m2u_common_DialogAgentForwarderParam_descriptor = bVar7;
        internal_static_maum_m2u_common_DialogAgentForwarderParam_fieldAccessorTable = new AbstractC5209f0.g(bVar7, new String[]{"Chatbot", "Skill", "Intent", "Lang", "SessionId"});
        C5269x.b bVar8 = getDescriptor().getMessageTypes().get(7);
        internal_static_maum_m2u_common_LauncherDocumentRead_descriptor = bVar8;
        internal_static_maum_m2u_common_LauncherDocumentRead_fieldAccessorTable = new AbstractC5209f0.g(bVar8, new String[]{"Id", "Read"});
        C5269x.b bVar9 = getDescriptor().getMessageTypes().get(8);
        internal_static_maum_m2u_common_EventPayload_descriptor = bVar9;
        internal_static_maum_m2u_common_EventPayload_fieldAccessorTable = new AbstractC5209f0.g(bVar9, new String[]{"LauncherAuthorized", "LauncherAuthorizeFailed", "LauncherSlotsFilled", "AudioPlayerPlay", "LauncherDocumentRead", "TestEvent"});
        AbstractC5245r1.getDescriptor();
        y1.getDescriptor();
        b.getDescriptor();
    }

    private EventOuterClass() {
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
