package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class RN {

    /* renamed from: a */
    private final C1825Ra0 f16086a;

    /* renamed from: b */
    private final Executor f16087b;

    /* renamed from: c */
    private final C3275jP f16088c;

    /* renamed from: d */
    private final CO f16089d;

    /* renamed from: e */
    private final Context f16090e;

    /* renamed from: f */
    private final LQ f16091f;

    /* renamed from: g */
    private final C3865oe0 f16092g;

    /* renamed from: h */
    private final C4535uW f16093h;

    public RN(C1825Ra0 c1825Ra0, Executor executor, C3275jP c3275jP, Context context, LQ lq, C3865oe0 c3865oe0, C4535uW c4535uW, CO co) {
        this.f16086a = c1825Ra0;
        this.f16087b = executor;
        this.f16088c = c3275jP;
        this.f16090e = context;
        this.f16091f = lq;
        this.f16092g = c3865oe0;
        this.f16093h = c4535uW;
        this.f16089d = co;
    }

    private final void f(InterfaceC2065Wv interfaceC2065Wv) {
        h(interfaceC2065Wv);
        interfaceC2065Wv.zzag("/video", AbstractC2172Zk.zzl);
        interfaceC2065Wv.zzag("/videoMeta", AbstractC2172Zk.zzm);
        interfaceC2065Wv.zzag("/precache", new C3101hv());
        interfaceC2065Wv.zzag("/delayPageLoaded", AbstractC2172Zk.zzp);
        interfaceC2065Wv.zzag("/instrument", AbstractC2172Zk.zzn);
        interfaceC2065Wv.zzag("/log", AbstractC2172Zk.zzg);
        interfaceC2065Wv.zzag("/click", new C4901xk(null, null));
        if (this.f16086a.zzb != null) {
            interfaceC2065Wv.zzN().zzE(true);
            interfaceC2065Wv.zzag("/open", new C3764nl(null, null, null, null, null));
        } else {
            interfaceC2065Wv.zzN().zzE(false);
        }
        if (G1.u.zzn().zzp(interfaceC2065Wv.getContext())) {
            Map map = new HashMap();
            if (interfaceC2065Wv.zzD() != null) {
                map = interfaceC2065Wv.zzD().zzax;
            }
            interfaceC2065Wv.zzag("/logScionEvent", new C2966gl(interfaceC2065Wv.getContext(), map));
        }
    }

    private final void g(InterfaceC2065Wv interfaceC2065Wv, C1162At c1162At) {
        if (this.f16086a.zza != null && interfaceC2065Wv.zzq() != null) {
            interfaceC2065Wv.zzq().zzs(this.f16086a.zza);
        }
        c1162At.zzb();
    }

    private static final void h(InterfaceC2065Wv interfaceC2065Wv) {
        interfaceC2065Wv.zzag("/videoClicked", AbstractC2172Zk.zzh);
        interfaceC2065Wv.zzN().zzG(true);
        interfaceC2065Wv.zzag("/getNativeAdViewSignals", AbstractC2172Zk.zzs);
        interfaceC2065Wv.zzag("/getNativeClickMeta", AbstractC2172Zk.zzt);
    }

    final /* synthetic */ com.google.common.util.concurrent.C a(JSONObject jSONObject, final InterfaceC2065Wv interfaceC2065Wv) {
        final C1162At c1162AtZza = C1162At.zza(interfaceC2065Wv);
        if (this.f16086a.zzb != null) {
            interfaceC2065Wv.zzaj(C1943Tw.zzd());
        } else {
            interfaceC2065Wv.zzaj(C1943Tw.zze());
        }
        interfaceC2065Wv.zzN().zzB(new InterfaceC1779Pw() { // from class: com.google.android.gms.internal.ads.JN
            @Override // com.google.android.gms.internal.ads.InterfaceC1779Pw
            public final void zza(boolean z8, int i8, String str, String str2) {
                this.zza.d(interfaceC2065Wv, c1162AtZza, z8, i8, str, str2);
            }
        });
        interfaceC2065Wv.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return c1162AtZza;
    }

    final /* synthetic */ com.google.common.util.concurrent.C b(H1.d2 d2Var, C4654va0 c4654va0, C4996ya0 c4996ya0, String str, String str2, Object obj) {
        final InterfaceC2065Wv interfaceC2065WvZza = this.f16088c.zza(d2Var, c4654va0, c4996ya0);
        final C1162At c1162AtZza = C1162At.zza(interfaceC2065WvZza);
        if (this.f16086a.zzb != null) {
            f(interfaceC2065WvZza);
            interfaceC2065WvZza.zzaj(C1943Tw.zzd());
        } else {
            C5096zO c5096zOZzb = this.f16089d.zzb();
            interfaceC2065WvZza.zzN().zzR(c5096zOZzb, c5096zOZzb, c5096zOZzb, c5096zOZzb, c5096zOZzb, false, null, new G1.b(this.f16090e, null, null), null, null, this.f16093h, this.f16092g, this.f16091f, null, c5096zOZzb, null, null, null, null);
            h(interfaceC2065WvZza);
        }
        interfaceC2065WvZza.zzN().zzB(new InterfaceC1779Pw() { // from class: com.google.android.gms.internal.ads.KN
            @Override // com.google.android.gms.internal.ads.InterfaceC1779Pw
            public final void zza(boolean z8, int i8, String str3, String str4) {
                this.zza.e(interfaceC2065WvZza, c1162AtZza, z8, i8, str3, str4);
            }
        });
        interfaceC2065WvZza.zzae(str, str2, null);
        return c1162AtZza;
    }

    final /* synthetic */ com.google.common.util.concurrent.C c(Object obj) {
        InterfaceC2065Wv interfaceC2065WvZza = this.f16088c.zza(H1.d2.zzc(), null, null);
        final C1162At c1162AtZza = C1162At.zza(interfaceC2065WvZza);
        f(interfaceC2065WvZza);
        interfaceC2065WvZza.zzN().zzH(new InterfaceC1820Qw() { // from class: com.google.android.gms.internal.ads.LN
            @Override // com.google.android.gms.internal.ads.InterfaceC1820Qw
            public final void zza() {
                c1162AtZza.zzb();
            }
        });
        interfaceC2065WvZza.loadUrl((String) H1.C.zzc().zza(AbstractC4439th.zzdM));
        return c1162AtZza;
    }

    final /* synthetic */ void d(InterfaceC2065Wv interfaceC2065Wv, C1162At c1162At, boolean z8, int i8, String str, String str2) {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzdU)).booleanValue()) {
            g(interfaceC2065Wv, c1162At);
            return;
        }
        if (z8) {
            g(interfaceC2065Wv, c1162At);
            return;
        }
        c1162At.zzd(new C3399kZ(1, "Native Video WebView failed to load. Error code: " + i8 + ", Description: " + str + ", Failing URL: " + str2));
    }

    final /* synthetic */ void e(InterfaceC2065Wv interfaceC2065Wv, C1162At c1162At, boolean z8, int i8, String str, String str2) {
        if (z8) {
            if (this.f16086a.zza != null && interfaceC2065Wv.zzq() != null) {
                interfaceC2065Wv.zzq().zzs(this.f16086a.zza);
            }
            c1162At.zzb();
            return;
        }
        c1162At.zzd(new C3399kZ(1, "Html video Web View failed to load. Error code: " + i8 + ", Description: " + str + ", Failing URL: " + str2));
    }

    public final com.google.common.util.concurrent.C zza(final JSONObject jSONObject) {
        return AbstractC1483In0.zzn(AbstractC1483In0.zzn(AbstractC1483In0.zzh(null), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.IN
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.c(obj);
            }
        }, this.f16087b), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.HN
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.a(jSONObject, (InterfaceC2065Wv) obj);
            }
        }, this.f16087b);
    }

    public final com.google.common.util.concurrent.C zzb(final String str, final String str2, final C4654va0 c4654va0, final C4996ya0 c4996ya0, final H1.d2 d2Var) {
        return AbstractC1483In0.zzn(AbstractC1483In0.zzh(null), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.GN
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.b(d2Var, c4654va0, c4996ya0, str, str2, obj);
            }
        }, this.f16087b);
    }
}
