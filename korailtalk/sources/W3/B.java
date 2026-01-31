package W3;

import java.util.Map;

/* loaded from: classes2.dex */
public final class B extends z {
    @Override // W3.s, F3.u
    public M3.b encode(String str, F3.a aVar, int i8, int i9, Map<F3.g, ?> map) {
        if (aVar == F3.a.UPC_E) {
            return super.encode(str, aVar, i8, i9, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got " + aVar);
    }

    @Override // W3.s
    public boolean[] encode(String str) throws NumberFormatException {
        if (str.length() == 8) {
            int i8 = A.f5307j[Integer.parseInt(str.substring(7, 8))];
            boolean[] zArr = new boolean[51];
            int iA = s.a(zArr, 0, y.f5358d, true);
            int i9 = 1;
            while (i9 <= 6) {
                int i10 = i9 + 1;
                int i11 = Integer.parseInt(str.substring(i9, i10));
                if (((i8 >> (6 - i9)) & 1) == 1) {
                    i11 += 10;
                }
                iA += s.a(zArr, iA, y.f5362h[i11], false);
                i9 = i10;
            }
            s.a(zArr, iA, y.f5360f, false);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be 8 digits long, but got " + str.length());
    }
}
