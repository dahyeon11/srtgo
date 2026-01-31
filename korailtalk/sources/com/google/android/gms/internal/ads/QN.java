package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class QN {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f15766a;

    /* renamed from: b, reason: collision with root package name */
    private final C4045qB f15767b;

    /* renamed from: c, reason: collision with root package name */
    private final C4858xJ f15768c;

    /* renamed from: d, reason: collision with root package name */
    private final IA f15769d;

    QN(Executor executor, C4045qB c4045qB, C4858xJ c4858xJ, IA ia) {
        this.f15766a = executor;
        this.f15768c = c4858xJ;
        this.f15767b = c4045qB;
        this.f15769d = ia;
    }

    final /* synthetic */ void a(InterfaceC2065Wv interfaceC2065Wv, Map map) {
        this.f15767b.zzb();
    }

    final /* synthetic */ void b(InterfaceC2065Wv interfaceC2065Wv, Map map) {
        this.f15767b.zza();
    }

    public final void zza(final InterfaceC2065Wv interfaceC2065Wv) {
        if (interfaceC2065Wv == null) {
            return;
        }
        this.f15768c.zza(interfaceC2065Wv.zzF());
        this.f15768c.zzo(new InterfaceC1992Vc() { // from class: com.google.android.gms.internal.ads.MN
            @Override // com.google.android.gms.internal.ads.InterfaceC1992Vc
            public final void zzdp(C1951Uc c1951Uc) {
                InterfaceC1861Rw interfaceC1861RwZzN = interfaceC2065Wv.zzN();
                Rect rect = c1951Uc.zzd;
                interfaceC1861RwZzN.zzq(rect.left, rect.top, false);
            }
        }, this.f15766a);
        this.f15768c.zzo(new InterfaceC1992Vc() { // from class: com.google.android.gms.internal.ads.NN
            @Override // com.google.android.gms.internal.ads.InterfaceC1992Vc
            public final void zzdp(C1951Uc c1951Uc) {
                HashMap map = new HashMap();
                map.put("isVisible", true != c1951Uc.zzj ? "0" : "1");
                interfaceC2065Wv.zzd("onAdVisibilityChanged", map);
            }
        }, this.f15766a);
        this.f15768c.zzo(this.f15767b, this.f15766a);
        this.f15767b.zzf(interfaceC2065Wv);
        InterfaceC1861Rw interfaceC1861RwZzN = interfaceC2065Wv.zzN();
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkf)).booleanValue() && interfaceC1861RwZzN != null) {
            interfaceC1861RwZzN.zzJ(this.f15769d);
            interfaceC1861RwZzN.zzK(this.f15769d, null, null);
        }
        interfaceC2065Wv.zzag("/trackActiveViewUnit", new InterfaceC2278al() { // from class: com.google.android.gms.internal.ads.ON
            @Override // com.google.android.gms.internal.ads.InterfaceC2278al
            public final void zza(Object obj, Map map) {
                this.zza.a((InterfaceC2065Wv) obj, map);
            }
        });
        interfaceC2065Wv.zzag("/untrackActiveViewUnit", new InterfaceC2278al() { // from class: com.google.android.gms.internal.ads.PN
            @Override // com.google.android.gms.internal.ads.InterfaceC2278al
            public final void zza(Object obj, Map map) {
                this.zza.b((InterfaceC2065Wv) obj, map);
            }
        });
    }
}
