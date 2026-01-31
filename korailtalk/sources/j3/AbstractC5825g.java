package j3;

import e3.w;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: j3.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5825g {

    /* renamed from: j3.g$a */
    enum a implements Comparator {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int iMin = Math.min(iArr.length, iArr2.length);
            for (int i8 = 0; i8 < iMin; i8++) {
                int i9 = iArr[i8];
                int i10 = iArr2[i8];
                if (i9 != i10) {
                    return AbstractC5825g.compare(i9, i10);
                }
            }
            return iArr.length - iArr2.length;
        }
    }

    static int a(int i8) {
        return i8 ^ Integer.MIN_VALUE;
    }

    public static int checkedCast(long j8) {
        w.checkArgument((j8 >> 32) == 0, "out of range: %s", j8);
        return (int) j8;
    }

    public static int compare(int i8, int i9) {
        return AbstractC5820b.compare(a(i8), a(i9));
    }

    public static int decode(String str) {
        C5823e c5823eA = C5823e.a(str);
        try {
            return parseUnsignedInt(c5823eA.f33426a, c5823eA.f33427b);
        } catch (NumberFormatException e8) {
            NumberFormatException numberFormatException = new NumberFormatException("Error parsing value: " + str);
            numberFormatException.initCause(e8);
            throw numberFormatException;
        }
    }

    public static int divide(int i8, int i9) {
        return (int) (toLong(i8) / toLong(i9));
    }

    public static String join(String str, int... iArr) {
        w.checkNotNull(str);
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(iArr.length * 5);
        sb.append(toString(iArr[0]));
        for (int i8 = 1; i8 < iArr.length; i8++) {
            sb.append(str);
            sb.append(toString(iArr[i8]));
        }
        return sb.toString();
    }

    public static Comparator<int[]> lexicographicalComparator() {
        return a.INSTANCE;
    }

    public static int max(int... iArr) {
        w.checkArgument(iArr.length > 0);
        int iA = a(iArr[0]);
        for (int i8 = 1; i8 < iArr.length; i8++) {
            int iA2 = a(iArr[i8]);
            if (iA2 > iA) {
                iA = iA2;
            }
        }
        return a(iA);
    }

    public static int min(int... iArr) {
        w.checkArgument(iArr.length > 0);
        int iA = a(iArr[0]);
        for (int i8 = 1; i8 < iArr.length; i8++) {
            int iA2 = a(iArr[i8]);
            if (iA2 < iA) {
                iA = iA2;
            }
        }
        return a(iA);
    }

    public static int parseUnsignedInt(String str) {
        return parseUnsignedInt(str, 10);
    }

    public static int remainder(int i8, int i9) {
        return (int) (toLong(i8) % toLong(i9));
    }

    public static int saturatedCast(long j8) {
        if (j8 <= 0) {
            return 0;
        }
        if (j8 >= 4294967296L) {
            return -1;
        }
        return (int) j8;
    }

    public static void sort(int[] iArr) {
        w.checkNotNull(iArr);
        sort(iArr, 0, iArr.length);
    }

    public static void sortDescending(int[] iArr) {
        w.checkNotNull(iArr);
        sortDescending(iArr, 0, iArr.length);
    }

    public static long toLong(int i8) {
        return i8 & 4294967295L;
    }

    public static String toString(int i8) {
        return toString(i8, 10);
    }

    public static int parseUnsignedInt(String str, int i8) throws NumberFormatException {
        w.checkNotNull(str);
        long j8 = Long.parseLong(str, i8);
        if ((4294967295L & j8) == j8) {
            return (int) j8;
        }
        throw new NumberFormatException("Input " + str + " in base " + i8 + " is not in the range of an unsigned integer");
    }

    public static String toString(int i8, int i9) {
        return Long.toString(i8 & 4294967295L, i9);
    }

    public static void sort(int[] iArr, int i8, int i9) {
        w.checkNotNull(iArr);
        w.checkPositionIndexes(i8, i9, iArr.length);
        for (int i10 = i8; i10 < i9; i10++) {
            iArr[i10] = a(iArr[i10]);
        }
        Arrays.sort(iArr, i8, i9);
        while (i8 < i9) {
            iArr[i8] = a(iArr[i8]);
            i8++;
        }
    }

    public static void sortDescending(int[] iArr, int i8, int i9) {
        w.checkNotNull(iArr);
        w.checkPositionIndexes(i8, i9, iArr.length);
        for (int i10 = i8; i10 < i9; i10++) {
            iArr[i10] = Integer.MAX_VALUE ^ iArr[i10];
        }
        Arrays.sort(iArr, i8, i9);
        while (i8 < i9) {
            iArr[i8] = iArr[i8] ^ Integer.MAX_VALUE;
            i8++;
        }
    }
}
