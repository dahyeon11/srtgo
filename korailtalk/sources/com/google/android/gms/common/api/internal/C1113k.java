package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import g2.AbstractC5547i;

/* renamed from: com.google.android.gms.common.api.internal.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1113k implements AbstractC5547i.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f12069a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1115m f12070b;

    C1113k(C1115m c1115m, BasePendingResult basePendingResult) {
        this.f12070b = c1115m;
        this.f12069a = basePendingResult;
    }

    @Override // g2.AbstractC5547i.a
    public final void onComplete(Status status) {
        this.f12070b.f12076a.remove(this.f12069a);
    }
}
