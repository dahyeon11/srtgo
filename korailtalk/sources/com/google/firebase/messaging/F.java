package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class F {

    /* renamed from: d, reason: collision with root package name */
    private static WeakReference f25749d;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f25750a;

    /* renamed from: b, reason: collision with root package name */
    private D f25751b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f25752c;

    private F(SharedPreferences sharedPreferences, Executor executor) {
        this.f25752c = executor;
        this.f25750a = sharedPreferences;
    }

    private final synchronized void c() {
        this.f25751b = D.c(this.f25750a, "topic_operation_queue", ",", this.f25752c);
    }

    public static synchronized F getInstance(Context context, Executor executor) {
        F f8;
        try {
            WeakReference weakReference = f25749d;
            f8 = weakReference != null ? (F) weakReference.get() : null;
            if (f8 == null) {
                f8 = new F(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                f8.c();
                f25749d = new WeakReference(f8);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8;
    }

    final synchronized boolean a(E e8) {
        return this.f25751b.add(e8.serialize());
    }

    final synchronized E b() {
        return E.a(this.f25751b.peek());
    }

    final synchronized boolean d(E e8) {
        return this.f25751b.remove(e8.serialize());
    }
}
