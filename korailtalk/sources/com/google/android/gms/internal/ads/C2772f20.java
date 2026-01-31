package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import i2.AbstractC5683p;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.f20, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2772f20 implements M50 {
    public final H1.d2 zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;

    public C2772f20(H1.d2 d2Var, String str, boolean z8, String str2, float f8, int i8, int i9, String str3, boolean z9) {
        AbstractC5683p.checkNotNull(d2Var, "the adSize must not be null");
        this.zza = d2Var;
        this.zzb = str;
        this.zzc = z8;
        this.zzd = str2;
        this.zze = f8;
        this.zzf = i8;
        this.zzg = i9;
        this.zzh = str3;
        this.zzi = z9;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        AbstractC2947gb0.zzf(bundle, "smart_w", "full", this.zza.zze == -1);
        AbstractC2947gb0.zzf(bundle, "smart_h", "auto", this.zza.zzb == -2);
        AbstractC2947gb0.zzg(bundle, "ene", true, this.zza.zzj);
        AbstractC2947gb0.zzf(bundle, "rafmt", "102", this.zza.zzm);
        AbstractC2947gb0.zzf(bundle, "rafmt", "103", this.zza.zzn);
        AbstractC2947gb0.zzf(bundle, "rafmt", "105", this.zza.zzo);
        AbstractC2947gb0.zzg(bundle, "inline_adaptive_slot", true, this.zzi);
        AbstractC2947gb0.zzg(bundle, "interscroller_slot", true, this.zza.zzo);
        AbstractC2947gb0.zzc(bundle, "format", this.zzb);
        AbstractC2947gb0.zzf(bundle, "fluid", "height", this.zzc);
        AbstractC2947gb0.zzf(bundle, "sz", this.zzd, !TextUtils.isEmpty(this.zzd));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        AbstractC2947gb0.zzf(bundle, "sc", this.zzh, !TextUtils.isEmpty(this.zzh));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        H1.d2[] d2VarArr = this.zza.zzg;
        if (d2VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.zza.zzb);
            bundle2.putInt("width", this.zza.zze);
            bundle2.putBoolean("is_fluid_height", this.zza.zzi);
            arrayList.add(bundle2);
        } else {
            for (H1.d2 d2Var : d2VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", d2Var.zzi);
                bundle3.putInt("height", d2Var.zzb);
                bundle3.putInt("width", d2Var.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
