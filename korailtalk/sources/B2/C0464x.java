package B2;

import i2.AbstractC5683p;

/* renamed from: B2.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0464x extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f325e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f326f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ BinderC0449h f327g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ n0 f328h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0464x(n0 n0Var, String str, String str2, BinderC0449h binderC0449h) {
        super(n0Var, true);
        this.f328h = n0Var;
        this.f325e = str;
        this.f326f = str2;
        this.f327g = binderC0449h;
    }

    @Override // B2.c0
    protected final void a() {
        this.f327g.zzd(null);
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f328h.f318i)).getConditionalUserProperties(this.f325e, this.f326f, this.f327g);
    }
}
