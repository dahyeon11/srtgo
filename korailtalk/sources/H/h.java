package H;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private AtomicInteger f1532a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private final Lock f1533b;

    /* renamed from: c, reason: collision with root package name */
    private final Condition f1534c;

    h() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f1533b = reentrantLock;
        this.f1534c = reentrantLock.newCondition();
    }

    void a() {
        this.f1533b.lock();
        try {
            int andDecrement = this.f1532a.getAndDecrement();
            if (andDecrement == -1) {
                throw new IllegalStateException("Unable to decrement. Counter already destroyed");
            }
            if (andDecrement == 0) {
                throw new IllegalStateException("Unable to decrement. No corresponding counter increment");
            }
            this.f1534c.signal();
        } finally {
            this.f1533b.unlock();
        }
    }

    void b() {
        this.f1533b.lock();
        while (!this.f1532a.compareAndSet(0, -1)) {
            try {
                try {
                    this.f1534c.await();
                } catch (InterruptedException unused) {
                }
            } finally {
                this.f1533b.unlock();
            }
        }
    }

    boolean c() {
        this.f1533b.lock();
        try {
            if (this.f1532a.get() == -1) {
                this.f1533b.unlock();
                return false;
            }
            this.f1532a.getAndIncrement();
            this.f1533b.unlock();
            return true;
        } catch (Throwable th) {
            this.f1533b.unlock();
            throw th;
        }
    }
}
