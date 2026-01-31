package B2;

import i2.AbstractC5683p;

/* renamed from: B2.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0465y extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f329e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n0 f330f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0465y(n0 n0Var, String str) {
        super(n0Var, true);
        this.f330f = n0Var;
        this.f329e = str;
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f330f.f318i)).setUserId(this.f329e, this.f284a);
    }
}
