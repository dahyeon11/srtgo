package W3;

import java.util.Map;

/* loaded from: classes2.dex */
public final class l extends z {
    @Override // W3.s, F3.u
    public M3.b encode(String str, F3.a aVar, int i8, int i9, Map<F3.g, ?> map) {
        if (aVar == F3.a.EAN_8) {
            return super.encode(str, aVar, i8, i9, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got " + aVar);
    }

    @Override // W3.s
    public boolean[] encode(String str) throws NumberFormatException {
        if (str.length() == 8) {
            boolean[] zArr = new boolean[67];
            int iA = s.a(zArr, 0, y.f5358d, true);
            int i8 = 0;
            while (i8 <= 3) {
                int i9 = i8 + 1;
                iA += s.a(zArr, iA, y.f5361g[Integer.parseInt(str.substring(i8, i9))], false);
                i8 = i9;
            }
            int iA2 = iA + s.a(zArr, iA, y.f5359e, false);
            int i10 = 4;
            while (i10 <= 7) {
                int i11 = i10 + 1;
                iA2 += s.a(zArr, iA2, y.f5361g[Integer.parseInt(str.substring(i10, i11))], true);
                i10 = i11;
            }
            s.a(zArr, iA2, y.f5358d, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be 8 digits long, but got " + str.length());
    }
}
