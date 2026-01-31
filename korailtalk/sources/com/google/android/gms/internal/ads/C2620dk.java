package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import r2.c;

/* renamed from: com.google.android.gms.internal.ads.dk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2620dk extends r2.c {
    public C2620dk() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // r2.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3418kj ? (InterfaceC3418kj) iInterfaceQueryLocalInterface : new C3191ij(iBinder);
    }

    public final InterfaceC2962gj zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder iBinderZze = ((InterfaceC3418kj) b(context)).zze(r2.b.wrap(context), r2.b.wrap(frameLayout), r2.b.wrap(frameLayout2), 241806000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof InterfaceC2962gj ? (InterfaceC2962gj) iInterfaceQueryLocalInterface : new C2732ej(iBinderZze);
        } catch (RemoteException e8) {
            e = e8;
            L1.n.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (c.a e9) {
            e = e9;
            L1.n.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
