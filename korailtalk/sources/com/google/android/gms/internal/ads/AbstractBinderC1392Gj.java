package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Gj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1392Gj extends AbstractBinderC1623Mc implements InterfaceC1433Hj {
    public AbstractBinderC1392Gj() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static InterfaceC1433Hj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1433Hj ? (InterfaceC1433Hj) iInterfaceQueryLocalInterface : new C1351Fj(iBinder);
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
        String string = parcel.readString();
        AbstractC1664Nc.zzc(parcel);
        zze(c4671vj, string);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1433Hj
    public abstract /* synthetic */ void zze(InterfaceC4899xj interfaceC4899xj, String str);
}
