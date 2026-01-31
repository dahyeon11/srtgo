package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ti, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1922Ti extends AbstractC1583Lc implements InterfaceC2004Vi {
    C1922Ti(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2004Vi
    public final String zzg() {
        Parcel parcelB = b(2, a());
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2004Vi
    public final List zzh() {
        Parcel parcelB = b(3, a());
        ArrayList arrayListZzb = AbstractC1664Nc.zzb(parcelB);
        parcelB.recycle();
        return arrayListZzb;
    }
}
