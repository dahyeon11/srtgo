package com.google.common.util.concurrent;

/* loaded from: classes2.dex */
abstract class K {
    static boolean a(Throwable th, Class cls) {
        return cls.isInstance(th);
    }

    static void b(Throwable th) {
        e3.w.checkNotNull(th);
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
