package H1;

/* loaded from: classes.dex */
public final class K1 extends H0 {

    /* renamed from: a, reason: collision with root package name */
    private final U1.a f1628a;

    public K1(U1.a aVar) {
        this.f1628a = aVar;
    }

    @Override // H1.H0, H1.I0
    public final void zze() {
        U1.a aVar = this.f1628a;
        if (aVar != null) {
            aVar.onAdMetadataChanged();
        }
    }
}
