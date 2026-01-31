package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.h4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3005h4 implements InterfaceC2660e4 {

    /* renamed from: a, reason: collision with root package name */
    private final C4099qh0 f19748a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19749b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19750c;

    /* renamed from: d, reason: collision with root package name */
    private int f19751d;

    /* renamed from: e, reason: collision with root package name */
    private int f19752e;

    public C3005h4(C2202a4 c2202a4) {
        C4099qh0 c4099qh0 = c2202a4.zza;
        this.f19748a = c4099qh0;
        c4099qh0.zzK(12);
        this.f19750c = c4099qh0.zzp() & 255;
        this.f19749b = c4099qh0.zzp();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2660e4
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2660e4
    public final int zzb() {
        return this.f19749b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2660e4
    public final int zzc() {
        int i8 = this.f19750c;
        if (i8 == 8) {
            return this.f19748a.zzm();
        }
        if (i8 == 16) {
            return this.f19748a.zzq();
        }
        int i9 = this.f19751d;
        this.f19751d = i9 + 1;
        if (i9 % 2 != 0) {
            return this.f19752e & 15;
        }
        int iZzm = this.f19748a.zzm();
        this.f19752e = iZzm;
        return (iZzm & 240) >> 4;
    }
}
