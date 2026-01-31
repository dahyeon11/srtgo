package B2;

import android.os.Bundle;
import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class C extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f215e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n0 f216f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C(n0 n0Var, Bundle bundle) {
        super(n0Var, true);
        this.f216f = n0Var;
        this.f215e = bundle;
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f216f.f318i)).setConsentThirdParty(this.f215e, this.f284a);
    }
}
