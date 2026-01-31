package W3;

import java.util.Arrays;
import java.util.Map;

/* renamed from: W3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0816a extends r {

    /* renamed from: d, reason: collision with root package name */
    static final char[] f5311d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e, reason: collision with root package name */
    static final int[] f5312e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f, reason: collision with root package name */
    private static final char[] f5313f = {'A', 'B', 'C', 'D'};

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f5314a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    private int[] f5315b = new int[80];

    /* renamed from: c, reason: collision with root package name */
    private int f5316c = 0;

    static boolean e(char[] cArr, char c9) {
        if (cArr != null) {
            for (char c10 : cArr) {
                if (c10 == c9) {
                    return true;
                }
            }
        }
        return false;
    }

    private void f(int i8) {
        int[] iArr = this.f5315b;
        int i9 = this.f5316c;
        iArr[i9] = i8;
        int i10 = i9 + 1;
        this.f5316c = i10;
        if (i10 >= iArr.length) {
            int[] iArr2 = new int[i10 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f5315b = iArr2;
        }
    }

    private int g() throws F3.m {
        for (int i8 = 1; i8 < this.f5316c; i8 += 2) {
            int i9 = i(i8);
            if (i9 != -1 && e(f5313f, f5311d[i9])) {
                int i10 = 0;
                for (int i11 = i8; i11 < i8 + 7; i11++) {
                    i10 += this.f5315b[i11];
                }
                if (i8 == 1 || this.f5315b[i8 - 1] >= i10 / 2) {
                    return i8;
                }
            }
        }
        throw F3.m.getNotFoundInstance();
    }

    private void h(M3.a aVar) throws F3.m {
        int i8 = 0;
        this.f5316c = 0;
        int nextUnset = aVar.getNextUnset(0);
        int size = aVar.getSize();
        if (nextUnset >= size) {
            throw F3.m.getNotFoundInstance();
        }
        boolean z8 = true;
        while (nextUnset < size) {
            if (aVar.get(nextUnset) ^ z8) {
                i8++;
            } else {
                f(i8);
                z8 = !z8;
                i8 = 1;
            }
            nextUnset++;
        }
        f(i8);
    }

    private int i(int i8) {
        int i9 = i8 + 7;
        if (i9 >= this.f5316c) {
            return -1;
        }
        int[] iArr = this.f5315b;
        int i10 = Integer.MAX_VALUE;
        int i11 = 0;
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        for (int i14 = i8; i14 < i9; i14 += 2) {
            int i15 = iArr[i14];
            if (i15 < i12) {
                i12 = i15;
            }
            if (i15 > i13) {
                i13 = i15;
            }
        }
        int i16 = (i12 + i13) / 2;
        int i17 = 0;
        for (int i18 = i8 + 1; i18 < i9; i18 += 2) {
            int i19 = iArr[i18];
            if (i19 < i10) {
                i10 = i19;
            }
            if (i19 > i17) {
                i17 = i19;
            }
        }
        int i20 = (i10 + i17) / 2;
        int i21 = 128;
        int i22 = 0;
        for (int i23 = 0; i23 < 7; i23++) {
            i21 >>= 1;
            if (iArr[i8 + i23] > ((i23 & 1) == 0 ? i16 : i20)) {
                i22 |= i21;
            }
        }
        while (true) {
            int[] iArr2 = f5312e;
            if (i11 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i11] == i22) {
                return i11;
            }
            i11++;
        }
    }

    private void j(int i8) throws F3.m {
        int[] iArr = new int[4];
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int[] iArr2 = new int[4];
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int length = this.f5314a.length() - 1;
        int i9 = i8;
        int i10 = 0;
        while (true) {
            int i11 = f5312e[this.f5314a.charAt(i10)];
            for (int i12 = 6; i12 >= 0; i12--) {
                int i13 = (i12 & 1) + ((i11 & 1) << 1);
                iArr[i13] = iArr[i13] + this.f5315b[i9 + i12];
                iArr2[i13] = iArr2[i13] + 1;
                i11 >>= 1;
            }
            if (i10 >= length) {
                break;
            }
            i9 += 8;
            i10++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i14 = 0; i14 < 2; i14++) {
            fArr2[i14] = 0.0f;
            int i15 = i14 + 2;
            int i16 = iArr[i15];
            int i17 = iArr2[i15];
            float f8 = ((iArr[i14] / iArr2[i14]) + (i16 / i17)) / 2.0f;
            fArr2[i15] = f8;
            fArr[i14] = f8;
            fArr[i15] = ((i16 * 2.0f) + 1.5f) / i17;
        }
        int i18 = i8;
        int i19 = 0;
        loop3: while (true) {
            int i20 = f5312e[this.f5314a.charAt(i19)];
            for (int i21 = 6; i21 >= 0; i21--) {
                int i22 = (i21 & 1) + ((i20 & 1) << 1);
                float f9 = this.f5315b[i18 + i21];
                if (f9 < fArr2[i22] || f9 > fArr[i22]) {
                    break loop3;
                }
                i20 >>= 1;
            }
            if (i19 >= length) {
                return;
            }
            i18 += 8;
            i19++;
        }
        throw F3.m.getNotFoundInstance();
    }

    @Override // W3.r
    public F3.q decodeRow(int i8, M3.a aVar, Map<F3.e, ?> map) throws F3.m {
        int i9;
        Arrays.fill(this.f5315b, 0);
        h(aVar);
        int iG = g();
        this.f5314a.setLength(0);
        int i10 = iG;
        while (true) {
            int i11 = i(i10);
            if (i11 == -1) {
                throw F3.m.getNotFoundInstance();
            }
            this.f5314a.append((char) i11);
            i9 = i10 + 8;
            if ((this.f5314a.length() > 1 && e(f5313f, f5311d[i11])) || i9 >= this.f5316c) {
                break;
            }
            i10 = i9;
        }
        int i12 = i10 + 7;
        int i13 = this.f5315b[i12];
        int i14 = 0;
        for (int i15 = -8; i15 < -1; i15++) {
            i14 += this.f5315b[i9 + i15];
        }
        if (i9 < this.f5316c && i13 < i14 / 2) {
            throw F3.m.getNotFoundInstance();
        }
        j(iG);
        for (int i16 = 0; i16 < this.f5314a.length(); i16++) {
            StringBuilder sb = this.f5314a;
            sb.setCharAt(i16, f5311d[sb.charAt(i16)]);
        }
        char cCharAt = this.f5314a.charAt(0);
        char[] cArr = f5313f;
        if (!e(cArr, cCharAt)) {
            throw F3.m.getNotFoundInstance();
        }
        StringBuilder sb2 = this.f5314a;
        if (!e(cArr, sb2.charAt(sb2.length() - 1))) {
            throw F3.m.getNotFoundInstance();
        }
        if (this.f5314a.length() <= 3) {
            throw F3.m.getNotFoundInstance();
        }
        if (map == null || !map.containsKey(F3.e.RETURN_CODABAR_START_END)) {
            StringBuilder sb3 = this.f5314a;
            sb3.deleteCharAt(sb3.length() - 1);
            this.f5314a.deleteCharAt(0);
        }
        int i17 = 0;
        for (int i18 = 0; i18 < iG; i18++) {
            i17 += this.f5315b[i18];
        }
        float f8 = i17;
        while (iG < i12) {
            i17 += this.f5315b[iG];
            iG++;
        }
        float f9 = i8;
        return new F3.q(this.f5314a.toString(), null, new F3.s[]{new F3.s(f8, f9), new F3.s(i17, f9)}, F3.a.CODABAR);
    }
}
