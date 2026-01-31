package H1;

import android.content.Context;
import com.google.android.gms.internal.ads.C2061Wr;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;

/* renamed from: H1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0582w extends AbstractC0588y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f1757b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f1758c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC1850Rn f1759d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C0585x f1760e;

    C0582w(C0585x c0585x, Context context, String str, InterfaceC1850Rn interfaceC1850Rn) {
        this.f1757b = context;
        this.f1758c = str;
        this.f1759d = interfaceC1850Rn;
        this.f1760e = c0585x;
    }

    @Override // H1.AbstractC0588y
    protected final /* bridge */ /* synthetic */ Object zza() {
        C0585x.i(this.f1757b, "rewarded");
        return new J1();
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzb(InterfaceC0542i0 interfaceC0542i0) {
        return interfaceC0542i0.zzo(r2.b.wrap(this.f1757b), this.f1758c, this.f1759d, 241806000);
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzc() {
        return C2061Wr.zza(this.f1757b, this.f1758c, this.f1759d);
    }
}
