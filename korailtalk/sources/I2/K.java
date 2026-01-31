package I2;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class K implements InterfaceC0604h, InterfaceC0603g, InterfaceC0601e, L {

    /* renamed from: a */
    private final Executor f2005a;

    /* renamed from: b */
    private final InterfaceC0607k f2006b;

    /* renamed from: c */
    private final S f2007c;

    public K(Executor executor, InterfaceC0607k interfaceC0607k, S s8) {
        this.f2005a = executor;
        this.f2006b = interfaceC0607k;
        this.f2007c = s8;
    }

    @Override // I2.InterfaceC0601e
    public final void onCanceled() {
        this.f2007c.zzc();
    }

    @Override // I2.InterfaceC0603g
    public final void onFailure(Exception exc) {
        this.f2007c.zza(exc);
    }

    @Override // I2.InterfaceC0604h
    public final void onSuccess(Object obj) {
        this.f2007c.zzb(obj);
    }

    @Override // I2.L
    public final void zzc() {
        throw new UnsupportedOperationException();
    }

    @Override // I2.L
    public final void zzd(AbstractC0608l abstractC0608l) {
        this.f2005a.execute(new J(this, abstractC0608l));
    }
}
