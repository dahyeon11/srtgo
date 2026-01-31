package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public final class Cp0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f12577a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f12578b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f12579c = null;

    /* renamed from: d, reason: collision with root package name */
    private Dp0 f12580d = Dp0.zzc;

    /* synthetic */ Cp0(Bp0 bp0) {
    }

    public final Cp0 zza(int i8) throws GeneralSecurityException {
        if (i8 != 12 && i8 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i8)));
        }
        this.f12578b = Integer.valueOf(i8);
        return this;
    }

    public final Cp0 zzb(int i8) throws InvalidAlgorithmParameterException {
        if (i8 != 16 && i8 != 24 && i8 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i8)));
        }
        this.f12577a = Integer.valueOf(i8);
        return this;
    }

    public final Cp0 zzc(int i8) {
        this.f12579c = 16;
        return this;
    }

    public final Cp0 zzd(Dp0 dp0) {
        this.f12580d = dp0;
        return this;
    }

    public final Fp0 zze() throws GeneralSecurityException {
        Integer num = this.f12577a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f12578b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.f12580d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.f12579c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = this.f12578b.intValue();
        this.f12579c.intValue();
        return new Fp0(iIntValue, iIntValue2, 16, this.f12580d, null);
    }
}
