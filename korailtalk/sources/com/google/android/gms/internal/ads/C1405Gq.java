package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: com.google.android.gms.internal.ads.Gq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1405Gq extends AbstractC5814a {
    public static final Parcelable.Creator<C1405Gq> CREATOR = new C1487Iq();
    public final String zza;
    public final int zzb;
    public final Bundle zzc;
    public final byte[] zzd;
    public final boolean zze;
    public final String zzf;
    public final String zzg;

    public C1405Gq(String str, int i8, Bundle bundle, byte[] bArr, boolean z8, String str2, String str3) {
        this.zza = str;
        this.zzb = i8;
        this.zzc = bundle;
        this.zzd = bArr;
        this.zze = z8;
        this.zzf = str2;
        this.zzg = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 1, str, false);
        AbstractC5816c.writeInt(parcel, 2, this.zzb);
        AbstractC5816c.writeBundle(parcel, 3, this.zzc, false);
        AbstractC5816c.writeByteArray(parcel, 4, this.zzd, false);
        AbstractC5816c.writeBoolean(parcel, 5, this.zze);
        AbstractC5816c.writeString(parcel, 6, this.zzf, false);
        AbstractC5816c.writeString(parcel, 7, this.zzg, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
