package B2;

import android.os.Bundle;
import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class B extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f213e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n0 f214f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(n0 n0Var, Bundle bundle) {
        super(n0Var, true);
        this.f214f = n0Var;
        this.f213e = bundle;
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f214f.f318i)).setConsent(this.f213e, this.f284a);
    }
}
