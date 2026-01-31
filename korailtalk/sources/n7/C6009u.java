package n7;

/* renamed from: n7.u */
/* loaded from: classes3.dex */
public final class C6009u extends AbstractC6012v0 implements InterfaceC6007t {
    public final InterfaceC6011v childJob;

    public C6009u(InterfaceC6011v interfaceC6011v) {
        this.childJob = interfaceC6011v;
    }

    @Override // n7.InterfaceC6007t
    public boolean childCancelled(Throwable th) {
        return getJob().childCancelled(th);
    }

    @Override // n7.InterfaceC6007t
    public InterfaceC6008t0 getParent() {
        return getJob();
    }

    @Override // n7.AbstractC6012v0, n7.A0, n7.AbstractC5968D, f7.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return R6.G.INSTANCE;
    }

    @Override // n7.AbstractC5968D
    public void invoke(Throwable th) {
        this.childJob.parentCancelled(getJob());
    }
}
