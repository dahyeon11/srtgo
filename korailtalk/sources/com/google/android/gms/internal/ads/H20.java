package com.google.android.gms.internal.ads;

import K1.InterfaceC0671x0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class H20 implements N50 {

    /* renamed from: k, reason: collision with root package name */
    private static final Object f13233k = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Context f13234a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13235b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13236c;

    /* renamed from: d, reason: collision with root package name */
    private final long f13237d;

    /* renamed from: e, reason: collision with root package name */
    private final UD f13238e;

    /* renamed from: f, reason: collision with root package name */
    private final C1131Ab0 f13239f;

    /* renamed from: g, reason: collision with root package name */
    private final C1825Ra0 f13240g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC0671x0 f13241h = G1.u.zzo().zzi();

    /* renamed from: i, reason: collision with root package name */
    private final FQ f13242i;

    /* renamed from: j, reason: collision with root package name */
    private final C3025hE f13243j;

    public H20(Context context, String str, String str2, UD ud, C1131Ab0 c1131Ab0, C1825Ra0 c1825Ra0, FQ fq, C3025hE c3025hE, long j8) {
        this.f13234a = context;
        this.f13235b = str;
        this.f13236c = str2;
        this.f13238e = ud;
        this.f13239f = c1131Ab0;
        this.f13240g = c1825Ra0;
        this.f13242i = fq;
        this.f13243j = c3025hE;
        this.f13237d = j8;
    }

    final /* synthetic */ void a(Bundle bundle, Bundle bundle2) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfI)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfH)).booleanValue()) {
                synchronized (f13233k) {
                    this.f13238e.zzk(this.f13240g.zzd);
                    bundle2.putBundle("quality_signals", this.f13239f.zzb());
                }
            } else {
                this.f13238e.zzk(this.f13240g.zzd);
                bundle2.putBundle("quality_signals", this.f13239f.zzb());
            }
        }
        bundle2.putString("seq_num", this.f13235b);
        if (!this.f13241h.zzS()) {
            bundle2.putString("session_id", this.f13236c);
        }
        bundle2.putBoolean("client_purpose_one", !this.f13241h.zzS());
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfJ)).booleanValue()) {
            try {
                G1.u.zzp();
                bundle2.putString("_app_id", K1.K0.zzp(this.f13234a));
            } catch (RemoteException e8) {
                G1.u.zzo().zzw(e8, "AppStatsSignal_AppId");
            }
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfK)).booleanValue() && this.f13240g.zzf != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("dload", this.f13243j.zzb(this.f13240g.zzf));
            bundle3.putInt("pcc", this.f13243j.zza(this.f13240g.zzf));
            bundle2.putBundle("ad_unit_quality_signals", bundle3);
        }
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjK)).booleanValue() || G1.u.zzo().zza() <= 0) {
            return;
        }
        bundle2.putInt("nrwv", G1.u.zzo().zza());
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        final Bundle bundle = new Bundle();
        this.f13242i.zzb().put("seq_num", this.f13235b);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcd)).booleanValue()) {
            this.f13242i.zzc("tsacc", String.valueOf(G1.u.zzB().currentTimeMillis() - this.f13237d));
            FQ fq = this.f13242i;
            G1.u.zzp();
            fq.zzc("foreground", true != K1.K0.zzG(this.f13234a) ? "1" : "0");
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfI)).booleanValue()) {
            this.f13238e.zzk(this.f13240g.zzd);
            bundle.putAll(this.f13239f.zzb());
        }
        return AbstractC1483In0.zzh(new M50() { // from class: com.google.android.gms.internal.ads.G20
            @Override // com.google.android.gms.internal.ads.M50
            public final void zzj(Object obj) {
                this.zza.a(bundle, (Bundle) obj);
            }
        });
    }
}
