package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;

/* renamed from: com.google.android.gms.internal.ads.Fw */
/* loaded from: classes2.dex */
public final class C1370Fw {

    /* renamed from: a */
    private final InterfaceC1411Gw f13083a;

    /* renamed from: b */
    private final C1329Ew f13084b;

    public C1370Fw(InterfaceC1411Gw interfaceC1411Gw, C1329Ew c1329Ew) {
        this.f13084b = c1329Ew;
        this.f13083a = interfaceC1411Gw;
    }

    final /* synthetic */ void a(String str) {
        Uri uri = Uri.parse(str);
        C2988gw c2988gwZzaO = ((ViewTreeObserverOnGlobalLayoutListenerC5039yw) this.f13084b.zza).zzaO();
        if (c2988gwZzaO == null) {
            L1.n.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            c2988gwZzaO.zzj(uri);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.Gw, com.google.android.gms.internal.ads.Mw] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            AbstractC0667v0.zza("Click string is empty, not proceeding.");
            return "";
        }
        ?? r02 = this.f13083a;
        C2487cb c2487cbZzI = r02.zzI();
        if (c2487cbZzI == null) {
            AbstractC0667v0.zza("Signal utils is empty, ignoring.");
            return "";
        }
        InterfaceC2070Xa interfaceC2070XaZzc = c2487cbZzI.zzc();
        if (interfaceC2070XaZzc == null) {
            AbstractC0667v0.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (r02.getContext() == null) {
            AbstractC0667v0.zza("Context is null, ignoring.");
            return "";
        }
        InterfaceC1411Gw interfaceC1411Gw = this.f13083a;
        return interfaceC2070XaZzc.zzf(interfaceC1411Gw.getContext(), str, (View) interfaceC1411Gw, interfaceC1411Gw.zzi());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Gw, com.google.android.gms.internal.ads.Mw] */
    @JavascriptInterface
    public String getViewSignals() {
        ?? r02 = this.f13083a;
        C2487cb c2487cbZzI = r02.zzI();
        if (c2487cbZzI == null) {
            AbstractC0667v0.zza("Signal utils is empty, ignoring.");
            return "";
        }
        InterfaceC2070Xa interfaceC2070XaZzc = c2487cbZzI.zzc();
        if (interfaceC2070XaZzc == null) {
            AbstractC0667v0.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (r02.getContext() == null) {
            AbstractC0667v0.zza("Context is null, ignoring.");
            return "";
        }
        InterfaceC1411Gw interfaceC1411Gw = this.f13083a;
        return interfaceC2070XaZzc.zzh(interfaceC1411Gw.getContext(), (View) interfaceC1411Gw, interfaceC1411Gw.zzi());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            L1.n.zzj("URL is empty, ignoring message");
        } else {
            K1.K0.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Dw
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.a(str);
                }
            });
        }
    }
}
