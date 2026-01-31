package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class H10 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f13232a;

    public H10(boolean z8) {
        this.f13232a = z8;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.f13232a ? "0" : "1");
    }
}
