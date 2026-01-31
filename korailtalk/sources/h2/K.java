package h2;

/* loaded from: classes.dex */
final class K implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ G2.l f31390a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ M f31391b;

    K(M m8, G2.l lVar) {
        this.f31391b = m8;
        this.f31390a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        M.c(this.f31391b, this.f31390a);
    }
}
