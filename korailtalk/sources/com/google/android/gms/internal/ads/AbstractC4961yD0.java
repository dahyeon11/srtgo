package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yD0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4961yD0 {
    public static AbstractC4961yD0 zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new C4391tD0(cls.getSimpleName()) : new C4619vD0(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
