package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class JU {

    /* renamed from: a, reason: collision with root package name */
    private final WG f13646a;

    /* renamed from: b, reason: collision with root package name */
    private final C4078qU f13647b;

    /* renamed from: c, reason: collision with root package name */
    private final C2263ad0 f13648c;

    /* renamed from: d, reason: collision with root package name */
    private final C1825Ra0 f13649d;

    /* renamed from: e, reason: collision with root package name */
    private final L1.a f13650e;

    /* renamed from: f, reason: collision with root package name */
    private final RunnableC5002yd0 f13651f;

    /* renamed from: g, reason: collision with root package name */
    private final RunnableC4660vd0 f13652g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f13653h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f13654i;
    public com.google.common.util.concurrent.C zza;

    JU(WG wg, C4078qU c4078qU, C2263ad0 c2263ad0, C1825Ra0 c1825Ra0, L1.a aVar, RunnableC5002yd0 runnableC5002yd0, RunnableC4660vd0 runnableC4660vd0, Context context, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0) {
        this.f13646a = wg;
        this.f13647b = c4078qU;
        this.f13648c = c2263ad0;
        this.f13649d = c1825Ra0;
        this.f13650e = aVar;
        this.f13651f = runnableC5002yd0;
        this.f13652g = runnableC4660vd0;
        this.f13653h = context;
        this.f13654i = interfaceExecutorServiceC1974Un0;
    }

    final /* synthetic */ C1405Gq a(C2519cr c2519cr, C4762wV c4762wV) {
        c4762wV.zzc.put("Content-Type", c4762wV.zze);
        c4762wV.zzc.put("User-Agent", G1.u.zzp().zzc(this.f13653h, c2519cr.zzb.afmaVersion));
        Bundle bundle = new Bundle();
        for (Map.Entry entry : c4762wV.zzc.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new C1405Gq(c4762wV.zza, c4762wV.zzb, bundle, c4762wV.zzd, c4762wV.zzf, c2519cr.zzd, c2519cr.zzh);
    }

    final /* synthetic */ com.google.common.util.concurrent.C c(C2519cr c2519cr, InputStream inputStream) {
        return AbstractC1483In0.zzh(new C1457Ia0(new C1334Fa0(this.f13649d), C1416Ha0.zza(new InputStreamReader(inputStream), c2519cr)));
    }

    public final com.google.common.util.concurrent.C zzc(final C2519cr c2519cr, final JSONObject jSONObject, final C2863fr c2863fr) {
        this.f13646a.zzdn(c2519cr);
        C1829Rc0 c1829Rc0Zzb = this.f13648c.zzb(EnumC1952Uc0.PROXY, AbstractC1483In0.zzm(this.f13648c.zzb(EnumC1952Uc0.PREPARE_HTTP_REQUEST, AbstractC1483In0.zzh(new AV(jSONObject, c2863fr))).zze(new BV(c2519cr.zzg, this.f13652g, AbstractC3293jd0.zza(this.f13653h, EnumC1217Cd0.CUI_NAME_ADREQUEST_BUILDURL))).zza(), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.FU
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                return this.zza.a(c2519cr, (C4762wV) obj);
            }
        }, this.f13654i));
        final C4078qU c4078qU = this.f13647b;
        Objects.requireNonNull(c4078qU);
        C1297Ec0 c1297Ec0Zza = c1829Rc0Zzb.zzf(new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.GU
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return c4078qU.zzc((C1405Gq) obj);
            }
        }).zza();
        this.zza = c1297Ec0Zza;
        com.google.common.util.concurrent.C cZzn = AbstractC1483In0.zzn(this.f13648c.zzb(EnumC1952Uc0.PRE_PROCESS, c1297Ec0Zza).zze(new InterfaceC1215Cc0() { // from class: com.google.android.gms.internal.ads.EU
            @Override // com.google.android.gms.internal.ads.InterfaceC1215Cc0
            public final Object zza(Object obj) {
                return new C3169iV(C4876xV.zza(new InputStreamReader((InputStream) obj)), jSONObject, c2863fr);
            }
        }).zzf(G1.u.zzf().zza(this.f13653h, this.f13650e, this.f13651f).zza("google.afma.response.normalize", C3169iV.zza, AbstractC4110qn.zzb)).zza(), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.HU
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.c(c2519cr, (InputStream) obj);
            }
        }, this.f13654i);
        AbstractC1483In0.zzr(cZzn, new IU(this), this.f13654i);
        return cZzn;
    }
}
