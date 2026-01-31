package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.kakao.sdk.common.Constants;

/* loaded from: classes2.dex */
public final class X20 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final double f17105a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17106b;

    public X20(double d9, boolean z8) {
        this.f17105a = d9;
        this.f17106b = z8;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleZza = AbstractC2947gb0.zza(bundle, Constants.DEVICE);
        bundle.putBundle(Constants.DEVICE, bundleZza);
        Bundle bundleZza2 = AbstractC2947gb0.zza(bundleZza, "battery");
        bundleZza.putBundle("battery", bundleZza2);
        bundleZza2.putBoolean("is_charging", this.f17106b);
        bundleZza2.putDouble("battery_level", this.f17105a);
    }
}
