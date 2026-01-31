package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.mr0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3663mr0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Mx0 f20998a;

    /* renamed from: b, reason: collision with root package name */
    private static final Ss0 f20999b;

    /* renamed from: c, reason: collision with root package name */
    private static final Os0 f21000c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC3893os0 f21001d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC3437ks0 f21002e;
    public static final /* synthetic */ int zza = 0;

    static {
        Mx0 mx0Zzb = At0.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f20998a = mx0Zzb;
        f20999b = Ss0.zzb(new Qs0() { // from class: com.google.android.gms.internal.ads.ir0
            @Override // com.google.android.gms.internal.ads.Qs0
            public final InterfaceC4009pt0 zza(AbstractC1730Oo0 abstractC1730Oo0) {
                return AbstractC3663mr0.zzd((Fp0) abstractC1730Oo0);
            }
        }, Fp0.class, C3553lt0.class);
        f21000c = Os0.zzb(new Ms0() { // from class: com.google.android.gms.internal.ads.jr0
            @Override // com.google.android.gms.internal.ads.Ms0
            public final AbstractC1730Oo0 zza(InterfaceC4009pt0 interfaceC4009pt0) {
                return AbstractC3663mr0.zzb((C3553lt0) interfaceC4009pt0);
            }
        }, mx0Zzb, C3553lt0.class);
        f21001d = AbstractC3893os0.zzb(new InterfaceC3665ms0() { // from class: com.google.android.gms.internal.ads.kr0
            @Override // com.google.android.gms.internal.ads.InterfaceC3665ms0
            public final InterfaceC4009pt0 zza(C5138zo0 c5138zo0, C1976Uo0 c1976Uo0) {
                return AbstractC3663mr0.zzc((C4912xp0) c5138zo0, c1976Uo0);
            }
        }, C4912xp0.class, C3439kt0.class);
        f21002e = AbstractC3437ks0.zzb(new InterfaceC3210is0() { // from class: com.google.android.gms.internal.ads.lr0
            @Override // com.google.android.gms.internal.ads.InterfaceC3210is0
            public final C5138zo0 zza(InterfaceC4009pt0 interfaceC4009pt0, C1976Uo0 c1976Uo0) {
                return AbstractC3663mr0.zza((C3439kt0) interfaceC4009pt0, c1976Uo0);
            }
        }, mx0Zzb, C3439kt0.class);
    }

    private static Dp0 a(Tw0 tw0) throws GeneralSecurityException {
        Tw0 tw02 = Tw0.UNKNOWN_PREFIX;
        int iOrdinal = tw0.ordinal();
        if (iOrdinal == 1) {
            return Dp0.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return Dp0.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + tw0.zza());
            }
        }
        return Dp0.zzb;
    }

    private static Cv0 b(Fp0 fp0) {
        Bv0 bv0Zzc = Cv0.zzc();
        bv0Zzc.zza(fp0.zzb());
        return (Cv0) bv0Zzc.zzbr();
    }

    private static Tw0 c(Dp0 dp0) throws GeneralSecurityException {
        if (Dp0.zza.equals(dp0)) {
            return Tw0.TINK;
        }
        if (Dp0.zzb.equals(dp0)) {
            return Tw0.CRUNCHY;
        }
        if (Dp0.zzc.equals(dp0)) {
            return Tw0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(dp0)));
    }

    public static /* synthetic */ C4912xp0 zza(C3439kt0 c3439kt0, C1976Uo0 c1976Uo0) throws GeneralSecurityException {
        if (!c3439kt0.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            C4810wv0 c4810wv0Zze = C4810wv0.zze(c3439kt0.zze(), Iy0.zza());
            if (c4810wv0Zze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            Cp0 cp0Zzd = Fp0.zzd();
            cp0Zzd.zzb(c4810wv0Zze.zzg().zzd());
            cp0Zzd.zza(c4810wv0Zze.zzf().zza());
            cp0Zzd.zzc(16);
            cp0Zzd.zzd(a(c3439kt0.zzc()));
            Fp0 fp0Zze = cp0Zzd.zze();
            C4684vp0 c4684vp0Zza = C4912xp0.zza();
            c4684vp0Zza.zzc(fp0Zze);
            c4684vp0Zza.zzb(Nx0.zzb(c4810wv0Zze.zzg().zzB(), c1976Uo0));
            c4684vp0Zza.zza(c3439kt0.zzf());
            return c4684vp0Zza.zzd();
        } catch (C4021pz0 unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static /* synthetic */ Fp0 zzb(C3553lt0 c3553lt0) throws GeneralSecurityException {
        if (!c3553lt0.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(c3553lt0.zzc().zzi())));
        }
        try {
            C5152zv0 c5152zv0Zze = C5152zv0.zze(c3553lt0.zzc().zzh(), Iy0.zza());
            Cp0 cp0Zzd = Fp0.zzd();
            cp0Zzd.zzb(c5152zv0Zze.zza());
            cp0Zzd.zza(c5152zv0Zze.zzf().zza());
            cp0Zzd.zzc(16);
            cp0Zzd.zzd(a(c3553lt0.zzc().zzg()));
            return cp0Zzd.zze();
        } catch (C4021pz0 e8) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e8);
        }
    }

    public static /* synthetic */ C3439kt0 zzc(C4912xp0 c4912xp0, C1976Uo0 c1976Uo0) {
        C4696vv0 c4696vv0Zzc = C4810wv0.zzc();
        c4696vv0Zzc.zzb(b(c4912xp0.zzb()));
        byte[] bArrZzd = c4912xp0.zzd().zzd(c1976Uo0);
        c4696vv0Zzc.zza(AbstractC3677my0.zzv(bArrZzd, 0, bArrZzd.length));
        return C3439kt0.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((C4810wv0) c4696vv0Zzc.zzbr()).zzaN(), EnumC3559lw0.SYMMETRIC, c(c4912xp0.zzb().zze()), c4912xp0.zze());
    }

    public static /* synthetic */ C3553lt0 zzd(Fp0 fp0) {
        C4129qw0 c4129qw0Zza = C4242rw0.zza();
        c4129qw0Zza.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        C5038yv0 c5038yv0Zzc = C5152zv0.zzc();
        c5038yv0Zzc.zzb(b(fp0));
        c5038yv0Zzc.zza(fp0.zzc());
        c4129qw0Zza.zzc(((C5152zv0) c5038yv0Zzc.zzbr()).zzaN());
        c4129qw0Zza.zza(c(fp0.zze()));
        return C3553lt0.zzb((C4242rw0) c4129qw0Zza.zzbr());
    }

    public static void zze(Js0 js0) {
        js0.zzi(f20999b);
        js0.zzh(f21000c);
        js0.zzg(f21001d);
        js0.zzf(f21002e);
    }
}
