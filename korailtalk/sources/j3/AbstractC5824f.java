package j3;

import e3.w;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/* renamed from: j3.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5824f {
    public static final byte MAX_POWER_OF_TWO = -128;
    public static final byte MAX_VALUE = -1;

    /* renamed from: j3.f$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        static final String f33428a = a.class.getName() + "$UnsafeComparator";

        /* renamed from: b, reason: collision with root package name */
        static final Comparator f33429b = a();

        /* renamed from: j3.f$a$a, reason: collision with other inner class name */
        enum EnumC0334a implements Comparator {
            INSTANCE;

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int iMin = Math.min(bArr.length, bArr2.length);
                for (int i8 = 0; i8 < iMin; i8++) {
                    int iCompare = AbstractC5824f.compare(bArr[i8], bArr2[i8]);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                return bArr.length - bArr2.length;
            }
        }

        static Comparator a() {
            try {
                Object[] enumConstants = Class.forName(f33428a).getEnumConstants();
                Objects.requireNonNull(enumConstants);
                return (Comparator) enumConstants[0];
            } catch (Throwable unused) {
                return AbstractC5824f.b();
            }
        }
    }

    private static byte a(byte b9) {
        return (byte) (b9 ^ 128);
    }

    static Comparator b() {
        return a.EnumC0334a.INSTANCE;
    }

    public static byte checkedCast(long j8) {
        w.checkArgument((j8 >> 8) == 0, "out of range: %s", j8);
        return (byte) j8;
    }

    public static int compare(byte b9, byte b10) {
        return toInt(b9) - toInt(b10);
    }

    public static String join(String str, byte... bArr) {
        w.checkNotNull(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * (str.length() + 3));
        sb.append(toInt(bArr[0]));
        for (int i8 = 1; i8 < bArr.length; i8++) {
            sb.append(str);
            sb.append(toString(bArr[i8]));
        }
        return sb.toString();
    }

    public static Comparator<byte[]> lexicographicalComparator() {
        return a.f33429b;
    }

    public static byte max(byte... bArr) {
        w.checkArgument(bArr.length > 0);
        int i8 = toInt(bArr[0]);
        for (int i9 = 1; i9 < bArr.length; i9++) {
            int i10 = toInt(bArr[i9]);
            if (i10 > i8) {
                i8 = i10;
            }
        }
        return (byte) i8;
    }

    public static byte min(byte... bArr) {
        w.checkArgument(bArr.length > 0);
        int i8 = toInt(bArr[0]);
        for (int i9 = 1; i9 < bArr.length; i9++) {
            int i10 = toInt(bArr[i9]);
            if (i10 < i8) {
                i8 = i10;
            }
        }
        return (byte) i8;
    }

    public static byte parseUnsignedByte(String str) {
        return parseUnsignedByte(str, 10);
    }

    public static byte saturatedCast(long j8) {
        if (j8 > toInt((byte) -1)) {
            return (byte) -1;
        }
        if (j8 < 0) {
            return (byte) 0;
        }
        return (byte) j8;
    }

    public static void sort(byte[] bArr) {
        w.checkNotNull(bArr);
        sort(bArr, 0, bArr.length);
    }

    public static void sortDescending(byte[] bArr) {
        w.checkNotNull(bArr);
        sortDescending(bArr, 0, bArr.length);
    }

    public static int toInt(byte b9) {
        return b9 & 255;
    }

    public static String toString(byte b9) {
        return toString(b9, 10);
    }

    public static byte parseUnsignedByte(String str, int i8) throws NumberFormatException {
        int i9 = Integer.parseInt((String) w.checkNotNull(str), i8);
        if ((i9 >> 8) == 0) {
            return (byte) i9;
        }
        throw new NumberFormatException("out of range: " + i9);
    }

    public static String toString(byte b9, int i8) {
        w.checkArgument(i8 >= 2 && i8 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i8);
        return Integer.toString(toInt(b9), i8);
    }

    public static void sort(byte[] bArr, int i8, int i9) {
        w.checkNotNull(bArr);
        w.checkPositionIndexes(i8, i9, bArr.length);
        for (int i10 = i8; i10 < i9; i10++) {
            bArr[i10] = a(bArr[i10]);
        }
        Arrays.sort(bArr, i8, i9);
        while (i8 < i9) {
            bArr[i8] = a(bArr[i8]);
            i8++;
        }
    }

    public static void sortDescending(byte[] bArr, int i8, int i9) {
        w.checkNotNull(bArr);
        w.checkPositionIndexes(i8, i9, bArr.length);
        for (int i10 = i8; i10 < i9; i10++) {
            bArr[i10] = (byte) (bArr[i10] ^ 127);
        }
        Arrays.sort(bArr, i8, i9);
        while (i8 < i9) {
            bArr[i8] = (byte) (bArr[i8] ^ 127);
            i8++;
        }
    }
}
