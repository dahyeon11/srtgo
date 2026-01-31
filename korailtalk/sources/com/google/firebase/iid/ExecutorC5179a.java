package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final /* synthetic */ class ExecutorC5179a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    static final Executor f25632a = new ExecutorC5179a();

    private ExecutorC5179a() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
