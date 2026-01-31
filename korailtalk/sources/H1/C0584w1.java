package H1;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import r2.c;

/* renamed from: H1.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0584w1 extends r2.c {
    public C0584w1() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // r2.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof C0574t0 ? (C0574t0) iInterfaceQueryLocalInterface : new C0574t0(iBinder);
    }

    public final InterfaceC0571s0 zza(Context context) {
        try {
            IBinder iBinderZze = ((C0574t0) b(context)).zze(r2.b.wrap(context), 241806000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof InterfaceC0571s0 ? (InterfaceC0571s0) iInterfaceQueryLocalInterface : new C0566q0(iBinderZze);
        } catch (RemoteException e8) {
            e = e8;
            L1.n.zzk("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (c.a e9) {
            e = e9;
            L1.n.zzk("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
