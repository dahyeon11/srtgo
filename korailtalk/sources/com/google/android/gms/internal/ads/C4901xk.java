package com.google.android.gms.internal.ads;

import H1.C0591z;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.xk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4901xk implements InterfaceC2278al {
    public final /* synthetic */ DJ zza;
    public final /* synthetic */ IA zzb;

    public /* synthetic */ C4901xk(DJ dj, IA ia) {
        this.zza = dj;
        this.zzb = ia;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final void zza(Object obj, Map map) {
        InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) obj;
        AbstractC2172Zk.zzc(map, this.zza);
        final String str = (String) map.get("u");
        if (str == null) {
            L1.n.zzj("URL missing from click GMSG.");
            return;
        }
        final IA ia = this.zzb;
        AbstractC5136zn0 abstractC5136zn0Zzu = AbstractC5136zn0.zzu(AbstractC2172Zk.zza(interfaceC2065Wv, str));
        InterfaceC3997pn0 interfaceC3997pn0 = new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.zk
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj2) {
                IA ia2;
                String str2 = (String) obj2;
                InterfaceC2278al interfaceC2278al = AbstractC2172Zk.zza;
                return (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzka)).booleanValue() && (ia2 = ia) != null && IA.zzj(str)) ? ia2.zzb(str2, C0591z.zze()) : AbstractC1483In0.zzh(str2);
            }
        };
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        AbstractC1483In0.zzr(AbstractC1483In0.zzn(abstractC5136zn0Zzu, interfaceC3997pn0, interfaceExecutorServiceC1974Un0), new C1721Ok(interfaceC2065Wv), interfaceExecutorServiceC1974Un0);
    }
}
