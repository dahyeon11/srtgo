package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.o40, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3804o40 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f21403a;

    public C3804o40(Boolean bool) {
        this.f21403a = bool;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Boolean bool = this.f21403a;
        Bundle bundle = (Bundle) obj;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
