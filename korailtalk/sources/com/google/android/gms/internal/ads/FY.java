package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class FY implements InterfaceC4993yY {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2351bL f13037a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f13038b;

    /* renamed from: c, reason: collision with root package name */
    private final C3499lN f13039c;

    /* renamed from: d, reason: collision with root package name */
    private final C4200rb0 f13040d;

    /* renamed from: e, reason: collision with root package name */
    private final CO f13041e;

    public FY(AbstractC2351bL abstractC2351bL, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, C3499lN c3499lN, C4200rb0 c4200rb0, CO co) {
        this.f13037a = abstractC2351bL;
        this.f13038b = interfaceExecutorServiceC1974Un0;
        this.f13039c = c3499lN;
        this.f13040d = c4200rb0;
        this.f13041e = co;
    }

    private final com.google.common.util.concurrent.C e(final C1457Ia0 c1457Ia0, final C4654va0 c4654va0, final JSONObject jSONObject) {
        C3499lN c3499lN = this.f13039c;
        final com.google.common.util.concurrent.C cZza = this.f13040d.zza();
        final com.google.common.util.concurrent.C cZza2 = c3499lN.zza(c1457Ia0, c4654va0, jSONObject);
        return AbstractC1483In0.zzc(cZza, cZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.AY
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a(cZza2, cZza, c1457Ia0, c4654va0, jSONObject);
            }
        }, this.f13038b);
    }

    final /* synthetic */ NL a(com.google.common.util.concurrent.C c9, com.google.common.util.concurrent.C c10, C1457Ia0 c1457Ia0, C4654va0 c4654va0, JSONObject jSONObject) {
        SL sl = (SL) c9.get();
        C4754wO c4754wO = (C4754wO) c10.get();
        TL tlZzd = this.f13037a.zzd(new C3935pD(c1457Ia0, c4654va0, null), new C2811fM(sl), new C4065qL(jSONObject, c4754wO));
        tlZzd.zzh().zzb();
        tlZzd.zzi().zza(c4754wO);
        tlZzd.zzg().zza(sl.zzs());
        tlZzd.zzl().zza(this.f13041e, sl.zzq());
        return tlZzd.zza();
    }

    final /* synthetic */ com.google.common.util.concurrent.C b(C4754wO c4754wO, JSONObject jSONObject) throws C3085hn {
        this.f13040d.zzb(AbstractC1483In0.zzh(c4754wO));
        if (jSONObject.optBoolean("success")) {
            return AbstractC1483In0.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new C3085hn("process json failed");
    }

    final /* synthetic */ com.google.common.util.concurrent.C c(C4654va0 c4654va0, final C4754wO c4754wO) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziH)).booleanValue() && o2.n.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", c4654va0.zzt.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return AbstractC1483In0.zzn(c4754wO.zzg("google.afma.nativeAds.preProcessJson", jSONObject2), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.BY
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.b(c4754wO, (JSONObject) obj);
            }
        }, this.f13038b);
    }

    final /* synthetic */ com.google.common.util.concurrent.C d(C1457Ia0 c1457Ia0, C4654va0 c4654va0, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return AbstractC1483In0.zzg(new RS(3));
        }
        if (c1457Ia0.zza.zza.zzk <= 1) {
            return AbstractC1483In0.zzm(e(c1457Ia0, c4654va0, jSONArray.getJSONObject(0)), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.EY
                @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
                public final Object apply(Object obj) {
                    return Collections.singletonList(AbstractC1483In0.zzh((NL) obj));
                }
            }, this.f13038b);
        }
        int length = jSONArray.length();
        this.f13040d.zzc(Math.min(length, c1457Ia0.zza.zza.zzk));
        ArrayList arrayList = new ArrayList(c1457Ia0.zza.zza.zzk);
        for (int i8 = 0; i8 < c1457Ia0.zza.zza.zzk; i8++) {
            if (i8 < length) {
                arrayList.add(e(c1457Ia0, c4654va0, jSONArray.getJSONObject(i8)));
            } else {
                arrayList.add(AbstractC1483In0.zzg(new RS(3)));
            }
        }
        return AbstractC1483In0.zzh(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4993yY, com.google.android.gms.internal.ads.InterfaceC3171iX
    public final com.google.common.util.concurrent.C zza(final C1457Ia0 c1457Ia0, final C4654va0 c4654va0) {
        return AbstractC1483In0.zzn(AbstractC1483In0.zzn(this.f13040d.zza(), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.CY
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.c(c4654va0, (C4754wO) obj);
            }
        }, this.f13038b), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.DY
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.d(c1457Ia0, c4654va0, (JSONArray) obj);
            }
        }, this.f13038b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4993yY, com.google.android.gms.internal.ads.InterfaceC3171iX
    public final boolean zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0) {
        C1129Aa0 c1129Aa0 = c4654va0.zzt;
        return (c1129Aa0 == null || c1129Aa0.zzc == null) ? false : true;
    }
}
