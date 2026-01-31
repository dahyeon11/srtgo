package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2861fq extends AbstractC1583Lc implements InterfaceC3091hq {
    C2861fq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3091hq
    public final void zze(String str) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        c(2, parcelA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3091hq
    public final void zzf(List list) {
        Parcel parcelA = a();
        parcelA.writeTypedList(list);
        c(1, parcelA);
    }
}
