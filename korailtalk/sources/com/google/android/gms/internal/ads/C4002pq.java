package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* renamed from: com.google.android.gms.internal.ads.pq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4002pq implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Thread.UncaughtExceptionHandler f21810a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4116qq f21811b;

    C4002pq(C4116qq c4116qq, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f21810a = uncaughtExceptionHandler;
        this.f21811b = c4116qq;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.f21811b.a(thread, th);
            } catch (Throwable unused) {
                L1.n.zzg("AdMob exception reporter failed reporting the exception.");
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f21810a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f21810a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
