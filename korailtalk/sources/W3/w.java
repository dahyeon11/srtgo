package W3;

import Q7.C;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class w {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f5352c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a, reason: collision with root package name */
    private final int[] f5353a = new int[4];

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f5354b = new StringBuilder();

    w() {
    }

    private int a(M3.a aVar, int[] iArr, StringBuilder sb) throws F3.m {
        int[] iArr2 = this.f5353a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = aVar.getSize();
        int nextUnset = iArr[1];
        int i8 = 0;
        for (int i9 = 0; i9 < 5 && nextUnset < size; i9++) {
            int iG = y.g(aVar, iArr2, nextUnset, y.f5362h);
            sb.append((char) ((iG % 10) + 48));
            for (int i10 : iArr2) {
                nextUnset += i10;
            }
            if (iG >= 10) {
                i8 |= 1 << (4 - i9);
            }
            if (i9 != 4) {
                nextUnset = aVar.getNextUnset(aVar.getNextSet(nextUnset));
            }
        }
        if (sb.length() != 5) {
            throw F3.m.getNotFoundInstance();
        }
        if (d(sb.toString()) == c(i8)) {
            return nextUnset;
        }
        throw F3.m.getNotFoundInstance();
    }

    private static int c(int i8) throws F3.m {
        for (int i9 = 0; i9 < 10; i9++) {
            if (i8 == f5352c[i9]) {
                return i9;
            }
        }
        throw F3.m.getNotFoundInstance();
    }

    private static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int iCharAt = 0;
        for (int i8 = length - 2; i8 >= 0; i8 -= 2) {
            iCharAt += charSequence.charAt(i8) - '0';
        }
        int iCharAt2 = iCharAt * 3;
        for (int i9 = length - 1; i9 >= 0; i9 -= 2) {
            iCharAt2 += charSequence.charAt(i9) - '0';
        }
        return (iCharAt2 * 3) % 10;
    }

    private static String e(String str) throws NumberFormatException {
        String str2;
        String strValueOf;
        char cCharAt = str.charAt(0);
        if (cCharAt == '0') {
            str2 = "£";
        } else if (cCharAt != '5') {
            str2 = "";
            if (cCharAt == '9') {
                if ("90000".equals(str)) {
                    return null;
                }
                if ("99991".equals(str)) {
                    return "0.00";
                }
                if ("99990".equals(str)) {
                    return "Used";
                }
            }
        } else {
            str2 = "$";
        }
        int i8 = Integer.parseInt(str.substring(1));
        String strValueOf2 = String.valueOf(i8 / 100);
        int i9 = i8 % 100;
        if (i9 < 10) {
            strValueOf = "0" + i9;
        } else {
            strValueOf = String.valueOf(i9);
        }
        return str2 + strValueOf2 + C.PACKAGE_SEPARATOR_CHAR + strValueOf;
    }

    private static Map f(String str) {
        String strE;
        if (str.length() != 5 || (strE = e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(F3.r.class);
        enumMap.put((EnumMap) F3.r.SUGGESTED_PRICE, (F3.r) strE);
        return enumMap;
    }

    F3.q b(int i8, M3.a aVar, int[] iArr) throws F3.m {
        StringBuilder sb = this.f5354b;
        sb.setLength(0);
        int iA = a(aVar, iArr, sb);
        String string = sb.toString();
        Map<F3.r, Object> mapF = f(string);
        float f8 = i8;
        F3.q qVar = new F3.q(string, null, new F3.s[]{new F3.s((iArr[0] + iArr[1]) / 2.0f, f8), new F3.s(iA, f8)}, F3.a.UPC_EAN_EXTENSION);
        if (mapF != null) {
            qVar.putAllMetadata(mapF);
        }
        return qVar;
    }
}
