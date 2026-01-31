package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.Uq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1978Uq extends AbstractBinderC1623Mc implements InterfaceC2019Vq {
    public AbstractBinderC1978Uq() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) AbstractC1664Nc.zza(parcel, ParcelFileDescriptor.CREATOR);
            AbstractC1664Nc.zzc(parcel);
            zzf(parcelFileDescriptor);
        } else if (i8 == 2) {
            K1.D d9 = (K1.D) AbstractC1664Nc.zza(parcel, K1.D.CREATOR);
            AbstractC1664Nc.zzc(parcel);
            zze(d9);
        } else {
            if (i8 != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) AbstractC1664Nc.zza(parcel, ParcelFileDescriptor.CREATOR);
            C2519cr c2519cr = (C2519cr) AbstractC1664Nc.zza(parcel, C2519cr.CREATOR);
            AbstractC1664Nc.zzc(parcel);
            zzg(parcelFileDescriptor2, c2519cr);
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zze(K1.D d9);

    @Deprecated
    public abstract /* synthetic */ void zzf(ParcelFileDescriptor parcelFileDescriptor);

    public abstract /* synthetic */ void zzg(ParcelFileDescriptor parcelFileDescriptor, C2519cr c2519cr);
}
