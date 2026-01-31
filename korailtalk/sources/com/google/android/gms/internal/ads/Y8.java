package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Y8 extends Zy0 implements Qz0 {
    private static final Y8 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private long zze;
    private long zzi;
    private long zzj;
    private long zzl;
    private int zzp;
    private String zzd = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzk = "";
    private String zzm = "";
    private String zzn = "";
    private InterfaceC3679mz0 zzo = Zy0.n();

    static {
        Y8 y8 = new Y8();
        zza = y8;
        Zy0.P(Y8.class, y8);
    }

    private Y8() {
    }

    static /* synthetic */ void a0(Y8 y8, long j8) {
        y8.zzc |= 2;
        y8.zze = j8;
    }

    static /* synthetic */ void b0(Y8 y8, String str) {
        str.getClass();
        y8.zzc |= 4;
        y8.zzf = str;
    }

    static /* synthetic */ void c0(Y8 y8, String str) {
        str.getClass();
        y8.zzc |= 8;
        y8.zzg = str;
    }

    static /* synthetic */ void d0(Y8 y8, String str) {
        y8.zzc |= 16;
        y8.zzh = str;
    }

    static /* synthetic */ void e0(Y8 y8, String str) {
        y8.zzc |= 1024;
        y8.zzn = str;
    }

    static /* synthetic */ void f0(Y8 y8, X8 x8) {
        y8.zzp = x8.zza();
        y8.zzc |= 2048;
    }

    static /* synthetic */ void g0(Y8 y8, String str) {
        str.getClass();
        y8.zzc |= 1;
        y8.zzd = str;
    }

    public static R8 zza() {
        return (R8) zza.i();
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
                return Zy0.t(zza, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", T8.class, "zzp", W8.f16935a});
            case NEW_MUTABLE_INSTANCE:
                return new Y8();
            case NEW_BUILDER:
                return new R8(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (Y8.class) {
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
