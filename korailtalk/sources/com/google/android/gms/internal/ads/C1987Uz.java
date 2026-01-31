package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Uz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1987Uz {

    /* renamed from: a, reason: collision with root package name */
    private final Map f16745a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f16746b;

    C1987Uz(Map map, Map map2) {
        this.f16745a = map;
        this.f16746b = map2;
    }

    public final void zza(C1457Ia0 c1457Ia0) {
        for (C1375Ga0 c1375Ga0 : c1457Ia0.zzb.zzc) {
            if (this.f16745a.containsKey(c1375Ga0.zza)) {
                ((InterfaceC2110Xz) this.f16745a.get(c1375Ga0.zza)).zza(c1375Ga0.zzb);
            } else if (this.f16746b.containsKey(c1375Ga0.zza)) {
                InterfaceC2069Wz interfaceC2069Wz = (InterfaceC2069Wz) this.f16746b.get(c1375Ga0.zza);
                JSONObject jSONObject = c1375Ga0.zzb;
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        map.put(next, strOptString);
                    }
                }
                interfaceC2069Wz.zza(map);
            }
        }
    }
}
