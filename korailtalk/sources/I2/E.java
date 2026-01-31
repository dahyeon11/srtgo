package I2;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class E implements L {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1990a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f1991b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0602f f1992c;

    public E(Executor executor, InterfaceC0602f interfaceC0602f) {
        this.f1990a = executor;
        this.f1992c = interfaceC0602f;
    }

    @Override // I2.L
    public final void zzc() {
        synchronized (this.f1991b) {
            this.f1992c = null;
        }
    }

    @Override // I2.L
    public final void zzd(AbstractC0608l abstractC0608l) {
        synchronized (this.f1991b) {
            try {
                if (this.f1992c == null) {
                    return;
                }
                this.f1990a.execute(new D(this, abstractC0608l));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
