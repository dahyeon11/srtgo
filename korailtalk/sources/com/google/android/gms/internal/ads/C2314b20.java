package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.b20, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2314b20 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.common.util.concurrent.C f18078a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f18079b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f18080c;

    public C2314b20(com.google.common.util.concurrent.C c9, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f18078a = c9;
        this.f18079b = executor;
        this.f18080c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        com.google.common.util.concurrent.C cZzn = AbstractC1483In0.zzn(this.f18078a, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.X10
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                final String str = (String) obj;
                return AbstractC1483In0.zzh(new M50() { // from class: com.google.android.gms.internal.ads.W10
                    @Override // com.google.android.gms.internal.ads.M50
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.f18079b);
        if (((Integer) H1.C.zzc().zza(AbstractC4439th.zzmv)).intValue() > 0) {
            cZzn = AbstractC1483In0.zzo(cZzn, ((Integer) H1.C.zzc().zza(r1)).intValue(), TimeUnit.MILLISECONDS, this.f18080c);
        }
        return AbstractC1483In0.zzf(cZzn, Throwable.class, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.Y10
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return ((Throwable) obj) instanceof TimeoutException ? AbstractC1483In0.zzh(new M50() { // from class: com.google.android.gms.internal.ads.Z10
                    @Override // com.google.android.gms.internal.ads.M50
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", Integer.toString(17));
                    }
                }) : AbstractC1483In0.zzh(new M50() { // from class: com.google.android.gms.internal.ads.a20
                    @Override // com.google.android.gms.internal.ads.M50
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putString("ms", null);
                    }
                });
            }
        }, this.f18079b);
    }
}
