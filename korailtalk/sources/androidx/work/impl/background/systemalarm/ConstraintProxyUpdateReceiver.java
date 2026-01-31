package androidx.work.impl.background.systemalarm;

import H0.l;
import I0.i;
import Q0.h;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    static final String f11151a = l.tagWithPrefix("ConstrntProxyUpdtRecvr");

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f11152a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f11153b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f11154c;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f11152a = intent;
            this.f11153b = context;
            this.f11154c = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f11152a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f11152a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f11152a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f11152a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                l.get().debug(ConstraintProxyUpdateReceiver.f11151a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                h.setComponentEnabled(this.f11153b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                h.setComponentEnabled(this.f11153b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                h.setComponentEnabled(this.f11153b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                h.setComponentEnabled(this.f11153b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f11154c.finish();
            }
        }
    }

    public static Intent newConstraintProxyUpdateIntent(Context context, boolean z8, boolean z9, boolean z10, boolean z11) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z8).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z9).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z11);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            i.getInstance(context).getWorkTaskExecutor().executeOnBackgroundThread(new a(intent, context, goAsync()));
        } else {
            l.get().debug(f11151a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}
