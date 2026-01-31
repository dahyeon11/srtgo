package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C1101a;

/* loaded from: classes.dex */
final class O implements ComponentCallbacks2C1101a.InterfaceC0194a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1105c f11947a;

    O(C1105c c1105c) {
        this.f11947a = c1105c;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1101a.InterfaceC0194a
    public final void onBackgroundStateChanged(boolean z8) {
        C1105c c1105c = this.f11947a;
        c1105c.f12011p.sendMessage(c1105c.f12011p.obtainMessage(1, Boolean.valueOf(z8)));
    }
}
