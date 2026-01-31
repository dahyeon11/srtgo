package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uN0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4525uN0 implements InterfaceC2241aN0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3335jy0 f23040a;

    /* renamed from: b, reason: collision with root package name */
    private int f23041b;

    /* renamed from: c, reason: collision with root package name */
    private final C4411tN0 f23042c;

    /* renamed from: d, reason: collision with root package name */
    private final C3163iP0 f23043d;

    /* renamed from: e, reason: collision with root package name */
    private final YK0 f23044e;

    public C4525uN0(InterfaceC3335jy0 interfaceC3335jy0, C4411tN0 c4411tN0) {
        YK0 yk0 = new YK0();
        C3163iP0 c3163iP0 = new C3163iP0(-1);
        this.f23040a = interfaceC3335jy0;
        this.f23042c = c4411tN0;
        this.f23044e = yk0;
        this.f23043d = c3163iP0;
        this.f23041b = 1048576;
    }

    public final C4525uN0 zza(int i8) {
        this.f23041b = i8;
        return this;
    }

    public final C4753wN0 zzb(C3658mp c3658mp) {
        c3658mp.zzd.getClass();
        return new C4753wN0(c3658mp, this.f23040a, this.f23042c, InterfaceC2925gL0.zza, this.f23043d, this.f23041b, null);
    }
}
