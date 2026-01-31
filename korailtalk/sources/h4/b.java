package h4;

import F3.m;
import F3.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final M3.b f31550a;

    /* renamed from: c, reason: collision with root package name */
    private final int f31552c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31553d;

    /* renamed from: e, reason: collision with root package name */
    private final int f31554e;

    /* renamed from: f, reason: collision with root package name */
    private final int f31555f;

    /* renamed from: g, reason: collision with root package name */
    private final float f31556g;

    /* renamed from: i, reason: collision with root package name */
    private final t f31558i;

    /* renamed from: b, reason: collision with root package name */
    private final List f31551b = new ArrayList(5);

    /* renamed from: h, reason: collision with root package name */
    private final int[] f31557h = new int[3];

    b(M3.b bVar, int i8, int i9, int i10, int i11, float f8, t tVar) {
        this.f31550a = bVar;
        this.f31552c = i8;
        this.f31553d = i9;
        this.f31554e = i10;
        this.f31555f = i11;
        this.f31556g = f8;
        this.f31558i = tVar;
    }

    private static float a(int[] iArr, int i8) {
        return (i8 - iArr[2]) - (iArr[1] / 2.0f);
    }

    private float b(int i8, int i9, int i10, int i11) {
        M3.b bVar = this.f31550a;
        int height = bVar.getHeight();
        int[] iArr = this.f31557h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i12 = i8;
        while (i12 >= 0 && bVar.get(i9, i12)) {
            int i13 = iArr[1];
            if (i13 > i10) {
                break;
            }
            iArr[1] = i13 + 1;
            i12--;
        }
        if (i12 >= 0 && iArr[1] <= i10) {
            while (i12 >= 0 && !bVar.get(i9, i12)) {
                int i14 = iArr[0];
                if (i14 > i10) {
                    break;
                }
                iArr[0] = i14 + 1;
                i12--;
            }
            if (iArr[0] > i10) {
                return Float.NaN;
            }
            int i15 = i8 + 1;
            while (i15 < height && bVar.get(i9, i15)) {
                int i16 = iArr[1];
                if (i16 > i10) {
                    break;
                }
                iArr[1] = i16 + 1;
                i15++;
            }
            if (i15 != height && iArr[1] <= i10) {
                while (i15 < height && !bVar.get(i9, i15)) {
                    int i17 = iArr[2];
                    if (i17 > i10) {
                        break;
                    }
                    iArr[2] = i17 + 1;
                    i15++;
                }
                int i18 = iArr[2];
                if (i18 <= i10 && Math.abs(((iArr[0] + iArr[1]) + i18) - i11) * 5 < i11 * 2 && d(iArr)) {
                    return a(iArr, i15);
                }
            }
        }
        return Float.NaN;
    }

    private boolean d(int[] iArr) {
        float f8 = this.f31556g;
        float f9 = f8 / 2.0f;
        for (int i8 = 0; i8 < 3; i8++) {
            if (Math.abs(f8 - iArr[i8]) >= f9) {
                return false;
            }
        }
        return true;
    }

    private C5610a e(int[] iArr, int i8, int i9) {
        int i10 = iArr[0] + iArr[1] + iArr[2];
        float fA = a(iArr, i9);
        float fB = b(i8, (int) fA, iArr[1] * 2, i10);
        if (Float.isNaN(fB)) {
            return null;
        }
        float f8 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (C5610a c5610a : this.f31551b) {
            if (c5610a.b(f8, fB, fA)) {
                return c5610a.c(fB, fA, f8);
            }
        }
        C5610a c5610a2 = new C5610a(fA, fB, f8);
        this.f31551b.add(c5610a2);
        t tVar = this.f31558i;
        if (tVar == null) {
            return null;
        }
        tVar.foundPossibleResultPoint(c5610a2);
        return null;
    }

    C5610a c() throws m {
        C5610a c5610aE;
        C5610a c5610aE2;
        int i8 = this.f31552c;
        int i9 = this.f31555f;
        int i10 = this.f31554e + i8;
        int i11 = this.f31553d + (i9 / 2);
        int[] iArr = new int[3];
        for (int i12 = 0; i12 < i9; i12++) {
            int i13 = ((i12 & 1) == 0 ? (i12 + 1) / 2 : -((i12 + 1) / 2)) + i11;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i14 = i8;
            while (i14 < i10 && !this.f31550a.get(i14, i13)) {
                i14++;
            }
            int i15 = 0;
            while (i14 < i10) {
                if (!this.f31550a.get(i14, i13)) {
                    if (i15 == 1) {
                        i15++;
                    }
                    iArr[i15] = iArr[i15] + 1;
                } else if (i15 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i15 != 2) {
                    i15++;
                    iArr[i15] = iArr[i15] + 1;
                } else {
                    if (d(iArr) && (c5610aE2 = e(iArr, i13, i14)) != null) {
                        return c5610aE2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i15 = 1;
                }
                i14++;
            }
            if (d(iArr) && (c5610aE = e(iArr, i13, i10)) != null) {
                return c5610aE;
            }
        }
        if (this.f31551b.isEmpty()) {
            throw m.getNotFoundInstance();
        }
        return (C5610a) this.f31551b.get(0);
    }
}
