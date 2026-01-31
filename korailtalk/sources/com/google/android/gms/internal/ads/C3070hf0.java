package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3070hf0 extends C2611df0 {

    /* renamed from: e, reason: collision with root package name */
    private WebView f19832e;

    /* renamed from: f, reason: collision with root package name */
    private Long f19833f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f19834g;

    public C3070hf0(String str, Map map, String str2) {
        super(str);
        this.f19833f = null;
        this.f19834g = map;
    }

    @Override // com.google.android.gms.internal.ads.C2611df0
    public final void zzc() {
        super.zzc();
        new Handler().postDelayed(new RunnableC2955gf0(this), Math.max(4000 - (this.f19833f == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f19833f.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f19832e = null;
    }

    @Override // com.google.android.gms.internal.ads.C2611df0
    public final void zzi(C4890xe0 c4890xe0, C4662ve0 c4662ve0) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map mapZzi = c4662ve0.zzi();
        Iterator it = mapZzi.keySet().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.f.a(mapZzi.get((String) it.next()));
            throw null;
        }
        a(c4890xe0, c4662ve0, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.C2611df0
    public final void zzn() {
        WebView webView = new WebView(C1956Ue0.zzb().zza());
        this.f19832e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f19832e.getSettings().setAllowContentAccess(false);
        this.f19832e.getSettings().setAllowFileAccess(false);
        this.f19832e.setWebViewClient(new C2840ff0(this));
        b(this.f19832e);
        C2038We0.zzj(this.f19832e, null);
        Iterator it = this.f19834g.keySet().iterator();
        if (!it.hasNext()) {
            this.f19833f = Long.valueOf(System.nanoTime());
        } else {
            android.support.v4.media.session.f.a(this.f19834g.get((String) it.next()));
            throw null;
        }
    }
}
