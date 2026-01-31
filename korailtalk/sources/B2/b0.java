package B2;

import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class b0 extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f278e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f279f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Object f280g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f281h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ n0 f282i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b0(n0 n0Var, String str, String str2, Object obj, boolean z8) {
        super(n0Var, true);
        this.f282i = n0Var;
        this.f278e = str;
        this.f279f = str2;
        this.f280g = obj;
        this.f281h = z8;
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f282i.f318i)).setUserProperty(this.f278e, this.f279f, r2.b.wrap(this.f280g), this.f281h, this.f284a);
    }
}
