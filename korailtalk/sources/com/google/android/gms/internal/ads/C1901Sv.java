package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Sv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1901Sv extends IOException {
    public final boolean zza;
    public final int zzb;

    protected C1901Sv(String str, Throwable th, boolean z8, int i8) {
        super(str, th);
        this.zza = z8;
        this.zzb = i8;
    }

    public static C1901Sv zza(String str, Throwable th) {
        return new C1901Sv(str, th, true, 1);
    }

    public static C1901Sv zzb(String str, Throwable th) {
        return new C1901Sv(str, th, true, 0);
    }

    public static C1901Sv zzc(String str) {
        return new C1901Sv(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.zza + ", dataType=" + this.zzb + "}";
    }
}
