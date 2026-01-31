package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
final class WL0 {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public WL0(String str, boolean z8, boolean z9) {
        this.zza = str;
        this.zzb = z8;
        this.zzc = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == WL0.class) {
            WL0 wl0 = (WL0) obj;
            if (TextUtils.equals(this.zza, wl0.zza) && this.zzb == wl0.zzb && this.zzc == wl0.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() + 31) * 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true != this.zzc ? 1237 : 1231);
    }
}
