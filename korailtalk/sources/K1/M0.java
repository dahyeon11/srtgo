package K1;

import H1.C0591z;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC4439th;

/* loaded from: classes.dex */
public class M0 extends L0 {
    static final boolean a(int i8, int i9, int i10) {
        return Math.abs(i8 - i9) <= i10;
    }

    @Override // K1.AbstractC0629c
    public final boolean zzd(Activity activity, Configuration configuration) {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeO)).booleanValue()) {
            return false;
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeQ)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        C0591z.zzb();
        int iZzy = L1.g.zzy(activity, configuration.screenHeightDp);
        int iZzy2 = L1.g.zzy(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        G1.u.zzp();
        DisplayMetrics displayMetricsZzt = K0.zzt(windowManager);
        int i8 = displayMetricsZzt.heightPixels;
        int i9 = displayMetricsZzt.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iRound = ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((Integer) H1.C.zzc().zza(AbstractC4439th.zzeM)).intValue();
        return (a(i8, iZzy + dimensionPixelSize, iRound) && a(i9, iZzy2, iRound)) ? false : true;
    }
}
