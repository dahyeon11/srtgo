package B2;

import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class J extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC0449h f231e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n0 f232f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J(n0 n0Var, BinderC0449h binderC0449h) {
        super(n0Var, true);
        this.f232f = n0Var;
        this.f231e = binderC0449h;
    }

    @Override // B2.c0
    protected final void a() {
        this.f231e.zzd(null);
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f232f.f318i)).getCachedAppInstanceId(this.f231e);
    }
}
