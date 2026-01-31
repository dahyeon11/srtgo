package com.google.android.gms.internal.ads;

import H1.C0591z;
import K1.AbstractC0667v0;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.pb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3973pb0 {
    public static void zza(Context context, boolean z8) {
        if (z8) {
            L1.n.zzi("This request is sent from a test device.");
            return;
        }
        C0591z.zzb();
        L1.n.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + L1.g.zzz(context) + "\")) to get test ads on this device.");
    }

    public static void zzb(int i8, Throwable th, String str) {
        L1.n.zzi("Ad failed to load : " + i8);
        AbstractC0667v0.zzb(str, th);
        if (i8 == 3) {
            return;
        }
        G1.u.zzo().zzv(th, str);
    }
}
