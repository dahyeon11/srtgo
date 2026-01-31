package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class CN {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2394bl0 f12520a;
    public static final CN zza = new CN(AbstractC2394bl0.zzm());

    /* renamed from: b, reason: collision with root package name */
    private static final String f12519b = Integer.toString(0, 36);

    @Deprecated
    public static final RG0 zzb = new RG0() { // from class: com.google.android.gms.internal.ads.ZL
    };

    public CN(List list) {
        this.f12520a = AbstractC2394bl0.zzk(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CN.class != obj.getClass()) {
            return false;
        }
        return this.f12520a.equals(((CN) obj).f12520a);
    }

    public final int hashCode() {
        return this.f12520a.hashCode();
    }

    public final AbstractC2394bl0 zza() {
        return this.f12520a;
    }

    public final boolean zzb(int i8) {
        for (int i9 = 0; i9 < this.f12520a.size(); i9++) {
            C2355bN c2355bN = (C2355bN) this.f12520a.get(i9);
            if (c2355bN.zzc() && c2355bN.zza() == i8) {
                return true;
            }
        }
        return false;
    }
}
