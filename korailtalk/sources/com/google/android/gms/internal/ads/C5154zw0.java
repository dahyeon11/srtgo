package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.zw0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5154zw0 extends Zy0 implements Qz0 {
    private static final C5154zw0 zza;
    private static volatile Xz0 zzb;
    private int zzc;
    private InterfaceC3679mz0 zzd = Zy0.n();

    static {
        C5154zw0 c5154zw0 = new C5154zw0();
        zza = c5154zw0;
        Zy0.P(C5154zw0.class, c5154zw0);
    }

    private C5154zw0() {
    }

    static /* synthetic */ void b0(C5154zw0 c5154zw0, C5040yw0 c5040yw0) {
        c5040yw0.getClass();
        InterfaceC3679mz0 interfaceC3679mz0 = c5154zw0.zzd;
        if (!interfaceC3679mz0.zzc()) {
            c5154zw0.zzd = Zy0.o(interfaceC3679mz0);
        }
        c5154zw0.zzd.add(c5040yw0);
    }

    public static C4812ww0 zzd() {
        return (C4812ww0) zza.i();
    }

    public static C5154zw0 zzg(InputStream inputStream, Iy0 iy0) {
        return (C5154zw0) Zy0.K(zza, inputStream, iy0);
    }

    @Override // com.google.android.gms.internal.ads.Zy0
    protected final Object U(Yy0 yy0, Object obj, Object obj2) {
        Yy0 yy02 = Yy0.GET_MEMOIZED_IS_INITIALIZED;
        AbstractC4698vw0 abstractC4698vw0 = null;
        switch (yy0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return Zy0.t(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", C5040yw0.class});
            case NEW_MUTABLE_INSTANCE:
                return new C5154zw0();
            case NEW_BUILDER:
                return new C4812ww0(abstractC4698vw0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                Xz0 uy0 = zzb;
                if (uy0 == null) {
                    synchronized (C5154zw0.class) {
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

    public final int zza() {
        return this.zzd.size();
    }

    public final int zzc() {
        return this.zzc;
    }

    public final C5040yw0 zze(int i8) {
        return (C5040yw0) this.zzd.get(i8);
    }

    public final List zzh() {
        return this.zzd;
    }
}
