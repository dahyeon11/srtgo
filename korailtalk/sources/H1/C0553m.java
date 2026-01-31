package H1;

import android.content.Context;

/* renamed from: H1.m */
/* loaded from: classes.dex */
final class C0553m extends AbstractC0588y {

    /* renamed from: b */
    final /* synthetic */ Context f1714b;

    /* renamed from: c */
    final /* synthetic */ d2 f1715c;

    /* renamed from: d */
    final /* synthetic */ String f1716d;

    /* renamed from: e */
    final /* synthetic */ C0585x f1717e;

    C0553m(C0585x c0585x, Context context, d2 d2Var, String str) {
        this.f1714b = context;
        this.f1715c = d2Var;
        this.f1716d = str;
        this.f1717e = c0585x;
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zza() {
        C0585x.i(this.f1714b, "search");
        return new C1();
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzb(InterfaceC0542i0 interfaceC0542i0) {
        return interfaceC0542i0.zzf(r2.b.wrap(this.f1714b), this.f1715c, this.f1716d, 241806000);
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzc() {
        return this.f1717e.f1761a.zza(this.f1714b, this.f1715c, this.f1716d, null, 3);
    }
}
