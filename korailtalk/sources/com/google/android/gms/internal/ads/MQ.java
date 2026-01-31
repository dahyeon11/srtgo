package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class MQ implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f14660a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f14661b;

    public MQ(XD0 xd0, XD0 xd02) {
        this.f14660a = xd0;
        this.f14661b = xd02;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        QQ qq = (QQ) this.f14660a.zzb();
        InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
        OD0.zzb(interfaceExecutorServiceC1974Un0);
        return new LQ(qq, interfaceExecutorServiceC1974Un0);
    }
}
