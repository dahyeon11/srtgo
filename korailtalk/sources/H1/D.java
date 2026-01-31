package H1;

/* loaded from: classes.dex */
public final class D extends AbstractBinderC0551l0 {

    /* renamed from: a, reason: collision with root package name */
    private final y1.m f1626a;

    public D(y1.m mVar) {
        this.f1626a = mVar;
    }

    @Override // H1.AbstractBinderC0551l0, H1.InterfaceC0554m0
    public final void zzb() {
        y1.m mVar = this.f1626a;
        if (mVar != null) {
            mVar.onAdClicked();
        }
    }

    @Override // H1.AbstractBinderC0551l0, H1.InterfaceC0554m0
    public final void zzc() {
        y1.m mVar = this.f1626a;
        if (mVar != null) {
            mVar.onAdDismissedFullScreenContent();
        }
    }

    @Override // H1.AbstractBinderC0551l0, H1.InterfaceC0554m0
    public final void zzd(C0534f1 c0534f1) {
        y1.m mVar = this.f1626a;
        if (mVar != null) {
            mVar.onAdFailedToShowFullScreenContent(c0534f1.zza());
        }
    }

    @Override // H1.AbstractBinderC0551l0, H1.InterfaceC0554m0
    public final void zze() {
        y1.m mVar = this.f1626a;
        if (mVar != null) {
            mVar.onAdImpression();
        }
    }

    @Override // H1.AbstractBinderC0551l0, H1.InterfaceC0554m0
    public final void zzf() {
        y1.m mVar = this.f1626a;
        if (mVar != null) {
            mVar.onAdShowedFullScreenContent();
        }
    }
}
