package com.google.android.gms.common.api.internal;

import h2.AbstractC5605w;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class J extends AbstractC5605w {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f11904a;

    J(K k8) {
        this.f11904a = new WeakReference(k8);
    }

    @Override // h2.AbstractC5605w
    public final void zaa() {
        K k8 = (K) this.f11904a.get();
        if (k8 == null) {
            return;
        }
        K.f(k8);
    }
}
