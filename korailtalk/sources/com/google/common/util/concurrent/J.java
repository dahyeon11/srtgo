package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
abstract class J {
    static void a(Object obj, long j8) {
        LockSupport.parkNanos(obj, Math.min(j8, 2147483647999999999L));
    }
}
