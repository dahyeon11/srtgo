package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
final class Xr0 extends ThreadLocal {
    Xr0() {
    }

    protected static final Cipher a() {
        try {
            Cipher cipher = (Cipher) C4586ux0.zza.zza("AES/GCM-SIV/NoPadding");
            if (Yr0.c(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
