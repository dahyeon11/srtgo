package H1;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC1854Rp;
import com.google.android.gms.internal.ads.AbstractBinderC1977Up;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.C4116qq;
import com.google.android.gms.internal.ads.InterfaceC2018Vp;

/* renamed from: H1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0520b extends AbstractC0588y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f1647b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0585x f1648c;

    C0520b(C0585x c0585x, Activity activity) {
        this.f1647b = activity;
        this.f1648c = c0585x;
    }

    @Override // H1.AbstractC0588y
    protected final /* bridge */ /* synthetic */ Object zza() {
        C0585x.i(this.f1647b, "ad_overlay");
        return null;
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzb(InterfaceC0542i0 interfaceC0542i0) {
        return interfaceC0542i0.zzm(r2.b.wrap(this.f1647b));
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzc() {
        AbstractC4439th.zza(this.f1647b);
        if (!((Boolean) C.zzc().zza(AbstractC4439th.zzkI)).booleanValue()) {
            C0585x c0585x = this.f1648c;
            return c0585x.f1766f.zza(this.f1647b);
        }
        try {
            return AbstractBinderC1854Rp.zzI(((InterfaceC2018Vp) L1.r.zzb(this.f1647b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new L1.p() { // from class: H1.m2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // L1.p
                public final Object zza(Object obj) {
                    return AbstractBinderC1977Up.zzb(obj);
                }
            })).zze(r2.b.wrap(this.f1647b)));
        } catch (L1.q | RemoteException | NullPointerException e8) {
            this.f1648c.f1768h = C4116qq.zza(this.f1647b.getApplicationContext());
            this.f1648c.f1768h.zzh(e8, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
