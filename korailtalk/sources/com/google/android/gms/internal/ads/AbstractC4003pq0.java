package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.pq0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4003pq0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Ws0 f21812a = Ws0.zzb(new Us0() { // from class: com.google.android.gms.internal.ads.nq0
        @Override // com.google.android.gms.internal.ads.Us0
        public final Object zza(C5138zo0 c5138zo0) {
            int i8 = AbstractC4003pq0.zza;
            AbstractC1648Mo0.zza(((C4572uq0) c5138zo0).zzb().zzd());
            throw null;
        }
    }, C4572uq0.class, InterfaceC3885oo0.class);

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC1157Ao0 f21813b = C4007ps0.zzd("type.googleapis.com/google.crypto.tink.KmsAeadKey", InterfaceC3885oo0.class, EnumC3559lw0.REMOTE, Iw0.zzg());

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC5032ys0 f21814c = new InterfaceC5032ys0() { // from class: com.google.android.gms.internal.ads.oq0
        @Override // com.google.android.gms.internal.ads.InterfaceC5032ys0
        public final C5138zo0 zza(AbstractC1730Oo0 abstractC1730Oo0, Integer num) {
            return C4572uq0.zza((C4800wq0) abstractC1730Oo0, num);
        }
    };
    public static final /* synthetic */ int zza = 0;

    public static void zza(boolean z8) {
        if (!Zr0.zza(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i8 = Bq0.zza;
        Bq0.zze(Js0.zzc());
        Gs0.zza().zze(f21812a);
        C5146zs0.zzb().zzc(f21814c, C4800wq0.class);
        C2981gs0.zzc().zzd(f21813b, true);
    }
}
