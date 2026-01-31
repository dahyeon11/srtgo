package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class It0 {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC5032ys0 f13509a = new InterfaceC5032ys0() { // from class: com.google.android.gms.internal.ads.Ft0
        @Override // com.google.android.gms.internal.ads.InterfaceC5032ys0
        public final C5138zo0 zza(AbstractC1730Oo0 abstractC1730Oo0, Integer num) {
            return It0.zzb((Nt0) abstractC1730Oo0, num);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final Ws0 f13510b = Ws0.zzb(new Us0() { // from class: com.google.android.gms.internal.ads.Gt0
        @Override // com.google.android.gms.internal.ads.Us0
        public final Object zza(C5138zo0 c5138zo0) {
            return It0.zzc((Et0) c5138zo0);
        }
    }, Et0.class, Ot0.class);

    /* renamed from: c, reason: collision with root package name */
    private static final Ws0 f13511c = Ws0.zzb(new Us0() { // from class: com.google.android.gms.internal.ads.Ht0
        @Override // com.google.android.gms.internal.ads.Us0
        public final Object zza(C5138zo0 c5138zo0) {
            return It0.zza((Et0) c5138zo0);
        }
    }, Et0.class, InterfaceC1689No0.class);

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC1157Ao0 f13512d = C4007ps0.zzd("type.googleapis.com/google.crypto.tink.AesCmacKey", InterfaceC1689No0.class, EnumC3559lw0.SYMMETRIC, Xu0.zzh());

    private static void a(Nt0 nt0) throws GeneralSecurityException {
        if (nt0.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    public static /* synthetic */ InterfaceC1689No0 zza(Et0 et0) throws GeneralSecurityException {
        a(et0.zzb());
        return Jx0.zza(et0);
    }

    public static /* synthetic */ Et0 zzb(Nt0 nt0, Integer num) throws GeneralSecurityException {
        a(nt0);
        Ct0 ct0 = new Ct0(null);
        ct0.zzc(nt0);
        ct0.zza(Nx0.zzc(nt0.zzc()));
        ct0.zzb(num);
        return ct0.zzd();
    }

    public static /* synthetic */ Ot0 zzc(Et0 et0) throws GeneralSecurityException {
        a(et0.zzb());
        return new Cu0(et0);
    }

    public static void zzd(boolean z8) throws GeneralSecurityException {
        if (!Zr0.zza(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i8 = AbstractC5150zu0.zza;
        AbstractC5150zu0.zze(Js0.zzc());
        C5146zs0.zzb().zzc(f13509a, Nt0.class);
        Gs0.zza().zze(f13510b);
        Gs0.zza().zze(f13511c);
        Fs0 fs0Zzb = Fs0.zzb();
        HashMap map = new HashMap();
        Nt0 nt0 = AbstractC4580uu0.zze;
        map.put("AES_CMAC", nt0);
        map.put("AES256_CMAC", nt0);
        Kt0 kt0 = new Kt0(null);
        kt0.zza(32);
        kt0.zzb(16);
        kt0.zzc(Lt0.zzd);
        map.put("AES256_CMAC_RAW", kt0.zzd());
        fs0Zzb.zzd(Collections.unmodifiableMap(map));
        C2981gs0.zzc().zzd(f13512d, true);
    }
}
