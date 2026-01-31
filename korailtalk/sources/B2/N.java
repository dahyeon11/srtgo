package B2;

import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class N extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f239e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f240f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f241g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ BinderC0449h f242h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ n0 f243i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N(n0 n0Var, String str, String str2, boolean z8, BinderC0449h binderC0449h) {
        super(n0Var, true);
        this.f243i = n0Var;
        this.f239e = str;
        this.f240f = str2;
        this.f241g = z8;
        this.f242h = binderC0449h;
    }

    @Override // B2.c0
    protected final void a() {
        this.f242h.zzd(null);
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f243i.f318i)).getUserProperties(this.f239e, this.f240f, this.f241g, this.f242h);
    }
}
