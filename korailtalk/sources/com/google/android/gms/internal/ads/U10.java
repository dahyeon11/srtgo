package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class U10 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16570a;

    public U10(String str) {
        this.f16570a = str;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        String str = this.f16570a;
        Bundle bundle = (Bundle) obj;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}
