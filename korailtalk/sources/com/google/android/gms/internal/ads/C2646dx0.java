package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.ads.dx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2646dx0 extends ThreadLocal {
    C2646dx0() {
    }

    protected static final Cipher a() {
        try {
            return (Cipher) C4586ux0.zza.zza("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
