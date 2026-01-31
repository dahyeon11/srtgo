package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import i2.AbstractC5670c;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.qe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4092qe implements AbstractC5670c.a {
    public static final /* synthetic */ int zzd = 0;

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3067he f21967a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1203Bt f21968b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4319se f21969c;

    C4092qe(C4319se c4319se, C3067he c3067he, C1203Bt c1203Bt) {
        this.f21967a = c3067he;
        this.f21968b = c1203Bt;
        this.f21969c = c4319se;
    }

    @Override // i2.AbstractC5670c.a
    public final void onConnected(Bundle bundle) {
        synchronized (this.f21969c.f22677d) {
            try {
                C4319se c4319se = this.f21969c;
                if (c4319se.f22675b) {
                    return;
                }
                c4319se.f22675b = true;
                final C2952ge c2952ge = this.f21969c.f22674a;
                if (c2952ge == null) {
                    return;
                }
                InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
                final C3067he c3067he = this.f21967a;
                final C1203Bt c1203Bt = this.f21968b;
                final com.google.common.util.concurrent.C cZza = interfaceExecutorServiceC1974Un0.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.ne
                    @Override // java.lang.Runnable
                    public final void run() throws IOException {
                        C4092qe c4092qe = this.zza;
                        C2952ge c2952ge2 = c2952ge;
                        C1203Bt c1203Bt2 = c1203Bt;
                        try {
                            C3408ke c3408keZzq = c2952ge2.zzq();
                            boolean zZzp = c2952ge2.zzp();
                            C3067he c3067he2 = c3067he;
                            C2722ee c2722eeZzg = zZzp ? c3408keZzq.zzg(c3067he2) : c3408keZzq.zzf(c3067he2);
                            if (!c2722eeZzg.zze()) {
                                c1203Bt2.zzd(new RuntimeException("No entry contents."));
                                C4319se.e(c4092qe.f21969c);
                                return;
                            }
                            C3978pe c3978pe = new C3978pe(c4092qe, c2722eeZzg.zzc(), 1);
                            int i8 = c3978pe.read();
                            if (i8 == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            c3978pe.unread(i8);
                            c1203Bt2.zzc(C4547ue.zzb(c3978pe, c2722eeZzg.zzd(), c2722eeZzg.zzg(), c2722eeZzg.zza(), c2722eeZzg.zzf()));
                        } catch (RemoteException e8) {
                            e = e8;
                            L1.n.zzh("Unable to obtain a cache service instance.", e);
                            c1203Bt2.zzd(e);
                            C4319se.e(c4092qe.f21969c);
                        } catch (IOException e9) {
                            e = e9;
                            L1.n.zzh("Unable to obtain a cache service instance.", e);
                            c1203Bt2.zzd(e);
                            C4319se.e(c4092qe.f21969c);
                        }
                    }
                });
                final C1203Bt c1203Bt2 = this.f21968b;
                c1203Bt2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.oe
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (c1203Bt2.isCancelled()) {
                            cZza.cancel(true);
                        }
                    }
                }, AbstractC4805wt.zzf);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i2.AbstractC5670c.a
    public final void onConnectionSuspended(int i8) {
    }
}
