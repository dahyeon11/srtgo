package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.Tc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1910Tc extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewOnAttachStateChangeListenerC2033Wc f16499a;

    C1910Tc(ViewOnAttachStateChangeListenerC2033Wc viewOnAttachStateChangeListenerC2033Wc) {
        this.f16499a = viewOnAttachStateChangeListenerC2033Wc;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f16499a.f(3);
    }
}
