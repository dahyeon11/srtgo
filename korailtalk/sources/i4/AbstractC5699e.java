package i4;

import F3.v;
import ai.maum.m2u.cdk.utils.G711;
import androidx.appcompat.app.g;
import g4.j;

/* renamed from: i4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5699e {

    /* renamed from: a, reason: collision with root package name */
    private static final int[][] f31898a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b, reason: collision with root package name */
    private static final int[][] f31899b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c, reason: collision with root package name */
    private static final int[][] f31900c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, g.FEATURE_SUPPORT_ACTION_BAR, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, G711.BIAS, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d, reason: collision with root package name */
    private static final int[][] f31901d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    static void a(M3.a aVar, g4.f fVar, j jVar, int i8, C5696b c5696b) throws v {
        c(c5696b);
        d(jVar, c5696b);
        l(fVar, i8, c5696b);
        s(jVar, c5696b);
        f(aVar, i8, c5696b);
    }

    static int b(int i8, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iN = n(i9);
        int iN2 = i8 << (iN - 1);
        while (n(iN2) >= iN) {
            iN2 ^= i9 << (n(iN2) - iN);
        }
        return iN2;
    }

    static void c(C5696b c5696b) {
        c5696b.clear((byte) -1);
    }

    static void d(j jVar, C5696b c5696b) throws v {
        j(c5696b);
        e(c5696b);
        r(jVar, c5696b);
        k(c5696b);
    }

    private static void e(C5696b c5696b) throws v {
        if (c5696b.get(8, c5696b.getHeight() - 8) == 0) {
            throw new v();
        }
        c5696b.set(8, c5696b.getHeight() - 8, 1);
    }

    static void f(M3.a aVar, int i8, C5696b c5696b) throws v {
        boolean z8;
        int width = c5696b.getWidth() - 1;
        int height = c5696b.getHeight() - 1;
        int i9 = 0;
        int i10 = -1;
        while (width > 0) {
            if (width == 6) {
                width--;
            }
            while (height >= 0 && height < c5696b.getHeight()) {
                for (int i11 = 0; i11 < 2; i11++) {
                    int i12 = width - i11;
                    if (o(c5696b.get(i12, height))) {
                        if (i9 < aVar.getSize()) {
                            z8 = aVar.get(i9);
                            i9++;
                        } else {
                            z8 = false;
                        }
                        if (i8 != -1 && AbstractC5698d.f(i8, i12, height)) {
                            z8 = !z8;
                        }
                        c5696b.set(i12, height, z8);
                    }
                }
                height += i10;
            }
            i10 = -i10;
            height += i10;
            width -= 2;
        }
        if (i9 == aVar.getSize()) {
            return;
        }
        throw new v("Not all bits consumed: " + i9 + '/' + aVar.getSize());
    }

    private static void g(int i8, int i9, C5696b c5696b) throws v {
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = i8 + i10;
            if (!o(c5696b.get(i11, i9))) {
                throw new v();
            }
            c5696b.set(i11, i9, 0);
        }
    }

    private static void h(int i8, int i9, C5696b c5696b) {
        for (int i10 = 0; i10 < 5; i10++) {
            for (int i11 = 0; i11 < 5; i11++) {
                c5696b.set(i8 + i11, i9 + i10, f31899b[i10][i11]);
            }
        }
    }

    private static void i(int i8, int i9, C5696b c5696b) {
        for (int i10 = 0; i10 < 7; i10++) {
            for (int i11 = 0; i11 < 7; i11++) {
                c5696b.set(i8 + i11, i9 + i10, f31898a[i10][i11]);
            }
        }
    }

    private static void j(C5696b c5696b) throws v {
        int length = f31898a[0].length;
        i(0, 0, c5696b);
        i(c5696b.getWidth() - length, 0, c5696b);
        i(0, c5696b.getWidth() - length, c5696b);
        g(0, 7, c5696b);
        g(c5696b.getWidth() - 8, 7, c5696b);
        g(0, c5696b.getWidth() - 8, c5696b);
        m(7, 0, c5696b);
        m(c5696b.getHeight() - 8, 0, c5696b);
        m(7, c5696b.getHeight() - 7, c5696b);
    }

    private static void k(C5696b c5696b) {
        int i8 = 8;
        while (i8 < c5696b.getWidth() - 8) {
            int i9 = i8 + 1;
            int i10 = i9 % 2;
            if (o(c5696b.get(i8, 6))) {
                c5696b.set(i8, 6, i10);
            }
            if (o(c5696b.get(6, i8))) {
                c5696b.set(6, i8, i10);
            }
            i8 = i9;
        }
    }

    static void l(g4.f fVar, int i8, C5696b c5696b) throws v {
        M3.a aVar = new M3.a();
        p(fVar, i8, aVar);
        for (int i9 = 0; i9 < aVar.getSize(); i9++) {
            boolean z8 = aVar.get((aVar.getSize() - 1) - i9);
            int[] iArr = f31901d[i9];
            c5696b.set(iArr[0], iArr[1], z8);
            if (i9 < 8) {
                c5696b.set((c5696b.getWidth() - i9) - 1, 8, z8);
            } else {
                c5696b.set(8, (c5696b.getHeight() - 7) + (i9 - 8), z8);
            }
        }
    }

    private static void m(int i8, int i9, C5696b c5696b) throws v {
        for (int i10 = 0; i10 < 7; i10++) {
            int i11 = i9 + i10;
            if (!o(c5696b.get(i8, i11))) {
                throw new v();
            }
            c5696b.set(i8, i11, 0);
        }
    }

    static int n(int i8) {
        return 32 - Integer.numberOfLeadingZeros(i8);
    }

    private static boolean o(int i8) {
        return i8 == -1;
    }

    static void p(g4.f fVar, int i8, M3.a aVar) throws v {
        if (!C5700f.isValidMaskPattern(i8)) {
            throw new v("Invalid mask pattern");
        }
        int bits = (fVar.getBits() << 3) | i8;
        aVar.appendBits(bits, 5);
        aVar.appendBits(b(bits, 1335), 10);
        M3.a aVar2 = new M3.a();
        aVar2.appendBits(21522, 15);
        aVar.xor(aVar2);
        if (aVar.getSize() == 15) {
            return;
        }
        throw new v("should not happen but we got: " + aVar.getSize());
    }

    static void q(j jVar, M3.a aVar) throws v {
        aVar.appendBits(jVar.getVersionNumber(), 6);
        aVar.appendBits(b(jVar.getVersionNumber(), 7973), 12);
        if (aVar.getSize() == 18) {
            return;
        }
        throw new v("should not happen but we got: " + aVar.getSize());
    }

    private static void r(j jVar, C5696b c5696b) {
        if (jVar.getVersionNumber() < 2) {
            return;
        }
        int[] iArr = f31900c[jVar.getVersionNumber() - 1];
        for (int i8 : iArr) {
            for (int i9 : iArr) {
                if (i9 != -1 && i8 != -1 && o(c5696b.get(i9, i8))) {
                    h(i9 - 2, i8 - 2, c5696b);
                }
            }
        }
    }

    static void s(j jVar, C5696b c5696b) throws v {
        if (jVar.getVersionNumber() < 7) {
            return;
        }
        M3.a aVar = new M3.a();
        q(jVar, aVar);
        int i8 = 17;
        for (int i9 = 0; i9 < 6; i9++) {
            for (int i10 = 0; i10 < 3; i10++) {
                boolean z8 = aVar.get(i8);
                i8--;
                c5696b.set(i9, (c5696b.getHeight() - 11) + i10, z8);
                c5696b.set((c5696b.getHeight() - 11) + i10, i9, z8);
            }
        }
    }
}
