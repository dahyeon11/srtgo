package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Wk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2049Wk implements InterfaceC2278al {
    C2049Wk() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            interfaceC2065Wv.zzdg();
        } else if ("resume".equals(str)) {
            interfaceC2065Wv.zzdh();
        }
    }
}
