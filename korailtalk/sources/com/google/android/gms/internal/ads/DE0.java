package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes2.dex */
final class DE0 extends BroadcastReceiver implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final EE0 f12654a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f12655b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ FE0 f12656c;

    public DE0(FE0 fe0, Handler handler, EE0 ee0) {
        this.f12656c = fe0;
        this.f12655b = handler;
        this.f12654a = ee0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f12655b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
