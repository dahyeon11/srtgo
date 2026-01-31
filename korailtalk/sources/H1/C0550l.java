package H1;

import android.content.Context;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;

/* renamed from: H1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0550l extends AbstractC0588y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f1707b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d2 f1708c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f1709d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC1850Rn f1710e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C0585x f1711f;

    C0550l(C0585x c0585x, Context context, d2 d2Var, String str, InterfaceC1850Rn interfaceC1850Rn) {
        this.f1707b = context;
        this.f1708c = d2Var;
        this.f1709d = str;
        this.f1710e = interfaceC1850Rn;
        this.f1711f = c0585x;
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zza() {
        C0585x.i(this.f1707b, "app_open");
        return new C1();
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzb(InterfaceC0542i0 interfaceC0542i0) {
        return interfaceC0542i0.zzc(r2.b.wrap(this.f1707b), this.f1708c, this.f1709d, this.f1710e, 241806000);
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzc() {
        return this.f1711f.f1761a.zza(this.f1707b, this.f1708c, this.f1709d, this.f1710e, 4);
    }
}
