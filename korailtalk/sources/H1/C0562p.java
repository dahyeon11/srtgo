package H1;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.C4116qq;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;

/* renamed from: H1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0562p extends AbstractC0588y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f1724b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f1725c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC1850Rn f1726d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C0585x f1727e;

    C0562p(C0585x c0585x, Context context, String str, InterfaceC1850Rn interfaceC1850Rn) {
        this.f1724b = context;
        this.f1725c = str;
        this.f1726d = interfaceC1850Rn;
        this.f1727e = c0585x;
    }

    @Override // H1.AbstractC0588y
    protected final /* bridge */ /* synthetic */ Object zza() {
        C0585x.i(this.f1724b, "native_ad");
        return new A1();
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzb(InterfaceC0542i0 interfaceC0542i0) {
        return interfaceC0542i0.zzb(r2.b.wrap(this.f1724b), this.f1725c, this.f1726d, 241806000);
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzc() {
        AbstractC4439th.zza(this.f1724b);
        if (!((Boolean) C.zzc().zza(AbstractC4439th.zzkI)).booleanValue()) {
            return this.f1727e.f1762b.zza(this.f1724b, this.f1725c, this.f1726d);
        }
        try {
            IBinder iBinderZze = ((U) L1.r.zzb(this.f1724b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new L1.p() { // from class: H1.o
                /* JADX WARN: Multi-variable type inference failed */
                @Override // L1.p
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return iInterfaceQueryLocalInterface instanceof U ? (U) iInterfaceQueryLocalInterface : new U(obj);
                }
            })).zze(r2.b.wrap(this.f1724b), this.f1725c, this.f1726d, 241806000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof T ? (T) iInterfaceQueryLocalInterface : new Q(iBinderZze);
        } catch (L1.q e8) {
            e = e8;
            this.f1727e.f1768h = C4116qq.zza(this.f1724b);
            this.f1727e.f1768h.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (RemoteException e9) {
            e = e9;
            this.f1727e.f1768h = C4116qq.zza(this.f1724b);
            this.f1727e.f1768h.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (NullPointerException e10) {
            e = e10;
            this.f1727e.f1768h = C4116qq.zza(this.f1724b);
            this.f1727e.f1768h.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
