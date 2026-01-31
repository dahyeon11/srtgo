package B2;

import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class O extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f244e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f245f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ n0 f246g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O(n0 n0Var, boolean z8, int i8, String str, Object obj, Object obj2, Object obj3) {
        super(n0Var, false);
        this.f246g = n0Var;
        this.f244e = str;
        this.f245f = obj;
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f246g.f318i)).logHealthData(5, this.f244e, r2.b.wrap(this.f245f), r2.b.wrap(null), r2.b.wrap(null));
    }
}
