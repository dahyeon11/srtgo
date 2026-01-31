package H1;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.C4116qq;

/* loaded from: classes.dex */
final class r extends AbstractC0588y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f1736b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0585x f1737c;

    r(C0585x c0585x, Context context) {
        this.f1736b = context;
        this.f1737c = c0585x;
    }

    @Override // H1.AbstractC0588y
    protected final /* bridge */ /* synthetic */ Object zza() {
        C0585x.i(this.f1736b, "mobile_ads_settings");
        return new E1();
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzb(InterfaceC0542i0 interfaceC0542i0) {
        return interfaceC0542i0.zzg(r2.b.wrap(this.f1736b), 241806000);
    }

    @Override // H1.AbstractC0588y
    public final /* bridge */ /* synthetic */ Object zzc() {
        AbstractC4439th.zza(this.f1736b);
        if (!((Boolean) C.zzc().zza(AbstractC4439th.zzkI)).booleanValue()) {
            return this.f1737c.f1763c.zza(this.f1736b);
        }
        try {
            IBinder iBinderZze = ((C0574t0) L1.r.zzb(this.f1736b, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new L1.p() { // from class: H1.q
                /* JADX WARN: Multi-variable type inference failed */
                @Override // L1.p
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return iInterfaceQueryLocalInterface instanceof C0574t0 ? (C0574t0) iInterfaceQueryLocalInterface : new C0574t0(obj);
                }
            })).zze(r2.b.wrap(this.f1736b), 241806000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof InterfaceC0571s0 ? (InterfaceC0571s0) iInterfaceQueryLocalInterface : new C0566q0(iBinderZze);
        } catch (L1.q e8) {
            e = e8;
            this.f1737c.f1768h = C4116qq.zza(this.f1736b);
            this.f1737c.f1768h.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (RemoteException e9) {
            e = e9;
            this.f1737c.f1768h = C4116qq.zza(this.f1736b);
            this.f1737c.f1768h.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e10) {
            e = e10;
            this.f1737c.f1768h = C4116qq.zza(this.f1736b);
            this.f1737c.f1768h.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
