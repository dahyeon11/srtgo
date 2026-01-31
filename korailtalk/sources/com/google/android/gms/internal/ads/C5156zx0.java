package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.zx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5156zx0 implements Cx0 {
    @Override // com.google.android.gms.internal.ads.Cx0
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
