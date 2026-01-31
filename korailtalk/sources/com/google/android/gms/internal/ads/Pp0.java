package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public final class Pp0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f15410a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f15411b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f15412c = null;

    /* renamed from: d, reason: collision with root package name */
    private Qp0 f15413d = Qp0.zzc;

    /* synthetic */ Pp0(Op0 op0) {
    }

    public final Pp0 zza(int i8) {
        this.f15411b = 12;
        return this;
    }

    public final Pp0 zzb(int i8) throws InvalidAlgorithmParameterException {
        if (i8 != 16 && i8 != 24 && i8 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i8)));
        }
        this.f15410a = Integer.valueOf(i8);
        return this;
    }

    public final Pp0 zzc(int i8) {
        this.f15412c = 16;
        return this;
    }

    public final Pp0 zzd(Qp0 qp0) {
        this.f15413d = qp0;
        return this;
    }

    public final Sp0 zze() throws GeneralSecurityException {
        Integer num = this.f15410a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f15413d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.f15411b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.f15412c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        this.f15411b.intValue();
        this.f15412c.intValue();
        return new Sp0(iIntValue, 12, 16, this.f15413d, null);
    }
}
