package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* renamed from: com.google.android.gms.internal.ads.wx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4814wx0 implements Cx0 {
    @Override // com.google.android.gms.internal.ads.Cx0
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
