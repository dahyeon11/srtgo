package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class NK implements InterfaceC3941pG, J1.w, VF {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14875a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2065Wv f14876b;

    /* renamed from: c, reason: collision with root package name */
    private final C4654va0 f14877c;

    /* renamed from: d, reason: collision with root package name */
    private final L1.a f14878d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumC1382Ge f14879e;

    /* renamed from: f, reason: collision with root package name */
    private final C2368bX f14880f;

    /* renamed from: g, reason: collision with root package name */
    C2597dX f14881g;

    public NK(Context context, InterfaceC2065Wv interfaceC2065Wv, C4654va0 c4654va0, L1.a aVar, EnumC1382Ge enumC1382Ge, C2368bX c2368bX) {
        this.f14875a = context;
        this.f14876b = interfaceC2065Wv;
        this.f14877c = c4654va0;
        this.f14878d = aVar;
        this.f14879e = enumC1382Ge;
        this.f14880f = c2368bX;
    }

    private final boolean a() {
        return ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfc)).booleanValue() && this.f14880f.zzd();
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
    public final void zzdr() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfh)).booleanValue() || this.f14876b == null) {
            return;
        }
        if (this.f14881g != null || a()) {
            if (this.f14881g != null) {
                this.f14876b.zzd("onSdkImpression", new O.a());
            } else {
                this.f14880f.zzb();
            }
        }
    }

    @Override // J1.w
    public final void zzdt() {
    }

    @Override // J1.w
    public final void zzdu(int i8) {
        this.f14881g = null;
    }

    @Override // com.google.android.gms.internal.ads.VF
    public final void zzr() {
        if (a()) {
            this.f14880f.zzb();
            return;
        }
        if (this.f14881g == null || this.f14876b == null) {
            return;
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfh)).booleanValue()) {
            this.f14876b.zzd("onSdkImpression", new O.a());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3941pG
    public final void zzs() {
        EnumC2253aX enumC2253aX;
        ZW zw;
        EnumC1382Ge enumC1382Ge;
        if ((((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfk)).booleanValue() || (enumC1382Ge = this.f14879e) == EnumC1382Ge.REWARD_BASED_VIDEO_AD || enumC1382Ge == EnumC1382Ge.INTERSTITIAL || enumC1382Ge == EnumC1382Ge.APP_OPEN) && this.f14877c.zzU && this.f14876b != null) {
            if (G1.u.zzA().zzl(this.f14875a)) {
                if (a()) {
                    this.f14880f.zzc();
                    return;
                }
                L1.a aVar = this.f14878d;
                String str = aVar.buddyApkVersion + "." + aVar.clientJarVersion;
                C1948Ua0 c1948Ua0 = this.f14877c.zzW;
                String strZza = c1948Ua0.zza();
                if (c1948Ua0.zzc() == 1) {
                    zw = ZW.VIDEO;
                    enumC2253aX = EnumC2253aX.DEFINED_BY_JAVASCRIPT;
                } else {
                    enumC2253aX = this.f14877c.zzZ == 2 ? EnumC2253aX.UNSPECIFIED : EnumC2253aX.BEGIN_TO_RENDER;
                    zw = ZW.HTML_DISPLAY;
                }
                C2597dX c2597dXZza = G1.u.zzA().zza(str, this.f14876b.zzG(), "", "javascript", strZza, enumC2253aX, zw, this.f14877c.zzam);
                this.f14881g = c2597dXZza;
                Object obj = this.f14876b;
                if (c2597dXZza != null) {
                    AbstractC4434te0 abstractC4434te0Zza = c2597dXZza.zza();
                    if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfb)).booleanValue()) {
                        G1.u.zzA().zzj(abstractC4434te0Zza, this.f14876b.zzG());
                        Iterator it = this.f14876b.zzV().iterator();
                        while (it.hasNext()) {
                            G1.u.zzA().zzg(abstractC4434te0Zza, (View) it.next());
                        }
                    } else {
                        G1.u.zzA().zzj(abstractC4434te0Zza, (View) obj);
                    }
                    this.f14876b.zzat(this.f14881g);
                    G1.u.zzA().zzk(abstractC4434te0Zza);
                    this.f14876b.zzd("onSdkLoaded", new O.a());
                }
            }
        }
    }
}
