package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.protobuf.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5239p0 {
    public static final EnumC5239p0 BOOLEAN;
    public static final EnumC5239p0 BYTE_STRING;
    public static final EnumC5239p0 DOUBLE;
    public static final EnumC5239p0 ENUM;
    public static final EnumC5239p0 FLOAT;
    public static final EnumC5239p0 INT;
    public static final EnumC5239p0 LONG;
    public static final EnumC5239p0 MESSAGE;
    public static final EnumC5239p0 STRING;
    public static final EnumC5239p0 VOID;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC5239p0[] f26637d;

    /* renamed from: a, reason: collision with root package name */
    private final Class f26638a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f26639b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f26640c;

    static {
        EnumC5239p0 enumC5239p0 = new EnumC5239p0("VOID", 0, Void.class, Void.class, null);
        VOID = enumC5239p0;
        Class cls = Integer.TYPE;
        EnumC5239p0 enumC5239p02 = new EnumC5239p0("INT", 1, cls, Integer.class, 0);
        INT = enumC5239p02;
        EnumC5239p0 enumC5239p03 = new EnumC5239p0("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = enumC5239p03;
        EnumC5239p0 enumC5239p04 = new EnumC5239p0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = enumC5239p04;
        EnumC5239p0 enumC5239p05 = new EnumC5239p0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = enumC5239p05;
        EnumC5239p0 enumC5239p06 = new EnumC5239p0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = enumC5239p06;
        EnumC5239p0 enumC5239p07 = new EnumC5239p0("STRING", 6, String.class, String.class, "");
        STRING = enumC5239p07;
        EnumC5239p0 enumC5239p08 = new EnumC5239p0("BYTE_STRING", 7, AbstractC5235o.class, AbstractC5235o.class, AbstractC5235o.EMPTY);
        BYTE_STRING = enumC5239p08;
        EnumC5239p0 enumC5239p09 = new EnumC5239p0("ENUM", 8, cls, Integer.class, null);
        ENUM = enumC5239p09;
        EnumC5239p0 enumC5239p010 = new EnumC5239p0("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = enumC5239p010;
        f26637d = new EnumC5239p0[]{enumC5239p0, enumC5239p02, enumC5239p03, enumC5239p04, enumC5239p05, enumC5239p06, enumC5239p07, enumC5239p08, enumC5239p09, enumC5239p010};
    }

    private EnumC5239p0(String str, int i8, Class cls, Class cls2, Object obj) {
        this.f26638a = cls;
        this.f26639b = cls2;
        this.f26640c = obj;
    }

    public static EnumC5239p0 valueOf(String str) {
        return (EnumC5239p0) Enum.valueOf(EnumC5239p0.class, str);
    }

    public static EnumC5239p0[] values() {
        return (EnumC5239p0[]) f26637d.clone();
    }

    public Class<?> getBoxedType() {
        return this.f26639b;
    }

    public Object getDefaultDefault() {
        return this.f26640c;
    }

    public Class<?> getType() {
        return this.f26638a;
    }

    public boolean isValidType(Class<?> cls) {
        return this.f26638a.isAssignableFrom(cls);
    }
}
