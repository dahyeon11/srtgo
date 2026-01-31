package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class Vr0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Mx0 f16900a;

    /* renamed from: b, reason: collision with root package name */
    private static final Ss0 f16901b;

    /* renamed from: c, reason: collision with root package name */
    private static final Os0 f16902c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC3893os0 f16903d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC3437ks0 f16904e;
    public static final /* synthetic */ int zza = 0;

    static {
        Mx0 mx0Zzb = At0.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f16900a = mx0Zzb;
        f16901b = Ss0.zzb(new Qs0() { // from class: com.google.android.gms.internal.ads.Rr0
            @Override // com.google.android.gms.internal.ads.Qs0
            public final InterfaceC4009pt0 zza(AbstractC1730Oo0 abstractC1730Oo0) {
                return Vr0.zzd((C2520cr0) abstractC1730Oo0);
            }
        }, C2520cr0.class, C3553lt0.class);
        f16902c = Os0.zzb(new Ms0() { // from class: com.google.android.gms.internal.ads.Sr0
            @Override // com.google.android.gms.internal.ads.Ms0
            public final AbstractC1730Oo0 zza(InterfaceC4009pt0 interfaceC4009pt0) {
                return Vr0.zzb((C3553lt0) interfaceC4009pt0);
            }
        }, mx0Zzb, C3553lt0.class);
        f16903d = AbstractC3893os0.zzb(new InterfaceC3665ms0() { // from class: com.google.android.gms.internal.ads.Tr0
            @Override // com.google.android.gms.internal.ads.InterfaceC3665ms0
            public final InterfaceC4009pt0 zza(C5138zo0 c5138zo0, C1976Uo0 c1976Uo0) {
                return Vr0.zzc((Wq0) c5138zo0, c1976Uo0);
            }
        }, Wq0.class, C3439kt0.class);
        f16904e = AbstractC3437ks0.zzb(new InterfaceC3210is0() { // from class: com.google.android.gms.internal.ads.Ur0
            @Override // com.google.android.gms.internal.ads.InterfaceC3210is0
            public final C5138zo0 zza(InterfaceC4009pt0 interfaceC4009pt0, C1976Uo0 c1976Uo0) {
                return Vr0.zza((C3439kt0) interfaceC4009pt0, c1976Uo0);
            }
        }, mx0Zzb, C3439kt0.class);
    }

    private static C2406br0 a(Tw0 tw0) throws GeneralSecurityException {
        Tw0 tw02 = Tw0.UNKNOWN_PREFIX;
        int iOrdinal = tw0.ordinal();
        if (iOrdinal == 1) {
            return C2406br0.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C2406br0.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + tw0.zza());
            }
        }
        return C2406br0.zzb;
    }

    private static Tw0 b(C2406br0 c2406br0) throws GeneralSecurityException {
        if (C2406br0.zza.equals(c2406br0)) {
            return Tw0.TINK;
        }
        if (C2406br0.zzb.equals(c2406br0)) {
            return Tw0.CRUNCHY;
        }
        if (C2406br0.zzc.equals(c2406br0)) {
            return Tw0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c2406br0.toString()));
    }

    public static /* synthetic */ Wq0 zza(C3439kt0 c3439kt0, C1976Uo0 c1976Uo0) throws GeneralSecurityException {
        if (!c3439kt0.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            Zw0 zw0Zze = Zw0.zze(c3439kt0.zze(), Iy0.zza());
            if (zw0Zze.zza() == 0) {
                return Wq0.zza(a(c3439kt0.zzc()), Nx0.zzb(zw0Zze.zzf().zzB(), c1976Uo0), c3439kt0.zzf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (C4021pz0 unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ C2520cr0 zzb(C3553lt0 c3553lt0) throws GeneralSecurityException {
        if (!c3553lt0.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(c3553lt0.zzc().zzi())));
        }
        try {
            if (C2532cx0.zze(c3553lt0.zzc().zzh(), Iy0.zza()).zza() == 0) {
                return C2520cr0.zzc(a(c3553lt0.zzc().zzg()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (C4021pz0 e8) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e8);
        }
    }

    public static /* synthetic */ C3439kt0 zzc(Wq0 wq0, C1976Uo0 c1976Uo0) {
        Yw0 yw0Zzc = Zw0.zzc();
        byte[] bArrZzd = wq0.zzd().zzd(c1976Uo0);
        yw0Zzc.zza(AbstractC3677my0.zzv(bArrZzd, 0, bArrZzd.length));
        return C3439kt0.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((Zw0) yw0Zzc.zzbr()).zzaN(), EnumC3559lw0.SYMMETRIC, b(wq0.zzb().zzb()), wq0.zze());
    }

    public static /* synthetic */ C3553lt0 zzd(C2520cr0 c2520cr0) {
        C4129qw0 c4129qw0Zza = C4242rw0.zza();
        c4129qw0Zza.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        c4129qw0Zza.zzc(C2532cx0.zzd().zzaN());
        c4129qw0Zza.zza(b(c2520cr0.zzb()));
        return C3553lt0.zzb((C4242rw0) c4129qw0Zza.zzbr());
    }

    public static void zze(Js0 js0) {
        js0.zzi(f16901b);
        js0.zzh(f16902c);
        js0.zzg(f16903d);
        js0.zzf(f16904e);
    }
}
