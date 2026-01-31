package W3;

import java.util.Map;

/* loaded from: classes2.dex */
public final class o extends s {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f5344a = {1, 1, 1, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f5345b = {3, 1, 1};

    @Override // W3.s, F3.u
    public M3.b encode(String str, F3.a aVar, int i8, int i9, Map<F3.g, ?> map) {
        if (aVar == F3.a.ITF) {
            return super.encode(str, aVar, i8, i9, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got " + aVar);
    }

    @Override // W3.s
    public boolean[] encode(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length <= 80) {
            boolean[] zArr = new boolean[(length * 9) + 9];
            int iA = s.a(zArr, 0, f5344a, true);
            for (int i8 = 0; i8 < length; i8 += 2) {
                int iDigit = Character.digit(str.charAt(i8), 10);
                int iDigit2 = Character.digit(str.charAt(i8 + 1), 10);
                int[] iArr = new int[18];
                for (int i9 = 0; i9 < 5; i9++) {
                    int i10 = i9 * 2;
                    int[][] iArr2 = n.f5342e;
                    iArr[i10] = iArr2[iDigit][i9];
                    iArr[i10 + 1] = iArr2[iDigit2][i9];
                }
                iA += s.a(zArr, iA, iArr, true);
            }
            s.a(zArr, iA, f5345b, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
    }
}
