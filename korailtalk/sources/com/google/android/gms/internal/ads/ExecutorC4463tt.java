package com.google.android.gms.internal.ads;

import K1.HandlerC0669w0;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.tt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class ExecutorC4463tt implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f22944a = new HandlerC0669w0(Looper.getMainLooper());

    ExecutorC4463tt() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.f22944a.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            G1.u.zzp();
            K1.K0.zzM(G1.u.zzo().zzd(), th);
            throw th;
        }
    }
}
