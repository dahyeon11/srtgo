package K1;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.AbstractC3644mi;
import com.google.android.gms.internal.ads.AbstractC5147zt;

/* renamed from: K1.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0665u0 {
    public static void zza(Context context) {
        int i8 = L1.m.zza;
        if (((Boolean) AbstractC3644mi.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || L1.m.zzl()) {
                    return;
                }
                com.google.common.util.concurrent.C cZzb = new C0632d0(context).zzb();
                L1.n.zzi("Updating ad debug logging enablement.");
                AbstractC5147zt.zza(cZzb, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e8) {
                L1.n.zzk("Fail to determine debug setting.", e8);
            }
        }
    }
}
