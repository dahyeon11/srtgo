package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iL0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3155iL0 {
    public static final boolean zza;

    static {
        boolean z8 = false;
        if ("Amazon".equals(AbstractC2281am0.zzc)) {
            String str = AbstractC2281am0.zzd;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z8 = true;
            }
        }
        zza = z8;
    }
}
