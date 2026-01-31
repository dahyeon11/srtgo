package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class G10 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13106a;

    G10(Context context) {
        this.f13106a = context;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcR)).booleanValue()) {
            return AbstractC1483In0.zzh(new H10(androidx.core.content.a.checkSelfPermission(this.f13106a, "com.google.android.gms.permission.AD_ID") == 0));
        }
        return AbstractC1483In0.zzh(null);
    }
}
