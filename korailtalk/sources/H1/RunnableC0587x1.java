package H1;

import android.os.RemoteException;

/* renamed from: H1.x1 */
/* loaded from: classes.dex */
final class RunnableC0587x1 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BinderC0593z1 f1769a;

    RunnableC0587x1(BinderC0593z1 binderC0593z1) {
        this.f1769a = binderC0593z1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A1 a12 = this.f1769a.f1777a;
        if (a12.f1616a != null) {
            try {
                a12.f1616a.zze(1);
            } catch (RemoteException e8) {
                L1.n.zzk("Could not notify onAdFailedToLoad event.", e8);
            }
        }
    }
}
