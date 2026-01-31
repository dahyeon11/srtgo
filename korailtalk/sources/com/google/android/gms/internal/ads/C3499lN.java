package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.kakao.sdk.link.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.lN */
/* loaded from: classes2.dex */
public final class C3499lN {

    /* renamed from: a */
    private final InterfaceExecutorServiceC1974Un0 f20654a;

    /* renamed from: b */
    private final C4980yN f20655b;

    /* renamed from: c */
    private final EN f20656c;

    public C3499lN(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, C4980yN c4980yN, EN en) {
        this.f20654a = interfaceExecutorServiceC1974Un0;
        this.f20655b = c4980yN;
        this.f20656c = en;
    }

    public final com.google.common.util.concurrent.C zza(final C1457Ia0 c1457Ia0, final C4654va0 c4654va0, final JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        com.google.common.util.concurrent.C cZzn;
        final com.google.common.util.concurrent.C cZzb = this.f20654a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.jN
            @Override // java.util.concurrent.Callable
            public final Object call() throws C3399kZ {
                SL sl = new SL();
                JSONObject jSONObject2 = jSONObject;
                sl.zzaa(jSONObject2.optInt(Constants.TEMPLATE_ID, -1));
                sl.zzK(jSONObject2.optString("custom_template_id"));
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("omid_partner_name") : null;
                C1457Ia0 c1457Ia02 = c1457Ia0;
                sl.zzV(strOptString);
                C1825Ra0 c1825Ra0 = c1457Ia02.zza.zza;
                if (!c1825Ra0.zzg.contains(Integer.toString(sl.zzc()))) {
                    throw new C3399kZ(1, "Invalid template ID: " + sl.zzc());
                }
                if (sl.zzc() == 3) {
                    if (sl.zzA() == null) {
                        throw new C3399kZ(1, "No custom template id for custom template ad response.");
                    }
                    if (!c1825Ra0.zzh.contains(sl.zzA())) {
                        throw new C3399kZ(1, "Unexpected custom template id in the response.");
                    }
                }
                C4654va0 c4654va02 = c4654va0;
                sl.zzY(jSONObject2.optDouble("rating", -1.0d));
                String strOptString2 = jSONObject2.optString("headline", null);
                if (c4654va02.zzN) {
                    G1.u.zzp();
                    strOptString2 = K1.K0.zzy() + " : " + strOptString2;
                }
                sl.zzZ("headline", strOptString2);
                sl.zzZ("body", jSONObject2.optString("body", null));
                sl.zzZ("call_to_action", jSONObject2.optString("call_to_action", null));
                sl.zzZ("store", jSONObject2.optString("store", null));
                sl.zzZ("price", jSONObject2.optString("price", null));
                sl.zzZ("advertiser", jSONObject2.optString("advertiser", null));
                return sl;
            }
        });
        final com.google.common.util.concurrent.C cZzf = this.f20655b.zzf(jSONObject, "images");
        C4996ya0 c4996ya0 = c1457Ia0.zzb.zzb;
        C4980yN c4980yN = this.f20655b;
        final com.google.common.util.concurrent.C cZzg = c4980yN.zzg(jSONObject, "images", c4654va0, c4996ya0);
        final com.google.common.util.concurrent.C cZze = c4980yN.zze(jSONObject, "secondary_image");
        final com.google.common.util.concurrent.C cZze2 = c4980yN.zze(jSONObject, "app_icon");
        final com.google.common.util.concurrent.C cZzd = c4980yN.zzd(jSONObject, "attribution");
        final com.google.common.util.concurrent.C cZzh = this.f20655b.zzh(jSONObject, c4654va0, c1457Ia0.zzb.zzb);
        final com.google.common.util.concurrent.C cZza = this.f20656c.zza(jSONObject, "custom_assets");
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            if (TextUtils.isEmpty(strOptString)) {
                cZzn = AbstractC1483In0.zzh(null);
            } else {
                final C4980yN c4980yN2 = this.f20655b;
                cZzn = AbstractC1483In0.zzn(AbstractC1483In0.zzh(null), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.nN
                    @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
                    public final com.google.common.util.concurrent.C zza(Object obj) {
                        return c4980yN2.c(strOptString, obj);
                    }
                }, AbstractC4805wt.zze);
            }
        } else {
            cZzn = AbstractC1483In0.zzh(null);
        }
        final com.google.common.util.concurrent.C c9 = cZzn;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cZzb);
        arrayList.add(cZzf);
        arrayList.add(cZzg);
        arrayList.add(cZze);
        arrayList.add(cZze2);
        arrayList.add(cZzd);
        arrayList.add(cZzh);
        arrayList.add(cZza);
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfi)).booleanValue()) {
            arrayList.add(c9);
        }
        return AbstractC1483In0.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.kN
            @Override // java.util.concurrent.Callable
            public final Object call() {
                SL sl = (SL) cZzb.get();
                sl.zzP((List) cZzf.get());
                sl.zzM((InterfaceC2503cj) cZze2.get());
                sl.zzQ((InterfaceC2503cj) cZze.get());
                sl.zzJ((InterfaceC2004Vi) cZzd.get());
                JSONObject jSONObject2 = jSONObject;
                sl.zzS(C4980yN.zzj(jSONObject2));
                sl.zzL(C4980yN.zzi(jSONObject2));
                InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) cZzh.get();
                if (interfaceC2065Wv != null) {
                    sl.zzad(interfaceC2065Wv);
                    sl.zzac(interfaceC2065Wv.zzF());
                    sl.zzab(interfaceC2065Wv.zzq());
                }
                InterfaceC2065Wv interfaceC2065Wv2 = (InterfaceC2065Wv) cZzg.get();
                if (interfaceC2065Wv2 != null) {
                    sl.zzO(interfaceC2065Wv2);
                    sl.zzae(interfaceC2065Wv2.zzF());
                }
                com.google.common.util.concurrent.C c10 = c9;
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfi)).booleanValue()) {
                    sl.zzU(c10);
                    sl.zzX(new C1203Bt());
                } else {
                    InterfaceC2065Wv interfaceC2065Wv3 = (InterfaceC2065Wv) c10.get();
                    if (interfaceC2065Wv3 != null) {
                        sl.zzT(interfaceC2065Wv3);
                    }
                }
                for (DN dn : (List) cZza.get()) {
                    if (dn.zza != 1) {
                        sl.zzN(dn.zzb, dn.zzd);
                    } else {
                        sl.zzZ(dn.zzb, dn.zzc);
                    }
                }
                return sl;
            }
        }, this.f20654a);
    }
}
