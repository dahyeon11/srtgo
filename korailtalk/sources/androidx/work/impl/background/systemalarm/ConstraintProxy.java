package androidx.work.impl.background.systemalarm;

import H0.l;
import H0.m;
import P0.r;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f11150a = l.tagWithPrefix("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    ConstraintProxy() {
    }

    static void a(Context context, List list) {
        Iterator it = list.iterator();
        boolean zRequiresBatteryNotLow = false;
        boolean zRequiresCharging = false;
        boolean zRequiresStorageNotLow = false;
        boolean z8 = false;
        while (it.hasNext()) {
            H0.c cVar = ((r) it.next()).constraints;
            zRequiresBatteryNotLow |= cVar.requiresBatteryNotLow();
            zRequiresCharging |= cVar.requiresCharging();
            zRequiresStorageNotLow |= cVar.requiresStorageNotLow();
            z8 |= cVar.getRequiredNetworkType() != m.NOT_REQUIRED;
            if (zRequiresBatteryNotLow && zRequiresCharging && zRequiresStorageNotLow && z8) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.newConstraintProxyUpdateIntent(context, zRequiresBatteryNotLow, zRequiresCharging, zRequiresStorageNotLow, z8));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        l.get().debug(f11150a, String.format("onReceive : %s", intent), new Throwable[0]);
        context.startService(b.a(context));
    }
}
