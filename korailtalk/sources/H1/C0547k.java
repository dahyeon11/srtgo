package H1;

import android.content.Context;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;

/* renamed from: H1.k */
/* loaded from: classes.dex */
final class C0547k extends AbstractC0588y {

    /* renamed from: b */
    final /* synthetic */ Context f1702b;

    /* renamed from: c */
    final /* synthetic */ d2 f1703c;

    /* renamed from: d */
    final /* synthetic */ String f1704d;

    /* renamed from: e */
    final /* synthetic */ InterfaceC1850Rn f1705e;

    /* renamed from: f */
    final /* synthetic */ C0585x f1706f;

    C0547k(C0585x c0585x, Context context, d2 d2Var, String str, InterfaceC1850Rn interfaceC1850Rn) {
        this.f1702b = context;
        this.f1703c = d2Var;
        this.f1704d = str;
        this.f1705e = interfaceC1850Rn;
        this.f1706f = c0585x;
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zza() {
        C0585x.i(this.f1702b, "banner");
        return new C1();
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzb(InterfaceC0542i0 interfaceC0542i0) {
        return interfaceC0542i0.zzd(r2.b.wrap(this.f1702b), this.f1703c, this.f1704d, this.f1705e, 241806000);
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzc() {
        return this.f1706f.f1761a.zza(this.f1702b, this.f1703c, this.f1704d, this.f1705e, 1);
    }
}
