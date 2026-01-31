package B2;

import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class Z extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e0 f267e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n0 f268f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z(n0 n0Var, e0 e0Var) {
        super(n0Var, true);
        this.f268f = n0Var;
        this.f267e = e0Var;
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f268f.f318i)).unregisterOnMeasurementEventListener(this.f267e);
    }
}
