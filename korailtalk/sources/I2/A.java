package I2;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class A implements InterfaceC0604h, InterfaceC0603g, InterfaceC0601e, L {

    /* renamed from: a */
    private final Executor f1981a;

    /* renamed from: b */
    private final InterfaceC0599c f1982b;

    /* renamed from: c */
    private final S f1983c;

    public A(Executor executor, InterfaceC0599c interfaceC0599c, S s8) {
        this.f1981a = executor;
        this.f1982b = interfaceC0599c;
        this.f1983c = s8;
    }

    @Override // I2.InterfaceC0601e
    public final void onCanceled() {
        this.f1983c.zzc();
    }

    @Override // I2.InterfaceC0603g
    public final void onFailure(Exception exc) {
        this.f1983c.zza(exc);
    }

    @Override // I2.InterfaceC0604h
    public final void onSuccess(Object obj) {
        this.f1983c.zzb(obj);
    }

    @Override // I2.L
    public final void zzc() {
        throw new UnsupportedOperationException();
    }

    @Override // I2.L
    public final void zzd(AbstractC0608l abstractC0608l) {
        this.f1981a.execute(new z(this, abstractC0608l));
    }
}
