package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: com.google.android.gms.internal.ads.Og0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1714Og0 extends AbstractC5814a {
    public static final Parcelable.Creator<C1714Og0> CREATOR = new C1796Qg0();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;

    C1714Og0(int i8, int i9, int i10, String str, String str2) {
        this.zza = i8;
        this.zzb = i9;
        this.zzc = str;
        this.zzd = str2;
        this.zze = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, i9);
        AbstractC5816c.writeInt(parcel, 2, this.zzb);
        AbstractC5816c.writeString(parcel, 3, this.zzc, false);
        AbstractC5816c.writeString(parcel, 4, this.zzd, false);
        AbstractC5816c.writeInt(parcel, 5, this.zze);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C1714Og0(int i8, EnumC1214Cc enumC1214Cc, String str, String str2) {
        this(1, 1, enumC1214Cc.zza(), str, str2);
    }
}
