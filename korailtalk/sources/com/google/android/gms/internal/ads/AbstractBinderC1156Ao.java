package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ao, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1156Ao extends AbstractBinderC1623Mc implements InterfaceC1197Bo {
    public AbstractBinderC1156Ao() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 2) {
            zzg();
        } else if (i8 == 3) {
            String string = parcel.readString();
            AbstractC1664Nc.zzc(parcel);
            zze(string);
        } else {
            if (i8 != 4) {
                return false;
            }
            C0534f1 c0534f1 = (C0534f1) AbstractC1664Nc.zza(parcel, C0534f1.CREATOR);
            AbstractC1664Nc.zzc(parcel);
            zzf(c0534f1);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1197Bo
    public abstract /* synthetic */ void zze(String str);

    @Override // com.google.android.gms.internal.ads.InterfaceC1197Bo
    public abstract /* synthetic */ void zzf(C0534f1 c0534f1);

    @Override // com.google.android.gms.internal.ads.InterfaceC1197Bo
    public abstract /* synthetic */ void zzg();
}
