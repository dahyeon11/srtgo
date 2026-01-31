package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wB0 */
/* loaded from: classes2.dex */
public final class C4729wB0 extends Zy0 implements Qz0 {
    private static final InterfaceC3223iz0 zza = new C2675eB0();
    private static final InterfaceC3223iz0 zzb = new C2790fB0();
    private static final C4729wB0 zzc;
    private static volatile Xz0 zzd;
    private boolean zzA;
    private int zze;
    private int zzf;
    private boolean zzg;
    private int zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzo;
    private int zzp;
    private int zzu;
    private boolean zzv;
    private boolean zzx;
    private long zzy;
    private String zzh = "";
    private InterfaceC3679mz0 zzi = Zy0.n();
    private String zzn = "";
    private InterfaceC3679mz0 zzw = Zy0.n();
    private InterfaceC3110hz0 zzz = Zy0.j();
    private InterfaceC3110hz0 zzB = Zy0.j();

    static {
        C4729wB0 c4729wB0 = new C4729wB0();
        zzc = c4729wB0;
        Zy0.P(C4729wB0.class, c4729wB0);
    }

    private C4729wB0() {
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
                return Zy0.t(zzc, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zze", "zzf", C4501uB0.f22988a, "zzg", "zzh", "zzi", "zzj", C3818oB0.f21431a, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", C3476lB0.class, "zzx", "zzy", "zzz", XA0.zzb(), "zzA", "zzB", C4159rB0.f22391a});
            case NEW_MUTABLE_INSTANCE:
                return new C4729wB0();
            case NEW_BUILDER:
                return new C2905gB0(null);
            case GET_DEFAULT_INSTANCE:
                return zzc;
            case GET_PARSER:
                Xz0 uy0 = zzd;
                if (uy0 == null) {
                    synchronized (C4729wB0.class) {
                        try {
                            uy0 = zzd;
                            if (uy0 == null) {
                                uy0 = new Uy0(zzc);
                                zzd = uy0;
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
