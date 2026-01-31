package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Cq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1241Cq extends AbstractC5814a {
    public static final Parcelable.Creator<C1241Cq> CREATOR = new C1282Dq();
    public final ApplicationInfo zza;
    public final String zzb;
    public final PackageInfo zzc;
    public final String zzd;
    public final int zze;
    public final String zzf;
    public final List zzg;
    public final boolean zzh;
    public final boolean zzi;

    public C1241Cq(ApplicationInfo applicationInfo, String str, PackageInfo packageInfo, String str2, int i8, String str3, List list, boolean z8, boolean z9) {
        this.zzb = str;
        this.zza = applicationInfo;
        this.zzc = packageInfo;
        this.zzd = str2;
        this.zze = i8;
        this.zzf = str3;
        this.zzg = list;
        this.zzh = z8;
        this.zzi = z9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        ApplicationInfo applicationInfo = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeParcelable(parcel, 1, applicationInfo, i8, false);
        AbstractC5816c.writeString(parcel, 2, this.zzb, false);
        AbstractC5816c.writeParcelable(parcel, 3, this.zzc, i8, false);
        AbstractC5816c.writeString(parcel, 4, this.zzd, false);
        AbstractC5816c.writeInt(parcel, 5, this.zze);
        AbstractC5816c.writeString(parcel, 6, this.zzf, false);
        AbstractC5816c.writeStringList(parcel, 7, this.zzg, false);
        AbstractC5816c.writeBoolean(parcel, 8, this.zzh);
        AbstractC5816c.writeBoolean(parcel, 9, this.zzi);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
