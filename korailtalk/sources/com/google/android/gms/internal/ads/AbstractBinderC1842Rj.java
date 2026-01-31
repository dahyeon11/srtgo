package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Rj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1842Rj extends AbstractBinderC1623Mc implements InterfaceC1883Sj {
    public AbstractBinderC1842Rj() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static InterfaceC1883Sj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1883Sj ? (InterfaceC1883Sj) iInterfaceQueryLocalInterface : new C1801Qj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC2391bk c2170Zj;
        if (i8 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c2170Zj = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            c2170Zj = iInterfaceQueryLocalInterface instanceof InterfaceC2391bk ? (InterfaceC2391bk) iInterfaceQueryLocalInterface : new C2170Zj(strongBinder);
        }
        AbstractC1664Nc.zzc(parcel);
        zze(c2170Zj);
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zze(InterfaceC2391bk interfaceC2391bk);
}
