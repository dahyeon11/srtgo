package n7;

import java.util.concurrent.Future;

/* renamed from: n7.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5990k extends A0 {

    /* renamed from: d, reason: collision with root package name */
    private final Future f34342d;

    public C5990k(Future<?> future) {
        this.f34342d = future;
    }

    @Override // n7.A0, n7.AbstractC5968D, f7.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return R6.G.INSTANCE;
    }

    @Override // n7.AbstractC5968D
    public void invoke(Throwable th) {
        if (th != null) {
            this.f34342d.cancel(false);
        }
    }
}
