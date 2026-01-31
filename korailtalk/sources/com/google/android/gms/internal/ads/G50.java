package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class G50 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f13109a;

    G50(C3814o90 c3814o90) {
        this.f13109a = c3814o90 != null;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return AbstractC1483In0.zzh(this.f13109a ? new M50() { // from class: com.google.android.gms.internal.ads.F50
            @Override // com.google.android.gms.internal.ads.M50
            public final void zzj(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}
