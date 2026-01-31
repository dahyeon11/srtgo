package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ok, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3876ok implements InterfaceC2278al {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3990pk f21555a;

    public C3876ok(InterfaceC3990pk interfaceC3990pk) {
        this.f21555a = interfaceC3990pk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2278al
    public final void zza(Object obj, Map map) {
        if (this.f21555a == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            L1.n.zzi("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleZza = null;
        if (map.containsKey("info")) {
            try {
                bundleZza = K1.Z.zza(new JSONObject((String) map.get("info")));
            } catch (JSONException e8) {
                L1.n.zzh("Failed to convert ad metadata to JSON.", e8);
            }
        }
        if (bundleZza == null) {
            L1.n.zzg("Failed to convert ad metadata to Bundle.");
        } else {
            this.f21555a.zza(str, bundleZza);
        }
    }
}
