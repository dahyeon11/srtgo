package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import com.kakao.sdk.user.Constants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class GM {

    /* renamed from: a, reason: collision with root package name */
    private final C3275jP f13133a;

    /* renamed from: b, reason: collision with root package name */
    private final C4754wO f13134b;

    /* renamed from: c, reason: collision with root package name */
    private final C4045qB f13135c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2353bM f13136d;

    public GM(C3275jP c3275jP, C4754wO c4754wO, C4045qB c4045qB, InterfaceC2353bM interfaceC2353bM) {
        this.f13133a = c3275jP;
        this.f13134b = c4754wO;
        this.f13135c = c4045qB;
        this.f13136d = interfaceC2353bM;
    }

    final /* synthetic */ void a(InterfaceC2065Wv interfaceC2065Wv, Map map) {
        this.f13134b.zzj("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void b(InterfaceC2065Wv interfaceC2065Wv, Map map) {
        this.f13136d.zzg();
    }

    final /* synthetic */ void c(Map map, boolean z8, int i8, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put(Constants.ID, (String) map.get(Constants.ID));
        this.f13134b.zzj("sendMessageToNativeJs", map2);
    }

    final /* synthetic */ void d(InterfaceC2065Wv interfaceC2065Wv, Map map) {
        L1.n.zzi("Showing native ads overlay.");
        interfaceC2065Wv.zzF().setVisibility(0);
        this.f13135c.zze(true);
    }

    final /* synthetic */ void e(InterfaceC2065Wv interfaceC2065Wv, Map map) {
        L1.n.zzi("Hiding native ads overlay.");
        interfaceC2065Wv.zzF().setVisibility(8);
        this.f13135c.zze(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza() {
        InterfaceC2065Wv interfaceC2065WvZza = this.f13133a.zza(H1.d2.zzc(), null, null);
        ((View) interfaceC2065WvZza).setVisibility(8);
        interfaceC2065WvZza.zzag("/sendMessageToSdk", new InterfaceC2278al() { // from class: com.google.android.gms.internal.ads.BM
            @Override // com.google.android.gms.internal.ads.InterfaceC2278al
            public final void zza(Object obj, Map map) {
                this.zza.a((InterfaceC2065Wv) obj, map);
            }
        });
        interfaceC2065WvZza.zzag("/adMuted", new InterfaceC2278al() { // from class: com.google.android.gms.internal.ads.CM
            @Override // com.google.android.gms.internal.ads.InterfaceC2278al
            public final void zza(Object obj, Map map) {
                this.zza.b((InterfaceC2065Wv) obj, map);
            }
        });
        this.f13134b.zzm(new WeakReference(interfaceC2065WvZza), "/loadHtml", new InterfaceC2278al() { // from class: com.google.android.gms.internal.ads.DM
            @Override // com.google.android.gms.internal.ads.InterfaceC2278al
            public final void zza(Object obj, final Map map) {
                InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) obj;
                InterfaceC1861Rw interfaceC1861RwZzN = interfaceC2065Wv.zzN();
                final GM gm = this.zza;
                interfaceC1861RwZzN.zzB(new InterfaceC1779Pw() { // from class: com.google.android.gms.internal.ads.zM
                    @Override // com.google.android.gms.internal.ads.InterfaceC1779Pw
                    public final void zza(boolean z8, int i8, String str, String str2) {
                        gm.c(map, z8, i8, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    interfaceC2065Wv.loadData(str, "text/html", "UTF-8");
                } else {
                    interfaceC2065Wv.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.f13134b.zzm(new WeakReference(interfaceC2065WvZza), "/showOverlay", new InterfaceC2278al() { // from class: com.google.android.gms.internal.ads.EM
            @Override // com.google.android.gms.internal.ads.InterfaceC2278al
            public final void zza(Object obj, Map map) {
                this.zza.d((InterfaceC2065Wv) obj, map);
            }
        });
        this.f13134b.zzm(new WeakReference(interfaceC2065WvZza), "/hideOverlay", new InterfaceC2278al() { // from class: com.google.android.gms.internal.ads.FM
            @Override // com.google.android.gms.internal.ads.InterfaceC2278al
            public final void zza(Object obj, Map map) {
                this.zza.e((InterfaceC2065Wv) obj, map);
            }
        });
        return (View) interfaceC2065WvZza;
    }
}
