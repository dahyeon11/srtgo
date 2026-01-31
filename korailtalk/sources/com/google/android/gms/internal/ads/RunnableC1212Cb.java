package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* renamed from: com.google.android.gms.internal.ads.Cb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC1212Cb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f12554a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1294Eb f12555b;

    RunnableC1212Cb(C1294Eb c1294Eb, int i8, boolean z8) {
        this.f12554a = i8;
        this.f12555b = c1294Eb;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        O9 o9Zza;
        int i8 = this.f12554a;
        C1294Eb c1294Eb = this.f12555b;
        if (i8 > 0) {
            try {
                Thread.sleep(i8 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = c1294Eb.f12813a.getPackageManager().getPackageInfo(c1294Eb.f12813a.getPackageName(), 0);
            Context context = c1294Eb.f12813a;
            o9Zza = AbstractC2269ag0.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            o9Zza = null;
        }
        this.f12555b.f12822j = o9Zza;
        if (this.f12554a < 4) {
            if (o9Zza != null && o9Zza.zzar() && !o9Zza.zzi().equals("0000000000000000000000000000000000000000000000000000000000000000") && o9Zza.zzas() && o9Zza.zzg().zze() && o9Zza.zzg().zza() != -2) {
                return;
            }
            this.f12555b.d(this.f12554a + 1, true);
        }
    }
}
