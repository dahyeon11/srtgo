package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class E20 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    final String f12743a;

    /* renamed from: b, reason: collision with root package name */
    final int f12744b;

    public E20(String str, int i8) {
        this.f12743a = str;
        this.f12744b = i8;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.f12743a) || this.f12744b == -1) {
            return;
        }
        Bundle bundleZza = AbstractC2947gb0.zza(bundle, "pii");
        bundle.putBundle("pii", bundleZza);
        bundleZza.putString("pvid", this.f12743a);
        bundleZza.putInt("pvid_s", this.f12744b);
    }
}
