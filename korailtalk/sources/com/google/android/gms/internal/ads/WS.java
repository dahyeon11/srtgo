package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class WS {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f17000a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f17001b;

    /* renamed from: c, reason: collision with root package name */
    private final FT f17002c;

    /* renamed from: d, reason: collision with root package name */
    private final AD0 f17003d;

    public WS(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un02, FT ft, AD0 ad0) {
        this.f17000a = interfaceExecutorServiceC1974Un0;
        this.f17001b = interfaceExecutorServiceC1974Un02;
        this.f17002c = ft;
        this.f17003d = ad0;
    }

    final /* synthetic */ ZT a(C2519cr c2519cr) {
        return (ZT) this.f17002c.zza(c2519cr).get(((Integer) H1.C.zzc().zza(AbstractC4439th.zzfF)).intValue(), TimeUnit.SECONDS);
    }

    final /* synthetic */ com.google.common.util.concurrent.C b(final C2519cr c2519cr, int i8, YT yt) {
        return AbstractC1483In0.zzn(((BinderC3281jV) this.f17003d.zzb()).zzc(c2519cr, i8), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.SS
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return AbstractC1483In0.zzh(new ZT((InputStream) obj, c2519cr));
            }
        }, this.f17001b);
    }

    public final com.google.common.util.concurrent.C zzc(final C2519cr c2519cr) {
        String str = c2519cr.zzd;
        G1.u.zzp();
        com.google.common.util.concurrent.C cZzg = K1.K0.zzC(str) ? AbstractC1483In0.zzg(new YT(1)) : AbstractC1483In0.zzf(this.f17000a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.TS
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a(c2519cr);
            }
        }), ExecutionException.class, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.US
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return AbstractC1483In0.zzg(((ExecutionException) obj).getCause());
            }
        }, this.f17001b);
        final int callingUid = Binder.getCallingUid();
        return AbstractC1483In0.zzf(cZzg, YT.class, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.VS
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.b(c2519cr, callingUid, (YT) obj);
            }
        }, this.f17001b);
    }
}
