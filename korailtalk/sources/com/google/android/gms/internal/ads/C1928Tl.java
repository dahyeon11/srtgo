package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import i2.AbstractC5670c;

/* renamed from: com.google.android.gms.internal.ads.Tl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1928Tl implements AbstractC5670c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1203Bt f16510a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2010Vl f16511b;

    C1928Tl(C2010Vl c2010Vl, C1203Bt c1203Bt) {
        this.f16510a = c1203Bt;
        this.f16511b = c2010Vl;
    }

    @Override // i2.AbstractC5670c.a
    public final void onConnected(Bundle bundle) {
        try {
            this.f16510a.zzc(this.f16511b.f16892a.zzp());
        } catch (DeadObjectException e8) {
            this.f16510a.zzd(e8);
        }
    }

    @Override // i2.AbstractC5670c.a
    public final void onConnectionSuspended(int i8) {
        this.f16510a.zzd(new RuntimeException("onConnectionSuspended: " + i8));
    }
}
