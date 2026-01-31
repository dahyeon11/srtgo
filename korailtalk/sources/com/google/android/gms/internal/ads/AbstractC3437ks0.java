package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ks0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3437ks0 {

    /* renamed from: a, reason: collision with root package name */
    private final Mx0 f20489a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f20490b;

    /* synthetic */ AbstractC3437ks0(Mx0 mx0, Class cls, AbstractC3323js0 abstractC3323js0) {
        this.f20489a = mx0;
        this.f20490b = cls;
    }

    public static AbstractC3437ks0 zzb(InterfaceC3210is0 interfaceC3210is0, Mx0 mx0, Class cls) {
        return new C3096hs0(mx0, cls, interfaceC3210is0);
    }

    public abstract C5138zo0 zza(InterfaceC4009pt0 interfaceC4009pt0, C1976Uo0 c1976Uo0);

    public final Mx0 zzc() {
        return this.f20489a;
    }

    public final Class zzd() {
        return this.f20490b;
    }
}
