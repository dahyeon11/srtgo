package B2;

import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class V extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f259e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n0 f260f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V(n0 n0Var, boolean z8) {
        super(n0Var, true);
        this.f260f = n0Var;
        this.f259e = z8;
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f260f.f318i)).setDataCollectionEnabled(this.f259e);
    }
}
