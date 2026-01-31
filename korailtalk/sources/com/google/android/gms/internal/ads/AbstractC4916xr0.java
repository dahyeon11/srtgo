package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.xr0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4916xr0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Mx0 f23806a;

    /* renamed from: b, reason: collision with root package name */
    private static final Ss0 f23807b;

    /* renamed from: c, reason: collision with root package name */
    private static final Os0 f23808c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC3893os0 f23809d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC3437ks0 f23810e;
    public static final /* synthetic */ int zza = 0;

    static {
        Mx0 mx0Zzb = At0.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f23806a = mx0Zzb;
        f23807b = Ss0.zzb(new Qs0() { // from class: com.google.android.gms.internal.ads.sr0
            @Override // com.google.android.gms.internal.ads.Qs0
            public final InterfaceC4009pt0 zza(AbstractC1730Oo0 abstractC1730Oo0) {
                return AbstractC4916xr0.zzd((C2977gq0) abstractC1730Oo0);
            }
        }, C2977gq0.class, C3553lt0.class);
        f23808c = Os0.zzb(new Ms0() { // from class: com.google.android.gms.internal.ads.tr0
            @Override // com.google.android.gms.internal.ads.Ms0
            public final AbstractC1730Oo0 zza(InterfaceC4009pt0 interfaceC4009pt0) {
                return AbstractC4916xr0.zzb((C3553lt0) interfaceC4009pt0);
            }
        }, mx0Zzb, C3553lt0.class);
        f23809d = AbstractC3893os0.zzb(new InterfaceC3665ms0() { // from class: com.google.android.gms.internal.ads.ur0
            @Override // com.google.android.gms.internal.ads.InterfaceC3665ms0
            public final InterfaceC4009pt0 zza(C5138zo0 c5138zo0, C1976Uo0 c1976Uo0) {
                return AbstractC4916xr0.zzc((Xp0) c5138zo0, c1976Uo0);
            }
        }, Xp0.class, C3439kt0.class);
        f23810e = AbstractC3437ks0.zzb(new InterfaceC3210is0() { // from class: com.google.android.gms.internal.ads.wr0
            @Override // com.google.android.gms.internal.ads.InterfaceC3210is0
            public final C5138zo0 zza(InterfaceC4009pt0 interfaceC4009pt0, C1976Uo0 c1976Uo0) {
                return AbstractC4916xr0.zza((C3439kt0) interfaceC4009pt0, c1976Uo0);
            }
        }, mx0Zzb, C3439kt0.class);
    }

    private static C2747eq0 a(Tw0 tw0) throws GeneralSecurityException {
        Tw0 tw02 = Tw0.UNKNOWN_PREFIX;
        int iOrdinal = tw0.ordinal();
        if (iOrdinal == 1) {
            return C2747eq0.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C2747eq0.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + tw0.zza());
            }
        }
        return C2747eq0.zzb;
    }

    private static Tw0 b(C2747eq0 c2747eq0) throws GeneralSecurityException {
        if (C2747eq0.zza.equals(c2747eq0)) {
            return Tw0.TINK;
        }
        if (C2747eq0.zzb.equals(c2747eq0)) {
            return Tw0.CRUNCHY;
        }
        if (C2747eq0.zzc.equals(c2747eq0)) {
            return Tw0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c2747eq0)));
    }

    public static /* synthetic */ Xp0 zza(C3439kt0 c3439kt0, C1976Uo0 c1976Uo0) throws GeneralSecurityException {
        if (!c3439kt0.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            Mv0 mv0Zze = Mv0.zze(c3439kt0.zze(), Iy0.zza());
            if (mv0Zze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C2632dq0 c2632dq0Zzc = C2977gq0.zzc();
            c2632dq0Zzc.zza(mv0Zze.zzf().zzd());
            c2632dq0Zzc.zzb(a(c3439kt0.zzc()));
            C2977gq0 c2977gq0Zzc = c2632dq0Zzc.zzc();
            Vp0 vp0Zza = Xp0.zza();
            vp0Zza.zzc(c2977gq0Zzc);
            vp0Zza.zzb(Nx0.zzb(mv0Zze.zzf().zzB(), c1976Uo0));
            vp0Zza.zza(c3439kt0.zzf());
            return vp0Zza.zzd();
        } catch (C4021pz0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static /* synthetic */ C2977gq0 zzb(C3553lt0 c3553lt0) throws GeneralSecurityException {
        if (!c3553lt0.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(c3553lt0.zzc().zzi())));
        }
        try {
            Pv0 pv0Zzf = Pv0.zzf(c3553lt0.zzc().zzh(), Iy0.zza());
            if (pv0Zzf.zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            C2632dq0 c2632dq0Zzc = C2977gq0.zzc();
            c2632dq0Zzc.zza(pv0Zzf.zza());
            c2632dq0Zzc.zzb(a(c3553lt0.zzc().zzg()));
            return c2632dq0Zzc.zzc();
        } catch (C4021pz0 e8) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e8);
        }
    }

    public static /* synthetic */ C3439kt0 zzc(Xp0 xp0, C1976Uo0 c1976Uo0) {
        Lv0 lv0Zzc = Mv0.zzc();
        byte[] bArrZzd = xp0.zzd().zzd(c1976Uo0);
        lv0Zzc.zza(AbstractC3677my0.zzv(bArrZzd, 0, bArrZzd.length));
        return C3439kt0.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((Mv0) lv0Zzc.zzbr()).zzaN(), EnumC3559lw0.SYMMETRIC, b(xp0.zzb().zzd()), xp0.zze());
    }

    public static /* synthetic */ C3553lt0 zzd(C2977gq0 c2977gq0) {
        C4129qw0 c4129qw0Zza = C4242rw0.zza();
        c4129qw0Zza.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        Ov0 ov0Zzd = Pv0.zzd();
        ov0Zzd.zza(c2977gq0.zzb());
        c4129qw0Zza.zzc(((Pv0) ov0Zzd.zzbr()).zzaN());
        c4129qw0Zza.zza(b(c2977gq0.zzd()));
        return C3553lt0.zzb((C4242rw0) c4129qw0Zza.zzbr());
    }

    public static void zze(Js0 js0) {
        js0.zzi(f23807b);
        js0.zzh(f23808c);
        js0.zzg(f23809d);
        js0.zzf(f23810e);
    }
}
