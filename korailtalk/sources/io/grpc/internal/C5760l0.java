package io.grpc.internal;

import Q7.C0709m;
import io.grpc.AbstractC5720d0;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* renamed from: io.grpc.internal.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5760l0 extends O {

    /* renamed from: c, reason: collision with root package name */
    private static final ReferenceQueue f32984c = new ReferenceQueue();

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap f32985d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f32986e = Logger.getLogger(C5760l0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final a f32987b;

    /* renamed from: io.grpc.internal.l0$a */
    static final class a extends WeakReference {

        /* renamed from: f, reason: collision with root package name */
        private static final boolean f32988f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", C0709m.TRUE));

        /* renamed from: g, reason: collision with root package name */
        private static final RuntimeException f32989g = e();

        /* renamed from: a, reason: collision with root package name */
        private final ReferenceQueue f32990a;

        /* renamed from: b, reason: collision with root package name */
        private final ConcurrentMap f32991b;

        /* renamed from: c, reason: collision with root package name */
        private final String f32992c;

        /* renamed from: d, reason: collision with root package name */
        private final Reference f32993d;

        /* renamed from: e, reason: collision with root package name */
        private final AtomicBoolean f32994e;

        a(C5760l0 c5760l0, AbstractC5720d0 abstractC5720d0, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
            super(c5760l0, referenceQueue);
            this.f32994e = new AtomicBoolean();
            this.f32993d = new SoftReference(f32988f ? new RuntimeException("ManagedChannel allocation site") : f32989g);
            this.f32992c = abstractC5720d0.toString();
            this.f32990a = referenceQueue;
            this.f32991b = concurrentMap;
            concurrentMap.put(this, this);
            b(referenceQueue);
        }

        static int b(ReferenceQueue referenceQueue) {
            int i8 = 0;
            while (true) {
                a aVar = (a) referenceQueue.poll();
                if (aVar == null) {
                    return i8;
                }
                RuntimeException runtimeException = (RuntimeException) aVar.f32993d.get();
                aVar.c();
                if (!aVar.f32994e.get()) {
                    i8++;
                    Level level = Level.SEVERE;
                    if (C5760l0.f32986e.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was not shutdown properly!!! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                        logRecord.setLoggerName(C5760l0.f32986e.getName());
                        logRecord.setParameters(new Object[]{aVar.f32992c});
                        logRecord.setThrown(runtimeException);
                        C5760l0.f32986e.log(logRecord);
                    }
                }
            }
        }

        private void c() {
            super.clear();
            this.f32991b.remove(this);
            this.f32993d.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            if (this.f32994e.getAndSet(true)) {
                return;
            }
            clear();
        }

        private static RuntimeException e() {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            return runtimeException;
        }

        @Override // java.lang.ref.Reference
        public void clear() {
            c();
            b(this.f32990a);
        }
    }

    C5760l0(AbstractC5720d0 abstractC5720d0) {
        this(abstractC5720d0, f32984c, f32985d);
    }

    @Override // io.grpc.internal.O, io.grpc.AbstractC5720d0
    public AbstractC5720d0 shutdown() {
        this.f32987b.d();
        return super.shutdown();
    }

    @Override // io.grpc.internal.O, io.grpc.AbstractC5720d0
    public AbstractC5720d0 shutdownNow() {
        this.f32987b.d();
        return super.shutdownNow();
    }

    C5760l0(AbstractC5720d0 abstractC5720d0, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(abstractC5720d0);
        this.f32987b = new a(this, abstractC5720d0, referenceQueue, concurrentMap);
    }
}
