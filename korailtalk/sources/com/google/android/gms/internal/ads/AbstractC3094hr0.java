package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.hr0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3094hr0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Mx0 f19850a;

    /* renamed from: b, reason: collision with root package name */
    private static final Ss0 f19851b;

    /* renamed from: c, reason: collision with root package name */
    private static final Os0 f19852c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC3893os0 f19853d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC3437ks0 f19854e;
    public static final /* synthetic */ int zza = 0;

    static {
        Mx0 mx0Zzb = At0.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f19850a = mx0Zzb;
        f19851b = Ss0.zzb(new Qs0() { // from class: com.google.android.gms.internal.ads.dr0
            @Override // com.google.android.gms.internal.ads.Qs0
            public final InterfaceC4009pt0 zza(AbstractC1730Oo0 abstractC1730Oo0) {
                return AbstractC3094hr0.zzd((C4456tp0) abstractC1730Oo0);
            }
        }, C4456tp0.class, C3553lt0.class);
        f19852c = Os0.zzb(new Ms0() { // from class: com.google.android.gms.internal.ads.er0
            @Override // com.google.android.gms.internal.ads.Ms0
            public final AbstractC1730Oo0 zza(InterfaceC4009pt0 interfaceC4009pt0) {
                return AbstractC3094hr0.zzb((C3553lt0) interfaceC4009pt0);
            }
        }, mx0Zzb, C3553lt0.class);
        f19853d = AbstractC3893os0.zzb(new InterfaceC3665ms0() { // from class: com.google.android.gms.internal.ads.fr0
            @Override // com.google.android.gms.internal.ads.InterfaceC3665ms0
            public final InterfaceC4009pt0 zza(C5138zo0 c5138zo0, C1976Uo0 c1976Uo0) {
                return AbstractC3094hr0.zzc((C3204ip0) c5138zo0, c1976Uo0);
            }
        }, C3204ip0.class, C3439kt0.class);
        f19854e = AbstractC3437ks0.zzb(new InterfaceC3210is0() { // from class: com.google.android.gms.internal.ads.gr0
            @Override // com.google.android.gms.internal.ads.InterfaceC3210is0
            public final C5138zo0 zza(InterfaceC4009pt0 interfaceC4009pt0, C1976Uo0 c1976Uo0) {
                return AbstractC3094hr0.zza((C3439kt0) interfaceC4009pt0, c1976Uo0);
            }
        }, mx0Zzb, C3439kt0.class);
    }

    private static C4001pp0 a(Xv0 xv0) throws GeneralSecurityException {
        Xv0 xv02 = Xv0.UNKNOWN_HASH;
        Tw0 tw0 = Tw0.UNKNOWN_PREFIX;
        int iOrdinal = xv0.ordinal();
        if (iOrdinal == 1) {
            return C4001pp0.zza;
        }
        if (iOrdinal == 2) {
            return C4001pp0.zzd;
        }
        if (iOrdinal == 3) {
            return C4001pp0.zzc;
        }
        if (iOrdinal == 4) {
            return C4001pp0.zze;
        }
        if (iOrdinal == 5) {
            return C4001pp0.zzb;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + xv0.zza());
    }

    private static C4115qp0 b(Tw0 tw0) throws GeneralSecurityException {
        Xv0 xv0 = Xv0.UNKNOWN_HASH;
        Tw0 tw02 = Tw0.UNKNOWN_PREFIX;
        int iOrdinal = tw0.ordinal();
        if (iOrdinal == 1) {
            return C4115qp0.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C4115qp0.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + tw0.zza());
            }
        }
        return C4115qp0.zzb;
    }

    private static C3104hw0 c(C4456tp0 c4456tp0) throws GeneralSecurityException {
        Xv0 xv0;
        C2989gw0 c2989gw0Zzd = C3104hw0.zzd();
        c2989gw0Zzd.zzb(c4456tp0.zze());
        C4001pp0 c4001pp0Zzg = c4456tp0.zzg();
        if (C4001pp0.zza.equals(c4001pp0Zzg)) {
            xv0 = Xv0.SHA1;
        } else if (C4001pp0.zzb.equals(c4001pp0Zzg)) {
            xv0 = Xv0.SHA224;
        } else if (C4001pp0.zzc.equals(c4001pp0Zzg)) {
            xv0 = Xv0.SHA256;
        } else if (C4001pp0.zzd.equals(c4001pp0Zzg)) {
            xv0 = Xv0.SHA384;
        } else {
            if (!C4001pp0.zze.equals(c4001pp0Zzg)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(c4001pp0Zzg)));
            }
            xv0 = Xv0.SHA512;
        }
        c2989gw0Zzd.zza(xv0);
        return (C3104hw0) c2989gw0Zzd.zzbr();
    }

    private static Tw0 d(C4115qp0 c4115qp0) throws GeneralSecurityException {
        if (C4115qp0.zza.equals(c4115qp0)) {
            return Tw0.TINK;
        }
        if (C4115qp0.zzb.equals(c4115qp0)) {
            return Tw0.CRUNCHY;
        }
        if (C4115qp0.zzc.equals(c4115qp0)) {
            return Tw0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c4115qp0)));
    }

    public static /* synthetic */ C3204ip0 zza(C3439kt0 c3439kt0, C1976Uo0 c1976Uo0) throws GeneralSecurityException {
        if (!c3439kt0.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            C3102hv0 c3102hv0Zze = C3102hv0.zze(c3439kt0.zze(), Iy0.zza());
            if (c3102hv0Zze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (c3102hv0Zze.zzf().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (c3102hv0Zze.zzg().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            C3887op0 c3887op0Zzf = C4456tp0.zzf();
            c3887op0Zzf.zza(c3102hv0Zze.zzf().zzg().zzd());
            c3887op0Zzf.zzc(c3102hv0Zze.zzg().zzh().zzd());
            c3887op0Zzf.zzd(c3102hv0Zze.zzf().zzf().zza());
            c3887op0Zzf.zze(c3102hv0Zze.zzg().zzg().zza());
            c3887op0Zzf.zzb(a(c3102hv0Zze.zzg().zzg().zzc()));
            c3887op0Zzf.zzf(b(c3439kt0.zzc()));
            C4456tp0 c4456tp0Zzg = c3887op0Zzf.zzg();
            C2975gp0 c2975gp0Zza = C3204ip0.zza();
            c2975gp0Zza.zzd(c4456tp0Zzg);
            c2975gp0Zza.zza(Nx0.zzb(c3102hv0Zze.zzf().zzg().zzB(), c1976Uo0));
            c2975gp0Zza.zzb(Nx0.zzb(c3102hv0Zze.zzg().zzh().zzB(), c1976Uo0));
            c2975gp0Zza.zzc(c3439kt0.zzf());
            return c2975gp0Zza.zze();
        } catch (C4021pz0 unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static /* synthetic */ C4456tp0 zzb(C3553lt0 c3553lt0) throws GeneralSecurityException {
        if (!c3553lt0.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c3553lt0.zzc().zzi())));
        }
        try {
            C3443kv0 c3443kv0Zzd = C3443kv0.zzd(c3553lt0.zzc().zzh(), Iy0.zza());
            if (c3443kv0Zzd.zzf().zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C3887op0 c3887op0Zzf = C4456tp0.zzf();
            c3887op0Zzf.zza(c3443kv0Zzd.zze().zza());
            c3887op0Zzf.zzc(c3443kv0Zzd.zzf().zza());
            c3887op0Zzf.zzd(c3443kv0Zzd.zze().zzf().zza());
            c3887op0Zzf.zze(c3443kv0Zzd.zzf().zzh().zza());
            c3887op0Zzf.zzb(a(c3443kv0Zzd.zzf().zzh().zzc()));
            c3887op0Zzf.zzf(b(c3553lt0.zzc().zzg()));
            return c3887op0Zzf.zzg();
        } catch (C4021pz0 e8) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e8);
        }
    }

    public static /* synthetic */ C3439kt0 zzc(C3204ip0 c3204ip0, C1976Uo0 c1976Uo0) {
        C2987gv0 c2987gv0Zzc = C3102hv0.zzc();
        C3671mv0 c3671mv0Zzc = C3785nv0.zzc();
        C4354sv0 c4354sv0Zzc = C4468tv0.zzc();
        c4354sv0Zzc.zza(c3204ip0.zzb().zzd());
        c3671mv0Zzc.zzb((C4468tv0) c4354sv0Zzc.zzbr());
        byte[] bArrZzd = c3204ip0.zzd().zzd(c1976Uo0);
        c3671mv0Zzc.zza(AbstractC3677my0.zzv(bArrZzd, 0, bArrZzd.length));
        c2987gv0Zzc.zza((C3785nv0) c3671mv0Zzc.zzbr());
        Zv0 zv0Zzc = C2301aw0.zzc();
        zv0Zzc.zzb(c(c3204ip0.zzb()));
        byte[] bArrZzd2 = c3204ip0.zze().zzd(c1976Uo0);
        zv0Zzc.zza(AbstractC3677my0.zzv(bArrZzd2, 0, bArrZzd2.length));
        c2987gv0Zzc.zzb((C2301aw0) zv0Zzc.zzbr());
        return C3439kt0.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((C3102hv0) c2987gv0Zzc.zzbr()).zzaN(), EnumC3559lw0.SYMMETRIC, d(c3204ip0.zzb().zzh()), c3204ip0.zzf());
    }

    public static /* synthetic */ C3553lt0 zzd(C4456tp0 c4456tp0) {
        C4129qw0 c4129qw0Zza = C4242rw0.zza();
        c4129qw0Zza.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        C3329jv0 c3329jv0Zza = C3443kv0.zza();
        C4013pv0 c4013pv0Zzc = C4127qv0.zzc();
        C4354sv0 c4354sv0Zzc = C4468tv0.zzc();
        c4354sv0Zzc.zza(c4456tp0.zzd());
        c4013pv0Zzc.zzb((C4468tv0) c4354sv0Zzc.zzbr());
        c4013pv0Zzc.zza(c4456tp0.zzb());
        c3329jv0Zza.zza((C4127qv0) c4013pv0Zzc.zzbr());
        C2530cw0 c2530cw0Zzd = C2644dw0.zzd();
        c2530cw0Zzd.zzb(c(c4456tp0));
        c2530cw0Zzd.zza(c4456tp0.zzc());
        c3329jv0Zza.zzb((C2644dw0) c2530cw0Zzd.zzbr());
        c4129qw0Zza.zzc(((C3443kv0) c3329jv0Zza.zzbr()).zzaN());
        c4129qw0Zza.zza(d(c4456tp0.zzh()));
        return C3553lt0.zzb((C4242rw0) c4129qw0Zza.zzbr());
    }

    public static void zze(Js0 js0) {
        js0.zzi(f19851b);
        js0.zzh(f19852c);
        js0.zzg(f19853d);
        js0.zzf(f19854e);
    }
}
