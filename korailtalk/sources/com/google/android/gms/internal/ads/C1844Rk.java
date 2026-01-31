package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Rk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1844Rk implements InterfaceC2278al {
    C1844Rk() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) obj;
        if (interfaceC2065Wv.zzJ() != null) {
            interfaceC2065Wv.zzJ().zza();
        }
        J1.u uVarZzL = interfaceC2065Wv.zzL();
        if (uVarZzL != null) {
            uVarZzL.zzb();
            return;
        }
        J1.u uVarZzM = interfaceC2065Wv.zzM();
        if (uVarZzM != null) {
            uVarZzM.zzb();
        } else {
            L1.n.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
