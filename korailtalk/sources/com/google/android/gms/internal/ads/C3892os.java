package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.os, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3892os extends AbstractC5814a {
    public static final Parcelable.Creator<C3892os> CREATOR = new C4006ps();
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final List zze;
    public final boolean zzf;
    public final boolean zzg;
    public final List zzh;

    public C3892os(String str, String str2, boolean z8, boolean z9, List list, boolean z10, boolean z11, List list2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z8;
        this.zzd = z9;
        this.zze = list;
        this.zzf = z10;
        this.zzg = z11;
        this.zzh = list2 == null ? new ArrayList() : list2;
    }

    public static C3892os zza(JSONObject jSONObject) {
        return new C3892os(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), K1.Z.zzc(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), K1.Z.zzc(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.zza;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 2, str, false);
        AbstractC5816c.writeString(parcel, 3, this.zzb, false);
        AbstractC5816c.writeBoolean(parcel, 4, this.zzc);
        AbstractC5816c.writeBoolean(parcel, 5, this.zzd);
        AbstractC5816c.writeStringList(parcel, 6, this.zze, false);
        AbstractC5816c.writeBoolean(parcel, 7, this.zzf);
        AbstractC5816c.writeBoolean(parcel, 8, this.zzg);
        AbstractC5816c.writeStringList(parcel, 9, this.zzh, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
