package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ek, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1312Ek implements InterfaceC2278al {
    C1312Ek() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZza;
        InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) obj;
        InterfaceC1799Qi interfaceC1799QiZzK = interfaceC2065Wv.zzK();
        if (interfaceC1799QiZzK == null || (jSONObjectZza = interfaceC1799QiZzK.zza()) == null) {
            interfaceC2065Wv.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            interfaceC2065Wv.zze("nativeAdViewSignalsReady", jSONObjectZza);
        }
    }
}
