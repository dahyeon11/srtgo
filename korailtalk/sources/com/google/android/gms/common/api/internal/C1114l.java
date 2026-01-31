package com.google.android.gms.common.api.internal;

import I2.AbstractC0608l;
import I2.C0609m;
import I2.InterfaceC0602f;

/* renamed from: com.google.android.gms.common.api.internal.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1114l implements InterfaceC0602f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0609m f12072a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1115m f12073b;

    C1114l(C1115m c1115m, C0609m c0609m) {
        this.f12073b = c1115m;
        this.f12072a = c0609m;
    }

    @Override // I2.InterfaceC0602f
    public final void onComplete(AbstractC0608l abstractC0608l) {
        this.f12073b.f12077b.remove(this.f12072a);
    }
}
