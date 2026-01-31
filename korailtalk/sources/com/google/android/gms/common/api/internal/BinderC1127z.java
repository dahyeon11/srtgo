package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class BinderC1127z extends G2.d {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f12116a;

    BinderC1127z(C c9) {
        this.f12116a = new WeakReference(c9);
    }

    @Override // G2.d, G2.e, G2.f
    public final void zab(G2.l lVar) {
        C c9 = (C) this.f12116a.get();
        if (c9 == null) {
            return;
        }
        c9.f11872a.f(new C1126y(this, c9, c9, lVar));
    }
}
