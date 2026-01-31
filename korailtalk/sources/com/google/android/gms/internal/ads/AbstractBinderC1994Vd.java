package com.google.android.gms.internal.ads;

import H1.C0534f1;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Vd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1994Vd extends AbstractBinderC1623Mc implements InterfaceC2035Wd {
    public AbstractBinderC1994Vd() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1623Mc
    protected final boolean a(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            zzf();
        } else if (i8 == 2) {
            zzc();
        } else if (i8 == 3) {
            C0534f1 c0534f1 = (C0534f1) AbstractC1664Nc.zza(parcel, C0534f1.CREATOR);
            AbstractC1664Nc.zzc(parcel);
            zzd(c0534f1);
        } else if (i8 == 4) {
            zze();
        } else {
            if (i8 != 5) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zzb();

    public abstract /* synthetic */ void zzc();

    public abstract /* synthetic */ void zzd(C0534f1 c0534f1);

    public abstract /* synthetic */ void zze();

    public abstract /* synthetic */ void zzf();
}
