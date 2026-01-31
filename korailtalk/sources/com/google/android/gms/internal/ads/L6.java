package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class L6 implements InterfaceC3126i7 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4490u6 f14227a;

    /* renamed from: b, reason: collision with root package name */
    private final C1755Pg0 f14228b = new C1755Pg0(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    private int f14229c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f14230d;

    /* renamed from: e, reason: collision with root package name */
    private C2132Yk0 f14231e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14232f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14233g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14234h;

    /* renamed from: i, reason: collision with root package name */
    private int f14235i;

    /* renamed from: j, reason: collision with root package name */
    private int f14236j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14237k;

    public L6(InterfaceC4490u6 interfaceC4490u6) {
        this.f14227a = interfaceC4490u6;
    }

    private final void a(int i8) {
        this.f14229c = i8;
        this.f14230d = 0;
    }

    private final boolean b(C4099qh0 c4099qh0, byte[] bArr, int i8) {
        int iMin = Math.min(c4099qh0.zzb(), i8 - this.f14230d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c4099qh0.zzL(iMin);
        } else {
            c4099qh0.zzG(bArr, this.f14230d, iMin);
        }
        int i9 = this.f14230d + iMin;
        this.f14230d = i9;
        return i9 == i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3126i7
    public final void zza(C4099qh0 c4099qh0, int i8) {
        int i9;
        long jZzb;
        int i10;
        F10.zzb(this.f14231e);
        int i11 = -1;
        int i12 = 2;
        int i13 = 1;
        if ((i8 & 1) != 0) {
            int i14 = this.f14229c;
            if (i14 != 0 && i14 != 1) {
                if (i14 != 2) {
                    int i15 = this.f14236j;
                    if (i15 != -1) {
                        AbstractC2834fc0.zzf("PesReader", "Unexpected start indicator: expected " + i15 + " more bytes");
                    }
                    this.f14227a.zzc();
                } else {
                    AbstractC2834fc0.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            a(1);
        }
        int i16 = i8;
        while (c4099qh0.zzb() > 0) {
            int i17 = this.f14229c;
            if (i17 != 0) {
                if (i17 != i13) {
                    if (i17 != i12) {
                        int iZzb = c4099qh0.zzb();
                        int i18 = this.f14236j;
                        int i19 = i18 != i11 ? iZzb - i18 : 0;
                        if (i19 > 0) {
                            iZzb -= i19;
                            c4099qh0.zzJ(c4099qh0.zzd() + iZzb);
                        }
                        this.f14227a.zza(c4099qh0);
                        int i20 = this.f14236j;
                        if (i20 != i11) {
                            int i21 = i20 - iZzb;
                            this.f14236j = i21;
                            if (i21 == 0) {
                                this.f14227a.zzc();
                                a(i13);
                            }
                        }
                    } else {
                        if (b(c4099qh0, this.f14228b.zza, Math.min(10, this.f14235i)) && b(c4099qh0, null, this.f14235i)) {
                            this.f14228b.zzk(0);
                            if (this.f14232f) {
                                this.f14228b.zzm(4);
                                long jZzd = this.f14228b.zzd(3);
                                this.f14228b.zzm(i13);
                                int iZzd = this.f14228b.zzd(15) << 15;
                                this.f14228b.zzm(i13);
                                long jZzd2 = this.f14228b.zzd(15);
                                this.f14228b.zzm(i13);
                                if (this.f14234h || !this.f14233g) {
                                    i10 = iZzd;
                                } else {
                                    this.f14228b.zzm(4);
                                    this.f14228b.zzm(i13);
                                    int iZzd2 = this.f14228b.zzd(15) << 15;
                                    this.f14228b.zzm(i13);
                                    long jZzd3 = this.f14228b.zzd(15);
                                    this.f14228b.zzm(i13);
                                    i10 = iZzd;
                                    this.f14231e.zzb((this.f14228b.zzd(3) << 30) | iZzd2 | jZzd3);
                                    this.f14234h = true;
                                }
                                jZzb = this.f14231e.zzb((jZzd << 30) | i10 | jZzd2);
                            } else {
                                jZzb = -9223372036854775807L;
                            }
                            i16 |= true != this.f14237k ? 0 : 4;
                            this.f14227a.zzd(jZzb, i16);
                            a(3);
                            i11 = -1;
                            i12 = 2;
                            i13 = 1;
                        }
                    }
                    i9 = i12;
                } else if (b(c4099qh0, this.f14228b.zza, 9)) {
                    int i22 = 0;
                    this.f14228b.zzk(0);
                    int iZzd3 = this.f14228b.zzd(24);
                    i13 = 1;
                    if (iZzd3 != 1) {
                        AbstractC2834fc0.zzf("PesReader", "Unexpected start code prefix: " + iZzd3);
                        i11 = -1;
                        this.f14236j = -1;
                        i9 = 2;
                    } else {
                        this.f14228b.zzm(8);
                        C1755Pg0 c1755Pg0 = this.f14228b;
                        int iZzd4 = c1755Pg0.zzd(16);
                        c1755Pg0.zzm(5);
                        this.f14237k = this.f14228b.zzo();
                        i9 = 2;
                        this.f14228b.zzm(2);
                        this.f14232f = this.f14228b.zzo();
                        this.f14233g = this.f14228b.zzo();
                        this.f14228b.zzm(6);
                        int iZzd5 = this.f14228b.zzd(8);
                        this.f14235i = iZzd5;
                        if (iZzd4 == 0) {
                            this.f14236j = -1;
                            i11 = -1;
                        } else {
                            int i23 = (iZzd4 - 3) - iZzd5;
                            this.f14236j = i23;
                            if (i23 < 0) {
                                AbstractC2834fc0.zzf("PesReader", "Found negative packet payload size: " + i23);
                                i11 = -1;
                                this.f14236j = -1;
                            } else {
                                i11 = -1;
                            }
                        }
                        i22 = 2;
                    }
                    a(i22);
                } else {
                    i11 = -1;
                    i13 = 1;
                    i9 = 2;
                }
            } else {
                i9 = i12;
                c4099qh0.zzL(c4099qh0.zzb());
            }
            i12 = i9;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3126i7
    public final void zzb(C2132Yk0 c2132Yk0, InterfaceC2769f1 interfaceC2769f1, C3011h7 c3011h7) {
        this.f14231e = c2132Yk0;
        this.f14227a.zzb(interfaceC2769f1, c3011h7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3126i7
    public final void zzc() {
        this.f14229c = 0;
        this.f14230d = 0;
        this.f14234h = false;
        this.f14227a.zze();
    }
}
