package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.ads.dq0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2632dq0 {

    /* renamed from: a, reason: collision with root package name */
    private Integer f18691a = null;

    /* renamed from: b, reason: collision with root package name */
    private C2747eq0 f18692b = C2747eq0.zzc;

    /* synthetic */ C2632dq0(AbstractC2518cq0 abstractC2518cq0) {
    }

    public final C2632dq0 zza(int i8) throws InvalidAlgorithmParameterException {
        if (i8 != 16 && i8 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i8)));
        }
        this.f18691a = Integer.valueOf(i8);
        return this;
    }

    public final C2632dq0 zzb(C2747eq0 c2747eq0) {
        this.f18692b = c2747eq0;
        return this;
    }

    public final C2977gq0 zzc() throws GeneralSecurityException {
        Integer num = this.f18691a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.f18692b != null) {
            return new C2977gq0(num.intValue(), this.f18692b, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }
}
