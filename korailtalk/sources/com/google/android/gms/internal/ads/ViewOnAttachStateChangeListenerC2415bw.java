package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.bw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class ViewOnAttachStateChangeListenerC2415bw implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4233rs f18210a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2988gw f18211b;

    ViewOnAttachStateChangeListenerC2415bw(C2988gw c2988gw, InterfaceC4233rs interfaceC4233rs) {
        this.f18210a = interfaceC4233rs;
        this.f18211b = c2988gw;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f18211b.e(view, this.f18210a, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
