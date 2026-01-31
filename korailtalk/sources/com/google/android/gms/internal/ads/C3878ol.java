package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ol */
/* loaded from: classes2.dex */
public final class C3878ol implements InterfaceC2278al {

    /* renamed from: a */
    private final KS f21557a;

    public C3878ol(KS ks) {
        this.f21557a = ks;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final void zza(Object obj, Map map) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjs)).booleanValue()) {
            String str = (String) map.get("action");
            String str2 = (String) map.get("adUnitId");
            String str3 = (String) map.get("redirectUrl");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return;
            }
            String str4 = (String) map.get("format");
            if (str.equals("load") && !TextUtils.isEmpty(str4)) {
                this.f21557a.zzh(str2, str4, str3);
            } else if (str.equals("show")) {
                this.f21557a.zzi(str2, str3);
            }
        }
    }
}
