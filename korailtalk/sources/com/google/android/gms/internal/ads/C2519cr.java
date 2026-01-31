package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.cr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2519cr extends AbstractC5814a {
    public static final Parcelable.Creator<C2519cr> CREATOR = new C2633dr();
    public final Bundle zza;
    public final L1.a zzb;
    public final ApplicationInfo zzc;
    public final String zzd;
    public final List zze;
    public final PackageInfo zzf;
    public final String zzg;
    public final String zzh;
    public C1704Ob0 zzi;
    public String zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final Bundle zzm;

    public C2519cr(Bundle bundle, L1.a aVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, C1704Ob0 c1704Ob0, String str4, boolean z8, boolean z9, Bundle bundle2) {
        this.zza = bundle;
        this.zzb = aVar;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = c1704Ob0;
        this.zzj = str4;
        this.zzk = z8;
        this.zzl = z9;
        this.zzm = bundle2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        Bundle bundle = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeBundle(parcel, 1, bundle, false);
        AbstractC5816c.writeParcelable(parcel, 2, this.zzb, i8, false);
        AbstractC5816c.writeParcelable(parcel, 3, this.zzc, i8, false);
        AbstractC5816c.writeString(parcel, 4, this.zzd, false);
        AbstractC5816c.writeStringList(parcel, 5, this.zze, false);
        AbstractC5816c.writeParcelable(parcel, 6, this.zzf, i8, false);
        AbstractC5816c.writeString(parcel, 7, this.zzg, false);
        AbstractC5816c.writeString(parcel, 9, this.zzh, false);
        AbstractC5816c.writeParcelable(parcel, 10, this.zzi, i8, false);
        AbstractC5816c.writeString(parcel, 11, this.zzj, false);
        AbstractC5816c.writeBoolean(parcel, 12, this.zzk);
        AbstractC5816c.writeBoolean(parcel, 13, this.zzl);
        AbstractC5816c.writeBundle(parcel, 14, this.zzm, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
