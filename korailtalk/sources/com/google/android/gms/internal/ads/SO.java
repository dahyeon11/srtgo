package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class SO implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f16278a;

    /* renamed from: b, reason: collision with root package name */
    private final XD0 f16279b;

    /* renamed from: c, reason: collision with root package name */
    private final XD0 f16280c;

    public SO(XD0 xd0, XD0 xd02, XD0 xd03) {
        this.f16278a = xd0;
        this.f16279b = xd02;
        this.f16280c = xd03;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final /* synthetic */ Object zzb() {
        int i8 = ((C4053qF) this.f16280c).zza().zzo.zza;
        if (i8 != 0) {
            return i8 + (-1) != 0 ? ((C2195a00) this.f16279b).zzb() : ((C2195a00) this.f16278a).zzb();
        }
        throw null;
    }
}
