package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class SA0 {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ SA0[] f16210b;
    public static final SA0 zza;
    public static final SA0 zzb;
    public static final SA0 zzc;
    public static final SA0 zzd;
    public static final SA0 zze;
    public static final SA0 zzf;
    public static final SA0 zzg;
    public static final SA0 zzh;
    public static final SA0 zzi;
    public static final SA0 zzj;
    public static final SA0 zzk;
    public static final SA0 zzl;
    public static final SA0 zzm;
    public static final SA0 zzn;
    public static final SA0 zzo;
    public static final SA0 zzp;
    public static final SA0 zzq;
    public static final SA0 zzr;

    /* renamed from: a, reason: collision with root package name */
    private final TA0 f16211a;

    static {
        SA0 sa0 = new SA0("DOUBLE", 0, TA0.DOUBLE, 1);
        zza = sa0;
        SA0 sa02 = new SA0("FLOAT", 1, TA0.FLOAT, 5);
        zzb = sa02;
        TA0 ta0 = TA0.LONG;
        SA0 sa03 = new SA0("INT64", 2, ta0, 0);
        zzc = sa03;
        SA0 sa04 = new SA0("UINT64", 3, ta0, 0);
        zzd = sa04;
        TA0 ta02 = TA0.INT;
        SA0 sa05 = new SA0("INT32", 4, ta02, 0);
        zze = sa05;
        SA0 sa06 = new SA0("FIXED64", 5, ta0, 1);
        zzf = sa06;
        SA0 sa07 = new SA0("FIXED32", 6, ta02, 5);
        zzg = sa07;
        SA0 sa08 = new SA0("BOOL", 7, TA0.BOOLEAN, 0);
        zzh = sa08;
        SA0 sa09 = new SA0("STRING", 8, TA0.STRING, 2);
        zzi = sa09;
        TA0 ta03 = TA0.MESSAGE;
        SA0 sa010 = new SA0("GROUP", 9, ta03, 3);
        zzj = sa010;
        SA0 sa011 = new SA0("MESSAGE", 10, ta03, 2);
        zzk = sa011;
        SA0 sa012 = new SA0("BYTES", 11, TA0.BYTE_STRING, 2);
        zzl = sa012;
        SA0 sa013 = new SA0("UINT32", 12, ta02, 0);
        zzm = sa013;
        SA0 sa014 = new SA0("ENUM", 13, TA0.ENUM, 0);
        zzn = sa014;
        SA0 sa015 = new SA0("SFIXED32", 14, ta02, 5);
        zzo = sa015;
        SA0 sa016 = new SA0("SFIXED64", 15, ta0, 1);
        zzp = sa016;
        SA0 sa017 = new SA0("SINT32", 16, ta02, 0);
        zzq = sa017;
        SA0 sa018 = new SA0("SINT64", 17, ta0, 0);
        zzr = sa018;
        f16210b = new SA0[]{sa0, sa02, sa03, sa04, sa05, sa06, sa07, sa08, sa09, sa010, sa011, sa012, sa013, sa014, sa015, sa016, sa017, sa018};
    }

    private SA0(String str, int i8, TA0 ta0, int i9) {
        this.f16211a = ta0;
    }

    public static SA0[] values() {
        return (SA0[]) f16210b.clone();
    }

    public final TA0 zza() {
        return this.f16211a;
    }
}
