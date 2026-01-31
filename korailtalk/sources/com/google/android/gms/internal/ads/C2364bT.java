package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.bT, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2364bT implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f18139a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f18140b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f18141c;

    public C2364bT(XD0 xd0, XD0 xd02, XD0 xd03) {
        this.f18139a = xd0;
        this.f18140b = xd02;
        this.f18141c = xd03;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        final C2487cb c2487cb = (C2487cb) this.f18139a.zzb();
        final Context contextZza = ((C2990gx) this.f18140b).zza();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        com.google.common.util.concurrent.C cZzb = interfaceExecutorServiceC1974Un0.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.YS
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c2487cb.zzc().zzg(contextZza);
            }
        });
        OD0.zzb(cZzb);
        return cZzb;
    }
}
