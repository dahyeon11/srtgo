package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.Kb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1540Kb extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewOnAttachStateChangeListenerC1581Lb f13840a;

    C1540Kb(ViewOnAttachStateChangeListenerC1581Lb viewOnAttachStateChangeListenerC1581Lb) {
        this.f13840a = viewOnAttachStateChangeListenerC1581Lb;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f13840a.e();
    }
}
