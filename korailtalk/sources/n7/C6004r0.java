package n7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: n7.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6004r0 extends AbstractC6012v0 {

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f34351e = AtomicIntegerFieldUpdater.newUpdater(C6004r0.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: d, reason: collision with root package name */
    private final f7.l f34352d;

    public C6004r0(f7.l lVar) {
        this.f34352d = lVar;
    }

    @Override // n7.AbstractC6012v0, n7.A0, n7.AbstractC5968D, f7.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return R6.G.INSTANCE;
    }

    @Override // n7.AbstractC5968D
    public void invoke(Throwable th) {
        if (f34351e.compareAndSet(this, 0, 1)) {
            this.f34352d.invoke(th);
        }
    }
}
