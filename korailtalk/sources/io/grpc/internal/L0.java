package io.grpc.internal;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class L0 {

    /* renamed from: d, reason: collision with root package name */
    private static final L0 f32497d = new L0(new a());

    /* renamed from: a, reason: collision with root package name */
    private final IdentityHashMap f32498a = new IdentityHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final e f32499b;

    /* renamed from: c, reason: collision with root package name */
    private ScheduledExecutorService f32500c;

    class a implements e {
        a() {
        }

        @Override // io.grpc.internal.L0.e
        public ScheduledExecutorService createScheduledExecutor() {
            return Executors.newSingleThreadScheduledExecutor(U.getThreadFactory("grpc-shared-destroyer-%d", true));
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f32501a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f32502b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f32503c;

        b(c cVar, d dVar, Object obj) {
            this.f32501a = cVar;
            this.f32502b = dVar;
            this.f32503c = obj;
        }

        /* JADX WARN: Finally extract failed */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (L0.this) {
                try {
                    if (this.f32501a.f32506b == 0) {
                        try {
                            this.f32502b.close(this.f32503c);
                            L0.this.f32498a.remove(this.f32502b);
                            if (L0.this.f32498a.isEmpty()) {
                                L0.this.f32500c.shutdown();
                                L0.this.f32500c = null;
                            }
                        } catch (Throwable th) {
                            L0.this.f32498a.remove(this.f32502b);
                            if (L0.this.f32498a.isEmpty()) {
                                L0.this.f32500c.shutdown();
                                L0.this.f32500c = null;
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final Object f32505a;

        /* renamed from: b, reason: collision with root package name */
        int f32506b;

        /* renamed from: c, reason: collision with root package name */
        ScheduledFuture f32507c;

        c(Object obj) {
            this.f32505a = obj;
        }
    }

    public interface d {
        void close(Object obj);

        Object create();
    }

    interface e {
        ScheduledExecutorService createScheduledExecutor();
    }

    L0(e eVar) {
        this.f32499b = eVar;
    }

    public static <T> T get(d dVar) {
        return (T) f32497d.d(dVar);
    }

    public static <T> T release(d dVar, T t8) {
        return (T) f32497d.e(dVar, t8);
    }

    synchronized Object d(d dVar) {
        c cVar;
        try {
            cVar = (c) this.f32498a.get(dVar);
            if (cVar == null) {
                cVar = new c(dVar.create());
                this.f32498a.put(dVar, cVar);
            }
            ScheduledFuture scheduledFuture = cVar.f32507c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                cVar.f32507c = null;
            }
            cVar.f32506b++;
        } catch (Throwable th) {
            throw th;
        }
        return cVar.f32505a;
    }

    synchronized Object e(d dVar, Object obj) {
        try {
            c cVar = (c) this.f32498a.get(dVar);
            if (cVar == null) {
                throw new IllegalArgumentException("No cached instance found for " + dVar);
            }
            e3.w.checkArgument(obj == cVar.f32505a, "Releasing the wrong instance");
            e3.w.checkState(cVar.f32506b > 0, "Refcount has already reached zero");
            int i8 = cVar.f32506b - 1;
            cVar.f32506b = i8;
            if (i8 == 0) {
                e3.w.checkState(cVar.f32507c == null, "Destroy task already scheduled");
                if (this.f32500c == null) {
                    this.f32500c = this.f32499b.createScheduledExecutor();
                }
                cVar.f32507c = this.f32500c.schedule(new RunnableC5749g0(new b(cVar, dVar, obj)), 1L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return null;
    }
}
