package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Yq */
/* loaded from: classes2.dex */
public final class C2142Yq extends AbstractC2060Wq {

    /* renamed from: a */
    private final Object f17428a = new Object();

    /* renamed from: b */
    private final Context f17429b;

    /* renamed from: c */
    private SharedPreferences f17430c;

    /* renamed from: d */
    private final InterfaceC3199in f17431d;

    /* renamed from: e */
    private final L1.a f17432e;

    public C2142Yq(Context context, InterfaceC3199in interfaceC3199in, L1.a aVar) {
        this.f17429b = context.getApplicationContext();
        this.f17432e = aVar;
        this.f17431d = interfaceC3199in;
    }

    public static JSONObject zzc(Context context, L1.a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) AbstractC4100qi.zzb.zze()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", aVar.afmaVersion);
            jSONObject.put("mf", AbstractC4100qi.zzc.zze());
            jSONObject.put("cl", "636244245");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    final /* synthetic */ Void a(JSONObject jSONObject) {
        AbstractC3414kh abstractC3414kh = AbstractC4439th.zza;
        H1.C.zzb();
        SharedPreferences sharedPreferencesZza = C3642mh.zza(this.f17429b);
        if (sharedPreferencesZza == null) {
            return null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesZza.edit();
        H1.C.zza();
        C2272ai c2272ai = AbstractC2960gi.zza;
        H1.C.zza().zze(editorEdit, 1, jSONObject);
        H1.C.zzb();
        editorEdit.commit();
        SharedPreferences sharedPreferences = this.f17430c;
        if (sharedPreferences == null) {
            return null;
        }
        sharedPreferences.edit().putLong("js_last_update", G1.u.zzB().currentTimeMillis()).apply();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2060Wq
    public final com.google.common.util.concurrent.C zza() {
        synchronized (this.f17428a) {
            try {
                if (this.f17430c == null) {
                    this.f17430c = this.f17429b.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = this.f17430c;
        if (G1.u.zzB().currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L) < ((Long) AbstractC4100qi.zzd.zze()).longValue()) {
            return AbstractC1483In0.zzh(null);
        }
        return AbstractC1483In0.zzm(this.f17431d.zzb(zzc(this.f17429b, this.f17432e)), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.Xq
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                this.zza.a((JSONObject) obj);
                return null;
            }
        }, AbstractC4805wt.zzf);
    }
}
