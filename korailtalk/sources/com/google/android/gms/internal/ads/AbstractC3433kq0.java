package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.kq0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3433kq0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Ws0 f20477a = Ws0.zzb(new Us0() { // from class: com.google.android.gms.internal.ads.iq0
        @Override // com.google.android.gms.internal.ads.Us0
        public final Object zza(C5138zo0 c5138zo0) {
            C3092hq0 c3092hq0 = (C3092hq0) c5138zo0;
            int i8 = AbstractC3433kq0.zza;
            return C5144zr0.zze() ? C5144zr0.zzb(c3092hq0) : C3561lx0.zzb(c3092hq0);
        }
    }, C3092hq0.class, InterfaceC3885oo0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC5032ys0 f20478b = new InterfaceC5032ys0() { // from class: com.google.android.gms.internal.ads.jq0
        @Override // com.google.android.gms.internal.ads.InterfaceC5032ys0
        public final C5138zo0 zza(AbstractC1730Oo0 abstractC1730Oo0, Integer num) {
            int i8 = AbstractC3433kq0.zza;
            return C3092hq0.zza(((C3661mq0) abstractC1730Oo0).zzb(), Nx0.zzc(32), num);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC1157Ao0 f20479c = C4007ps0.zzd("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", InterfaceC3885oo0.class, EnumC3559lw0.SYMMETRIC, Sv0.zzg());
    public static final /* synthetic */ int zza = 0;

    public static void zza(boolean z8) {
        if (!Zr0.zza(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i8 = Er0.zza;
        Er0.zze(Js0.zzc());
        Gs0.zza().zze(f20477a);
        C5146zs0.zzb().zzc(f20478b, C3661mq0.class);
        Fs0 fs0Zzb = Fs0.zzb();
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", C3661mq0.zzc(C3547lq0.zza));
        map.put("CHACHA20_POLY1305_RAW", C3661mq0.zzc(C3547lq0.zzc));
        fs0Zzb.zzd(Collections.unmodifiableMap(map));
        C2981gs0.zzc().zzd(f20479c, true);
    }
}
