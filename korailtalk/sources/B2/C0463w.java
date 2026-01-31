package B2;

import android.os.Bundle;
import i2.AbstractC5683p;

/* renamed from: B2.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0463w extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f321e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f322f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Bundle f323g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ n0 f324h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0463w(n0 n0Var, String str, String str2, Bundle bundle) {
        super(n0Var, true);
        this.f324h = n0Var;
        this.f321e = str;
        this.f322f = str2;
        this.f323g = bundle;
    }

    @Override // B2.c0
    final void zza() {
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f324h.f318i)).clearConditionalUserProperty(this.f321e, this.f322f, this.f323g);
    }
}
