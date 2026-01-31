package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.kakao.sdk.common.Constants;

/* loaded from: classes2.dex */
public final class X50 implements M50 {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public X50(String str, int i8, int i9, int i10, boolean z8, int i11) {
        this.zza = str;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = i10;
        this.zze = z8;
        this.zzf = i11;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        AbstractC2947gb0.zzf(bundle, "carrier", this.zza, !TextUtils.isEmpty(this.zza));
        int i8 = this.zzb;
        AbstractC2947gb0.zze(bundle, "cnt", i8, i8 != -2);
        bundle.putInt("gnt", this.zzc);
        bundle.putInt("pt", this.zzd);
        Bundle bundleZza = AbstractC2947gb0.zza(bundle, Constants.DEVICE);
        bundle.putBundle(Constants.DEVICE, bundleZza);
        Bundle bundleZza2 = AbstractC2947gb0.zza(bundleZza, "network");
        bundleZza.putBundle("network", bundleZza2);
        bundleZza2.putInt("active_network_state", this.zzf);
        bundleZza2.putBoolean("active_network_metered", this.zze);
    }
}
