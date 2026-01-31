package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.zt0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5148zt0 {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: a, reason: collision with root package name */
    private static final Object f24213a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static int[] f24214b = new int[10];

    public static int zza(byte[] bArr, int i8, int i9, boolean[] zArr) {
        int i10 = i9 - i8;
        F10.zzf(i10 >= 0);
        if (i10 == 0) {
            return i9;
        }
        if (zArr[0]) {
            zzf(zArr);
            return i8 - 3;
        }
        if (i10 > 1 && zArr[1] && bArr[i8] == 1) {
            zzf(zArr);
            return i8 - 2;
        }
        if (i10 > 2 && zArr[2] && bArr[i8] == 0 && bArr[i8 + 1] == 1) {
            zzf(zArr);
            return i8 - 1;
        }
        int i11 = i9 - 1;
        int i12 = i8 + 2;
        while (i12 < i11) {
            byte b9 = bArr[i12];
            if ((b9 & 254) == 0) {
                int i13 = i12 - 2;
                if (bArr[i13] == 0 && bArr[i12 - 1] == 0 && b9 == 1) {
                    zzf(zArr);
                    return i13;
                }
                i12 = i13;
            }
            i12 += 3;
        }
        zArr[0] = i10 <= 2 ? !(i10 != 2 ? !(zArr[1] && bArr[i11] == 1) : !(zArr[2] && bArr[i9 + (-2)] == 0 && bArr[i11] == 1)) : bArr[i9 + (-3)] == 0 && bArr[i9 + (-2)] == 0 && bArr[i11] == 1;
        zArr[1] = i10 <= 1 ? zArr[2] && bArr[i11] == 0 : bArr[i9 + (-2)] == 0 && bArr[i11] == 0;
        zArr[2] = bArr[i11] == 0;
        return i9;
    }

    public static int zzb(byte[] bArr, int i8) {
        int i9;
        synchronized (f24213a) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < i8) {
                while (true) {
                    try {
                        if (i10 >= i8 - 2) {
                            i10 = i8;
                            break;
                        }
                        int i12 = i10 + 1;
                        if (bArr[i10] == 0 && bArr[i12] == 0 && bArr[i10 + 2] == 3) {
                            break;
                        }
                        i10 = i12;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i10 < i8) {
                    int[] iArr = f24214b;
                    int length = iArr.length;
                    if (length <= i11) {
                        f24214b = Arrays.copyOf(iArr, length + length);
                    }
                    f24214b[i11] = i10;
                    i10 += 3;
                    i11++;
                }
            }
            i9 = i8 - i11;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                int i16 = f24214b[i15] - i13;
                System.arraycopy(bArr, i13, bArr, i14, i16);
                int i17 = i14 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i14 = i17 + 2;
                bArr[i18] = 0;
                i13 += i16 + 3;
            }
            System.arraycopy(bArr, i13, bArr, i14, i9 - i14);
        }
        return i9;
    }

    public static Wr0 zzc(byte[] bArr, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int iZzb;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        C2297au0 c2297au0 = new C2297au0(bArr, i8, i9);
        int i18 = 4;
        c2297au0.zze(4);
        int iZza = c2297au0.zza(3);
        c2297au0.zzd();
        int iZza2 = c2297au0.zza(2);
        boolean zZzf = c2297au0.zzf();
        int iZza3 = c2297au0.zza(5);
        int i19 = 0;
        for (int i20 = 0; i20 < 32; i20++) {
            if (c2297au0.zzf()) {
                i19 |= 1 << i20;
            }
        }
        int i21 = 6;
        int[] iArr2 = new int[6];
        for (int i22 = 0; i22 < 6; i22++) {
            iArr2[i22] = c2297au0.zza(8);
        }
        int iZza4 = c2297au0.zza(8);
        int i23 = 0;
        for (int i24 = 0; i24 < iZza; i24++) {
            if (c2297au0.zzf()) {
                i23 += 89;
            }
            if (c2297au0.zzf()) {
                i23 += 8;
            }
        }
        c2297au0.zze(i23);
        if (iZza > 0) {
            int i25 = 8 - iZza;
            c2297au0.zze(i25 + i25);
        }
        int iZzc = c2297au0.zzc();
        int iZzc2 = c2297au0.zzc();
        if (iZzc2 == 3) {
            c2297au0.zzd();
            iZzc2 = 3;
        }
        int iZzc3 = c2297au0.zzc();
        int iZzc4 = c2297au0.zzc();
        if (c2297au0.zzf()) {
            int iZzc5 = c2297au0.zzc();
            int iZzc6 = c2297au0.zzc();
            int iZzc7 = c2297au0.zzc();
            int iZzc8 = c2297au0.zzc();
            if (iZzc2 == 1) {
                i17 = 2;
            } else if (iZzc2 == 2) {
                iZzc2 = 2;
                i17 = 2;
            } else {
                i17 = 1;
            }
            iZzc3 -= i17 * (iZzc5 + iZzc6);
            iZzc4 -= (iZzc2 == 1 ? 2 : 1) * (iZzc7 + iZzc8);
        }
        int i26 = iZzc3;
        int i27 = iZzc2;
        int i28 = iZzc4;
        int iZzc9 = c2297au0.zzc();
        int iZzc10 = c2297au0.zzc();
        int iZzc11 = c2297au0.zzc();
        for (int i29 = true != c2297au0.zzf() ? iZza : 0; i29 <= iZza; i29++) {
            c2297au0.zzc();
            c2297au0.zzc();
            c2297au0.zzc();
        }
        c2297au0.zzc();
        c2297au0.zzc();
        c2297au0.zzc();
        c2297au0.zzc();
        c2297au0.zzc();
        c2297au0.zzc();
        if (c2297au0.zzf() && c2297au0.zzf()) {
            int i30 = 0;
            while (i30 < i18) {
                int i31 = 0;
                while (i31 < i21) {
                    if (c2297au0.zzf()) {
                        int iMin = Math.min(64, 1 << ((i30 + i30) + 4));
                        if (i30 > 1) {
                            c2297au0.zzb();
                        }
                        for (int i32 = 0; i32 < iMin; i32++) {
                            c2297au0.zzb();
                        }
                    } else {
                        c2297au0.zzc();
                    }
                    i31 += i30 == 3 ? 3 : 1;
                    i21 = 6;
                }
                i30++;
                i18 = 4;
                i21 = 6;
            }
        }
        c2297au0.zze(2);
        if (c2297au0.zzf()) {
            c2297au0.zze(8);
            c2297au0.zzc();
            c2297au0.zzc();
            c2297au0.zzd();
        }
        int iZzc12 = c2297au0.zzc();
        int i33 = 0;
        int[] iArr3 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i34 = -1;
        int i35 = -1;
        int i36 = -1;
        while (i33 < iZzc12) {
            if (i33 == 0 || !c2297au0.zzf()) {
                i13 = iZzc12;
                i14 = i19;
                i15 = i27;
                iArr = iArr2;
                int iZzc13 = c2297au0.zzc();
                int iZzc14 = c2297au0.zzc();
                int[] iArr4 = new int[iZzc13];
                int i37 = 0;
                while (i37 < iZzc13) {
                    iArr4[i37] = (i37 > 0 ? iArr4[i37 - 1] : 0) - (c2297au0.zzc() + 1);
                    c2297au0.zzd();
                    i37++;
                }
                int[] iArr5 = new int[iZzc14];
                int i38 = 0;
                while (i38 < iZzc14) {
                    iArr5[i38] = (i38 > 0 ? iArr5[i38 - 1] : 0) + c2297au0.zzc() + 1;
                    c2297au0.zzd();
                    i38++;
                }
                i36 = iZzc14;
                iArrCopyOf = iArr5;
                i35 = iZzc13;
                iArr3 = iArr4;
            } else {
                int i39 = i35 + i36;
                boolean zZzf2 = c2297au0.zzf();
                int iZzc15 = c2297au0.zzc() + 1;
                int i40 = 1 - ((zZzf2 ? 1 : 0) + (zZzf2 ? 1 : 0));
                int i41 = i39 + 1;
                i13 = iZzc12;
                boolean[] zArr = new boolean[i41];
                iArr = iArr2;
                for (int i42 = 0; i42 <= i39; i42++) {
                    if (c2297au0.zzf()) {
                        zArr[i42] = true;
                    } else {
                        zArr[i42] = c2297au0.zzf();
                    }
                }
                int i43 = i36 - 1;
                int[] iArr6 = new int[i41];
                int[] iArr7 = new int[i41];
                int i44 = 0;
                while (true) {
                    i16 = i40 * iZzc15;
                    if (i43 < 0) {
                        break;
                    }
                    int i45 = iArrCopyOf[i43] + i16;
                    if (i45 < 0 && zArr[i35 + i43]) {
                        iArr6[i44] = i45;
                        i44++;
                    }
                    i43--;
                }
                if (i16 < 0 && zArr[i39]) {
                    iArr6[i44] = i16;
                    i44++;
                }
                i14 = i19;
                i15 = i27;
                int i46 = i44;
                for (int i47 = 0; i47 < i35; i47++) {
                    int i48 = iArr3[i47] + i16;
                    if (i48 < 0 && zArr[i47]) {
                        iArr6[i46] = i48;
                        i46++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr6, i46);
                int i49 = 0;
                for (int i50 = i35 - 1; i50 >= 0; i50--) {
                    int i51 = iArr3[i50] + i16;
                    if (i51 > 0 && zArr[i50]) {
                        iArr7[i49] = i51;
                        i49++;
                    }
                }
                if (i16 > 0 && zArr[i39]) {
                    iArr7[i49] = i16;
                    i49++;
                }
                int i52 = i49;
                for (int i53 = 0; i53 < i36; i53++) {
                    int i54 = iArrCopyOf[i53] + i16;
                    if (i54 > 0 && zArr[i35 + i53]) {
                        iArr7[i52] = i54;
                        i52++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr7, i52);
                i36 = i52;
                iArr3 = iArrCopyOf2;
                i35 = i46;
            }
            i33++;
            i27 = i15;
            i19 = i14;
            iZzc12 = i13;
            iArr2 = iArr;
        }
        int i55 = i19;
        int i56 = i27;
        int[] iArr8 = iArr2;
        if (c2297au0.zzf()) {
            int iZzc16 = c2297au0.zzc();
            for (int i57 = 0; i57 < iZzc16; i57++) {
                c2297au0.zze(iZzc11 + 5);
            }
        }
        c2297au0.zze(2);
        float f8 = 1.0f;
        if (c2297au0.zzf()) {
            if (c2297au0.zzf()) {
                int iZza5 = c2297au0.zza(8);
                if (iZza5 == 255) {
                    int iZza6 = c2297au0.zza(16);
                    int iZza7 = c2297au0.zza(16);
                    if (iZza6 != 0 && iZza7 != 0) {
                        f8 = iZza6 / iZza7;
                    }
                } else if (iZza5 < 17) {
                    f8 = zzb[iZza5];
                } else {
                    AbstractC2834fc0.zzf("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iZza5);
                }
            }
            if (c2297au0.zzf()) {
                c2297au0.zzd();
            }
            if (c2297au0.zzf()) {
                c2297au0.zze(3);
                int i58 = true != c2297au0.zzf() ? 2 : 1;
                if (c2297au0.zzf()) {
                    int iZza8 = c2297au0.zza(8);
                    int iZza9 = c2297au0.zza(8);
                    c2297au0.zze(8);
                    int iZza10 = C3724nL0.zza(iZza8);
                    iZzb = C3724nL0.zzb(iZza9);
                    i11 = iZza10;
                } else {
                    i11 = -1;
                    iZzb = -1;
                }
                i34 = i58;
            } else {
                i11 = -1;
                iZzb = -1;
            }
            if (c2297au0.zzf()) {
                c2297au0.zzc();
                c2297au0.zzc();
            }
            c2297au0.zzd();
            if (c2297au0.zzf()) {
                i28 += i28;
            }
            i12 = iZzb;
            i10 = i28;
        } else {
            i10 = i28;
            i11 = -1;
            i12 = -1;
        }
        return new Wr0(iZza2, zZzf, iZza3, i55, i56, iZzc9, iZzc10, iArr8, iZza4, iZzc, i26, i10, f8, i11, i34, i12);
    }

    public static C4918xs0 zzd(byte[] bArr, int i8, int i9) {
        C2297au0 c2297au0 = new C2297au0(bArr, 4, i9);
        int iZzc = c2297au0.zzc();
        int iZzc2 = c2297au0.zzc();
        c2297au0.zzd();
        return new C4918xs0(iZzc, iZzc2, c2297au0.zzf());
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.Ys0 zze(byte[] r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC5148zt0.zze(byte[], int, int):com.google.android.gms.internal.ads.Ys0");
    }

    public static void zzf(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
