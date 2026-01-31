package com.google.android.gms.internal.ads;

import H1.C0591z;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.vm */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4677vm {
    public static void zza(InterfaceC4791wm interfaceC4791wm, String str, Map map) {
        try {
            interfaceC4791wm.zze(str, C0591z.zzb().zzj(map));
        } catch (JSONException unused) {
            L1.n.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(InterfaceC4791wm interfaceC4791wm, String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        L1.n.zze("Dispatching AFMA event: ".concat(sb.toString()));
        interfaceC4791wm.zza(sb.toString());
    }

    public static void zzc(InterfaceC4791wm interfaceC4791wm, String str, String str2) {
        interfaceC4791wm.zza(str + "(" + str2 + ");");
    }

    public static void zzd(InterfaceC4791wm interfaceC4791wm, String str, JSONObject jSONObject) {
        interfaceC4791wm.zzb(str, jSONObject.toString());
    }
}
