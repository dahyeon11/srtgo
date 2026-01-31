package n7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import s7.AbstractC6252m;

/* loaded from: classes3.dex */
public final class X extends s7.G {

    /* renamed from: d */
    private static final AtomicIntegerFieldUpdater f34317d = AtomicIntegerFieldUpdater.newUpdater(X.class, "_decision");
    private volatile int _decision;

    public X(W6.g gVar, W6.d<Object> dVar) {
        super(gVar, dVar);
    }

    private final boolean W() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f34317d;
        do {
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 != 0) {
                if (i8 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f34317d.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean X() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f34317d;
        do {
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 != 0) {
                if (i8 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f34317d.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // s7.G, n7.AbstractC5970a
    protected void U(Object obj) {
        if (W()) {
            return;
        }
        AbstractC6252m.resumeCancellableWith$default(X6.b.intercepted(this.uCont), F.recoverResult(obj, this.uCont), null, 2, null);
    }

    @Override // s7.G, n7.B0
    protected void f(Object obj) {
        U(obj);
    }

    public final Object getResult() {
        if (X()) {
            return X6.b.getCOROUTINE_SUSPENDED();
        }
        Object objUnboxState = C0.unboxState(getState$kotlinx_coroutines_core());
        if (objUnboxState instanceof C5966B) {
            throw ((C5966B) objUnboxState).cause;
        }
        return objUnboxState;
    }
}
