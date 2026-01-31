package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class P6 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f15208c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15209d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15210e;

    /* renamed from: a, reason: collision with root package name */
    private final C2132Yk0 f15206a = new C2132Yk0(0);

    /* renamed from: f, reason: collision with root package name */
    private long f15211f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f15212g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f15213h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final C4099qh0 f15207b = new C4099qh0();

    P6() {
    }

    private final int a(InterfaceC2540d1 interfaceC2540d1) {
        byte[] bArr = AbstractC2281am0.zzf;
        int length = bArr.length;
        this.f15207b.zzI(bArr, 0);
        this.f15208c = true;
        interfaceC2540d1.zzj();
        return 0;
    }

    private static final int b(byte[] bArr, int i8) {
        return (bArr[i8 + 3] & 255) | ((bArr[i8] & 255) << 24) | ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8 + 2] & 255) << 8);
    }

    public static long zzc(C4099qh0 c4099qh0) {
        int iZzd = c4099qh0.zzd();
        if (c4099qh0.zzb() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c4099qh0.zzG(bArr, 0, 9);
        c4099qh0.zzK(iZzd);
        byte b9 = bArr[0];
        if ((b9 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b10 = bArr[2];
        if ((b10 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b11 = bArr[4];
        if ((b11 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j8 = b9;
        long j9 = b10;
        long j10 = (248 & j9) >> 3;
        long j11 = (j9 & 3) << 13;
        return j11 | ((bArr[1] & 255) << 20) | ((j8 & 3) << 28) | (((j8 & 56) >> 3) << 30) | (j10 << 15) | ((bArr[3] & 255) << 5) | ((b11 & 248) >> 3);
    }

    public final int zza(InterfaceC2540d1 interfaceC2540d1, C5050z1 c5050z1) {
        long j8 = -9223372036854775807L;
        if (!this.f15210e) {
            long jZzd = interfaceC2540d1.zzd();
            int iMin = (int) Math.min(20000L, jZzd);
            long j9 = jZzd - iMin;
            if (interfaceC2540d1.zzf() != j9) {
                c5050z1.zza = j9;
                return 1;
            }
            this.f15207b.zzH(iMin);
            interfaceC2540d1.zzj();
            ((Q0) interfaceC2540d1).zzm(this.f15207b.zzM(), 0, iMin, false);
            C4099qh0 c4099qh0 = this.f15207b;
            int iZzd = c4099qh0.zzd();
            int iZze = c4099qh0.zze() - 4;
            while (true) {
                if (iZze < iZzd) {
                    break;
                }
                if (b(c4099qh0.zzM(), iZze) == 442) {
                    c4099qh0.zzK(iZze + 4);
                    long jZzc = zzc(c4099qh0);
                    if (jZzc != -9223372036854775807L) {
                        j8 = jZzc;
                        break;
                    }
                }
                iZze--;
            }
            this.f15212g = j8;
            this.f15210e = true;
        } else {
            if (this.f15212g == -9223372036854775807L) {
                a(interfaceC2540d1);
                return 0;
            }
            if (this.f15209d) {
                long j10 = this.f15211f;
                if (j10 == -9223372036854775807L) {
                    a(interfaceC2540d1);
                    return 0;
                }
                C2132Yk0 c2132Yk0 = this.f15206a;
                this.f15213h = c2132Yk0.zzc(this.f15212g) - c2132Yk0.zzb(j10);
                a(interfaceC2540d1);
                return 0;
            }
            int iMin2 = (int) Math.min(20000L, interfaceC2540d1.zzd());
            if (interfaceC2540d1.zzf() != 0) {
                c5050z1.zza = 0L;
                return 1;
            }
            this.f15207b.zzH(iMin2);
            interfaceC2540d1.zzj();
            ((Q0) interfaceC2540d1).zzm(this.f15207b.zzM(), 0, iMin2, false);
            C4099qh0 c4099qh02 = this.f15207b;
            int iZzd2 = c4099qh02.zzd();
            int iZze2 = c4099qh02.zze();
            while (true) {
                if (iZzd2 >= iZze2 - 3) {
                    break;
                }
                if (b(c4099qh02.zzM(), iZzd2) == 442) {
                    c4099qh02.zzK(iZzd2 + 4);
                    long jZzc2 = zzc(c4099qh02);
                    if (jZzc2 != -9223372036854775807L) {
                        j8 = jZzc2;
                        break;
                    }
                }
                iZzd2++;
            }
            this.f15211f = j8;
            this.f15209d = true;
        }
        return 0;
    }

    public final long zzb() {
        return this.f15213h;
    }

    public final C2132Yk0 zzd() {
        return this.f15206a;
    }

    public final boolean zze() {
        return this.f15208c;
    }
}
