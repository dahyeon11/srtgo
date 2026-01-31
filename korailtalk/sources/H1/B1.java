package H1;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class B1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1 f1620a;

    B1(C1 c12) {
        this.f1620a = c12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1 c12 = this.f1620a;
        if (c12.f1625a != null) {
            try {
                c12.f1625a.zze(1);
            } catch (RemoteException e8) {
                L1.n.zzk("Could not notify onAdFailedToLoad event.", e8);
            }
        }
    }
}
