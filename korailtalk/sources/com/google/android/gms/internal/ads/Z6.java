package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class Z6 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f17491c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f17492d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17493e;

    /* renamed from: a, reason: collision with root package name */
    private final C2132Yk0 f17489a = new C2132Yk0(0);

    /* renamed from: f, reason: collision with root package name */
    private long f17494f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f17495g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f17496h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final C4099qh0 f17490b = new C4099qh0();

    Z6(int i8) {
    }

    private final int a(InterfaceC2540d1 interfaceC2540d1) {
        byte[] bArr = AbstractC2281am0.zzf;
        int length = bArr.length;
        this.f17490b.zzI(bArr, 0);
        this.f17491c = true;
        interfaceC2540d1.zzj();
        return 0;
    }

    public final int zza(InterfaceC2540d1 interfaceC2540d1, C5050z1 c5050z1, int i8) {
        if (i8 <= 0) {
            a(interfaceC2540d1);
            return 0;
        }
        long j8 = -9223372036854775807L;
        if (!this.f17493e) {
            long jZzd = interfaceC2540d1.zzd();
            int iMin = (int) Math.min(112800L, jZzd);
            long j9 = jZzd - iMin;
            if (interfaceC2540d1.zzf() == j9) {
                this.f17490b.zzH(iMin);
                interfaceC2540d1.zzj();
                ((Q0) interfaceC2540d1).zzm(this.f17490b.zzM(), 0, iMin, false);
                C4099qh0 c4099qh0 = this.f17490b;
                int iZzd = c4099qh0.zzd();
                int iZze = c4099qh0.zze();
                int i9 = iZze - 188;
                while (true) {
                    if (i9 < iZzd) {
                        break;
                    }
                    byte[] bArrZzM = c4099qh0.zzM();
                    int i10 = -4;
                    int i11 = 0;
                    while (true) {
                        if (i10 > 4) {
                            break;
                        }
                        int i12 = (i10 * 188) + i9;
                        if (i12 < iZzd || i12 >= iZze || bArrZzM[i12] != 71) {
                            i11 = 0;
                        } else {
                            i11++;
                            if (i11 == 5) {
                                long jZzb = AbstractC3239j7.zzb(c4099qh0, i9, i8);
                                if (jZzb != -9223372036854775807L) {
                                    j8 = jZzb;
                                    break;
                                }
                            }
                        }
                        i10++;
                    }
                    i9--;
                }
                this.f17495g = j8;
                this.f17493e = true;
                return 0;
            }
            c5050z1.zza = j9;
        } else {
            if (this.f17495g == -9223372036854775807L) {
                a(interfaceC2540d1);
                return 0;
            }
            if (this.f17492d) {
                long j10 = this.f17494f;
                if (j10 == -9223372036854775807L) {
                    a(interfaceC2540d1);
                    return 0;
                }
                C2132Yk0 c2132Yk0 = this.f17489a;
                this.f17496h = c2132Yk0.zzc(this.f17495g) - c2132Yk0.zzb(j10);
                a(interfaceC2540d1);
                return 0;
            }
            int iMin2 = (int) Math.min(112800L, interfaceC2540d1.zzd());
            if (interfaceC2540d1.zzf() == 0) {
                this.f17490b.zzH(iMin2);
                interfaceC2540d1.zzj();
                ((Q0) interfaceC2540d1).zzm(this.f17490b.zzM(), 0, iMin2, false);
                C4099qh0 c4099qh02 = this.f17490b;
                int iZzd2 = c4099qh02.zzd();
                int iZze2 = c4099qh02.zze();
                while (true) {
                    if (iZzd2 >= iZze2) {
                        break;
                    }
                    if (c4099qh02.zzM()[iZzd2] == 71) {
                        long jZzb2 = AbstractC3239j7.zzb(c4099qh02, iZzd2, i8);
                        if (jZzb2 != -9223372036854775807L) {
                            j8 = jZzb2;
                            break;
                        }
                    }
                    iZzd2++;
                }
                this.f17494f = j8;
                this.f17492d = true;
                return 0;
            }
            c5050z1.zza = 0L;
        }
        return 1;
    }

    public final long zzb() {
        return this.f17496h;
    }

    public final C2132Yk0 zzc() {
        return this.f17489a;
    }

    public final boolean zzd() {
        return this.f17491c;
    }
}
