package I2;

/* loaded from: classes2.dex */
final class H implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC0608l f1998a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ I f1999b;

    H(I i8, AbstractC0608l abstractC0608l) {
        this.f1999b = i8;
        this.f1998a = abstractC0608l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f1999b.f2001b) {
            try {
                I i8 = this.f1999b;
                if (i8.f2002c != null) {
                    i8.f2002c.onSuccess(this.f1998a.getResult());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
