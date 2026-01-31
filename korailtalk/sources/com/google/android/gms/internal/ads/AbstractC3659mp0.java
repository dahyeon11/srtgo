package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.mp0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3659mp0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Ws0 f20992a = Ws0.zzb(new Us0() { // from class: com.google.android.gms.internal.ads.jp0
        @Override // com.google.android.gms.internal.ads.Us0
        public final Object zza(C5138zo0 c5138zo0) {
            return C3675mx0.zzb((C3204ip0) c5138zo0);
        }
    }, C3204ip0.class, InterfaceC3885oo0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC1157Ao0 f20993b = C4007ps0.zzd("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", InterfaceC3885oo0.class, EnumC3559lw0.SYMMETRIC, C3102hv0.zzh());

    /* renamed from: c, reason: collision with root package name */
    private static final As0 f20994c = new As0() { // from class: com.google.android.gms.internal.ads.kp0
    };

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC5032ys0 f20995d = new InterfaceC5032ys0() { // from class: com.google.android.gms.internal.ads.lp0
        @Override // com.google.android.gms.internal.ads.InterfaceC5032ys0
        public final C5138zo0 zza(AbstractC1730Oo0 abstractC1730Oo0, Integer num) throws GeneralSecurityException {
            C4456tp0 c4456tp0 = (C4456tp0) abstractC1730Oo0;
            int i8 = AbstractC3659mp0.zza;
            if (c4456tp0.zzb() != 16 && c4456tp0.zzb() != 32) {
                throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
            }
            C2975gp0 c2975gp0 = new C2975gp0(null);
            c2975gp0.zzd(c4456tp0);
            c2975gp0.zzc(num);
            c2975gp0.zza(Nx0.zzc(c4456tp0.zzb()));
            c2975gp0.zzb(Nx0.zzc(c4456tp0.zzc()));
            return c2975gp0.zze();
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final int f20996e = 2;
    public static final /* synthetic */ int zza = 0;

    public static void zza(boolean z8) {
        int i8 = f20996e;
        if (!Zr0.zza(i8)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i9 = AbstractC3094hr0.zza;
        AbstractC3094hr0.zze(Js0.zzc());
        Gs0.zza().zze(f20992a);
        Fs0 fs0Zzb = Fs0.zzb();
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", Vq0.zze);
        AbstractC3773np0 abstractC3773np0 = null;
        C3887op0 c3887op0 = new C3887op0(abstractC3773np0);
        c3887op0.zza(16);
        c3887op0.zzc(32);
        c3887op0.zze(16);
        c3887op0.zzd(16);
        C4001pp0 c4001pp0 = C4001pp0.zzc;
        c3887op0.zzb(c4001pp0);
        C4115qp0 c4115qp0 = C4115qp0.zzc;
        c3887op0.zzf(c4115qp0);
        map.put("AES128_CTR_HMAC_SHA256_RAW", c3887op0.zzg());
        map.put("AES256_CTR_HMAC_SHA256", Vq0.zzf);
        C3887op0 c3887op02 = new C3887op0(abstractC3773np0);
        c3887op02.zza(32);
        c3887op02.zzc(32);
        c3887op02.zze(32);
        c3887op02.zzd(16);
        c3887op02.zzb(c4001pp0);
        c3887op02.zzf(c4115qp0);
        map.put("AES256_CTR_HMAC_SHA256_RAW", c3887op02.zzg());
        fs0Zzb.zzd(Collections.unmodifiableMap(map));
        Bs0.zza().zzb(f20994c, C4456tp0.class);
        C5146zs0.zzb().zzc(f20995d, C4456tp0.class);
        C2981gs0.zzc().zzf(f20993b, i8, true);
    }
}
