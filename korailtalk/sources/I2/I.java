package I2;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class I implements L {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f2000a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f2001b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0604h f2002c;

    public I(Executor executor, InterfaceC0604h interfaceC0604h) {
        this.f2000a = executor;
        this.f2002c = interfaceC0604h;
    }

    @Override // I2.L
    public final void zzc() {
        synchronized (this.f2001b) {
            this.f2002c = null;
        }
    }

    @Override // I2.L
    public final void zzd(AbstractC0608l abstractC0608l) {
        if (abstractC0608l.isSuccessful()) {
            synchronized (this.f2001b) {
                try {
                    if (this.f2002c == null) {
                        return;
                    }
                    this.f2000a.execute(new H(this, abstractC0608l));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
