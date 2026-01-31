package B2;

import android.os.Bundle;
import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class W extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f261e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n0 f262f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W(n0 n0Var, Bundle bundle) {
        super(n0Var, true);
        this.f262f = n0Var;
        this.f261e = bundle;
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f262f.f318i)).setDefaultEventParameters(this.f261e);
    }
}
