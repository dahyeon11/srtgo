package B7;

import com.google.protobuf.AbstractC5227l0;
import com.google.protobuf.C5269x;
import com.google.protobuf.InterfaceC5204d1;
import com.google.protobuf.K;
import com.google.protobuf.M;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static C5269x.h f374a = C5269x.h.internalBuildGeneratedFileFrom(new String[]{"\n\u0016maum/common/lang.proto\u0012\u000bmaum.common*\u001c\n\u0004Lang\u0012\t\n\u0005ko_KR\u0010\u0000\u0012\t\n\u0005en_US\u0010\u0001*\u001c\n\bLangCode\u0012\u0007\n\u0003kor\u0010\u0000\u0012\u0007\n\u0003eng\u0010\u0001B\u0003ø\u0001\u0001b\u0006proto3"}, new C5269x.h[0]);

    public enum a implements InterfaceC5204d1 {
        ko_KR(0),
        en_US(1),
        UNRECOGNIZED(-1);


        /* renamed from: b, reason: collision with root package name */
        private static final AbstractC5227l0.d f375b = new C0011a();

        /* renamed from: c, reason: collision with root package name */
        private static final a[] f376c = values();
        public static final int en_US_VALUE = 1;
        public static final int ko_KR_VALUE = 0;

        /* renamed from: a, reason: collision with root package name */
        private final int f378a;

        /* renamed from: B7.b$a$a, reason: collision with other inner class name */
        class C0011a implements AbstractC5227l0.d {
            C0011a() {
            }

            @Override // com.google.protobuf.AbstractC5227l0.d
            public a findValueByNumber(int i8) {
                return a.forNumber(i8);
            }
        }

        a(int i8) {
            this.f378a = i8;
        }

        public static a forNumber(int i8) {
            if (i8 == 0) {
                return ko_KR;
            }
            if (i8 != 1) {
                return null;
            }
            return en_US;
        }

        public static final C5269x.e getDescriptor() {
            return b.getDescriptor().getEnumTypes().get(0);
        }

        public static AbstractC5227l0.d internalGetValueMap() {
            return f375b;
        }

        @Override // com.google.protobuf.InterfaceC5204d1
        public final C5269x.e getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.InterfaceC5204d1, com.google.protobuf.AbstractC5227l0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f378a;
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
        public static a valueOf(int i8) {
            return forNumber(i8);
        }

        public static a valueOf(C5269x.f fVar) {
            if (fVar.getType() == getDescriptor()) {
                if (fVar.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return f376c[fVar.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static C5269x.h getDescriptor() {
        return f374a;
    }

    public static void registerAllExtensions(M m8) {
    }

    public static void registerAllExtensions(K k8) {
        registerAllExtensions((M) k8);
    }
}
