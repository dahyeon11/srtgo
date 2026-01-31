package I2;

/* loaded from: classes2.dex */
final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C f1984a;

    B(C c9) {
        this.f1984a = c9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f1984a.f1986b) {
            try {
                C c9 = this.f1984a;
                if (c9.f1987c != null) {
                    c9.f1987c.onCanceled();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
