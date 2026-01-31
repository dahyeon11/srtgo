package B2;

import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class X extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d0 f263e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n0 f264f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X(n0 n0Var, d0 d0Var) {
        super(n0Var, true);
        this.f264f = n0Var;
        this.f263e = d0Var;
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f264f.f318i)).setEventInterceptor(this.f263e);
    }
}
