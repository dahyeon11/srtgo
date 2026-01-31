package n7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public final class r extends C5966B {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f34350b = AtomicIntegerFieldUpdater.newUpdater(r.class, "_resumed");
    private volatile int _resumed;

    public r(W6.d<?> dVar, Throwable th, boolean z8) {
        if (th == null) {
            th = new CancellationException("Continuation " + dVar + " was cancelled normally");
        }
        super(th, z8);
        this._resumed = 0;
    }

    public final boolean makeResumed() {
        return f34350b.compareAndSet(this, 0, 1);
    }
}
