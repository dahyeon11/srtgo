package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Jg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1510Jg0 extends AbstractC1583Lc implements IInterface {
    C1510Jg0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final C1428Hg0 zze(C1346Fg0 c1346Fg0) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c1346Fg0);
        Parcel parcelB = b(1, parcelA);
        C1428Hg0 c1428Hg0 = (C1428Hg0) AbstractC1664Nc.zza(parcelB, C1428Hg0.CREATOR);
        parcelB.recycle();
        return c1428Hg0;
    }

    public final C1837Rg0 zzf(C1714Og0 c1714Og0) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c1714Og0);
        Parcel parcelB = b(3, parcelA);
        C1837Rg0 c1837Rg0 = (C1837Rg0) AbstractC1664Nc.zza(parcelB, C1837Rg0.CREATOR);
        parcelB.recycle();
        return c1837Rg0;
    }

    public final void zzg(C1223Cg0 c1223Cg0) {
        Parcel parcelA = a();
        AbstractC1664Nc.zzd(parcelA, c1223Cg0);
        c(2, parcelA);
    }
}
