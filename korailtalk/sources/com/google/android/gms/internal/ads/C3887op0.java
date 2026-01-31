package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.op0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3887op0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f21563a = null;

    /* renamed from: b, reason: collision with root package name */
    private Integer f21564b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f21565c = null;

    /* renamed from: d, reason: collision with root package name */
    private Integer f21566d = null;

    /* renamed from: e, reason: collision with root package name */
    private C4001pp0 f21567e = null;

    /* renamed from: f, reason: collision with root package name */
    private C4115qp0 f21568f = C4115qp0.zzc;

    /* synthetic */ C3887op0(AbstractC3773np0 abstractC3773np0) {
    }

    public final C3887op0 zza(int i8) throws InvalidAlgorithmParameterException {
        if (i8 != 16 && i8 != 24 && i8 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i8)));
        }
        this.f21563a = Integer.valueOf(i8);
        return this;
    }

    public final C3887op0 zzb(C4001pp0 c4001pp0) {
        this.f21567e = c4001pp0;
        return this;
    }

    public final C3887op0 zzc(int i8) throws InvalidAlgorithmParameterException {
        if (i8 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i8)));
        }
        this.f21564b = Integer.valueOf(i8);
        return this;
    }

    public final C3887op0 zzd(int i8) throws GeneralSecurityException {
        if (i8 < 12 || i8 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i8)));
        }
        this.f21565c = Integer.valueOf(i8);
        return this;
    }

    public final C3887op0 zze(int i8) throws GeneralSecurityException {
        if (i8 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i8)));
        }
        this.f21566d = Integer.valueOf(i8);
        return this;
    }

    public final C3887op0 zzf(C4115qp0 c4115qp0) {
        this.f21568f = c4115qp0;
        return this;
    }

    public final C4456tp0 zzg() throws GeneralSecurityException {
        if (this.f21563a == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (this.f21564b == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (this.f21565c == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = this.f21566d;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f21567e == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f21568f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int iIntValue = num.intValue();
        C4001pp0 c4001pp0 = this.f21567e;
        if (c4001pp0 == C4001pp0.zza) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (c4001pp0 == C4001pp0.zzb) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (c4001pp0 == C4001pp0.zzc) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (c4001pp0 == C4001pp0.zzd) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (c4001pp0 != C4001pp0.zze) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new C4456tp0(this.f21563a.intValue(), this.f21564b.intValue(), this.f21565c.intValue(), this.f21566d.intValue(), this.f21568f, this.f21567e, null);
    }
}
