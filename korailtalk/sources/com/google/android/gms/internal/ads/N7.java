package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class N7 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Handler f14801a;

    N7(P7 p72, Handler handler) {
        this.f14801a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f14801a.post(runnable);
    }
}
