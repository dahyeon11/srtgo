package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.ads.fx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2876fx0 extends ThreadLocal {
    C2876fx0() {
    }

    protected static final Cipher a() {
        try {
            return (Cipher) C4586ux0.zza.zza("AES/ECB/NOPADDING");
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
