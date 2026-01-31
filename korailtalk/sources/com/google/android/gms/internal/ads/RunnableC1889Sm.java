package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.Sm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1889Sm implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2626dn f16332a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC5019ym f16333b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ArrayList f16334c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f16335d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2740en f16336e;

    RunnableC1889Sm(C2740en c2740en, C2626dn c2626dn, InterfaceC5019ym interfaceC5019ym, ArrayList arrayList, long j8) {
        this.f16332a = c2626dn;
        this.f16333b = interfaceC5019ym;
        this.f16334c = arrayList;
        this.f16335d = j8;
        this.f16336e = c2740en;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        AbstractC0667v0.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        synchronized (this.f16336e.f18817a) {
            try {
                AbstractC0667v0.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                if (this.f16332a.zze() != -1 && this.f16332a.zze() != 1) {
                    if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhO)).booleanValue()) {
                        this.f16332a.zzh(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                    } else {
                        this.f16332a.zzg();
                    }
                    InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zze;
                    final InterfaceC5019ym interfaceC5019ym = this.f16333b;
                    Objects.requireNonNull(interfaceC5019ym);
                    interfaceExecutorServiceC1974Un0.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Rm
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC5019ym.zzc();
                        }
                    });
                    String strValueOf = String.valueOf(H1.C.zzc().zza(AbstractC4439th.zzd));
                    int iZze = this.f16332a.zze();
                    int i8 = this.f16336e.f18825i;
                    if (this.f16334c.isEmpty()) {
                        str = ". Still waiting for the engine to be loaded";
                    } else {
                        str = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is " + String.valueOf(this.f16334c.get(0));
                    }
                    AbstractC0667v0.zza("Could not finish the full JS engine loading in " + strValueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + iZze + ". Update status(fullLoadTimeout) is " + i8 + str + " ms. Total latency(fullLoadTimeout) is " + (G1.u.zzB().currentTimeMillis() - this.f16335d) + " ms at timeout. Rejecting.");
                    AbstractC0667v0.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                AbstractC0667v0.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
