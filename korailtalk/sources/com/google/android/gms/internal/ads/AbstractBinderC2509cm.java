package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.cm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2509cm extends AbstractBinderC1623Mc implements InterfaceC2624dm {
    public AbstractBinderC2509cm() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static InterfaceC2624dm zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2624dm ? (InterfaceC2624dm) iInterfaceQueryLocalInterface : new C2395bm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(C2051Wl.CREATOR);
        AbstractC1664Nc.zzc(parcel);
        zzb(arrayListCreateTypedArrayList);
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zzb(List list);
}
