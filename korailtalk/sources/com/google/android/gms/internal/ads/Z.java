package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes2.dex */
final class Z implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    private static final Z f17467e = new Z();

    /* renamed from: a, reason: collision with root package name */
    private final Handler f17468a;

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f17469b;

    /* renamed from: c, reason: collision with root package name */
    private Choreographer f17470c;

    /* renamed from: d, reason: collision with root package name */
    private int f17471d;
    public volatile long zza = -9223372036854775807L;

    private Z() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f17469b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f17468a = handler;
        handler.sendEmptyMessage(0);
    }

    public static Z zza() {
        return f17467e;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j8) {
        this.zza = j8;
        Choreographer choreographer = this.f17470c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i8 = message.what;
        if (i8 == 0) {
            try {
                this.f17470c = Choreographer.getInstance();
            } catch (RuntimeException e8) {
                AbstractC2834fc0.zzg("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e8);
            }
            return true;
        }
        if (i8 == 1) {
            Choreographer choreographer = this.f17470c;
            if (choreographer != null) {
                int i9 = this.f17471d + 1;
                this.f17471d = i9;
                if (i9 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i8 != 2) {
            return false;
        }
        Choreographer choreographer2 = this.f17470c;
        if (choreographer2 != null) {
            int i10 = this.f17471d - 1;
            this.f17471d = i10;
            if (i10 == 0) {
                choreographer2.removeFrameCallback(this);
                this.zza = -9223372036854775807L;
            }
        }
        return true;
    }

    public final void zzb() {
        this.f17468a.sendEmptyMessage(1);
    }

    public final void zzc() {
        this.f17468a.sendEmptyMessage(2);
    }
}
