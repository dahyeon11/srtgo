package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class W20 implements N50 {

    /* renamed from: a */
    private final InterfaceExecutorServiceC1974Un0 f16917a;

    /* renamed from: b */
    private final Context f16918b;

    W20(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, Context context) {
        this.f16917a = interfaceExecutorServiceC1974Un0;
        this.f16918b = context;
    }

    private final Intent b() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        return (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkW)).booleanValue() || Build.VERSION.SDK_INT < 33) ? this.f16918b.registerReceiver(null, intentFilter) : this.f16918b.registerReceiver(null, intentFilter, 4);
    }

    private static final boolean c(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra(androidx.core.app.r.CATEGORY_STATUS, -1);
        return intExtra == 2 || intExtra == 5;
    }

    final /* synthetic */ X20 a() {
        double intExtra;
        boolean zIsCharging;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlX)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) this.f16918b.getSystemService("batterymanager");
            intExtra = batteryManager != null ? batteryManager.getIntProperty(4) / 100.0d : -1.0d;
            zIsCharging = batteryManager != null ? batteryManager.isCharging() : c(b());
        } else {
            Intent intentB = b();
            boolean zC = c(intentB);
            intExtra = intentB != null ? intentB.getIntExtra("level", -1) / intentB.getIntExtra("scale", -1) : -1.0d;
            zIsCharging = zC;
        }
        return new X20(intExtra, zIsCharging);
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f16917a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.V20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a();
            }
        });
    }
}
