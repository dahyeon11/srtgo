package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import f2.C5392b;
import g2.AbstractC5544f;
import h2.C5596m;

/* loaded from: classes.dex */
final class G implements AbstractC5544f.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5596m f11898a;

    G(K k8, C5596m c5596m) {
        this.f11898a = c5596m;
    }

    @Override // g2.AbstractC5544f.c, h2.InterfaceC5591h
    public final void onConnectionFailed(C5392b c5392b) {
        this.f11898a.setResult(new Status(8));
    }
}
