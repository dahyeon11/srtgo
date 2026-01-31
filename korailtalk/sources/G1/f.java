package G1;

import K1.AbstractC0667v0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC1483In0;
import com.google.android.gms.internal.ads.AbstractC3293jd0;
import com.google.android.gms.internal.ads.AbstractC3414kh;
import com.google.android.gms.internal.ads.AbstractC4110qn;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.AbstractC4805wt;
import com.google.android.gms.internal.ads.AbstractC5147zt;
import com.google.android.gms.internal.ads.C2867ft;
import com.google.android.gms.internal.ads.C4451tn;
import com.google.android.gms.internal.ads.EnumC1217Cd0;
import com.google.android.gms.internal.ads.InterfaceC3199in;
import com.google.android.gms.internal.ads.InterfaceC3407kd0;
import com.google.android.gms.internal.ads.InterfaceC3768nn;
import com.google.android.gms.internal.ads.InterfaceC3997pn0;
import com.google.android.gms.internal.ads.InterfaceExecutorServiceC1974Un0;
import com.google.android.gms.internal.ads.KQ;
import com.google.android.gms.internal.ads.LQ;
import com.google.android.gms.internal.ads.RunnableC5002yd0;
import com.google.common.util.concurrent.C;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private Context f1395a;

    /* renamed from: b */
    private long f1396b = 0;

    static final /* synthetic */ C b(Long l8, LQ lq, RunnableC5002yd0 runnableC5002yd0, InterfaceC3407kd0 interfaceC3407kd0, JSONObject jSONObject) throws JSONException {
        boolean zOptBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (zOptBoolean) {
            u.zzo().zzi().zzv(jSONObject.getString("appSettingsJson"));
            if (l8 != null) {
                d(lq, "cld_s", u.zzB().elapsedRealtime() - l8.longValue());
            }
        }
        interfaceC3407kd0.zzh(zOptBoolean);
        runnableC5002yd0.zzb(interfaceC3407kd0.zzn());
        return AbstractC1483In0.zzh(null);
    }

    public static final void d(LQ lq, String str, long j8) {
        if (lq != null) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzmD)).booleanValue()) {
                KQ kqZza = lq.zza();
                kqZza.zzb("action", "lat_init");
                kqZza.zzb(str, Long.toString(j8));
                kqZza.zzf();
            }
        }
    }

    final void a(Context context, L1.a aVar, boolean z8, C2867ft c2867ft, String str, String str2, Runnable runnable, final RunnableC5002yd0 runnableC5002yd0, final LQ lq, final Long l8) throws JSONException {
        PackageInfo packageInfo;
        if (u.zzB().elapsedRealtime() - this.f1396b < 5000) {
            L1.n.zzj("Not retrying to fetch app settings");
            return;
        }
        this.f1396b = u.zzB().elapsedRealtime();
        if (c2867ft != null && !TextUtils.isEmpty(c2867ft.zzc())) {
            if (u.zzB().currentTimeMillis() - c2867ft.zza() <= ((Long) H1.C.zzc().zza(AbstractC4439th.zzed)).longValue() && c2867ft.zzi()) {
                return;
            }
        }
        if (context == null) {
            L1.n.zzj("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            L1.n.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f1395a = applicationContext;
        final InterfaceC3407kd0 interfaceC3407kd0Zza = AbstractC3293jd0.zza(context, EnumC1217Cd0.CUI_NAME_SDKINIT_CLD);
        interfaceC3407kd0Zza.zzj();
        C4451tn c4451tnZza = u.zzf().zza(this.f1395a, aVar, runnableC5002yd0);
        InterfaceC3768nn interfaceC3768nn = AbstractC4110qn.zza;
        InterfaceC3199in interfaceC3199inZza = c4451tnZza.zza("google.afma.config.fetchAppSettings", interfaceC3768nn, interfaceC3768nn);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z8);
            jSONObject.put("pn", context.getPackageName());
            AbstractC3414kh abstractC3414kh = AbstractC4439th.zza;
            jSONObject.put("experiment_ids", TextUtils.join(",", H1.C.zza().zza()));
            jSONObject.put("js", aVar.afmaVersion);
            try {
                ApplicationInfo applicationInfo = this.f1395a.getApplicationInfo();
                if (applicationInfo != null && (packageInfo = q2.e.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfo.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                AbstractC0667v0.zza("Error fetching PackageInfo.");
            }
            C cZzb = interfaceC3199inZza.zzb(jSONObject);
            InterfaceC3997pn0 interfaceC3997pn0 = new InterfaceC3997pn0() { // from class: G1.d
                @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
                public final C zza(Object obj) {
                    return f.b(l8, lq, runnableC5002yd0, interfaceC3407kd0Zza, (JSONObject) obj);
                }
            };
            InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zzf;
            C cZzn = AbstractC1483In0.zzn(cZzb, interfaceC3997pn0, interfaceExecutorServiceC1974Un0);
            if (runnable != null) {
                cZzb.addListener(runnable, interfaceExecutorServiceC1974Un0);
            }
            if (l8 != null) {
                cZzb.addListener(new Runnable() { // from class: G1.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.d(lq, "cld_r", u.zzB().elapsedRealtime() - l8.longValue());
                    }
                }, interfaceExecutorServiceC1974Un0);
            }
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhP)).booleanValue()) {
                AbstractC5147zt.zzb(cZzn, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                AbstractC5147zt.zza(cZzn, "ConfigLoader.maybeFetchNewAppSettings");
            }
        } catch (Exception e8) {
            L1.n.zzh("Error requesting application settings", e8);
            interfaceC3407kd0Zza.zzi(e8);
            interfaceC3407kd0Zza.zzh(false);
            runnableC5002yd0.zzb(interfaceC3407kd0Zza.zzn());
        }
    }

    public final void zza(Context context, L1.a aVar, String str, Runnable runnable, RunnableC5002yd0 runnableC5002yd0, LQ lq, Long l8) throws JSONException {
        a(context, aVar, true, null, str, null, runnable, runnableC5002yd0, lq, l8);
    }

    public final void zzc(Context context, L1.a aVar, String str, C2867ft c2867ft, RunnableC5002yd0 runnableC5002yd0) {
        a(context, aVar, false, c2867ft, c2867ft != null ? c2867ft.zzb() : null, str, null, runnableC5002yd0, null, null);
    }
}
