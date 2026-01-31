package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.google.android.gms.internal.ads.bq0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2404bq0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Ws0 f18182a = Ws0.zzb(new Us0() { // from class: com.google.android.gms.internal.ads.Yp0
        @Override // com.google.android.gms.internal.ads.Us0
        public final Object zza(C5138zo0 c5138zo0) {
            return Yr0.zzb((Xp0) c5138zo0);
        }
    }, Xp0.class, InterfaceC3885oo0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC5032ys0 f18183b = new InterfaceC5032ys0() { // from class: com.google.android.gms.internal.ads.Zp0
        @Override // com.google.android.gms.internal.ads.InterfaceC5032ys0
        public final C5138zo0 zza(AbstractC1730Oo0 abstractC1730Oo0, Integer num) {
            C2977gq0 c2977gq0 = (C2977gq0) abstractC1730Oo0;
            Vp0 vp0 = new Vp0(null);
            vp0.zzc(c2977gq0);
            vp0.zza(num);
            vp0.zzb(Nx0.zzc(c2977gq0.zzb()));
            return vp0.zzd();
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final As0 f18184c = new As0() { // from class: com.google.android.gms.internal.ads.aq0
    };

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC1157Ao0 f18185d = C4007ps0.zzd("type.googleapis.com/google.crypto.tink.AesGcmSivKey", InterfaceC3885oo0.class, EnumC3559lw0.SYMMETRIC, Mv0.zzg());

    private static boolean a() throws NoSuchPaddingException, NoSuchAlgorithmException {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public static void zza(boolean z8) {
        if (!Zr0.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i8 = AbstractC4916xr0.zza;
        AbstractC4916xr0.zze(Js0.zzc());
        if (a()) {
            Gs0.zza().zze(f18182a);
            Fs0 fs0Zzb = Fs0.zzb();
            HashMap map = new HashMap();
            AbstractC2518cq0 abstractC2518cq0 = null;
            C2632dq0 c2632dq0 = new C2632dq0(abstractC2518cq0);
            c2632dq0.zza(16);
            C2747eq0 c2747eq0 = C2747eq0.zza;
            c2632dq0.zzb(c2747eq0);
            map.put("AES128_GCM_SIV", c2632dq0.zzc());
            C2632dq0 c2632dq02 = new C2632dq0(abstractC2518cq0);
            c2632dq02.zza(16);
            C2747eq0 c2747eq02 = C2747eq0.zzc;
            c2632dq02.zzb(c2747eq02);
            map.put("AES128_GCM_SIV_RAW", c2632dq02.zzc());
            C2632dq0 c2632dq03 = new C2632dq0(abstractC2518cq0);
            c2632dq03.zza(32);
            c2632dq03.zzb(c2747eq0);
            map.put("AES256_GCM_SIV", c2632dq03.zzc());
            C2632dq0 c2632dq04 = new C2632dq0(abstractC2518cq0);
            c2632dq04.zza(32);
            c2632dq04.zzb(c2747eq02);
            map.put("AES256_GCM_SIV_RAW", c2632dq04.zzc());
            fs0Zzb.zzd(Collections.unmodifiableMap(map));
            Bs0.zza().zzb(f18184c, C2977gq0.class);
            C5146zs0.zzb().zzc(f18183b, C2977gq0.class);
            C2981gs0.zzc().zzd(f18185d, true);
        }
    }
}
