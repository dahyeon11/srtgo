package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class Z0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f17472a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f17473b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f17474c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f17475d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f17476e = {5, 8, 10, 12};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f17477f = {6, 9, 12, 15};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f17478g = {2, 4, 6, 8};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f17479h = {9, 11, 13, 16};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f17480i = {5, 8, 10, 12};
    public static final /* synthetic */ int zza = 0;

    private static int a(C1755Pg0 c1755Pg0, int[] iArr, boolean z8) {
        int i8 = 0;
        for (int i9 = 0; i9 < 3 && c1755Pg0.zzo(); i9++) {
            i8++;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            i10 += 1 << iArr[i11];
        }
        return i10 + c1755Pg0.zzd(iArr[i8]);
    }

    private static C1755Pg0 b(byte[] bArr) {
        byte b9 = bArr[0];
        if (b9 == 127 || b9 == 100 || b9 == 64 || b9 == 113) {
            return new C1755Pg0(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b10 = bArrCopyOf[0];
        if (b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24) {
            for (int i8 = 0; i8 < bArrCopyOf.length - 1; i8 += 2) {
                byte b11 = bArrCopyOf[i8];
                int i9 = i8 + 1;
                bArrCopyOf[i8] = bArrCopyOf[i9];
                bArrCopyOf[i9] = b11;
            }
        }
        int length = bArrCopyOf.length;
        C1755Pg0 c1755Pg0 = new C1755Pg0(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            C1755Pg0 c1755Pg02 = new C1755Pg0(bArrCopyOf, length);
            while (c1755Pg02.zza() >= 16) {
                c1755Pg02.zzm(2);
                c1755Pg0.zzf(c1755Pg02.zzd(14), 14);
            }
        }
        c1755Pg0.zzj(bArrCopyOf, bArrCopyOf.length);
        return c1755Pg0;
    }

    public static int zza(byte[] bArr) {
        C1755Pg0 c1755Pg0B = b(bArr);
        c1755Pg0B.zzm(42);
        return c1755Pg0B.zzd(true != c1755Pg0B.zzo() ? 8 : 12) + 1;
    }

    public static int zzb(byte[] bArr) {
        C1755Pg0 c1755Pg0B = b(bArr);
        c1755Pg0B.zzm(32);
        return a(c1755Pg0B, f17480i, true) + 1;
    }

    public static Q5 zzc(byte[] bArr, String str, String str2, int i8, C3114i1 c3114i1) {
        C1755Pg0 c1755Pg0B = b(bArr);
        c1755Pg0B.zzm(60);
        int i9 = f17472a[c1755Pg0B.zzd(6)];
        int i10 = f17473b[c1755Pg0B.zzd(4)];
        int iZzd = c1755Pg0B.zzd(5);
        int i11 = iZzd >= 29 ? -1 : (f17474c[iZzd] * 1000) / 2;
        c1755Pg0B.zzm(10);
        int i12 = i9 + (c1755Pg0B.zzd(2) > 0 ? 1 : 0);
        O4 o42 = new O4();
        o42.zzK(str);
        o42.zzX("audio/vnd.dts");
        o42.zzx(i11);
        o42.zzy(i12);
        o42.zzY(i10);
        o42.zzE(null);
        o42.zzO(str2);
        o42.zzV(i8);
        return o42.zzad();
    }

    public static Y0 zzd(byte[] bArr) throws C1901Sv {
        int iZzd;
        int i8;
        int iZzd2;
        long jZzt;
        int i9;
        C1755Pg0 c1755Pg0B = b(bArr);
        c1755Pg0B.zzm(40);
        int iZzd3 = c1755Pg0B.zzd(2);
        boolean zZzo = c1755Pg0B.zzo();
        int i10 = true != zZzo ? 16 : 20;
        c1755Pg0B.zzm(true != zZzo ? 8 : 12);
        int iZzd4 = c1755Pg0B.zzd(i10) + 1;
        boolean zZzo2 = c1755Pg0B.zzo();
        int i11 = 0;
        if (zZzo2) {
            iZzd = c1755Pg0B.zzd(2);
            int iZzd5 = c1755Pg0B.zzd(3) + 1;
            if (c1755Pg0B.zzo()) {
                c1755Pg0B.zzm(36);
            }
            int iZzd6 = c1755Pg0B.zzd(3) + 1;
            int iZzd7 = c1755Pg0B.zzd(3) + 1;
            if (iZzd6 != 1 || iZzd7 != 1) {
                throw C1901Sv.zzc("Multiple audio presentations or assets not supported");
            }
            int i12 = iZzd3 + 1;
            int iZzd8 = c1755Pg0B.zzd(i12);
            for (int i13 = 0; i13 < i12; i13++) {
                if (((iZzd8 >> i13) & 1) == 1) {
                    c1755Pg0B.zzm(8);
                }
            }
            int i14 = iZzd5 * 512;
            if (c1755Pg0B.zzo()) {
                c1755Pg0B.zzm(2);
                int iZzd9 = (c1755Pg0B.zzd(2) + 1) << 2;
                int iZzd10 = c1755Pg0B.zzd(2) + 1;
                while (i11 < iZzd10) {
                    c1755Pg0B.zzm(iZzd9);
                    i11++;
                }
            }
            i11 = i14;
        } else {
            iZzd = -1;
        }
        c1755Pg0B.zzm(i10);
        c1755Pg0B.zzm(12);
        if (zZzo2) {
            if (c1755Pg0B.zzo()) {
                c1755Pg0B.zzm(4);
            }
            if (c1755Pg0B.zzo()) {
                c1755Pg0B.zzm(24);
            }
            if (c1755Pg0B.zzo()) {
                c1755Pg0B.zzn(c1755Pg0B.zzd(10) + 1);
            }
            c1755Pg0B.zzm(5);
            int i15 = f17475d[c1755Pg0B.zzd(4)];
            iZzd2 = c1755Pg0B.zzd(8) + 1;
            i8 = i15;
        } else {
            i8 = -2147483647;
            iZzd2 = -1;
        }
        if (zZzo2) {
            if (iZzd == 0) {
                i9 = 32000;
            } else if (iZzd == 1) {
                i9 = 44100;
            } else {
                if (iZzd != 2) {
                    throw C1901Sv.zza("Unsupported reference clock code in DTS HD header: " + iZzd, null);
                }
                i9 = 48000;
            }
            jZzt = AbstractC2281am0.zzt(i11, 1000000L, i9, RoundingMode.FLOOR);
        } else {
            jZzt = -9223372036854775807L;
        }
        return new Y0("audio/vnd.dts.hd;profile=lbr", iZzd2, i8, iZzd4, jZzt, 0, null);
    }

    public static Y0 zze(byte[] bArr, AtomicInteger atomicInteger) throws C1901Sv {
        long jZzt;
        int iZzd;
        int i8;
        int i9;
        C1755Pg0 c1755Pg0B = b(bArr);
        int iZzd2 = c1755Pg0B.zzd(32);
        int iA = a(c1755Pg0B, f17476e, true);
        int i10 = iA + 1;
        char c9 = iZzd2 == 1078008818 ? (char) 1 : (char) 0;
        if (c9 == 0) {
            jZzt = -9223372036854775807L;
            iZzd = -2147483647;
        } else {
            if (!c1755Pg0B.zzo()) {
                throw C1901Sv.zzc("Only supports full channel mask-based audio presentation");
            }
            int i11 = iA - 1;
            if (((bArr[iA] & 255) | ((char) (bArr[i11] << 8))) != AbstractC2281am0.zzd(bArr, 0, i11, 65535)) {
                throw C1901Sv.zza("CRC check failed", null);
            }
            int iZzd3 = c1755Pg0B.zzd(2);
            if (iZzd3 == 0) {
                i8 = 512;
            } else if (iZzd3 == 1) {
                i8 = 480;
            } else {
                if (iZzd3 != 2) {
                    throw C1901Sv.zza("Unsupported base duration index in DTS UHD header: " + iZzd3, null);
                }
                i8 = 384;
            }
            int iZzd4 = c1755Pg0B.zzd(3) + 1;
            int iZzd5 = c1755Pg0B.zzd(2);
            if (iZzd5 == 0) {
                i9 = 32000;
            } else if (iZzd5 == 1) {
                i9 = 44100;
            } else {
                if (iZzd5 != 2) {
                    throw C1901Sv.zza("Unsupported clock rate index in DTS UHD header: " + iZzd5, null);
                }
                i9 = 48000;
            }
            if (c1755Pg0B.zzo()) {
                c1755Pg0B.zzm(36);
            }
            iZzd = (1 << c1755Pg0B.zzd(2)) * i9;
            jZzt = AbstractC2281am0.zzt(i8 * iZzd4, 1000000L, i9, RoundingMode.FLOOR);
        }
        int i12 = iZzd;
        long j8 = jZzt;
        int iA2 = 0;
        for (char c10 = 0; c10 < c9; c10 = 1) {
            iA2 += a(c1755Pg0B, f17477f, true);
        }
        for (int i13 = 0; i13 <= 0; i13++) {
            if (c9 != 0) {
                atomicInteger.set(a(c1755Pg0B, f17478g, true));
            }
            iA2 += atomicInteger.get() != 0 ? a(c1755Pg0B, f17479h, true) : 0;
        }
        return new Y0("audio/vnd.dts.uhd;profile=p2", 2, i12, i10 + iA2, j8, 0, null);
    }
}
