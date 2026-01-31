package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private static final long f25695a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    private static final Object f25696b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static H2.a f25697c;

    private static void a(Context context) {
        if (f25697c == null) {
            H2.a aVar = new H2.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f25697c = aVar;
            aVar.setReferenceCounted(true);
        }
    }

    public static void acquireWakeLock(Intent intent, long j8) {
        synchronized (f25696b) {
            try {
                if (f25697c != null) {
                    c(intent, true);
                    f25697c.acquire(j8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static boolean b(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    private static void c(Intent intent, boolean z8) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z8);
    }

    public static void completeWakefulIntent(Intent intent) {
        synchronized (f25696b) {
            try {
                if (f25697c != null && b(intent)) {
                    c(intent, false);
                    f25697c.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void initWakeLock(Context context) {
        synchronized (f25696b) {
            a(context);
        }
    }

    public static void reset() {
        synchronized (f25696b) {
            f25697c = null;
        }
    }

    public static ComponentName startWakefulService(Context context, Intent intent) {
        synchronized (f25696b) {
            try {
                a(context);
                boolean zB = b(intent);
                c(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zB) {
                    f25697c.acquire(f25695a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
