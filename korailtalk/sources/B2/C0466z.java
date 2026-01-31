package B2;

import android.app.Activity;
import i2.AbstractC5683p;

/* renamed from: B2.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0466z extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Activity f331e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f332f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f333g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ n0 f334h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0466z(n0 n0Var, Activity activity, String str, String str2) {
        super(n0Var, true);
        this.f334h = n0Var;
        this.f331e = activity;
        this.f332f = str;
        this.f333g = str2;
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f334h.f318i)).setCurrentScreen(r2.b.wrap(this.f331e), this.f332f, this.f333g, this.f284a);
    }
}
