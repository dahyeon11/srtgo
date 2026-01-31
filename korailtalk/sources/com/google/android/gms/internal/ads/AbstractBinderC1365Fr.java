package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Fr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1365Fr extends AbstractBinderC1623Mc implements InterfaceC1406Gr {
    public AbstractBinderC1365Fr() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static InterfaceC1406Gr zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1406Gr ? (InterfaceC1406Gr) iInterfaceQueryLocalInterface : new C1324Er(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        } else {
            if (i8 != 2) {
                return false;
            }
            int iZze = zze();
            parcel2.writeNoException();
            parcel2.writeInt(iZze);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1406Gr
    public abstract /* synthetic */ int zze();

    @Override // com.google.android.gms.internal.ads.InterfaceC1406Gr
    public abstract /* synthetic */ String zzf();
}
