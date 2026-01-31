package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class CB0 extends Zy0 implements Qz0 {
    private static final CB0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private String zzd = "";

    static {
        CB0 cb0 = new CB0();
        zza = cb0;
        Zy0.P(CB0.class, cb0);
    }

    private CB0() {
    }

    static /* synthetic */ void a0(CB0 cb0, String str) {
        cb0.zzc |= 1;
        cb0.zzd = str;
    }

    public static BB0 zzc() {
        return (BB0) zza.i();
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        switch (yy0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return Zy0.t(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
            case 3:
                return new CB0();
            case 4:
                return new BB0(null);
            case 5:
                return zza;
            case 6:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (CB0.class) {
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
