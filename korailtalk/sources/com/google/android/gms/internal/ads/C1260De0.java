package com.google.android.gms.internal.ads;

import G0.h;
import android.net.Uri;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.De0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1260De0 implements h.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1301Ee0 f12702a;

    C1260De0(C1301Ee0 c1301Ee0) {
        this.f12702a = c1301Ee0;
    }

    @Override // G0.h.b
    public final void onPostMessage(WebView webView, G0.f fVar, Uri uri, boolean z8, G0.a aVar) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(fVar.getData());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                C1301Ee0.c(this.f12702a, string2);
            } else if (string.equals("finishSession")) {
                C1301Ee0.a(this.f12702a, string2);
            } else {
                AbstractC4093qe0.zza.booleanValue();
            }
        } catch (JSONException e8) {
            AbstractC3411kf0.zza("Error parsing JS message in JavaScriptSessionService.", e8);
        }
    }
}
