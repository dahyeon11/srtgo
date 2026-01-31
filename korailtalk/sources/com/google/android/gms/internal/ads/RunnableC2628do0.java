package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.do0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2628do0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    C2973go0 f18684a;

    RunnableC2628do0(C2973go0 c2973go0) {
        this.f18684a = c2973go0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.C c9;
        C2973go0 c2973go0 = this.f18684a;
        if (c2973go0 == null || (c9 = c2973go0.f19403h) == null) {
            return;
        }
        AbstractC2743eo0 abstractC2743eo0 = null;
        this.f18684a = null;
        if (c9.isDone()) {
            c2973go0.q(c9);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = c2973go0.f19404i;
            c2973go0.f19404i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    c2973go0.zzd(new C2858fo0(str, abstractC2743eo0));
                    throw th;
                }
            }
            c2973go0.zzd(new C2858fo0(str + ": " + c9.toString(), abstractC2743eo0));
        } finally {
            c9.cancel(true);
        }
    }
}
