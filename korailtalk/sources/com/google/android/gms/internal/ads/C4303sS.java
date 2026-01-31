package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.sS, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4303sS implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f22642a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f22643b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f22644c;

    /* renamed from: d, reason: collision with root package name */
    private final XD0 f22645d;

    /* renamed from: e, reason: collision with root package name */
    private final XD0 f22646e;

    public C4303sS(XD0 xd0, XD0 xd02, XD0 xd03, XD0 xd04, XD0 xd05) {
        this.f22642a = xd0;
        this.f22643b = xd02;
        this.f22644c = xd03;
        this.f22645d = xd04;
        this.f22646e = xd05;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((C2990gx) this.f22642a).zza();
        WeakReference weakReferenceZza = ((C3105hx) this.f22643b).zza();
        C4987yS c4987yS = (C4987yS) this.f22644c.zzb();
        LS ls = new LS();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new KS(contextZza, weakReferenceZza, c4987yS, ls, interfaceExecutorServiceC1974Un0);
    }
}
