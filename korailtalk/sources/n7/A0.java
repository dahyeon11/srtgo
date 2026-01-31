package n7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class A0 extends AbstractC5968D implements InterfaceC5973b0, InterfaceC5999o0 {
    public B0 job;

    @Override // n7.InterfaceC5973b0
    public void dispose() {
        getJob().removeNode$kotlinx_coroutines_core(this);
    }

    public final B0 getJob() {
        B0 b02 = this.job;
        if (b02 != null) {
            return b02;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    @Override // n7.InterfaceC5999o0
    public G0 getList() {
        return null;
    }

    @Override // n7.AbstractC5968D, f7.l
    public abstract /* synthetic */ Object invoke(Object obj);

    @Override // n7.InterfaceC5999o0
    public boolean isActive() {
        return true;
    }

    public final void setJob(B0 b02) {
        this.job = b02;
    }

    @Override // s7.C6260v
    public String toString() {
        return P.getClassSimpleName(this) + '@' + P.getHexAddress(this) + "[job@" + P.getHexAddress(getJob()) + ']';
    }
}
