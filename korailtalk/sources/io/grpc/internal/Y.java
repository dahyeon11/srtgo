package io.grpc.internal;

import e3.C5353C;
import io.grpc.internal.InterfaceC5776u;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class Y {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f32585g = Logger.getLogger(Y.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final long f32586a;

    /* renamed from: b, reason: collision with root package name */
    private final C5353C f32587b;

    /* renamed from: c, reason: collision with root package name */
    private Map f32588c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    private boolean f32589d;

    /* renamed from: e, reason: collision with root package name */
    private Throwable f32590e;

    /* renamed from: f, reason: collision with root package name */
    private long f32591f;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5776u.a f32592a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f32593b;

        a(InterfaceC5776u.a aVar, long j8) {
            this.f32592a = aVar;
            this.f32593b = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32592a.onSuccess(this.f32593b);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5776u.a f32594a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f32595b;

        b(InterfaceC5776u.a aVar, Throwable th) {
            this.f32594a = aVar;
            this.f32595b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f32594a.onFailure(this.f32595b);
        }
    }

    public Y(long j8, C5353C c5353c) {
        this.f32586a = j8;
        this.f32587b = c5353c;
    }

    private static Runnable a(InterfaceC5776u.a aVar, long j8) {
        return new a(aVar, j8);
    }

    private static Runnable b(InterfaceC5776u.a aVar, Throwable th) {
        return new b(aVar, th);
    }

    private static void c(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f32585g.log(Level.SEVERE, "Failed to execute PingCallback", th);
        }
    }

    public static void notifyFailed(InterfaceC5776u.a aVar, Executor executor, Throwable th) {
        c(executor, b(aVar, th));
    }

    public void addCallback(InterfaceC5776u.a aVar, Executor executor) {
        synchronized (this) {
            try {
                if (!this.f32589d) {
                    this.f32588c.put(aVar, executor);
                } else {
                    Throwable th = this.f32590e;
                    c(executor, th != null ? b(aVar, th) : a(aVar, this.f32591f));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean complete() {
        synchronized (this) {
            try {
                if (this.f32589d) {
                    return false;
                }
                this.f32589d = true;
                long jElapsed = this.f32587b.elapsed(TimeUnit.NANOSECONDS);
                this.f32591f = jElapsed;
                Map map = this.f32588c;
                this.f32588c = null;
                for (Map.Entry entry : map.entrySet()) {
                    c((Executor) entry.getValue(), a((InterfaceC5776u.a) entry.getKey(), jElapsed));
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void failed(Throwable th) {
        synchronized (this) {
            try {
                if (this.f32589d) {
                    return;
                }
                this.f32589d = true;
                this.f32590e = th;
                Map map = this.f32588c;
                this.f32588c = null;
                for (Map.Entry entry : map.entrySet()) {
                    notifyFailed((InterfaceC5776u.a) entry.getKey(), (Executor) entry.getValue(), th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long payload() {
        return this.f32586a;
    }
}
