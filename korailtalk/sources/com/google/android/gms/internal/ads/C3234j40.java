package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.j40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3234j40 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f20181a;

    public C3234j40(boolean z8) {
        this.f20181a = z8;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        ((Bundle) obj).putBoolean("is_gbid", this.f20181a);
    }
}
