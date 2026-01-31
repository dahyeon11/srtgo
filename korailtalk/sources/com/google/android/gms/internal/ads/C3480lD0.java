package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lD0 */
/* loaded from: classes2.dex */
public final class C3480lD0 extends Zy0 implements Qz0 {
    private static final C3480lD0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private boolean zzj;
    private double zzk;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzu;
    private String zzd = "";
    private String zze = "";
    private int zzf = 4;
    private InterfaceC3679mz0 zzg = Zy0.n();
    private String zzh = "";
    private String zzi = "";
    private InterfaceC3679mz0 zzl = Zy0.n();

    static {
        C3480lD0 c3480lD0 = new C3480lD0();
        zza = c3480lD0;
        Zy0.P(C3480lD0.class, c3480lD0);
    }

    private C3480lD0() {
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
                return Zy0.t(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zzc", "zzd", "zzf", C3252jD0.f20213a, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", C3024hD0.class, "zze", "zzm", C2679eD0.f18740a, "zzn", "zzo", "zzp", "zzu"});
            case NEW_MUTABLE_INSTANCE:
                return new C3480lD0();
            case NEW_BUILDER:
                return new C2450cD0(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C3480lD0.class) {
                        try {
                            uy0 = zzb;
                            if (uy0 == null) {
                                uy0 = new Uy0(zza);
                                zzb = uy0;
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
