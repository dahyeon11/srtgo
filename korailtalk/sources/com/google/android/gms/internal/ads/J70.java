package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class J70 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final C3666mt f13590a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f13591b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f13592c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f13593d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f13594e;

    /* renamed from: f, reason: collision with root package name */
    private final String f13595f;

    /* renamed from: g, reason: collision with root package name */
    private final C2294at f13596g;

    J70(C3666mt c3666mt, boolean z8, boolean z9, C2294at c2294at, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f13590a = c3666mt;
        this.f13591b = z8;
        this.f13592c = z9;
        this.f13596g = c2294at;
        this.f13594e = interfaceExecutorServiceC1974Un0;
        this.f13595f = str;
        this.f13593d = scheduledExecutorService;
    }

    final /* synthetic */ K70 a(Exception exc) {
        this.f13590a.zzw(exc, "TrustlessTokenSignal");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzhq)).booleanValue() && this.f13592c) {
            return AbstractC1483In0.zzh(null);
        }
        if (!this.f13591b) {
            return AbstractC1483In0.zzh(null);
        }
        return AbstractC1483In0.zze(AbstractC1483In0.zzo(AbstractC1483In0.zzm(AbstractC1483In0.zzh(null), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.H70
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new K70(str);
            }
        }, this.f13594e), ((Long) AbstractC1308Ei.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.f13593d), Exception.class, new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.I70
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                this.zza.a((Exception) obj);
                return null;
            }
        }, this.f13594e);
    }
}
