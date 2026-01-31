package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.ads.yr0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5030yr0 extends ThreadLocal {
    C5030yr0() {
    }

    protected static final Cipher a() {
        try {
            Cipher cipher = (Cipher) C4586ux0.zza.zza("ChaCha20-Poly1305");
            if (C5144zr0.c(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
