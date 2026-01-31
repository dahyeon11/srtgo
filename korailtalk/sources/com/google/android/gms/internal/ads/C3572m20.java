package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.m20 */
/* loaded from: classes2.dex */
public final class C3572m20 implements N50 {

    /* renamed from: a */
    private final InterfaceExecutorServiceC1974Un0 f20806a;

    /* renamed from: b */
    private final C5098zP f20807b;

    /* renamed from: c */
    private final RR f20808c;

    /* renamed from: d */
    private final C3800o20 f20809d;

    public C3572m20(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, C5098zP c5098zP, RR rr, C3800o20 c3800o20) {
        this.f20806a = interfaceExecutorServiceC1974Un0;
        this.f20807b = c5098zP;
        this.f20808c = rr;
        this.f20809d = c3800o20;
    }

    final /* synthetic */ C3686n20 a() {
        List<String> listAsList = Arrays.asList(((String) H1.C.zzc().zza(AbstractC4439th.zzbs)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                C4087qb0 c4087qb0Zzc = this.f20807b.zzc(str, new JSONObject());
                c4087qb0Zzc.zzC();
                boolean zZzt = this.f20808c.zzt();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlH)).booleanValue() || zZzt) {
                    try {
                        C2974gp c2974gpZzf = c4087qb0Zzc.zzf();
                        if (c2974gpZzf != null) {
                            bundle2.putString("sdk_version", c2974gpZzf.toString());
                        }
                    } catch (C2112Ya0 unused) {
                    }
                }
                try {
                    C2974gp c2974gpZze = c4087qb0Zzc.zze();
                    if (c2974gpZze != null) {
                        bundle2.putString("adapter_version", c2974gpZze.toString());
                    }
                } catch (C2112Ya0 unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (C2112Ya0 unused3) {
            }
        }
        C3686n20 c3686n20 = new C3686n20(bundle);
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlH)).booleanValue()) {
            this.f20809d.b(c3686n20);
        }
        return c3686n20;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        AbstractC3414kh abstractC3414kh = AbstractC4439th.zzlH;
        if (((Boolean) H1.C.zzc().zza(abstractC3414kh)).booleanValue() && this.f20809d.a() != null) {
            C3686n20 c3686n20A = this.f20809d.a();
            c3686n20A.getClass();
            return AbstractC1483In0.zzh(c3686n20A);
        }
        if (AbstractC1802Qj0.zzd((String) H1.C.zzc().zza(AbstractC4439th.zzbs)) || (!((Boolean) H1.C.zzc().zza(abstractC3414kh)).booleanValue() && (this.f20809d.zzd() || !this.f20808c.zzt()))) {
            return AbstractC1483In0.zzh(new C3686n20(new Bundle()));
        }
        this.f20809d.zzc(true);
        return this.f20806a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.l20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a();
            }
        });
    }
}
