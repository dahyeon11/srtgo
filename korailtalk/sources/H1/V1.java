package H1;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;
import r2.c;

/* loaded from: classes.dex */
public final class V1 extends r2.c {
    public V1() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // r2.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterfaceQueryLocalInterface instanceof U ? (U) iInterfaceQueryLocalInterface : new U(iBinder);
    }

    public final T zza(Context context, String str, InterfaceC1850Rn interfaceC1850Rn) {
        try {
            IBinder iBinderZze = ((U) b(context)).zze(r2.b.wrap(context), str, interfaceC1850Rn, 241806000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof T ? (T) iInterfaceQueryLocalInterface : new Q(iBinderZze);
        } catch (RemoteException e8) {
            e = e8;
            L1.n.zzk("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (c.a e9) {
            e = e9;
            L1.n.zzk("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
