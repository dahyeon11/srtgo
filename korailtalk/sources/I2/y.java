package I2;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class y implements L {

    /* renamed from: a */
    private final Executor f2040a;

    /* renamed from: b */
    private final InterfaceC0599c f2041b;

    /* renamed from: c */
    private final S f2042c;

    public y(Executor executor, InterfaceC0599c interfaceC0599c, S s8) {
        this.f2040a = executor;
        this.f2041b = interfaceC0599c;
        this.f2042c = s8;
    }

    @Override // I2.L
    public final void zzc() {
        throw new UnsupportedOperationException();
    }

    @Override // I2.L
    public final void zzd(AbstractC0608l abstractC0608l) {
        this.f2040a.execute(new x(this, abstractC0608l));
    }
}
