package I2;

import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class F implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC0608l f1993a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ G f1994b;

    F(G g8, AbstractC0608l abstractC0608l) {
        this.f1994b = g8;
        this.f1993a = abstractC0608l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f1994b.f1996b) {
            try {
                G g8 = this.f1994b;
                if (g8.f1997c != null) {
                    g8.f1997c.onFailure((Exception) AbstractC5683p.checkNotNull(this.f1993a.getException()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
