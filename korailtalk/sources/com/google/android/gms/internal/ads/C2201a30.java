package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.a30, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2201a30 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final Q80 f17891a;

    C2201a30(Q80 q80) {
        this.f17891a = q80;
    }

    final /* synthetic */ void a(Bundle bundle) {
        bundle.putString("key_schema", this.f17891a.zza());
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        Q80 q80 = this.f17891a;
        M50 m50 = null;
        if (q80 != null && q80.zza() != null && !q80.zza().isEmpty()) {
            m50 = new M50() { // from class: com.google.android.gms.internal.ads.Z20
                @Override // com.google.android.gms.internal.ads.M50
                public final void zzj(Object obj) {
                    this.zza.a((Bundle) obj);
                }
            };
        }
        return AbstractC1483In0.zzh(m50);
    }
}
