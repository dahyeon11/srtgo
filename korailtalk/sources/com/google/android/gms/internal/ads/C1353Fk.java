package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Fk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1353Fk implements InterfaceC2278al {
    C1353Fk() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzb;
        InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) obj;
        InterfaceC1799Qi interfaceC1799QiZzK = interfaceC2065Wv.zzK();
        if (interfaceC1799QiZzK == null || (jSONObjectZzb = interfaceC1799QiZzK.zzb()) == null) {
            interfaceC2065Wv.zze("nativeClickMetaReady", new JSONObject());
        } else {
            interfaceC2065Wv.zze("nativeClickMetaReady", jSONObjectZzb);
        }
    }
}
