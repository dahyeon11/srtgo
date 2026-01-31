package com.google.android.gms.internal.ads;

import H1.C0591z;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class CU {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f12537a;

    /* renamed from: b, reason: collision with root package name */
    private final C4875xU f12538b;

    /* renamed from: c, reason: collision with root package name */
    private final C2263ad0 f12539c;

    CU(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, C4875xU c4875xU, C2263ad0 c2263ad0) {
        this.f12537a = interfaceExecutorServiceC1974Un0;
        this.f12538b = c4875xU;
        this.f12539c = c2263ad0;
    }

    public final com.google.common.util.concurrent.C zza(final C2519cr c2519cr) {
        C1829Rc0 c1829Rc0Zzb = this.f12539c.zzb(EnumC1952Uc0.GMS_SIGNALS, AbstractC1483In0.zzm(AbstractC1483In0.zzh(null), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.zU
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                C2519cr c2519cr2 = c2519cr;
                String strZzc = AbstractC1802Qj0.zzc(c2519cr2.zza.getString("ms"));
                ApplicationInfo applicationInfo = c2519cr2.zzc;
                String str = c2519cr2.zzh;
                return new C1241Cq(applicationInfo, c2519cr2.zzd, c2519cr2.zzf, strZzc, -1, str, c2519cr2.zze, c2519cr2.zzk, c2519cr2.zzl);
            }
        }, this.f12537a));
        final C4875xU c4875xU = this.f12538b;
        Objects.requireNonNull(c4875xU);
        return AbstractC1483In0.zzm(c1829Rc0Zzb.zzf(new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.AU
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return c4875xU.zzb((C1241Cq) obj);
            }
        }).zza(), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.BU
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = c2519cr.zza;
                if (bundle == null) {
                    return jSONObject;
                }
                try {
                    JSONObject jSONObjectZzi = C0591z.zzb().zzi(bundle);
                    try {
                        C0591z.zzb().zzl(jSONObject, jSONObjectZzi);
                        return jSONObject;
                    } catch (JSONException unused) {
                        return jSONObjectZzi;
                    }
                } catch (JSONException unused2) {
                    return jSONObject;
                }
            }
        }, this.f12537a);
    }
}
