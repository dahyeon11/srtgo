package com.google.firebase.messaging;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5192i {
    private static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new p2.b(str));
    }

    static ScheduledExecutorService b() {
        return new ScheduledThreadPoolExecutor(1, new p2.b("Firebase-Messaging-Init"));
    }

    static ExecutorService c() {
        return A2.a.zza().zza(new p2.b("Firebase-Messaging-Intent-Handle"), A2.f.zza);
    }

    static ExecutorService d() {
        return Executors.newSingleThreadExecutor(new p2.b("Firebase-Messaging-Network-Io"));
    }

    static ScheduledExecutorService e() {
        return new ScheduledThreadPoolExecutor(1, new p2.b("Firebase-Messaging-Topics-Io"));
    }

    static Executor f() {
        return a("Firebase-Messaging-Trigger-Topics-Io");
    }
}
