package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
abstract class Bq0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Mx0 f12311a;

    /* renamed from: b, reason: collision with root package name */
    private static final Ss0 f12312b;

    /* renamed from: c, reason: collision with root package name */
    private static final Os0 f12313c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC3893os0 f12314d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC3437ks0 f12315e;
    public static final /* synthetic */ int zza = 0;

    static {
        Mx0 mx0Zzb = At0.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f12311a = mx0Zzb;
        f12312b = Ss0.zzb(new Qs0() { // from class: com.google.android.gms.internal.ads.xq0
            @Override // com.google.android.gms.internal.ads.Qs0
            public final InterfaceC4009pt0 zza(AbstractC1730Oo0 abstractC1730Oo0) {
                return Bq0.zzd((C4800wq0) abstractC1730Oo0);
            }
        }, C4800wq0.class, C3553lt0.class);
        f12313c = Os0.zzb(new Ms0() { // from class: com.google.android.gms.internal.ads.yq0
            @Override // com.google.android.gms.internal.ads.Ms0
            public final AbstractC1730Oo0 zza(InterfaceC4009pt0 interfaceC4009pt0) {
                return Bq0.zzb((C3553lt0) interfaceC4009pt0);
            }
        }, mx0Zzb, C3553lt0.class);
        f12314d = AbstractC3893os0.zzb(new InterfaceC3665ms0() { // from class: com.google.android.gms.internal.ads.zq0
            @Override // com.google.android.gms.internal.ads.InterfaceC3665ms0
            public final InterfaceC4009pt0 zza(C5138zo0 c5138zo0, C1976Uo0 c1976Uo0) {
                return Bq0.zzc((C4572uq0) c5138zo0, c1976Uo0);
            }
        }, C4572uq0.class, C3439kt0.class);
        f12315e = AbstractC3437ks0.zzb(new InterfaceC3210is0() { // from class: com.google.android.gms.internal.ads.Aq0
            @Override // com.google.android.gms.internal.ads.InterfaceC3210is0
            public final C5138zo0 zza(InterfaceC4009pt0 interfaceC4009pt0, C1976Uo0 c1976Uo0) {
                return Bq0.zza((C3439kt0) interfaceC4009pt0, c1976Uo0);
            }
        }, mx0Zzb, C3439kt0.class);
    }

    private static C4686vq0 a(Tw0 tw0) throws GeneralSecurityException {
        Tw0 tw02 = Tw0.UNKNOWN_PREFIX;
        int iOrdinal = tw0.ordinal();
        if (iOrdinal == 1) {
            return C4686vq0.zza;
        }
        if (iOrdinal == 3) {
            return C4686vq0.zzb;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + tw0.zza());
    }

    private static Tw0 b(C4686vq0 c4686vq0) throws GeneralSecurityException {
        if (C4686vq0.zza.equals(c4686vq0)) {
            return Tw0.TINK;
        }
        if (C4686vq0.zzb.equals(c4686vq0)) {
            return Tw0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c4686vq0.toString()));
    }

    public static /* synthetic */ C4572uq0 zza(C3439kt0 c3439kt0, C1976Uo0 c1976Uo0) throws GeneralSecurityException {
        if (!c3439kt0.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            Iw0 iw0Zze = Iw0.zze(c3439kt0.zze(), Iy0.zza());
            if (iw0Zze.zza() == 0) {
                return C4572uq0.zza(C4800wq0.zzc(iw0Zze.zzf().zzf(), a(c3439kt0.zzc())), c3439kt0.zzf());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(iw0Zze));
        } catch (C4021pz0 e8) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e8);
        }
    }

    public static /* synthetic */ C4800wq0 zzb(C3553lt0 c3553lt0) throws GeneralSecurityException {
        if (!c3553lt0.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c3553lt0.zzc().zzi())));
        }
        try {
            return C4800wq0.zzc(Lw0.zze(c3553lt0.zzc().zzh(), Iy0.zza()).zzf(), a(c3553lt0.zzc().zzg()));
        } catch (C4021pz0 e8) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e8);
        }
    }

    public static /* synthetic */ C3439kt0 zzc(C4572uq0 c4572uq0, C1976Uo0 c1976Uo0) {
        Hw0 hw0Zzc = Iw0.zzc();
        Kw0 kw0Zza = Lw0.zza();
        kw0Zza.zza(c4572uq0.zzb().zzd());
        hw0Zzc.zza((Lw0) kw0Zza.zzbr());
        return C3439kt0.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((Iw0) hw0Zzc.zzbr()).zzaN(), EnumC3559lw0.REMOTE, b(c4572uq0.zzb().zzb()), c4572uq0.zzd());
    }

    public static /* synthetic */ C3553lt0 zzd(C4800wq0 c4800wq0) {
        C4129qw0 c4129qw0Zza = C4242rw0.zza();
        c4129qw0Zza.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        Kw0 kw0Zza = Lw0.zza();
        kw0Zza.zza(c4800wq0.zzd());
        c4129qw0Zza.zzc(((Lw0) kw0Zza.zzbr()).zzaN());
        c4129qw0Zza.zza(b(c4800wq0.zzb()));
        return C3553lt0.zzb((C4242rw0) c4129qw0Zza.zzbr());
    }

    public static void zze(Js0 js0) {
        js0.zzi(f12312b);
        js0.zzh(f12313c);
        js0.zzg(f12314d);
        js0.zzf(f12315e);
    }
}
