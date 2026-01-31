package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.sT, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4304sT {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f22647a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f22648b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f22649c;

    /* renamed from: d, reason: collision with root package name */
    private final KT f22650d;

    /* renamed from: e, reason: collision with root package name */
    private final AD0 f22651e;

    public C4304sT(ScheduledExecutorService scheduledExecutorService, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un02, KT kt, AD0 ad0) {
        this.f22647a = scheduledExecutorService;
        this.f22648b = interfaceExecutorServiceC1974Un0;
        this.f22649c = interfaceExecutorServiceC1974Un02;
        this.f22650d = kt;
        this.f22651e = ad0;
    }

    final /* synthetic */ ZT a(C2519cr c2519cr) {
        return (ZT) this.f22650d.zza(c2519cr).get(((Integer) H1.C.zzc().zza(AbstractC4439th.zzfF)).intValue(), TimeUnit.SECONDS);
    }

    final /* synthetic */ com.google.common.util.concurrent.C b(final C2519cr c2519cr, int i8, Throwable th) {
        return AbstractC1483In0.zzn(((BinderC3281jV) this.f22651e.zzb()).zzd(c2519cr, i8), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.nT
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return AbstractC1483In0.zzh(new ZT((InputStream) obj, c2519cr));
            }
        }, this.f22648b);
    }

    public final com.google.common.util.concurrent.C zzc(final C2519cr c2519cr) {
        com.google.common.util.concurrent.C cZzb;
        String str = c2519cr.zzd;
        G1.u.zzp();
        if (K1.K0.zzC(str)) {
            cZzb = AbstractC1483In0.zzg(new YT(1));
        } else {
            cZzb = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhH)).booleanValue() ? this.f22649c.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.qT
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.a(c2519cr);
                }
            }) : this.f22650d.zza(c2519cr);
        }
        final int callingUid = Binder.getCallingUid();
        return AbstractC1483In0.zzf((AbstractC5136zn0) AbstractC1483In0.zzo(AbstractC5136zn0.zzu(cZzb), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzfF)).intValue(), TimeUnit.SECONDS, this.f22647a), Throwable.class, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.rT
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.b(c2519cr, callingUid, (Throwable) obj);
            }
        }, this.f22648b);
    }
}
