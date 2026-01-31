package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2947gb0 {
    public static Bundle zza(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    public static void zzb(Bundle bundle, String str, Bundle bundle2) {
        if (bundle2 != null) {
            bundle.putBundle(str, bundle2);
        }
    }

    public static void zzc(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void zzd(Bundle bundle, String str, List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    public static void zze(Bundle bundle, String str, int i8, boolean z8) {
        if (z8) {
            bundle.putInt(str, i8);
        }
    }

    public static void zzf(Bundle bundle, String str, String str2, boolean z8) {
        if (!z8 || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static void zzg(Bundle bundle, String str, boolean z8, boolean z9) {
        if (z9) {
            bundle.putBoolean(str, z8);
        }
    }
}
