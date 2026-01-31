package com.google.android.gms.internal.ads;

import I2.AbstractC0611o;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class M60 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final C3666mt f14532a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14533b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f14534c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f14535d;

    /* renamed from: e, reason: collision with root package name */
    private final C2117Yd f14536e;

    M60(String str, C2117Yd c2117Yd, C3666mt c3666mt, ScheduledExecutorService scheduledExecutorService, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0) {
        this.f14533b = str;
        this.f14536e = c2117Yd;
        this.f14532a = c3666mt;
        this.f14534c = scheduledExecutorService;
        this.f14535d = interfaceExecutorServiceC1974Un0;
    }

    final /* synthetic */ N60 a(Exception exc) {
        this.f14532a.zzw(exc, "AppSetIdInfoGmscoreSignal");
        return new N60(null, -1);
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcK)).booleanValue()) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzcP)).booleanValue()) {
                com.google.common.util.concurrent.C cZzn = AbstractC1483In0.zzn(AbstractC2502ci0.zza(AbstractC0611o.forResult(null), null), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.K60
                    @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
                    public final com.google.common.util.concurrent.C zza(Object obj) {
                        X1.c cVar = (X1.c) obj;
                        return cVar == null ? AbstractC1483In0.zzh(new N60(null, -1)) : AbstractC1483In0.zzh(new N60(cVar.getId(), cVar.getScope()));
                    }
                }, this.f14535d);
                if (((Boolean) AbstractC2616di.zza.zze()).booleanValue()) {
                    cZzn = AbstractC1483In0.zzo(cZzn, ((Long) AbstractC2616di.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.f14534c);
                }
                return AbstractC1483In0.zze(cZzn, Exception.class, new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.L60
                    @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
                    public final Object apply(Object obj) {
                        return this.zza.a((Exception) obj);
                    }
                }, this.f14535d);
            }
        }
        return AbstractC1483In0.zzh(new N60(null, -1));
    }
}
