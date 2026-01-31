package B2;

import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class L extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC0449h f235e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n0 f236f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L(n0 n0Var, BinderC0449h binderC0449h) {
        super(n0Var, true);
        this.f236f = n0Var;
        this.f235e = binderC0449h;
    }

    @Override // B2.c0
    protected final void a() {
        this.f235e.zzd(null);
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f236f.f318i)).getCurrentScreenName(this.f235e);
    }
}
