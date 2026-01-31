package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: com.google.android.gms.internal.ads.im, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3197im extends AbstractC5814a {
    public static final Parcelable.Creator<C3197im> CREATOR = new C3424km();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    public C3197im(int i8, int i9, String str, int i10) {
        this.zza = i8;
        this.zzb = i9;
        this.zzc = str;
        this.zzd = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.zzb;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, i9);
        AbstractC5816c.writeString(parcel, 2, this.zzc, false);
        AbstractC5816c.writeInt(parcel, 3, this.zzd);
        AbstractC5816c.writeInt(parcel, 1000, this.zza);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
