package com.google.android.gms.ads;

import H1.C0591z;
import L1.n;
import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC1686Nn;

/* loaded from: classes.dex */
public class AdService extends IntentService {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdService";

    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        try {
            C0591z.zza().zzm(this, new BinderC1686Nn()).zze(intent);
        } catch (RemoteException e8) {
            n.zzg("RemoteException calling handleNotificationIntent: ".concat(e8.toString()));
        }
    }
}
