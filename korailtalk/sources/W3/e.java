package W3;

import java.util.Arrays;
import maum.m2u.map.Map;

/* loaded from: classes2.dex */
public final class e extends r {

    /* renamed from: e, reason: collision with root package name */
    static final int[] f5323e;

    /* renamed from: f, reason: collision with root package name */
    static final int f5324f;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5325a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5326b;

    /* renamed from: c, reason: collision with root package name */
    private final StringBuilder f5327c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f5328d;

    static {
        int[] iArr = {52, 289, 97, 352, 49, Map.MapException.StatusCode.AUTH_INVALID_HEADER_VALUE, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 148, 168, 162, 138, 42};
        f5323e = iArr;
        f5324f = iArr[39];
    }

    public e() {
        this(false);
    }

    private static String e(CharSequence charSequence) throws F3.h {
        int i8;
        char c9;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i9 = 0;
        while (i9 < length) {
            char cCharAt = charSequence.charAt(i9);
            if (cCharAt == '+' || cCharAt == '$' || cCharAt == '%' || cCharAt == '/') {
                i9++;
                char cCharAt2 = charSequence.charAt(i9);
                if (cCharAt != '$') {
                    if (cCharAt != '%') {
                        if (cCharAt != '+') {
                            if (cCharAt != '/') {
                                c9 = 0;
                            } else if (cCharAt2 >= 'A' && cCharAt2 <= 'O') {
                                i8 = cCharAt2 - ' ';
                            } else {
                                if (cCharAt2 != 'Z') {
                                    throw F3.h.getFormatInstance();
                                }
                                c9 = ':';
                            }
                            sb.append(c9);
                        } else {
                            if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                                throw F3.h.getFormatInstance();
                            }
                            i8 = cCharAt2 + ' ';
                        }
                    } else if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                        i8 = cCharAt2 - '&';
                    } else {
                        if (cCharAt2 < 'F' || cCharAt2 > 'W') {
                            throw F3.h.getFormatInstance();
                        }
                        i8 = cCharAt2 - 11;
                    }
                } else {
                    if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                        throw F3.h.getFormatInstance();
                    }
                    i8 = cCharAt2 - '@';
                }
                c9 = (char) i8;
                sb.append(c9);
            } else {
                sb.append(cCharAt);
            }
            i9++;
        }
        return sb.toString();
    }

    private static int[] f(M3.a aVar, int[] iArr) throws F3.m {
        int size = aVar.getSize();
        int nextSet = aVar.getNextSet(0);
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
                    if (h(iArr) == f5324f && aVar.isRange(Math.max(0, i9 - ((nextSet - i9) / 2)), i9, false)) {
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

    private static char g(int i8) throws F3.m {
        int i9 = 0;
        while (true) {
            int[] iArr = f5323e;
            if (i9 >= iArr.length) {
                throw F3.m.getNotFoundInstance();
            }
            if (iArr[i9] == i8) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".charAt(i9);
            }
            i9++;
        }
    }

    private static int h(int[] iArr) {
        int length = iArr.length;
        int i8 = 0;
        while (true) {
            int i9 = Integer.MAX_VALUE;
            for (int i10 : iArr) {
                if (i10 < i9 && i10 > i8) {
                    i9 = i10;
                }
            }
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < length; i14++) {
                int i15 = iArr[i14];
                if (i15 > i9) {
                    i12 |= 1 << ((length - 1) - i14);
                    i11++;
                    i13 += i15;
                }
            }
            if (i11 == 3) {
                for (int i16 = 0; i16 < length && i11 > 0; i16++) {
                    int i17 = iArr[i16];
                    if (i17 > i9) {
                        i11--;
                        if ((i17 << 1) >= i13) {
                            return -1;
                        }
                    }
                }
                return i12;
            }
            if (i11 <= 3) {
                return -1;
            }
            i8 = i9;
        }
    }

    @Override // W3.r
    public F3.q decodeRow(int i8, M3.a aVar, java.util.Map<F3.e, ?> map) throws F3.d, F3.m {
        int[] iArr = this.f5328d;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f5327c;
        sb.setLength(0);
        int nextSet = aVar.getNextSet(f(aVar, iArr)[1]);
        int size = aVar.getSize();
        while (true) {
            r.c(aVar, nextSet, iArr);
            int iH = h(iArr);
            if (iH < 0) {
                throw F3.m.getNotFoundInstance();
            }
            char cG = g(iH);
            sb.append(cG);
            int i9 = nextSet;
            for (int i10 : iArr) {
                i9 += i10;
            }
            int nextSet2 = aVar.getNextSet(i9);
            if (cG == '*') {
                sb.setLength(sb.length() - 1);
                int i11 = 0;
                for (int i12 : iArr) {
                    i11 += i12;
                }
                int i13 = (nextSet2 - nextSet) - i11;
                if (nextSet2 != size && (i13 << 1) < i11) {
                    throw F3.m.getNotFoundInstance();
                }
                if (this.f5325a) {
                    int length = sb.length() - 1;
                    int iIndexOf = 0;
                    for (int i14 = 0; i14 < length; i14++) {
                        iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f5327c.charAt(i14));
                    }
                    if (sb.charAt(length) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(iIndexOf % 43)) {
                        throw F3.d.getChecksumInstance();
                    }
                    sb.setLength(length);
                }
                if (sb.length() == 0) {
                    throw F3.m.getNotFoundInstance();
                }
                float f8 = i8;
                return new F3.q(this.f5326b ? e(sb) : sb.toString(), null, new F3.s[]{new F3.s((r2[1] + r2[0]) / 2.0f, f8), new F3.s(nextSet + (i11 / 2.0f), f8)}, F3.a.CODE_39);
            }
            nextSet = nextSet2;
        }
    }

    public e(boolean z8) {
        this(z8, false);
    }

    public e(boolean z8, boolean z9) {
        this.f5325a = z8;
        this.f5326b = z9;
        this.f5327c = new StringBuilder(20);
        this.f5328d = new int[9];
    }
}
