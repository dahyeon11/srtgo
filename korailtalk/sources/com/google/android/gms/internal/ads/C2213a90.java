package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a90, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2213a90 implements InterfaceC3358k90 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3358k90 f17908a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC2797fF f17909b;

    public C2213a90(InterfaceC3358k90 interfaceC3358k90) {
        this.f17908a = interfaceC3358k90;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358k90
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC2797fF zzd() {
        return this.f17909b;
    }

    public final synchronized com.google.common.util.concurrent.C zzb(C3472l90 c3472l90, InterfaceC3244j90 interfaceC3244j90, InterfaceC2797fF interfaceC2797fF) {
        this.f17909b = interfaceC2797fF;
        if (c3472l90.zza == null) {
            return ((Y80) this.f17908a).zzb(c3472l90, interfaceC3244j90, interfaceC2797fF);
        }
        HD hdZzb = interfaceC2797fF.zzb();
        return hdZzb.zzi(hdZzb.zzk(AbstractC1483In0.zzh(c3472l90.zza)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3358k90
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.C zzc(C3472l90 c3472l90, InterfaceC3244j90 interfaceC3244j90, Object obj) {
        return zzb(c3472l90, interfaceC3244j90, null);
    }
}
