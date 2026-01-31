package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class Nq0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Mx0 f14956a;

    /* renamed from: b, reason: collision with root package name */
    private static final Ss0 f14957b;

    /* renamed from: c, reason: collision with root package name */
    private static final Os0 f14958c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC3893os0 f14959d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC3437ks0 f14960e;
    public static final /* synthetic */ int zza = 0;

    static {
        Mx0 mx0Zzb = At0.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f14956a = mx0Zzb;
        f14957b = Ss0.zzb(new Qs0() { // from class: com.google.android.gms.internal.ads.Jq0
            @Override // com.google.android.gms.internal.ads.Qs0
            public final InterfaceC4009pt0 zza(AbstractC1730Oo0 abstractC1730Oo0) {
                return Nq0.zzd((Iq0) abstractC1730Oo0);
            }
        }, Iq0.class, C3553lt0.class);
        f14958c = Os0.zzb(new Ms0() { // from class: com.google.android.gms.internal.ads.Kq0
            @Override // com.google.android.gms.internal.ads.Ms0
            public final AbstractC1730Oo0 zza(InterfaceC4009pt0 interfaceC4009pt0) {
                return Nq0.zzb((C3553lt0) interfaceC4009pt0);
            }
        }, mx0Zzb, C3553lt0.class);
        f14959d = AbstractC3893os0.zzb(new InterfaceC3665ms0() { // from class: com.google.android.gms.internal.ads.Lq0
            @Override // com.google.android.gms.internal.ads.InterfaceC3665ms0
            public final InterfaceC4009pt0 zza(C5138zo0 c5138zo0, C1976Uo0 c1976Uo0) {
                return Nq0.zzc((Cq0) c5138zo0, c1976Uo0);
            }
        }, Cq0.class, C3439kt0.class);
        f14960e = AbstractC3437ks0.zzb(new InterfaceC3210is0() { // from class: com.google.android.gms.internal.ads.Mq0
            @Override // com.google.android.gms.internal.ads.InterfaceC3210is0
            public final C5138zo0 zza(InterfaceC4009pt0 interfaceC4009pt0, C1976Uo0 c1976Uo0) {
                return Nq0.zza((C3439kt0) interfaceC4009pt0, c1976Uo0);
            }
        }, mx0Zzb, C3439kt0.class);
    }

    private static Iq0 a(Rw0 rw0, Tw0 tw0) throws GeneralSecurityException {
        Fq0 fq0;
        Gq0 gq0;
        C4129qw0 c4129qw0Zza = C4242rw0.zza();
        c4129qw0Zza.zzb(rw0.zza().zzi());
        c4129qw0Zza.zzc(rw0.zza().zzh());
        c4129qw0Zza.zza(Tw0.RAW);
        AbstractC1730Oo0 abstractC1730Oo0Zza = AbstractC2058Wo0.zza(((C4242rw0) c4129qw0Zza.zzbr()).zzaV());
        if (abstractC1730Oo0Zza instanceof Sp0) {
            fq0 = Fq0.zza;
        } else if (abstractC1730Oo0Zza instanceof C3661mq0) {
            fq0 = Fq0.zzc;
        } else if (abstractC1730Oo0Zza instanceof C2520cr0) {
            fq0 = Fq0.zzb;
        } else if (abstractC1730Oo0Zza instanceof C4456tp0) {
            fq0 = Fq0.zzd;
        } else if (abstractC1730Oo0Zza instanceof Fp0) {
            fq0 = Fq0.zze;
        } else {
            if (!(abstractC1730Oo0Zza instanceof C2977gq0)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(abstractC1730Oo0Zza.toString()));
            }
            fq0 = Fq0.zzf;
        }
        Eq0 eq0 = new Eq0(null);
        int iOrdinal = tw0.ordinal();
        if (iOrdinal == 1) {
            gq0 = Gq0.zza;
        } else {
            if (iOrdinal != 3) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + tw0.zza());
            }
            gq0 = Gq0.zzb;
        }
        eq0.zzd(gq0);
        eq0.zzc(rw0.zzg());
        eq0.zza((AbstractC2287ap0) abstractC1730Oo0Zza);
        eq0.zzb(fq0);
        return eq0.zze();
    }

    private static Rw0 b(Iq0 iq0) throws GeneralSecurityException {
        try {
            C4242rw0 c4242rw0Zzf = C4242rw0.zzf(AbstractC2058Wo0.zzb(iq0.zzb()), Iy0.zza());
            Qw0 qw0Zzc = Rw0.zzc();
            qw0Zzc.zzb(iq0.zzd());
            qw0Zzc.zza(c4242rw0Zzf);
            return (Rw0) qw0Zzc.zzbr();
        } catch (C4021pz0 e8) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e8);
        }
    }

    private static Tw0 c(Gq0 gq0) throws GeneralSecurityException {
        if (Gq0.zza.equals(gq0)) {
            return Tw0.TINK;
        }
        if (Gq0.zzb.equals(gq0)) {
            return Tw0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(gq0)));
    }

    public static /* synthetic */ Cq0 zza(C3439kt0 c3439kt0, C1976Uo0 c1976Uo0) throws GeneralSecurityException {
        if (!c3439kt0.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            Ow0 ow0Zze = Ow0.zze(c3439kt0.zze(), Iy0.zza());
            if (ow0Zze.zza() == 0) {
                return Cq0.zza(a(ow0Zze.zzf(), c3439kt0.zzc()), c3439kt0.zzf());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + String.valueOf(ow0Zze));
        } catch (C4021pz0 e8) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e8);
        }
    }

    public static /* synthetic */ Iq0 zzb(C3553lt0 c3553lt0) throws GeneralSecurityException {
        if (!c3553lt0.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c3553lt0.zzc().zzi())));
        }
        try {
            return a(Rw0.zzf(c3553lt0.zzc().zzh(), Iy0.zza()), c3553lt0.zzc().zzg());
        } catch (C4021pz0 e8) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e8);
        }
    }

    public static /* synthetic */ C3439kt0 zzc(Cq0 cq0, C1976Uo0 c1976Uo0) {
        Nw0 nw0Zzc = Ow0.zzc();
        nw0Zzc.zza(b(cq0.zzb()));
        return C3439kt0.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((Ow0) nw0Zzc.zzbr()).zzaN(), EnumC3559lw0.REMOTE, c(cq0.zzb().zzc()), cq0.zzd());
    }

    public static /* synthetic */ C3553lt0 zzd(Iq0 iq0) {
        C4129qw0 c4129qw0Zza = C4242rw0.zza();
        c4129qw0Zza.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        c4129qw0Zza.zzc(b(iq0).zzaN());
        c4129qw0Zza.zza(c(iq0.zzc()));
        return C3553lt0.zzb((C4242rw0) c4129qw0Zza.zzbr());
    }

    public static void zze(Js0 js0) {
        js0.zzi(f14957b);
        js0.zzh(f14958c);
        js0.zzg(f14959d);
        js0.zzf(f14960e);
    }
}
