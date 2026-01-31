package H1;

import y1.AbstractC6524e;

/* loaded from: classes.dex */
public class A extends AbstractC6524e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1614a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private AbstractC6524e f1615b;

    @Override // y1.AbstractC6524e
    public final void onAdClicked() {
        synchronized (this.f1614a) {
            try {
                AbstractC6524e abstractC6524e = this.f1615b;
                if (abstractC6524e != null) {
                    abstractC6524e.onAdClicked();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y1.AbstractC6524e
    public final void onAdClosed() {
        synchronized (this.f1614a) {
            try {
                AbstractC6524e abstractC6524e = this.f1615b;
                if (abstractC6524e != null) {
                    abstractC6524e.onAdClosed();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y1.AbstractC6524e
    public void onAdFailedToLoad(y1.n nVar) {
        synchronized (this.f1614a) {
            try {
                AbstractC6524e abstractC6524e = this.f1615b;
                if (abstractC6524e != null) {
                    abstractC6524e.onAdFailedToLoad(nVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y1.AbstractC6524e
    public final void onAdImpression() {
        synchronized (this.f1614a) {
            try {
                AbstractC6524e abstractC6524e = this.f1615b;
                if (abstractC6524e != null) {
                    abstractC6524e.onAdImpression();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y1.AbstractC6524e
    public void onAdLoaded() {
        synchronized (this.f1614a) {
            try {
                AbstractC6524e abstractC6524e = this.f1615b;
                if (abstractC6524e != null) {
                    abstractC6524e.onAdLoaded();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y1.AbstractC6524e
    public final void onAdOpened() {
        synchronized (this.f1614a) {
            try {
                AbstractC6524e abstractC6524e = this.f1615b;
                if (abstractC6524e != null) {
                    abstractC6524e.onAdOpened();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza(AbstractC6524e abstractC6524e) {
        synchronized (this.f1614a) {
            this.f1615b = abstractC6524e;
        }
    }
}
