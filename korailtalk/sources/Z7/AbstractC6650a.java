package z7;

import B7.a;
import B7.b;
import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5196b;
import com.google.protobuf.AbstractC5199c;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.AbstractC5227l0;
import com.google.protobuf.AbstractC5235o;
import com.google.protobuf.AbstractC5248t;
import com.google.protobuf.C5230m0;
import com.google.protobuf.C5269x;
import com.google.protobuf.D;
import com.google.protobuf.E1;
import com.google.protobuf.G1;
import com.google.protobuf.H0;
import com.google.protobuf.K;
import com.google.protobuf.K0;
import com.google.protobuf.M;
import com.google.protobuf.N0;
import com.google.protobuf.Z0;
import com.google.protobuf.r;
import e0.C5339a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: z7.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6650a {

    /* renamed from: a */
    private static final C5269x.b f37954a;

    /* renamed from: b */
    private static final AbstractC5209f0.g f37955b;

    /* renamed from: c */
    private static final C5269x.b f37956c;

    /* renamed from: d */
    private static final AbstractC5209f0.g f37957d;

    /* renamed from: e */
    private static final C5269x.b f37958e;

    /* renamed from: f */
    private static final AbstractC5209f0.g f37959f;

    /* renamed from: g */
    private static final C5269x.b f37960g;

    /* renamed from: h */
    private static final AbstractC5209f0.g f37961h;

    /* renamed from: i */
    private static final C5269x.b f37962i;

    /* renamed from: j */
    private static final AbstractC5209f0.g f37963j;

    /* renamed from: k */
    private static C5269x.h f37964k = C5269x.h.internalBuildGeneratedFileFrom(new String[]{"\n\u001bmaum/brain/stt/speech.proto\u0012\u000emaum.brain.stt\u001a\u001egoogle/protobuf/duration.proto\u001a\u0016maum/common/lang.proto\u001a\u001fmaum/common/audioencoding.proto\"\u0094\u0002\n\u0016SpeechRecognitionParam\u0012,\n\bencoding\u0018\u0001 \u0001(\u000e2\u001a.maum.common.AudioEncoding\u0012\u0013\n\u000bsample_rate\u0018\u0002 \u0001(\u0005\u0012\u001f\n\u0004lang\u0018\u0003 \u0001(\u000e2\u0011.maum.common.Lang\u0012\r\n\u0005model\u0018\u0004 \u0001(\t\u0012\u0018\n\u0010single_utterance\u0018\u0005 \u0001(\b\u0012\u0017\n\u000finterim_results\u0018\u0006 \u0001(\u0005\u0012\u0018\n\u0010max_alternatives\u0018\u000b \u0001(\u0005\u0012\u0018\n\u0010profanity_filter\u0018\u0015 \u0001(\b\u0012 \n\u0018enable_word_time_offsets\u0018\u0016 \u0001(\b\"\u0089\u0001\n\u0019StreamingRecognizeRequest\u0012>\n\fspeech_param\u0018\u0001 \u0001(\u000b2&.maum.brain.stt.SpeechRecognitionParamH\u0000\u0012\u0017\n\raudio_content\u0018\u0002 \u0001(\fH\u0000B\u0013\n\u0011streaming_request\"û\u0001\n\u001aStreamingRecognizeResponse\u00128\n\u0007results\u0018\u0001 \u0003(\u000b2'.maum.brain.stt.SpeechRecognitionResult\u0012U\n\u0011speech_event_type\u0018\u0004 \u0001(\u000e2:.maum.brain.stt.StreamingRecognizeResponse.SpeechEventType\"L\n\u000fSpeechEventType\u0012\u001c\n\u0018SPEECH_EVENT_UNSPECIFIED\u0010\u0000\u0012\u001b\n\u0017END_OF_SINGLE_UTTERANCE\u0010\u0001\"t\n\bWordInfo\u0012-\n\nstart_time\u0018\u0001 \u0001(\u000b2\u0019.google.protobuf.Duration\u0012+\n\bend_time\u0018\u0002 \u0001(\u000b2\u0019.google.protobuf.Duration\u0012\f\n\u0004word\u0018\u0003 \u0001(\t\"e\n\u0017SpeechRecognitionResult\u0012\u0012\n\ntranscript\u0018\u0001 \u0001(\t\u0012\r\n\u0005final\u0018\u0002 \u0001(\b\u0012'\n\u0005words\u0018\u0003 \u0003(\u000b2\u0018.maum.brain.stt.WordInfoB\u0003ø\u0001\u0001b\u0006proto3"}, new C5269x.h[]{D.getDescriptor(), B7.b.getDescriptor(), B7.a.getDescriptor()});

    /* renamed from: z7.a$b */
    public static final class b extends AbstractC5209f0 implements c {
        public static final int ENABLE_WORD_TIME_OFFSETS_FIELD_NUMBER = 22;
        public static final int ENCODING_FIELD_NUMBER = 1;
        public static final int INTERIM_RESULTS_FIELD_NUMBER = 6;
        public static final int LANG_FIELD_NUMBER = 3;
        public static final int MAX_ALTERNATIVES_FIELD_NUMBER = 11;
        public static final int MODEL_FIELD_NUMBER = 4;
        public static final int PROFANITY_FILTER_FIELD_NUMBER = 21;
        public static final int SAMPLE_RATE_FIELD_NUMBER = 2;
        public static final int SINGLE_UTTERANCE_FIELD_NUMBER = 5;

        /* renamed from: k */
        private static final b f37965k = new b();

        /* renamed from: l */
        private static final Z0 f37966l = new C0440a();

        /* renamed from: a */
        private int f37967a;

        /* renamed from: b */
        private int f37968b;

        /* renamed from: c */
        private int f37969c;

        /* renamed from: d */
        private volatile Object f37970d;

        /* renamed from: e */
        private boolean f37971e;

        /* renamed from: f */
        private int f37972f;

        /* renamed from: g */
        private int f37973g;

        /* renamed from: h */
        private boolean f37974h;

        /* renamed from: i */
        private boolean f37975i;

        /* renamed from: j */
        private byte f37976j;

        /* renamed from: z7.a$b$a */
        class C0440a extends AbstractC5199c {
            C0440a() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public b parsePartialFrom(r rVar, M m8) throws C5230m0 {
                C0441b c0441bNewBuilder = b.newBuilder();
                try {
                    c0441bNewBuilder.mergeFrom(rVar, m8);
                    return c0441bNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(c0441bNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(c0441bNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(c0441bNewBuilder.buildPartial());
                }
            }
        }

        /* renamed from: z7.a$b$b */
        public static final class C0441b extends AbstractC5209f0.b implements c {

            /* renamed from: a */
            private int f37977a;

            /* renamed from: b */
            private int f37978b;

            /* renamed from: c */
            private int f37979c;

            /* renamed from: d */
            private int f37980d;

            /* renamed from: e */
            private Object f37981e;

            /* renamed from: f */
            private boolean f37982f;

            /* renamed from: g */
            private int f37983g;

            /* renamed from: h */
            private int f37984h;

            /* renamed from: i */
            private boolean f37985i;

            /* renamed from: j */
            private boolean f37986j;

            /* synthetic */ C0441b(AbstractC5209f0.c cVar, C0439a c0439a) {
                this(cVar);
            }

            private void e(b bVar) {
                int i8 = this.f37977a;
                if ((i8 & 1) != 0) {
                    bVar.f37967a = this.f37978b;
                }
                if ((i8 & 2) != 0) {
                    bVar.f37968b = this.f37979c;
                }
                if ((i8 & 4) != 0) {
                    bVar.f37969c = this.f37980d;
                }
                if ((i8 & 8) != 0) {
                    bVar.f37970d = this.f37981e;
                }
                if ((i8 & 16) != 0) {
                    bVar.f37971e = this.f37982f;
                }
                if ((i8 & 32) != 0) {
                    bVar.f37972f = this.f37983g;
                }
                if ((i8 & 64) != 0) {
                    bVar.f37973g = this.f37984h;
                }
                if ((i8 & 128) != 0) {
                    bVar.f37974h = this.f37985i;
                }
                if ((i8 & 256) != 0) {
                    bVar.f37975i = this.f37986j;
                }
            }

            public static final C5269x.b getDescriptor() {
                return AbstractC6650a.f37954a;
            }

            public C0441b clearEnableWordTimeOffsets() {
                this.f37977a &= -257;
                this.f37986j = false;
                onChanged();
                return this;
            }

            public C0441b clearEncoding() {
                this.f37977a &= -2;
                this.f37978b = 0;
                onChanged();
                return this;
            }

            public C0441b clearInterimResults() {
                this.f37977a &= -33;
                this.f37983g = 0;
                onChanged();
                return this;
            }

            public C0441b clearLang() {
                this.f37977a &= -5;
                this.f37980d = 0;
                onChanged();
                return this;
            }

            public C0441b clearMaxAlternatives() {
                this.f37977a &= -65;
                this.f37984h = 0;
                onChanged();
                return this;
            }

            public C0441b clearModel() {
                this.f37981e = b.getDefaultInstance().getModel();
                this.f37977a &= -9;
                onChanged();
                return this;
            }

            public C0441b clearProfanityFilter() {
                this.f37977a &= -129;
                this.f37985i = false;
                onChanged();
                return this;
            }

            public C0441b clearSampleRate() {
                this.f37977a &= -3;
                this.f37979c = 0;
                onChanged();
                return this;
            }

            public C0441b clearSingleUtterance() {
                this.f37977a &= -17;
                this.f37982f = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return AbstractC6650a.f37954a;
            }

            @Override // z7.AbstractC6650a.c
            public boolean getEnableWordTimeOffsets() {
                return this.f37986j;
            }

            @Override // z7.AbstractC6650a.c
            public a.EnumC0009a getEncoding() {
                a.EnumC0009a enumC0009aForNumber = a.EnumC0009a.forNumber(this.f37978b);
                return enumC0009aForNumber == null ? a.EnumC0009a.UNRECOGNIZED : enumC0009aForNumber;
            }

            @Override // z7.AbstractC6650a.c
            public int getEncodingValue() {
                return this.f37978b;
            }

            @Override // z7.AbstractC6650a.c
            public int getInterimResults() {
                return this.f37983g;
            }

            @Override // z7.AbstractC6650a.c
            public b.a getLang() {
                b.a aVarForNumber = b.a.forNumber(this.f37980d);
                return aVarForNumber == null ? b.a.UNRECOGNIZED : aVarForNumber;
            }

            @Override // z7.AbstractC6650a.c
            public int getLangValue() {
                return this.f37980d;
            }

            @Override // z7.AbstractC6650a.c
            public int getMaxAlternatives() {
                return this.f37984h;
            }

            @Override // z7.AbstractC6650a.c
            public String getModel() {
                Object obj = this.f37981e;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
                this.f37981e = stringUtf8;
                return stringUtf8;
            }

            @Override // z7.AbstractC6650a.c
            public AbstractC5235o getModelBytes() {
                Object obj = this.f37981e;
                if (!(obj instanceof String)) {
                    return (AbstractC5235o) obj;
                }
                AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
                this.f37981e = abstractC5235oCopyFromUtf8;
                return abstractC5235oCopyFromUtf8;
            }

            @Override // z7.AbstractC6650a.c
            public boolean getProfanityFilter() {
                return this.f37985i;
            }

            @Override // z7.AbstractC6650a.c
            public int getSampleRate() {
                return this.f37979c;
            }

            @Override // z7.AbstractC6650a.c
            public boolean getSingleUtterance() {
                return this.f37982f;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return AbstractC6650a.f37955b.ensureFieldAccessorsInitialized(b.class, C0441b.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public C0441b setEnableWordTimeOffsets(boolean z8) {
                this.f37986j = z8;
                this.f37977a |= 256;
                onChanged();
                return this;
            }

            public C0441b setEncoding(a.EnumC0009a enumC0009a) {
                enumC0009a.getClass();
                this.f37977a |= 1;
                this.f37978b = enumC0009a.getNumber();
                onChanged();
                return this;
            }

            public C0441b setEncodingValue(int i8) {
                this.f37978b = i8;
                this.f37977a |= 1;
                onChanged();
                return this;
            }

            public C0441b setInterimResults(int i8) {
                this.f37983g = i8;
                this.f37977a |= 32;
                onChanged();
                return this;
            }

            public C0441b setLang(b.a aVar) {
                aVar.getClass();
                this.f37977a |= 4;
                this.f37980d = aVar.getNumber();
                onChanged();
                return this;
            }

            public C0441b setLangValue(int i8) {
                this.f37980d = i8;
                this.f37977a |= 4;
                onChanged();
                return this;
            }

            public C0441b setMaxAlternatives(int i8) {
                this.f37984h = i8;
                this.f37977a |= 64;
                onChanged();
                return this;
            }

            public C0441b setModel(String str) {
                str.getClass();
                this.f37981e = str;
                this.f37977a |= 8;
                onChanged();
                return this;
            }

            public C0441b setModelBytes(AbstractC5235o abstractC5235o) {
                abstractC5235o.getClass();
                AbstractC5196b.checkByteStringIsUtf8(abstractC5235o);
                this.f37981e = abstractC5235o;
                this.f37977a |= 8;
                onChanged();
                return this;
            }

            public C0441b setProfanityFilter(boolean z8) {
                this.f37985i = z8;
                this.f37977a |= 128;
                onChanged();
                return this;
            }

            public C0441b setSampleRate(int i8) {
                this.f37979c = i8;
                this.f37977a |= 2;
                onChanged();
                return this;
            }

            public C0441b setSingleUtterance(boolean z8) {
                this.f37982f = z8;
                this.f37977a |= 16;
                onChanged();
                return this;
            }

            /* synthetic */ C0441b(C0439a c0439a) {
                this();
            }

            private C0441b() {
                this.f37978b = 0;
                this.f37980d = 0;
                this.f37981e = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public C0441b addRepeatedField(C5269x.g gVar, Object obj) {
                return (C0441b) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public b build() {
                b bVarBuildPartial = buildPartial();
                if (bVarBuildPartial.isInitialized()) {
                    return bVarBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) bVarBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public b buildPartial() {
                b bVar = new b(this);
                if (this.f37977a != 0) {
                    e(bVar);
                }
                onBuilt();
                return bVar;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public C0441b clearField(C5269x.g gVar) {
                return (C0441b) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public b getDefaultInstanceForType() {
                return b.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public C0441b setField(C5269x.g gVar, Object obj) {
                return (C0441b) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public C0441b setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (C0441b) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final C0441b setUnknownFields(G1 g12) {
                return (C0441b) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public C0441b clearOneof(C5269x.l lVar) {
                return (C0441b) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final C0441b mergeUnknownFields(G1 g12) {
                return (C0441b) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public C0441b clear() {
                super.clear();
                this.f37977a = 0;
                this.f37978b = 0;
                this.f37979c = 0;
                this.f37980d = 0;
                this.f37981e = "";
                this.f37982f = false;
                this.f37983g = 0;
                this.f37984h = 0;
                this.f37985i = false;
                this.f37986j = false;
                return this;
            }

            private C0441b(AbstractC5209f0.c cVar) {
                super(cVar);
                this.f37978b = 0;
                this.f37980d = 0;
                this.f37981e = "";
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public C0441b mo3clone() {
                return (C0441b) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public C0441b mergeFrom(H0 h02) {
                if (h02 instanceof b) {
                    return mergeFrom((b) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public C0441b mergeFrom(b bVar) {
                if (bVar == b.getDefaultInstance()) {
                    return this;
                }
                if (bVar.f37967a != 0) {
                    setEncodingValue(bVar.getEncodingValue());
                }
                if (bVar.getSampleRate() != 0) {
                    setSampleRate(bVar.getSampleRate());
                }
                if (bVar.f37969c != 0) {
                    setLangValue(bVar.getLangValue());
                }
                if (!bVar.getModel().isEmpty()) {
                    this.f37981e = bVar.f37970d;
                    this.f37977a |= 8;
                    onChanged();
                }
                if (bVar.getSingleUtterance()) {
                    setSingleUtterance(bVar.getSingleUtterance());
                }
                if (bVar.getInterimResults() != 0) {
                    setInterimResults(bVar.getInterimResults());
                }
                if (bVar.getMaxAlternatives() != 0) {
                    setMaxAlternatives(bVar.getMaxAlternatives());
                }
                if (bVar.getProfanityFilter()) {
                    setProfanityFilter(bVar.getProfanityFilter());
                }
                if (bVar.getEnableWordTimeOffsets()) {
                    setEnableWordTimeOffsets(bVar.getEnableWordTimeOffsets());
                }
                mergeUnknownFields(bVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public C0441b mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f37978b = rVar.readEnum();
                                    this.f37977a |= 1;
                                } else if (tag == 16) {
                                    this.f37979c = rVar.readInt32();
                                    this.f37977a |= 2;
                                } else if (tag == 24) {
                                    this.f37980d = rVar.readEnum();
                                    this.f37977a |= 4;
                                } else if (tag == 34) {
                                    this.f37981e = rVar.readStringRequireUtf8();
                                    this.f37977a |= 8;
                                } else if (tag == 40) {
                                    this.f37982f = rVar.readBool();
                                    this.f37977a |= 16;
                                } else if (tag == 48) {
                                    this.f37983g = rVar.readInt32();
                                    this.f37977a |= 32;
                                } else if (tag == 88) {
                                    this.f37984h = rVar.readInt32();
                                    this.f37977a |= 64;
                                } else if (tag == 168) {
                                    this.f37985i = rVar.readBool();
                                    this.f37977a |= 128;
                                } else if (tag != 176) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.f37986j = rVar.readBool();
                                    this.f37977a |= 256;
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

        /* synthetic */ b(AbstractC5209f0.b bVar, C0439a c0439a) {
            this(bVar);
        }

        public static b getDefaultInstance() {
            return f37965k;
        }

        public static final C5269x.b getDescriptor() {
            return AbstractC6650a.f37954a;
        }

        public static C0441b newBuilder() {
            return f37965k.toBuilder();
        }

        public static b parseDelimitedFrom(InputStream inputStream) {
            return (b) AbstractC5209f0.parseDelimitedWithIOException(f37966l, inputStream);
        }

        public static b parseFrom(ByteBuffer byteBuffer) {
            return (b) f37966l.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return f37966l;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return super.equals(obj);
            }
            b bVar = (b) obj;
            return this.f37967a == bVar.f37967a && getSampleRate() == bVar.getSampleRate() && this.f37969c == bVar.f37969c && getModel().equals(bVar.getModel()) && getSingleUtterance() == bVar.getSingleUtterance() && getInterimResults() == bVar.getInterimResults() && getMaxAlternatives() == bVar.getMaxAlternatives() && getProfanityFilter() == bVar.getProfanityFilter() && getEnableWordTimeOffsets() == bVar.getEnableWordTimeOffsets() && getUnknownFields().equals(bVar.getUnknownFields());
        }

        @Override // z7.AbstractC6650a.c
        public boolean getEnableWordTimeOffsets() {
            return this.f37975i;
        }

        @Override // z7.AbstractC6650a.c
        public a.EnumC0009a getEncoding() {
            a.EnumC0009a enumC0009aForNumber = a.EnumC0009a.forNumber(this.f37967a);
            return enumC0009aForNumber == null ? a.EnumC0009a.UNRECOGNIZED : enumC0009aForNumber;
        }

        @Override // z7.AbstractC6650a.c
        public int getEncodingValue() {
            return this.f37967a;
        }

        @Override // z7.AbstractC6650a.c
        public int getInterimResults() {
            return this.f37972f;
        }

        @Override // z7.AbstractC6650a.c
        public b.a getLang() {
            b.a aVarForNumber = b.a.forNumber(this.f37969c);
            return aVarForNumber == null ? b.a.UNRECOGNIZED : aVarForNumber;
        }

        @Override // z7.AbstractC6650a.c
        public int getLangValue() {
            return this.f37969c;
        }

        @Override // z7.AbstractC6650a.c
        public int getMaxAlternatives() {
            return this.f37973g;
        }

        @Override // z7.AbstractC6650a.c
        public String getModel() {
            Object obj = this.f37970d;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((AbstractC5235o) obj).toStringUtf8();
            this.f37970d = stringUtf8;
            return stringUtf8;
        }

        @Override // z7.AbstractC6650a.c
        public AbstractC5235o getModelBytes() {
            Object obj = this.f37970d;
            if (!(obj instanceof String)) {
                return (AbstractC5235o) obj;
            }
            AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8((String) obj);
            this.f37970d = abstractC5235oCopyFromUtf8;
            return abstractC5235oCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return f37966l;
        }

        @Override // z7.AbstractC6650a.c
        public boolean getProfanityFilter() {
            return this.f37974h;
        }

        @Override // z7.AbstractC6650a.c
        public int getSampleRate() {
            return this.f37968b;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeEnumSize = this.f37967a != a.EnumC0009a.ENCODING_UNSPECIFIED.getNumber() ? AbstractC5248t.computeEnumSize(1, this.f37967a) : 0;
            int i9 = this.f37968b;
            if (i9 != 0) {
                iComputeEnumSize += AbstractC5248t.computeInt32Size(2, i9);
            }
            if (this.f37969c != b.a.ko_KR.getNumber()) {
                iComputeEnumSize += AbstractC5248t.computeEnumSize(3, this.f37969c);
            }
            if (!AbstractC5209f0.isStringEmpty(this.f37970d)) {
                iComputeEnumSize += AbstractC5209f0.computeStringSize(4, this.f37970d);
            }
            boolean z8 = this.f37971e;
            if (z8) {
                iComputeEnumSize += AbstractC5248t.computeBoolSize(5, z8);
            }
            int i10 = this.f37972f;
            if (i10 != 0) {
                iComputeEnumSize += AbstractC5248t.computeInt32Size(6, i10);
            }
            int i11 = this.f37973g;
            if (i11 != 0) {
                iComputeEnumSize += AbstractC5248t.computeInt32Size(11, i11);
            }
            boolean z9 = this.f37974h;
            if (z9) {
                iComputeEnumSize += AbstractC5248t.computeBoolSize(21, z9);
            }
            boolean z10 = this.f37975i;
            if (z10) {
                iComputeEnumSize += AbstractC5248t.computeBoolSize(22, z10);
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // z7.AbstractC6650a.c
        public boolean getSingleUtterance() {
            return this.f37971e;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.f37967a) * 37) + 2) * 53) + getSampleRate()) * 37) + 3) * 53) + this.f37969c) * 37) + 4) * 53) + getModel().hashCode()) * 37) + 5) * 53) + AbstractC5227l0.hashBoolean(getSingleUtterance())) * 37) + 6) * 53) + getInterimResults()) * 37) + 11) * 53) + getMaxAlternatives()) * 37) + 21) * 53) + AbstractC5227l0.hashBoolean(getProfanityFilter())) * 37) + 22) * 53) + AbstractC5227l0.hashBoolean(getEnableWordTimeOffsets())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return AbstractC6650a.f37955b.ensureFieldAccessorsInitialized(b.class, C0441b.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.f37976j;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.f37976j = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new b();
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (this.f37967a != a.EnumC0009a.ENCODING_UNSPECIFIED.getNumber()) {
                abstractC5248t.writeEnum(1, this.f37967a);
            }
            int i8 = this.f37968b;
            if (i8 != 0) {
                abstractC5248t.writeInt32(2, i8);
            }
            if (this.f37969c != b.a.ko_KR.getNumber()) {
                abstractC5248t.writeEnum(3, this.f37969c);
            }
            if (!AbstractC5209f0.isStringEmpty(this.f37970d)) {
                AbstractC5209f0.writeString(abstractC5248t, 4, this.f37970d);
            }
            boolean z8 = this.f37971e;
            if (z8) {
                abstractC5248t.writeBool(5, z8);
            }
            int i9 = this.f37972f;
            if (i9 != 0) {
                abstractC5248t.writeInt32(6, i9);
            }
            int i10 = this.f37973g;
            if (i10 != 0) {
                abstractC5248t.writeInt32(11, i10);
            }
            boolean z9 = this.f37974h;
            if (z9) {
                abstractC5248t.writeBool(21, z9);
            }
            boolean z10 = this.f37975i;
            if (z10) {
                abstractC5248t.writeBool(22, z10);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        @Override // com.google.protobuf.AbstractC5209f0
        /* renamed from: z */
        public C0441b newBuilderForType(AbstractC5209f0.c cVar) {
            return new C0441b(cVar);
        }

        private b(AbstractC5209f0.b bVar) {
            super(bVar);
            this.f37967a = 0;
            this.f37968b = 0;
            this.f37969c = 0;
            this.f37970d = "";
            this.f37971e = false;
            this.f37972f = 0;
            this.f37973g = 0;
            this.f37974h = false;
            this.f37975i = false;
            this.f37976j = (byte) -1;
        }

        public static C0441b newBuilder(b bVar) {
            return f37965k.toBuilder().mergeFrom(bVar);
        }

        public static b parseFrom(ByteBuffer byteBuffer, M m8) {
            return (b) f37966l.parseFrom(byteBuffer, m8);
        }

        public static b parseDelimitedFrom(InputStream inputStream, M m8) {
            return (b) AbstractC5209f0.parseDelimitedWithIOException(f37966l, inputStream, m8);
        }

        public static b parseFrom(AbstractC5235o abstractC5235o) {
            return (b) f37966l.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public b getDefaultInstanceForType() {
            return f37965k;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public C0441b toBuilder() {
            return this == f37965k ? new C0441b() : new C0441b().mergeFrom(this);
        }

        public static b parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (b) f37966l.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public C0441b newBuilderForType() {
            return newBuilder();
        }

        public static b parseFrom(byte[] bArr) {
            return (b) f37966l.parseFrom(bArr);
        }

        public static b parseFrom(byte[] bArr, M m8) {
            return (b) f37966l.parseFrom(bArr, m8);
        }

        public static b parseFrom(InputStream inputStream) {
            return (b) AbstractC5209f0.parseWithIOException(f37966l, inputStream);
        }

        public static b parseFrom(InputStream inputStream, M m8) {
            return (b) AbstractC5209f0.parseWithIOException(f37966l, inputStream, m8);
        }

        public static b parseFrom(r rVar) {
            return (b) AbstractC5209f0.parseWithIOException(f37966l, rVar);
        }

        private b() {
            this.f37967a = 0;
            this.f37968b = 0;
            this.f37969c = 0;
            this.f37970d = "";
            this.f37971e = false;
            this.f37972f = 0;
            this.f37973g = 0;
            this.f37974h = false;
            this.f37975i = false;
            this.f37976j = (byte) -1;
            this.f37967a = 0;
            this.f37969c = 0;
            this.f37970d = "";
        }

        public static b parseFrom(r rVar, M m8) {
            return (b) AbstractC5209f0.parseWithIOException(f37966l, rVar, m8);
        }
    }

    /* renamed from: z7.a$c */
    public interface c extends N0 {
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

        boolean getEnableWordTimeOffsets();

        a.EnumC0009a getEncoding();

        int getEncodingValue();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        int getInterimResults();

        b.a getLang();

        int getLangValue();

        int getMaxAlternatives();

        String getModel();

        AbstractC5235o getModelBytes();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        boolean getProfanityFilter();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        int getSampleRate();

        boolean getSingleUtterance();

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
        f37954a = bVar;
        f37955b = new AbstractC5209f0.g(bVar, new String[]{"Encoding", "SampleRate", "Lang", C5339a.TAG_MODEL, "SingleUtterance", "InterimResults", "MaxAlternatives", "ProfanityFilter", "EnableWordTimeOffsets"});
        C5269x.b bVar2 = getDescriptor().getMessageTypes().get(1);
        f37956c = bVar2;
        f37957d = new AbstractC5209f0.g(bVar2, new String[]{"SpeechParam", "AudioContent", "StreamingRequest"});
        C5269x.b bVar3 = getDescriptor().getMessageTypes().get(2);
        f37958e = bVar3;
        f37959f = new AbstractC5209f0.g(bVar3, new String[]{"Results", "SpeechEventType"});
        C5269x.b bVar4 = getDescriptor().getMessageTypes().get(3);
        f37960g = bVar4;
        f37961h = new AbstractC5209f0.g(bVar4, new String[]{"StartTime", "EndTime", "Word"});
        C5269x.b bVar5 = getDescriptor().getMessageTypes().get(4);
        f37962i = bVar5;
        f37963j = new AbstractC5209f0.g(bVar5, new String[]{"Transcript", "Final", "Words"});
        D.getDescriptor();
        B7.b.getDescriptor();
        B7.a.getDescriptor();
    }

    public static C5269x.h getDescriptor() {
        return f37964k;
    }

    public static void registerAllExtensions(M m8) {
    }

    public static void registerAllExtensions(K k8) {
        registerAllExtensions((M) k8);
    }
}
