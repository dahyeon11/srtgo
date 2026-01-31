package B2;

import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class U extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC0449h f256e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f257f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ n0 f258g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U(n0 n0Var, BinderC0449h binderC0449h, int i8) {
        super(n0Var, true);
        this.f258g = n0Var;
        this.f256e = binderC0449h;
        this.f257f = i8;
    }

    @Override // B2.c0
    protected final void a() {
        this.f256e.zzd(null);
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f258g.f318i)).getTestFlag(this.f256e, this.f257f);
    }
}
