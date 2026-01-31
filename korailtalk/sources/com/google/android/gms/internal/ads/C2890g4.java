package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2890g4 implements InterfaceC2660e4 {

    /* renamed from: a, reason: collision with root package name */
    private final int f19291a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19292b;

    /* renamed from: c, reason: collision with root package name */
    private final C4099qh0 f19293c;

    public C2890g4(C2202a4 c2202a4, Q5 q52) {
        C4099qh0 c4099qh0 = c2202a4.zza;
        this.f19293c = c4099qh0;
        c4099qh0.zzK(12);
        int iZzp = c4099qh0.zzp();
        if ("audio/raw".equals(q52.zzn)) {
            int iZzm = AbstractC2281am0.zzm(q52.zzC, q52.zzA);
            if (iZzp == 0 || iZzp % iZzm != 0) {
                AbstractC2834fc0.zzf("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iZzm + ", stsz sample size: " + iZzp);
                iZzp = iZzm;
            }
        }
        this.f19291a = iZzp == 0 ? -1 : iZzp;
        this.f19292b = c4099qh0.zzp();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2660e4
    public final int zza() {
        return this.f19291a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2660e4
    public final int zzb() {
        return this.f19292b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2660e4
    public final int zzc() {
        int i8 = this.f19291a;
        return i8 == -1 ? this.f19293c.zzp() : i8;
    }
}
