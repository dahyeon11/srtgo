package com.google.android.gms.internal.ads;

import Q7.C0709m;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Nk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1680Nk implements InterfaceC2278al {
    C1680Nk() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) obj;
        try {
            String str = (String) map.get("enabled");
            if (!AbstractC2963gj0.zzc(C0709m.TRUE, str) && !AbstractC2963gj0.zzc(C0709m.FALSE, str)) {
                return;
            }
            C2167Zh0.zzi(interfaceC2065Wv.getContext()).zzm(Boolean.parseBoolean(str));
        } catch (IOException e8) {
            G1.u.zzo().zzw(e8, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
