package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final /* synthetic */ class g implements Executor {

    /* renamed from: a, reason: collision with root package name */
    static final Executor f25643a = new g();

    private g() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
