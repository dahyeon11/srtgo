package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qD0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4050qD0 implements InterfaceC3335jy0 {

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC4279sE0 f21883b;

    /* renamed from: c, reason: collision with root package name */
    private String f21884c;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21887f;

    /* renamed from: a, reason: collision with root package name */
    private final C3482lE0 f21882a = new C3482lE0();

    /* renamed from: d, reason: collision with root package name */
    private int f21885d = 8000;

    /* renamed from: e, reason: collision with root package name */
    private int f21886e = 8000;

    public final C4050qD0 zzb(boolean z8) {
        this.f21887f = true;
        return this;
    }

    public final C4050qD0 zzc(int i8) {
        this.f21885d = i8;
        return this;
    }

    public final C4050qD0 zzd(int i8) {
        this.f21886e = i8;
        return this;
    }

    public final C4050qD0 zze(InterfaceC4279sE0 interfaceC4279sE0) {
        this.f21883b = interfaceC4279sE0;
        return this;
    }

    public final C4050qD0 zzf(String str) {
        this.f21884c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3335jy0
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final C2567dE0 zza() {
        C2567dE0 c2567dE0 = new C2567dE0(this.f21884c, this.f21885d, this.f21886e, this.f21887f, this.f21882a);
        InterfaceC4279sE0 interfaceC4279sE0 = this.f21883b;
        if (interfaceC4279sE0 != null) {
            c2567dE0.zzf(interfaceC4279sE0);
        }
        return c2567dE0;
    }
}
