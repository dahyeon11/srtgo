package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sg0 */
/* loaded from: classes2.dex */
public final class C4324sg0 extends Zy0 implements Qz0 {
    private static final InterfaceC3223iz0 zza = new C3641mg0();
    private static final C4324sg0 zzb;
    private static volatile Xz0 zzc;
    private int zzd;
    private InterfaceC3110hz0 zze = Zy0.j();
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        C4324sg0 c4324sg0 = new C4324sg0();
        zzb = c4324sg0;
        Zy0.P(C4324sg0.class, c4324sg0);
    }

    private C4324sg0() {
    }

    static /* synthetic */ void a0(C4324sg0 c4324sg0, EnumC4097qg0 enumC4097qg0) {
        enumC4097qg0.getClass();
        InterfaceC3110hz0 interfaceC3110hz0 = c4324sg0.zze;
        if (!interfaceC3110hz0.zzc()) {
            c4324sg0.zze = Zy0.k(interfaceC3110hz0);
        }
        c4324sg0.zze.zzi(enumC4097qg0.zza());
    }

    static /* synthetic */ void b0(C4324sg0 c4324sg0, String str) {
        str.getClass();
        c4324sg0.zzd |= 1;
        c4324sg0.zzf = str;
    }

    public static C4210rg0 zza() {
        return (C4210rg0) zzb.i();
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        switch (yy0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return Zy0.t(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzd", "zze", C3983pg0.f21797a, "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new C4324sg0();
            case NEW_BUILDER:
                return new C4210rg0(null);
            case GET_DEFAULT_INSTANCE:
                return zzb;
            case GET_PARSER:
                Xz0 uy0 = zzc;
                if (uy0 == null) {
                    synchronized (C4324sg0.class) {
                        try {
                            uy0 = zzc;
                            if (uy0 == null) {
                                uy0 = new Uy0(zzb);
                                zzc = uy0;
                            }
                        } finally {
                        }
                    }
                }
                return uy0;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
