package com.google.android.gms.internal.ads;

import H1.C0534f1;
import R1.C0746z;
import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.rQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4187rQ implements YG, InterfaceC3941pG, CF, PJ {

    /* renamed from: a, reason: collision with root package name */
    private final FQ f22463a;

    /* renamed from: b, reason: collision with root package name */
    private final QQ f22464b;

    public C4187rQ(FQ fq, QQ qq) {
        this.f22463a = fq;
        this.f22464b = qq;
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j8 = bundle.getLong(str);
            if (j8 >= 0) {
                this.f22463a.zzc(str, String.valueOf(j8));
            }
        }
    }

    private final void b(Bundle bundle, AbstractC2394bl0 abstractC2394bl0) {
        int size = abstractC2394bl0.size();
        for (int i8 = 0; i8 < size; i8++) {
            C4529uQ c4529uQ = (C4529uQ) abstractC2394bl0.get(i8);
            long j8 = bundle.getLong(c4529uQ.zza().zza(), -1L);
            long j9 = bundle.getLong(c4529uQ.zzb().zza(), -1L);
            if (j8 > 0 && j9 > 0) {
                this.f22463a.zzc(c4529uQ.zzc(), String.valueOf(j9 - j8));
            }
        }
        a(bundle.getBundle("client_sig_latency_key"));
        a(bundle.getBundle("gms_sig_latency_key"));
    }

    @Override // com.google.android.gms.internal.ads.CF
    public final void zzdB(C0534f1 c0534f1) {
        this.f22463a.zzb().put("action", "ftl");
        this.f22463a.zzc("ftl", String.valueOf(c0534f1.zza));
        this.f22463a.zzc("ed", c0534f1.zzc);
        this.f22464b.zzf(this.f22463a.zzb());
    }

    @Override // com.google.android.gms.internal.ads.YG
    public final void zzdn(C2519cr c2519cr) {
        this.f22463a.zze(c2519cr.zza);
    }

    @Override // com.google.android.gms.internal.ads.YG
    public final void zzdo(C1457Ia0 c1457Ia0) {
        this.f22463a.zzd(c1457Ia0);
    }

    @Override // com.google.android.gms.internal.ads.PJ
    public final void zze(C0746z c0746z) {
        String str;
        Bundle bundle;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhj)).booleanValue()) {
            if (c0746z == null) {
                this.f22463a.zzb().put("action", "sgs");
                this.f22463a.zzb().put("request_id", "-1");
                this.f22464b.zzf(this.f22463a.zzb());
                return;
            }
            C2519cr c2519cr = c0746z.zzc;
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcd)).booleanValue() && c2519cr != null && (bundle = c2519cr.zzm) != null) {
                bundle.putLong(EnumC4415tQ.PUBLIC_API_CALLBACK.zza(), G1.u.zzB().currentTimeMillis());
                b(bundle, C4529uQ.zza);
            }
            try {
                JSONObject jSONObject = new JSONObject(c0746z.zzb);
                this.f22463a.zzb().put("action", "sgs");
                Map mapZzb = this.f22463a.zzb();
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjG)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e8) {
                        L1.n.zzh("Error retrieving JSONObject from the requestJson, ", e8);
                    }
                } else {
                    str = "na";
                }
                mapZzb.put("tpc", str);
                C2519cr c2519cr2 = c0746z.zzc;
                if (c2519cr2 != null) {
                    this.f22463a.zze(c2519cr2.zza);
                }
                this.f22464b.zzf(this.f22463a.zzb());
            } catch (JSONException unused) {
                this.f22463a.zzb().put("action", "sgf");
                this.f22463a.zzb().put("sgf_reason", "request_invalid");
                this.f22464b.zzf(this.f22463a.zzb());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.PJ
    public final void zzf(String str) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhj)).booleanValue()) {
            this.f22463a.zzb().put("action", "sgf");
            this.f22463a.zzc("sgf_reason", str);
            this.f22464b.zzf(this.f22463a.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3941pG
    public final void zzs() {
        this.f22463a.zzb().put("action", "loaded");
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcd)).booleanValue()) {
            this.f22463a.zza().putLong(EnumC4415tQ.PUBLIC_API_CALLBACK.zza(), G1.u.zzB().currentTimeMillis());
            b(this.f22463a.zza(), C4529uQ.zzb);
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzmB)).booleanValue()) {
            this.f22463a.zzb().put("mafe", true != G0.i.isFeatureSupported(G0.i.MUTE_AUDIO) ? "0" : "1");
        }
        this.f22464b.zzf(this.f22463a.zzb());
    }
}
