package B2;

import android.app.Activity;
import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class h0 extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Activity f297e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ m0 f298f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h0(m0 m0Var, Activity activity) {
        super(m0Var.f308a, true);
        this.f298f = m0Var;
        this.f297e = activity;
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f298f.f308a.f318i)).onActivityResumed(r2.b.wrap(this.f297e), this.f285b);
    }
}
