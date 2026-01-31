package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.Oj */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1719Oj extends AbstractBinderC1623Mc implements InterfaceC1760Pj {
    public AbstractBinderC1719Oj() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static InterfaceC1760Pj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1760Pj ? (InterfaceC1760Pj) iInterfaceQueryLocalInterface : new C1678Nj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        H1.X xZzad = H1.W.zzad(parcel.readStrongBinder());
        InterfaceC6172a interfaceC6172aAsInterface = InterfaceC6172a.AbstractBinderC0399a.asInterface(parcel.readStrongBinder());
        AbstractC1664Nc.zzc(parcel);
        zze(xZzad, interfaceC6172aAsInterface);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1760Pj
    public abstract /* synthetic */ void zze(H1.X x8, InterfaceC6172a interfaceC6172a);
}
