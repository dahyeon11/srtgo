package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.android.gms.internal.ads.rz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4248rz0 {

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC4248rz0[] f22537d;
    public static final EnumC4248rz0 zza;
    public static final EnumC4248rz0 zzb;
    public static final EnumC4248rz0 zzc;
    public static final EnumC4248rz0 zzd;
    public static final EnumC4248rz0 zze;
    public static final EnumC4248rz0 zzf;
    public static final EnumC4248rz0 zzg;
    public static final EnumC4248rz0 zzh;
    public static final EnumC4248rz0 zzi;
    public static final EnumC4248rz0 zzj;

    /* renamed from: a, reason: collision with root package name */
    private final Class f22538a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f22539b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f22540c;

    static {
        EnumC4248rz0 enumC4248rz0 = new EnumC4248rz0("VOID", 0, Void.class, Void.class, null);
        zza = enumC4248rz0;
        Class cls = Integer.TYPE;
        EnumC4248rz0 enumC4248rz02 = new EnumC4248rz0("INT", 1, cls, Integer.class, 0);
        zzb = enumC4248rz02;
        EnumC4248rz0 enumC4248rz03 = new EnumC4248rz0("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = enumC4248rz03;
        EnumC4248rz0 enumC4248rz04 = new EnumC4248rz0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = enumC4248rz04;
        EnumC4248rz0 enumC4248rz05 = new EnumC4248rz0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = enumC4248rz05;
        EnumC4248rz0 enumC4248rz06 = new EnumC4248rz0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = enumC4248rz06;
        EnumC4248rz0 enumC4248rz07 = new EnumC4248rz0("STRING", 6, String.class, String.class, "");
        zzg = enumC4248rz07;
        EnumC4248rz0 enumC4248rz08 = new EnumC4248rz0("BYTE_STRING", 7, AbstractC3677my0.class, AbstractC3677my0.class, AbstractC3677my0.zzb);
        zzh = enumC4248rz08;
        EnumC4248rz0 enumC4248rz09 = new EnumC4248rz0("ENUM", 8, cls, Integer.class, null);
        zzi = enumC4248rz09;
        EnumC4248rz0 enumC4248rz010 = new EnumC4248rz0("MESSAGE", 9, Object.class, Object.class, null);
        zzj = enumC4248rz010;
        f22537d = new EnumC4248rz0[]{enumC4248rz0, enumC4248rz02, enumC4248rz03, enumC4248rz04, enumC4248rz05, enumC4248rz06, enumC4248rz07, enumC4248rz08, enumC4248rz09, enumC4248rz010};
    }

    private EnumC4248rz0(String str, int i8, Class cls, Class cls2, Object obj) {
        this.f22538a = cls;
        this.f22539b = cls2;
        this.f22540c = obj;
    }

    public static EnumC4248rz0[] values() {
        return (EnumC4248rz0[]) f22537d.clone();
    }

    public final Class zza() {
        return this.f22539b;
    }
}
