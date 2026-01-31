package p1;

import android.content.Context;
import w1.InterfaceC6458a;

/* loaded from: classes.dex */
public abstract class h {
    public static h create(Context context, InterfaceC6458a interfaceC6458a, InterfaceC6458a interfaceC6458a2) {
        return new c(context, interfaceC6458a, interfaceC6458a2, "cct");
    }

    public abstract Context getApplicationContext();

    public abstract String getBackendName();

    public abstract InterfaceC6458a getMonotonicClock();

    public abstract InterfaceC6458a getWallClock();

    public static h create(Context context, InterfaceC6458a interfaceC6458a, InterfaceC6458a interfaceC6458a2, String str) {
        return new c(context, interfaceC6458a, interfaceC6458a2, str);
    }
}
