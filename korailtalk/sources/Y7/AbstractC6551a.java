package y7;

import B7.b;
import com.google.protobuf.AbstractC5193a;
import com.google.protobuf.AbstractC5199c;
import com.google.protobuf.AbstractC5209f0;
import com.google.protobuf.AbstractC5227l0;
import com.google.protobuf.AbstractC5235o;
import com.google.protobuf.AbstractC5245r1;
import com.google.protobuf.AbstractC5248t;
import com.google.protobuf.C5230m0;
import com.google.protobuf.C5269x;
import com.google.protobuf.E1;
import com.google.protobuf.G1;
import com.google.protobuf.H0;
import com.google.protobuf.InterfaceC5204d1;
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

/* renamed from: y7.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6551a {

    /* renamed from: a */
    private static final C5269x.b f37657a;

    /* renamed from: b */
    private static final AbstractC5209f0.g f37658b;

    /* renamed from: c */
    private static final C5269x.b f37659c;

    /* renamed from: d */
    private static final AbstractC5209f0.g f37660d;

    /* renamed from: e */
    private static final C5269x.b f37661e;

    /* renamed from: f */
    private static final AbstractC5209f0.g f37662f;

    /* renamed from: g */
    private static C5269x.h f37663g = C5269x.h.internalBuildGeneratedFileFrom(new String[]{"\n\u0018maum/brain/idr/idr.proto\u0012\u000emaum.brain.idr\u001a\u0016maum/common/lang.proto\u001a\u001cgoogle/protobuf/struct.proto\"É\u0001\n\u0015ImageRecognitionParam\u00121\n\fimage_format\u0018\u0001 \u0001(\u000e2\u001b.maum.brain.idr.ImageFormat\u0012\u001f\n\u0004lang\u0018\u0002 \u0001(\u000e2\u0011.maum.common.Lang\u0012\r\n\u0005width\u0018\u0003 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0004 \u0001(\u0005\u0012\u0014\n\fref_vertex_x\u0018\u0005 \u0001(\u0002\u0012\u0014\n\fref_vertex_y\u0018\u0006 \u0001(\u0002\u0012\u0011\n\tsymm_crop\u0018\u0007 \u0001(\b\"n\n\u0015RecognizeImageRequest\u00126\n\u0005param\u0018\u0001 \u0001(\u000b2%.maum.brain.idr.ImageRecognitionParamH\u0000\u0012\u0015\n\u000bimg_content\u0018\u0002 \u0001(\fH\u0000B\u0006\n\u0004data\"m\n\u0016ImageRecognitionResult\u0012\u0013\n\u000bimage_class\u0018\u0001 \u0001(\t\u0012\u0017\n\u000fannotated_texts\u0018\u0002 \u0003(\t\u0012%\n\u0004meta\u0018\u0003 \u0001(\u000b2\u0017.google.protobuf.Struct*<\n\u000bImageFormat\u0012\b\n\u0004JPEG\u0010\u0000\u0012\u0007\n\u0003PNG\u0010\u0001\u0012\u0007\n\u0003BMP\u0010\u0002\u0012\b\n\u0004TIFF\u0010\u0003\u0012\u0007\n\u0003PDF\u0010\u00042|\n\u0017ImageRecognitionService\u0012a\n\u000eRecognizeImage\u0012%.maum.brain.idr.RecognizeImageRequest\u001a&.maum.brain.idr.ImageRecognitionResult(\u0001B\u0003ø\u0001\u0001b\u0006proto3"}, new C5269x.h[]{B7.b.getDescriptor(), AbstractC5245r1.getDescriptor()});

    /* renamed from: y7.a$b */
    public enum b implements InterfaceC5204d1 {
        JPEG(0),
        PNG(1),
        BMP(2),
        TIFF(3),
        PDF(4),
        UNRECOGNIZED(-1);

        public static final int BMP_VALUE = 2;
        public static final int JPEG_VALUE = 0;
        public static final int PDF_VALUE = 4;
        public static final int PNG_VALUE = 1;
        public static final int TIFF_VALUE = 3;

        /* renamed from: b */
        private static final AbstractC5227l0.d f37664b = new C0435a();

        /* renamed from: c */
        private static final b[] f37665c = values();

        /* renamed from: a */
        private final int f37667a;

        /* renamed from: y7.a$b$a */
        class C0435a implements AbstractC5227l0.d {
            C0435a() {
            }

            @Override // com.google.protobuf.AbstractC5227l0.d
            public b findValueByNumber(int i8) {
                return b.forNumber(i8);
            }
        }

        b(int i8) {
            this.f37667a = i8;
        }

        public static b forNumber(int i8) {
            if (i8 == 0) {
                return JPEG;
            }
            if (i8 == 1) {
                return PNG;
            }
            if (i8 == 2) {
                return BMP;
            }
            if (i8 == 3) {
                return TIFF;
            }
            if (i8 != 4) {
                return null;
            }
            return PDF;
        }

        public static final C5269x.e getDescriptor() {
            return AbstractC6551a.getDescriptor().getEnumTypes().get(0);
        }

        public static AbstractC5227l0.d internalGetValueMap() {
            return f37664b;
        }

        @Override // com.google.protobuf.InterfaceC5204d1
        public final C5269x.e getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC5204d1, com.google.protobuf.AbstractC5227l0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f37667a;
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
        public static b valueOf(int i8) {
            return forNumber(i8);
        }

        public static b valueOf(C5269x.f fVar) {
            if (fVar.getType() == getDescriptor()) {
                if (fVar.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return f37665c[fVar.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    /* renamed from: y7.a$c */
    public static final class c extends AbstractC5209f0 implements d {
        public static final int HEIGHT_FIELD_NUMBER = 4;
        public static final int IMAGE_FORMAT_FIELD_NUMBER = 1;
        public static final int LANG_FIELD_NUMBER = 2;
        public static final int REF_VERTEX_X_FIELD_NUMBER = 5;
        public static final int REF_VERTEX_Y_FIELD_NUMBER = 6;
        public static final int SYMM_CROP_FIELD_NUMBER = 7;
        public static final int WIDTH_FIELD_NUMBER = 3;

        /* renamed from: i */
        private static final c f37668i = new c();

        /* renamed from: j */
        private static final Z0 f37669j = new C0436a();

        /* renamed from: a */
        private int f37670a;

        /* renamed from: b */
        private int f37671b;

        /* renamed from: c */
        private int f37672c;

        /* renamed from: d */
        private int f37673d;

        /* renamed from: e */
        private float f37674e;

        /* renamed from: f */
        private float f37675f;

        /* renamed from: g */
        private boolean f37676g;

        /* renamed from: h */
        private byte f37677h;

        /* renamed from: y7.a$c$a */
        class C0436a extends AbstractC5199c {
            C0436a() {
            }

            @Override // com.google.protobuf.AbstractC5199c, com.google.protobuf.Z0
            public c parsePartialFrom(r rVar, M m8) throws C5230m0 {
                b bVarNewBuilder = c.newBuilder();
                try {
                    bVarNewBuilder.mergeFrom(rVar, m8);
                    return bVarNewBuilder.buildPartial();
                } catch (E1 e8) {
                    throw e8.asInvalidProtocolBufferException().setUnfinishedMessage(bVarNewBuilder.buildPartial());
                } catch (C5230m0 e9) {
                    throw e9.setUnfinishedMessage(bVarNewBuilder.buildPartial());
                } catch (IOException e10) {
                    throw new C5230m0(e10).setUnfinishedMessage(bVarNewBuilder.buildPartial());
                }
            }
        }

        /* renamed from: y7.a$c$b */
        public static final class b extends AbstractC5209f0.b implements d {

            /* renamed from: a */
            private int f37678a;

            /* renamed from: b */
            private int f37679b;

            /* renamed from: c */
            private int f37680c;

            /* renamed from: d */
            private int f37681d;

            /* renamed from: e */
            private int f37682e;

            /* renamed from: f */
            private float f37683f;

            /* renamed from: g */
            private float f37684g;

            /* renamed from: h */
            private boolean f37685h;

            /* synthetic */ b(AbstractC5209f0.c cVar, C0434a c0434a) {
                this(cVar);
            }

            private void e(c cVar) {
                int i8 = this.f37678a;
                if ((i8 & 1) != 0) {
                    cVar.f37670a = this.f37679b;
                }
                if ((i8 & 2) != 0) {
                    cVar.f37671b = this.f37680c;
                }
                if ((i8 & 4) != 0) {
                    cVar.f37672c = this.f37681d;
                }
                if ((i8 & 8) != 0) {
                    cVar.f37673d = this.f37682e;
                }
                if ((i8 & 16) != 0) {
                    cVar.f37674e = this.f37683f;
                }
                if ((i8 & 32) != 0) {
                    cVar.f37675f = this.f37684g;
                }
                if ((i8 & 64) != 0) {
                    cVar.f37676g = this.f37685h;
                }
            }

            public static final C5269x.b getDescriptor() {
                return AbstractC6551a.f37657a;
            }

            public b clearHeight() {
                this.f37678a &= -9;
                this.f37682e = 0;
                onChanged();
                return this;
            }

            public b clearImageFormat() {
                this.f37678a &= -2;
                this.f37679b = 0;
                onChanged();
                return this;
            }

            public b clearLang() {
                this.f37678a &= -3;
                this.f37680c = 0;
                onChanged();
                return this;
            }

            public b clearRefVertexX() {
                this.f37678a &= -17;
                this.f37683f = 0.0f;
                onChanged();
                return this;
            }

            public b clearRefVertexY() {
                this.f37678a &= -33;
                this.f37684g = 0.0f;
                onChanged();
                return this;
            }

            public b clearSymmCrop() {
                this.f37678a &= -65;
                this.f37685h = false;
                onChanged();
                return this;
            }

            public b clearWidth() {
                this.f37678a &= -5;
                this.f37681d = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a, com.google.protobuf.N0, A7.a.c
            public C5269x.b getDescriptorForType() {
                return AbstractC6551a.f37657a;
            }

            @Override // y7.AbstractC6551a.d
            public int getHeight() {
                return this.f37682e;
            }

            @Override // y7.AbstractC6551a.d
            public b getImageFormat() {
                b bVarForNumber = b.forNumber(this.f37679b);
                return bVarForNumber == null ? b.UNRECOGNIZED : bVarForNumber;
            }

            @Override // y7.AbstractC6551a.d
            public int getImageFormatValue() {
                return this.f37679b;
            }

            @Override // y7.AbstractC6551a.d
            public b.a getLang() {
                b.a aVarForNumber = b.a.forNumber(this.f37680c);
                return aVarForNumber == null ? b.a.UNRECOGNIZED : aVarForNumber;
            }

            @Override // y7.AbstractC6551a.d
            public int getLangValue() {
                return this.f37680c;
            }

            @Override // y7.AbstractC6551a.d
            public float getRefVertexX() {
                return this.f37683f;
            }

            @Override // y7.AbstractC6551a.d
            public float getRefVertexY() {
                return this.f37684g;
            }

            @Override // y7.AbstractC6551a.d
            public boolean getSymmCrop() {
                return this.f37685h;
            }

            @Override // y7.AbstractC6551a.d
            public int getWidth() {
                return this.f37681d;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b
            protected AbstractC5209f0.g internalGetFieldAccessorTable() {
                return AbstractC6551a.f37658b.ensureFieldAccessorsInitialized(c.class, b.class);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public final boolean isInitialized() {
                return true;
            }

            public b setHeight(int i8) {
                this.f37682e = i8;
                this.f37678a |= 8;
                onChanged();
                return this;
            }

            public b setImageFormat(b bVar) {
                bVar.getClass();
                this.f37678a |= 1;
                this.f37679b = bVar.getNumber();
                onChanged();
                return this;
            }

            public b setImageFormatValue(int i8) {
                this.f37679b = i8;
                this.f37678a |= 1;
                onChanged();
                return this;
            }

            public b setLang(b.a aVar) {
                aVar.getClass();
                this.f37678a |= 2;
                this.f37680c = aVar.getNumber();
                onChanged();
                return this;
            }

            public b setLangValue(int i8) {
                this.f37680c = i8;
                this.f37678a |= 2;
                onChanged();
                return this;
            }

            public b setRefVertexX(float f8) {
                this.f37683f = f8;
                this.f37678a |= 16;
                onChanged();
                return this;
            }

            public b setRefVertexY(float f8) {
                this.f37684g = f8;
                this.f37678a |= 32;
                onChanged();
                return this;
            }

            public b setSymmCrop(boolean z8) {
                this.f37685h = z8;
                this.f37678a |= 64;
                onChanged();
                return this;
            }

            public b setWidth(int i8) {
                this.f37681d = i8;
                this.f37678a |= 4;
                onChanged();
                return this;
            }

            /* synthetic */ b(C0434a c0434a) {
                this();
            }

            private b() {
                this.f37679b = 0;
                this.f37680c = 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public b addRepeatedField(C5269x.g gVar, Object obj) {
                return (b) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public c build() {
                c cVarBuildPartial = buildPartial();
                if (cVarBuildPartial.isInitialized()) {
                    return cVarBuildPartial;
                }
                throw AbstractC5193a.AbstractC0218a.newUninitializedMessageException((H0) cVarBuildPartial);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public c buildPartial() {
                c cVar = new c(this);
                if (this.f37678a != 0) {
                    e(cVar);
                }
                onBuilt();
                return cVar;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public b clearField(C5269x.g gVar) {
                return (b) super.clearField(gVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
            public c getDefaultInstanceForType() {
                return c.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public b setField(C5269x.g gVar, Object obj) {
                return (b) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public b setRepeatedField(C5269x.g gVar, int i8, Object obj) {
                return (b) super.setRepeatedField(gVar, i8, obj);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final b setUnknownFields(G1 g12) {
                return (b) super.setUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public b clearOneof(C5269x.l lVar) {
                return (b) super.clearOneof(lVar);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public final b mergeUnknownFields(G1 g12) {
                return (b) super.mergeUnknownFields(g12);
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public b clear() {
                super.clear();
                this.f37678a = 0;
                this.f37679b = 0;
                this.f37680c = 0;
                this.f37681d = 0;
                this.f37682e = 0;
                this.f37683f = 0.0f;
                this.f37684g = 0.0f;
                this.f37685h = false;
                return this;
            }

            private b(AbstractC5209f0.c cVar) {
                super(cVar);
                this.f37679b = 0;
                this.f37680c = 0;
            }

            @Override // com.google.protobuf.AbstractC5209f0.b, com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a
            /* renamed from: clone */
            public b mo3clone() {
                return (b) super.mo3clone();
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.H0.a
            public b mergeFrom(H0 h02) {
                if (h02 instanceof c) {
                    return mergeFrom((c) h02);
                }
                super.mergeFrom(h02);
                return this;
            }

            public b mergeFrom(c cVar) {
                if (cVar == c.getDefaultInstance()) {
                    return this;
                }
                if (cVar.f37670a != 0) {
                    setImageFormatValue(cVar.getImageFormatValue());
                }
                if (cVar.f37671b != 0) {
                    setLangValue(cVar.getLangValue());
                }
                if (cVar.getWidth() != 0) {
                    setWidth(cVar.getWidth());
                }
                if (cVar.getHeight() != 0) {
                    setHeight(cVar.getHeight());
                }
                if (cVar.getRefVertexX() != 0.0f) {
                    setRefVertexX(cVar.getRefVertexX());
                }
                if (cVar.getRefVertexY() != 0.0f) {
                    setRefVertexY(cVar.getRefVertexY());
                }
                if (cVar.getSymmCrop()) {
                    setSymmCrop(cVar.getSymmCrop());
                }
                mergeUnknownFields(cVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractC5193a.AbstractC0218a, com.google.protobuf.AbstractC5196b.a, com.google.protobuf.K0.a, com.google.protobuf.H0.a
            public b mergeFrom(r rVar, M m8) {
                m8.getClass();
                boolean z8 = false;
                while (!z8) {
                    try {
                        try {
                            int tag = rVar.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f37679b = rVar.readEnum();
                                    this.f37678a |= 1;
                                } else if (tag == 16) {
                                    this.f37680c = rVar.readEnum();
                                    this.f37678a |= 2;
                                } else if (tag == 24) {
                                    this.f37681d = rVar.readInt32();
                                    this.f37678a |= 4;
                                } else if (tag == 32) {
                                    this.f37682e = rVar.readInt32();
                                    this.f37678a |= 8;
                                } else if (tag == 45) {
                                    this.f37683f = rVar.readFloat();
                                    this.f37678a |= 16;
                                } else if (tag == 53) {
                                    this.f37684g = rVar.readFloat();
                                    this.f37678a |= 32;
                                } else if (tag != 56) {
                                    if (!super.parseUnknownField(rVar, m8, tag)) {
                                    }
                                } else {
                                    this.f37685h = rVar.readBool();
                                    this.f37678a |= 64;
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

        /* synthetic */ c(AbstractC5209f0.b bVar, C0434a c0434a) {
            this(bVar);
        }

        public static c getDefaultInstance() {
            return f37668i;
        }

        public static final C5269x.b getDescriptor() {
            return AbstractC6551a.f37657a;
        }

        public static b newBuilder() {
            return f37668i.toBuilder();
        }

        public static c parseDelimitedFrom(InputStream inputStream) {
            return (c) AbstractC5209f0.parseDelimitedWithIOException(f37669j, inputStream);
        }

        public static c parseFrom(ByteBuffer byteBuffer) {
            return (c) f37669j.parseFrom(byteBuffer);
        }

        public static Z0 parser() {
            return f37669j;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return super.equals(obj);
            }
            c cVar = (c) obj;
            return this.f37670a == cVar.f37670a && this.f37671b == cVar.f37671b && getWidth() == cVar.getWidth() && getHeight() == cVar.getHeight() && Float.floatToIntBits(getRefVertexX()) == Float.floatToIntBits(cVar.getRefVertexX()) && Float.floatToIntBits(getRefVertexY()) == Float.floatToIntBits(cVar.getRefVertexY()) && getSymmCrop() == cVar.getSymmCrop() && getUnknownFields().equals(cVar.getUnknownFields());
        }

        @Override // y7.AbstractC6551a.d
        public int getHeight() {
            return this.f37673d;
        }

        @Override // y7.AbstractC6551a.d
        public b getImageFormat() {
            b bVarForNumber = b.forNumber(this.f37670a);
            return bVarForNumber == null ? b.UNRECOGNIZED : bVarForNumber;
        }

        @Override // y7.AbstractC6551a.d
        public int getImageFormatValue() {
            return this.f37670a;
        }

        @Override // y7.AbstractC6551a.d
        public b.a getLang() {
            b.a aVarForNumber = b.a.forNumber(this.f37671b);
            return aVarForNumber == null ? b.a.UNRECOGNIZED : aVarForNumber;
        }

        @Override // y7.AbstractC6551a.d
        public int getLangValue() {
            return this.f37671b;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public Z0 getParserForType() {
            return f37669j;
        }

        @Override // y7.AbstractC6551a.d
        public float getRefVertexX() {
            return this.f37674e;
        }

        @Override // y7.AbstractC6551a.d
        public float getRefVertexY() {
            return this.f37675f;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public int getSerializedSize() {
            int i8 = this.memoizedSize;
            if (i8 != -1) {
                return i8;
            }
            int iComputeEnumSize = this.f37670a != b.JPEG.getNumber() ? AbstractC5248t.computeEnumSize(1, this.f37670a) : 0;
            if (this.f37671b != b.a.ko_KR.getNumber()) {
                iComputeEnumSize += AbstractC5248t.computeEnumSize(2, this.f37671b);
            }
            int i9 = this.f37672c;
            if (i9 != 0) {
                iComputeEnumSize += AbstractC5248t.computeInt32Size(3, i9);
            }
            int i10 = this.f37673d;
            if (i10 != 0) {
                iComputeEnumSize += AbstractC5248t.computeInt32Size(4, i10);
            }
            if (Float.floatToRawIntBits(this.f37674e) != 0) {
                iComputeEnumSize += AbstractC5248t.computeFloatSize(5, this.f37674e);
            }
            if (Float.floatToRawIntBits(this.f37675f) != 0) {
                iComputeEnumSize += AbstractC5248t.computeFloatSize(6, this.f37675f);
            }
            boolean z8 = this.f37676g;
            if (z8) {
                iComputeEnumSize += AbstractC5248t.computeBoolSize(7, z8);
            }
            int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // y7.AbstractC6551a.d
        public boolean getSymmCrop() {
            return this.f37676g;
        }

        @Override // y7.AbstractC6551a.d
        public int getWidth() {
            return this.f37672c;
        }

        @Override // com.google.protobuf.AbstractC5193a, com.google.protobuf.H0
        public int hashCode() {
            int i8 = this.memoizedHashCode;
            if (i8 != 0) {
                return i8;
            }
            int iHashCode = ((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.f37670a) * 37) + 2) * 53) + this.f37671b) * 37) + 3) * 53) + getWidth()) * 37) + 4) * 53) + getHeight()) * 37) + 5) * 53) + Float.floatToIntBits(getRefVertexX())) * 37) + 6) * 53) + Float.floatToIntBits(getRefVertexY())) * 37) + 7) * 53) + AbstractC5227l0.hashBoolean(getSymmCrop())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected AbstractC5209f0.g internalGetFieldAccessorTable() {
            return AbstractC6551a.f37658b.ensureFieldAccessorsInitialized(c.class, b.class);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public final boolean isInitialized() {
            byte b9 = this.f37677h;
            if (b9 == 1) {
                return true;
            }
            if (b9 == 0) {
                return false;
            }
            this.f37677h = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.AbstractC5209f0
        protected Object newInstance(AbstractC5209f0.h hVar) {
            return new c();
        }

        @Override // com.google.protobuf.AbstractC5209f0
        /* renamed from: v */
        public b newBuilderForType(AbstractC5209f0.c cVar) {
            return new b(cVar);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public void writeTo(AbstractC5248t abstractC5248t) {
            if (this.f37670a != b.JPEG.getNumber()) {
                abstractC5248t.writeEnum(1, this.f37670a);
            }
            if (this.f37671b != b.a.ko_KR.getNumber()) {
                abstractC5248t.writeEnum(2, this.f37671b);
            }
            int i8 = this.f37672c;
            if (i8 != 0) {
                abstractC5248t.writeInt32(3, i8);
            }
            int i9 = this.f37673d;
            if (i9 != 0) {
                abstractC5248t.writeInt32(4, i9);
            }
            if (Float.floatToRawIntBits(this.f37674e) != 0) {
                abstractC5248t.writeFloat(5, this.f37674e);
            }
            if (Float.floatToRawIntBits(this.f37675f) != 0) {
                abstractC5248t.writeFloat(6, this.f37675f);
            }
            boolean z8 = this.f37676g;
            if (z8) {
                abstractC5248t.writeBool(7, z8);
            }
            getUnknownFields().writeTo(abstractC5248t);
        }

        private c(AbstractC5209f0.b bVar) {
            super(bVar);
            this.f37670a = 0;
            this.f37671b = 0;
            this.f37672c = 0;
            this.f37673d = 0;
            this.f37674e = 0.0f;
            this.f37675f = 0.0f;
            this.f37676g = false;
            this.f37677h = (byte) -1;
        }

        public static b newBuilder(c cVar) {
            return f37668i.toBuilder().mergeFrom(cVar);
        }

        public static c parseFrom(ByteBuffer byteBuffer, M m8) {
            return (c) f37669j.parseFrom(byteBuffer, m8);
        }

        public static c parseDelimitedFrom(InputStream inputStream, M m8) {
            return (c) AbstractC5209f0.parseDelimitedWithIOException(f37669j, inputStream, m8);
        }

        public static c parseFrom(AbstractC5235o abstractC5235o) {
            return (c) f37669j.parseFrom(abstractC5235o);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        public c getDefaultInstanceForType() {
            return f37668i;
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public b toBuilder() {
            return this == f37668i ? new b() : new b().mergeFrom(this);
        }

        public static c parseFrom(AbstractC5235o abstractC5235o, M m8) {
            return (c) f37669j.parseFrom(abstractC5235o, m8);
        }

        @Override // com.google.protobuf.AbstractC5209f0, com.google.protobuf.AbstractC5193a, com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
        public b newBuilderForType() {
            return newBuilder();
        }

        public static c parseFrom(byte[] bArr) {
            return (c) f37669j.parseFrom(bArr);
        }

        public static c parseFrom(byte[] bArr, M m8) {
            return (c) f37669j.parseFrom(bArr, m8);
        }

        public static c parseFrom(InputStream inputStream) {
            return (c) AbstractC5209f0.parseWithIOException(f37669j, inputStream);
        }

        public static c parseFrom(InputStream inputStream, M m8) {
            return (c) AbstractC5209f0.parseWithIOException(f37669j, inputStream, m8);
        }

        private c() {
            this.f37672c = 0;
            this.f37673d = 0;
            this.f37674e = 0.0f;
            this.f37675f = 0.0f;
            this.f37676g = false;
            this.f37677h = (byte) -1;
            this.f37670a = 0;
            this.f37671b = 0;
        }

        public static c parseFrom(r rVar) {
            return (c) AbstractC5209f0.parseWithIOException(f37669j, rVar);
        }

        public static c parseFrom(r rVar, M m8) {
            return (c) AbstractC5209f0.parseWithIOException(f37669j, rVar, m8);
        }
    }

    /* renamed from: y7.a$d */
    public interface d extends N0 {
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

        int getHeight();

        b getImageFormat();

        int getImageFormatValue();

        @Override // com.google.protobuf.N0
        /* synthetic */ String getInitializationErrorString();

        b.a getLang();

        int getLangValue();

        @Override // com.google.protobuf.N0
        /* synthetic */ C5269x.g getOneofFieldDescriptor(C5269x.l lVar);

        float getRefVertexX();

        float getRefVertexY();

        @Override // com.google.protobuf.N0
        /* synthetic */ Object getRepeatedField(C5269x.g gVar, int i8);

        @Override // com.google.protobuf.N0
        /* synthetic */ int getRepeatedFieldCount(C5269x.g gVar);

        boolean getSymmCrop();

        @Override // com.google.protobuf.N0
        /* synthetic */ G1 getUnknownFields();

        int getWidth();

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasField(C5269x.g gVar);

        @Override // com.google.protobuf.N0
        /* synthetic */ boolean hasOneof(C5269x.l lVar);

        @Override // com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    static {
        C5269x.b bVar = getDescriptor().getMessageTypes().get(0);
        f37657a = bVar;
        f37658b = new AbstractC5209f0.g(bVar, new String[]{"ImageFormat", "Lang", "Width", "Height", "RefVertexX", "RefVertexY", "SymmCrop"});
        C5269x.b bVar2 = getDescriptor().getMessageTypes().get(1);
        f37659c = bVar2;
        f37660d = new AbstractC5209f0.g(bVar2, new String[]{"Param", "ImgContent", "Data"});
        C5269x.b bVar3 = getDescriptor().getMessageTypes().get(2);
        f37661e = bVar3;
        f37662f = new AbstractC5209f0.g(bVar3, new String[]{"ImageClass", "AnnotatedTexts", "Meta"});
        B7.b.getDescriptor();
        AbstractC5245r1.getDescriptor();
    }

    public static C5269x.h getDescriptor() {
        return f37663g;
    }

    public static void registerAllExtensions(M m8) {
    }

    public static void registerAllExtensions(K k8) {
        registerAllExtensions((M) k8);
    }
}
