package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.om, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3880om extends AbstractBinderC1623Mc implements InterfaceC3994pm {
    public AbstractBinderC3880om() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            if (i8 != 2) {
                return false;
            }
            parcel.readInt();
            AbstractC1664Nc.zzc(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zze(int i8);

    public abstract /* synthetic */ void zzf();
}
