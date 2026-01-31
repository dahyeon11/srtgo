package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.eG0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2685eG0 {
    public final long zza;
    public final float zzb;
    public final long zzc;

    /* synthetic */ C2685eG0(C2456cG0 c2456cG0, AbstractC2571dG0 abstractC2571dG0) {
        this.zza = c2456cG0.f18276a;
        this.zzb = c2456cG0.f18277b;
        this.zzc = c2456cG0.f18278c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2685eG0)) {
            return false;
        }
        C2685eG0 c2685eG0 = (C2685eG0) obj;
        return this.zza == c2685eG0.zza && this.zzb == c2685eG0.zzb && this.zzc == c2685eG0.zzc;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc)});
    }

    public final C2456cG0 zza() {
        return new C2456cG0(this, null);
    }
}
