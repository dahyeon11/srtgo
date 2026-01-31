package H1;

import android.content.Context;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;

/* renamed from: H1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0556n extends AbstractC0588y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f1718b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d2 f1719c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f1720d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC1850Rn f1721e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C0585x f1722f;

    C0556n(C0585x c0585x, Context context, d2 d2Var, String str, InterfaceC1850Rn interfaceC1850Rn) {
        this.f1718b = context;
        this.f1719c = d2Var;
        this.f1720d = str;
        this.f1721e = interfaceC1850Rn;
        this.f1722f = c0585x;
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zza() {
        C0585x.i(this.f1718b, "interstitial");
        return new C1();
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzb(InterfaceC0542i0 interfaceC0542i0) {
        return interfaceC0542i0.zze(r2.b.wrap(this.f1718b), this.f1719c, this.f1720d, this.f1721e, 241806000);
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzc() {
        return this.f1722f.f1761a.zza(this.f1718b, this.f1719c, this.f1720d, this.f1721e, 2);
    }
}
