package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class B00 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f12223a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f12224b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f12225c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f12226d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map f12227e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Executor f12228f;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f12229g;

    B00(Executor executor) {
        this.f12228f = executor;
    }

    private final synchronized AbstractC2737el0 b(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(G1.u.zzo().zzi().zzh().zzc())) {
                boolean zMatches = Pattern.matches((String) H1.C.zzc().zza(AbstractC4439th.zzde), str);
                boolean zMatches2 = Pattern.matches((String) H1.C.zzc().zza(AbstractC4439th.zzdf), str);
                if (zMatches) {
                    map = new HashMap(this.f12227e);
                } else if (zMatches2) {
                    map = new HashMap(this.f12226d);
                }
                return AbstractC2737el0.zzc(map);
            }
            return AbstractC2737el0.zzd();
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized List c(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle bundleI = i(jSONObject.optJSONObject("data"));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i8, "");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        String str2 = (String) arrayList2.get(i9);
                        zzg(str2);
                        if (((E00) this.f12223a.get(str2)) != null) {
                            arrayList.add(new E00(str2, str, bundleI));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void d() {
        this.f12224b.clear();
        this.f12223a.clear();
        this.f12227e.clear();
        this.f12226d.clear();
        g();
        h();
        e();
    }

    private final synchronized void e() {
        JSONObject jSONObjectZzf;
        try {
            if (!((Boolean) AbstractC4783wi.zzb.zze()).booleanValue()) {
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbN)).booleanValue() && (jSONObjectZzf = G1.u.zzo().zzi().zzh().zzf()) != null) {
                    JSONArray jSONArray = jSONObjectZzf.getJSONArray("adapter_settings");
                    for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i8);
                        String strOptString = jSONObject.optString("adapter_class_name");
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(strOptString)) {
                            for (int i9 = 0; i9 < jSONArrayOptJSONArray.length(); i9++) {
                                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i9);
                                boolean zOptBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                boolean zOptBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                boolean zOptBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                String strOptString2 = jSONObject2.optString("platform");
                                G00 g00 = new G00(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                if (strOptString2.equals("ADMOB")) {
                                    this.f12226d.put(strOptString, g00);
                                } else if (strOptString2.equals("AD_MANAGER")) {
                                    this.f12227e.put(strOptString, g00);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e8) {
            AbstractC0667v0.zzb("Malformed config loading JSON.", e8);
        } finally {
        }
    }

    private final synchronized void f(String str, String str2, List list) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = (Map) this.f12225c.get(str);
            if (map == null) {
                map = new HashMap();
            }
            this.f12225c.put(str, map);
            List arrayList = (List) map.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.addAll(list);
            map.put(str2, arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void g() {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObjectZzf = G1.u.zzo().zzi().zzh().zzf();
            if (jSONObjectZzf != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectZzf.optJSONArray("ad_unit_id_settings");
                    this.f12229g = jSONObjectZzf.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i8 = 0; i8 < jSONArrayOptJSONArray2.length(); i8++) {
                            JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i8);
                            String lowerCase = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkR)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                            String strOptString = jSONObject.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i9 = 0; i9 < jSONArrayOptJSONArray.length(); i9++) {
                                    arrayList.addAll(c(jSONArrayOptJSONArray.getJSONObject(i9), strOptString));
                                }
                            }
                            f(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e8) {
                    AbstractC0667v0.zzb("Malformed config loading JSON.", e8);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void h() {
        JSONObject jSONObjectZzf;
        if (!((Boolean) AbstractC4783wi.zzg.zze()).booleanValue()) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbM)).booleanValue() && (jSONObjectZzf = G1.u.zzo().zzi().zzh().zzf()) != null) {
                try {
                    JSONArray jSONArray = jSONObjectZzf.getJSONArray("signal_adapters");
                    for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i8);
                        Bundle bundleI = i(jSONObject.optJSONObject("data"));
                        String strOptString = jSONObject.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.f12224b.put(strOptString, new G00(strOptString, zOptBoolean2, zOptBoolean, true, bundleI));
                        }
                    }
                } catch (JSONException e8) {
                    AbstractC0667v0.zzb("Malformed config loading JSON.", e8);
                }
            }
        }
    }

    private static final Bundle i(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    final /* synthetic */ void a() {
        this.f12228f.execute(new RunnableC5049z00(this));
    }

    public final synchronized Map zza(String str, String str2) {
        HashMap map;
        try {
            Map mapZzb = zzb(str, str2);
            AbstractC2737el0 abstractC2737el0B = b(str2);
            map = new HashMap();
            for (Map.Entry entry : ((AbstractC2737el0) mapZzb).entrySet()) {
                String str3 = (String) entry.getKey();
                if (abstractC2737el0B.containsKey(str3)) {
                    G00 g00 = (G00) abstractC2737el0B.get(str3);
                    List list = (List) entry.getValue();
                    map.put(str3, new G00(str3, g00.zzb, g00.zzc, g00.zzd, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            AbstractC3311jm0 it = abstractC2737el0B.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String str4 = (String) entry2.getKey();
                if (!map.containsKey(str4) && ((G00) entry2.getValue()).zzd) {
                    map.put(str4, (G00) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return map;
    }

    public final synchronized Map zzb(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(G1.u.zzo().zzi().zzh().zzc()) && (map = (Map) this.f12225c.get(str)) != null) {
                List<E00> list = (List) map.get(str2);
                if (list == null) {
                    String strZza = HP.zza(this.f12229g, str2, str);
                    if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkR)).booleanValue()) {
                        strZza = strZza.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(strZza);
                }
                if (list != null) {
                    HashMap map2 = new HashMap();
                    for (E00 e00 : list) {
                        String str3 = e00.zza;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new ArrayList());
                        }
                        ((List) map2.get(str3)).add(e00.zzc);
                    }
                    return AbstractC2737el0.zzc(map2);
                }
            }
            return AbstractC2737el0.zzd();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map zzc() {
        if (TextUtils.isEmpty(G1.u.zzo().zzi().zzh().zzc())) {
            return AbstractC2737el0.zzd();
        }
        return AbstractC2737el0.zzc(this.f12224b);
    }

    public final void zze() {
        G1.u.zzo().zzi().zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.A00
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.a();
            }
        });
        this.f12228f.execute(new RunnableC5049z00(this));
    }

    public final synchronized void zzg(String str) {
        if (!TextUtils.isEmpty(str) && !this.f12223a.containsKey(str)) {
            this.f12223a.put(str, new E00(str, "", new Bundle()));
        }
    }
}
