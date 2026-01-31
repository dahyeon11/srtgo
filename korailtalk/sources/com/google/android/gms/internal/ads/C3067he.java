package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.he, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3067he extends AbstractC5814a {
    public static final Parcelable.Creator<C3067he> CREATOR = new C3182ie();
    public final String zza;
    public final long zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final Bundle zzf;
    public final boolean zzg;
    public long zzh;
    public String zzi;
    public int zzj;

    C3067he(String str, long j8, String str2, String str3, String str4, Bundle bundle, boolean z8, long j9, String str5, int i8) {
        this.zza = str;
        this.zzb = j8;
        this.zzc = str2 == null ? "" : str2;
        this.zzd = str3 == null ? "" : str3;
        this.zze = str4 == null ? "" : str4;
        this.zzf = bundle == null ? new Bundle() : bundle;
        this.zzg = z8;
        this.zzh = j9;
        this.zzi = str5;
        this.zzj = i8;
    }

    public static C3067he zza(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                L1.n.zzj("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j8 = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new C3067he(queryParameter, j8, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException e8) {
            e = e8;
            L1.n.zzk("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e9) {
            e = e9;
            L1.n.zzk("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 2, str, false);
        AbstractC5816c.writeLong(parcel, 3, this.zzb);
        AbstractC5816c.writeString(parcel, 4, this.zzc, false);
        AbstractC5816c.writeString(parcel, 5, this.zzd, false);
        AbstractC5816c.writeString(parcel, 6, this.zze, false);
        AbstractC5816c.writeBundle(parcel, 7, this.zzf, false);
        AbstractC5816c.writeBoolean(parcel, 8, this.zzg);
        AbstractC5816c.writeLong(parcel, 9, this.zzh);
        AbstractC5816c.writeString(parcel, 10, this.zzi, false);
        AbstractC5816c.writeInt(parcel, 11, this.zzj);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
