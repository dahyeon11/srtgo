package I2;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class C implements L {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1985a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f1986b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0601e f1987c;

    public C(Executor executor, InterfaceC0601e interfaceC0601e) {
        this.f1985a = executor;
        this.f1987c = interfaceC0601e;
    }

    @Override // I2.L
    public final void zzc() {
        synchronized (this.f1986b) {
            this.f1987c = null;
        }
    }

    @Override // I2.L
    public final void zzd(AbstractC0608l abstractC0608l) {
        if (abstractC0608l.isCanceled()) {
            synchronized (this.f1986b) {
                try {
                    if (this.f1987c == null) {
                        return;
                    }
                    this.f1985a.execute(new B(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
