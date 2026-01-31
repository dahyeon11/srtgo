package com.google.android.gms.internal.ads;

import H1.C0591z;
import K1.AbstractC0667v0;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.jV */
/* loaded from: classes2.dex */
public final class BinderC3281jV extends AbstractBinderC1569Kq {

    /* renamed from: a */
    private final Context f20259a;

    /* renamed from: b */
    private final InterfaceExecutorServiceC1974Un0 f20260b;

    /* renamed from: c */
    private final CV f20261c;

    /* renamed from: d */
    private final InterfaceC1946Tz f20262d;

    /* renamed from: e */
    private final ArrayDeque f20263e;

    /* renamed from: f */
    private final RunnableC5002yd0 f20264f;

    /* renamed from: g */
    private final C3662mr f20265g;

    /* renamed from: h */
    private final C5104zV f20266h;

    public BinderC3281jV(Context context, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, C3662mr c3662mr, InterfaceC1946Tz interfaceC1946Tz, CV cv, ArrayDeque arrayDeque, C5104zV c5104zV, RunnableC5002yd0 runnableC5002yd0) {
        AbstractC4439th.zza(context);
        this.f20259a = context;
        this.f20260b = interfaceExecutorServiceC1974Un0;
        this.f20265g = c3662mr;
        this.f20261c = cv;
        this.f20262d = interfaceC1946Tz;
        this.f20263e = arrayDeque;
        this.f20266h = c5104zV;
        this.f20264f = runnableC5002yd0;
    }

    private final synchronized C2939gV c(String str) {
        Iterator it = this.f20263e.iterator();
        while (it.hasNext()) {
            C2939gV c2939gV = (C2939gV) it.next();
            if (c2939gV.zzc.equals(str)) {
                it.remove();
                return c2939gV;
            }
        }
        return null;
    }

    private static com.google.common.util.concurrent.C d(com.google.common.util.concurrent.C c9, C2263ad0 c2263ad0, C4451tn c4451tn, RunnableC4660vd0 runnableC4660vd0, InterfaceC3407kd0 interfaceC3407kd0) {
        InterfaceC3199in interfaceC3199inZza = c4451tn.zza("AFMA_getAdDictionary", AbstractC4110qn.zza, new InterfaceC3426kn() { // from class: com.google.android.gms.internal.ads.bV
            @Override // com.google.android.gms.internal.ads.InterfaceC3426kn
            public final Object zza(JSONObject jSONObject) {
                return new C2863fr(jSONObject);
            }
        });
        AbstractC4546ud0.zze(c9, interfaceC3407kd0);
        C1297Ec0 c1297Ec0Zza = c2263ad0.zzb(EnumC1952Uc0.BUILD_URL, c9).zzf(interfaceC3199inZza).zza();
        AbstractC4546ud0.zzd(c1297Ec0Zza, runnableC4660vd0, interfaceC3407kd0);
        return c1297Ec0Zza;
    }

    private static com.google.common.util.concurrent.C e(final C2519cr c2519cr, C2263ad0 c2263ad0, final AbstractC3694n60 abstractC3694n60) {
        InterfaceC3997pn0 interfaceC3997pn0 = new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.VU
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return abstractC3694n60.zzb().zza(C0591z.zzb().zzi((Bundle) obj), c2519cr.zzm);
            }
        };
        return c2263ad0.zzb(EnumC1952Uc0.GMS_SIGNALS, AbstractC1483In0.zzh(c2519cr.zza)).zzf(interfaceC3997pn0).zze(new InterfaceC1215Cc0() { // from class: com.google.android.gms.internal.ads.WU
            @Override // com.google.android.gms.internal.ads.InterfaceC1215Cc0
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                AbstractC0667v0.zza("Ad request signals:");
                AbstractC0667v0.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void f(C2939gV c2939gV) {
        zzo();
        this.f20263e.addLast(c2939gV);
    }

    private final void g(com.google.common.util.concurrent.C c9, InterfaceC2019Vq interfaceC2019Vq, C2519cr c2519cr) {
        AbstractC1483In0.zzr(AbstractC1483In0.zzn(c9, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.cV
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return AbstractC1483In0.zzh(AbstractC4428tb0.zza((InputStream) obj));
            }
        }, AbstractC4805wt.zza), new C2824fV(this, interfaceC2019Vq, c2519cr), AbstractC4805wt.zzf);
    }

    private final synchronized void zzo() {
        int iIntValue = ((Long) AbstractC4897xi.zzc.zze()).intValue();
        while (this.f20263e.size() >= iIntValue) {
            this.f20263e.removeFirst();
        }
    }

    final /* synthetic */ InputStream b(com.google.common.util.concurrent.C c9, com.google.common.util.concurrent.C c10, C2519cr c2519cr, InterfaceC3407kd0 interfaceC3407kd0) {
        String strZze = ((C2863fr) c9.get()).zze();
        f(new C2939gV((C2863fr) c9.get(), (JSONObject) c10.get(), c2519cr.zzh, strZze, interfaceC3407kd0));
        return new ByteArrayInputStream(strZze.getBytes(AbstractC3647mj0.zzc));
    }

    public final com.google.common.util.concurrent.C zzb(final C2519cr c2519cr, int i8) {
        if (!((Boolean) AbstractC4897xi.zza.zze()).booleanValue()) {
            return AbstractC1483In0.zzg(new Exception("Split request is disabled."));
        }
        C1704Ob0 c1704Ob0 = c2519cr.zzi;
        if (c1704Ob0 == null) {
            return AbstractC1483In0.zzg(new Exception("Pool configuration missing from request."));
        }
        if (c1704Ob0.zzc == 0 || c1704Ob0.zzd == 0) {
            return AbstractC1483In0.zzg(new Exception("Caching is disabled."));
        }
        C4451tn c4451tnZzb = G1.u.zzf().zzb(this.f20259a, L1.a.forPackage(), this.f20264f);
        AbstractC3694n60 abstractC3694n60Zzr = this.f20262d.zzr(c2519cr, i8);
        C2263ad0 c2263ad0Zzc = abstractC3694n60Zzr.zzc();
        final com.google.common.util.concurrent.C cE = e(c2519cr, c2263ad0Zzc, abstractC3694n60Zzr);
        RunnableC4660vd0 runnableC4660vd0Zzd = abstractC3694n60Zzr.zzd();
        final InterfaceC3407kd0 interfaceC3407kd0Zza = AbstractC3293jd0.zza(this.f20259a, EnumC1217Cd0.CUI_NAME_ADREQUEST_BUILDURL);
        final com.google.common.util.concurrent.C cD = d(cE, c2263ad0Zzc, c4451tnZzb, runnableC4660vd0Zzd, interfaceC3407kd0Zza);
        return c2263ad0Zzc.zza(EnumC1952Uc0.GET_URL_AND_CACHE_KEY, cE, cD).zza(new Callable() { // from class: com.google.android.gms.internal.ads.ZU
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.b(cD, cE, c2519cr, interfaceC3407kd0Zza);
            }
        }).zza();
    }

    public final com.google.common.util.concurrent.C zzc(final C2519cr c2519cr, int i8) {
        C2939gV c2939gVC;
        C1297Ec0 c1297Ec0Zza;
        C4451tn c4451tnZzb = G1.u.zzf().zzb(this.f20259a, L1.a.forPackage(), this.f20264f);
        AbstractC3694n60 abstractC3694n60Zzr = this.f20262d.zzr(c2519cr, i8);
        InterfaceC3199in interfaceC3199inZza = c4451tnZzb.zza("google.afma.response.normalize", C3169iV.zza, AbstractC4110qn.zzb);
        if (((Boolean) AbstractC4897xi.zza.zze()).booleanValue()) {
            c2939gVC = c(c2519cr.zzh);
            if (c2939gVC == null) {
                AbstractC0667v0.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = c2519cr.zzj;
            c2939gVC = null;
            if (str != null && !str.isEmpty()) {
                AbstractC0667v0.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        InterfaceC3407kd0 interfaceC3407kd0Zza = c2939gVC == null ? AbstractC3293jd0.zza(this.f20259a, EnumC1217Cd0.CUI_NAME_ADREQUEST_BUILDURL) : c2939gVC.zze;
        RunnableC4660vd0 runnableC4660vd0Zzd = abstractC3694n60Zzr.zzd();
        runnableC4660vd0Zzd.zze(c2519cr.zza.getStringArrayList("ad_types"));
        BV bv = new BV(c2519cr.zzg, runnableC4660vd0Zzd, interfaceC3407kd0Zza);
        C4990yV c4990yV = new C4990yV(this.f20259a, c2519cr.zzb.afmaVersion, this.f20265g, i8);
        C2263ad0 c2263ad0Zzc = abstractC3694n60Zzr.zzc();
        InterfaceC3407kd0 interfaceC3407kd0Zza2 = AbstractC3293jd0.zza(this.f20259a, EnumC1217Cd0.CUI_NAME_ADREQUEST_PARSERESPONSE);
        if (c2939gVC == null) {
            final com.google.common.util.concurrent.C cE = e(c2519cr, c2263ad0Zzc, abstractC3694n60Zzr);
            final com.google.common.util.concurrent.C cD = d(cE, c2263ad0Zzc, c4451tnZzb, runnableC4660vd0Zzd, interfaceC3407kd0Zza);
            InterfaceC3407kd0 interfaceC3407kd0Zza3 = AbstractC3293jd0.zza(this.f20259a, EnumC1217Cd0.CUI_NAME_ADREQUEST_REQUEST);
            final C1297Ec0 c1297Ec0Zza2 = c2263ad0Zzc.zza(EnumC1952Uc0.HTTP, cD, cE).zza(new Callable() { // from class: com.google.android.gms.internal.ads.XU
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C2519cr c2519cr2;
                    Bundle bundle;
                    C2863fr c2863fr = (C2863fr) cD.get();
                    if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcd)).booleanValue() && (bundle = (c2519cr2 = c2519cr).zzm) != null) {
                        bundle.putLong(EnumC4415tQ.GET_AD_DICTIONARY_SDKCORE_START.zza(), c2863fr.zzc());
                        c2519cr2.zzm.putLong(EnumC4415tQ.GET_AD_DICTIONARY_SDKCORE_END.zza(), c2863fr.zzb());
                    }
                    return new AV((JSONObject) cE.get(), c2863fr);
                }
            }).zze(bv).zze(new C4091qd0(interfaceC3407kd0Zza3)).zze(c4990yV).zza();
            AbstractC4546ud0.zzb(c1297Ec0Zza2, runnableC4660vd0Zzd, interfaceC3407kd0Zza3);
            AbstractC4546ud0.zze(c1297Ec0Zza2, interfaceC3407kd0Zza2);
            c1297Ec0Zza = c2263ad0Zzc.zza(EnumC1952Uc0.PRE_PROCESS, cE, cD, c1297Ec0Zza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.YU
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcd)).booleanValue() && (bundle = c2519cr.zzm) != null) {
                        bundle.putLong(EnumC4415tQ.HTTP_RESPONSE_READY.zza(), G1.u.zzB().currentTimeMillis());
                    }
                    return new C3169iV((C4876xV) c1297Ec0Zza2.get(), (JSONObject) cE.get(), (C2863fr) cD.get());
                }
            }).zzf(interfaceC3199inZza).zza();
        } else {
            AV av = new AV(c2939gVC.zzb, c2939gVC.zza);
            InterfaceC3407kd0 interfaceC3407kd0Zza4 = AbstractC3293jd0.zza(this.f20259a, EnumC1217Cd0.CUI_NAME_ADREQUEST_REQUEST);
            final C1297Ec0 c1297Ec0Zza3 = c2263ad0Zzc.zzb(EnumC1952Uc0.HTTP, AbstractC1483In0.zzh(av)).zze(bv).zze(new C4091qd0(interfaceC3407kd0Zza4)).zze(c4990yV).zza();
            AbstractC4546ud0.zzb(c1297Ec0Zza3, runnableC4660vd0Zzd, interfaceC3407kd0Zza4);
            final com.google.common.util.concurrent.C cZzh = AbstractC1483In0.zzh(c2939gVC);
            AbstractC4546ud0.zze(c1297Ec0Zza3, interfaceC3407kd0Zza2);
            c1297Ec0Zza = c2263ad0Zzc.zza(EnumC1952Uc0.PRE_PROCESS, c1297Ec0Zza3, cZzh).zza(new Callable() { // from class: com.google.android.gms.internal.ads.UU
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C4876xV c4876xV = (C4876xV) c1297Ec0Zza3.get();
                    com.google.common.util.concurrent.C c9 = cZzh;
                    return new C3169iV(c4876xV, ((C2939gV) c9.get()).zzb, ((C2939gV) c9.get()).zza);
                }
            }).zzf(interfaceC3199inZza).zza();
        }
        AbstractC4546ud0.zzb(c1297Ec0Zza, runnableC4660vd0Zzd, interfaceC3407kd0Zza2);
        return c1297Ec0Zza;
    }

    public final com.google.common.util.concurrent.C zzd(final C2519cr c2519cr, int i8) {
        C4451tn c4451tnZzb = G1.u.zzf().zzb(this.f20259a, L1.a.forPackage(), this.f20264f);
        if (!((Boolean) AbstractC1226Ci.zza.zze()).booleanValue()) {
            return AbstractC1483In0.zzg(new Exception("Signal collection disabled."));
        }
        AbstractC3694n60 abstractC3694n60Zzr = this.f20262d.zzr(c2519cr, i8);
        final Q50 q50Zza = abstractC3694n60Zzr.zza();
        InterfaceC3199in interfaceC3199inZza = c4451tnZzb.zza("google.afma.request.getSignals", AbstractC4110qn.zza, AbstractC4110qn.zzb);
        InterfaceC3407kd0 interfaceC3407kd0Zza = AbstractC3293jd0.zza(this.f20259a, EnumC1217Cd0.CUI_NAME_SCAR_SIGNALS);
        C1297Ec0 c1297Ec0Zza = abstractC3694n60Zzr.zzc().zzb(EnumC1952Uc0.GET_SIGNALS, AbstractC1483In0.zzh(c2519cr.zza)).zze(new C4091qd0(interfaceC3407kd0Zza)).zzf(new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.dV
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) throws JSONException {
                return q50Zza.zza(C0591z.zzb().zzi((Bundle) obj), c2519cr.zzm);
            }
        }).zzb(EnumC1952Uc0.JS_SIGNALS).zzf(interfaceC3199inZza).zza();
        RunnableC4660vd0 runnableC4660vd0Zzd = abstractC3694n60Zzr.zzd();
        runnableC4660vd0Zzd.zze(c2519cr.zza.getStringArrayList("ad_types"));
        runnableC4660vd0Zzd.zzg(c2519cr.zza.getBundle("extras"));
        AbstractC4546ud0.zzc(c1297Ec0Zza, runnableC4660vd0Zzd, interfaceC3407kd0Zza);
        if (((Boolean) AbstractC4100qi.zzg.zze()).booleanValue()) {
            CV cv = this.f20261c;
            Objects.requireNonNull(cv);
            c1297Ec0Zza.addListener(new RunnableC2251aV(cv), this.f20260b);
        }
        return c1297Ec0Zza;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1569Kq, com.google.android.gms.internal.ads.InterfaceC1610Lq
    public final void zze(C2519cr c2519cr, InterfaceC2019Vq interfaceC2019Vq) {
        g(zzb(c2519cr, Binder.getCallingUid()), interfaceC2019Vq, c2519cr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1569Kq, com.google.android.gms.internal.ads.InterfaceC1610Lq
    public final void zzf(C2519cr c2519cr, InterfaceC2019Vq interfaceC2019Vq) {
        Bundle bundle;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcd)).booleanValue() && (bundle = c2519cr.zzm) != null) {
            bundle.putLong(EnumC4415tQ.SERVICE_CONNECTED.zza(), G1.u.zzB().currentTimeMillis());
        }
        g(zzd(c2519cr, Binder.getCallingUid()), interfaceC2019Vq, c2519cr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1569Kq, com.google.android.gms.internal.ads.InterfaceC1610Lq
    public final void zzg(C2519cr c2519cr, InterfaceC2019Vq interfaceC2019Vq) {
        Bundle bundle;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcd)).booleanValue() && (bundle = c2519cr.zzm) != null) {
            bundle.putLong(EnumC4415tQ.SERVICE_CONNECTED.zza(), G1.u.zzB().currentTimeMillis());
        }
        com.google.common.util.concurrent.C cZzc = zzc(c2519cr, Binder.getCallingUid());
        g(cZzc, interfaceC2019Vq, c2519cr);
        if (((Boolean) AbstractC4100qi.zze.zze()).booleanValue()) {
            CV cv = this.f20261c;
            Objects.requireNonNull(cv);
            cZzc.addListener(new RunnableC2251aV(cv), this.f20260b);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1569Kq, com.google.android.gms.internal.ads.InterfaceC1610Lq
    public final void zzh(String str, InterfaceC2019Vq interfaceC2019Vq) {
        g(zzi(str), interfaceC2019Vq, null);
    }

    public final com.google.common.util.concurrent.C zzi(String str) {
        if (((Boolean) AbstractC4897xi.zza.zze()).booleanValue()) {
            return c(str) == null ? AbstractC1483In0.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : AbstractC1483In0.zzh(new C2709eV(this));
        }
        return AbstractC1483In0.zzg(new Exception("Split request is disabled."));
    }
}
