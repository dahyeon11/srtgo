package W3;

import java.util.Map;

/* loaded from: classes2.dex */
public class h extends s {
    protected static int a(boolean[] zArr, int i8, int[] iArr, boolean z8) {
        int length = iArr.length;
        int i9 = 0;
        while (i9 < length) {
            int i10 = i8 + 1;
            zArr[i8] = iArr[i9] != 0;
            i9++;
            i8 = i10;
        }
        return 9;
    }

    private static int c(String str, int i8) {
        int iIndexOf = 0;
        int i9 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i9;
            i9++;
            if (i9 > i8) {
                i9 = 1;
            }
        }
        return iIndexOf % 47;
    }

    private static void d(int i8, int[] iArr) {
        for (int i9 = 0; i9 < 9; i9++) {
            int i10 = 1;
            if (((1 << (8 - i9)) & i8) == 0) {
                i10 = 0;
            }
            iArr[i9] = i10;
        }
    }

    @Override // W3.s, F3.u
    public M3.b encode(String str, F3.a aVar, int i8, int i9, Map<F3.g, ?> map) {
        if (aVar == F3.a.CODE_93) {
            return super.encode(str, aVar, i8, i9, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got " + aVar);
    }

    @Override // W3.s
    public boolean[] encode(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            boolean[] zArr = new boolean[((str.length() + 4) * 9) + 1];
            d(g.f5330d[47], iArr);
            int iA = a(zArr, 0, iArr, true);
            for (int i8 = 0; i8 < length; i8++) {
                d(g.f5330d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i8))], iArr);
                iA += a(zArr, iA, iArr, true);
            }
            int iC = c(str, 20);
            int[] iArr2 = g.f5330d;
            d(iArr2[iC], iArr);
            int iA2 = iA + a(zArr, iA, iArr, true);
            d(iArr2[c(str + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iC), 15)], iArr);
            int iA3 = iA2 + a(zArr, iA2, iArr, true);
            d(iArr2[47], iArr);
            zArr[iA3 + a(zArr, iA3, iArr, true)] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
    }
}
