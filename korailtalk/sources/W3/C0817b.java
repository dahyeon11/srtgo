package W3;

import Q7.C;

/* renamed from: W3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0817b extends s {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f5317a;

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f5318b = {'T', 'N', '*', 'E'};

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f5319c = {'/', ':', '+', C.PACKAGE_SEPARATOR_CHAR};

    /* renamed from: d, reason: collision with root package name */
    private static final char f5320d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f5317a = cArr;
        f5320d = cArr[0];
    }

    @Override // W3.s
    public boolean[] encode(String str) {
        int i8;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c9 = f5320d;
            sb.append(c9);
            sb.append(str);
            sb.append(c9);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f5317a;
            boolean zE = C0816a.e(cArr, upperCase);
            boolean zE2 = C0816a.e(cArr, upperCase2);
            char[] cArr2 = f5318b;
            boolean zE3 = C0816a.e(cArr2, upperCase);
            boolean zE4 = C0816a.e(cArr2, upperCase2);
            if (zE) {
                if (!zE2) {
                    throw new IllegalArgumentException("Invalid start/end guards: " + str);
                }
            } else if (!zE3) {
                if (zE2 || zE4) {
                    throw new IllegalArgumentException("Invalid start/end guards: " + str);
                }
                StringBuilder sb2 = new StringBuilder();
                char c10 = f5320d;
                sb2.append(c10);
                sb2.append(str);
                sb2.append(c10);
                str = sb2.toString();
            } else if (!zE4) {
                throw new IllegalArgumentException("Invalid start/end guards: " + str);
            }
        }
        int i9 = 20;
        for (int i10 = 1; i10 < str.length() - 1; i10++) {
            if (Character.isDigit(str.charAt(i10)) || str.charAt(i10) == '-' || str.charAt(i10) == '$') {
                i9 += 9;
            } else {
                if (!C0816a.e(f5319c, str.charAt(i10))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i10) + '\'');
                }
                i9 += 10;
            }
        }
        boolean[] zArr = new boolean[i9 + (str.length() - 1)];
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i12));
            if (i12 == 0 || i12 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i13 = 0;
            while (true) {
                char[] cArr3 = C0816a.f5311d;
                if (i13 >= cArr3.length) {
                    i8 = 0;
                    break;
                }
                if (upperCase3 == cArr3[i13]) {
                    i8 = C0816a.f5312e[i13];
                    break;
                }
                i13++;
            }
            int i14 = 0;
            int i15 = 0;
            boolean z8 = true;
            while (i14 < 7) {
                zArr[i11] = z8;
                i11++;
                if (((i8 >> (6 - i14)) & 1) == 0 || i15 == 1) {
                    z8 = !z8;
                    i14++;
                    i15 = 0;
                } else {
                    i15++;
                }
            }
            if (i12 < str.length() - 1) {
                zArr[i11] = false;
                i11++;
            }
        }
        return zArr;
    }
}
