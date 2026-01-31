package H1;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.AbstractBinderC2847fj;
import com.google.android.gms.internal.ads.AbstractBinderC3304jj;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.C4116qq;
import com.google.android.gms.internal.ads.InterfaceC3418kj;

/* renamed from: H1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0573t extends AbstractC0588y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FrameLayout f1743b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ FrameLayout f1744c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f1745d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C0585x f1746e;

    C0573t(C0585x c0585x, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f1743b = frameLayout;
        this.f1744c = frameLayout2;
        this.f1745d = context;
        this.f1746e = c0585x;
    }

    @Override // H1.AbstractC0588y
    protected final /* bridge */ /* synthetic */ Object zza() {
        C0585x.i(this.f1745d, "native_ad_view_delegate");
        return new F1();
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzb(InterfaceC0542i0 interfaceC0542i0) {
        return interfaceC0542i0.zzi(r2.b.wrap(this.f1743b), r2.b.wrap(this.f1744c));
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzc() {
        AbstractC4439th.zza(this.f1745d);
        if (!((Boolean) C.zzc().zza(AbstractC4439th.zzkI)).booleanValue()) {
            C0585x c0585x = this.f1746e;
            return c0585x.f1764d.zza(this.f1745d, this.f1743b, this.f1744c);
        }
        try {
            return AbstractBinderC2847fj.zzdA(((InterfaceC3418kj) L1.r.zzb(this.f1745d, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new L1.p() { // from class: H1.s
                /* JADX WARN: Multi-variable type inference failed */
                @Override // L1.p
                public final Object zza(Object obj) {
                    return AbstractBinderC3304jj.zzb(obj);
                }
            })).zze(r2.b.wrap(this.f1745d), r2.b.wrap(this.f1743b), r2.b.wrap(this.f1744c), 241806000));
        } catch (L1.q | RemoteException | NullPointerException e8) {
            this.f1746e.f1768h = C4116qq.zza(this.f1745d);
            this.f1746e.f1768h.zzh(e8, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
