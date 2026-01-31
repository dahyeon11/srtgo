package com.google.common.util.concurrent;

import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    private String f25502a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f25503b = null;

    /* renamed from: c, reason: collision with root package name */
    private Integer f25504c = null;

    /* renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f25505d = null;

    /* renamed from: e, reason: collision with root package name */
    private ThreadFactory f25506e = null;

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ThreadFactory f25507a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25508b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicLong f25509c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Boolean f25510d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Integer f25511e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f25512f;

        a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f25507a = threadFactory;
            this.f25508b = str;
            this.f25509c = atomicLong;
            this.f25510d = bool;
            this.f25511e = num;
            this.f25512f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f25507a.newThread(runnable);
            Objects.requireNonNull(threadNewThread);
            String str = this.f25508b;
            if (str != null) {
                AtomicLong atomicLong = this.f25509c;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(N.c(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f25510d;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f25511e;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f25512f;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    private static ThreadFactory b(N n8) {
        String str = n8.f25502a;
        Boolean bool = n8.f25503b;
        Integer num = n8.f25504c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = n8.f25505d;
        ThreadFactory threadFactoryDefaultThreadFactory = n8.f25506e;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory build() {
        return b(this);
    }

    public N setDaemon(boolean z8) {
        this.f25503b = Boolean.valueOf(z8);
        return this;
    }

    public N setNameFormat(String str) {
        c(str, 0);
        this.f25502a = str;
        return this;
    }

    public N setPriority(int i8) {
        e3.w.checkArgument(i8 >= 1, "Thread priority (%s) must be >= %s", i8, 1);
        e3.w.checkArgument(i8 <= 10, "Thread priority (%s) must be <= %s", i8, 10);
        this.f25504c = Integer.valueOf(i8);
        return this;
    }

    public N setThreadFactory(ThreadFactory threadFactory) {
        this.f25506e = (ThreadFactory) e3.w.checkNotNull(threadFactory);
        return this;
    }

    public N setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f25505d = (Thread.UncaughtExceptionHandler) e3.w.checkNotNull(uncaughtExceptionHandler);
        return this;
    }
}
