package androidx.work.impl.background.systemalarm;

import H0.l;
import I0.i;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11156a = l.tagWithPrefix("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        l.get().debug(f11156a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            i.getInstance(context).setReschedulePendingResult(goAsync());
        } catch (IllegalStateException e8) {
            l.get().error(f11156a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e8);
        }
    }
}
