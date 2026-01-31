package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Kj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1556Kj extends AbstractBinderC1623Mc implements InterfaceC1597Lj {
    public AbstractBinderC1556Kj() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static InterfaceC1597Lj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1597Lj ? (InterfaceC1597Lj) iInterfaceQueryLocalInterface : new C1515Jj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        InterfaceC4899xj c4671vj;
        if (i8 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c4671vj = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            c4671vj = iInterfaceQueryLocalInterface instanceof InterfaceC4899xj ? (InterfaceC4899xj) iInterfaceQueryLocalInterface : new C4671vj(strongBinder);
        }
        AbstractC1664Nc.zzc(parcel);
        zze(c4671vj);
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zze(InterfaceC4899xj interfaceC4899xj);
}
