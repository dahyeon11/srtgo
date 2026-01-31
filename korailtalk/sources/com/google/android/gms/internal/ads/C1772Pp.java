package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import r2.c;

/* renamed from: com.google.android.gms.internal.ads.Pp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1772Pp extends r2.c {
    public C1772Pp() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // r2.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2018Vp ? (InterfaceC2018Vp) iInterfaceQueryLocalInterface : new C1936Tp(iBinder);
    }

    public final InterfaceC1895Sp zza(Activity activity) {
        try {
            IBinder iBinderZze = ((InterfaceC2018Vp) b(activity)).zze(r2.b.wrap(activity));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof InterfaceC1895Sp ? (InterfaceC1895Sp) iInterfaceQueryLocalInterface : new C1813Qp(iBinderZze);
        } catch (RemoteException e8) {
            L1.n.zzk("Could not create remote AdOverlay.", e8);
            return null;
        } catch (c.a e9) {
            L1.n.zzk("Could not create remote AdOverlay.", e9);
            return null;
        }
    }
}
