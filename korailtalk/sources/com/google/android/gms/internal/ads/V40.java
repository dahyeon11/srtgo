package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class V40 implements N50, M50 {

    /* renamed from: a, reason: collision with root package name */
    private final ApplicationInfo f16766a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageInfo f16767b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f16768c;

    /* renamed from: d, reason: collision with root package name */
    private final FQ f16769d;

    V40(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context, FQ fq) {
        this.f16766a = applicationInfo;
        this.f16767b = packageInfo;
        this.f16768c = context;
        this.f16769d = fq;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 29;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return AbstractC1483In0.zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) throws PackageManager.NameNotFoundException {
        Bundle bundle = (Bundle) obj;
        String str = this.f16766a.packageName;
        PackageInfo packageInfo = this.f16767b;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (numValueOf != null) {
            bundle.putInt("vc", numValueOf.intValue());
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcg)).booleanValue()) {
                this.f16769d.zzc("vc", numValueOf.toString());
            }
        }
        PackageInfo packageInfo2 = this.f16767b;
        String str2 = packageInfo2 != null ? packageInfo2.versionName : null;
        if (str2 != null) {
            bundle.putString("vnm", str2);
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcg)).booleanValue()) {
                this.f16769d.zzc("vn", str2);
            }
        }
        try {
            Context context = this.f16768c;
            String str3 = this.f16766a.packageName;
            HandlerC1634Mh0 handlerC1634Mh0 = K1.K0.zza;
            bundle.putString("dl", String.valueOf(q2.e.packageManager(context).getApplicationLabel(str3)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzmI)).booleanValue()) {
                try {
                    InstallSourceInfo installSourceInfo = this.f16768c.getPackageManager().getInstallSourceInfo(str);
                    if (installSourceInfo == null) {
                        return;
                    }
                    String installingPackageName = installSourceInfo.getInstallingPackageName();
                    if (TextUtils.isEmpty(installingPackageName)) {
                        AbstractC0667v0.zza("No installing package name found");
                    } else {
                        bundle.putString("ins_pn", installingPackageName);
                    }
                    String initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                    if (TextUtils.isEmpty(initiatingPackageName)) {
                        AbstractC0667v0.zza("No initiating package name found");
                    } else {
                        bundle.putString("ini_pn", initiatingPackageName);
                    }
                } catch (PackageManager.NameNotFoundException e8) {
                    G1.u.zzo().zzw(e8, "PackageInfoSignalsource.compose");
                }
            }
        }
    }
}
