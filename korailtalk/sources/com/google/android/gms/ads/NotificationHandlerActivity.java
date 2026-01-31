package com.google.android.gms.ads;

import H1.C0591z;
import L1.n;
import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC1686Nn;
import com.google.android.gms.internal.ads.InterfaceC1568Kp;

/* loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.NotificationHandlerActivity";

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            InterfaceC1568Kp interfaceC1568KpZzm = C0591z.zza().zzm(this, new BinderC1686Nn());
            if (interfaceC1568KpZzm == null) {
                n.zzg("OfflineUtils is null");
            } else {
                interfaceC1568KpZzm.zze(getIntent());
            }
        } catch (RemoteException e8) {
            n.zzg("RemoteException calling handleNotificationIntent: ".concat(e8.toString()));
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        finish();
    }
}
