package B7;

import com.google.protobuf.AbstractC5227l0;
import com.google.protobuf.C5269x;
import com.google.protobuf.InterfaceC5204d1;
import com.google.protobuf.K;
import com.google.protobuf.M;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static C5269x.h f369a = C5269x.h.internalBuildGeneratedFileFrom(new String[]{"\n\u001fmaum/common/audioencoding.proto\u0012\u000bmaum.common*\u008b\u0001\n\rAudioEncoding\u0012\u0018\n\u0014ENCODING_UNSPECIFIED\u0010\u0000\u0012\f\n\bLINEAR16\u0010\u0001\u0012\b\n\u0004FLAC\u0010\u0002\u0012\t\n\u0005MULAW\u0010\u0003\u0012\u0007\n\u0003AMR\u0010\u0004\u0012\n\n\u0006AMR_WB\u0010\u0005\u0012\f\n\bOGG_OPUS\u0010\u0006\u0012\u001a\n\u0016SPEEX_WITH_HEADER_BYTE\u0010\u0007B\u0003ø\u0001\u0001b\u0006proto3"}, new C5269x.h[0]);

    /* renamed from: B7.a$a, reason: collision with other inner class name */
    public enum EnumC0009a implements InterfaceC5204d1 {
        ENCODING_UNSPECIFIED(0),
        LINEAR16(1),
        FLAC(2),
        MULAW(3),
        AMR(4),
        AMR_WB(5),
        OGG_OPUS(6),
        SPEEX_WITH_HEADER_BYTE(7),
        UNRECOGNIZED(-1);

        public static final int AMR_VALUE = 4;
        public static final int AMR_WB_VALUE = 5;
        public static final int ENCODING_UNSPECIFIED_VALUE = 0;
        public static final int FLAC_VALUE = 2;
        public static final int LINEAR16_VALUE = 1;
        public static final int MULAW_VALUE = 3;
        public static final int OGG_OPUS_VALUE = 6;
        public static final int SPEEX_WITH_HEADER_BYTE_VALUE = 7;

        /* renamed from: b, reason: collision with root package name */
        private static final AbstractC5227l0.d f370b = new C0010a();

        /* renamed from: c, reason: collision with root package name */
        private static final EnumC0009a[] f371c = values();

        /* renamed from: a, reason: collision with root package name */
        private final int f373a;

        /* renamed from: B7.a$a$a, reason: collision with other inner class name */
        class C0010a implements AbstractC5227l0.d {
            C0010a() {
            }

            @Override // com.google.protobuf.AbstractC5227l0.d
            public EnumC0009a findValueByNumber(int i8) {
                return EnumC0009a.forNumber(i8);
            }
        }

        EnumC0009a(int i8) {
            this.f373a = i8;
        }

        public static EnumC0009a forNumber(int i8) {
            switch (i8) {
                case 0:
                    return ENCODING_UNSPECIFIED;
                case 1:
                    return LINEAR16;
                case 2:
                    return FLAC;
                case 3:
                    return MULAW;
                case 4:
                    return AMR;
                case 5:
                    return AMR_WB;
                case 6:
                    return OGG_OPUS;
                case 7:
                    return SPEEX_WITH_HEADER_BYTE;
                default:
                    return null;
            }
        }

        public static final C5269x.e getDescriptor() {
            return a.getDescriptor().getEnumTypes().get(0);
        }

        public static AbstractC5227l0.d internalGetValueMap() {
            return f370b;
        }

        @Override // com.google.protobuf.InterfaceC5204d1
        public final C5269x.e getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC5204d1, com.google.protobuf.AbstractC5227l0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f373a;
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
        public static EnumC0009a valueOf(int i8) {
            return forNumber(i8);
        }

        public static EnumC0009a valueOf(C5269x.f fVar) {
            if (fVar.getType() == getDescriptor()) {
                if (fVar.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return f371c[fVar.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static C5269x.h getDescriptor() {
        return f369a;
    }

    public static void registerAllExtensions(M m8) {
    }

    public static void registerAllExtensions(K k8) {
        registerAllExtensions((M) k8);
    }
}
