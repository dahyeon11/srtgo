package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Or0 implements InterfaceC3885oo0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3885oo0 f15155a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f15156b;

    private Or0(InterfaceC3885oo0 interfaceC3885oo0, byte[] bArr) {
        this.f15155a = interfaceC3885oo0;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f15156b = bArr;
    }

    public static InterfaceC3885oo0 zzb(C4234rs0 c4234rs0) throws GeneralSecurityException {
        byte[] bArrZzc;
        C3439kt0 c3439kt0Zza = c4234rs0.zza(AbstractC5024yo0.zza());
        C3331jw0 c3331jw0Zza = C3673mw0.zza();
        c3331jw0Zza.zzb(c3439kt0Zza.zzg());
        c3331jw0Zza.zzc(c3439kt0Zza.zze());
        c3331jw0Zza.zza(c3439kt0Zza.zzb());
        InterfaceC3885oo0 interfaceC3885oo0 = (InterfaceC3885oo0) AbstractC1935To0.zzb((C3673mw0) c3331jw0Zza.zzbr(), InterfaceC3885oo0.class);
        Tw0 tw0Zzc = c3439kt0Zza.zzc();
        Tw0 tw0 = Tw0.UNKNOWN_PREFIX;
        int iOrdinal = tw0Zzc.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = Ks0.zzb(c4234rs0.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = Ks0.zza(c4234rs0.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(tw0Zzc)));
            }
            bArrZzc = Ks0.zza(c4234rs0.zzb().intValue()).zzc();
        } else {
            bArrZzc = Ks0.zza.zzc();
        }
        return new Or0(interfaceC3885oo0, bArrZzc);
    }

    public static InterfaceC3885oo0 zzc(InterfaceC3885oo0 interfaceC3885oo0, Mx0 mx0) {
        return new Or0(interfaceC3885oo0, mx0.zzc());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3885oo0
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f15156b;
        if (bArr3.length == 0) {
            return this.f15155a.zza(bArr, bArr2);
        }
        if (At0.zzc(bArr3, bArr)) {
            return this.f15155a.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
