package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import g2.AbstractC5544f;
import h2.C5596m;

/* loaded from: classes.dex */
final class H implements g2.o {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5596m f11899a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f11900b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC5544f f11901c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ K f11902d;

    H(K k8, C5596m c5596m, boolean z8, AbstractC5544f abstractC5544f) {
        this.f11902d = k8;
        this.f11899a = c5596m;
        this.f11900b = z8;
        this.f11901c = abstractC5544f;
    }

    @Override // g2.o
    public final /* bridge */ /* synthetic */ void onResult(g2.n nVar) {
        Status status = (Status) nVar;
        c2.c.getInstance(this.f11902d.f11909f).zac();
        if (status.isSuccess() && this.f11902d.isConnected()) {
            K k8 = this.f11902d;
            k8.disconnect();
            k8.connect();
        }
        this.f11899a.setResult(status);
        if (this.f11900b) {
            this.f11901c.disconnect();
        }
    }
}
