package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Mn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1645Mn {
    public static final List zza(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
        for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
            arrayList.add(jSONArrayOptJSONArray.getString(i8));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
