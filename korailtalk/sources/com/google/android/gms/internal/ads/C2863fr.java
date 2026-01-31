package com.google.android.gms.internal.ads;

import Q7.C0709m;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.fr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2863fr {

    /* renamed from: a, reason: collision with root package name */
    private final List f19242a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19243b;

    /* renamed from: c, reason: collision with root package name */
    private final String f19244c;

    /* renamed from: d, reason: collision with root package name */
    private final String f19245d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f19246e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f19247f;

    /* renamed from: g, reason: collision with root package name */
    private final String f19248g;

    /* renamed from: h, reason: collision with root package name */
    private final String f19249h;

    /* renamed from: i, reason: collision with root package name */
    private final String f19250i;

    /* renamed from: j, reason: collision with root package name */
    private final int f19251j;

    /* renamed from: k, reason: collision with root package name */
    private final JSONObject f19252k;

    /* renamed from: l, reason: collision with root package name */
    private final String f19253l;

    /* renamed from: m, reason: collision with root package name */
    private final String f19254m;

    /* renamed from: n, reason: collision with root package name */
    private final long f19255n;

    /* renamed from: o, reason: collision with root package name */
    private final long f19256o;

    public C2863fr(JSONObject jSONObject) {
        this.f19250i = jSONObject.optString("url");
        this.f19243b = jSONObject.optString("base_uri");
        this.f19244c = jSONObject.optString("post_parameters");
        this.f19246e = b(jSONObject.optString("drt_include"));
        this.f19247f = b(jSONObject.optString("cookies_include", C0709m.TRUE));
        this.f19248g = jSONObject.optString("request_id");
        this.f19245d = jSONObject.optString("type");
        String strOptString = jSONObject.optString("errors");
        this.f19242a = strOptString == null ? null : Arrays.asList(strOptString.split(","));
        this.f19251j = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.f19249h = jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f19252k = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        this.f19253l = jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f19254m = jSONObject.optString("pool_key");
        this.f19255n = a(jSONObject.optString("start_time")).longValue();
        this.f19256o = a(jSONObject.optString("end_time")).longValue();
    }

    private static Long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        try {
            return Long.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private static boolean b(String str) {
        if (str != null) {
            return str.equals("1") || str.equals(C0709m.TRUE);
        }
        return false;
    }

    public final int zza() {
        return this.f19251j;
    }

    public final long zzb() {
        return this.f19256o;
    }

    public final long zzc() {
        return this.f19255n;
    }

    public final String zzd() {
        return this.f19243b;
    }

    public final String zze() {
        return this.f19254m;
    }

    public final String zzf() {
        return this.f19244c;
    }

    public final String zzg() {
        return this.f19250i;
    }

    public final List zzh() {
        return this.f19242a;
    }

    public final JSONObject zzi() {
        return this.f19252k;
    }

    public final boolean zzj() {
        return this.f19247f;
    }

    public final boolean zzk() {
        return this.f19246e;
    }
}
