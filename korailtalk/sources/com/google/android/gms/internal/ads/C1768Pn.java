package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Pn */
/* loaded from: classes2.dex */
public final class C1768Pn extends AbstractC1583Lc implements InterfaceC1850Rn {
    C1768Pn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1850Rn
    public final InterfaceC1973Un zzb(String str) {
        InterfaceC1973Un c1891Sn;
        Parcel parcelA = a();
        parcelA.writeString(str);
        Parcel parcelB = b(1, parcelA);
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            c1891Sn = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            c1891Sn = iInterfaceQueryLocalInterface instanceof InterfaceC1973Un ? (InterfaceC1973Un) iInterfaceQueryLocalInterface : new C1891Sn(strongBinder);
        }
        parcelB.recycle();
        return c1891Sn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1850Rn
    public final InterfaceC1852Ro zzc(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        Parcel parcelB = b(3, parcelA);
        InterfaceC1852Ro interfaceC1852RoZzb = AbstractBinderC1811Qo.zzb(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC1852RoZzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1850Rn
    public final boolean zzd(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        Parcel parcelB = b(4, parcelA);
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1850Rn
    public final boolean zze(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        Parcel parcelB = b(2, parcelA);
        boolean zZzg = AbstractC1664Nc.zzg(parcelB);
        parcelB.recycle();
        return zZzg;
    }
}
