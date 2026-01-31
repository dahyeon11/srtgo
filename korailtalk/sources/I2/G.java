package I2;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class G implements L {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f1995a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f1996b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0603g f1997c;

    public G(Executor executor, InterfaceC0603g interfaceC0603g) {
        this.f1995a = executor;
        this.f1997c = interfaceC0603g;
    }

    @Override // I2.L
    public final void zzc() {
        synchronized (this.f1996b) {
            this.f1997c = null;
        }
    }

    @Override // I2.L
    public final void zzd(AbstractC0608l abstractC0608l) {
        if (abstractC0608l.isSuccessful() || abstractC0608l.isCanceled()) {
            return;
        }
        synchronized (this.f1996b) {
            try {
                if (this.f1997c == null) {
                    return;
                }
                this.f1995a.execute(new F(this, abstractC0608l));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
