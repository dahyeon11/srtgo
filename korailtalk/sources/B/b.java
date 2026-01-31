package B;

import com.google.common.util.concurrent.C;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
class b extends d implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    private B.a f158c;

    /* renamed from: d, reason: collision with root package name */
    private final BlockingQueue f159d = new LinkedBlockingQueue(1);

    /* renamed from: e, reason: collision with root package name */
    private final CountDownLatch f160e = new CountDownLatch(1);

    /* renamed from: f, reason: collision with root package name */
    private C f161f;

    /* renamed from: g, reason: collision with root package name */
    volatile C f162g;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f163a;

        a(C c9) {
            this.f163a = c9;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    b.this.a(f.getUninterruptibly(this.f163a));
                } catch (CancellationException unused) {
                    b.this.cancel(false);
                    b.this.f162g = null;
                    return;
                } catch (ExecutionException e8) {
                    b.this.b(e8.getCause());
                }
                b.this.f162g = null;
            } catch (Throwable th) {
                b.this.f162g = null;
                throw th;
            }
        }
    }

    b(B.a aVar, C c9) {
        this.f158c = (B.a) Z.h.checkNotNull(aVar);
        this.f161f = (C) Z.h.checkNotNull(c9);
    }

    private void c(Future future, boolean z8) {
        if (future != null) {
            future.cancel(z8);
        }
    }

    private void d(BlockingQueue blockingQueue, Object obj) {
        boolean z8 = false;
        while (true) {
            try {
                blockingQueue.put(obj);
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
    }

    private Object e(BlockingQueue blockingQueue) {
        Object objTake;
        boolean z8 = false;
        while (true) {
            try {
                objTake = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        return objTake;
    }

    @Override // B.d, java.util.concurrent.Future
    public boolean cancel(boolean z8) {
        if (!super.cancel(z8)) {
            return false;
        }
        d(this.f159d, Boolean.valueOf(z8));
        c(this.f161f, z8);
        c(this.f162g, z8);
        return true;
    }

    @Override // B.d, java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            C c9 = this.f161f;
            if (c9 != null) {
                c9.get();
            }
            this.f160e.await();
            C c10 = this.f162g;
            if (c10 != null) {
                c10.get();
            }
        }
        return super.get();
    }

    @Override // java.lang.Runnable
    public void run() {
        C cApply;
        try {
        } catch (UndeclaredThrowableException e8) {
            b(e8.getCause());
        }
        try {
            try {
                try {
                    try {
                        cApply = this.f158c.apply(f.getUninterruptibly(this.f161f));
                        this.f162g = cApply;
                    } catch (CancellationException unused) {
                        cancel(false);
                    } catch (ExecutionException e9) {
                        b(e9.getCause());
                    }
                } catch (Error e10) {
                    b(e10);
                }
            } catch (Exception e11) {
                b(e11);
            }
            if (!isCancelled()) {
                cApply.addListener(new a(cApply), A.a.directExecutor());
            } else {
                cApply.cancel(((Boolean) e(this.f159d)).booleanValue());
                this.f162g = null;
            }
        } finally {
            this.f158c = null;
            this.f161f = null;
            this.f160e.countDown();
        }
    }

    @Override // B.d, java.util.concurrent.Future
    public Object get(long j8, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j8 = timeUnit2.convert(j8, timeUnit);
                timeUnit = timeUnit2;
            }
            C c9 = this.f161f;
            if (c9 != null) {
                long jNanoTime = System.nanoTime();
                c9.get(j8, timeUnit);
                j8 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f160e.await(j8, timeUnit)) {
                j8 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                C c10 = this.f162g;
                if (c10 != null) {
                    c10.get(j8, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return super.get(j8, timeUnit);
    }
}
