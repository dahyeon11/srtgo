package n7;

import java.util.concurrent.Future;

/* renamed from: n7.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5988j extends AbstractC5992l {

    /* renamed from: a, reason: collision with root package name */
    private final Future f34339a;

    public C5988j(Future<?> future) {
        this.f34339a = future;
    }

    @Override // n7.AbstractC5992l, n7.AbstractC5994m, f7.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return R6.G.INSTANCE;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f34339a + ']';
    }

    @Override // n7.AbstractC5994m
    public void invoke(Throwable th) {
        if (th != null) {
            this.f34339a.cancel(false);
        }
    }
}
