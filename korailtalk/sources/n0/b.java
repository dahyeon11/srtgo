package N0;

import H0.l;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.r;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: i, reason: collision with root package name */
    private static final String f3152i = l.tagWithPrefix("BatteryNotLowTracker");

    public b(Context context, R0.a aVar) {
        super(context, aVar);
    }

    @Override // N0.c
    public IntentFilter getIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // N0.c
    public void onBroadcastReceive(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        l.get().debug(f3152i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            setState(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            setState(Boolean.FALSE);
        }
    }

    @Override // N0.d
    public Boolean getInitialState() {
        Intent intentRegisterReceiver = this.f3158b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra(r.CATEGORY_STATUS, -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        l.get().error(f3152i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
