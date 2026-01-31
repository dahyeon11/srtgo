package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class Er0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Mx0 f12866a;

    /* renamed from: b, reason: collision with root package name */
    private static final Ss0 f12867b;

    /* renamed from: c, reason: collision with root package name */
    private static final Os0 f12868c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC3893os0 f12869d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC3437ks0 f12870e;
    public static final /* synthetic */ int zza = 0;

    static {
        Mx0 mx0Zzb = At0.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f12866a = mx0Zzb;
        f12867b = Ss0.zzb(new Qs0() { // from class: com.google.android.gms.internal.ads.Ar0
            @Override // com.google.android.gms.internal.ads.Qs0
            public final InterfaceC4009pt0 zza(AbstractC1730Oo0 abstractC1730Oo0) {
                return Er0.zzd((C3661mq0) abstractC1730Oo0);
            }
        }, C3661mq0.class, C3553lt0.class);
        f12868c = Os0.zzb(new Ms0() { // from class: com.google.android.gms.internal.ads.Br0
            @Override // com.google.android.gms.internal.ads.Ms0
            public final AbstractC1730Oo0 zza(InterfaceC4009pt0 interfaceC4009pt0) {
                return Er0.zzb((C3553lt0) interfaceC4009pt0);
            }
        }, mx0Zzb, C3553lt0.class);
        f12869d = AbstractC3893os0.zzb(new InterfaceC3665ms0() { // from class: com.google.android.gms.internal.ads.Cr0
            @Override // com.google.android.gms.internal.ads.InterfaceC3665ms0
            public final InterfaceC4009pt0 zza(C5138zo0 c5138zo0, C1976Uo0 c1976Uo0) {
                return Er0.zzc((C3092hq0) c5138zo0, c1976Uo0);
            }
        }, C3092hq0.class, C3439kt0.class);
        f12870e = AbstractC3437ks0.zzb(new InterfaceC3210is0() { // from class: com.google.android.gms.internal.ads.Dr0
            @Override // com.google.android.gms.internal.ads.InterfaceC3210is0
            public final C5138zo0 zza(InterfaceC4009pt0 interfaceC4009pt0, C1976Uo0 c1976Uo0) {
                return Er0.zza((C3439kt0) interfaceC4009pt0, c1976Uo0);
            }
        }, mx0Zzb, C3439kt0.class);
    }

    private static C3547lq0 a(Tw0 tw0) throws GeneralSecurityException {
        Tw0 tw02 = Tw0.UNKNOWN_PREFIX;
        int iOrdinal = tw0.ordinal();
        if (iOrdinal == 1) {
            return C3547lq0.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C3547lq0.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + tw0.zza());
            }
        }
        return C3547lq0.zzb;
    }

    private static Tw0 b(C3547lq0 c3547lq0) throws GeneralSecurityException {
        if (C3547lq0.zza.equals(c3547lq0)) {
            return Tw0.TINK;
        }
        if (C3547lq0.zzb.equals(c3547lq0)) {
            return Tw0.CRUNCHY;
        }
        if (C3547lq0.zzc.equals(c3547lq0)) {
            return Tw0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c3547lq0.toString()));
    }

    public static /* synthetic */ C3092hq0 zza(C3439kt0 c3439kt0, C1976Uo0 c1976Uo0) throws GeneralSecurityException {
        if (!c3439kt0.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            Sv0 sv0Zze = Sv0.zze(c3439kt0.zze(), Iy0.zza());
            if (sv0Zze.zza() == 0) {
                return C3092hq0.zza(a(c3439kt0.zzc()), Nx0.zzb(sv0Zze.zzf().zzB(), c1976Uo0), c3439kt0.zzf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (C4021pz0 unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ C3661mq0 zzb(C3553lt0 c3553lt0) throws GeneralSecurityException {
        if (!c3553lt0.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(c3553lt0.zzc().zzi())));
        }
        try {
            Vv0.zzd(c3553lt0.zzc().zzh(), Iy0.zza());
            return C3661mq0.zzc(a(c3553lt0.zzc().zzg()));
        } catch (C4021pz0 e8) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e8);
        }
    }

    public static /* synthetic */ C3439kt0 zzc(C3092hq0 c3092hq0, C1976Uo0 c1976Uo0) {
        Rv0 rv0Zzc = Sv0.zzc();
        byte[] bArrZzd = c3092hq0.zzd().zzd(c1976Uo0);
        rv0Zzc.zza(AbstractC3677my0.zzv(bArrZzd, 0, bArrZzd.length));
        return C3439kt0.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((Sv0) rv0Zzc.zzbr()).zzaN(), EnumC3559lw0.SYMMETRIC, b(c3092hq0.zzb().zzb()), c3092hq0.zze());
    }

    public static /* synthetic */ C3553lt0 zzd(C3661mq0 c3661mq0) {
        C4129qw0 c4129qw0Zza = C4242rw0.zza();
        c4129qw0Zza.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        c4129qw0Zza.zzc(Vv0.zzc().zzaN());
        c4129qw0Zza.zza(b(c3661mq0.zzb()));
        return C3553lt0.zzb((C4242rw0) c4129qw0Zza.zzbr());
    }

    public static void zze(Js0 js0) {
        js0.zzi(f12867b);
        js0.zzh(f12868c);
        js0.zzg(f12869d);
        js0.zzf(f12870e);
    }
}
