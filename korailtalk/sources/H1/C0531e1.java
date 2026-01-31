package H1;

/* renamed from: H1.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0531e1 extends A {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0537g1 f1680c;

    C0531e1(C0537g1 c0537g1) {
        this.f1680c = c0537g1;
    }

    @Override // H1.A, y1.AbstractC6524e
    public final void onAdFailedToLoad(y1.n nVar) {
        C0537g1 c0537g1 = this.f1680c;
        c0537g1.f1686d.zzb(c0537g1.zzi());
        super.onAdFailedToLoad(nVar);
    }

    @Override // H1.A, y1.AbstractC6524e
    public final void onAdLoaded() {
        C0537g1 c0537g1 = this.f1680c;
        c0537g1.f1686d.zzb(c0537g1.zzi());
        super.onAdLoaded();
    }
}
