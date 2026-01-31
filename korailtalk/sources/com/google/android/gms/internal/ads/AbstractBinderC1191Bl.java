package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Bl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1191Bl extends AbstractBinderC1623Mc implements InterfaceC1232Cl {
    public AbstractBinderC1191Bl() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    public static InterfaceC1232Cl zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1232Cl ? (InterfaceC1232Cl) iInterfaceQueryLocalInterface : new C1150Al(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            String string = parcel.readString();
            AbstractC1664Nc.zzc(parcel);
            zzf(string);
        } else {
            if (i8 != 2) {
                return false;
            }
            zze();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1232Cl
    public abstract /* synthetic */ void zze();

    @Override // com.google.android.gms.internal.ads.InterfaceC1232Cl
    public abstract /* synthetic */ void zzf(String str);
}
