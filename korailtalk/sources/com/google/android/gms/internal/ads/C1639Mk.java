package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Mk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1639Mk implements InterfaceC2278al {
    C1639Mk() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) obj;
        try {
            C2126Yh0.zzj(interfaceC2065Wv.getContext()).zzk();
            C2167Zh0.zzi(interfaceC2065Wv.getContext()).zzj();
        } catch (IOException e8) {
            G1.u.zzo().zzw(e8, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
