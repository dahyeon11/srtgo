package K1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.C2988gw;
import com.google.android.gms.internal.ads.C4775we;
import com.google.android.gms.internal.ads.EnumC1631Mg;
import com.google.android.gms.internal.ads.GW;
import com.google.android.gms.internal.ads.InterfaceC2065Wv;
import java.io.InputStream;
import java.util.Map;

/* renamed from: K1.c */
/* loaded from: classes.dex */
public abstract class AbstractC0629c {
    /* synthetic */ AbstractC0629c(AbstractC0627b abstractC0627b) {
    }

    public CookieManager zza(Context context) {
        throw null;
    }

    public WebResourceResponse zzb(String str, String str2, int i8, String str3, Map map, InputStream inputStream) {
        throw null;
    }

    public C2988gw zzc(InterfaceC2065Wv interfaceC2065Wv, C4775we c4775we, boolean z8, GW gw) {
        throw null;
    }

    public boolean zzd(Activity activity, Configuration configuration) {
        return false;
    }

    public Intent zzf(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public EnumC1631Mg zzg(Context context, TelephonyManager telephonyManager) {
        return EnumC1631Mg.ENUM_UNKNOWN;
    }

    public boolean zzi(Context context, String str) {
        return false;
    }

    public int zzj(AudioManager audioManager) {
        return 0;
    }

    public int zzm(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    public void zzk(Activity activity) {
    }

    public void zzh(Context context, String str, String str2) {
    }
}
