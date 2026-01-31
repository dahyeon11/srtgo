package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import i2.AbstractC5683p;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class Q10 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    final C1825Ra0 f15683a;

    /* renamed from: b, reason: collision with root package name */
    private final long f15684b;

    public Q10(C1825Ra0 c1825Ra0, long j8) {
        AbstractC5683p.checkNotNull(c1825Ra0, "the targeting must not be null");
        this.f15683a = c1825Ra0;
        this.f15684b = j8;
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        H1.Y1 y12 = this.f15683a.zzd;
        bundle.putInt("http_timeout_millis", y12.zzw);
        bundle.putString("slotname", this.f15683a.zzf);
        int i8 = this.f15683a.zzo.zza;
        if (i8 == 0) {
            throw null;
        }
        int i9 = i8 - 1;
        if (i9 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i9 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.f15684b);
        AbstractC2947gb0.zzf(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(y12.zzb)), y12.zzb != -1);
        AbstractC2947gb0.zzb(bundle, "extras", y12.zzc);
        int i10 = y12.zzd;
        AbstractC2947gb0.zze(bundle, "cust_gender", i10, i10 != -1);
        AbstractC2947gb0.zzd(bundle, "kw", y12.zze);
        int i11 = y12.zzg;
        AbstractC2947gb0.zze(bundle, "tag_for_child_directed_treatment", i11, i11 != -1);
        if (y12.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", y12.zzy);
        AbstractC2947gb0.zze(bundle, "d_imp_hdr", 1, y12.zza >= 2 && y12.zzh);
        String str = y12.zzi;
        AbstractC2947gb0.zzf(bundle, "ppid", str, y12.zza >= 2 && !TextUtils.isEmpty(str));
        Location location = y12.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", accuracy);
            bundle2.putLong("lat", (long) latitude);
            bundle2.putLong("long", (long) longitude);
            bundle2.putLong("time", time);
            bundle.putBundle("uule", bundle2);
        }
        AbstractC2947gb0.zzc(bundle, "url", y12.zzl);
        AbstractC2947gb0.zzd(bundle, "neighboring_content_urls", y12.zzv);
        AbstractC2947gb0.zzb(bundle, "custom_targeting", y12.zzn);
        AbstractC2947gb0.zzd(bundle, "category_exclusions", y12.zzo);
        AbstractC2947gb0.zzc(bundle, "request_agent", y12.zzp);
        AbstractC2947gb0.zzc(bundle, "request_pkg", y12.zzq);
        AbstractC2947gb0.zzg(bundle, "is_designed_for_families", y12.zzr, y12.zza >= 7);
        if (y12.zza >= 8) {
            int i12 = y12.zzt;
            AbstractC2947gb0.zze(bundle, "tag_for_under_age_of_consent", i12, i12 != -1);
            AbstractC2947gb0.zzc(bundle, "max_ad_content_rating", y12.zzu);
        }
    }
}
