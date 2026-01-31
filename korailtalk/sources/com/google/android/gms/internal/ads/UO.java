package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class UO implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f16657a;

    public UO(XD0 xd0) {
        this.f16657a = xd0;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* bridge */ /* synthetic */ Object zzb() {
        EnumC1382Ge enumC1382Ge = ((C4053qF) this.f16657a).zza().zzo.zza == 3 ? EnumC1382Ge.REWARDED_INTERSTITIAL : EnumC1382Ge.REWARD_BASED_VIDEO_AD;
        OD0.zzb(enumC1382Ge);
        return enumC1382Ge;
    }
}
