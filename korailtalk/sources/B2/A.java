package B2;

import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class A extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Boolean f211e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n0 f212f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(n0 n0Var, Boolean bool) {
        super(n0Var, true);
        this.f212f = n0Var;
        this.f211e = bool;
    }

    @Override // B2.c0
    final void zza() {
        if (this.f211e != null) {
            ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f212f.f318i)).setMeasurementEnabled(this.f211e.booleanValue(), this.f284a);
        } else {
            ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f212f.f318i)).clearMeasurementEnabled(this.f284a);
        }
    }
}
