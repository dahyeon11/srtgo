package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.mf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3639mf0 extends BroadcastReceiver {
    C3639mf0() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
            int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
            if (intExtra == 0) {
                AbstractC3753nf0.f21330a = 1;
            } else if (intExtra == 1) {
                AbstractC3753nf0.f21330a = 2;
            }
        }
    }
}
