package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class Np0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Ws0 f14951a = Ws0.zzb(new Us0() { // from class: com.google.android.gms.internal.ads.Kp0
        @Override // com.google.android.gms.internal.ads.Us0
        public final Object zza(C5138zo0 c5138zo0) {
            return C3333jx0.zzb((Jp0) c5138zo0);
        }
    }, Jp0.class, InterfaceC3885oo0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC1157Ao0 f14952b = C4007ps0.zzd("type.googleapis.com/google.crypto.tink.AesGcmKey", InterfaceC3885oo0.class, EnumC3559lw0.SYMMETRIC, Gv0.zzg());

    /* renamed from: c, reason: collision with root package name */
    private static final As0 f14953c = new As0() { // from class: com.google.android.gms.internal.ads.Lp0
    };

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC5032ys0 f14954d = new InterfaceC5032ys0() { // from class: com.google.android.gms.internal.ads.Mp0
        @Override // com.google.android.gms.internal.ads.InterfaceC5032ys0
        public final C5138zo0 zza(AbstractC1730Oo0 abstractC1730Oo0, Integer num) throws GeneralSecurityException {
            Sp0 sp0 = (Sp0) abstractC1730Oo0;
            int i8 = Np0.zza;
            if (sp0.zzb() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            Hp0 hp0 = new Hp0(null);
            hp0.zzc(sp0);
            hp0.zza(num);
            hp0.zzb(Nx0.zzc(sp0.zzb()));
            return hp0.zzd();
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final int f14955e = 2;
    public static final /* synthetic */ int zza = 0;

    public static void zza(boolean z8) {
        int i8 = f14955e;
        if (!Zr0.zza(i8)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i9 = AbstractC4232rr0.zza;
        AbstractC4232rr0.zze(Js0.zzc());
        Gs0.zza().zze(f14951a);
        Fs0 fs0Zzb = Fs0.zzb();
        HashMap map = new HashMap();
        map.put("AES128_GCM", Vq0.zza);
        Op0 op0 = null;
        Pp0 pp0 = new Pp0(op0);
        pp0.zza(12);
        pp0.zzb(16);
        pp0.zzc(16);
        Qp0 qp0 = Qp0.zzc;
        pp0.zzd(qp0);
        map.put("AES128_GCM_RAW", pp0.zze());
        map.put("AES256_GCM", Vq0.zzb);
        Pp0 pp02 = new Pp0(op0);
        pp02.zza(12);
        pp02.zzb(32);
        pp02.zzc(16);
        pp02.zzd(qp0);
        map.put("AES256_GCM_RAW", pp02.zze());
        fs0Zzb.zzd(Collections.unmodifiableMap(map));
        Bs0.zza().zzb(f14953c, Sp0.class);
        C5146zs0.zzb().zzc(f14954d, Sp0.class);
        C2981gs0.zzc().zzf(f14952b, i8, true);
    }
}
