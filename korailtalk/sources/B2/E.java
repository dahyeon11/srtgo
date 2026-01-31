package B2;

import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class E extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f218e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n0 f219f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E(n0 n0Var, long j8) {
        super(n0Var, true);
        this.f219f = n0Var;
        this.f218e = j8;
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f219f.f318i)).setSessionTimeoutDuration(this.f218e);
    }
}
