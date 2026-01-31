package W3;

import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f5350a = new int[4];

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f5351b = new StringBuilder();

    v() {
    }

    private int a(M3.a aVar, int[] iArr, StringBuilder sb) throws F3.m {
        int[] iArr2 = this.f5350a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = aVar.getSize();
        int nextUnset = iArr[1];
        int i8 = 0;
        for (int i9 = 0; i9 < 2 && nextUnset < size; i9++) {
            int iG = y.g(aVar, iArr2, nextUnset, y.f5362h);
            sb.append((char) ((iG % 10) + 48));
            for (int i10 : iArr2) {
                nextUnset += i10;
            }
            if (iG >= 10) {
                i8 |= 1 << (1 - i9);
            }
            if (i9 != 1) {
                nextUnset = aVar.getNextUnset(aVar.getNextSet(nextUnset));
            }
        }
        if (sb.length() != 2) {
            throw F3.m.getNotFoundInstance();
        }
        if (Integer.parseInt(sb.toString()) % 4 == i8) {
            return nextUnset;
        }
        throw F3.m.getNotFoundInstance();
    }

    private static Map c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(F3.r.class);
        enumMap.put((EnumMap) F3.r.ISSUE_NUMBER, (F3.r) Integer.valueOf(str));
        return enumMap;
    }

    F3.q b(int i8, M3.a aVar, int[] iArr) throws F3.m {
        StringBuilder sb = this.f5351b;
        sb.setLength(0);
        int iA = a(aVar, iArr, sb);
        String string = sb.toString();
        Map<F3.r, Object> mapC = c(string);
        float f8 = i8;
        F3.q qVar = new F3.q(string, null, new F3.s[]{new F3.s((iArr[0] + iArr[1]) / 2.0f, f8), new F3.s(iA, f8)}, F3.a.UPC_EAN_EXTENSION);
        if (mapC != null) {
            qVar.putAllMetadata(mapC);
        }
        return qVar;
    }
}
