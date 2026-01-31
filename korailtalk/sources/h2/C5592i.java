package h2;

import com.google.android.gms.common.api.internal.BasePendingResult;
import g2.AbstractC5546h;
import g2.AbstractC5547i;
import java.util.concurrent.TimeUnit;

/* renamed from: h2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5592i extends AbstractC5546h {

    /* renamed from: a, reason: collision with root package name */
    private final BasePendingResult f31437a;

    public C5592i(AbstractC5547i abstractC5547i) {
        this.f31437a = (BasePendingResult) abstractC5547i;
    }

    @Override // g2.AbstractC5547i
    public final void addStatusListener(AbstractC5547i.a aVar) {
        this.f31437a.addStatusListener(aVar);
    }

    @Override // g2.AbstractC5547i
    public final g2.n await() {
        return this.f31437a.await();
    }

    @Override // g2.AbstractC5547i
    public final void cancel() {
        this.f31437a.cancel();
    }

    @Override // g2.AbstractC5546h
    public final g2.n get() {
        if (!this.f31437a.isReady()) {
            throw new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
        }
        return this.f31437a.await(0L, TimeUnit.MILLISECONDS);
    }

    @Override // g2.AbstractC5547i
    public final boolean isCanceled() {
        return this.f31437a.isCanceled();
    }

    @Override // g2.AbstractC5546h
    public final boolean isDone() {
        return this.f31437a.isReady();
    }

    @Override // g2.AbstractC5547i
    public final void setResultCallback(g2.o oVar) {
        this.f31437a.setResultCallback(oVar);
    }

    @Override // g2.AbstractC5547i
    public final <S extends g2.n> g2.r then(g2.q qVar) {
        return this.f31437a.then(qVar);
    }

    @Override // g2.AbstractC5547i
    public final g2.n await(long j8, TimeUnit timeUnit) {
        return this.f31437a.await(j8, timeUnit);
    }

    @Override // g2.AbstractC5547i
    public final void setResultCallback(g2.o oVar, long j8, TimeUnit timeUnit) {
        this.f31437a.setResultCallback(oVar, j8, timeUnit);
    }
}
