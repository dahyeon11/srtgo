package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.bu0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2412bu0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Ws0 f18193a = Ws0.zzb(new Us0() { // from class: com.google.android.gms.internal.ads.Wt0
        @Override // com.google.android.gms.internal.ads.Us0
        public final Object zza(C5138zo0 c5138zo0) {
            return new Du0((Vt0) c5138zo0);
        }
    }, Vt0.class, Ot0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Ws0 f18194b = Ws0.zzb(new Us0() { // from class: com.google.android.gms.internal.ads.Xt0
        @Override // com.google.android.gms.internal.ads.Us0
        public final Object zza(C5138zo0 c5138zo0) {
            return Jx0.zzb((Vt0) c5138zo0);
        }
    }, Vt0.class, InterfaceC1689No0.class);

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC1157Ao0 f18195c = C4007ps0.zzd("type.googleapis.com/google.crypto.tink.HmacKey", InterfaceC1689No0.class, EnumC3559lw0.SYMMETRIC, C2301aw0.zzi());

    /* renamed from: d, reason: collision with root package name */
    private static final As0 f18196d = new As0() { // from class: com.google.android.gms.internal.ads.Yt0
    };

    /* renamed from: e, reason: collision with root package name */
    private static final InterfaceC5032ys0 f18197e = new InterfaceC5032ys0() { // from class: com.google.android.gms.internal.ads.Zt0
        @Override // com.google.android.gms.internal.ads.InterfaceC5032ys0
        public final C5138zo0 zza(AbstractC1730Oo0 abstractC1730Oo0, Integer num) {
            C3100hu0 c3100hu0 = (C3100hu0) abstractC1730Oo0;
            Tt0 tt0 = new Tt0(null);
            tt0.zzc(c3100hu0);
            tt0.zzb(Nx0.zzc(c3100hu0.zzc()));
            tt0.zza(num);
            return tt0.zzd();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final int f18198f = 2;

    public static void zza(boolean z8) throws GeneralSecurityException {
        int i8 = f18198f;
        if (!Zr0.zza(i8)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i9 = Iu0.zza;
        Iu0.zze(Js0.zzc());
        Gs0.zza().zze(f18193a);
        Gs0.zza().zze(f18194b);
        Fs0 fs0Zzb = Fs0.zzb();
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", AbstractC4580uu0.zza);
        AbstractC2526cu0 abstractC2526cu0 = null;
        C2640du0 c2640du0 = new C2640du0(abstractC2526cu0);
        c2640du0.zzb(32);
        c2640du0.zzc(16);
        C2870fu0 c2870fu0 = C2870fu0.zzd;
        c2640du0.zzd(c2870fu0);
        C2755eu0 c2755eu0 = C2755eu0.zzc;
        c2640du0.zza(c2755eu0);
        map.put("HMAC_SHA256_128BITTAG_RAW", c2640du0.zze());
        C2640du0 c2640du02 = new C2640du0(abstractC2526cu0);
        c2640du02.zzb(32);
        c2640du02.zzc(32);
        C2870fu0 c2870fu02 = C2870fu0.zza;
        c2640du02.zzd(c2870fu02);
        c2640du02.zza(c2755eu0);
        map.put("HMAC_SHA256_256BITTAG", c2640du02.zze());
        C2640du0 c2640du03 = new C2640du0(abstractC2526cu0);
        c2640du03.zzb(32);
        c2640du03.zzc(32);
        c2640du03.zzd(c2870fu0);
        c2640du03.zza(c2755eu0);
        map.put("HMAC_SHA256_256BITTAG_RAW", c2640du03.zze());
        C2640du0 c2640du04 = new C2640du0(abstractC2526cu0);
        c2640du04.zzb(64);
        c2640du04.zzc(16);
        c2640du04.zzd(c2870fu02);
        C2755eu0 c2755eu02 = C2755eu0.zze;
        c2640du04.zza(c2755eu02);
        map.put("HMAC_SHA512_128BITTAG", c2640du04.zze());
        C2640du0 c2640du05 = new C2640du0(abstractC2526cu0);
        c2640du05.zzb(64);
        c2640du05.zzc(16);
        c2640du05.zzd(c2870fu0);
        c2640du05.zza(c2755eu02);
        map.put("HMAC_SHA512_128BITTAG_RAW", c2640du05.zze());
        C2640du0 c2640du06 = new C2640du0(abstractC2526cu0);
        c2640du06.zzb(64);
        c2640du06.zzc(32);
        c2640du06.zzd(c2870fu02);
        c2640du06.zza(c2755eu02);
        map.put("HMAC_SHA512_256BITTAG", c2640du06.zze());
        C2640du0 c2640du07 = new C2640du0(abstractC2526cu0);
        c2640du07.zzb(64);
        c2640du07.zzc(32);
        c2640du07.zzd(c2870fu0);
        c2640du07.zza(c2755eu02);
        map.put("HMAC_SHA512_256BITTAG_RAW", c2640du07.zze());
        map.put("HMAC_SHA512_512BITTAG", AbstractC4580uu0.zzd);
        C2640du0 c2640du08 = new C2640du0(abstractC2526cu0);
        c2640du08.zzb(64);
        c2640du08.zzc(64);
        c2640du08.zzd(c2870fu0);
        c2640du08.zza(c2755eu02);
        map.put("HMAC_SHA512_512BITTAG_RAW", c2640du08.zze());
        fs0Zzb.zzd(Collections.unmodifiableMap(map));
        C5146zs0.zzb().zzc(f18197e, C3100hu0.class);
        Bs0.zza().zzb(f18196d, C3100hu0.class);
        C2981gs0.zzc().zzf(f18195c, i8, true);
    }
}
