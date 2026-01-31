package W3;

import java.util.Map;

/* loaded from: classes2.dex */
public final class f extends s {
    private static void c(int i8, int[] iArr) {
        for (int i9 = 0; i9 < 9; i9++) {
            int i10 = 1;
            if (((1 << (8 - i9)) & i8) != 0) {
                i10 = 2;
            }
            iArr[i9] = i10;
        }
    }

    @Override // W3.s, F3.u
    public M3.b encode(String str, F3.a aVar, int i8, int i9, Map<F3.g, ?> map) {
        if (aVar == F3.a.CODE_39) {
            return super.encode(str, aVar, i8, i9, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got " + aVar);
    }

    @Override // W3.s
    public boolean[] encode(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            int i8 = length + 25;
            for (int i9 = 0; i9 < length; i9++) {
                int iIndexOf = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(str.charAt(i9));
                if (iIndexOf >= 0) {
                    c(e.f5323e[iIndexOf], iArr);
                    for (int i10 = 0; i10 < 9; i10++) {
                        i8 += iArr[i10];
                    }
                } else {
                    throw new IllegalArgumentException("Bad contents: " + str);
                }
            }
            boolean[] zArr = new boolean[i8];
            c(e.f5324f, iArr);
            int iA = s.a(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int iA2 = iA + s.a(zArr, iA, iArr2, false);
            for (int i11 = 0; i11 < length; i11++) {
                c(e.f5323e["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(str.charAt(i11))], iArr);
                int iA3 = iA2 + s.a(zArr, iA2, iArr, true);
                iA2 = iA3 + s.a(zArr, iA3, iArr2, false);
            }
            c(e.f5324f, iArr);
            s.a(zArr, iA2, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
    }
}
