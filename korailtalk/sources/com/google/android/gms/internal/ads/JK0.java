package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class JK0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f13629a = new Handler(Looper.myLooper());

    /* renamed from: b, reason: collision with root package name */
    private final AudioTrack$StreamEventCallback f13630b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MK0 f13631c;

    public JK0(MK0 mk0) {
        this.f13631c = mk0;
        this.f13630b = new GK0(this, mk0);
    }

    public void zza(AudioTrack audioTrack) {
        final Handler handler = this.f13629a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.FK0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.f13630b);
    }

    public void zzb(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f13630b);
        this.f13629a.removeCallbacksAndMessages(null);
    }
}
