package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.kakao.sdk.common.Constants;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class T50 implements M50 {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;
    public final String zzg;
    public final ArrayList zzh;
    public final String zzi;
    public final String zzj;
    public final String zzk;
    public final boolean zzl;
    public final String zzm;
    public final long zzn;
    public final boolean zzo;
    public final String zzp;
    public final int zzq;

    public T50(boolean z8, boolean z9, String str, boolean z10, boolean z11, boolean z12, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z13, String str6, long j8, boolean z14, String str7, int i8) {
        this.zza = z8;
        this.zzb = z9;
        this.zzc = str;
        this.zzd = z10;
        this.zze = z11;
        this.zzf = z12;
        this.zzg = str2;
        this.zzh = arrayList;
        this.zzi = str3;
        this.zzj = str4;
        this.zzk = str5;
        this.zzl = z13;
        this.zzm = str6;
        this.zzn = j8;
        this.zzo = z14;
        this.zzp = str7;
        this.zzq = i8;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.zza);
        bundle.putBoolean("coh", this.zzb);
        bundle.putString("gl", this.zzc);
        bundle.putBoolean("simulator", this.zzd);
        bundle.putBoolean("is_latchsky", this.zze);
        bundle.putInt("build_api_level", this.zzq);
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkY)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.zzf);
        }
        bundle.putString("hl", this.zzg);
        if (!this.zzh.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.zzh);
        }
        bundle.putString("mv", this.zzi);
        bundle.putString("submodel", this.zzm);
        Bundle bundleZza = AbstractC2947gb0.zza(bundle, Constants.DEVICE);
        bundle.putBundle(Constants.DEVICE, bundleZza);
        bundleZza.putString("build", this.zzk);
        bundleZza.putLong("remaining_data_partition_space", this.zzn);
        Bundle bundleZza2 = AbstractC2947gb0.zza(bundleZza, "browser");
        bundleZza.putBundle("browser", bundleZza2);
        bundleZza2.putBoolean("is_browser_custom_tabs_capable", this.zzl);
        if (!TextUtils.isEmpty(this.zzj)) {
            Bundle bundleZza3 = AbstractC2947gb0.zza(bundleZza, "play_store");
            bundleZza.putBundle("play_store", bundleZza3);
            bundleZza3.putString("package_version", this.zzj);
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlq)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.zzo);
        }
        if (!TextUtils.isEmpty(this.zzp)) {
            bundle.putString("v_unity", this.zzp);
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlj)).booleanValue()) {
            AbstractC2947gb0.zzg(bundle, "gotmt_l", true, ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlg)).booleanValue());
            AbstractC2947gb0.zzg(bundle, "gotmt_i", true, ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlf)).booleanValue());
        }
    }
}
