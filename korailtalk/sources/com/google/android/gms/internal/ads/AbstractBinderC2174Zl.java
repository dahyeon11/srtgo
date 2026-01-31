package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Zl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2174Zl extends AbstractBinderC1623Mc implements InterfaceC2280am {
    public AbstractBinderC2174Zl() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static InterfaceC2280am zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2280am ? (InterfaceC2280am) iInterfaceQueryLocalInterface : new C2133Yl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 2) {
            zzf();
        } else {
            if (i8 != 3) {
                return false;
            }
            String string = parcel.readString();
            AbstractC1664Nc.zzc(parcel);
            zze(string);
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zze(String str);

    public abstract /* synthetic */ void zzf();
}
