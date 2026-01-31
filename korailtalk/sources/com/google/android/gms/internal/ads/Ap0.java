package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class Ap0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Ws0 f12218a = Ws0.zzb(new Us0() { // from class: com.google.android.gms.internal.ads.yp0
        @Override // com.google.android.gms.internal.ads.Us0
        public final Object zza(C5138zo0 c5138zo0) {
            return C3219ix0.zzb((C4912xp0) c5138zo0);
        }
    }, C4912xp0.class, InterfaceC3885oo0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC1157Ao0 f12219b = C4007ps0.zzd("type.googleapis.com/google.crypto.tink.AesEaxKey", InterfaceC3885oo0.class, EnumC3559lw0.SYMMETRIC, C4810wv0.zzh());

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC5032ys0 f12220c = new InterfaceC5032ys0() { // from class: com.google.android.gms.internal.ads.zp0
        @Override // com.google.android.gms.internal.ads.InterfaceC5032ys0
        public final C5138zo0 zza(AbstractC1730Oo0 abstractC1730Oo0, Integer num) throws GeneralSecurityException {
            Fp0 fp0 = (Fp0) abstractC1730Oo0;
            int i8 = Ap0.zza;
            if (fp0.zzc() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            C4684vp0 c4684vp0 = new C4684vp0(null);
            c4684vp0.zzc(fp0);
            c4684vp0.zza(num);
            c4684vp0.zzb(Nx0.zzc(fp0.zzc()));
            return c4684vp0.zzd();
        }
    };
    public static final /* synthetic */ int zza = 0;

    public static void zza(boolean z8) {
        if (!Zr0.zza(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i8 = AbstractC3663mr0.zza;
        AbstractC3663mr0.zze(Js0.zzc());
        Gs0.zza().zze(f12218a);
        Fs0 fs0Zzb = Fs0.zzb();
        HashMap map = new HashMap();
        map.put("AES128_EAX", Vq0.zzc);
        Bp0 bp0 = null;
        Cp0 cp0 = new Cp0(bp0);
        cp0.zza(16);
        cp0.zzb(16);
        cp0.zzc(16);
        Dp0 dp0 = Dp0.zzc;
        cp0.zzd(dp0);
        map.put("AES128_EAX_RAW", cp0.zze());
        map.put("AES256_EAX", Vq0.zzd);
        Cp0 cp02 = new Cp0(bp0);
        cp02.zza(16);
        cp02.zzb(32);
        cp02.zzc(16);
        cp02.zzd(dp0);
        map.put("AES256_EAX_RAW", cp02.zze());
        fs0Zzb.zzd(Collections.unmodifiableMap(map));
        C5146zs0.zzb().zzc(f12220c, Fp0.class);
        C2981gs0.zzc().zzd(f12219b, true);
    }
}
