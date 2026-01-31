package H1;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.C4116qq;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;
import com.google.android.gms.internal.ads.InterfaceC4343sq;
import r2.c;

/* loaded from: classes.dex */
public final class X1 extends r2.c {

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC4343sq f1633c;

    public X1() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // r2.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof Y ? (Y) iInterfaceQueryLocalInterface : new Y(iBinder);
    }

    public final X zza(Context context, d2 d2Var, String str, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        AbstractC4439th.zza(context);
        if (!((Boolean) C.zzc().zza(AbstractC4439th.zzkI)).booleanValue()) {
            try {
                IBinder iBinderZze = ((Y) b(context)).zze(r2.b.wrap(context), d2Var, str, interfaceC1850Rn, 241806000, i8);
                if (iBinderZze == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return iInterfaceQueryLocalInterface instanceof X ? (X) iInterfaceQueryLocalInterface : new V(iBinderZze);
            } catch (RemoteException e8) {
                e = e8;
                L1.n.zzf("Could not create remote AdManager.", e);
                return null;
            } catch (c.a e9) {
                e = e9;
                L1.n.zzf("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder iBinderZze2 = ((Y) L1.r.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new L1.p() { // from class: H1.W1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // L1.p
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface2 = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return iInterfaceQueryLocalInterface2 instanceof Y ? (Y) iInterfaceQueryLocalInterface2 : new Y(obj);
                }
            })).zze(r2.b.wrap(context), d2Var, str, interfaceC1850Rn, 241806000, i8);
            if (iBinderZze2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = iBinderZze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterfaceQueryLocalInterface2 instanceof X ? (X) iInterfaceQueryLocalInterface2 : new V(iBinderZze2);
        } catch (L1.q e10) {
            e = e10;
            InterfaceC4343sq interfaceC4343sqZza = C4116qq.zza(context);
            this.f1633c = interfaceC4343sqZza;
            interfaceC4343sqZza.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            L1.n.zzl("#007 Could not call remote method.", e);
            return null;
        } catch (RemoteException e11) {
            e = e11;
            InterfaceC4343sq interfaceC4343sqZza2 = C4116qq.zza(context);
            this.f1633c = interfaceC4343sqZza2;
            interfaceC4343sqZza2.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            L1.n.zzl("#007 Could not call remote method.", e);
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            InterfaceC4343sq interfaceC4343sqZza22 = C4116qq.zza(context);
            this.f1633c = interfaceC4343sqZza22;
            interfaceC4343sqZza22.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            L1.n.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
