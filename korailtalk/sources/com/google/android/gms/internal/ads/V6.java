package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class V6 implements InterfaceC3126i7 {

    /* renamed from: a, reason: collision with root package name */
    private final U6 f16772a;

    /* renamed from: b, reason: collision with root package name */
    private final C4099qh0 f16773b = new C4099qh0(32);

    /* renamed from: c, reason: collision with root package name */
    private int f16774c;

    /* renamed from: d, reason: collision with root package name */
    private int f16775d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16776e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16777f;

    public V6(U6 u62) {
        this.f16772a = u62;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3126i7
    public final void zza(C4099qh0 c4099qh0, int i8) {
        int i9 = i8 & 1;
        int iZzd = i9 != 0 ? c4099qh0.zzd() + c4099qh0.zzm() : -1;
        if (this.f16777f) {
            if (i9 == 0) {
                return;
            }
            this.f16777f = false;
            c4099qh0.zzK(iZzd);
            this.f16775d = 0;
        }
        while (c4099qh0.zzb() > 0) {
            int i10 = this.f16775d;
            if (i10 < 3) {
                if (i10 == 0) {
                    int iZzm = c4099qh0.zzm();
                    c4099qh0.zzK(c4099qh0.zzd() - 1);
                    if (iZzm == 255) {
                        this.f16777f = true;
                        return;
                    }
                }
                int iMin = Math.min(c4099qh0.zzb(), 3 - this.f16775d);
                c4099qh0.zzG(this.f16773b.zzM(), this.f16775d, iMin);
                int i11 = this.f16775d + iMin;
                this.f16775d = i11;
                if (i11 == 3) {
                    this.f16773b.zzK(0);
                    this.f16773b.zzJ(3);
                    this.f16773b.zzL(1);
                    C4099qh0 c4099qh02 = this.f16773b;
                    int iZzm2 = c4099qh02.zzm();
                    boolean z8 = (iZzm2 & 128) != 0;
                    int iZzm3 = c4099qh02.zzm();
                    this.f16776e = z8;
                    this.f16774c = (iZzm3 | ((iZzm2 & 15) << 8)) + 3;
                    int iZzc = this.f16773b.zzc();
                    int i12 = this.f16774c;
                    if (iZzc < i12) {
                        int iZzc2 = this.f16773b.zzc();
                        this.f16773b.zzE(Math.min(4098, Math.max(i12, iZzc2 + iZzc2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c4099qh0.zzb(), this.f16774c - i10);
                c4099qh0.zzG(this.f16773b.zzM(), this.f16775d, iMin2);
                int i13 = this.f16775d + iMin2;
                this.f16775d = i13;
                int i14 = this.f16774c;
                if (i13 != i14) {
                    continue;
                } else {
                    if (!this.f16776e) {
                        this.f16773b.zzJ(i14);
                    } else {
                        if (AbstractC2281am0.zze(this.f16773b.zzM(), 0, i14, -1) != 0) {
                            this.f16777f = true;
                            return;
                        }
                        this.f16773b.zzJ(this.f16774c - 4);
                    }
                    this.f16773b.zzK(0);
                    this.f16772a.zza(this.f16773b);
                    this.f16775d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3126i7
    public final void zzb(C2132Yk0 c2132Yk0, InterfaceC2769f1 interfaceC2769f1, C3011h7 c3011h7) {
        this.f16772a.zzb(c2132Yk0, interfaceC2769f1, c3011h7);
        this.f16777f = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3126i7
    public final void zzc() {
        this.f16777f = true;
    }
}
