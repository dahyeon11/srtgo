package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Qr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1815Qr extends AbstractBinderC1623Mc implements InterfaceC1856Rr {
    public AbstractBinderC1815Qr() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            zzg();
        } else if (i8 == 2) {
            int i10 = parcel.readInt();
            AbstractC1664Nc.zzc(parcel);
            zze(i10);
        } else {
            if (i8 != 3) {
                return false;
            }
            C0534f1 c0534f1 = (C0534f1) AbstractC1664Nc.zza(parcel, C0534f1.CREATOR);
            AbstractC1664Nc.zzc(parcel);
            zzf(c0534f1);
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zze(int i8);

    public abstract /* synthetic */ void zzf(C0534f1 c0534f1);

    public abstract /* synthetic */ void zzg();
}
