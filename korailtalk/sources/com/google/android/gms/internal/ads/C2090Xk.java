package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Xk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2090Xk implements InterfaceC2278al {
    C2090Xk() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) obj;
        if (map.keySet().contains("start")) {
            interfaceC2065Wv.zzN().zzl();
        } else if (map.keySet().contains("stop")) {
            interfaceC2065Wv.zzN().zzm();
        } else if (map.keySet().contains("cancel")) {
            interfaceC2065Wv.zzN().zzk();
        }
    }
}
