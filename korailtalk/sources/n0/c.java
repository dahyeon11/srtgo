package N0;

import H0.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public abstract class c extends d {

    /* renamed from: h, reason: collision with root package name */
    private static final String f3153h = l.tagWithPrefix("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    private final BroadcastReceiver f3154g;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.onBroadcastReceive(context, intent);
            }
        }
    }

    public c(Context context, R0.a aVar) {
        super(context, aVar);
        this.f3154g = new a();
    }

    public abstract IntentFilter getIntentFilter();

    public abstract void onBroadcastReceive(Context context, Intent intent);

    @Override // N0.d
    public void startTracking() {
        l.get().debug(f3153h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f3158b.registerReceiver(this.f3154g, getIntentFilter());
    }

    @Override // N0.d
    public void stopTracking() {
        l.get().debug(f3153h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f3158b.unregisterReceiver(this.f3154g);
    }
}
