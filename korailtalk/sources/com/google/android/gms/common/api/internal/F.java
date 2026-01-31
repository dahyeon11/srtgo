package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import g2.AbstractC5544f;
import h2.C5596m;
import i2.AbstractC5683p;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class F implements AbstractC5544f.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f11895a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5596m f11896b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K f11897c;

    F(K k8, AtomicReference atomicReference, C5596m c5596m) {
        this.f11897c = k8;
        this.f11895a = atomicReference;
        this.f11896b = c5596m;
    }

    @Override // g2.AbstractC5544f.b, h2.InterfaceC5587d
    public final void onConnected(Bundle bundle) {
        this.f11897c.j((AbstractC5544f) AbstractC5683p.checkNotNull((AbstractC5544f) this.f11895a.get()), this.f11896b, true);
    }

    @Override // g2.AbstractC5544f.b, h2.InterfaceC5587d
    public final void onConnectionSuspended(int i8) {
    }
}
