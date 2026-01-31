package com.google.protobuf;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class X {
    public static final X BOOL;
    public static final X BOOL_LIST;
    public static final X BOOL_LIST_PACKED;
    public static final X BYTES;
    public static final X BYTES_LIST;
    public static final X DOUBLE;
    public static final X DOUBLE_LIST;
    public static final X DOUBLE_LIST_PACKED;
    public static final X ENUM;
    public static final X ENUM_LIST;
    public static final X ENUM_LIST_PACKED;
    public static final X FIXED32;
    public static final X FIXED32_LIST;
    public static final X FIXED32_LIST_PACKED;
    public static final X FIXED64;
    public static final X FIXED64_LIST;
    public static final X FIXED64_LIST_PACKED;
    public static final X FLOAT;
    public static final X FLOAT_LIST;
    public static final X FLOAT_LIST_PACKED;
    public static final X GROUP;
    public static final X GROUP_LIST;
    public static final X INT32;
    public static final X INT32_LIST;
    public static final X INT32_LIST_PACKED;
    public static final X INT64;
    public static final X INT64_LIST;
    public static final X INT64_LIST_PACKED;
    public static final X MAP;
    public static final X MESSAGE;
    public static final X MESSAGE_LIST;
    public static final X SFIXED32;
    public static final X SFIXED32_LIST;
    public static final X SFIXED32_LIST_PACKED;
    public static final X SFIXED64;
    public static final X SFIXED64_LIST;
    public static final X SFIXED64_LIST_PACKED;
    public static final X SINT32;
    public static final X SINT32_LIST;
    public static final X SINT32_LIST_PACKED;
    public static final X SINT64;
    public static final X SINT64_LIST;
    public static final X SINT64_LIST_PACKED;
    public static final X STRING;
    public static final X STRING_LIST;
    public static final X UINT32;
    public static final X UINT32_LIST;
    public static final X UINT32_LIST_PACKED;
    public static final X UINT64;
    public static final X UINT64_LIST;
    public static final X UINT64_LIST_PACKED;

    /* renamed from: f, reason: collision with root package name */
    private static final X[] f26351f;

    /* renamed from: g, reason: collision with root package name */
    private static final Type[] f26352g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ X[] f26353h;

    /* renamed from: a, reason: collision with root package name */
    private final EnumC5239p0 f26354a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26355b;

    /* renamed from: c, reason: collision with root package name */
    private final b f26356c;

    /* renamed from: d, reason: collision with root package name */
    private final Class f26357d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f26358e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26359a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f26360b;

        static {
            int[] iArr = new int[EnumC5239p0.values().length];
            f26360b = iArr;
            try {
                iArr[EnumC5239p0.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26360b[EnumC5239p0.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26360b[EnumC5239p0.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f26359a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26359a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26359a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);


        /* renamed from: a, reason: collision with root package name */
        private final boolean f26362a;

        b(boolean z8) {
            this.f26362a = z8;
        }

        public boolean isList() {
            return this.f26362a;
        }
    }

    static {
        b bVar = b.SCALAR;
        EnumC5239p0 enumC5239p0 = EnumC5239p0.DOUBLE;
        X x8 = new X("DOUBLE", 0, 0, bVar, enumC5239p0);
        DOUBLE = x8;
        EnumC5239p0 enumC5239p02 = EnumC5239p0.FLOAT;
        X x9 = new X("FLOAT", 1, 1, bVar, enumC5239p02);
        FLOAT = x9;
        EnumC5239p0 enumC5239p03 = EnumC5239p0.LONG;
        X x10 = new X("INT64", 2, 2, bVar, enumC5239p03);
        INT64 = x10;
        X x11 = new X("UINT64", 3, 3, bVar, enumC5239p03);
        UINT64 = x11;
        EnumC5239p0 enumC5239p04 = EnumC5239p0.INT;
        X x12 = new X("INT32", 4, 4, bVar, enumC5239p04);
        INT32 = x12;
        X x13 = new X("FIXED64", 5, 5, bVar, enumC5239p03);
        FIXED64 = x13;
        X x14 = new X("FIXED32", 6, 6, bVar, enumC5239p04);
        FIXED32 = x14;
        EnumC5239p0 enumC5239p05 = EnumC5239p0.BOOLEAN;
        X x15 = new X("BOOL", 7, 7, bVar, enumC5239p05);
        BOOL = x15;
        EnumC5239p0 enumC5239p06 = EnumC5239p0.STRING;
        X x16 = new X("STRING", 8, 8, bVar, enumC5239p06);
        STRING = x16;
        EnumC5239p0 enumC5239p07 = EnumC5239p0.MESSAGE;
        X x17 = new X("MESSAGE", 9, 9, bVar, enumC5239p07);
        MESSAGE = x17;
        EnumC5239p0 enumC5239p08 = EnumC5239p0.BYTE_STRING;
        X x18 = new X("BYTES", 10, 10, bVar, enumC5239p08);
        BYTES = x18;
        X x19 = new X("UINT32", 11, 11, bVar, enumC5239p04);
        UINT32 = x19;
        EnumC5239p0 enumC5239p09 = EnumC5239p0.ENUM;
        X x20 = new X("ENUM", 12, 12, bVar, enumC5239p09);
        ENUM = x20;
        X x21 = new X("SFIXED32", 13, 13, bVar, enumC5239p04);
        SFIXED32 = x21;
        X x22 = new X("SFIXED64", 14, 14, bVar, enumC5239p03);
        SFIXED64 = x22;
        X x23 = new X("SINT32", 15, 15, bVar, enumC5239p04);
        SINT32 = x23;
        X x24 = new X("SINT64", 16, 16, bVar, enumC5239p03);
        SINT64 = x24;
        X x25 = new X("GROUP", 17, 17, bVar, enumC5239p07);
        GROUP = x25;
        b bVar2 = b.VECTOR;
        X x26 = new X("DOUBLE_LIST", 18, 18, bVar2, enumC5239p0);
        DOUBLE_LIST = x26;
        X x27 = new X("FLOAT_LIST", 19, 19, bVar2, enumC5239p02);
        FLOAT_LIST = x27;
        X x28 = new X("INT64_LIST", 20, 20, bVar2, enumC5239p03);
        INT64_LIST = x28;
        X x29 = new X("UINT64_LIST", 21, 21, bVar2, enumC5239p03);
        UINT64_LIST = x29;
        X x30 = new X("INT32_LIST", 22, 22, bVar2, enumC5239p04);
        INT32_LIST = x30;
        X x31 = new X("FIXED64_LIST", 23, 23, bVar2, enumC5239p03);
        FIXED64_LIST = x31;
        X x32 = new X("FIXED32_LIST", 24, 24, bVar2, enumC5239p04);
        FIXED32_LIST = x32;
        X x33 = new X("BOOL_LIST", 25, 25, bVar2, enumC5239p05);
        BOOL_LIST = x33;
        X x34 = new X("STRING_LIST", 26, 26, bVar2, enumC5239p06);
        STRING_LIST = x34;
        X x35 = new X("MESSAGE_LIST", 27, 27, bVar2, enumC5239p07);
        MESSAGE_LIST = x35;
        X x36 = new X("BYTES_LIST", 28, 28, bVar2, enumC5239p08);
        BYTES_LIST = x36;
        X x37 = new X("UINT32_LIST", 29, 29, bVar2, enumC5239p04);
        UINT32_LIST = x37;
        X x38 = new X("ENUM_LIST", 30, 30, bVar2, enumC5239p09);
        ENUM_LIST = x38;
        X x39 = new X("SFIXED32_LIST", 31, 31, bVar2, enumC5239p04);
        SFIXED32_LIST = x39;
        X x40 = new X("SFIXED64_LIST", 32, 32, bVar2, enumC5239p03);
        SFIXED64_LIST = x40;
        X x41 = new X("SINT32_LIST", 33, 33, bVar2, enumC5239p04);
        SINT32_LIST = x41;
        X x42 = new X("SINT64_LIST", 34, 34, bVar2, enumC5239p03);
        SINT64_LIST = x42;
        b bVar3 = b.PACKED_VECTOR;
        X x43 = new X("DOUBLE_LIST_PACKED", 35, 35, bVar3, enumC5239p0);
        DOUBLE_LIST_PACKED = x43;
        X x44 = new X("FLOAT_LIST_PACKED", 36, 36, bVar3, enumC5239p02);
        FLOAT_LIST_PACKED = x44;
        X x45 = new X("INT64_LIST_PACKED", 37, 37, bVar3, enumC5239p03);
        INT64_LIST_PACKED = x45;
        X x46 = new X("UINT64_LIST_PACKED", 38, 38, bVar3, enumC5239p03);
        UINT64_LIST_PACKED = x46;
        X x47 = new X("INT32_LIST_PACKED", 39, 39, bVar3, enumC5239p04);
        INT32_LIST_PACKED = x47;
        X x48 = new X("FIXED64_LIST_PACKED", 40, 40, bVar3, enumC5239p03);
        FIXED64_LIST_PACKED = x48;
        X x49 = new X("FIXED32_LIST_PACKED", 41, 41, bVar3, enumC5239p04);
        FIXED32_LIST_PACKED = x49;
        X x50 = new X("BOOL_LIST_PACKED", 42, 42, bVar3, enumC5239p05);
        BOOL_LIST_PACKED = x50;
        X x51 = new X("UINT32_LIST_PACKED", 43, 43, bVar3, enumC5239p04);
        UINT32_LIST_PACKED = x51;
        X x52 = new X("ENUM_LIST_PACKED", 44, 44, bVar3, enumC5239p09);
        ENUM_LIST_PACKED = x52;
        X x53 = new X("SFIXED32_LIST_PACKED", 45, 45, bVar3, enumC5239p04);
        SFIXED32_LIST_PACKED = x53;
        X x54 = new X("SFIXED64_LIST_PACKED", 46, 46, bVar3, enumC5239p03);
        SFIXED64_LIST_PACKED = x54;
        X x55 = new X("SINT32_LIST_PACKED", 47, 47, bVar3, enumC5239p04);
        SINT32_LIST_PACKED = x55;
        X x56 = new X("SINT64_LIST_PACKED", 48, 48, bVar3, enumC5239p03);
        SINT64_LIST_PACKED = x56;
        X x57 = new X("GROUP_LIST", 49, 49, bVar2, enumC5239p07);
        GROUP_LIST = x57;
        X x58 = new X("MAP", 50, 50, b.MAP, EnumC5239p0.VOID);
        MAP = x58;
        f26353h = new X[]{x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27, x28, x29, x30, x31, x32, x33, x34, x35, x36, x37, x38, x39, x40, x41, x42, x43, x44, x45, x46, x47, x48, x49, x50, x51, x52, x53, x54, x55, x56, x57, x58};
        f26352g = new Type[0];
        X[] xArrValues = values();
        f26351f = new X[xArrValues.length];
        for (X x59 : xArrValues) {
            f26351f[x59.f26355b] = x59;
        }
    }

    private X(String str, int i8, int i9, b bVar, EnumC5239p0 enumC5239p0) {
        int i10;
        this.f26355b = i9;
        this.f26356c = bVar;
        this.f26354a = enumC5239p0;
        int i11 = a.f26359a[bVar.ordinal()];
        if (i11 == 1 || i11 == 2) {
            this.f26357d = enumC5239p0.getBoxedType();
        } else {
            this.f26357d = null;
        }
        this.f26358e = (bVar != b.SCALAR || (i10 = a.f26360b[enumC5239p0.ordinal()]) == 1 || i10 == 2 || i10 == 3) ? false : true;
    }

    private static Type a(Class cls) {
        for (Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static Type b(Class cls, Type[] typeArr) {
        while (true) {
            int i8 = 0;
            if (cls == List.class) {
                if (typeArr.length == 1) {
                    return typeArr[0];
                }
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
            Type typeA = a(cls);
            if (!(typeA instanceof ParameterizedType)) {
                typeArr = f26352g;
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                while (true) {
                    if (i8 >= length) {
                        cls = cls.getSuperclass();
                        break;
                    }
                    Class<?> cls2 = interfaces[i8];
                    if (List.class.isAssignableFrom(cls2)) {
                        cls = cls2;
                        break;
                    }
                    i8++;
                }
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) typeA;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i9 = 0; i9 < actualTypeArguments.length; i9++) {
                    Type type = actualTypeArguments[i9];
                    if (type instanceof TypeVariable) {
                        TypeVariable[] typeParameters = cls.getTypeParameters();
                        if (typeArr.length != typeParameters.length) {
                            throw new RuntimeException("Type array mismatch");
                        }
                        for (int i10 = 0; i10 < typeParameters.length; i10++) {
                            if (type == typeParameters[i10]) {
                                actualTypeArguments[i9] = typeArr[i10];
                            }
                        }
                        throw new RuntimeException("Unable to find replacement for " + type);
                    }
                }
                cls = (Class) parameterizedType.getRawType();
                typeArr = actualTypeArguments;
            }
        }
    }

    private boolean c(Field field) {
        Class<?> type = field.getType();
        if (!this.f26354a.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] actualTypeArguments = f26352g;
        if (field.getGenericType() instanceof ParameterizedType) {
            actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type typeB = b(type, actualTypeArguments);
        if (typeB instanceof Class) {
            return this.f26357d.isAssignableFrom((Class) typeB);
        }
        return true;
    }

    public static X forId(int i8) {
        if (i8 < 0) {
            return null;
        }
        X[] xArr = f26351f;
        if (i8 >= xArr.length) {
            return null;
        }
        return xArr[i8];
    }

    public static X valueOf(String str) {
        return (X) Enum.valueOf(X.class, str);
    }

    public static X[] values() {
        return (X[]) f26353h.clone();
    }

    public EnumC5239p0 getJavaType() {
        return this.f26354a;
    }

    public int id() {
        return this.f26355b;
    }

    public boolean isList() {
        return this.f26356c.isList();
    }

    public boolean isMap() {
        return this.f26356c == b.MAP;
    }

    public boolean isPacked() {
        return b.PACKED_VECTOR.equals(this.f26356c);
    }

    public boolean isPrimitiveScalar() {
        return this.f26358e;
    }

    public boolean isScalar() {
        return this.f26356c == b.SCALAR;
    }

    public boolean isValidForField(Field field) {
        return b.VECTOR.equals(this.f26356c) ? c(field) : this.f26354a.getType().isAssignableFrom(field.getType());
    }
}
