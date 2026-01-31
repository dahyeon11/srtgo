package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Qk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1803Qk implements InterfaceC2278al {
    C1803Qk() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(interfaceC2065Wv.getContext()).edit();
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                editorEdit.remove(jSONArray.getString(i8));
            }
            editorEdit.apply();
        } catch (JSONException e8) {
            G1.u.zzo().zzw(e8, "GMSG clear local storage keys handler");
        }
    }
}
