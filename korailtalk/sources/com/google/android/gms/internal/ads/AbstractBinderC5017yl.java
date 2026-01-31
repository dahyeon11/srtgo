package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.yl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC5017yl extends AbstractBinderC1623Mc implements InterfaceC5131zl {
    public AbstractBinderC5017yl() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    public static InterfaceC5131zl zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5131zl ? (InterfaceC5131zl) iInterfaceQueryLocalInterface : new C4903xl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        String string = parcel.readString();
        AbstractC1664Nc.zzc(parcel);
        zzb(string);
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zzb(String str);
}
