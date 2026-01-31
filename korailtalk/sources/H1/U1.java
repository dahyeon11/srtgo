package H1;

import y1.AbstractC6525f;

/* loaded from: classes.dex */
public final class U1 extends L {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6525f f1631a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f1632b;

    public U1(AbstractC6525f abstractC6525f, Object obj) {
        this.f1631a = abstractC6525f;
        this.f1632b = obj;
    }

    @Override // H1.L, H1.M
    public final void zzb(C0534f1 c0534f1) {
        AbstractC6525f abstractC6525f = this.f1631a;
        if (abstractC6525f != null) {
            abstractC6525f.onAdFailedToLoad(c0534f1.zzb());
        }
    }

    @Override // H1.L, H1.M
    public final void zzc() {
        Object obj;
        AbstractC6525f abstractC6525f = this.f1631a;
        if (abstractC6525f == null || (obj = this.f1632b) == null) {
            return;
        }
        abstractC6525f.onAdLoaded(obj);
    }
}
