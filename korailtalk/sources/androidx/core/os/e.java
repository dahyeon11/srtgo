package androidx.core.os;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private boolean f9025a;

    /* renamed from: b, reason: collision with root package name */
    private a f9026b;

    /* renamed from: c, reason: collision with root package name */
    private Object f9027c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9028d;

    public interface a {
        void onCancel();
    }

    private void a() throws InterruptedException {
        while (this.f9028d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void cancel() {
        synchronized (this) {
            try {
                if (this.f9025a) {
                    return;
                }
                this.f9025a = true;
                this.f9028d = true;
                a aVar = this.f9026b;
                Object obj = this.f9027c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f9028d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f9028d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public Object getCancellationSignalObject() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f9027c == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f9027c = cancellationSignal;
                    if (this.f9025a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f9027c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public boolean isCanceled() {
        boolean z8;
        synchronized (this) {
            z8 = this.f9025a;
        }
        return z8;
    }

    public void setOnCancelListener(a aVar) {
        synchronized (this) {
            try {
                a();
                if (this.f9026b == aVar) {
                    return;
                }
                this.f9026b = aVar;
                if (this.f9025a && aVar != null) {
                    aVar.onCancel();
                }
            } finally {
            }
        }
    }

    public void throwIfCanceled() {
        if (isCanceled()) {
            throw new n();
        }
    }
}
