package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class EP {

    /* renamed from: a, reason: collision with root package name */
    private final Map f12803a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f12804b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f12805c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12806d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f12807e;

    public EP(Executor executor) {
        this.f12805c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void c() {
        JSONObject jSONObjectZzf;
        Map map;
        try {
            this.f12806d = true;
            C2867ft c2867ftZzh = G1.u.zzo().zzi().zzh();
            if (c2867ftZzh != null && (jSONObjectZzf = c2867ftZzh.zzf()) != null) {
                this.f12804b = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdZ)).booleanValue() ? jSONObjectZzf.optJSONObject("common_settings") : null;
                this.f12807e = jSONObjectZzf.optJSONObject("ad_unit_patterns");
                JSONArray jSONArrayOptJSONArray = jSONObjectZzf.optJSONArray("ad_unit_id_settings");
                if (jSONArrayOptJSONArray != null) {
                    for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i8);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                            String strOptString2 = jSONObjectOptJSONObject.optString("format");
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                            if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                                if (this.f12803a.containsKey(strOptString2)) {
                                    map = (Map) this.f12803a.get(strOptString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.f12803a.put(strOptString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(strOptString, jSONObjectOptJSONObject2);
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }

    final /* synthetic */ void b() {
        this.f12805c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.DP
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.a();
            }
        });
    }

    public final JSONObject zza() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdZ)).booleanValue()) {
            return this.f12804b;
        }
        return null;
    }

    public final JSONObject zzb(String str, String str2) {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdY)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f12806d) {
            c();
        }
        Map map = (Map) this.f12803a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String strZza = HP.zza(this.f12807e, str, str2);
        if (strZza != null) {
            return (JSONObject) map.get(strZza);
        }
        return null;
    }

    public final void zzc() {
        G1.u.zzo().zzi().zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.BP
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.b();
            }
        });
        this.f12805c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.CP
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.c();
            }
        });
    }
}
