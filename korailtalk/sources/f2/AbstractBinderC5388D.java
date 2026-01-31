package f2;

import java.lang.ref.WeakReference;

/* renamed from: f2.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractBinderC5388D extends AbstractBinderC5386B {

    /* renamed from: c, reason: collision with root package name */
    private static final WeakReference f30527c = new WeakReference(null);

    /* renamed from: b, reason: collision with root package name */
    private WeakReference f30528b;

    AbstractBinderC5388D(byte[] bArr) {
        super(bArr);
        this.f30528b = f30527c;
    }

    @Override // f2.AbstractBinderC5386B
    final byte[] c() {
        byte[] bArrD;
        synchronized (this) {
            try {
                bArrD = (byte[]) this.f30528b.get();
                if (bArrD == null) {
                    bArrD = d();
                    this.f30528b = new WeakReference(bArrD);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrD;
    }

    protected abstract byte[] d();
}
