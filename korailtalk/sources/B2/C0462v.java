package B2;

import android.os.Bundle;
import i2.AbstractC5683p;

/* renamed from: B2.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0462v extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f319e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n0 f320f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0462v(n0 n0Var, Bundle bundle) {
        super(n0Var, true);
        this.f320f = n0Var;
        this.f319e = bundle;
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f320f.f318i)).setConditionalUserProperty(this.f319e, this.f284a);
    }
}
