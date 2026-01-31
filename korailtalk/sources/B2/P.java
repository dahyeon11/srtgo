package B2;

import android.os.Bundle;
import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class P extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f247e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ BinderC0449h f248f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ n0 f249g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P(n0 n0Var, Bundle bundle, BinderC0449h binderC0449h) {
        super(n0Var, true);
        this.f249g = n0Var;
        this.f247e = bundle;
        this.f248f = binderC0449h;
    }

    @Override // B2.c0
    protected final void a() {
        this.f248f.zzd(null);
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f249g.f318i)).performAction(this.f247e, this.f248f, this.f284a);
    }
}
