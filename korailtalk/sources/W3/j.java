package W3;

import java.util.Map;

/* loaded from: classes2.dex */
public final class j extends z {
    @Override // W3.s, F3.u
    public M3.b encode(String str, F3.a aVar, int i8, int i9, Map<F3.g, ?> map) {
        if (aVar == F3.a.EAN_13) {
            return super.encode(str, aVar, i8, i9, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got " + aVar);
    }

    @Override // W3.s
    public boolean[] encode(String str) throws NumberFormatException {
        if (str.length() == 13) {
            try {
                if (y.f(str)) {
                    int i8 = i.f5334j[Integer.parseInt(str.substring(0, 1))];
                    boolean[] zArr = new boolean[95];
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
                    int iA2 = iA + s.a(zArr, iA, y.f5359e, false);
                    int i12 = 7;
                    while (i12 <= 12) {
                        int i13 = i12 + 1;
                        iA2 += s.a(zArr, iA2, y.f5361g[Integer.parseInt(str.substring(i12, i13))], true);
                        i12 = i13;
                    }
                    s.a(zArr, iA2, y.f5358d, true);
                    return zArr;
                }
                throw new IllegalArgumentException("Contents do not pass checksum");
            } catch (F3.h unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        throw new IllegalArgumentException("Requested contents should be 13 digits long, but got " + str.length());
    }
}
