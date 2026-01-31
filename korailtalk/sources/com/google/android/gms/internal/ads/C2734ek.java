package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import java.util.HashMap;
import r2.c;

/* renamed from: com.google.android.gms.internal.ads.ek, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2734ek extends r2.c {
    public C2734ek() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // r2.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4102qj ? (InterfaceC4102qj) iInterfaceQueryLocalInterface : new C3874oj(iBinder);
    }

    public final InterfaceC3760nj zza(View view, HashMap map, HashMap map2) {
        try {
            IBinder iBinderZze = ((InterfaceC4102qj) b(view.getContext())).zze(r2.b.wrap(view), r2.b.wrap(map), r2.b.wrap(map2));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return iInterfaceQueryLocalInterface instanceof InterfaceC3760nj ? (InterfaceC3760nj) iInterfaceQueryLocalInterface : new C3532lj(iBinderZze);
        } catch (RemoteException e8) {
            e = e8;
            L1.n.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        } catch (c.a e9) {
            e = e9;
            L1.n.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
