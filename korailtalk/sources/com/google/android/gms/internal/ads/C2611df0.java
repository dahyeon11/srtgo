package com.google.android.gms.internal.ads;

import ai.maum.m2u.cdk.grpclib.constants.BaseConst;
import android.os.Build;
import android.webkit.WebView;
import com.kakao.sdk.common.Constants;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.df0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2611df0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f18656a;

    /* renamed from: b, reason: collision with root package name */
    private C1385Gf0 f18657b;

    /* renamed from: c, reason: collision with root package name */
    private long f18658c;

    /* renamed from: d, reason: collision with root package name */
    private int f18659d;

    public C2611df0(String str) {
        zzb();
        this.f18656a = str;
        this.f18657b = new C1385Gf0(null);
    }

    protected final void a(C4890xe0 c4890xe0, C4662ve0 c4662ve0, JSONObject jSONObject) throws JSONException {
        String strZzh = c4890xe0.zzh();
        JSONObject jSONObject2 = new JSONObject();
        AbstractC3297jf0.zze(jSONObject2, "environment", "app");
        AbstractC3297jf0.zze(jSONObject2, "adSessionType", c4662ve0.zzd());
        JSONObject jSONObject3 = new JSONObject();
        AbstractC3297jf0.zze(jSONObject3, BaseConst.MapKeys.DEVICE_TYPE, Build.MANUFACTURER + "; " + Build.MODEL);
        AbstractC3297jf0.zze(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        AbstractC3297jf0.zze(jSONObject3, Constants.OS, "Android");
        AbstractC3297jf0.zze(jSONObject2, "deviceInfo", jSONObject3);
        AbstractC3297jf0.zze(jSONObject2, "deviceCategory", AbstractC3184if0.zza().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        AbstractC3297jf0.zze(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        AbstractC3297jf0.zze(jSONObject4, "partnerName", c4662ve0.zze().zzb());
        AbstractC3297jf0.zze(jSONObject4, "partnerVersion", c4662ve0.zze().zzc());
        AbstractC3297jf0.zze(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        AbstractC3297jf0.zze(jSONObject5, "libraryVersion", "1.4.10-google_20240110");
        AbstractC3297jf0.zze(jSONObject5, com.kakao.sdk.user.Constants.APPID, C1956Ue0.zzb().zza().getApplicationContext().getPackageName());
        AbstractC3297jf0.zze(jSONObject2, "app", jSONObject5);
        if (c4662ve0.zzf() != null) {
            AbstractC3297jf0.zze(jSONObject2, "contentUrl", c4662ve0.zzf());
        }
        if (c4662ve0.zzg() != null) {
            AbstractC3297jf0.zze(jSONObject2, "customReferenceData", c4662ve0.zzg());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = c4662ve0.zzh().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.f.a(it.next());
            throw null;
        }
        C2038We0.zza().zzi(zza(), strZzh, jSONObject2, jSONObject6, jSONObject);
    }

    final void b(WebView webView) {
        this.f18657b = new C1385Gf0(webView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView zza() {
        return (WebView) this.f18657b.get();
    }

    public final void zzb() {
        this.f18658c = System.nanoTime();
        this.f18659d = 1;
    }

    public void zzc() {
        this.f18657b.clear();
    }

    public final void zzd(String str, long j8) {
        if (j8 < this.f18658c || this.f18659d == 3) {
            return;
        }
        this.f18659d = 3;
        C2038We0.zza().zzg(zza(), this.f18656a, str);
    }

    public final void zze() {
        C2038We0.zza().zzc(zza(), this.f18656a);
    }

    public final void zzf(C4548ue0 c4548ue0) {
        C2038We0.zza().zzd(zza(), this.f18656a, c4548ue0.zzb());
    }

    public final void zzg(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        AbstractC3297jf0.zze(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C2038We0.zza().zzf(zza(), jSONObject);
    }

    public final void zzh(String str, long j8) {
        if (j8 >= this.f18658c) {
            this.f18659d = 2;
            C2038We0.zza().zzg(zza(), this.f18656a, str);
        }
    }

    public void zzi(C4890xe0 c4890xe0, C4662ve0 c4662ve0) {
        a(c4890xe0, c4662ve0, null);
    }

    public final void zzk(boolean z8) {
        if (this.f18657b.get() != 0) {
            C2038We0.zza().zzh(zza(), this.f18656a, true != z8 ? "backgrounded" : "foregrounded");
        }
    }

    public final void zzl(float f8) {
        C2038We0.zza().zze(zza(), this.f18656a, f8);
    }

    public void zzn() {
    }
}
