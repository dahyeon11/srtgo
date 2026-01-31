package A7;

import B7.a;
import B7.b;
import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5199c;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.AbstractC5235o;
import com.google.protobuf.AbstractC5248t;
import com.google.protobuf.C5230m0;
import com.google.protobuf.C5269x;
import com.google.protobuf.E1;
import com.google.protobuf.G1;
import com.google.protobuf.H0;
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
public abstract class a {

    /* renamed from: a */
    private static final C5269x.b f141a;

    /* renamed from: b */
    private static final AbstractC5209f0.g f142b;

    /* renamed from: c */
    private static final C5269x.b f143c;

    /* renamed from: d */
    private static final AbstractC5209f0.g f144d;

    /* renamed from: e */
    private static final C5269x.b f145e;

    /* renamed from: f */
    private static final AbstractC5209f0.g f146f;

    /* renamed from: g */
    private static C5269x.h f147g = C5269x.h.internalBuildGeneratedFileFrom(new String[]{"\n\u001bmaum/brain/tts/speech.proto\u0012\u000emaum.brain.tts\u001a\u0016maum/common/lang.proto\u001a\u001fmaum/common/audioencoding.proto\"|\n\u0016SpeechSynthesizerParam\u0012,\n\bencoding\u0018\u0001 \u0001(\u000e2\u001a.maum.common.AudioEncoding\u0012\u001f\n\u0004lang\u0018\u0002 \u0001(\u000e2\u0011.maum.common.Lang\u0012\u0013\n\u000bsample_rate\u0018\u0003 \u0001(\u0005\"\u0080\u0001\n\fSpeakRequest\u0012,\n\bencoding\u0018\u0001 \u0001(\u000e2\u001a.maum.common.AudioEncoding\u0012\u001f\n\u0004lang\u0018\u0002 \u0001(\u000e2\u0011.maum.common.Lang\u0012\u0013\n\u000bsample_rate\u0018\u0003 \u0001(\u0005\u0012\f\n\u0004text\u0018\u0004 \u0001(\t\"r\n\rSpeakResponse\u00127\n\u0005param\u0018\u0001 \u0001(\u000b2&.maum.brain.tts.SpeechSynthesizerParamH\u0000\u0012\u0017\n\raudio_content\u0018\u0002 \u0001(\fH\u0000B\u000f\n\rtest_response2b\n\u0018SpeechSynthesizerService\u0012F\n\u0005Speak\u0012\u001c.maum.brain.tts.SpeakRequest\u001a\u001d.maum.brain.tts.SpeakResponse0\u0001B\u0003ø\u0001\u0001b\u0006proto3"}, new C5269x.h[]{B7.b.getDescriptor(), B7.a.getDescriptor()});

    public static final class b extends AbstractC5209f0 implements c {
        public static final int ENCODING_FIELD_NUMBER = 1;
        public static final int LANG_FIELD_NUMBER = 2;
        public static final int SAMPLE_RATE_FIELD_NUMBER = 3;

        /* renamed from: e */
        private static final b f148e = new b();

        /* renamed from: f */
        private static final Z0 f149f = new C0006a();

        /* renamed from: a */
        private int f150a;

        /* renamed from: b */
        private int f151b;

        /* renamed from: c */
        private int f152c;

        /* renamed from: d */
        private byte f153d;

        /* renamed from: A7.a$b$a */
        class C0006a extends AbstractC5199c {
            C0006a() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public b parsePartialFrom(r rVar, M m8) throws C5230m0 {
                C0007b c0007bNewBuilder = b.newBuilder();
                try {
                    c0007bNewBuilder.mergeFrom(rVar, m8);
                    return c0007bNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(c0007bNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(c0007bNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(c0007bNewBuilder.buildPartial());
                }
            }
        }

        /* renamed from: A7.a$b$b */
        public static final class C0007b extends AbstractC5209f0.b implements c {

            /* renamed from: a */
            private int f154a;

            /* renamed from: b */
            private int f155b;

            /* renamed from: c */
            private int f156c;

            /* renamed from: d */
            private int f157d;

            /* synthetic */ C0007b(C0005a c0005a) {
                this();
            }

            private void e(b bVar) {
                int i8 = this.f154a;
                if ((i8 & 1) != 0) {
                    bVar.f150a = this.f155b;
                }
                if ((i8 & 2) != 0) {
                    bVar.f151b = this.f156c;
                }
                if ((i8 & 4) != 0) {
                    bVar.f152c = this.f157d;
                }
            }

            public static final C5269x.b getDescriptor() {
                return a.f141a;
            }

            public C0007b clearEncoding() {
                this.f154a &= -2;
                this.f155b = 0;
                onChanged();
                return this;
            }

            public C0007b clearLang() {
                this.f154a &= -3;
                this.f156c = 0;
                onChanged();
                return this;
            }

            public C0007b clearSampleRate() {
                this.f154a &= -5;
                this.f157d = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return a.f141a;
            }

            @Override // A7.a.c
            public a.EnumC0009a getEncoding() {
                a.EnumC0009a enumC0009aForNumber = a.EnumC0009a.forNumber(this.f155b);
                return enumC0009aForNumber == null ? a.EnumC0009a.UNRECOGNIZED : enumC0009aForNumber;
            }

            @Override // A7.a.c
            public int getEncodingValue() {
                return this.f155b;
            }

            @Override // A7.a.c
            public b.a getLang() {
                b.a aVarForNumber = b.a.forNumber(this.f156c);
                return aVarForNumber == null ? b.a.UNRECOGNIZED : aVarForNumber;
            }

            @Override // A7.a.c
            public int getLangValue() {
                return this.f156c;
            }

            @Override // A7.a.c
            public int getSampleRate() {
                return this.f157d;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return a.f142b.ensureFieldAccessorsInitialized(b.class, C0007b.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public C0007b setEncoding(a.EnumC0009a enumC0009a) {
                enumC0009a.getClass();
                this.f154a |= 1;
                this.f155b = enumC0009a.getNumber();
                onChanged();
                return this;
            }

            public C0007b setEncodingValue(int i8) {
                this.f155b = i8;
                this.f154a |= 1;
                onChanged();
                return this;
            }

            public C0007b setLang(b.a aVar) {
                aVar.getClass();
                this.f154a |= 2;
                this.f156c = aVar.getNumber();
                onChanged();
                return this;
            }

            public C0007b setLangValue(int i8) {
                this.f156c = i8;
                this.f154a |= 2;
                onChanged();
                return this;
            }

            public C0007b setSampleRate(int i8) {
                this.f157d = i8;
                this.f154a |= 4;
                onChanged();
                return this;
            }

            /* synthetic */ C0007b(AbstractC5209f0.c cVar, C0005a c0005a) {
                this(cVar);
            }

            private C0007b() {
                this.f155b = 0;
                this.f156c = 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public C0007b addRepeatedField(C5269x.g gVar, Object obj) {
                return (C0007b) super.addRepeatedField(gVar, obj);
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
                if (this.f154a != 0) {
                    e(bVar);
                }
                onBuilt();
                return bVar;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public C0007b clearField(C5269x.g gVar) {
                return (C0007b) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public b getDefaultInstanceForType() {
                return b.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public C0007b setField(C5269x.g gVar, Object obj) {
                return (C0007b) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public C0007b setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (C0007b) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final C0007b setUnknownFields(G1 g12) {
                return (C0007b) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public C0007b clearOneof(C5269x.l lVar) {
                return (C0007b) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final C0007b mergeUnknownFields(G1 g12) {
                return (C0007b) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public C0007b clear() {
                super.clear();
                this.f154a = 0;
                this.f155b = 0;
                this.f156c = 0;
                this.f157d = 0;
                return this;
            }

            private C0007b(AbstractC5209f0.c cVar) {
                super(cVar);
                this.f155b = 0;
                this.f156c = 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public C0007b mo3clone() {
                return (C0007b) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public C0007b mergeFrom(H0 h02) {
                if (h02 instanceof b) {
                    return mergeFrom((b) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public C0007b mergeFrom(b bVar) {
                if (bVar == b.getDefaultInstance()) {
                    return this;
                }
                if (bVar.f150a != 0) {
                    setEncodingValue(bVar.getEncodingValue());
                }
                if (bVar.f151b != 0) {
                    setLangValue(bVar.getLangValue());
                }
                if (bVar.getSampleRate() != 0) {
                    setSampleRate(bVar.getSampleRate());
                }
                mergeUnknownFields(bVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public C0007b mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f155b = rVar.readEnum();
                                    this.f154a |= 1;
                                } else if (tag == 16) {
                                    this.f156c = rVar.readEnum();
                                    this.f154a |= 2;
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.f157d = rVar.readInt32();
                                    this.f154a |= 4;
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

        /* synthetic */ b(AbstractC5209f0.b bVar, C0005a c0005a) {
            this(bVar);
        }

        public static b getDefaultInstance() {
            return f148e;
        }

        public static final C5269x.b getDescriptor() {
            return a.f141a;
        }

        public static C0007b newBuilder() {
            return f148e.toBuilder();
        }

        public static b parseDelimitedFrom(InputStream inputStream) {
            return (b) AbstractC5209f0.parseDelimitedWithIOException(f149f, inputStream);
        }

        public static b parseFrom(ByteBuffer byteBuffer) {
            return (b) f149f.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return f149f;
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
            return this.f150a == bVar.f150a && this.f151b == bVar.f151b && getSampleRate() == bVar.getSampleRate() && getUnknownFields().equals(bVar.getUnknownFields());
        }

        @Override // A7.a.c
        public a.EnumC0009a getEncoding() {
            a.EnumC0009a enumC0009aForNumber = a.EnumC0009a.forNumber(this.f150a);
            return enumC0009aForNumber == null ? a.EnumC0009a.UNRECOGNIZED : enumC0009aForNumber;
        }

        @Override // A7.a.c
        public int getEncodingValue() {
            return this.f150a;
        }

        @Override // A7.a.c
        public b.a getLang() {
            b.a aVarForNumber = b.a.forNumber(this.f151b);
            return aVarForNumber == null ? b.a.UNRECOGNIZED : aVarForNumber;
        }

        @Override // A7.a.c
        public int getLangValue() {
            return this.f151b;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return f149f;
        }

        @Override // A7.a.c
        public int getSampleRate() {
            return this.f152c;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeEnumSize = this.f150a != a.EnumC0009a.ENCODING_UNSPECIFIED.getNumber() ? AbstractC5248t.computeEnumSize(1, this.f150a) : 0;
            if (this.f151b != b.a.ko_KR.getNumber()) {
                iComputeEnumSize += AbstractC5248t.computeEnumSize(2, this.f151b);
            }
            int i9 = this.f152c;
            if (i9 != 0) {
                iComputeEnumSize += AbstractC5248t.computeInt32Size(3, i9);
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.f150a) * 37) + 2) * 53) + this.f151b) * 37) + 3) * 53) + getSampleRate()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return a.f142b.ensureFieldAccessorsInitialized(b.class, C0007b.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.f153d;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.f153d = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new b();
        }

        @Override // com.google.protobuf.AbstractC5209f0
        /* renamed from: r */
        public C0007b newBuilderForType(AbstractC5209f0.c cVar) {
            return new C0007b(cVar);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (this.f150a != a.EnumC0009a.ENCODING_UNSPECIFIED.getNumber()) {
                abstractC5248t.writeEnum(1, this.f150a);
            }
            if (this.f151b != b.a.ko_KR.getNumber()) {
                abstractC5248t.writeEnum(2, this.f151b);
            }
            int i8 = this.f152c;
            if (i8 != 0) {
                abstractC5248t.writeInt32(3, i8);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private b(AbstractC5209f0.b bVar) {
            super(bVar);
            this.f150a = 0;
            this.f151b = 0;
            this.f152c = 0;
            this.f153d = (byte) -1;
        }

        public static C0007b newBuilder(b bVar) {
            return f148e.toBuilder().mergeFrom(bVar);
        }

        public static b parseFrom(ByteBuffer byteBuffer, M m8) {
            return (b) f149f.parseFrom(byteBuffer, m8);
        }

        public static b parseDelimitedFrom(InputStream inputStream, M m8) {
            return (b) AbstractC5209f0.parseDelimitedWithIOException(f149f, inputStream, m8);
        }

        public static b parseFrom(AbstractC5235o abstractC5235o) {
            return (b) f149f.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public b getDefaultInstanceForType() {
            return f148e;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public C0007b toBuilder() {
            return this == f148e ? new C0007b() : new C0007b().mergeFrom(this);
        }

        public static b parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (b) f149f.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public C0007b newBuilderForType() {
            return newBuilder();
        }

        public static b parseFrom(byte[] bArr) {
            return (b) f149f.parseFrom(bArr);
        }

        public static b parseFrom(byte[] bArr, M m8) {
            return (b) f149f.parseFrom(bArr, m8);
        }

        private b() {
            this.f152c = 0;
            this.f153d = (byte) -1;
            this.f150a = 0;
            this.f151b = 0;
        }

        public static b parseFrom(InputStream inputStream) {
            return (b) AbstractC5209f0.parseWithIOException(f149f, inputStream);
        }

        public static b parseFrom(InputStream inputStream, M m8) {
            return (b) AbstractC5209f0.parseWithIOException(f149f, inputStream, m8);
        }

        public static b parseFrom(r rVar) {
            return (b) AbstractC5209f0.parseWithIOException(f149f, rVar);
        }

        public static b parseFrom(r rVar, M m8) {
            return (b) AbstractC5209f0.parseWithIOException(f149f, rVar, m8);
        }
    }

    public interface c extends N0 {
        @Override // com.google.protobuf.N0
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.N0
        /* synthetic */ Map getAllFields();

        /* synthetic */ H0 getDefaultInstanceForType();

        @Override // com.google.protobuf.N0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* bridge */ /* synthetic */ default K0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        /* synthetic */ C5269x.b getDescriptorForType();

        a.EnumC0009a getEncoding();

        int getEncodingValue();

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

        int getSampleRate();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        /* synthetic */ boolean isInitialized();
    }

    static {
        C5269x.b bVar = getDescriptor().getMessageTypes().get(0);
        f141a = bVar;
        f142b = new AbstractC5209f0.g(bVar, new String[]{"Encoding", "Lang", "SampleRate"});
        C5269x.b bVar2 = getDescriptor().getMessageTypes().get(1);
        f143c = bVar2;
        f144d = new AbstractC5209f0.g(bVar2, new String[]{"Encoding", "Lang", "SampleRate", "Text"});
        C5269x.b bVar3 = getDescriptor().getMessageTypes().get(2);
        f145e = bVar3;
        f146f = new AbstractC5209f0.g(bVar3, new String[]{"Param", "AudioContent", "TestResponse"});
        B7.b.getDescriptor();
        B7.a.getDescriptor();
    }

    public static C5269x.h getDescriptor() {
        return f147g;
    }

    public static void registerAllExtensions(M m8) {
    }

    public static void registerAllExtensions(K k8) {
        registerAllExtensions((M) k8);
    }
}
