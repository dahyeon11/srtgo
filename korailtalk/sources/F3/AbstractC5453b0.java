package f3;

/* renamed from: f3.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5453b0 {
    static int a(int i8, double d9) {
        int iMax = Math.max(i8, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d9 * iHighestOneBit))) {
            return iHighestOneBit;
        }
        int i9 = iHighestOneBit << 1;
        if (i9 > 0) {
            return i9;
        }
        return 1073741824;
    }

    static int b(int i8) {
        return (int) (Integer.rotateLeft((int) (i8 * (-862048943)), 15) * 461845907);
    }

    static int c(Object obj) {
        return b(obj == null ? 0 : obj.hashCode());
    }
}
