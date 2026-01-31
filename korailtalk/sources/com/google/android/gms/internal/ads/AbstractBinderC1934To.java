package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.To, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1934To extends AbstractBinderC1623Mc implements InterfaceC1975Uo {
    public AbstractBinderC1934To() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            String string = parcel.readString();
            AbstractC1664Nc.zzc(parcel);
            zze(string);
        } else if (i8 == 2) {
            String string2 = parcel.readString();
            AbstractC1664Nc.zzc(parcel);
            zzf(string2);
        } else {
            if (i8 != 3) {
                return false;
            }
            C0534f1 c0534f1 = (C0534f1) AbstractC1664Nc.zza(parcel, C0534f1.CREATOR);
            AbstractC1664Nc.zzc(parcel);
            zzg(c0534f1);
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zze(String str);

    public abstract /* synthetic */ void zzf(String str);

    public abstract /* synthetic */ void zzg(C0534f1 c0534f1);
}
