package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: com.google.android.gms.internal.ads.Jl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1519Jl extends AbstractC5814a {
    public static final Parcelable.Creator<C1519Jl> CREATOR = new C1560Kl();
    public final String zza;
    public final String[] zzb;
    public final String[] zzc;

    C1519Jl(String str, String[] strArr, String[] strArr2) {
        this.zza = str;
        this.zzb = strArr;
        this.zzc = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 1, str, false);
        AbstractC5816c.writeStringArray(parcel, 2, this.zzb, false);
        AbstractC5816c.writeStringArray(parcel, 3, this.zzc, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
