package Z;

import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class p {
    public static final int HUNDRED_DAY_FIELD_LEN = 19;

    /* renamed from: a, reason: collision with root package name */
    private static final Object f5692a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static char[] f5693b = new char[24];

    private static int a(int i8, int i9, boolean z8, int i10) {
        if (i8 > 99 || (z8 && i10 >= 3)) {
            return i9 + 3;
        }
        if (i8 > 9 || (z8 && i10 >= 2)) {
            return i9 + 2;
        }
        if (z8 || i8 > 0) {
            return i9 + 1;
        }
        return 0;
    }

    private static int b(long j8, int i8) {
        char c9;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long j9 = j8;
        if (f5693b.length < i8) {
            f5693b = new char[i8];
        }
        char[] cArr = f5693b;
        if (j9 == 0) {
            int i14 = i8 - 1;
            while (i14 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j9 > 0) {
            c9 = '+';
        } else {
            j9 = -j9;
            c9 = '-';
        }
        int i15 = (int) (j9 % 1000);
        int iFloor = (int) Math.floor(j9 / 1000);
        if (iFloor > 86400) {
            i9 = iFloor / 86400;
            iFloor -= 86400 * i9;
        } else {
            i9 = 0;
        }
        if (iFloor > 3600) {
            i10 = iFloor / 3600;
            iFloor -= i10 * 3600;
        } else {
            i10 = 0;
        }
        if (iFloor > 60) {
            int i16 = iFloor / 60;
            i11 = iFloor - (i16 * 60);
            i12 = i16;
        } else {
            i11 = iFloor;
            i12 = 0;
        }
        if (i8 != 0) {
            int iA = a(i9, 1, false, 0);
            int iA2 = iA + a(i10, 1, iA > 0, 2);
            int iA3 = iA2 + a(i12, 1, iA2 > 0, 2);
            int iA4 = iA3 + a(i11, 1, iA3 > 0, 2);
            i13 = 0;
            for (int iA5 = iA4 + a(i15, 2, true, iA4 > 0 ? 3 : 0) + 1; iA5 < i8; iA5++) {
                cArr[i13] = ' ';
                i13++;
            }
        } else {
            i13 = 0;
        }
        cArr[i13] = c9;
        int i17 = i13 + 1;
        boolean z8 = i8 != 0;
        int iC = c(cArr, i9, 'd', i17, false, 0);
        int iC2 = c(cArr, i10, 'h', iC, iC != i17, z8 ? 2 : 0);
        int iC3 = c(cArr, i12, 'm', iC2, iC2 != i17, z8 ? 2 : 0);
        int iC4 = c(cArr, i11, 's', iC3, iC3 != i17, z8 ? 2 : 0);
        int iC5 = c(cArr, i15, 'm', iC4, true, (!z8 || iC4 == i17) ? 0 : 3);
        cArr[iC5] = 's';
        return iC5 + 1;
    }

    private static int c(char[] cArr, int i8, char c9, int i9, boolean z8, int i10) {
        int i11;
        if (!z8 && i8 <= 0) {
            return i9;
        }
        if ((!z8 || i10 < 3) && i8 <= 99) {
            i11 = i9;
        } else {
            int i12 = i8 / 100;
            cArr[i9] = (char) (i12 + 48);
            i11 = i9 + 1;
            i8 -= i12 * 100;
        }
        if ((z8 && i10 >= 2) || i8 > 9 || i9 != i11) {
            int i13 = i8 / 10;
            cArr[i11] = (char) (i13 + 48);
            i11++;
            i8 -= i13 * 10;
        }
        cArr[i11] = (char) (i8 + 48);
        cArr[i11 + 1] = c9;
        return i11 + 2;
    }

    public static void formatDuration(long j8, StringBuilder sb) {
        synchronized (f5692a) {
            sb.append(f5693b, 0, b(j8, 0));
        }
    }

    public static void formatDuration(long j8, PrintWriter printWriter, int i8) {
        synchronized (f5692a) {
            printWriter.print(new String(f5693b, 0, b(j8, i8)));
        }
    }

    public static void formatDuration(long j8, PrintWriter printWriter) {
        formatDuration(j8, printWriter, 0);
    }

    public static void formatDuration(long j8, long j9, PrintWriter printWriter) {
        if (j8 == 0) {
            printWriter.print("--");
        } else {
            formatDuration(j8 - j9, printWriter, 0);
        }
    }
}
