package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class Cu0 implements Ot0 {

    /* renamed from: a, reason: collision with root package name */
    private final Et0 f12591a;

    public Cu0(Et0 et0) throws GeneralSecurityException {
        if (!Zr0.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.f12591a = et0;
    }
}
