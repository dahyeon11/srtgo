package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final /* synthetic */ class j implements Executor {

    /* renamed from: a, reason: collision with root package name */
    static final Executor f25648a = new j();

    private j() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
