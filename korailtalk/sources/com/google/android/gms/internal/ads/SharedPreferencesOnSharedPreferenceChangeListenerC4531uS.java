package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.uS, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC4531uS implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f23052a = new JSONObject();

    /* renamed from: b, reason: collision with root package name */
    private List f23053b;

    SharedPreferencesOnSharedPreferenceChangeListenerC4531uS() {
    }

    final void a(SharedPreferences sharedPreferences, List list) throws JSONException {
        this.f23053b = list;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            onSharedPreferenceChanged(sharedPreferences, (String) it.next());
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) throws JSONException {
        if (str != null && this.f23053b.contains(str)) {
            try {
                Object obj = sharedPreferences.getAll().get(str);
                if (obj == null) {
                    this.f23052a.remove(str);
                } else {
                    this.f23052a.put(str, obj);
                }
            } catch (JSONException e8) {
                G1.u.zzo().zzv(e8, "InspectorSharedPreferenceCollector.onSharedPreferenceChanged");
            }
        }
    }

    public final JSONObject zza() {
        return this.f23052a;
    }
}
