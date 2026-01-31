package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Hw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1452Hw extends C2988gw {
    public C1452Hw(InterfaceC2065Wv interfaceC2065Wv, C4775we c4775we, boolean z8, GW gw) {
        super(interfaceC2065Wv, c4775we, z8, new C4683vp(interfaceC2065Wv, interfaceC2065Wv.zzE(), new C2270ah(interfaceC2065Wv.getContext())), null, gw);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse n(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof InterfaceC2065Wv)) {
            L1.n.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) webView;
        InterfaceC4233rs interfaceC4233rs = this.f19476x;
        if (interfaceC4233rs != null) {
            interfaceC4233rs.zzd(str, map, 1);
        }
        AbstractC3415kh0.zza();
        AbstractC3985ph0 abstractC3985ph0 = AbstractC3985ph0.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.h(str, map);
        }
        if (interfaceC2065Wv.zzN() != null) {
            interfaceC2065Wv.zzN().zzF();
        }
        if (interfaceC2065Wv.zzO().zzi()) {
            str2 = (String) H1.C.zzc().zza(AbstractC4439th.zzN);
        } else if (interfaceC2065Wv.zzaF()) {
            str2 = (String) H1.C.zzc().zza(AbstractC4439th.zzM);
        } else {
            str2 = (String) H1.C.zzc().zza(AbstractC4439th.zzL);
        }
        G1.u.zzp();
        return K1.K0.zzx(interfaceC2065Wv.getContext(), interfaceC2065Wv.zzn().afmaVersion, str2);
    }
}
