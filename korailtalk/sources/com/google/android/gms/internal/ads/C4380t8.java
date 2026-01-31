package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.t8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4380t8 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22789a = Integer.toString(0, 36);

    /* renamed from: b, reason: collision with root package name */
    private static final String f22790b = Integer.toString(1, 36);
    public final String zza;
    public final String zzb;

    public C4380t8(String str, String str2) {
        this.zza = AbstractC2281am0.zzD(str);
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4380t8.class == obj.getClass()) {
            C4380t8 c4380t8 = (C4380t8) obj;
            if (AbstractC2281am0.zzG(this.zza, c4380t8.zza) && AbstractC2281am0.zzG(this.zzb, c4380t8.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() * 31;
        String str = this.zza;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
