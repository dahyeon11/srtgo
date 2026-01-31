package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ps, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1775Ps extends AbstractBinderC1623Mc implements InterfaceC1816Qs {
    public AbstractBinderC1775Ps() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            parcel.readString();
            parcel.readString();
            AbstractC1664Nc.zzc(parcel);
        } else if (i8 == 2) {
            String string = parcel.readString();
            AbstractC1664Nc.zzc(parcel);
            zzb(string);
        } else {
            if (i8 != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC1664Nc.zza(parcel, Bundle.CREATOR);
            AbstractC1664Nc.zzc(parcel);
            zzc(string2, string3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1816Qs
    public abstract /* synthetic */ void zzb(String str);

    @Override // com.google.android.gms.internal.ads.InterfaceC1816Qs
    public abstract /* synthetic */ void zzc(String str, String str2, Bundle bundle);
}
