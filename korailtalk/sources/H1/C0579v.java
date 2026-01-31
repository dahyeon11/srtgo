package H1;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractBinderC3646mj;
import com.google.android.gms.internal.ads.AbstractBinderC3988pj;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.C4116qq;
import com.google.android.gms.internal.ads.InterfaceC4102qj;
import java.util.HashMap;

/* renamed from: H1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0579v extends AbstractC0588y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f1750b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ HashMap f1751c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ HashMap f1752d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C0585x f1753e;

    C0579v(C0585x c0585x, View view, HashMap map, HashMap map2) {
        this.f1750b = view;
        this.f1751c = map;
        this.f1752d = map2;
        this.f1753e = c0585x;
    }

    @Override // H1.AbstractC0588y
    protected final /* bridge */ /* synthetic */ Object zza() {
        C0585x.i(this.f1750b.getContext(), "native_ad_view_holder_delegate");
        return new H1();
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzb(InterfaceC0542i0 interfaceC0542i0) {
        HashMap map = this.f1752d;
        return interfaceC0542i0.zzj(r2.b.wrap(this.f1750b), r2.b.wrap(this.f1751c), r2.b.wrap(map));
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzc() {
        AbstractC4439th.zza(this.f1750b.getContext());
        if (!((Boolean) C.zzc().zza(AbstractC4439th.zzkI)).booleanValue()) {
            C0585x c0585x = this.f1753e;
            return c0585x.f1767g.zza(this.f1750b, this.f1751c, this.f1752d);
        }
        try {
            return AbstractBinderC3646mj.zze(((InterfaceC4102qj) L1.r.zzb(this.f1750b.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new L1.p() { // from class: H1.u
                /* JADX WARN: Multi-variable type inference failed */
                @Override // L1.p
                public final Object zza(Object obj) {
                    return AbstractBinderC3988pj.zzb(obj);
                }
            })).zze(r2.b.wrap(this.f1750b), r2.b.wrap(this.f1751c), r2.b.wrap(this.f1752d)));
        } catch (L1.q | RemoteException | NullPointerException e8) {
            this.f1753e.f1768h = C4116qq.zza(this.f1750b.getContext());
            this.f1753e.f1768h.zzh(e8, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }
}
