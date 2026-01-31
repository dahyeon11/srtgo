package J1;

import K1.AbstractC0667v0;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC1473Ii0;
import com.google.android.gms.internal.ads.AbstractC1555Ki0;
import com.google.android.gms.internal.ads.AbstractC1636Mi0;
import com.google.android.gms.internal.ads.AbstractC1677Ni0;
import com.google.android.gms.internal.ads.AbstractC2619dj0;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.AbstractC4784wi0;
import com.google.android.gms.internal.ads.AbstractC4805wt;
import com.google.android.gms.internal.ads.AbstractC4898xi0;
import com.google.android.gms.internal.ads.AbstractC5126zi0;
import com.google.android.gms.internal.ads.InterfaceC1596Li0;
import com.google.android.gms.internal.ads.InterfaceC2065Wv;
import com.google.android.gms.internal.ads.InterfaceC5012yi0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC1596Li0 f2538f;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC2065Wv f2535c = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2537e = false;

    /* renamed from: a, reason: collision with root package name */
    private String f2533a = null;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC5012yi0 f2536d = null;

    /* renamed from: b, reason: collision with root package name */
    private String f2534b = null;

    private final AbstractC1677Ni0 f() {
        AbstractC1636Mi0 abstractC1636Mi0Zzc = AbstractC1677Ni0.zzc();
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlx)).booleanValue() || TextUtils.isEmpty(this.f2534b)) {
            String str = this.f2533a;
            if (str != null) {
                abstractC1636Mi0Zzc.zzb(str);
            } else {
                c("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            abstractC1636Mi0Zzc.zza(this.f2534b);
        }
        return abstractC1636Mi0Zzc.zzc();
    }

    private final void g() {
        if (this.f2538f == null) {
            this.f2538f = new D(this);
        }
    }

    final void a(String str) {
        b(str, new HashMap());
    }

    final void b(final String str, final Map map) {
        AbstractC4805wt.zze.execute(new Runnable() { // from class: J1.C
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.d(str, map);
            }
        });
    }

    final void c(String str, String str2) {
        AbstractC0667v0.zza(str);
        if (this.f2535c != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            b("onError", map);
        }
    }

    final /* synthetic */ void d(String str, Map map) {
        InterfaceC2065Wv interfaceC2065Wv = this.f2535c;
        if (interfaceC2065Wv != null) {
            interfaceC2065Wv.zzd(str, map);
        }
    }

    final void e(AbstractC1555Ki0 abstractC1555Ki0) {
        if (!TextUtils.isEmpty(abstractC1555Ki0.zzb())) {
            if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlx)).booleanValue()) {
                this.f2533a = abstractC1555Ki0.zzb();
            }
        }
        switch (abstractC1555Ki0.zza()) {
            case 8152:
                a("onLMDOverlayOpened");
                break;
            case 8153:
                a("onLMDOverlayClicked");
                break;
            case 8155:
                a("onLMDOverlayClose");
                break;
            case 8157:
                this.f2533a = null;
                this.f2534b = null;
                this.f2537e = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(abstractC1555Ki0.zza()));
                b("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    public final synchronized void zza(InterfaceC2065Wv interfaceC2065Wv, Context context) {
        this.f2535c = interfaceC2065Wv;
        if (!zzk(context)) {
            c("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        b("on_play_store_bind", map);
    }

    public final void zzb() {
        InterfaceC5012yi0 interfaceC5012yi0;
        if (!this.f2537e || (interfaceC5012yi0 = this.f2536d) == null) {
            AbstractC0667v0.zza("LastMileDelivery not connected");
        } else {
            interfaceC5012yi0.zza(f(), this.f2538f);
            a("onLMDOverlayCollapse");
        }
    }

    public final void zzc() {
        InterfaceC5012yi0 interfaceC5012yi0;
        if (!this.f2537e || (interfaceC5012yi0 = this.f2536d) == null) {
            AbstractC0667v0.zza("LastMileDelivery not connected");
            return;
        }
        AbstractC4784wi0 abstractC4784wi0Zzc = AbstractC4898xi0.zzc();
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlx)).booleanValue() || TextUtils.isEmpty(this.f2534b)) {
            String str = this.f2533a;
            if (str != null) {
                abstractC4784wi0Zzc.zzb(str);
            } else {
                c("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            abstractC4784wi0Zzc.zza(this.f2534b);
        }
        interfaceC5012yi0.zzb(abstractC4784wi0Zzc.zzc(), this.f2538f);
    }

    public final void zzg() {
        InterfaceC5012yi0 interfaceC5012yi0;
        if (!this.f2537e || (interfaceC5012yi0 = this.f2536d) == null) {
            AbstractC0667v0.zza("LastMileDelivery not connected");
        } else {
            interfaceC5012yi0.zzc(f(), this.f2538f);
            a("onLMDOverlayExpand");
        }
    }

    public final void zzj(InterfaceC2065Wv interfaceC2065Wv, AbstractC1473Ii0 abstractC1473Ii0) {
        if (interfaceC2065Wv == null) {
            c("adWebview missing", "onLMDShow");
            return;
        }
        this.f2535c = interfaceC2065Wv;
        if (!this.f2537e && !zzk(interfaceC2065Wv.getContext())) {
            c("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlx)).booleanValue()) {
            this.f2534b = abstractC1473Ii0.zzh();
        }
        g();
        InterfaceC5012yi0 interfaceC5012yi0 = this.f2536d;
        if (interfaceC5012yi0 != null) {
            interfaceC5012yi0.zzd(abstractC1473Ii0, this.f2538f);
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (!AbstractC2619dj0.zza(context)) {
            return false;
        }
        try {
            this.f2536d = AbstractC5126zi0.zza(context);
        } catch (NullPointerException e8) {
            AbstractC0667v0.zza("Error connecting LMD Overlay service");
            G1.u.zzo().zzw(e8, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.f2536d == null) {
            this.f2537e = false;
            return false;
        }
        g();
        this.f2537e = true;
        return true;
    }
}
