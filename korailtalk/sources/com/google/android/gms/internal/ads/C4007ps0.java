package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ps0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4007ps0 implements InterfaceC1157Ao0 {

    /* renamed from: a, reason: collision with root package name */
    final String f21815a;

    /* renamed from: b, reason: collision with root package name */
    final Class f21816b;

    /* renamed from: c, reason: collision with root package name */
    final EnumC3559lw0 f21817c;

    /* renamed from: d, reason: collision with root package name */
    final Xz0 f21818d;

    C4007ps0(String str, Class cls, EnumC3559lw0 enumC3559lw0, Xz0 xz0) {
        this.f21818d = xz0;
        this.f21815a = str;
        this.f21816b = cls;
        this.f21817c = enumC3559lw0;
    }

    public static InterfaceC1157Ao0 zzd(String str, Class cls, EnumC3559lw0 enumC3559lw0, Xz0 xz0) {
        return new C4007ps0(str, cls, enumC3559lw0, xz0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1157Ao0
    public final C3673mw0 zza(AbstractC3677my0 abstractC3677my0) {
        C4129qw0 c4129qw0Zza = C4242rw0.zza();
        c4129qw0Zza.zzb(this.f21815a);
        c4129qw0Zza.zzc(abstractC3677my0);
        c4129qw0Zza.zza(Tw0.RAW);
        InterfaceC4009pt0 interfaceC4009pt0Zzd = Js0.zzc().zzd(C5146zs0.zzb().zza(Js0.zzc().zzb(C3553lt0.zza((C4242rw0) c4129qw0Zza.zzbr())), null), C3439kt0.class, AbstractC5024yo0.zza());
        C3331jw0 c3331jw0Zza = C3673mw0.zza();
        C3439kt0 c3439kt0 = (C3439kt0) interfaceC4009pt0Zzd;
        c3331jw0Zza.zzb(c3439kt0.zzg());
        c3331jw0Zza.zzc(c3439kt0.zze());
        c3331jw0Zza.zza(c3439kt0.zzb());
        return (C3673mw0) c3331jw0Zza.zzbr();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1157Ao0
    public final Class zzb() {
        return this.f21816b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1157Ao0
    public final Object zzc(AbstractC3677my0 abstractC3677my0) throws GeneralSecurityException {
        return Gs0.zza().zzc(Js0.zzc().zza(C3439kt0.zza(this.f21815a, abstractC3677my0, this.f21817c, Tw0.RAW, null), AbstractC5024yo0.zza()), this.f21816b);
    }
}
