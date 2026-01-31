package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.z50, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5059z50 implements M50 {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final Long zze;

    public C5059z50(String str, String str2, String str3, String str4, Long l8) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l8;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        AbstractC2947gb0.zzc(bundle, "gmp_app_id", this.zza);
        AbstractC2947gb0.zzc(bundle, "fbs_aiid", this.zzb);
        AbstractC2947gb0.zzc(bundle, "fbs_aeid", this.zzc);
        AbstractC2947gb0.zzc(bundle, "apm_id_origin", this.zzd);
        Long l8 = this.zze;
        if (l8 != null) {
            bundle.putLong("sai_timeout", l8.longValue());
        }
    }
}
