package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Xj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2088Xj extends AbstractBinderC1623Mc implements InterfaceC2129Yj {
    public AbstractBinderC2088Xj() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            String string = parcel.readString();
            AbstractC1664Nc.zzc(parcel);
            zzf(string);
        } else {
            if (i8 != 2) {
                return false;
            }
            zze();
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zze();

    public abstract /* synthetic */ void zzf(String str);
}
