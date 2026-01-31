package I2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class J implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC0608l f2003a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f2004b;

    J(K k8, AbstractC0608l abstractC0608l) {
        this.f2004b = k8;
        this.f2003a = abstractC0608l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC0608l abstractC0608lThen = this.f2004b.f2006b.then(this.f2003a.getResult());
            if (abstractC0608lThen == null) {
                this.f2004b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            K k8 = this.f2004b;
            Executor executor = AbstractC0610n.f2024a;
            abstractC0608lThen.addOnSuccessListener(executor, k8);
            abstractC0608lThen.addOnFailureListener(executor, this.f2004b);
            abstractC0608lThen.addOnCanceledListener(executor, this.f2004b);
        } catch (C0606j e8) {
            if (e8.getCause() instanceof Exception) {
                this.f2004b.onFailure((Exception) e8.getCause());
            } else {
                this.f2004b.onFailure(e8);
            }
        } catch (CancellationException unused) {
            this.f2004b.onCanceled();
        } catch (Exception e9) {
            this.f2004b.onFailure(e9);
        }
    }
}
