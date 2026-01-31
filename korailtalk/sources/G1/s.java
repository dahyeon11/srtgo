package G1;

import H1.Y1;
import K1.AbstractC0633e;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC2501ci;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a */
    private final Context f1417a;

    /* renamed from: b */
    private final String f1418b;

    /* renamed from: c */
    private final Map f1419c = new TreeMap();

    /* renamed from: d */
    private String f1420d;

    /* renamed from: e */
    private String f1421e;

    /* renamed from: f */
    private final String f1422f;

    public s(Context context, String str) {
        String strConcat;
        this.f1417a = context.getApplicationContext();
        this.f1418b = str;
        String packageName = context.getPackageName();
        try {
            strConcat = packageName + g5.e.STATE_NAME_NONE + q2.e.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e8) {
            L1.n.zzh("Unable to get package version name for reporting", e8);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.f1422f = strConcat;
    }

    public final String zza() {
        return this.f1422f;
    }

    public final String zzb() {
        return this.f1421e;
    }

    public final String zzc() {
        return this.f1418b;
    }

    public final String zzd() {
        return this.f1420d;
    }

    public final Map zze() {
        return this.f1419c;
    }

    public final void zzf(Y1 y12, L1.a aVar) {
        this.f1420d = y12.zzj.zza;
        Bundle bundle = y12.zzm;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) AbstractC2501ci.zzc.zze();
        for (String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.f1421e = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.f1419c.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        this.f1419c.put("SDKVersion", aVar.afmaVersion);
        if (((Boolean) AbstractC2501ci.zza.zze()).booleanValue()) {
            Bundle bundleZzb = AbstractC0633e.zzb(this.f1417a, (String) AbstractC2501ci.zzb.zze());
            for (String str3 : bundleZzb.keySet()) {
                this.f1419c.put(str3, bundleZzb.get(str3).toString());
            }
        }
    }
}
