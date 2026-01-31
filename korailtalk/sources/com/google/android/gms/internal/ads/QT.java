package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class QT {

    /* renamed from: a, reason: collision with root package name */
    private final int f15785a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15786b;

    /* renamed from: c, reason: collision with root package name */
    private final float f15787c;

    /* renamed from: d, reason: collision with root package name */
    private final float f15788d;

    /* renamed from: e, reason: collision with root package name */
    private final float f15789e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15790f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15791g;

    /* renamed from: h, reason: collision with root package name */
    private final int f15792h;

    /* renamed from: i, reason: collision with root package name */
    private final short[] f15793i;

    /* renamed from: j, reason: collision with root package name */
    private short[] f15794j;

    /* renamed from: k, reason: collision with root package name */
    private int f15795k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f15796l;

    /* renamed from: m, reason: collision with root package name */
    private int f15797m;

    /* renamed from: n, reason: collision with root package name */
    private short[] f15798n;

    /* renamed from: o, reason: collision with root package name */
    private int f15799o;

    /* renamed from: p, reason: collision with root package name */
    private int f15800p;

    /* renamed from: q, reason: collision with root package name */
    private int f15801q;

    /* renamed from: r, reason: collision with root package name */
    private int f15802r;

    /* renamed from: s, reason: collision with root package name */
    private int f15803s;

    /* renamed from: t, reason: collision with root package name */
    private int f15804t;

    /* renamed from: u, reason: collision with root package name */
    private int f15805u;

    /* renamed from: v, reason: collision with root package name */
    private int f15806v;

    public QT(int i8, int i9, float f8, float f9, int i10) {
        this.f15785a = i8;
        this.f15786b = i9;
        this.f15787c = f8;
        this.f15788d = f9;
        this.f15789e = i8 / i10;
        this.f15790f = i8 / 400;
        int i11 = i8 / 65;
        this.f15791g = i11;
        int i12 = i11 + i11;
        this.f15792h = i12;
        this.f15793i = new short[i12];
        int i13 = i12 * i9;
        this.f15794j = new short[i13];
        this.f15796l = new short[i13];
        this.f15798n = new short[i13];
    }

    private final int a(short[] sArr, int i8, int i9, int i10) {
        int i11 = 1;
        int i12 = 255;
        int i13 = 0;
        int i14 = 0;
        while (i9 <= i10) {
            int iAbs = 0;
            for (int i15 = 0; i15 < i9; i15++) {
                int i16 = this.f15786b * i8;
                iAbs += Math.abs(sArr[i16 + i15] - sArr[(i16 + i9) + i15]);
            }
            int i17 = iAbs * i13;
            int i18 = i11 * i9;
            if (i17 < i18) {
                i11 = iAbs;
            }
            if (i17 < i18) {
                i13 = i9;
            }
            int i19 = iAbs * i12;
            int i20 = i14 * i9;
            if (i19 > i20) {
                i14 = iAbs;
            }
            if (i19 > i20) {
                i12 = i9;
            }
            i9++;
        }
        this.f15805u = i11 / i13;
        this.f15806v = i14 / i12;
        return i13;
    }

    private final void b(short[] sArr, int i8, int i9) {
        short[] sArrF = f(this.f15796l, this.f15797m, i9);
        this.f15796l = sArrF;
        int i10 = this.f15797m;
        int i11 = this.f15786b;
        System.arraycopy(sArr, i8 * i11, sArrF, i10 * i11, i9 * i11);
        this.f15797m += i9;
    }

    private final void c(short[] sArr, int i8, int i9) {
        int i10;
        for (int i11 = 0; i11 < this.f15792h / i9; i11++) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int i14 = this.f15786b;
                i10 = i14 * i9;
                if (i12 < i10) {
                    i13 += sArr[(i14 * i8) + (i10 * i11) + i12];
                    i12++;
                }
            }
            this.f15793i[i11] = (short) (i13 / i10);
        }
    }

    private static void d(int i8, int i9, short[] sArr, int i10, short[] sArr2, int i11, short[] sArr3, int i12) {
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = (i11 * i9) + i13;
            int i15 = (i12 * i9) + i13;
            int i16 = (i10 * i9) + i13;
            for (int i17 = 0; i17 < i8; i17++) {
                sArr[i16] = (short) (((sArr2[i14] * (i8 - i17)) + (sArr3[i15] * i17)) / i8);
                i16 += i9;
                i14 += i9;
                i15 += i9;
            }
        }
    }

    private final void e() {
        int iA;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f8 = this.f15787c / this.f15788d;
        double d9 = f8;
        int i15 = this.f15797m;
        if (d9 > 1.00001d || d9 < 0.99999d) {
            int i16 = this.f15795k;
            if (i16 >= this.f15792h) {
                int i17 = 0;
                do {
                    int i18 = this.f15802r;
                    if (i18 > 0) {
                        int iMin = Math.min(this.f15792h, i18);
                        b(this.f15794j, i17, iMin);
                        this.f15802r -= iMin;
                        i17 += iMin;
                    } else {
                        short[] sArr = this.f15794j;
                        int i19 = this.f15785a;
                        int i20 = i19 > 4000 ? i19 / 4000 : 1;
                        if (this.f15786b == 1 && i20 == 1) {
                            iA = a(sArr, i17, this.f15790f, this.f15791g);
                        } else {
                            c(sArr, i17, i20);
                            int iA2 = a(this.f15793i, 0, this.f15790f / i20, this.f15791g / i20);
                            if (i20 != 1) {
                                int i21 = iA2 * i20;
                                int i22 = i20 * 4;
                                int i23 = this.f15790f;
                                int i24 = i21 - i22;
                                if (i24 >= i23) {
                                    i23 = i24;
                                }
                                int i25 = i21 + i22;
                                int i26 = this.f15791g;
                                if (i25 > i26) {
                                    i25 = i26;
                                }
                                if (this.f15786b == 1) {
                                    iA = a(sArr, i17, i23, i25);
                                } else {
                                    c(sArr, i17, 1);
                                    iA = a(this.f15793i, 0, i23, i25);
                                }
                            } else {
                                iA = iA2;
                            }
                        }
                        int i27 = this.f15805u;
                        int i28 = (i27 == 0 || (i10 = this.f15803s) == 0 || this.f15806v > i27 * 3 || i27 + i27 <= this.f15804t * 3) ? iA : i10;
                        int i29 = i17 + i28;
                        this.f15804t = i27;
                        this.f15803s = iA;
                        float f9 = i28;
                        if (d9 > 1.0d) {
                            short[] sArr2 = this.f15794j;
                            float f10 = (-1.0f) + f8;
                            if (f8 >= 2.0f) {
                                i9 = (int) (f9 / f10);
                            } else {
                                this.f15802r = (int) ((f9 * (2.0f - f8)) / f10);
                                i9 = i28;
                            }
                            short[] sArrF = f(this.f15796l, this.f15797m, i9);
                            this.f15796l = sArrF;
                            int i30 = i9;
                            d(i9, this.f15786b, sArrF, this.f15797m, sArr2, i17, sArr2, i29);
                            this.f15797m += i30;
                            i17 += i28 + i30;
                        } else {
                            int i31 = i28;
                            short[] sArr3 = this.f15794j;
                            float f11 = 1.0f - f8;
                            if (f8 < 0.5f) {
                                i8 = (int) ((f9 * f8) / f11);
                            } else {
                                this.f15802r = (int) ((f9 * ((f8 + f8) - 1.0f)) / f11);
                                i8 = i31;
                            }
                            int i32 = i31 + i8;
                            short[] sArrF2 = f(this.f15796l, this.f15797m, i32);
                            this.f15796l = sArrF2;
                            int i33 = this.f15786b;
                            System.arraycopy(sArr3, i17 * i33, sArrF2, this.f15797m * i33, i33 * i31);
                            d(i8, this.f15786b, this.f15796l, this.f15797m + i31, sArr3, i29, sArr3, i17);
                            this.f15797m += i32;
                            i17 += i8;
                        }
                    }
                } while (this.f15792h + i17 <= i16);
                int i34 = this.f15795k - i17;
                short[] sArr4 = this.f15794j;
                int i35 = this.f15786b;
                System.arraycopy(sArr4, i17 * i35, sArr4, 0, i35 * i34);
                this.f15795k = i34;
            }
        } else {
            b(this.f15794j, 0, this.f15795k);
            this.f15795k = 0;
        }
        float f12 = this.f15789e * this.f15788d;
        if (f12 == 1.0f || this.f15797m == i15) {
            return;
        }
        int i36 = this.f15785a;
        int i37 = (int) (i36 / f12);
        while (true) {
            if (i37 <= 16384 && i36 <= 16384) {
                break;
            }
            i37 /= 2;
            i36 /= 2;
        }
        int i38 = this.f15797m - i15;
        short[] sArrF3 = f(this.f15798n, this.f15799o, i38);
        this.f15798n = sArrF3;
        short[] sArr5 = this.f15796l;
        int i39 = this.f15786b;
        System.arraycopy(sArr5, i15 * i39, sArrF3, this.f15799o * i39, i39 * i38);
        this.f15797m = i15;
        this.f15799o += i38;
        int i40 = 0;
        while (true) {
            i11 = this.f15799o;
            i12 = i11 - 1;
            if (i40 >= i12) {
                break;
            }
            while (true) {
                i13 = this.f15800p + 1;
                int i41 = i13 * i37;
                i14 = this.f15801q;
                if (i41 <= i14 * i36) {
                    break;
                }
                this.f15796l = f(this.f15796l, this.f15797m, 1);
                int i42 = 0;
                while (true) {
                    int i43 = this.f15786b;
                    if (i42 < i43) {
                        short[] sArr6 = this.f15796l;
                        int i44 = this.f15797m * i43;
                        short[] sArr7 = this.f15798n;
                        int i45 = (i40 * i43) + i42;
                        short s8 = sArr7[i45];
                        short s9 = sArr7[i45 + i43];
                        int i46 = this.f15801q * i36;
                        int i47 = this.f15800p;
                        int i48 = i47 * i37;
                        int i49 = (i47 + 1) * i37;
                        int i50 = i49 - i46;
                        int i51 = i49 - i48;
                        sArr6[i44 + i42] = (short) (((s8 * i50) + ((i51 - i50) * s9)) / i51);
                        i42++;
                    }
                }
                this.f15801q++;
                this.f15797m++;
            }
            this.f15800p = i13;
            if (i13 == i36) {
                this.f15800p = 0;
                F10.zzf(i14 == i37);
                this.f15801q = 0;
            }
            i40++;
        }
        if (i12 != 0) {
            short[] sArr8 = this.f15798n;
            int i52 = this.f15786b;
            System.arraycopy(sArr8, i12 * i52, sArr8, 0, (i11 - i12) * i52);
            this.f15799o -= i12;
        }
    }

    private final short[] f(short[] sArr, int i8, int i9) {
        int length = sArr.length;
        int i10 = this.f15786b;
        int i11 = length / i10;
        return i8 + i9 <= i11 ? sArr : Arrays.copyOf(sArr, (((i11 * 3) / 2) + i9) * i10);
    }

    public final int zza() {
        int i8 = this.f15797m * this.f15786b;
        return i8 + i8;
    }

    public final int zzb() {
        int i8 = this.f15795k * this.f15786b;
        return i8 + i8;
    }

    public final void zzc() {
        this.f15795k = 0;
        this.f15797m = 0;
        this.f15799o = 0;
        this.f15800p = 0;
        this.f15801q = 0;
        this.f15802r = 0;
        this.f15803s = 0;
        this.f15804t = 0;
        this.f15805u = 0;
        this.f15806v = 0;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f15786b, this.f15797m);
        shortBuffer.put(this.f15796l, 0, this.f15786b * iMin);
        int i8 = this.f15797m - iMin;
        this.f15797m = i8;
        int i9 = this.f15786b;
        short[] sArr = this.f15796l;
        System.arraycopy(sArr, iMin * i9, sArr, 0, i8 * i9);
    }

    public final void zze() {
        int i8;
        int i9 = this.f15795k;
        int i10 = this.f15797m;
        float f8 = this.f15799o;
        float f9 = this.f15787c;
        float f10 = this.f15789e;
        float f11 = this.f15788d;
        int i11 = i10 + ((int) ((((i9 / (f9 / f11)) + f8) / (f10 * f11)) + 0.5f));
        int i12 = this.f15792h;
        this.f15794j = f(this.f15794j, i9, i12 + i12 + i9);
        int i13 = 0;
        while (true) {
            int i14 = this.f15792h;
            int i15 = this.f15786b;
            i8 = i14 + i14;
            if (i13 >= i8 * i15) {
                break;
            }
            this.f15794j[(i15 * i9) + i13] = 0;
            i13++;
        }
        this.f15795k += i8;
        e();
        if (this.f15797m > i11) {
            this.f15797m = i11;
        }
        this.f15795k = 0;
        this.f15802r = 0;
        this.f15799o = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i8 = this.f15786b;
        int i9 = iRemaining / i8;
        int i10 = i8 * i9;
        short[] sArrF = f(this.f15794j, this.f15795k, i9);
        this.f15794j = sArrF;
        shortBuffer.get(sArrF, this.f15795k * this.f15786b, (i10 + i10) / 2);
        this.f15795k += i9;
        e();
    }
}
