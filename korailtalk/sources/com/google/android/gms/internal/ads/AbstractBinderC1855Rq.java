package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.Rq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1855Rq extends AbstractBinderC1623Mc implements InterfaceC1896Sq {
    public AbstractBinderC1855Rq() {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) AbstractC1664Nc.zza(parcel, ParcelFileDescriptor.CREATOR);
            AbstractC1664Nc.zzc(parcel);
            zzf(parcelFileDescriptor);
        } else {
            if (i8 != 2) {
                return false;
            }
            K1.D d9 = (K1.D) AbstractC1664Nc.zza(parcel, K1.D.CREATOR);
            AbstractC1664Nc.zzc(parcel);
            zze(d9);
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zze(K1.D d9);

    public abstract /* synthetic */ void zzf(ParcelFileDescriptor parcelFileDescriptor);
}
