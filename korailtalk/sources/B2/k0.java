package B2;

import android.app.Activity;
import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class k0 extends c0 {

    /* renamed from: e */
    final /* synthetic */ Activity f303e;

    /* renamed from: f */
    final /* synthetic */ BinderC0449h f304f;

    /* renamed from: g */
    final /* synthetic */ m0 f305g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k0(m0 m0Var, Activity activity, BinderC0449h binderC0449h) {
        super(m0Var.f308a, true);
        this.f305g = m0Var;
        this.f303e = activity;
        this.f304f = binderC0449h;
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f305g.f308a.f318i)).onActivitySaveInstanceState(r2.b.wrap(this.f303e), this.f304f, this.f285b);
    }
}
