package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.ads.vx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4700vx0 implements Cx0 {
    @Override // com.google.android.gms.internal.ads.Cx0
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
