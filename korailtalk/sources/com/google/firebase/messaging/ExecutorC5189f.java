package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final /* synthetic */ class ExecutorC5189f implements Executor {

    /* renamed from: a, reason: collision with root package name */
    static final Executor f25796a = new ExecutorC5189f();

    private ExecutorC5189f() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
