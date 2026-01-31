package W3;

import e3.AbstractC5358c;
import java.util.Arrays;
import maum.m2u.common.DeviceOuterClass;
import maum.m2u.map.Map;

/* loaded from: classes2.dex */
public final class g extends r {

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f5329c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d, reason: collision with root package name */
    static final int[] f5330d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f5331e;

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f5332a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    private final int[] f5333b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, Map.MapException.StatusCode.ROUTER_DA_NOT_FOUND_VALUE, Map.MapException.StatusCode.ROUTER_SESSION_INVALID_VALUE, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, Map.MapException.StatusCode.ROUTER_ITF_NOT_FOUND_VALUE, 410, 364, 358, Map.MapException.StatusCode.MAP_NO_STREAM_PARAM_VALUE, Map.MapException.StatusCode.MAP_EVENT_CASE_NOT_SET_VALUE, Map.MapException.StatusCode.AUTH_INVALID_AUTH_TOKEN_VALUE, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f5330d = iArr;
        f5331e = iArr[47];
    }

    private static void e(CharSequence charSequence) throws F3.d {
        int length = charSequence.length();
        f(charSequence, length - 2, 20);
        f(charSequence, length - 1, 15);
    }

    private static void f(CharSequence charSequence, int i8, int i9) throws F3.d {
        int iIndexOf = 0;
        int i10 = 1;
        for (int i11 = i8 - 1; i11 >= 0; i11--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i11)) * i10;
            i10++;
            if (i10 > i9) {
                i10 = 1;
            }
        }
        if (charSequence.charAt(i8) != f5329c[iIndexOf % 47]) {
            throw F3.d.getChecksumInstance();
        }
    }

    private static String g(CharSequence charSequence) throws F3.h {
        int i8;
        char c9;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i9 = 0;
        while (i9 < length) {
            char cCharAt = charSequence.charAt(i9);
            if (cCharAt < 'a' || cCharAt > 'd') {
                sb.append(cCharAt);
            } else {
                if (i9 >= length - 1) {
                    throw F3.h.getFormatInstance();
                }
                i9++;
                char cCharAt2 = charSequence.charAt(i9);
                switch (cCharAt) {
                    case 'a':
                        if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                            i8 = cCharAt2 - '@';
                            c9 = (char) i8;
                            sb.append(c9);
                            break;
                        } else {
                            throw F3.h.getFormatInstance();
                        }
                        break;
                    case DeviceOuterClass.Device.TIMESTAMP_FIELD_NUMBER /* 98 */:
                        if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                            i8 = cCharAt2 - '&';
                        } else if (cCharAt2 >= 'F' && cCharAt2 <= 'J') {
                            i8 = cCharAt2 - 11;
                        } else if (cCharAt2 >= 'K' && cCharAt2 <= 'O') {
                            i8 = cCharAt2 + 16;
                        } else if (cCharAt2 >= 'P' && cCharAt2 <= 'S') {
                            i8 = cCharAt2 + '+';
                        } else if (cCharAt2 >= 'T' && cCharAt2 <= 'Z') {
                            c9 = AbstractC5358c.MAX;
                            sb.append(c9);
                            break;
                        } else {
                            throw F3.h.getFormatInstance();
                        }
                        c9 = (char) i8;
                        sb.append(c9);
                        break;
                    case 'c':
                        if (cCharAt2 >= 'A' && cCharAt2 <= 'O') {
                            i8 = cCharAt2 - ' ';
                            c9 = (char) i8;
                            sb.append(c9);
                        } else {
                            if (cCharAt2 != 'Z') {
                                throw F3.h.getFormatInstance();
                            }
                            c9 = ':';
                            sb.append(c9);
                            break;
                        }
                    case 'd':
                        if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                            i8 = cCharAt2 + ' ';
                            c9 = (char) i8;
                            sb.append(c9);
                            break;
                        } else {
                            throw F3.h.getFormatInstance();
                        }
                    default:
                        c9 = 0;
                        sb.append(c9);
                        break;
                }
            }
            i9++;
        }
        return sb.toString();
    }

    private int[] h(M3.a aVar) throws F3.m {
        int size = aVar.getSize();
        int nextSet = aVar.getNextSet(0);
        Arrays.fill(this.f5333b, 0);
        int[] iArr = this.f5333b;
        int length = iArr.length;
        boolean z8 = false;
        int i8 = 0;
        int i9 = nextSet;
        while (nextSet < size) {
            if (aVar.get(nextSet) ^ z8) {
                iArr[i8] = iArr[i8] + 1;
            } else {
                int i10 = length - 1;
                if (i8 != i10) {
                    i8++;
                } else {
                    if (j(iArr) == f5331e) {
                        return new int[]{i9, nextSet};
                    }
                    i9 += iArr[0] + iArr[1];
                    int i11 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i11);
                    iArr[i11] = 0;
                    iArr[i10] = 0;
                    i8--;
                }
                iArr[i8] = 1;
                z8 = !z8;
            }
            nextSet++;
        }
        throw F3.m.getNotFoundInstance();
    }

    private static char i(int i8) throws F3.m {
        int i9 = 0;
        while (true) {
            int[] iArr = f5330d;
            if (i9 >= iArr.length) {
                throw F3.m.getNotFoundInstance();
            }
            if (iArr[i9] == i8) {
                return f5329c[i9];
            }
            i9++;
        }
    }

    private static int j(int[] iArr) {
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += i9;
        }
        int length = iArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int iRound = Math.round((iArr[i11] * 9.0f) / i8);
            if (iRound <= 0 || iRound > 4) {
                return -1;
            }
            if ((i11 & 1) == 0) {
                for (int i12 = 0; i12 < iRound; i12++) {
                    i10 = (i10 << 1) | 1;
                }
            } else {
                i10 <<= iRound;
            }
        }
        return i10;
    }

    @Override // W3.r
    public F3.q decodeRow(int i8, M3.a aVar, java.util.Map<F3.e, ?> map) throws F3.d, F3.m {
        int nextSet = aVar.getNextSet(h(aVar)[1]);
        int size = aVar.getSize();
        int[] iArr = this.f5333b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f5332a;
        sb.setLength(0);
        while (true) {
            r.c(aVar, nextSet, iArr);
            int iJ = j(iArr);
            if (iJ < 0) {
                throw F3.m.getNotFoundInstance();
            }
            char cI = i(iJ);
            sb.append(cI);
            int i9 = nextSet;
            for (int i10 : iArr) {
                i9 += i10;
            }
            int nextSet2 = aVar.getNextSet(i9);
            if (cI == '*') {
                sb.deleteCharAt(sb.length() - 1);
                int i11 = 0;
                for (int i12 : iArr) {
                    i11 += i12;
                }
                if (nextSet2 == size || !aVar.get(nextSet2)) {
                    throw F3.m.getNotFoundInstance();
                }
                if (sb.length() < 2) {
                    throw F3.m.getNotFoundInstance();
                }
                e(sb);
                sb.setLength(sb.length() - 2);
                float f8 = i8;
                return new F3.q(g(sb), null, new F3.s[]{new F3.s((r14[1] + r14[0]) / 2.0f, f8), new F3.s(nextSet + (i11 / 2.0f), f8)}, F3.a.CODE_93);
            }
            nextSet = nextSet2;
        }
    }
}
