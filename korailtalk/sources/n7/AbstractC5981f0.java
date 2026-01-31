package n7;

import S6.C0764h;
import s7.AbstractC6257s;

/* renamed from: n7.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5981f0 extends I {

    /* renamed from: b, reason: collision with root package name */
    private long f34329b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34330c;

    /* renamed from: d, reason: collision with root package name */
    private C0764h f34331d;

    private final long b(boolean z8) {
        return z8 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void decrementUseCount$default(AbstractC5981f0 abstractC5981f0, boolean z8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        abstractC5981f0.decrementUseCount(z8);
    }

    public static /* synthetic */ void incrementUseCount$default(AbstractC5981f0 abstractC5981f0, boolean z8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        abstractC5981f0.incrementUseCount(z8);
    }

    protected long d() {
        C0764h c0764h = this.f34331d;
        return (c0764h == null || c0764h.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void decrementUseCount(boolean z8) {
        long jB = this.f34329b - b(z8);
        this.f34329b = jB;
        if (jB <= 0 && this.f34330c) {
            shutdown();
        }
    }

    public final void dispatchUnconfined(Y y8) {
        C0764h c0764h = this.f34331d;
        if (c0764h == null) {
            c0764h = new C0764h();
            this.f34331d = c0764h;
        }
        c0764h.addLast(y8);
    }

    public final void incrementUseCount(boolean z8) {
        this.f34329b += b(z8);
        if (z8) {
            return;
        }
        this.f34330c = true;
    }

    public final boolean isActive() {
        return this.f34329b > 0;
    }

    public final boolean isUnconfinedLoopActive() {
        return this.f34329b >= b(true);
    }

    public final boolean isUnconfinedQueueEmpty() {
        C0764h c0764h = this.f34331d;
        if (c0764h != null) {
            return c0764h.isEmpty();
        }
        return true;
    }

    @Override // n7.I
    public final I limitedParallelism(int i8) {
        AbstractC6257s.checkParallelism(i8);
        return this;
    }

    public long processNextEvent() {
        return !processUnconfinedEvent() ? Long.MAX_VALUE : 0L;
    }

    public final boolean processUnconfinedEvent() {
        Y y8;
        C0764h c0764h = this.f34331d;
        if (c0764h == null || (y8 = (Y) c0764h.removeFirstOrNull()) == null) {
            return false;
        }
        y8.run();
        return true;
    }

    public boolean shouldBeProcessedFromContext() {
        return false;
    }

    public void shutdown() {
    }
}
