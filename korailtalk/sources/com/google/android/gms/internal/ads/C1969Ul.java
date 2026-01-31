package com.google.android.gms.internal.ads;

import f2.C5392b;
import i2.AbstractC5670c;

/* renamed from: com.google.android.gms.internal.ads.Ul, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1969Ul implements AbstractC5670c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1203Bt f16707a;

    C1969Ul(C2010Vl c2010Vl, C1203Bt c1203Bt) {
        this.f16707a = c1203Bt;
    }

    @Override // i2.AbstractC5670c.b
    public final void onConnectionFailed(C5392b c5392b) {
        this.f16707a.zzd(new RuntimeException("Connection failed."));
    }
}
