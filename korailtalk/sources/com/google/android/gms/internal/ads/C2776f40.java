package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.f40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2776f40 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f19127a;

    public C2776f40(Integer num) {
        this.f19127a = num;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Integer num = this.f19127a;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("dspct", Math.min(num.intValue(), 20));
        }
    }
}
