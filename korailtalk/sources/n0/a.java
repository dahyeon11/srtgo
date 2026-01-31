package N0;

import H0.l;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.r;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: i, reason: collision with root package name */
    private static final String f3151i = l.tagWithPrefix("BatteryChrgTracker");

    public a(Context context, R0.a aVar) {
        super(context, aVar);
    }

    private boolean a(Intent intent) {
        int intExtra = intent.getIntExtra(r.CATEGORY_STATUS, -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // N0.c
    public IntentFilter getIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // N0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBroadcastReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            r5 = 0
            java.lang.String r6 = r6.getAction()
            if (r6 != 0) goto L8
            return
        L8:
            H0.l r0 = H0.l.get()
            java.lang.String r1 = N0.a.f3151i
            java.lang.String r2 = "Received %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r6}
            java.lang.String r2 = java.lang.String.format(r2, r3)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
            r0.debug(r1, r2, r3)
            r0 = -1
            int r1 = r6.hashCode()
            switch(r1) {
                case -1886648615: goto L48;
                case -54942926: goto L3d;
                case 948344062: goto L32;
                case 1019184907: goto L27;
                default: goto L25;
            }
        L25:
            r5 = r0
            goto L51
        L27:
            java.lang.String r5 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L30
            goto L25
        L30:
            r5 = 3
            goto L51
        L32:
            java.lang.String r5 = "android.os.action.CHARGING"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L3b
            goto L25
        L3b:
            r5 = 2
            goto L51
        L3d:
            java.lang.String r5 = "android.os.action.DISCHARGING"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L46
            goto L25
        L46:
            r5 = 1
            goto L51
        L48:
            java.lang.String r1 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L51
            goto L25
        L51:
            switch(r5) {
                case 0: goto L67;
                case 1: goto L61;
                case 2: goto L5b;
                case 3: goto L55;
                default: goto L54;
            }
        L54:
            goto L6c
        L55:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.setState(r5)
            goto L6c
        L5b:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.setState(r5)
            goto L6c
        L61:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.setState(r5)
            goto L6c
        L67:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.setState(r5)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.a.onBroadcastReceive(android.content.Context, android.content.Intent):void");
    }

    @Override // N0.d
    public Boolean getInitialState() {
        Intent intentRegisterReceiver = this.f3158b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(a(intentRegisterReceiver));
        }
        l.get().error(f3151i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
