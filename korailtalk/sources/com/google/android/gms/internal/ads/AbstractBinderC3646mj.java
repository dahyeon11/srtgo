package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.mj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3646mj extends AbstractBinderC1623Mc implements InterfaceC3760nj {
    public AbstractBinderC3646mj() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static InterfaceC3760nj zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3760nj ? (InterfaceC3760nj) iInterfaceQueryLocalInterface : new C3532lj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
            AbstractC1664Nc.zzc(parcel);
            zzc(interfaceC6172aAsInterface);
        } else if (i8 == 2) {
            zzd();
        } else {
            if (i8 != 3) {
                return false;
            }
            InterfaceC6172a interfaceC6172aAsInterface2 = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
            AbstractC1664Nc.zzc(parcel);
            zzb(interfaceC6172aAsInterface2);
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zzb(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ void zzc(InterfaceC6172a interfaceC6172a);

    public abstract /* synthetic */ void zzd();
}
