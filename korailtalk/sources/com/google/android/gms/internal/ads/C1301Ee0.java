package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;

/* renamed from: com.google.android.gms.internal.ads.Ee0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1301Ee0 {

    /* renamed from: e, reason: collision with root package name */
    private static final C4208rf0 f12839e = new C4208rf0();

    /* renamed from: a, reason: collision with root package name */
    private final C1383Ge0 f12840a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f12841b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f12842c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final C1915Te0 f12843d = new C1915Te0();

    private C1301Ee0(C1383Ge0 c1383Ge0, WebView webView, boolean z8) {
        AbstractC3981pf0.zza();
        this.f12840a = c1383Ge0;
        this.f12841b = webView;
        if (!G0.i.isFeatureSupported(G0.i.WEB_MESSAGE_LISTENER)) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        d();
        G0.h.addWebMessageListener(webView, "omidJsSessionService", new HashSet(Arrays.asList("*")), new C1260De0(this));
    }

    static /* bridge */ /* synthetic */ void a(C1301Ee0 c1301Ee0, String str) {
        AbstractC4434te0 abstractC4434te0 = (AbstractC4434te0) c1301Ee0.f12842c.get(str);
        if (abstractC4434te0 != null) {
            abstractC4434te0.zzc();
            c1301Ee0.f12842c.remove(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* bridge */ /* synthetic */ void c(C1301Ee0 c1301Ee0, String str) {
        EnumC5004ye0 enumC5004ye0 = EnumC5004ye0.DEFINED_BY_JAVASCRIPT;
        EnumC1178Be0 enumC1178Be0 = EnumC1178Be0.DEFINED_BY_JAVASCRIPT;
        EnumC1342Fe0 enumC1342Fe0 = EnumC1342Fe0.JAVASCRIPT;
        C4890xe0 c4890xe0 = new C4890xe0(C4548ue0.zza(enumC5004ye0, enumC1178Be0, enumC1342Fe0, enumC1342Fe0, false), C4662ve0.zzb(c1301Ee0.f12840a, c1301Ee0.f12841b, null, null), str);
        c1301Ee0.f12842c.put(str, c4890xe0);
        c4890xe0.zzd(c1301Ee0.f12841b);
        for (C1874Se0 c1874Se0 : c1301Ee0.f12843d.zza()) {
            c4890xe0.zzb((View) c1874Se0.zzb().get(), c1874Se0.zza(), c1874Se0.zzc());
        }
        c4890xe0.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        G0.h.removeWebMessageListener(this.f12841b, "omidJsSessionService");
    }

    public static C1301Ee0 zza(C1383Ge0 c1383Ge0, WebView webView, boolean z8) {
        return new C1301Ee0(c1383Ge0, webView, true);
    }

    public final void zze(View view, EnumC1137Ae0 enumC1137Ae0, String str) {
        Iterator it = this.f12842c.values().iterator();
        while (it.hasNext()) {
            ((AbstractC4434te0) it.next()).zzb(view, enumC1137Ae0, "Ad overlay");
        }
        this.f12843d.zzb(view, enumC1137Ae0, "Ad overlay");
    }

    public final void zzf(C3786nw c3786nw) {
        Iterator it = this.f12842c.values().iterator();
        while (it.hasNext()) {
            ((AbstractC4434te0) it.next()).zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new C1219Ce0(this, c3786nw, timer), 1000L);
    }
}
