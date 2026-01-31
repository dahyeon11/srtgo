package I2;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC0608l f2043a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ A f2044b;

    z(A a9, AbstractC0608l abstractC0608l) {
        this.f2044b = a9;
        this.f2043a = abstractC0608l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC0608l abstractC0608l = (AbstractC0608l) this.f2044b.f1982b.then(this.f2043a);
            if (abstractC0608l == null) {
                this.f2044b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            A a9 = this.f2044b;
            Executor executor = AbstractC0610n.f2024a;
            abstractC0608l.addOnSuccessListener(executor, a9);
            abstractC0608l.addOnFailureListener(executor, this.f2044b);
            abstractC0608l.addOnCanceledListener(executor, this.f2044b);
        } catch (C0606j e8) {
            if (e8.getCause() instanceof Exception) {
                this.f2044b.f1983c.zza((Exception) e8.getCause());
            } else {
                this.f2044b.f1983c.zza(e8);
            }
        } catch (Exception e9) {
            this.f2044b.f1983c.zza(e9);
        }
    }
}
