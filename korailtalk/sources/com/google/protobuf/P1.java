package com.google.protobuf;

/* loaded from: classes2.dex */
public abstract class P1 {
    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_START_GROUP = 3;
    public static final int WIRETYPE_VARINT = 0;

    /* renamed from: a, reason: collision with root package name */
    static final int f26264a = a(1, 3);

    /* renamed from: b, reason: collision with root package name */
    static final int f26265b = a(1, 4);

    /* renamed from: c, reason: collision with root package name */
    static final int f26266c = a(2, 0);

    /* renamed from: d, reason: collision with root package name */
    static final int f26267d = a(3, 2);

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26268a;

        static {
            int[] iArr = new int[b.values().length];
            f26268a = iArr;
            try {
                iArr[b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26268a[b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26268a[b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26268a[b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26268a[b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26268a[b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26268a[b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26268a[b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26268a[b.BYTES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26268a[b.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26268a[b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f26268a[b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f26268a[b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f26268a[b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f26268a[b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f26268a[b.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f26268a[b.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f26268a[b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class b {
        public static final b BOOL;
        public static final b BYTES;
        public static final b DOUBLE;
        public static final b ENUM;
        public static final b FIXED32;
        public static final b FIXED64;
        public static final b FLOAT;
        public static final b GROUP;
        public static final b INT32;
        public static final b INT64;
        public static final b MESSAGE;
        public static final b SFIXED32;
        public static final b SFIXED64;
        public static final b SINT32;
        public static final b SINT64;
        public static final b STRING;
        public static final b UINT32;
        public static final b UINT64;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f26269c;

        /* renamed from: a, reason: collision with root package name */
        private final c f26270a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26271b;

        enum a extends b {
            a(String str, int i8, c cVar, int i9) {
                super(str, i8, cVar, i9, null);
            }

            @Override // com.google.protobuf.P1.b
            public boolean isPackable() {
                return false;
            }
        }

        /* renamed from: com.google.protobuf.P1$b$b, reason: collision with other inner class name */
        enum C0217b extends b {
            C0217b(String str, int i8, c cVar, int i9) {
                super(str, i8, cVar, i9, null);
            }

            @Override // com.google.protobuf.P1.b
            public boolean isPackable() {
                return false;
            }
        }

        enum c extends b {
            c(String str, int i8, c cVar, int i9) {
                super(str, i8, cVar, i9, null);
            }

            @Override // com.google.protobuf.P1.b
            public boolean isPackable() {
                return false;
            }
        }

        enum d extends b {
            d(String str, int i8, c cVar, int i9) {
                super(str, i8, cVar, i9, null);
            }

            @Override // com.google.protobuf.P1.b
            public boolean isPackable() {
                return false;
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            DOUBLE = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            FLOAT = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            INT64 = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            UINT64 = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            INT32 = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            FIXED64 = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            FIXED32 = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            BOOL = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            STRING = aVar;
            c cVar3 = c.MESSAGE;
            C0217b c0217b = new C0217b("GROUP", 9, cVar3, 3);
            GROUP = c0217b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            MESSAGE = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            BYTES = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            UINT32 = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            ENUM = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            SFIXED32 = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            SFIXED64 = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            SINT32 = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            SINT64 = bVar14;
            f26269c = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0217b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        /* synthetic */ b(String str, int i8, c cVar, int i9, a aVar) {
            this(str, i8, cVar, i9);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f26269c.clone();
        }

        public c getJavaType() {
            return this.f26270a;
        }

        public int getWireType() {
            return this.f26271b;
        }

        public boolean isPackable() {
            return true;
        }

        private b(String str, int i8, c cVar, int i9) {
            this.f26270a = cVar;
            this.f26271b = i9;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC5235o.EMPTY),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: a, reason: collision with root package name */
        private final Object f26273a;

        c(Object obj) {
            this.f26273a = obj;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class d {
        public static final d LAZY;
        public static final d LOOSE;
        public static final d STRICT;

        /* renamed from: a, reason: collision with root package name */
        private static final /* synthetic */ d[] f26274a;

        enum a extends d {
            a(String str, int i8) {
                super(str, i8, null);
            }

            @Override // com.google.protobuf.P1.d
            Object a(r rVar) {
                return rVar.readString();
            }
        }

        enum b extends d {
            b(String str, int i8) {
                super(str, i8, null);
            }

            @Override // com.google.protobuf.P1.d
            Object a(r rVar) {
                return rVar.readStringRequireUtf8();
            }
        }

        enum c extends d {
            c(String str, int i8) {
                super(str, i8, null);
            }

            @Override // com.google.protobuf.P1.d
            Object a(r rVar) {
                return rVar.readBytes();
            }
        }

        static {
            a aVar = new a("LOOSE", 0);
            LOOSE = aVar;
            b bVar = new b("STRICT", 1);
            STRICT = bVar;
            c cVar = new c("LAZY", 2);
            LAZY = cVar;
            f26274a = new d[]{aVar, bVar, cVar};
        }

        private d(String str, int i8) {
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f26274a.clone();
        }

        abstract Object a(r rVar);

        /* synthetic */ d(String str, int i8, a aVar) {
            this(str, i8);
        }
    }

    static int a(int i8, int i9) {
        return (i8 << 3) | i9;
    }

    static Object b(r rVar, b bVar, d dVar) {
        switch (a.f26268a[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(rVar.readDouble());
            case 2:
                return Float.valueOf(rVar.readFloat());
            case 3:
                return Long.valueOf(rVar.readInt64());
            case 4:
                return Long.valueOf(rVar.readUInt64());
            case 5:
                return Integer.valueOf(rVar.readInt32());
            case 6:
                return Long.valueOf(rVar.readFixed64());
            case 7:
                return Integer.valueOf(rVar.readFixed32());
            case 8:
                return Boolean.valueOf(rVar.readBool());
            case 9:
                return rVar.readBytes();
            case 10:
                return Integer.valueOf(rVar.readUInt32());
            case 11:
                return Integer.valueOf(rVar.readSFixed32());
            case 12:
                return Long.valueOf(rVar.readSFixed64());
            case 13:
                return Integer.valueOf(rVar.readSInt32());
            case 14:
                return Long.valueOf(rVar.readSInt64());
            case 15:
                return dVar.a(rVar);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int getTagFieldNumber(int i8) {
        return i8 >>> 3;
    }

    public static int getTagWireType(int i8) {
        return i8 & 7;
    }
}
