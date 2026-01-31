package B2;

import android.os.Bundle;
import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class a0 extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Long f271e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f272f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f273g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Bundle f274h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f275i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ boolean f276j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ n0 f277k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a0(n0 n0Var, Long l8, String str, String str2, Bundle bundle, boolean z8, boolean z9) {
        super(n0Var, true);
        this.f277k = n0Var;
        this.f271e = l8;
        this.f272f = str;
        this.f273g = str2;
        this.f274h = bundle;
        this.f275i = z8;
        this.f276j = z9;
    }

    @Override // B2.c0
    final void zza() {
        Long l8 = this.f271e;
        ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f277k.f318i)).logEvent(this.f272f, this.f273g, this.f274h, this.f275i, this.f276j, l8 == null ? this.f284a : l8.longValue());
    }
}
