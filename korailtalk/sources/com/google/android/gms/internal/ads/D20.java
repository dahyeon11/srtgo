package com.google.android.gms.internal.ads;

import I2.AbstractC0608l;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class D20 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    final C3666mt f12610a;

    /* renamed from: b, reason: collision with root package name */
    X1.b f12611b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f12612c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f12613d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f12614e;

    D20(Context context, C3666mt c3666mt, ScheduledExecutorService scheduledExecutorService, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0) {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcO)).booleanValue()) {
            this.f12611b = X1.a.getClient(context);
        }
        this.f12614e = context;
        this.f12610a = c3666mt;
        this.f12612c = scheduledExecutorService;
        this.f12613d = interfaceExecutorServiceC1974Un0;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcK)).booleanValue()) {
            if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcP)).booleanValue()) {
                if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcL)).booleanValue()) {
                    return AbstractC1483In0.zzm(AbstractC2502ci0.zza(this.f12611b.getAppSetIdInfo(), null), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.A20
                        @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
                        public final Object apply(Object obj) {
                            X1.c cVar = (X1.c) obj;
                            return new E20(cVar.getId(), cVar.getScope());
                        }
                    }, AbstractC4805wt.zzf);
                }
                AbstractC0608l abstractC0608lZza = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcO)).booleanValue() ? AbstractC4884xb0.zza(this.f12614e) : this.f12611b.getAppSetIdInfo();
                if (abstractC0608lZza == null) {
                    return AbstractC1483In0.zzh(new E20(null, -1));
                }
                com.google.common.util.concurrent.C cZzn = AbstractC1483In0.zzn(AbstractC2502ci0.zza(abstractC0608lZza, null), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.B20
                    @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
                    public final com.google.common.util.concurrent.C zza(Object obj) {
                        X1.c cVar = (X1.c) obj;
                        return cVar == null ? AbstractC1483In0.zzh(new E20(null, -1)) : AbstractC1483In0.zzh(new E20(cVar.getId(), cVar.getScope()));
                    }
                }, AbstractC4805wt.zzf);
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcM)).booleanValue()) {
                    cZzn = AbstractC1483In0.zzo(cZzn, ((Long) H1.C.zzc().zza(AbstractC4439th.zzcN)).longValue(), TimeUnit.MILLISECONDS, this.f12612c);
                }
                return AbstractC1483In0.zze(cZzn, Exception.class, new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.C20
                    @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
                    public final Object apply(Object obj) {
                        this.zza.f12610a.zzw((Exception) obj, "AppSetIdInfoSignal");
                        return new E20(null, -1);
                    }
                }, this.f12613d);
            }
        }
        return AbstractC1483In0.zzh(new E20(null, -1));
    }
}
