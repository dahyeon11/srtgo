package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class LC implements InterfaceC3941pG, VF {

    /* renamed from: a */
    private final Context f14254a;

    /* renamed from: b */
    private final InterfaceC2065Wv f14255b;

    /* renamed from: c */
    private final C4654va0 f14256c;

    /* renamed from: d */
    private final L1.a f14257d;

    /* renamed from: e */
    private C2597dX f14258e;

    /* renamed from: f */
    private boolean f14259f;

    /* renamed from: g */
    private final C2368bX f14260g;

    public LC(Context context, InterfaceC2065Wv interfaceC2065Wv, C4654va0 c4654va0, L1.a aVar, C2368bX c2368bX) {
        this.f14254a = context;
        this.f14255b = interfaceC2065Wv;
        this.f14256c = c4654va0;
        this.f14257d = aVar;
        this.f14260g = c2368bX;
    }

    private final synchronized void a() {
        EnumC2253aX enumC2253aX;
        ZW zw;
        try {
            if (this.f14256c.zzU && this.f14255b != null) {
                if (G1.u.zzA().zzl(this.f14254a)) {
                    L1.a aVar = this.f14257d;
                    String str = aVar.buddyApkVersion + "." + aVar.clientJarVersion;
                    C1948Ua0 c1948Ua0 = this.f14256c.zzW;
                    String strZza = c1948Ua0.zza();
                    if (c1948Ua0.zzc() == 1) {
                        zw = ZW.VIDEO;
                        enumC2253aX = EnumC2253aX.DEFINED_BY_JAVASCRIPT;
                    } else {
                        C4654va0 c4654va0 = this.f14256c;
                        ZW zw2 = ZW.HTML_DISPLAY;
                        enumC2253aX = c4654va0.zzf == 1 ? EnumC2253aX.ONE_PIXEL : EnumC2253aX.BEGIN_TO_RENDER;
                        zw = zw2;
                    }
                    C2597dX c2597dXZza = G1.u.zzA().zza(str, this.f14255b.zzG(), "", "javascript", strZza, enumC2253aX, zw, this.f14256c.zzam);
                    this.f14258e = c2597dXZza;
                    Object obj = this.f14255b;
                    if (c2597dXZza != null) {
                        AbstractC4434te0 abstractC4434te0Zza = c2597dXZza.zza();
                        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfb)).booleanValue()) {
                            G1.u.zzA().zzj(abstractC4434te0Zza, this.f14255b.zzG());
                            Iterator it = this.f14255b.zzV().iterator();
                            while (it.hasNext()) {
                                G1.u.zzA().zzg(abstractC4434te0Zza, (View) it.next());
                            }
                        } else {
                            G1.u.zzA().zzj(abstractC4434te0Zza, (View) obj);
                        }
                        this.f14255b.zzat(this.f14258e);
                        G1.u.zzA().zzk(abstractC4434te0Zza);
                        this.f14259f = true;
                        this.f14255b.zzd("onSdkLoaded", new O.a());
                    }
                }
            }
        } finally {
        }
    }

    private final boolean b() {
        return ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfc)).booleanValue() && this.f14260g.zzd();
    }

    @Override // com.google.android.gms.internal.ads.VF
    public final synchronized void zzr() {
        InterfaceC2065Wv interfaceC2065Wv;
        if (b()) {
            this.f14260g.zzb();
            return;
        }
        if (!this.f14259f) {
            a();
        }
        if (!this.f14256c.zzU || this.f14258e == null || (interfaceC2065Wv = this.f14255b) == null) {
            return;
        }
        interfaceC2065Wv.zzd("onSdkImpression", new O.a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3941pG
    public final synchronized void zzs() {
        if (b()) {
            this.f14260g.zzc();
        } else {
            if (this.f14259f) {
                return;
            }
            a();
        }
    }
}
