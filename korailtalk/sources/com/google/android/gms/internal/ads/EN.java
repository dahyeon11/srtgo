package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class EN {

    /* renamed from: a */
    private final Executor f12801a;

    /* renamed from: b */
    private final C4980yN f12802b;

    public EN(Executor executor, C4980yN c4980yN) {
        this.f12801a = executor;
        this.f12802b = c4980yN;
    }

    public final com.google.common.util.concurrent.C zza(JSONObject jSONObject, String str) {
        com.google.common.util.concurrent.C cZzh;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return AbstractC1483In0.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i8);
            if (jSONObjectOptJSONObject == null) {
                cZzh = AbstractC1483In0.zzh(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString("name");
                if (strOptString == null) {
                    cZzh = AbstractC1483In0.zzh(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    cZzh = "string".equals(strOptString2) ? AbstractC1483In0.zzh(new DN(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? AbstractC1483In0.zzm(this.f12802b.zze(jSONObjectOptJSONObject, "image_value"), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.AN
                        @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
                        public final Object apply(Object obj) {
                            return new DN(strOptString, (BinderC1758Pi) obj);
                        }
                    }, this.f12801a) : AbstractC1483In0.zzh(null);
                }
            }
            arrayList.add(cZzh);
        }
        return AbstractC1483In0.zzm(AbstractC1483In0.zzd(arrayList), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.BN
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (DN dn : (List) obj) {
                    if (dn != null) {
                        arrayList2.add(dn);
                    }
                }
                return arrayList2;
            }
        }, this.f12801a);
    }
}
