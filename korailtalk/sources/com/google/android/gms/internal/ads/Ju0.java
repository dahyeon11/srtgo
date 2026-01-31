package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class Ju0 implements InterfaceC1689No0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1689No0 f13703a;

    /* renamed from: b, reason: collision with root package name */
    private final Tw0 f13704b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f13705c;

    private Ju0(InterfaceC1689No0 interfaceC1689No0, Tw0 tw0, byte[] bArr) {
        this.f13703a = interfaceC1689No0;
        this.f13704b = tw0;
        this.f13705c = bArr;
    }

    public static InterfaceC1689No0 zza(C4234rs0 c4234rs0) throws GeneralSecurityException {
        byte[] bArrZzc;
        C3439kt0 c3439kt0Zza = c4234rs0.zza(AbstractC5024yo0.zza());
        C3331jw0 c3331jw0Zza = C3673mw0.zza();
        c3331jw0Zza.zzb(c3439kt0Zza.zzg());
        c3331jw0Zza.zzc(c3439kt0Zza.zze());
        c3331jw0Zza.zza(c3439kt0Zza.zzb());
        InterfaceC1689No0 interfaceC1689No0 = (InterfaceC1689No0) AbstractC1935To0.zzb((C3673mw0) c3331jw0Zza.zzbr(), InterfaceC1689No0.class);
        Tw0 tw0Zzc = c3439kt0Zza.zzc();
        Tw0 tw0 = Tw0.UNKNOWN_PREFIX;
        int iOrdinal = tw0Zzc.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = Ks0.zzb(c4234rs0.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = Ks0.zza(c4234rs0.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrZzc = Ks0.zza(c4234rs0.zzb().intValue()).zzc();
        } else {
            bArrZzc = Ks0.zza.zzc();
        }
        return new Ju0(interfaceC1689No0, tw0Zzc, bArrZzc);
    }
}
