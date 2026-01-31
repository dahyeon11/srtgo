package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.yJ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4973yJ0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5087zJ0 f23867a;

    /* synthetic */ C4973yJ0(C5087zJ0 c5087zJ0, AbstractC4859xJ0 abstractC4859xJ0) {
        this.f23867a = c5087zJ0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        C5087zJ0 c5087zJ0 = this.f23867a;
        c5087zJ0.f(C4289sJ0.c(context, intent, c5087zJ0.f24145h, c5087zJ0.f24144g));
    }
}
