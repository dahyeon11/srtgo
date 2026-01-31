package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2554d8 {
    public final Object zza;
    public final H7 zzb;
    public final C2898g8 zzc;
    public boolean zzd;

    private C2554d8(C2898g8 c2898g8) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = c2898g8;
    }

    public static C2554d8 zza(C2898g8 c2898g8) {
        return new C2554d8(c2898g8);
    }

    public static C2554d8 zzb(Object obj, H7 h72) {
        return new C2554d8(obj, h72);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }

    private C2554d8(Object obj, H7 h72) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = h72;
        this.zzc = null;
    }
}
