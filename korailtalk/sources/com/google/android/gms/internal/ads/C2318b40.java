package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.b40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2318b40 implements M50 {
    public final String zza;
    public final boolean zzb;

    public C2318b40(String str, boolean z8) {
        this.zza = str;
        this.zzb = z8;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.zza);
        if (this.zzb) {
            bundle.putString("de", "1");
        }
    }
}
