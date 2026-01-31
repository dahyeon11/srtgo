package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.rr0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4232rr0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Mx0 f22520a;

    /* renamed from: b, reason: collision with root package name */
    private static final Ss0 f22521b;

    /* renamed from: c, reason: collision with root package name */
    private static final Os0 f22522c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC3893os0 f22523d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC3437ks0 f22524e;
    public static final /* synthetic */ int zza = 0;

    static {
        Mx0 mx0Zzb = At0.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f22520a = mx0Zzb;
        f22521b = Ss0.zzb(new Qs0() { // from class: com.google.android.gms.internal.ads.nr0
            @Override // com.google.android.gms.internal.ads.Qs0
            public final InterfaceC4009pt0 zza(AbstractC1730Oo0 abstractC1730Oo0) {
                return AbstractC4232rr0.zzd((Sp0) abstractC1730Oo0);
            }
        }, Sp0.class, C3553lt0.class);
        f22522c = Os0.zzb(new Ms0() { // from class: com.google.android.gms.internal.ads.or0
            @Override // com.google.android.gms.internal.ads.Ms0
            public final AbstractC1730Oo0 zza(InterfaceC4009pt0 interfaceC4009pt0) {
                return AbstractC4232rr0.zzb((C3553lt0) interfaceC4009pt0);
            }
        }, mx0Zzb, C3553lt0.class);
        f22523d = AbstractC3893os0.zzb(new InterfaceC3665ms0() { // from class: com.google.android.gms.internal.ads.pr0
            @Override // com.google.android.gms.internal.ads.InterfaceC3665ms0
            public final InterfaceC4009pt0 zza(C5138zo0 c5138zo0, C1976Uo0 c1976Uo0) {
                return AbstractC4232rr0.zzc((Jp0) c5138zo0, c1976Uo0);
            }
        }, Jp0.class, C3439kt0.class);
        f22524e = AbstractC3437ks0.zzb(new InterfaceC3210is0() { // from class: com.google.android.gms.internal.ads.qr0
            @Override // com.google.android.gms.internal.ads.InterfaceC3210is0
            public final C5138zo0 zza(InterfaceC4009pt0 interfaceC4009pt0, C1976Uo0 c1976Uo0) {
                return AbstractC4232rr0.zza((C3439kt0) interfaceC4009pt0, c1976Uo0);
            }
        }, mx0Zzb, C3439kt0.class);
    }

    private static Qp0 a(Tw0 tw0) throws GeneralSecurityException {
        Tw0 tw02 = Tw0.UNKNOWN_PREFIX;
        int iOrdinal = tw0.ordinal();
        if (iOrdinal == 1) {
            return Qp0.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return Qp0.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + tw0.zza());
            }
        }
        return Qp0.zzb;
    }

    private static Tw0 b(Qp0 qp0) throws GeneralSecurityException {
        if (Qp0.zza.equals(qp0)) {
            return Tw0.TINK;
        }
        if (Qp0.zzb.equals(qp0)) {
            return Tw0.CRUNCHY;
        }
        if (Qp0.zzc.equals(qp0)) {
            return Tw0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(qp0)));
    }

    public static /* synthetic */ Jp0 zza(C3439kt0 c3439kt0, C1976Uo0 c1976Uo0) throws GeneralSecurityException {
        if (!c3439kt0.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            Gv0 gv0Zze = Gv0.zze(c3439kt0.zze(), Iy0.zza());
            if (gv0Zze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            Pp0 pp0Zzc = Sp0.zzc();
            pp0Zzc.zzb(gv0Zze.zzf().zzd());
            pp0Zzc.zza(12);
            pp0Zzc.zzc(16);
            pp0Zzc.zzd(a(c3439kt0.zzc()));
            Sp0 sp0Zze = pp0Zzc.zze();
            Hp0 hp0Zza = Jp0.zza();
            hp0Zza.zzc(sp0Zze);
            hp0Zza.zzb(Nx0.zzb(gv0Zze.zzf().zzB(), c1976Uo0));
            hp0Zza.zza(c3439kt0.zzf());
            return hp0Zza.zzd();
        } catch (C4021pz0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static /* synthetic */ Sp0 zzb(C3553lt0 c3553lt0) throws GeneralSecurityException {
        if (!c3553lt0.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(c3553lt0.zzc().zzi())));
        }
        try {
            Jv0 jv0Zzf = Jv0.zzf(c3553lt0.zzc().zzh(), Iy0.zza());
            if (jv0Zzf.zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            Pp0 pp0Zzc = Sp0.zzc();
            pp0Zzc.zzb(jv0Zzf.zza());
            pp0Zzc.zza(12);
            pp0Zzc.zzc(16);
            pp0Zzc.zzd(a(c3553lt0.zzc().zzg()));
            return pp0Zzc.zze();
        } catch (C4021pz0 e8) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e8);
        }
    }

    public static /* synthetic */ C3439kt0 zzc(Jp0 jp0, C1976Uo0 c1976Uo0) {
        Fv0 fv0Zzc = Gv0.zzc();
        byte[] bArrZzd = jp0.zzd().zzd(c1976Uo0);
        fv0Zzc.zza(AbstractC3677my0.zzv(bArrZzd, 0, bArrZzd.length));
        return C3439kt0.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((Gv0) fv0Zzc.zzbr()).zzaN(), EnumC3559lw0.SYMMETRIC, b(jp0.zzb().zzd()), jp0.zze());
    }

    public static /* synthetic */ C3553lt0 zzd(Sp0 sp0) {
        C4129qw0 c4129qw0Zza = C4242rw0.zza();
        c4129qw0Zza.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        Iv0 iv0Zzd = Jv0.zzd();
        iv0Zzd.zza(sp0.zzb());
        c4129qw0Zza.zzc(((Jv0) iv0Zzd.zzbr()).zzaN());
        c4129qw0Zza.zza(b(sp0.zzd()));
        return C3553lt0.zzb((C4242rw0) c4129qw0Zza.zzbr());
    }

    public static void zze(Js0 js0) {
        js0.zzi(f22521b);
        js0.zzh(f22522c);
        js0.zzg(f22523d);
        js0.zzf(f22524e);
    }
}
