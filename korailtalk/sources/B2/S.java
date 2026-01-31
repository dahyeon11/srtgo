package B2;

import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class S extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f251e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ BinderC0449h f252f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ n0 f253g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S(n0 n0Var, String str, BinderC0449h binderC0449h) {
        super(n0Var, true);
        this.f253g = n0Var;
        this.f251e = str;
        this.f252f = binderC0449h;
    }

    @Override // B2.c0
    protected final void a() {
        this.f252f.zzd(null);
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f253g.f318i)).getMaxUserProperties(this.f251e, this.f252f);
    }
}
