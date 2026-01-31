package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.zu0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5150zu0 {

    /* renamed from: a */
    private static final Mx0 f24215a;

    /* renamed from: b */
    private static final Ss0 f24216b;

    /* renamed from: c */
    private static final Os0 f24217c;

    /* renamed from: d */
    private static final AbstractC3893os0 f24218d;

    /* renamed from: e */
    private static final AbstractC3437ks0 f24219e;
    public static final /* synthetic */ int zza = 0;

    static {
        Mx0 mx0Zzb = At0.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f24215a = mx0Zzb;
        f24216b = Ss0.zzb(new Qs0() { // from class: com.google.android.gms.internal.ads.vu0
            @Override // com.google.android.gms.internal.ads.Qs0
            public final InterfaceC4009pt0 zza(AbstractC1730Oo0 abstractC1730Oo0) {
                return AbstractC5150zu0.zzb((Nt0) abstractC1730Oo0);
            }
        }, Nt0.class, C3553lt0.class);
        f24217c = Os0.zzb(new Ms0() { // from class: com.google.android.gms.internal.ads.wu0
            @Override // com.google.android.gms.internal.ads.Ms0
            public final AbstractC1730Oo0 zza(InterfaceC4009pt0 interfaceC4009pt0) {
                return AbstractC5150zu0.zzd((C3553lt0) interfaceC4009pt0);
            }
        }, mx0Zzb, C3553lt0.class);
        f24218d = AbstractC3893os0.zzb(new InterfaceC3665ms0() { // from class: com.google.android.gms.internal.ads.xu0
            @Override // com.google.android.gms.internal.ads.InterfaceC3665ms0
            public final InterfaceC4009pt0 zza(C5138zo0 c5138zo0, C1976Uo0 c1976Uo0) {
                return AbstractC5150zu0.zza((Et0) c5138zo0, c1976Uo0);
            }
        }, Et0.class, C3439kt0.class);
        f24219e = AbstractC3437ks0.zzb(new InterfaceC3210is0() { // from class: com.google.android.gms.internal.ads.yu0
            @Override // com.google.android.gms.internal.ads.InterfaceC3210is0
            public final C5138zo0 zza(InterfaceC4009pt0 interfaceC4009pt0, C1976Uo0 c1976Uo0) {
                return AbstractC5150zu0.zzc((C3439kt0) interfaceC4009pt0, c1976Uo0);
            }
        }, mx0Zzb, C3439kt0.class);
    }

    private static Lt0 a(Tw0 tw0) throws GeneralSecurityException {
        Tw0 tw02 = Tw0.UNKNOWN_PREFIX;
        int iOrdinal = tw0.ordinal();
        if (iOrdinal == 1) {
            return Lt0.zza;
        }
        if (iOrdinal == 2) {
            return Lt0.zzc;
        }
        if (iOrdinal == 3) {
            return Lt0.zzd;
        }
        if (iOrdinal == 4) {
            return Lt0.zzb;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + tw0.zza());
    }

    private static C2757ev0 b(Nt0 nt0) {
        C2642dv0 c2642dv0Zzc = C2757ev0.zzc();
        c2642dv0Zzc.zza(nt0.zzb());
        return (C2757ev0) c2642dv0Zzc.zzbr();
    }

    private static Tw0 c(Lt0 lt0) throws GeneralSecurityException {
        if (Lt0.zza.equals(lt0)) {
            return Tw0.TINK;
        }
        if (Lt0.zzb.equals(lt0)) {
            return Tw0.CRUNCHY;
        }
        if (Lt0.zzd.equals(lt0)) {
            return Tw0.RAW;
        }
        if (Lt0.zzc.equals(lt0)) {
            return Tw0.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(lt0)));
    }

    public static /* synthetic */ C3439kt0 zza(Et0 et0, C1976Uo0 c1976Uo0) {
        Wu0 wu0Zzc = Xu0.zzc();
        wu0Zzc.zzb(b(et0.zzb()));
        byte[] bArrZzd = et0.zzd().zzd(c1976Uo0);
        wu0Zzc.zza(AbstractC3677my0.zzv(bArrZzd, 0, bArrZzd.length));
        return C3439kt0.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((Xu0) wu0Zzc.zzbr()).zzaN(), EnumC3559lw0.SYMMETRIC, c(et0.zzb().zzf()), et0.zze());
    }

    public static /* synthetic */ C3553lt0 zzb(Nt0 nt0) {
        C4129qw0 c4129qw0Zza = C4242rw0.zza();
        c4129qw0Zza.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        Zu0 zu0Zzc = C2299av0.zzc();
        zu0Zzc.zzb(b(nt0));
        zu0Zzc.zza(nt0.zzc());
        c4129qw0Zza.zzc(((C2299av0) zu0Zzc.zzbr()).zzaN());
        c4129qw0Zza.zza(c(nt0.zzf()));
        return C3553lt0.zzb((C4242rw0) c4129qw0Zza.zzbr());
    }

    public static /* synthetic */ Et0 zzc(C3439kt0 c3439kt0, C1976Uo0 c1976Uo0) throws GeneralSecurityException {
        if (!c3439kt0.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            Xu0 xu0Zze = Xu0.zze(c3439kt0.zze(), Iy0.zza());
            if (xu0Zze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            Kt0 kt0Zze = Nt0.zze();
            kt0Zze.zza(xu0Zze.zzg().zzd());
            kt0Zze.zzb(xu0Zze.zzf().zza());
            kt0Zze.zzc(a(c3439kt0.zzc()));
            Nt0 nt0Zzd = kt0Zze.zzd();
            Ct0 ct0Zza = Et0.zza();
            ct0Zza.zzc(nt0Zzd);
            ct0Zza.zza(Nx0.zzb(xu0Zze.zzg().zzB(), c1976Uo0));
            ct0Zza.zzb(c3439kt0.zzf());
            return ct0Zza.zzd();
        } catch (C4021pz0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static /* synthetic */ Nt0 zzd(C3553lt0 c3553lt0) throws GeneralSecurityException {
        if (!c3553lt0.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(c3553lt0.zzc().zzi())));
        }
        try {
            C2299av0 c2299av0Zze = C2299av0.zze(c3553lt0.zzc().zzh(), Iy0.zza());
            Kt0 kt0Zze = Nt0.zze();
            kt0Zze.zza(c2299av0Zze.zza());
            kt0Zze.zzb(c2299av0Zze.zzf().zza());
            kt0Zze.zzc(a(c3553lt0.zzc().zzg()));
            return kt0Zze.zzd();
        } catch (C4021pz0 e8) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e8);
        }
    }

    public static void zze(Js0 js0) {
        js0.zzi(f24216b);
        js0.zzh(f24217c);
        js0.zzg(f24218d);
        js0.zzf(f24219e);
    }
}
