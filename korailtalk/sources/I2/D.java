package I2;

/* loaded from: classes2.dex */
final class D implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC0608l f1988a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ E f1989b;

    D(E e8, AbstractC0608l abstractC0608l) {
        this.f1989b = e8;
        this.f1988a = abstractC0608l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f1989b.f1991b) {
            try {
                E e8 = this.f1989b;
                if (e8.f1992c != null) {
                    e8.f1992c.onComplete(this.f1988a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
