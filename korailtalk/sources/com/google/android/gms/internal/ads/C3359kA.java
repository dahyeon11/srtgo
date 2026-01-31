package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.kA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3359kA implements InterfaceC2069Wz {
    C3359kA() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069Wz
    public final void zza(Map map) {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkt)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        G1.u.zzo().zzi().zzJ(Boolean.parseBoolean(str));
    }
}
