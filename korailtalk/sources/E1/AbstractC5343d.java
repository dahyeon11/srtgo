package e1;

import Q7.C;

/* renamed from: e1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC5343d {
    static String a(int i8, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        sb.append(C.INNER_CLASS_SEPARATOR_CHAR);
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = iArr[i9];
            if (i10 == 1 || i10 == 2) {
                sb.append('[');
                sb.append(iArr2[i9]);
                sb.append(']');
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                sb.append(C.PACKAGE_SEPARATOR_CHAR);
                String str = strArr[i9];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }
}
