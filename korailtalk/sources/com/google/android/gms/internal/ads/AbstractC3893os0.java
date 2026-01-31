package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.os0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3893os0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f21571a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f21572b;

    /* synthetic */ AbstractC3893os0(Class cls, Class cls2, AbstractC3779ns0 abstractC3779ns0) {
        this.f21571a = cls;
        this.f21572b = cls2;
    }

    public static AbstractC3893os0 zzb(InterfaceC3665ms0 interfaceC3665ms0, Class cls, Class cls2) {
        return new C3551ls0(cls, cls2, interfaceC3665ms0);
    }

    public abstract InterfaceC4009pt0 zza(C5138zo0 c5138zo0, C1976Uo0 c1976Uo0);

    public final Class zzc() {
        return this.f21571a;
    }

    public final Class zzd() {
        return this.f21572b;
    }
}
