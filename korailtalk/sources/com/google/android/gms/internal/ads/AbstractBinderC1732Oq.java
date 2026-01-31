package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Oq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1732Oq extends AbstractBinderC1623Mc implements InterfaceC1773Pq {
    public AbstractBinderC1732Oq() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC1896Sq c1814Qq = null;
        if (i8 == 1) {
            C1241Cq c1241Cq = (C1241Cq) AbstractC1664Nc.zza(parcel, C1241Cq.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                c1814Qq = iInterfaceQueryLocalInterface instanceof InterfaceC1896Sq ? (InterfaceC1896Sq) iInterfaceQueryLocalInterface : new C1814Qq(strongBinder);
            }
            AbstractC1664Nc.zzc(parcel);
            zzf(c1241Cq, c1814Qq);
        } else if (i8 == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (iInterfaceQueryLocalInterface2 instanceof InterfaceC1896Sq) {
                }
            }
            AbstractC1664Nc.zzc(parcel);
        } else {
            if (i8 != 3) {
                return false;
            }
            C1405Gq c1405Gq = (C1405Gq) AbstractC1664Nc.zza(parcel, C1405Gq.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                c1814Qq = iInterfaceQueryLocalInterface3 instanceof InterfaceC1896Sq ? (InterfaceC1896Sq) iInterfaceQueryLocalInterface3 : new C1814Qq(strongBinder3);
            }
            AbstractC1664Nc.zzc(parcel);
            zze(c1405Gq, c1814Qq);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1773Pq
    public abstract /* synthetic */ void zze(C1405Gq c1405Gq, InterfaceC1896Sq interfaceC1896Sq);

    @Override // com.google.android.gms.internal.ads.InterfaceC1773Pq
    public abstract /* synthetic */ void zzf(C1241Cq c1241Cq, InterfaceC1896Sq interfaceC1896Sq);
}
