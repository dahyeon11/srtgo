package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Za0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2153Za0 implements InterfaceC2278al {
    public final /* synthetic */ DJ zza;
    public final /* synthetic */ IA zzb;
    public final /* synthetic */ C3865oe0 zzc;
    public final /* synthetic */ C4535uW zzd;

    public /* synthetic */ C2153Za0(DJ dj, IA ia, C3865oe0 c3865oe0, C4535uW c4535uW) {
        this.zza = dj;
        this.zzb = ia;
        this.zzc = c3865oe0;
        this.zzd = c4535uW;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final void zza(Object obj, Map map) {
        InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) obj;
        AbstractC2172Zk.zzc(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            L1.n.zzj("URL missing from click GMSG.");
            return;
        }
        C4535uW c4535uW = this.zzd;
        C3865oe0 c3865oe0 = this.zzc;
        AbstractC1483In0.zzr(AbstractC2172Zk.zza(interfaceC2065Wv, str), new C2374bb0(interfaceC2065Wv, this.zzb, c3865oe0, c4535uW), AbstractC4805wt.zza);
    }
}
