package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.te0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4434te0 {
    public static AbstractC4434te0 zza(C4548ue0 c4548ue0, C4662ve0 c4662ve0) {
        AbstractC3981pf0.zza();
        return new C4890xe0(c4548ue0, c4662ve0, UUID.randomUUID().toString());
    }

    public abstract void zzb(View view, EnumC1137Ae0 enumC1137Ae0, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();
}
