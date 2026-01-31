package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f25644a = g.f25643a;

    static Executor a() {
        return f25644a;
    }

    static ExecutorService b() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new p2.b("firebase-iid-executor"));
    }
}
