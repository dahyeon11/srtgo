package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class D50 implements M50 {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;

    D50(boolean z8, boolean z9, String str, boolean z10, int i8, int i9, int i10, String str2) {
        this.zza = z8;
        this.zzb = z9;
        this.zzc = str;
        this.zzd = z10;
        this.zze = i8;
        this.zzf = i9;
        this.zzg = i10;
        this.zzh = str2;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.zzc);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) H1.C.zzc().zza(AbstractC4439th.zzdJ));
        bundle.putInt("target_api", this.zze);
        bundle.putInt("dv", this.zzf);
        bundle.putInt("lv", this.zzg);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgd)).booleanValue() && !TextUtils.isEmpty(this.zzh)) {
            bundle.putString("ev", this.zzh);
        }
        Bundle bundleZza = AbstractC2947gb0.zza(bundle, "sdk_env");
        bundleZza.putBoolean("mf", ((Boolean) AbstractC4100qi.zzc.zze()).booleanValue());
        bundleZza.putBoolean("instant_app", this.zza);
        bundleZza.putBoolean("lite", this.zzb);
        bundleZza.putBoolean("is_privileged_process", this.zzd);
        bundle.putBundle("sdk_env", bundleZza);
        Bundle bundleZza2 = AbstractC2947gb0.zza(bundleZza, "build_meta");
        bundleZza2.putString("cl", "636244245");
        bundleZza2.putString("rapid_rc", "dev");
        bundleZza2.putString("rapid_rollup", "HEAD");
        bundleZza.putBundle("build_meta", bundleZza2);
    }
}
