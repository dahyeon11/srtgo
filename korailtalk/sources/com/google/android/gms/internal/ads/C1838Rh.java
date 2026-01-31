package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Rh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1838Rh {

    /* renamed from: a, reason: collision with root package name */
    private androidx.browser.customtabs.f f16144a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.browser.customtabs.c f16145b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.browser.customtabs.e f16146c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC1797Qh f16147d;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i8 = 0; i8 < listQueryIntentActivities.size(); i8++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i8).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(YD0.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final androidx.browser.customtabs.f zza() {
        androidx.browser.customtabs.c cVar = this.f16145b;
        if (cVar == null) {
            this.f16144a = null;
        } else if (this.f16144a == null) {
            this.f16144a = cVar.newSession(null);
        }
        return this.f16144a;
    }

    public final void zzb(Activity activity) {
        String strZza;
        if (this.f16145b == null && (strZza = YD0.zza(activity)) != null) {
            ZD0 zd0 = new ZD0(this);
            this.f16146c = zd0;
            androidx.browser.customtabs.c.bindCustomTabsService(activity, strZza, zd0);
        }
    }

    public final void zzc(androidx.browser.customtabs.c cVar) {
        this.f16145b = cVar;
        cVar.warmup(0L);
        InterfaceC1797Qh interfaceC1797Qh = this.f16147d;
        if (interfaceC1797Qh != null) {
            interfaceC1797Qh.zza();
        }
    }

    public final void zzd() {
        this.f16145b = null;
        this.f16144a = null;
    }

    public final void zze(InterfaceC1797Qh interfaceC1797Qh) {
        this.f16147d = interfaceC1797Qh;
    }

    public final void zzf(Activity activity) {
        androidx.browser.customtabs.e eVar = this.f16146c;
        if (eVar == null) {
            return;
        }
        activity.unbindService(eVar);
        this.f16145b = null;
        this.f16144a = null;
        this.f16146c = null;
    }
}
