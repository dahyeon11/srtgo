package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ZZ implements InterfaceC3171iX {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3397kX f17585a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3853oX f17586b;

    /* renamed from: c, reason: collision with root package name */
    private final C2263ad0 f17587c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f17588d;

    public ZZ(C2263ad0 c2263ad0, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, InterfaceC3397kX interfaceC3397kX, InterfaceC3853oX interfaceC3853oX) {
        this.f17587c = c2263ad0;
        this.f17588d = interfaceExecutorServiceC1974Un0;
        this.f17586b = interfaceC3853oX;
        this.f17585a = interfaceC3397kX;
    }

    static final String c(String str, int i8) {
        return "Error from: " + str + ", code: " + i8;
    }

    final /* synthetic */ Object a(C1457Ia0 c1457Ia0, C4654va0 c4654va0, C3511lX c3511lX, Void r42) {
        return this.f17586b.zza(c1457Ia0, c4654va0, c3511lX);
    }

    final /* synthetic */ void b(C1457Ia0 c1457Ia0, C4654va0 c4654va0, C3511lX c3511lX) {
        this.f17586b.zzb(c1457Ia0, c4654va0, c3511lX);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final com.google.common.util.concurrent.C zza(final C1457Ia0 c1457Ia0, final C4654va0 c4654va0) {
        final C3511lX c3511lXZza;
        Iterator it = c4654va0.zzu.iterator();
        while (true) {
            if (!it.hasNext()) {
                c3511lXZza = null;
                break;
            }
            try {
                c3511lXZza = this.f17585a.zza((String) it.next(), c4654va0.zzw);
                break;
            } catch (C2112Ya0 unused) {
            }
        }
        if (c3511lXZza == null) {
            return AbstractC1483In0.zzg(new NY("Unable to instantiate mediation adapter class."));
        }
        C1203Bt c1203Bt = new C1203Bt();
        c3511lXZza.zzc.zza(new YZ(this, c3511lXZza, c1203Bt));
        if (c4654va0.zzN) {
            Bundle bundle = c1457Ia0.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        C2263ad0 c2263ad0 = this.f17587c;
        return AbstractC1543Kc0.zzd(new InterfaceC1256Dc0() { // from class: com.google.android.gms.internal.ads.WZ
            @Override // com.google.android.gms.internal.ads.InterfaceC1256Dc0
            public final void zza() {
                this.zza.b(c1457Ia0, c4654va0, c3511lXZza);
            }
        }, this.f17588d, EnumC1952Uc0.ADAPTER_LOAD_AD_SYN, c2263ad0).zzb(EnumC1952Uc0.ADAPTER_LOAD_AD_ACK).zzd(c1203Bt).zzb(EnumC1952Uc0.ADAPTER_WRAP_ADAPTER).zze(new InterfaceC1215Cc0() { // from class: com.google.android.gms.internal.ads.XZ
            @Override // com.google.android.gms.internal.ads.InterfaceC1215Cc0
            public final Object zza(Object obj) {
                return this.zza.a(c1457Ia0, c4654va0, c3511lXZza, (Void) obj);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171iX
    public final boolean zzb(C1457Ia0 c1457Ia0, C4654va0 c4654va0) {
        return !c4654va0.zzu.isEmpty();
    }
}
