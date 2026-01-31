package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.kakao.sdk.common.Constants;

/* renamed from: com.google.android.gms.internal.ads.w40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4715w40 implements M50 {
    public final Bundle zza;

    public C4715w40(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleZza = AbstractC2947gb0.zza(bundle, Constants.DEVICE);
        bundleZza.putBundle("android_mem_info", this.zza);
        bundle.putBundle(Constants.DEVICE, bundleZza);
    }
}
