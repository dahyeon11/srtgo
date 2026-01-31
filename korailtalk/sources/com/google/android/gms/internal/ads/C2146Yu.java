package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.Yu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2146Yu extends K1.B {

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC4579uu f17458c;

    /* renamed from: d, reason: collision with root package name */
    final AbstractC2986gv f17459d;

    /* renamed from: e, reason: collision with root package name */
    private final String f17460e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f17461f;

    C2146Yu(InterfaceC4579uu interfaceC4579uu, AbstractC2986gv abstractC2986gv, String str, String[] strArr) {
        this.f17458c = interfaceC4579uu;
        this.f17459d = abstractC2986gv;
        this.f17460e = str;
        this.f17461f = strArr;
        G1.u.zzy().zzb(this);
    }

    final /* synthetic */ Boolean b() {
        return Boolean.valueOf(this.f17459d.zzw(this.f17460e, this.f17461f, this));
    }

    @Override // K1.B
    public final void zza() {
        try {
            this.f17459d.zzu(this.f17460e, this.f17461f);
        } finally {
            K1.K0.zza.post(new RunnableC2105Xu(this));
        }
    }

    @Override // K1.B
    public final com.google.common.util.concurrent.C zzb() {
        return (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbX)).booleanValue() && (this.f17459d instanceof C4012pv)) ? AbstractC4805wt.zze.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.Wu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.b();
            }
        }) : super.zzb();
    }

    public final String zze() {
        return this.f17460e;
    }
}
