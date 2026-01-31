package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.wO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4754wO {

    /* renamed from: b, reason: collision with root package name */
    private final G1.a f23498b;

    /* renamed from: c, reason: collision with root package name */
    private final C3558lw f23499c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f23500d;

    /* renamed from: e, reason: collision with root package name */
    private final LQ f23501e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f23502f;

    /* renamed from: g, reason: collision with root package name */
    private final C2487cb f23503g;

    /* renamed from: h, reason: collision with root package name */
    private final L1.a f23504h;

    /* renamed from: j, reason: collision with root package name */
    private final C4535uW f23506j;

    /* renamed from: k, reason: collision with root package name */
    private final C3865oe0 f23507k;

    /* renamed from: l, reason: collision with root package name */
    private final GW f23508l;

    /* renamed from: m, reason: collision with root package name */
    private final C1989Va0 f23509m;

    /* renamed from: n, reason: collision with root package name */
    private com.google.common.util.concurrent.C f23510n;

    /* renamed from: a, reason: collision with root package name */
    private final C3273jO f23497a = new C3273jO();

    /* renamed from: i, reason: collision with root package name */
    private final C4219rl f23505i = new C4219rl();

    C4754wO(CallableC4412tO callableC4412tO) {
        this.f23500d = callableC4412tO.f22832c;
        this.f23502f = callableC4412tO.f22835f;
        this.f23503g = callableC4412tO.f22836g;
        this.f23504h = callableC4412tO.f22837h;
        this.f23498b = callableC4412tO.f22830a;
        this.f23499c = callableC4412tO.f22831b;
        this.f23506j = callableC4412tO.f22834e;
        this.f23507k = callableC4412tO.f22838i;
        this.f23501e = callableC4412tO.f22833d;
        this.f23508l = callableC4412tO.f22839j;
        this.f23509m = callableC4412tO.f22840k;
    }

    final /* synthetic */ InterfaceC2065Wv a(InterfaceC2065Wv interfaceC2065Wv) {
        interfaceC2065Wv.zzag("/result", this.f23505i);
        InterfaceC1861Rw interfaceC1861RwZzN = interfaceC2065Wv.zzN();
        G1.b bVar = new G1.b(this.f23500d, null, null);
        C4535uW c4535uW = this.f23506j;
        C3865oe0 c3865oe0 = this.f23507k;
        LQ lq = this.f23501e;
        C3273jO c3273jO = this.f23497a;
        interfaceC1861RwZzN.zzR(null, c3273jO, c3273jO, c3273jO, c3273jO, false, null, bVar, null, null, c4535uW, c3865oe0, lq, null, null, null, null, null, null);
        return interfaceC2065Wv;
    }

    final /* synthetic */ com.google.common.util.concurrent.C f(String str, JSONObject jSONObject, InterfaceC2065Wv interfaceC2065Wv) {
        return this.f23505i.zzb(interfaceC2065Wv, str, jSONObject);
    }

    public final synchronized com.google.common.util.concurrent.C zzg(final String str, final JSONObject jSONObject) {
        com.google.common.util.concurrent.C c9 = this.f23510n;
        if (c9 == null) {
            return AbstractC1483In0.zzh(null);
        }
        return AbstractC1483In0.zzn(c9, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.kO
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.f(str, jSONObject, (InterfaceC2065Wv) obj);
            }
        }, this.f23502f);
    }

    public final synchronized void zzh(C4654va0 c4654va0, C4996ya0 c4996ya0, IA ia) {
        com.google.common.util.concurrent.C c9 = this.f23510n;
        if (c9 == null) {
            return;
        }
        AbstractC1483In0.zzr(c9, new C4071qO(this, c4654va0, c4996ya0, ia), this.f23502f);
    }

    public final synchronized void zzi() {
        com.google.common.util.concurrent.C c9 = this.f23510n;
        if (c9 == null) {
            return;
        }
        AbstractC1483In0.zzr(c9, new C3615mO(this), this.f23502f);
        this.f23510n = null;
    }

    public final synchronized void zzj(String str, Map map) {
        com.google.common.util.concurrent.C c9 = this.f23510n;
        if (c9 == null) {
            return;
        }
        AbstractC1483In0.zzr(c9, new C3957pO(this, "sendMessageToNativeJs", map), this.f23502f);
    }

    public final synchronized void zzk() {
        final String str = (String) H1.C.zzc().zza(AbstractC4439th.zzdL);
        final Context context = this.f23500d;
        final C2487cb c2487cb = this.f23503g;
        final L1.a aVar = this.f23504h;
        final G1.a aVar2 = this.f23498b;
        final GW gw = this.f23508l;
        final C1989Va0 c1989Va0 = this.f23509m;
        com.google.common.util.concurrent.C cZzm = AbstractC1483In0.zzm(AbstractC1483In0.zzk(new InterfaceC3769nn0() { // from class: com.google.android.gms.internal.ads.jw
            @Override // com.google.android.gms.internal.ads.InterfaceC3769nn0
            public final com.google.common.util.concurrent.C zza() throws C3444kw {
                G1.u.zzz();
                Context context2 = context;
                C1943Tw c1943TwZza = C1943Tw.zza();
                C2487cb c2487cb2 = c2487cb;
                GW gw2 = gw;
                G1.a aVar3 = aVar2;
                InterfaceC2065Wv interfaceC2065WvZza = C3558lw.zza(context2, c1943TwZza, "", false, false, c2487cb2, null, aVar, null, null, aVar3, C4775we.zza(), null, null, gw2, c1989Va0);
                final C1162At c1162AtZza = C1162At.zza(interfaceC2065WvZza);
                interfaceC2065WvZza.zzN().zzB(new InterfaceC1779Pw() { // from class: com.google.android.gms.internal.ads.iw
                    @Override // com.google.android.gms.internal.ads.InterfaceC1779Pw
                    public final void zza(boolean z8, int i8, String str2, String str3) {
                        c1162AtZza.zzb();
                    }
                });
                interfaceC2065WvZza.loadUrl(str);
                return c1162AtZza;
            }
        }, AbstractC4805wt.zze), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.lO
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                InterfaceC2065Wv interfaceC2065Wv = (InterfaceC2065Wv) obj;
                this.zza.a(interfaceC2065Wv);
                return interfaceC2065Wv;
            }
        }, this.f23502f);
        this.f23510n = cZzm;
        AbstractC5147zt.zza(cZzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzl(String str, InterfaceC2278al interfaceC2278al) {
        com.google.common.util.concurrent.C c9 = this.f23510n;
        if (c9 == null) {
            return;
        }
        AbstractC1483In0.zzr(c9, new C3729nO(this, str, interfaceC2278al), this.f23502f);
    }

    public final void zzm(WeakReference weakReference, String str, InterfaceC2278al interfaceC2278al) {
        zzl(str, new C4640vO(this, weakReference, str, interfaceC2278al, null));
    }

    public final synchronized void zzn(String str, InterfaceC2278al interfaceC2278al) {
        com.google.common.util.concurrent.C c9 = this.f23510n;
        if (c9 == null) {
            return;
        }
        AbstractC1483In0.zzr(c9, new C3843oO(this, str, interfaceC2278al), this.f23502f);
    }
}
