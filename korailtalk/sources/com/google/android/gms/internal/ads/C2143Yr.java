package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: com.google.android.gms.internal.ads.Yr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2143Yr extends AbstractC5814a {
    public static final Parcelable.Creator<C2143Yr> CREATOR = new C2184Zr();
    public final String zza;
    public final String zzb;

    public C2143Yr(U1.e eVar) {
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 1, str, false);
        AbstractC5816c.writeString(parcel, 2, this.zzb, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C2143Yr(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }
}
