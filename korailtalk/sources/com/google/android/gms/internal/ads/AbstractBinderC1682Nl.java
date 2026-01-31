package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.Nl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1682Nl extends AbstractBinderC1623Mc implements InterfaceC1723Ol {
    public AbstractBinderC1682Nl() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) AbstractC1664Nc.zza(parcel, ParcelFileDescriptor.CREATOR);
        AbstractC1664Nc.zzc(parcel);
        zzb(parcelFileDescriptor);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1723Ol
    public abstract /* synthetic */ void zzb(ParcelFileDescriptor parcelFileDescriptor);
}
