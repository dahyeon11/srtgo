package com.google.android.gms.internal.ads;

import com.kakao.sdk.user.Constants;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Fn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1359Fn implements InterfaceC3997pn0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3426kn f13065a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3654mn f13066b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13067c = "google.afma.activeView.handleUpdate";

    /* renamed from: d, reason: collision with root package name */
    private final com.google.common.util.concurrent.C f13068d;

    C1359Fn(com.google.common.util.concurrent.C c9, String str, InterfaceC3654mn interfaceC3654mn, InterfaceC3426kn interfaceC3426kn) {
        this.f13068d = c9;
        this.f13066b = interfaceC3654mn;
        this.f13065a = interfaceC3426kn;
    }

    final /* synthetic */ com.google.common.util.concurrent.C a(Object obj, InterfaceC2855fn interfaceC2855fn) throws JSONException {
        C1203Bt c1203Bt = new C1203Bt();
        G1.u.zzp();
        String string = UUID.randomUUID().toString();
        AbstractC2172Zk.zzo.zzc(string, new C1318En(this, c1203Bt));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ID, string);
        jSONObject.put("args", (JSONObject) obj);
        interfaceC2855fn.zzl(this.f13067c, jSONObject);
        return c1203Bt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
    public final com.google.common.util.concurrent.C zza(Object obj) {
        return zzb(obj);
    }

    public final com.google.common.util.concurrent.C zzb(final Object obj) {
        return AbstractC1483In0.zzn(this.f13068d, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.Dn
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj2) {
                return this.zza.a(obj, (InterfaceC2855fn) obj2);
            }
        }, AbstractC4805wt.zzf);
    }
}
