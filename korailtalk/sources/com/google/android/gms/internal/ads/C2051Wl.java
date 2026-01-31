package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: com.google.android.gms.internal.ads.Wl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2051Wl extends AbstractC5814a {
    public static final Parcelable.Creator<C2051Wl> CREATOR = new C2092Xl();
    public final String zza;
    public final boolean zzb;
    public final int zzc;
    public final String zzd;

    public C2051Wl(String str, boolean z8, int i8, String str2) {
        this.zza = str;
        this.zzb = z8;
        this.zzc = i8;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 1, str, false);
        AbstractC5816c.writeBoolean(parcel, 2, this.zzb);
        AbstractC5816c.writeInt(parcel, 3, this.zzc);
        AbstractC5816c.writeString(parcel, 4, this.zzd, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
