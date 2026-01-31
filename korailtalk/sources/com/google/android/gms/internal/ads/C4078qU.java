package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.qU */
/* loaded from: classes2.dex */
public final class C4078qU {

    /* renamed from: a */
    private final InterfaceExecutorServiceC1974Un0 f21950a;

    /* renamed from: b */
    private final InterfaceExecutorServiceC1974Un0 f21951b;

    /* renamed from: c */
    private final MU f21952c;

    /* renamed from: d */
    private final AD0 f21953d;

    C4078qU(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un02, MU mu, AD0 ad0) {
        this.f21950a = interfaceExecutorServiceC1974Un0;
        this.f21951b = interfaceExecutorServiceC1974Un02;
        this.f21952c = mu;
        this.f21953d = ad0;
    }

    final /* synthetic */ com.google.common.util.concurrent.C a(C1405Gq c1405Gq) {
        return this.f21952c.zza(c1405Gq, ((Long) H1.C.zzc().zza(AbstractC4439th.zzlD)).longValue());
    }

    final /* synthetic */ com.google.common.util.concurrent.C b(C1405Gq c1405Gq, int i8, YT yt) {
        return ((BinderC4534uV) this.f21953d.zzb()).zzb(c1405Gq, i8);
    }

    public final com.google.common.util.concurrent.C zzc(final C1405Gq c1405Gq) {
        String str = c1405Gq.zzf;
        G1.u.zzp();
        com.google.common.util.concurrent.C cZzg = K1.K0.zzC(str) ? AbstractC1483In0.zzg(new YT(1, "Ads service proxy force local")) : AbstractC1483In0.zzf(AbstractC1483In0.zzk(new InterfaceC3769nn0() { // from class: com.google.android.gms.internal.ads.nU
            @Override // com.google.android.gms.internal.ads.InterfaceC3769nn0
            public final com.google.common.util.concurrent.C zza() {
                return this.zza.a(c1405Gq);
            }
        }, this.f21950a), ExecutionException.class, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.oU
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return AbstractC1483In0.zzg(cause);
            }
        }, this.f21951b);
        final int callingUid = Binder.getCallingUid();
        return AbstractC1483In0.zzf(cZzg, YT.class, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.pU
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.b(c1405Gq, callingUid, (YT) obj);
            }
        }, this.f21951b);
    }
}
