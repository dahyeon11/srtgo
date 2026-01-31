package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class Du0 implements Ot0 {

    /* renamed from: a, reason: collision with root package name */
    private final Vt0 f12710a;

    public Du0(Vt0 vt0) throws GeneralSecurityException {
        if (!Zr0.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f12710a = vt0;
    }
}
