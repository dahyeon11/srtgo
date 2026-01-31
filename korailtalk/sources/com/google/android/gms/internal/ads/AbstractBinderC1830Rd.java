package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Rd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1830Rd extends AbstractBinderC1623Mc implements InterfaceC1871Sd {
    public AbstractBinderC1830Rd() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static InterfaceC1871Sd zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1871Sd ? (InterfaceC1871Sd) iInterfaceQueryLocalInterface : new C1789Qd(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC1748Pd c1666Nd;
        if (i8 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c1666Nd = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                c1666Nd = iInterfaceQueryLocalInterface instanceof InterfaceC1748Pd ? (InterfaceC1748Pd) iInterfaceQueryLocalInterface : new C1666Nd(strongBinder);
            }
            AbstractC1664Nc.zzc(parcel);
            zzd(c1666Nd);
        } else if (i8 == 2) {
            parcel.readInt();
            AbstractC1664Nc.zzc(parcel);
        } else {
            if (i8 != 3) {
                return false;
            }
            C0534f1 c0534f1 = (C0534f1) AbstractC1664Nc.zza(parcel, C0534f1.CREATOR);
            AbstractC1664Nc.zzc(parcel);
            zzc(c0534f1);
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zzb(int i8);

    public abstract /* synthetic */ void zzc(C0534f1 c0534f1);

    public abstract /* synthetic */ void zzd(InterfaceC1748Pd interfaceC1748Pd);
}
