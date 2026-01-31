package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import c2.x;

/* loaded from: classes.dex */
public final class RevocationBoundService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) && !"com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            String strValueOf = String.valueOf(intent.getAction());
            Log.w("RevocationService", strValueOf.length() != 0 ? "Unknown action sent to RevocationBoundService: ".concat(strValueOf) : new String("Unknown action sent to RevocationBoundService: "));
            return null;
        }
        if (Log.isLoggable("RevocationService", 2)) {
            String strValueOf2 = String.valueOf(intent.getAction());
            if (strValueOf2.length() != 0) {
                "RevocationBoundService handling ".concat(strValueOf2);
            }
        }
        return new x(this);
    }
}
