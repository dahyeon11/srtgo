package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.sq0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4344sq0 {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC1157Ao0 f22690a = C4007ps0.zzd("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", InterfaceC3885oo0.class, EnumC3559lw0.SYMMETRIC, Ow0.zzg());

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC5032ys0 f22691b = new InterfaceC5032ys0() { // from class: com.google.android.gms.internal.ads.qq0
        @Override // com.google.android.gms.internal.ads.InterfaceC5032ys0
        public final C5138zo0 zza(AbstractC1730Oo0 abstractC1730Oo0, Integer num) {
            return Cq0.zza((Iq0) abstractC1730Oo0, num);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final Ws0 f22692c = Ws0.zzb(new Us0() { // from class: com.google.android.gms.internal.ads.rq0
        @Override // com.google.android.gms.internal.ads.Us0
        public final Object zza(C5138zo0 c5138zo0) {
            Cq0 cq0 = (Cq0) c5138zo0;
            int i8 = AbstractC4344sq0.zza;
            String strZzd = cq0.zzb().zzd();
            cq0.zzb().zzb();
            AbstractC1648Mo0.zza(strZzd);
            throw null;
        }
    }, Cq0.class, InterfaceC3885oo0.class);
    public static final /* synthetic */ int zza = 0;

    public static void zza(boolean z8) {
        if (!Zr0.zza(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i8 = Nq0.zza;
        Nq0.zze(Js0.zzc());
        C5146zs0.zzb().zzc(f22691b, Iq0.class);
        Gs0.zza().zze(f22692c);
        C2981gs0.zzc().zzd(f22690a, true);
    }
}
