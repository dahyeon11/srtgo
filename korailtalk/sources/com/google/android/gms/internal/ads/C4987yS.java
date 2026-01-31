package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.yS */
/* loaded from: classes2.dex */
public final class C4987yS implements J1.w, InterfaceC1779Pw {

    /* renamed from: a */
    private final Context f23940a;

    /* renamed from: b */
    private final L1.a f23941b;

    /* renamed from: c */
    private C3734nS f23942c;

    /* renamed from: d */
    private InterfaceC2065Wv f23943d;

    /* renamed from: e */
    private boolean f23944e;

    /* renamed from: f */
    private boolean f23945f;

    /* renamed from: g */
    private long f23946g;

    /* renamed from: h */
    private H1.F0 f23947h;

    /* renamed from: i */
    private boolean f23948i;

    C4987yS(Context context, L1.a aVar) {
        this.f23940a = context;
        this.f23941b = aVar;
    }

    private final synchronized boolean b(H1.F0 f02) {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zziU)).booleanValue()) {
            L1.n.zzj("Ad inspector had an internal error.");
            try {
                f02.zze(AbstractC4542ub0.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f23942c == null) {
            L1.n.zzj("Ad inspector had an internal error.");
            try {
                G1.u.zzo().zzw(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                f02.zze(AbstractC4542ub0.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f23944e && !this.f23945f) {
            if (G1.u.zzB().currentTimeMillis() >= this.f23946g + ((Integer) H1.C.zzc().zza(AbstractC4439th.zziX)).intValue()) {
                return true;
            }
        }
        L1.n.zzj("Ad inspector cannot be opened because it is already open.");
        try {
            f02.zze(AbstractC4542ub0.zzd(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    final /* synthetic */ void a(String str) throws JSONException {
        JSONObject jSONObjectZze = this.f23942c.zze();
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObjectZze.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.f23943d.zzb("window.inspectorInfo", jSONObjectZze.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1779Pw
    public final synchronized void zza(boolean z8, int i8, String str, String str2) {
        if (z8) {
            AbstractC0667v0.zza("Ad inspector loaded.");
            this.f23944e = true;
            zzk("");
            return;
        }
        L1.n.zzj("Ad inspector failed to load.");
        try {
            G1.u.zzo().zzw(new Exception("Failed to load UI. Error code: " + i8 + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            H1.F0 f02 = this.f23947h;
            if (f02 != null) {
                f02.zze(AbstractC4542ub0.zzd(17, null, null));
            }
        } catch (RemoteException e8) {
            G1.u.zzo().zzw(e8, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.f23948i = true;
        this.f23943d.destroy();
    }

    @Override // J1.w
    public final void zzdH() {
    }

    @Override // J1.w
    public final void zzdk() {
    }

    @Override // J1.w
    public final void zzdq() {
    }

    @Override // J1.w
    public final synchronized void zzdr() {
        this.f23945f = true;
        zzk("");
    }

    @Override // J1.w
    public final void zzdt() {
    }

    @Override // J1.w
    public final synchronized void zzdu(int i8) {
        this.f23943d.destroy();
        if (!this.f23948i) {
            AbstractC0667v0.zza("Inspector closed.");
            H1.F0 f02 = this.f23947h;
            if (f02 != null) {
                try {
                    f02.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f23945f = false;
        this.f23944e = false;
        this.f23946g = 0L;
        this.f23948i = false;
        this.f23947h = null;
    }

    public final Activity zzg() {
        InterfaceC2065Wv interfaceC2065Wv = this.f23943d;
        if (interfaceC2065Wv == null || interfaceC2065Wv.zzaE()) {
            return null;
        }
        return this.f23943d.zzi();
    }

    public final void zzh(C3734nS c3734nS) {
        this.f23942c = c3734nS;
    }

    public final synchronized void zzj(H1.F0 f02, C4675vl c4675vl, C3878ol c3878ol, C2393bl c2393bl) {
        if (b(f02)) {
            try {
                G1.u.zzz();
                InterfaceC2065Wv interfaceC2065WvZza = C3558lw.zza(this.f23940a, C1943Tw.zza(), "", false, false, null, null, this.f23941b, null, null, null, C4775we.zza(), null, null, null, null);
                this.f23943d = interfaceC2065WvZza;
                InterfaceC1861Rw interfaceC1861RwZzN = interfaceC2065WvZza.zzN();
                if (interfaceC1861RwZzN == null) {
                    L1.n.zzj("Failed to obtain a web view for the ad inspector");
                    try {
                        G1.u.zzo().zzw(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        f02.zze(AbstractC4542ub0.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e8) {
                        G1.u.zzo().zzw(e8, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.f23947h = f02;
                interfaceC1861RwZzN.zzR(null, null, null, null, null, false, null, null, null, null, null, null, null, c4675vl, null, new C4561ul(this.f23940a), c3878ol, c2393bl, null);
                interfaceC1861RwZzN.zzB(this);
                this.f23943d.loadUrl((String) H1.C.zzc().zza(AbstractC4439th.zziV));
                G1.u.zzi();
                J1.v.zza(this.f23940a, new AdOverlayInfoParcel(this, this.f23943d, 1, this.f23941b), true);
                this.f23946g = G1.u.zzB().currentTimeMillis();
            } catch (C3444kw e9) {
                L1.n.zzk("Failed to obtain a web view for the ad inspector", e9);
                try {
                    G1.u.zzo().zzw(e9, "InspectorUi.openInspector 0");
                    f02.zze(AbstractC4542ub0.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e10) {
                    G1.u.zzo().zzw(e10, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void zzk(final String str) {
        if (this.f23944e && this.f23945f) {
            AbstractC4805wt.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.xS
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.zza.a(str);
                }
            });
        }
    }
}
