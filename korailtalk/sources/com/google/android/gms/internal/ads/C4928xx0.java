package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.ads.xx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4928xx0 implements Cx0 {
    @Override // com.google.android.gms.internal.ads.Cx0
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
