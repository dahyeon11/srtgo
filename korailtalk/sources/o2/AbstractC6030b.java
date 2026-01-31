package o2;

import i2.AbstractC5681n;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: o2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6030b {
    public static <T> T[] concat(T[]... tArr) {
        if (tArr.length == 0) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass(), 0));
        }
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        T[] tArr3 = (T[]) Arrays.copyOf(tArr[0], length);
        int length2 = tArr[0].length;
        for (int i8 = 1; i8 < tArr.length; i8++) {
            T[] tArr4 = tArr[i8];
            int length3 = tArr4.length;
            System.arraycopy(tArr4, 0, tArr3, length2, length3);
            length2 += length3;
        }
        return tArr3;
    }

    public static byte[] concatByteArrays(byte[]... bArr) {
        if (bArr.length == 0) {
            return new byte[0];
        }
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr[0], length);
        int length2 = bArr[0].length;
        for (int i8 = 1; i8 < bArr.length; i8++) {
            byte[] bArr3 = bArr[i8];
            int length3 = bArr3.length;
            System.arraycopy(bArr3, 0, bArrCopyOf, length2, length3);
            length2 += length3;
        }
        return bArrCopyOf;
    }

    public static boolean contains(int[] iArr, int i8) {
        if (iArr != null) {
            for (int i9 : iArr) {
                if (i9 == i8) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> ArrayList<T> newArrayList() {
        return new ArrayList<>();
    }

    public static <T> T[] removeAll(T[] tArr, T... tArr2) {
        int length;
        int i8;
        if (tArr == null) {
            return null;
        }
        if (tArr2 == null || (length = tArr2.length) == 0) {
            return (T[]) Arrays.copyOf(tArr, tArr.length);
        }
        Class<?> cls = tArr2.getClass();
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(cls.getComponentType(), tArr.length));
        if (length == 1) {
            i8 = 0;
            for (T t8 : tArr) {
                if (!AbstractC5681n.equal(tArr2[0], t8)) {
                    tArr3[i8] = t8;
                    i8++;
                }
            }
        } else {
            int i9 = 0;
            for (T t9 : tArr) {
                if (!contains(tArr2, t9)) {
                    tArr3[i9] = t9;
                    i9++;
                }
            }
            i8 = i9;
        }
        if (tArr3 == null) {
            return null;
        }
        return i8 == tArr3.length ? tArr3 : (T[]) Arrays.copyOf(tArr3, i8);
    }

    public static <T> ArrayList<T> toArrayList(T[] tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr.length);
        for (T t8 : tArr) {
            arrayList.add(t8);
        }
        return arrayList;
    }

    public static int[] toPrimitiveArray(Collection<Integer> collection) {
        int i8 = 0;
        if (collection == null || collection.isEmpty()) {
            return new int[0];
        }
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            iArr[i8] = it.next().intValue();
            i8++;
        }
        return iArr;
    }

    public static Integer[] toWrapperArray(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i8 = 0; i8 < length; i8++) {
            numArr[i8] = Integer.valueOf(iArr[i8]);
        }
        return numArr;
    }

    public static void writeArray(StringBuilder sb, double[] dArr) {
        int length = dArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (i8 != 0) {
                sb.append(",");
            }
            sb.append(dArr[i8]);
        }
    }

    public static void writeStringArray(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (i8 != 0) {
                sb.append(",");
            }
            sb.append("\"");
            sb.append(strArr[i8]);
            sb.append("\"");
        }
    }

    public static <T> boolean contains(T[] tArr, T t8) {
        int length = tArr != null ? tArr.length : 0;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                break;
            }
            if (!AbstractC5681n.equal(tArr[i8], t8)) {
                i8++;
            } else if (i8 >= 0) {
                return true;
            }
        }
        return false;
    }

    public static void writeArray(StringBuilder sb, float[] fArr) {
        int length = fArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (i8 != 0) {
                sb.append(",");
            }
            sb.append(fArr[i8]);
        }
    }

    public static void writeArray(StringBuilder sb, int[] iArr) {
        int length = iArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (i8 != 0) {
                sb.append(",");
            }
            sb.append(iArr[i8]);
        }
    }

    public static void writeArray(StringBuilder sb, long[] jArr) {
        int length = jArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (i8 != 0) {
                sb.append(",");
            }
            sb.append(jArr[i8]);
        }
    }

    public static <T> void writeArray(StringBuilder sb, T[] tArr) {
        int length = tArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (i8 != 0) {
                sb.append(",");
            }
            sb.append(tArr[i8]);
        }
    }

    public static void writeArray(StringBuilder sb, boolean[] zArr) {
        int length = zArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (i8 != 0) {
                sb.append(",");
            }
            sb.append(zArr[i8]);
        }
    }
}
