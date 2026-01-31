package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class PU extends TU {

    /* renamed from: h, reason: collision with root package name */
    private C1241Cq f15332h;

    PU(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f16484e = context;
        this.f16485f = G1.u.zzt().zzb();
        this.f16486g = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.TU, i2.AbstractC5670c.a
    public final synchronized void onConnected(Bundle bundle) {
        if (this.f16482c) {
            return;
        }
        this.f16482c = true;
        try {
            this.f16483d.zzp().zzf(this.f15332h, new RU(this));
        } catch (RemoteException unused) {
            this.f16480a.zzd(new YT(1));
        } catch (Throwable th) {
            G1.u.zzo().zzw(th, "RemoteAdsServiceSignalClientTask.onConnected");
            this.f16480a.zzd(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.TU, i2.AbstractC5670c.a
    public final void onConnectionSuspended(int i8) {
        String str = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i8));
        L1.n.zze(str);
        this.f16480a.zzd(new YT(1, str));
    }

    public final synchronized com.google.common.util.concurrent.C zza(C1241Cq c1241Cq, long j8) {
        if (this.f16481b) {
            return AbstractC1483In0.zzo(this.f16480a, j8, TimeUnit.MILLISECONDS, this.f16486g);
        }
        this.f16481b = true;
        this.f15332h = c1241Cq;
        a();
        com.google.common.util.concurrent.C cZzo = AbstractC1483In0.zzo(this.f16480a, j8, TimeUnit.MILLISECONDS, this.f16486g);
        cZzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.OU
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.b();
            }
        }, AbstractC4805wt.zzf);
        return cZzo;
    }
}
