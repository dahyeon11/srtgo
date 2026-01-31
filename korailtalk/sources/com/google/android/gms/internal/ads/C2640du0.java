package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.du0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2640du0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f18700a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f18701b = null;

    /* renamed from: c, reason: collision with root package name */
    private C2755eu0 f18702c = null;

    /* renamed from: d, reason: collision with root package name */
    private C2870fu0 f18703d = C2870fu0.zzd;

    /* synthetic */ C2640du0(AbstractC2526cu0 abstractC2526cu0) {
    }

    public final C2640du0 zza(C2755eu0 c2755eu0) {
        this.f18702c = c2755eu0;
        return this;
    }

    public final C2640du0 zzb(int i8) {
        this.f18700a = Integer.valueOf(i8);
        return this;
    }

    public final C2640du0 zzc(int i8) {
        this.f18701b = Integer.valueOf(i8);
        return this;
    }

    public final C2640du0 zzd(C2870fu0 c2870fu0) {
        this.f18703d = c2870fu0;
        return this;
    }

    public final C3100hu0 zze() throws GeneralSecurityException {
        Integer num = this.f18700a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f18701b == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f18702c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f18703d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f18700a));
        }
        Integer num2 = this.f18701b;
        int iIntValue = num2.intValue();
        C2755eu0 c2755eu0 = this.f18702c;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (c2755eu0 == C2755eu0.zza) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (c2755eu0 == C2755eu0.zzb) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (c2755eu0 == C2755eu0.zzc) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (c2755eu0 == C2755eu0.zzd) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (c2755eu0 != C2755eu0.zze) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new C3100hu0(this.f18700a.intValue(), this.f18701b.intValue(), this.f18703d, this.f18702c, null);
    }
}
