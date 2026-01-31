package B2;

import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class I extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC0449h f229e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n0 f230f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I(n0 n0Var, BinderC0449h binderC0449h) {
        super(n0Var, true);
        this.f230f = n0Var;
        this.f229e = binderC0449h;
    }

    @Override // B2.c0
    protected final void a() {
        this.f229e.zzd(null);
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f230f.f318i)).getGmpAppId(this.f229e);
    }
}
