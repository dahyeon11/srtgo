package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: com.google.android.gms.internal.ads.Ll, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1601Ll extends AbstractC5814a {
    public static final Parcelable.Creator<C1601Ll> CREATOR = new C1641Ml();
    public final boolean zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;
    public final String[] zze;
    public final String[] zzf;
    public final boolean zzg;
    public final long zzh;

    C1601Ll(boolean z8, String str, int i8, byte[] bArr, String[] strArr, String[] strArr2, boolean z9, long j8) {
        this.zza = z8;
        this.zzb = str;
        this.zzc = i8;
        this.zzd = bArr;
        this.zze = strArr;
        this.zzf = strArr2;
        this.zzg = z9;
        this.zzh = j8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        boolean z8 = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeBoolean(parcel, 1, z8);
        AbstractC5816c.writeString(parcel, 2, this.zzb, false);
        AbstractC5816c.writeInt(parcel, 3, this.zzc);
        AbstractC5816c.writeByteArray(parcel, 4, this.zzd, false);
        AbstractC5816c.writeStringArray(parcel, 5, this.zze, false);
        AbstractC5816c.writeStringArray(parcel, 6, this.zzf, false);
        AbstractC5816c.writeBoolean(parcel, 7, this.zzg);
        AbstractC5816c.writeLong(parcel, 8, this.zzh);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
