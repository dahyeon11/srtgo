package s7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import n7.I0;

/* loaded from: classes3.dex */
public abstract class H extends AbstractC6245f implements I0 {

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f36323c = AtomicIntegerFieldUpdater.newUpdater(H.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;
    public final long id;

    public H(long j8, H h8, int i8) {
        super(h8);
        this.id = j8;
        this.cleanedAndPointers = i8 << 16;
    }

    public final boolean decPointers$kotlinx_coroutines_core() {
        return f36323c.addAndGet(this, W.a.CATEGORY_MASK) == getNumberOfSlots() && !isTail();
    }

    public abstract int getNumberOfSlots();

    @Override // s7.AbstractC6245f
    public boolean isRemoved() {
        return f36323c.get(this) == getNumberOfSlots() && !isTail();
    }

    public abstract void onCancellation(int i8, Throwable th, W6.g gVar);

    public final void onSlotCleaned() {
        if (f36323c.incrementAndGet(this) == getNumberOfSlots()) {
            remove();
        }
    }

    public final boolean tryIncPointers$kotlinx_coroutines_core() {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f36323c;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 == getNumberOfSlots() && !isTail()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, 65536 + i8));
        return true;
    }
}
