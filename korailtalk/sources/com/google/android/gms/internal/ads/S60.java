package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class S60 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16198a;

    /* renamed from: b, reason: collision with root package name */
    private final C3666mt f16199b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f16200c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f16201d;

    /* renamed from: e, reason: collision with root package name */
    private final String f16202e;

    /* renamed from: f, reason: collision with root package name */
    private final C2523ct f16203f;

    public S60(C2523ct c2523ct, int i8, Context context, C3666mt c3666mt, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.f16203f = c2523ct;
        this.f16198a = context;
        this.f16199b = c3666mt;
        this.f16200c = scheduledExecutorService;
        this.f16201d = executor;
        this.f16202e = str;
    }

    final /* synthetic */ W60 a(Exception exc) {
        this.f16199b.zzw(exc, "AttestationTokenSignal");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 44;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return AbstractC1483In0.zze((AbstractC5136zn0) AbstractC1483In0.zzo(AbstractC1483In0.zzm(AbstractC5136zn0.zzu(AbstractC1483In0.zzk(new InterfaceC3769nn0() { // from class: com.google.android.gms.internal.ads.P60
            @Override // com.google.android.gms.internal.ads.InterfaceC3769nn0
            public final com.google.common.util.concurrent.C zza() {
                return AbstractC1483In0.zzh(null);
            }
        }, this.f16201d)), new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.Q60
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new W60(str);
            }
        }, this.f16201d), ((Long) H1.C.zzc().zza(AbstractC4439th.zzaW)).longValue(), TimeUnit.MILLISECONDS, this.f16200c), Exception.class, new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.R60
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                this.zza.a((Exception) obj);
                return null;
            }
        }, AbstractC2285ao0.zzb());
    }
}
