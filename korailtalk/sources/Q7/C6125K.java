package q7;

import r7.AbstractC6187d;

/* renamed from: q7.K, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6125K extends AbstractC6187d {
    public W6.d<? super R6.G> cont;
    public long index = -1;

    @Override // r7.AbstractC6187d
    public boolean allocateLocked(C6123I c6123i) {
        if (this.index >= 0) {
            return false;
        }
        this.index = c6123i.updateNewCollectorIndexLocked$kotlinx_coroutines_core();
        return true;
    }

    @Override // r7.AbstractC6187d
    public W6.d<R6.G>[] freeLocked(C6123I c6123i) {
        long j8 = this.index;
        this.index = -1L;
        this.cont = null;
        return c6123i.updateCollectorIndexLocked$kotlinx_coroutines_core(j8);
    }
}
