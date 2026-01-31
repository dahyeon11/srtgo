package c2;

import android.content.Context;
import g2.AbstractC5544f;
import h2.InterfaceC5594k;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import l0.AbstractC5879a;

/* loaded from: classes.dex */
public final class f extends AbstractC5879a implements InterfaceC5594k {

    /* renamed from: o, reason: collision with root package name */
    private Semaphore f11454o;

    /* renamed from: p, reason: collision with root package name */
    private Set f11455p;

    public f(Context context, Set<AbstractC5544f> set) {
        super(context);
        this.f11454o = new Semaphore(0);
        this.f11455p = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // l0.AbstractC5879a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final Void loadInBackground() throws InterruptedException {
        Iterator it = this.f11455p.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (((AbstractC5544f) it.next()).maybeSignIn(this)) {
                i8++;
            }
        }
        try {
            this.f11454o.tryAcquire(i8, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // l0.C5880b
    protected final void e() {
        this.f11454o.drainPermits();
        forceLoad();
    }

    @Override // h2.InterfaceC5594k
    public final void onComplete() {
        this.f11454o.release();
    }
}
