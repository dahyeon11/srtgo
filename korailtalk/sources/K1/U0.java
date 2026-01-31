package K1;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.EnumC1631Mg;

/* loaded from: classes.dex */
public class U0 extends M0 {
    @Override // K1.AbstractC0629c
    public final Intent zzf(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // K1.AbstractC0629c
    public final EnumC1631Mg zzg(Context context, TelephonyManager telephonyManager) {
        G1.u.zzp();
        return K0.zzA(context, "android.permission.ACCESS_NETWORK_STATE") ? telephonyManager.isDataEnabled() ? EnumC1631Mg.ENUM_TRUE : EnumC1631Mg.ENUM_FALSE : EnumC1631Mg.ENUM_FALSE;
    }

    @Override // K1.AbstractC0629c
    public final void zzh(Context context, String str, String str2) {
        T0.a();
        NotificationChannel notificationChannelA = S0.a("offline_notification_channel", "AdMob Offline Notifications", ((Integer) H1.C.zzc().zza(AbstractC4439th.zziC)).intValue());
        notificationChannelA.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannelA);
    }

    @Override // K1.AbstractC0629c
    public final boolean zzi(Context context, String str) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }
}
